'use strict';
var myApp = angular.module('mfbApp');

myApp.directive('latestComics', function (VIEWS) {
	return {
		scope: {
		},
		restrict: 'E',
		templateUrl: VIEWS + 'latestComics.html',
		controller: function ($scope) {
		}
	};
});