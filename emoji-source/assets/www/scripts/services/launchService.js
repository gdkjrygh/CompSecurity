'use strict';

angular.module('launchService', ['remoteService', 'stateService', 'usersService', 'templatesService', 'utils', 'stateService', 'ngCordova'])
	.factory('Launch', function (Remote, $q, State, Users, Templates, Log, $window, FlashPort,
                                 $cordovaSocialSharing, $cordovaSpinnerDialog) {

		// Arg properties
		// fb_id: required (facebook ID of the user we're editing)
		// cancel_return_path: optional
		// char_id: optional - character id to edit (if it's different from the user's character already)
		var edit_avatar = function (args) {
			if (args.hasOwnProperty('fb_id') === false) {
				throw new Error("Missing fb_id in edit avatar launch");
			}
			var fb_id = args.fb_id;

			var launch_user = Users.me();
			var pack = angular.copy(launch_user.pack);
			pack.access_token = launch_user.access_token;

			var user = Users.get_user_fb(fb_id);
			pack.gender = 'm';
			if (user.sex == 2) {
				pack.gender = 'f';
			}
			pack.fb_id = user.fb_id;
			pack.name = user.name;
			pack.first_name = user.first_name;
			// Staging
			// pack.testing = 1;

			// Avatar edit
			pack.builder = 'character';
			pack.btype = 1;
			// We're editing a friend
			if (launch_user.fb_id !== fb_id) {
				pack.btype = 2;
			}
			pack.char_id = user.id;

			if (args.char_id) {
				pack.char_id = args.char_id;
				pack.editing = true;
			} else if (user.id == "1_0" || user.avatar_id == 1 || user.id == -1) {
				pack.char_id = -1;
			} else {
				pack.char_id = user.id;
				pack.editing = true;
			}
			if (args.cancel_return_path) {
				pack.cancel_return_path = args.cancel_return_path;
			}
		};
        
        var spinner_visible = false;
        var set_saving = function (visible) {
            State.set_saving(visible);
            if (spinner_visible == visible) {
                return;
            }
            try {
                if (visible) {
                    $cordovaSpinnerDialog.show();
                } else {
                    $cordovaSpinnerDialog.hide();
                }
            } catch(error) {
                // Dialog doesn't exist
            }
            spinner_visible = visible;
        };

		return {
			get_port: function () {
				return 0;
			},
			set_port: function (p) {
			},
			launch: function () {},
			camera_roll: function (url, message, $event) {
                if (!$window.plugins || !$window.plugins.socialsharing) {
                    set_saving(false);
                    console.warn('Cordova Social Sharing is not available in this browser.');
                    return;
                }

                set_saving(true);

                $cordovaSocialSharing
                    .share(message, null, url)
                    .then(function(result) {
                        set_saving(false);
                    },function(error) {
                        set_saving(false);
                    });
			},

			edit_avatar: function (fb_id, char_id) {
				edit_avatar({fb_id: fb_id, char_id: char_id});
			},

			edit_friend: function (fb_id, cancel_return_path) {
				edit_avatar({fb_id:fb_id, 'cancel_return_path':cancel_return_path});
			},

			edit_char_id: function (fb_id, char_id, cancel_return_path) {
				edit_avatar({fb_id:fb_id, 'cancel_return_path':cancel_return_path, 'char_id':char_id});
			},

			set_saving: set_saving,

            openSystemURL: function (url) {
                window.open(url, '_system');
            }
		};
	}
);
