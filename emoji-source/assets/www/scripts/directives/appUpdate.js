'use strict';

angular.module('appUpdateDirective', ['launchService', 'templatesService'])
	.controller('AppUpdateCtrl', function ($scope, Launch, Templates) {
		$scope.update = Templates.appUpdate();
		$scope.appUpdateHide = function () {
			$scope.update.hidden = true;
		};

		$scope.doAppUpdate = function () {
			Launch.openSystemURL($scope.update.url);
		};
	})
	.directive('appUpdate', function (VIEWS) {
		return {
			restrict: 'E',
			templateUrl: VIEWS + 'appUpdate.html',
			scope: {
			},
			controller: 'AppUpdateCtrl'
		};
	});