'use strict';

angular.module('comicTagsDirective', ['usersService', 'navService'])
	.controller('ComicTagsCtrl', function($scope, NavHelper, Users) {
		$scope.view_user = NavHelper.view_user;

		var filterCostars = function(costars) {
			if (costars.length === 2 && (costars[0].fb_id == costars[1].fb_id)) {
				return [costars[0]];
			}
			return costars;
		};

		$scope.costars = filterCostars($scope.comic.costars);
	})
	.directive('comicTags', function (VIEWS) {
		return {
			restrict: 'E',
			scope: {
				comic: '='
			},
			templateUrl: VIEWS + 'comicTags.html',
			controller: 'ComicTagsCtrl'
		};
	});
