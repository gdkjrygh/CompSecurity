'use strict';

angular.module('focusOnDirective', [])
	.directive('focusOn', function () {
		return {
			scope: {
				focusOn: '='
			},
			restrict: 'A',
			link: function (scope, element) {
				scope.$watch('focusOn', function(value){
					if (value > 0) {
						element[0].focus();
					}
				});
			}
		};
	});