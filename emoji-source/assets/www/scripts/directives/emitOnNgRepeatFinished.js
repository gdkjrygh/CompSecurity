'use strict';

angular.module('emitOnNgRepeatFinishedDirective', [])
	.directive('emitOnNgRepeatFinished',  function() {
		return {
			link: function(scope, elem, attr) {
				if (scope.$last) {
					scope.$emit(attr.emitOnNgRepeatFinished);
				}
			}
		};
	});
