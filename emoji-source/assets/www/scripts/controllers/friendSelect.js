'use strict';

angular.module('mfbApp')
	.controller('FriendSelectCtrl', function ($scope, Users, $routeParams, Launch, NavHelper, makeComicWizard, memento) {
		var pick_type = $routeParams.pick_type;

		memento($scope, 'FriendSelectCtrl');
		$scope.$on('$viewContentLoaded', function () {
			$scope.$emit('loaded');
		});

		$scope.friends = Users.get_users();
		$scope.friends_avatars = [];
		$scope.friends_none = [];

		angular.forEach($scope.friends, function (user) {
			if (user.id === -1) {
				$scope.friends_none.push(user);
			} else {
				$scope.friends_avatars.push(user);
			}
		});

		$scope.search = '';
		$scope.search_count = 3 * 5;

		$scope.avatars_count = 3 * 5;
		$scope.none_count = 15;
		if ($scope.friends_avatars.length < $scope.avatars_count) {
			$scope.none_count = 15;
		}

		$scope.back = NavHelper.back;

		$scope.select_friend_without_avatar = function () {
			NavHelper.select_friend_without_avatar(pick_type);
		};

        /* TODO BIT-692 Friend without avatar is unsupported now
		var clickFriendWithoutAvatar = function (fb_id) {
			editAvatar(fb_id).then(function (ok_cancel) {
				if (ok_cancel) {
					var user = Users.get_user_fb(fb_id);
					if (pick_type === 'a') {
						makeComicWizard.userA(user);
					} else {
						makeComicWizard.userB(user);
					}

					NavHelper.back();
				}
			});
		};*/

		var clickFriendWithAvatar = function (fb_id) {
			var user = Users.get_user_fb(fb_id);
			if (pick_type === 'a') {
				makeComicWizard.userA(user);
			} else {
				makeComicWizard.userB(user);
			}

			NavHelper.back();
		};

		$scope.friend_click = function (fb_id) {
			clickFriendWithAvatar(fb_id); // BIT-692

            /*  BIT-692
			if (does_not_have_avatar(fb_id)) {
				clickFriendWithoutAvatar(fb_id);
			} else {
				clickFriendWithAvatar(fb_id);
			}*/
		};

		$scope.add = function () {
			if ($scope.search) {
				$scope.search_count += 6;
			} else if ($scope.avatars_count < $scope.friends_avatars.length) {
				$scope.avatars_count += 6;
			} else if ($scope.none_count < $scope.friends_none.length) {
				$scope.none_count += 6;
			}
		};

		$scope.ordering = function (friend) {
			var score = 10;
			var search = $scope.search.toLowerCase();
			angular.forEach(friend.name.toLowerCase().split(" "), function (value, key) {
				if (value.indexOf(search) === 0) {
					if (key === 0) {
						score -= 3;
					} else {
						score -= 1;
					}
				}
			});
			return score;
		};
	});
