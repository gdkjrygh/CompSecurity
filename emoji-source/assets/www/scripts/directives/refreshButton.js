'use strict';

angular.module('refreshButtonDirective', ['utils'])
	.controller('RefreshButtonCtrl', function($scope, $timeout, delayPromise) {
		var animationTime = 1500;

		$scope.run = function () {
			if ($scope.fetchingNewData) {
				return;
			}
			$scope.fetchingNewData = true;
			delayPromise($scope.promiseFunction()(), animationTime, true)['finally'](function() {
				$scope.fetchingNewData = false;
			});
		};
	})
	.directive('refreshButton', function (VIEWS) {
		return {
			restrict: 'E',
			scope: {
				promiseFunction: '&'
			},
			templateUrl: VIEWS + 'refreshButton.html',
			controller: 'RefreshButtonCtrl'
		};
	});
