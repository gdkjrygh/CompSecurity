'use strict';
var myApp = angular.module('mfbApp');

myApp.directive('switchCharacter', function (VIEWS) {
	return {
		restrict: 'E',
		templateUrl: VIEWS + 'switchCharacter.html'
	};
});