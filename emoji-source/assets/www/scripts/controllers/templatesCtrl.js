'use strict';

angular.module('mfbApp')
	.controller('TemplatesCtrl', function ($scope, Users, $routeParams, Templates, State, Launch, TemplatesHelper,
										   $window, $rootScope, NavHelper, memento, makeComicWizard, $timeout) {

		$scope.save = function () {
			return {
				$scroll: 'auto',
				limit: $scope.limit,
				search: $scope.search,
				saved_scroll_position: $scope.saved_scroll_position,
				selected_tag: $scope.selected_tag
			};
		};

		// Limit the number of calls to the load_more method
		var MIN_MS_BETWEEN_SCROLL_EVENTS = 500;

		$scope.limit = 8;
		$scope.search = '';
		$scope.swapped_users = false;
		$scope.restore = function (state) {
			$scope.limit = state.limit || 8;
			$scope.search = state.search || '';
			$scope.saved_scroll_position = state.saved_scroll_position || 0;
			$scope.selected_tag = state.selected_tag;
		};

		memento($scope, 'templates_' + $routeParams.template_id);

		$scope.comics = Templates.get_all_templates();

		if ($routeParams.template_id) {
			angular.forEach($scope.comics, function (comic) {
				comic.tag_click = comic.template_id == $routeParams.template_id;
			});
		}

		if ($routeParams.search) {
			$scope.search = $routeParams.search;
		}
		if ($routeParams.selected_tag === 'selected_tag') {
			$scope.selected_tag = $scope.search;
			State.hide_footer(true);
		}

        $scope.isLatest = $scope.selected_tag == '#Latest';
        $scope.isCaptionContest = $scope.selected_tag == '##Caption Contest';

        $scope.viewIt = function (url) {
            Launch.openSystemURL(url);
        };

		$scope.user_a = makeComicWizard.userA();
		$scope.user_b = makeComicWizard.userB();

		$scope.tag_comics = Templates.get_tag_comics(!$scope.user_b);

		var setUsers = function (userA, userB) {
			var set_users_in_comic = function (comic) {
                // Are we setting users on tag_comics?
                if (comic.display_tag) {
                    comic = comic.comic;
                }
				comic.user_a = userA;
				comic.user_b = userB;
				TemplatesHelper.update_template_info(comic);
			};

			angular.forEach($scope.comics, set_users_in_comic);
			angular.forEach($scope.tag_comics.comics, set_users_in_comic);
		};

		setUsers($scope.user_a, $scope.user_b);

		$scope.clear_search = function () {
			$window.scrollTo(0, 0);
			$scope.selected_tag = $scope.search = "";
		};

		$scope.back = NavHelper.back;

		$scope.search_comics = [];

		$scope.search_change = function () {
			if ($scope.search === '') {
				$scope.clear_search();
			}
		};

		$scope.canLoad = true;

		$scope.load_more = function () {
			$scope.canLoad = false;
			$scope.limit += 4;
			$timeout(function() {
				$scope.canLoad = true;
			}, MIN_MS_BETWEEN_SCROLL_EVENTS);
		};

		$scope.swap_users = function () {
			if (!$scope.user_b) {
				return;
			}

			makeComicWizard.swapUsers();

			$scope.user_a = makeComicWizard.userA();
			$scope.user_b = makeComicWizard.userB();
			setUsers($scope.user_a, $scope.user_b);
		};

		$scope.select_char = function (friend_type) {
			NavHelper.select_friend(friend_type);
		};

		$scope.customize = function (comic) {
			makeComicWizard.templateId(comic.template_id);
			NavHelper.editTemplate();
		};

		$scope.my_search = function (comic) {
			var t = angular.lowercase($scope.search);
			var hash = false;
			if ($scope.search[0] == "#") {
				hash = true;
				t = t.substring(1);
			}
			return Templates.search(comic, t, hash);
		};

		$scope.tags_click = function (comic_tag) {
			NavHelper.browse_templates('#' + comic_tag.display_tag, comic_tag.comic.template_id, 'selected_tag');
		};

		$scope.ordering = Templates.ordering;

		$scope.comic_type = function (comic) {
			return !(!$scope.user_b && comic.type !== 0);
		};

		$scope.can_remove_costar = function () {
			return !!$scope.user_b;
		};

		$scope.remove_costar = function () {
			delete $scope.user_b;
			$scope.tag_comics = Templates.get_tag_comics(true);
			setUsers($scope.user_a);
			makeComicWizard.userB(null);
		};

		$scope.$on('$viewContentLoaded', function () {
			$scope.$emit('loaded');
		});
	});
