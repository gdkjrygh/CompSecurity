'use strict';

angular.module('utils', ['launchService'])
    .factory('addSchemaToSchemaless', function () {
        var starts_with = function (string, substring) {
            return string.indexOf(substring) === 0;
        };
        return function (url) {
            if (starts_with(url, '//')) {
                return 'http:' + url;
            }
            return url;
        };
    })
	.factory('safeInterval', function ($window) {
		return function (fn, delay) {
			$window.setTimeout(function () {
				(fn || angular.noop)();
				$window.setTimeout(fn, delay);
			}, delay);
		};
	})
	.factory('timeRemaining', function () {
		return function (elapsedTime, totalTime, useModulo) {
			if (useModulo) {
				return totalTime - (elapsedTime % totalTime);
			}
			else {
				return Math.max(totalTime - elapsedTime, 0);
			}
		};
	})
	.factory('getTime', function () {
		return function () {
			return new Date().getTime();
		};
	})
	.factory('delayPromise', function ($q, $timeout, timeRemaining, getTime) {
		return function (promise, delayMilliseconds, useModulus) {
			var startTime = getTime();
			var deferred = $q.defer();

			var timeout = function (callback) {
				var elapsed = getTime() - startTime;
				$timeout(callback, timeRemaining(elapsed, delayMilliseconds, true));
			};

			promise.then(
				function success(data) {
					timeout(function () {
						deferred.resolve(data);
					});
				},
				function failure(data) {
					timeout(function () {
						deferred.reject(data);
					});
				}
			);
			return deferred.promise;
		};
	})
	.factory('headerHeight', function ($window) {
		return function () {
			var scale = $window.devicePixelRatio;
			var header = document.getElementById("header");
			var rect = header.getBoundingClientRect();
			return rect.height * scale + 10 * scale;
		};
	})
	.factory('keyLength' , function() {
		return function(obj) {
			if (!obj) { return 0; }

			return Object.keys(obj).length;
		};
	});
