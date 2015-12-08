'use strict';
var myApp = angular.module('mfbApp');

myApp.directive('fancyCheckbox', function (VIEWS) {
	return {
		restrict: 'E',
		scope: {
			fieldModel: '=',
			disabled: '='
		},
		controller: function ($scope) {
			$scope.$watch('fieldModel', function(){
				$scope.model = "1";
				if ($scope.fieldModel === 0) {
					$scope.model = "0";
				}
			});

			$scope.modelChange = function () {
				$scope.fieldModel = parseInt($scope.model, 10);
			};
		},
		templateUrl: VIEWS + 'fancyCheckbox.html',
		transclude: true
	};
});
