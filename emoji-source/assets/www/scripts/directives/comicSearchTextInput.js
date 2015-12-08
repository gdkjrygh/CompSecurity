'use strict';
var myApp = angular.module('mfbApp');

myApp.directive('comicSearchTextInput', function (VIEWS) {
	return {
		restrict: 'E',
		templateUrl: VIEWS + 'comicSearchTextInput.html'
	};
});
