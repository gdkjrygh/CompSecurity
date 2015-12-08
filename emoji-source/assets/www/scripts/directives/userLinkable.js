'use strict';

angular.module('userLinkableDirective', ['navService', 'usersService'])
	.directive('userLinkable', function(VIEWS) {
		return {
			templateUrl: VIEWS + 'userLinkable.html',
			restrict: 'E',
			transclude: true,
			controller: 'UserLinkableCtrl',
			scope: {
				user: '=',
				context: '@'
			}
		};
	})
	.controller('UserLinkableCtrl', function($scope, $parse, $attrs, NavHelper, Users) {
		// Explicitly pass values from the parent scope to the transcluded one
		var context;
		context = $parse($attrs.context)($scope.$parent);
		angular.extend($scope, context);

		$scope.view_user = NavHelper.view_user;
		$scope.isLinkable = Users.isFriend($scope.user) && Users.hasBitstripsId($scope.user);
	});
