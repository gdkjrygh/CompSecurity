'use strict';

angular.module('mfbApp')
	.controller('ErrorCtrl', function ($scope, $routeParams) {
		if ($routeParams.type == "no_connection") {
			$scope.no_connection = true;
		} else {
			$scope.message = $routeParams.type;
		}

		// Stub so we don't get errors when testing and FB tries to log us in
		$scope.set_token = function () { };
	});
