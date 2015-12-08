'use strict';

angular.module('comicCommentsDirective', ['usersService', 'navService', 'ngRoute',
	'comicCommentsDirective', 'emitOnNgRepeatFinishedDirective'])
	.controller('ComicCommentsCtrl', function ($scope, NavHelper, Users, $routeParams) {
		$scope.view_user = NavHelper.view_user;

		$scope.expanded = ($scope.comic.comments.length <= 4) || $routeParams.comments_expanded;

		$scope.show_all = function () {
			if ($scope.expandInPlace) {
				$scope.expanded = true;
			} else {
				NavHelper.view_comic_comments_expanded($scope.comic.comic_id);
			}
		};

		$scope.comment = function () {
			NavHelper.comment_on_comic($scope.comic.comic_id);
		};

		$scope.noComments = function () {
			return !($scope.comic.comments && $scope.comic.comments.length > 0);
		};
	})
	.filter('first', function () {
		return function (list) {
			if (list && list.length >= 1) {
				return [list[0]];
			}
		};
	})
	.filter('last', function () {
		return function (list, n) {
			var last_n = n || 1;
			if (list && list.length >= 1) {
				return list.slice(list.length - last_n);
			}
		};
	})
	.directive('comicComments', function (VIEWS) {
		return {
			restrict: 'E',
			templateUrl: VIEWS + 'comicComments.html',
			scope: {
				comic: '=',
				expandInPlace: '@',
				onSummaryView: '='
			},
			controller: 'ComicCommentsCtrl'
		};
	});
