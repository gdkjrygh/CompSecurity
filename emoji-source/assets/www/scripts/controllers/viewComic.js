'use strict';

angular.module('mfbApp')
	.controller('ViewComicCtrl', function ($scope, $routeParams, Comics, Feeds,
		Users, NavHelper, $window, $location, $anchorScroll, directComics) {
		var params = $location.search();

		Comics.get_comic($routeParams.id).then(function (comic) {
			$scope.comic = comic;
			if (directComics.isDirectComic(comic)) {
				$scope.back = NavHelper.home_direct;
				Comics.markComicAsRead(comic.comic_id);
			}
		}, function (comic) {
			$scope.comicDeleted = true;
		});

		// View comic is taking the scroll from the previous route
		// because the NavHelper wrongly assumes that routes in
		// the same section should share the scroll.
		$window.scrollTo(0,0);

		$scope.isFromNotification = $routeParams.notification;

		if (params.comments_expanded) {
			$scope.$on('comic.comments.expandedLoaded', function() {
				$anchorScroll();
			});
		}

		$scope.back = NavHelper.back;

		// causes issues, not recommended
		// $scope.haveGlobalClickHandlerToForceIosToHideKeyboard = angular.noop;

		$scope.fetchingNewData = false;

		$scope.refreshClick = function() {
			return Comics.refresh_comic($routeParams.id);
		};

		$scope.goHome = function() {
			NavHelper.home_feed();
		};


	});
