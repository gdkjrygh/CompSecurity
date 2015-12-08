'use strict';

angular.module('storageService', ['stateService', 'logService'])
	.factory('Storage', function ($window, $q) {
		var setItem = function (key, value) {
			$window.localStorage.setItem(key, JSON.stringify(value));
		};

		var getItem = function (key) {
			try {
				return JSON.parse($window.localStorage.getItem(key));
			} catch (e) {
				return null;
			}
		};

		var removeItem = function (key) {
			try {
				return $window.localStorage.removeItem(key);
			} catch(e) {
				return null;
			}
		};

		var clear = function () {
			$window.localStorage.clear();
		};

		return {
			setItem: setItem,
			getItem: getItem,
			removeItem: removeItem,
			clear: clear
		};
	});
