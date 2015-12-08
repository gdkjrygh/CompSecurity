'use strict';

angular.module('retryInterceptor', [])
	.config(function ($httpProvider) {
		$httpProvider.interceptors.unshift('handleOffline');
		$httpProvider.interceptors.unshift('retryFailedRequest');
		$httpProvider.interceptors.push('checkForErrorInMessage');
	})
	.factory('checkForErrorInMessage', function ($q) {
		return {
			response: function (response) {
				if (response.data) {
					if (response.data.valid === 0) {
						response.data = 'invalid';
						response.status = 500;
						return $q.reject(response);
					} else if (response.data.overloaded === 1) {
						response.data = 'overloaded';
						response.status = 500;
						return $q.reject(response);
					}
				}

				return response;
			}
		};
	})
	.factory('handleOffline', function ($q, $rootScope) {
		var online = true;
		var offline_codes = [
			0, // on normal browsers
			404 // on android
		];
		return {
			response: function (response) {
				if (!online) {
					$rootScope.$broadcast('online');
					online = true;
				}
				return response;
			},
			responseError: function (response) {
				if (online && offline_codes.indexOf(response.status) > -1) {
					$rootScope.$broadcast('offline');
					online = false;
				}

				return $q.reject(response);
			}
		};
	})
	.factory('retryFailedRequest', function ($injector, $q, $timeout) {
		var max_retries = 3;
		var retry_schedule_ms = [500, 750, 1000];

		return {
			responseError: function (response) {
				// no retry requested
				if (!response.config.retry) {
					return $q.reject(response);
				}

				if (!angular.isNumber(response.config.retry_count)) {
					response.config.retry_count = 0;
				}

				// retry count exceeded
				if (response.config.retry_count >= max_retries) {
					return $q.reject(response);
				}

				response.config.retry_count++;

				var deferred = $q.defer();
				var delay = retry_schedule_ms[response.config.retry_count - 1];
				$timeout(deferred.resolve, delay, false);

				return deferred.promise.then(function () {
					var $http = $injector.get('$http');
					return $http(response.config);
				});
			}
		};
	});