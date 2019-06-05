/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.ngrinder.agent.controller;

import org.junit.Test;
import org.ngrinder.perftest.service.AbstractAgentReadyTest;
import org.springframework.beans.factory.annotation.Autowired;


public class MonitorManagerControllerTest extends AbstractAgentReadyTest {

	@Autowired
	MonitorManagerController monitorManagerController;

	@Autowired
	MonitorManagerApiController monitorManagerApiController;

	@Test
	public void testGetMonitorData() throws Exception {
		monitorManagerApiController.getRealTimeMonitorData("127.0.0.1");
		monitorManagerController.closeMonitorConnection("127.0.0.1");
	}

}
