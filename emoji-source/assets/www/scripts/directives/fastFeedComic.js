'use strict';

angular.module('fastFeedComicDirective', ['usersService', 'navService', 'comicsService',
				'queuedLoaderService', 'feedsService', 'handlebars'])
.controller('FastFeedComicCtrl', function($scope, NavHelper, Launch, Comics, Feeds, Users) {
	$scope.maxLikers = 5;

	$scope.view_comic = NavHelper.view_comic;
	$scope.view_user = NavHelper.view_user;
	$scope.native_share = Launch.camera_roll;

	$scope.showAllComments = function () {
		NavHelper.view_comic_comments_expanded($scope.comic.comic_id);
	};

	$scope.toggleLike = function() {
		Comics.like_toggle($scope.comic);
		$scope.$render();
	};

	$scope.comment = function () {
		NavHelper.comment_on_comic($scope.comic.comic_id);
	};

	$scope.viewAllLikers = function () {
		$scope.maxLikers = $scope.likers.length + 1;
		$scope.$render();
	};

	$scope.toggleDeleteModal = function () {
		$scope.showDeleteModal = !$scope.showDeleteModal;
		$scope.$render();
	};

	$scope.deleteComic = function (comic) {
		$scope.showDeleteModal = false;
		Feeds.delete_comic(comic);
		$scope.$render();
	};

	$scope.$createContext = function(scope) {
		var comments = $scope.comic.comments || [];
		var likers = $scope.likers = $scope.comic.comic_likes || [];

		return {
			comic: $scope.comic,
			likers: Users.meFirst(likers),
			numberOfLikers: likers.length,
			noLikers: !likers.length,
			manyLikers: likers.length >= scope.maxLikers,
			comments: comments,
			lastComments: comments.slice(-3),
			numberOfComments: comments.length,
			noComments: !comments.length,
			manyComments: comments.length > 3,
			showDeleteModal: scope.showDeleteModal
		};
	};
})
.managedView('fastFeedComic', function ($document, $filter, $parse,
				$window, QueuedLoader) {

	return {
		restrict: 'E',
		viewCompiler: 'HandlebarsService',
		template: 'fastFeedComic.hbs',
		scope: {
			comic: '=comic'
		},
		controller: 'FastFeedComicCtrl',
		link: function(scope, elem) {
			var comicId = scope.comic.comic_id;
			var comicEl = angular.element(document.getElementById('comic_'+comicId));
			var authorEl = angular.element(document.getElementById('author_'+comicId));

			QueuedLoader.push(comicEl, {
				queued: comicEl.attr('queued')
			});

			QueuedLoader.push(authorEl, {
				queued: authorEl.attr('queued')
			});
		}

	};
});
