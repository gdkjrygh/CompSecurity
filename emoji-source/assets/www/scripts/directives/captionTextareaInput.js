'use strict';
var myApp = angular.module('mfbApp');

myApp.directive('captionTextareaInput', function (VIEWS) {
	return {
		restrict: 'E',
		templateUrl: VIEWS + 'captionTextareaInput.html'
	};
});
