'use strict';

angular.module('comicLikesDirective', ['usersService', 'navService', 'comicsService'])
	.controller('ComicLikesCtrl', function ($scope, NavHelper, Users, Comics) {

		$scope.view_user = NavHelper.view_user;

		$scope.max = 5;

		$scope.viewAllLikers = function () {
			$scope.max = $scope.likers.length + 1;
		};

		$scope.$watchCollection('comic.comic_likes', function (likes) {
			$scope.likers = Users.meFirst(likes || []);
		});

		$scope.toggleLike = Comics.like_toggle;
	})
	.directive('comicLikes', function (VIEWS) {
		return {
			restrict: 'E',
			templateUrl: VIEWS + 'comicLikes.html',
			scope: {
				comic: '='
			},
			controller: 'ComicLikesCtrl'
		};
	});
