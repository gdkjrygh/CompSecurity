'use strict';

angular.module('offlineAlert', [])
	.controller('OfflineAlertCtrl', function ($scope, $rootScope, $interval) {
		var set_offline = function (offline) {
			return function () {
				$scope.offline = offline;
			};
		};

		$rootScope.$on('offline', set_offline(true));
		$rootScope.$on('online', set_offline(false));

		set_offline(false);

		$rootScope.$watch(
			function(){
				return navigator.onLine;
			},
			function(online){
				$scope.nav_online = online;
			});
	})
	.directive('offlineAlert', function (VIEWS) {
		return {
			templateUrl: VIEWS + 'offlineAlert.html',
			controller: 'OfflineAlertCtrl',
			scope: false,
			restrict: 'AE'
		};
	});
