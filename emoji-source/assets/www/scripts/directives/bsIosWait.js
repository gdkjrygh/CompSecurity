'use strict';
var myApp = angular.module('mfbApp');

myApp.directive('bsIosWait', function($window) {
	return {
		restrict: 'A',
		link: function( scope, elem, attrs) {
			try {
				var $element = angular.element(elem[0]);
				$window.setTimeout(function () {
					$element.removeClass("ios-hide");
				}, 0);
			} catch (e) {
				alert("Error in ios-wait" + e);
			}
		}
	};
});