'use strict';

angular.module('templatesHelperService', ['configuration', 'remoteService', 'templatesService', 'utils'])
	.factory('TemplatesHelper', function (Remote, Templates, $window, $timeout, Log, ImageBaseURL, safeInterval, TEMPLATES_SCENE_HOST, AVATAR_TEMPLATE_HOST) {
		var default_scale = 1;

		var feed_notices = [];
		var _last_hour = new Date().getDay() + " " + new Date().getHours();

		/* Left this in for archival purposes
		var clear_users = function (comics) {
			angular.forEach(comics, function (comic) {
				delete comic['user_a'];
				delete comic['user_b'];
				delete comic['thumb'];
				delete comic['caption'];
			});
		};
		*/

		var max_update_count = 0;
		var update_scale = function (resize) {
			var new_scale = default_scale;
			if ($window.innerWidth === 0 || $window.innerWidth === 256) {
				Log.log("Waiting 100 to update scale " + max_update_count);
				max_update_count += 1;
				if (max_update_count < 5) {
					$timeout(update_scale, 100);
					return;
				}
			}

			var dpi = $window.devicePixelRatio*$window.innerWidth;
			if (dpi > 540) {
				new_scale = 2;
			} else {
				new_scale = 1;
			}
			if (angular.isUndefined(resize)) {
				resize = "";
			} else {
				resize = "Via " + resize + " ";
			}
			Log.log(resize + "(dPR x iW) = default_scale " + $window.devicePixelRatio + ", " + $window.innerWidth + " = " + new_scale);
			if (new_scale !== default_scale) {
				Log.log("Setting new scale " + new_scale);
				default_scale = new_scale;
			}
		};

        var url = function (comic_id, id_a, id_b, scale) {
            var url = ImageBaseURL;
            if (scale >= 2) {
                url += 'scale' + scale + '/';
            }
            url += comic_id + '-' + id_a;
            if (id_b) {
                url += '-' + id_b;
            }
            url += '-v1.png';
            return url;
        };


		var comic_thumb = function (comic) {
			if (comic.user_a && (comic.type === 0 || comic.user_b)) {
				if (comic.type === 0) {
                    return url(comic.comic_id, comic.user_a.id, null, default_scale);
				} else {
                    return url(comic.comic_id, comic.user_a.id, comic.user_b.id, default_scale);
				}
			} else {
				return '';
			}
		};

        var sceneBackground = function (comicId) {
            return TEMPLATES_SCENE_HOST + comicId + '_2.png';
        };

        var getPhotoAvatarTemplates = function (me) {
            // 10 => magic value indicating comic type, 10 = photo comic
            // See bitstrips db fb_template.type + BFB_Comic.php constants
            var PHOTO_TEMPLATES = 10;

            // Make sure templates are sorted by their rank
            var templates = Templates.get_templates_type(PHOTO_TEMPLATES)
                .sort(function (a, b) { return a.rank - b.rank; });

            return templates.map(function(comic) {
                return {
                    template_id: comic.template_id,
                    url: getCharacterUrl(me.id, comic.comic_id, 1, null, 2)
                };
            });
        };

        var getCharacterUrl = function (avatarId, templateId, costarIndex, emo, scale) {
            var emoParam = (typeof emo === 'number') ? '&emo=' + emo : '';
            var scaleParam = (typeof scale !== 'undefined' && typeof scale === 'number') ? 'scale=' + scale : 'scale=2';
            var costarBUrl = (costarIndex === 1) ? "":"B/";
            return AVATAR_TEMPLATE_HOST + costarBUrl + templateId + '/' + avatarId + '-v1.png?' + scaleParam + emoParam;
        };

		/* For testing:
		   var comics = angular.element(document.getElementsByTagName('html')).injector().get('Comics')
		   var feed = angular.element(document.getElementsByTagName('html')).injector().get('Feed')
		   app_resume_handler() //should do nothing
		   comics.set_latest('2013-12-10');
		   feed.set_last_hour('2 12');
		   app_resume_handler() //should reload pageXOffset
		*/
		var load_more_tomorrow = function () {
			if (Templates.loaded() === false) {
				Log.log("load_more_tomorrow: comics not loaded");
				return;
			}
			var current_hour = new Date().getDay() + " " + new Date().getHours();
			if (_last_hour != current_hour) {
				_last_hour = current_hour;
				Log.log("load_more_tomorrow: is_it_tomorrow");
				is_it_tomorrow();
			}
		};

        var is_it_tomorrow = function () {
            Log.log("Checking if it's tomorrow");
            Remote.post({'method':'is_it_tomorrow', 'date':Templates.latest()}).success(
                function (data) {
					Log.log("Checking if it's tomorrow: reply", data);
                    if (data.yes === 1) {
                        load_new_day();
                    } else {
                        load_more_tomorrow();
                    }
                }
            );
        };

        Templates.waiting().then(function() {
            // This is more reliable than app_resume_handler (webview javascript: location can be screwy
            safeInterval(load_more_tomorrow, 60000);
        });


		var set_user_in_comic = function (comic, users, ignore_costar) {
			var index = 0;

			if (angular.isUndefined(users)) {
				return;
			}

			Math.seedrandom(parseInt(comic.template_id, 10));

			comic.user_a = users[0];

			if (users.length === 1 && comic.type !== 0 && ignore_costar !== true) {
				comic.needs_costar = true;
			} else {
				delete comic.needs_costar;
				if (users.length > 1) {
					index = Math.floor(Math.random()*(users.length-1) + 1);
				}
			}

			comic.user_b = users[index];

			update_template_info(comic);
		};

		var update_template_info = function (comic) {
			comic.thumb = comic_thumb(comic);
			if (comic.hasOwnProperty('needs_costar') && comic.needs_costar === true) {
				comic.caption = "Bitstrips is more fun with friends";
			} else {
				comic.caption = update_desc(comic.description, comic.user_a, comic.user_b);
			}
        };

        var _loading_new_day = false;
        var load_new_day = function () {
            Log.log("Loading new day");
            _loading_new_day = true;
			Templates.reload();
            Templates.waiting().then(function () {
                // Forces scope refresh
                $timeout(function () { Log.log("0 timeout"); }, 0);
                load_more_tomorrow();
            });
        };

		update_scale();
		angular.element($window).bind("resize", function () {
			update_scale("resize");
		});

		var gender_fix = function (desc, sex_a, sex_b) {
			if (!desc) {
				return '';
			}
			desc = desc.replace(/{a_([^}_]*)_([^}_]*)}/g, '$' + sex_a);
			desc = desc.replace(/{b_([^}_]*)_([^}_]*)}/g, '$' + sex_b);
			return desc;
		};

		var update_desc = function (desc, user_a, user_b) {
			user_b = user_b || user_a;
			if (!desc) {
				return '';
			}
			desc = desc.replace(/{a}/g, user_a.first_name);
			desc = desc.replace(/{b}/g, user_b.first_name);
			return gender_fix(desc, user_a.sex, user_b.sex);
		};

		return {
			add_notice: function (user, message) {
				feed_notices.unshift({user:user, message:message});
			},

			get_notices: function () {
				return feed_notices;
			},

			set_user_in_comic: function (comic, users) {
				set_user_in_comic(comic, users);
			},

			set_user_in_comics: function (comics, users) {
				angular.forEach(comics, function (comic) {
					set_user_in_comic(comic, users);
				});
			},

			update_desc: update_desc,


			get_last_hour: function() {
				return _last_hour;
			},

			set_last_hour: function(value) {
				_last_hour = value;
			},

			new_day:load_new_day,
			update_template_info: update_template_info,
			load_more_tomorrow: load_more_tomorrow,

            sceneBackground: sceneBackground,
            getCharacterUrl: getCharacterUrl,
            getPhotoAvatarTemplates: getPhotoAvatarTemplates,

            url: url
		};
	});
