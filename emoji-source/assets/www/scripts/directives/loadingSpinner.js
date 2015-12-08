'use strict';

angular.module('loadingSpinner', [])
	.directive('loadingSpinner', function () {
		return {
			restrict: 'E',
			scope: {
				visible: '=',
				title: '@'
			},
			templateUrl: 'views/loading-spinner.html'
		};
	});
