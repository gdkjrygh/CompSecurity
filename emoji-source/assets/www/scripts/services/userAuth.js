'use strict';

angular.module('userAuth', ['costarsService', 'bootstrapService', 'remoteService', 'stateService',
                            'usersService', 'feedsService', 'navService', 'pushNotificationsService'])
	.factory('UserAuth', function (Remote, $location, Bootstrap, $q, State, Log, Users, $injector,
                                    Feeds, Costars, NavHelper, $window, PushNotifications) {
		var logged_in = false;
		var access_token = '';
		var user_info = Users.me();
		var on_login_path = false;

		var setErrorceptionMetaData = function (user) {
			if ($window._errs) {
				$window._errs.meta = {
					bs_id: user.bs_id
				};
			}
		};

		var set_access_token = function (token) {
			return Remote.post({'method':'mfb_user_info', 'token':token})
				.then(function(response) {
					var data = response.data;
					if (data && data.user_info) {
						access_token = token;
						Users.me(data.user_info);
						logged_in = true;

						setErrorceptionMetaData(data.user_info);

                        PushNotifications.register();

						// Initialize costars and feeds immediately, should help the launch experience feel faster
						Costars.init();
						Feeds.get_feed('home');
						Feeds.get_feed('notifications');
						Feeds.get_feed('direct');

						// We don't care where you came from, if you're a fresh install - you're seeing this.
						// vs on_login_path maybe already being set...
						if (data.user_info.fresh_install) {
							NavHelper.home_intro();
						} else {
							if (on_login_path !== false) {
								$location.path(on_login_path);
							} else {
								NavHelper.home_feed();
							}
						}
					}
				});
		};

		if (Bootstrap.token) {
			logged_in = true;
			access_token = Bootstrap.token;
			set_access_token(Bootstrap.token, 1);
		}

		return {
			logged_in_path: function (path) {
				on_login_path = path;
			},
			is_logged_in: function () {
				return logged_in;
			},
			set_token: set_access_token,
			set_new_token: function (new_token) {
				Log.log("Setting new access token: " + new_token);
				access_token = new_token;
			},
			get_user: function () {
				return user_info;
			},
			get_token: function () {
				return access_token;
			}
		};
	}
);
