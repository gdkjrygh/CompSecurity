'use strict';

angular.module('ShareCtrl', ['navService', 'usersService', 'templatesService', 'templatesHelperService',
							'makeComicWizard', 'stateService', 'logService', 'launchService', 'remoteService',
							'userAuth', 'feedsService', 'sharingService', 'directComicsService', 'fbService', 'drawingService'])

	.controller('ShareCtrl', function ($scope, NavHelper, Users, Templates, TemplatesHelper,
									   makeComicWizard, State, Log, Launch, Remote, UserAuth, Feeds,
									   sharingService, $filter, directComics, FBLogin, Draw, $cordovaDialogs) {
        var SHARE_FAILED_MESSAGE = "Share failed. Please try again.";
		var userB = makeComicWizard.userB();
		var userA = makeComicWizard.userA();
		var comic = Templates.get_template(makeComicWizard.templateId());
		var isDuoComic = comic && comic.type === 1;
		var sharingDirect = false;

		$scope.back = NavHelper.back;

		// Direct
		var friends = Users.getFriendsWithBitstrips();
		var friendsWithoutBitstrips = Users.getFriendsWithAvatarsWithoutBitstrips();
		$scope.selectedFriends = {};
		$scope.recipients = [];
		$scope.friends = $filter('orderBy')(friends, 'name');
		$scope.friendsWithoutBitstrips = $filter('orderBy')(friendsWithoutBitstrips, 'name');

		angular.forEach($scope.friends, function(friend) {
			$scope.selectedFriends[friend.bs_id] = 0;
		});

		$scope.isCostar = function(friend) {
			return Users.areSamePerson(userA, friend) || (isDuoComic && Users.areSamePerson(userB, friend));
		};

		$scope.$watch('selectedFriends', function (value) {
			$scope.recipients = $scope.friends.filter(function (friend) {
				return $scope.selectedFriends[friend.bs_id] === 1;
			});
			$scope.recipients = sharingService.sortRecipients($scope.recipients);
			$scope.maxRecipientsReached = ($scope.recipients.length > 9);
		}, true);

		// add if isCostar value to friends obj
		angular.forEach($scope.friends, function (key) {
			key.isCostar = $scope.isCostar(key);
		});

		$scope.$watch('search', function(search) {
			var query = {name: search};

			resetFriendScroll();
			$scope.filteredFriends = $filter('filter')($scope.friends, query);
			$scope.filteredFriendsWithoutBitstrips = $filter('filter')($scope.friendsWithoutBitstrips, query);
		});

		$scope.removeRecipient = function (friend) {
			if ($scope.isCostar(friend)) {
				return;
			}
			$scope.selectedFriends[friend.bs_id] = 0;
		};

		var addRecipients = function () {
			if (isDuoComic && userB && !Users.isMe(userB)) {
				$scope.selectedFriends[userB.bs_id] = 1;
			}

			if (!Users.isMe(userA)) {
				$scope.selectedFriends[userA.bs_id] = 1;
			}
		};

		addRecipients();

		// EditComicCtrl
		var is_saving = false;

		var me = Users.me();
		$scope.last_share = me.last_share;

		$scope.permission_update = function (token) {
			is_saving = false;
			State.set_saving(false);
			if (angular.isDefined(token)) {
				UserAuth.set_new_token(token);
				me.permissions.publish_stream = 1;
				$scope.share_comic('fb');
			}
		};

        var showErrorDialog = function (message) {
            var dialogTitle = 'Error Saving';
            var dialogButton = 'Okay';

            $cordovaDialogs
                .alert(message, dialogTitle, dialogButton)
                .then(function () {
                    Launch.set_saving(false);
                    is_saving = false;
                });
        };

		$scope.toggle_fb = function () {
			if ($scope.last_share.facebook) {
				$scope.last_share.facebook = 0;
			} else {
				$scope.last_share.facebook = 1;
			}
		};

		$scope.share_comic = function (destination, $event, who) {
			if (is_saving) {
				Log.log("share_comic while we're already saving, ignoring");
				return;
			}
			is_saving = true;

			// If we're sharing to FB, we may need publish permissions
			if (destination !== 'native' && me.last_share.facebook == 1) {
				if (me.permissions.hasOwnProperty('publish_stream') === false || me.permissions.publish_stream != 1) {
					State.set_saving(true);

                    FBLogin.getPublishPerms()
                        .then(function (data) {
                            me.permissions.publish_stream = 1;
                            is_saving = false;
                            $scope.share_comic(destination, $event, who);
                        }, function (error) {
                            is_saving = false;
                            console.warn('Unable to get `publish_stream` permission.');
                        });

                    return;
				}
			}

			Launch.set_saving(true);

			var data = sharingService.createBasePayload('share_comic');

			if (destination === 'native') {
                var url;

                if (makeComicWizard.customized()) {
                    url = makeComicWizard.customCanvas();
                } else {
                    url = TemplatesHelper.url(data.comic_id, data.char_id_a, data.char_id_b, 2);
                }

                sharingService.trackNativeShare();
                Launch.camera_roll(url, data.fb_message, $event);
                is_saving = false;
			} else {
				Remote.post(data)
					.success(function (data) {
						if (data) {
							$scope.share_done(data.fb_comic_id, data.photo_id, data.src);
						} else {
							$scope.share_failed();
						}
					})
					.error($scope.share_failed);
			}
		};

		var redirectToDirectFeed = function() {
			Feeds.load_latest('direct');
			directComics.getUnreadComics({ force: true });
			makeComicWizard.clearComicData();
			Launch.set_saving(false);
			NavHelper.direct_feed_after_sharing_comic();
		};

		var sendDirectDone = function(response) {
			Launch.set_saving(false);
			var data;

			is_saving = false;
			data = (!!response) ? response.data : {};

			// Handle valid=0 errors
			if (!data || !data.valid) {
				sendDirectFailed(data.error);
				return;
			}

			redirectToDirectFeed();
		};

        var sendDirectFailed = function () {
            showErrorDialog(SHARE_FAILED_MESSAGE);
        };

		$scope.sendDirect = function($event) {
			if (is_saving) {
				Log.log("share_comic while we're already saving, ignoring");
				return;
			}
			Launch.set_saving(true);

			is_saving = true;
			sharingDirect = true;

			sharingService.directShare($scope.recipients)
				.then(sendDirectDone, sendDirectFailed);
		};

		// Called by share_comic or share_custom when they're done
		$scope.share_done = function (fb_comic_id, photo_id, src) {
			if (angular.isUndefined(src)) {
				is_saving = false;
				// This was some native sharing...
				return;
			}

			if (sharingDirect) {
				redirectToDirectFeed();
				return;
			}

			// Update my home feed  and my profile with the new comic
			Feeds.load_latest('home');
			Feeds.load_latest('user_' + me.bs_id);

			Launch.set_saving(false);

			makeComicWizard.clearComicData();

			NavHelper.home_feed_after_sharing_comic();
		};

        $scope.share_failed = function (message) {
            showErrorDialog(SHARE_FAILED_MESSAGE);
        };

		$scope.hide_blocker = function () {
			is_saving = false;
			Launch.set_saving(false);
		};

		$scope.sharePublic = function(){
			$scope.selected = 'everyone';
		};

		$scope.shareDirect = function(){
			$scope.selected = 'direct';
		};

		if (makeComicWizard.defaultDirect()) {
			$scope.shareDirect();
		} else {
			$scope.sharePublic();
		}

		function resetFriendScroll() {
			$scope.maxFriends = 5;
			$scope.canShowMoreFriends = true;
		}

		$scope.showMoreFriends = function() {
			$scope.maxFriends += 15;
			if ($scope.friends.length <= $scope.maxFriends) {
				$scope.canShowMoreFriends = false;
			}
		};

        if (comic && comic.tags) {
            $scope.isCaptionContest = comic.tags.indexOf('#caption contest') !== -1;
        }

	});
