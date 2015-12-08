'use strict';

angular.module('performanceLogService', [])
	.factory('PerformanceLog', function ($location, $rootScope) {
		var startTime;
		var currentEventPath;
		var pastEvents = [];
		var testPlan = [
			'comic',
			'avatar',
			'settings',
			'home'
		];
		var currentTest = 0;
		var runCount = 10;
		var firstRun = true;
		var testPlanStarted = false;
		var delayBeforeStart = 15000;
		var delayBetweenTests = 300;
		var header;

		function setTopBar(text) {
			header.innerText = text;
		}

		function startEvent() {
			startTime = new Date().getTime();
			currentEventPath = $location.path();
		}

		function endEvent() {
			if ($location.path().split('/')[1] === currentEventPath.split('/')[1]) {
				pastEvents.push({
					path: $location.path().split('/')[1],
					time: new Date().getTime() - startTime
				});
				currentEventPath = null;
				next();
			}
		}

		function next() {
			if (runCount > 0) {
				var runTest = function(currentTest) {
					setTimeout(function() {
						angular.element(document.getElementById(testPlan[currentTest])).find('a').triggerHandler('click');
					}, delayBetweenTests);
				};
				runTest(currentTest);
				currentTest = (currentTest + 1) % testPlan.length;
				if (currentTest === 0) {
					runCount--;
				}
			}
			else {
				setTopBar('DONE');
				printResults();
			}
		}

		function printResults() {
			//var firstRunResults = [];
			var averageResults = [];
			var uniquePaths =
				pastEvents.map(function(item) {
					return item.path;
				})
				.filter(function(value, index, self) {
					return self.indexOf(value) === index;
				});

			angular.forEach(uniquePaths, function(path) {
				var sum = 0;
				var count = -1;
				var i;
				var result;

				for (i = 0; i < pastEvents.length; i++) {
					if (pastEvents[i].path === path) {
						if (count < 0) {
							//console.log('First: ', path, pastEvents[i].time)
							/*
							result = {};
							result[path] = pastEvents[i].time;
							firstRunResults.push(result);*/
							count++;
						}
						else {
							sum += pastEvents[i].time;
							count++;
						}
					}
				}

				//console.log('Average: ', path, sum / count);
				result = {};
				result[path] = sum / count;
				averageResults.push(result);
			});
			console.log(JSON.stringify(averageResults));
		}

		$rootScope.$on('$locationChangeStart', function() {
			//ignore location change events while an event is being measured
			if (currentEventPath) {
				return;
			}
			if (!testPlanStarted) {
				return;
			}
			setTimeout(function() {
				endEvent();
			});
			startEvent();
		});

		$rootScope.$on('$viewContentLoaded', function() {
			if (firstRun) {
				firstRun = false;
				setTopBar('PERFORMANCE TEST MODE');
				setTimeout(function() {
					setTopBar('TEST STARTED');
					testPlanStarted = true;
					next();
				}, delayBeforeStart);
			}
		});

		header = document.createElement('h2');
		document.body.insertBefore(header, document.body.firstChild);

	});
