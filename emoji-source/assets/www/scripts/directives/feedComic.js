'use strict';

angular.module('feedComic', ['comicsService', 'feedsService', 'navService', 'launchService', 'ngRoute', 'utils'])
	.controller('FeedComicCtrl', function ($scope, Users, Feeds, Comics, NavHelper, Launch, $routeParams, $timeout, $anchorScroll, $location, keyLength) {

		$scope.focusCommentBox = $routeParams.new_comment ? 1 : 0;

		var focusCommentBox = function () {
			$scope.focusCommentBox++;
		};

		var openCommentBox = function () {
			focusCommentBox();
		};

		$scope.newComment = {
			text: ''
		};

		$scope.postComment = function () {
			if ($scope.newComment.text) {
				var text = $scope.newComment.text;
				$scope.newComment.text = '';
				Comics.add_comment($scope.comic, $scope.user, text);
				return;
			}
			focusCommentBox();
		};

		$scope.user = Users.me();

		$scope.like_toggle = Comics.like_toggle;

		$scope.view_comic = function () {
			if ($scope.onSummaryView) {
				NavHelper.view_comic($scope.comic.comic_id);
			}
		};

		$scope.view_user = NavHelper.view_user;
		$scope.comment_on_comic = function () {
			if ($scope.onSummaryView) {
				NavHelper.comment_on_comic($scope.comic.comic_id);
			} else {
				openCommentBox();
			}
		};

		$scope.placeholder = function () {
			if ($scope.comic.comments && $scope.comic.comments.length > 0) {
				return "Add a comment...";
			} else {
				return "Be the first to comment";
			}
		};

		$scope.confirmDelete = function (comic, feedId) {
			$scope.showDeleteModal = true;
		};

		$scope.deleteComic = function (comic) {
			$scope.showDeleteModal = false;
			Feeds.delete_comic(comic).then(function () {
				if (!$scope.onSummaryView) {
					NavHelper.back();
				}
			});
		};

		$scope.native_share = Launch.camera_roll;
		$scope.isDirect = !!keyLength($scope.comic.recipients);
	})
	.directive('feedComic', function (VIEWS) {
		return {
			restrict: 'E',
			scope: {
				comic: '=',
				onSummaryView: '=',
				feedId: '='
			},
			templateUrl: VIEWS + 'feedComic.html',
			controller: 'FeedComicCtrl'
		};
	});
