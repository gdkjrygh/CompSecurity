'use strict';

angular.module('mfbApp').controller('IntroCtrl',
	function($scope, $window, NavHelper) {
		$scope.hideIntro = NavHelper.home_feed;

		$scope.highResDevice = $window.devicePixelRatio > 1.3;
	});
