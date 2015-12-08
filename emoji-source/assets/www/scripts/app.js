'use strict';

// Configure what environment angular app is to connect to
// See services/configuration.js for details
// If not defined here, configuration.js uses it's local BITSTRIPS_ENV_CONFIG variable
var myAppModules = ['configuration', 'comicsService', 'usersService',
    'templatesHelperService', 'feedsService', 'fixedHeader', 'userAuth',
    'costarsService', 'templatesService', 'infiniteScroll', 'queuedDirective',
    'queuedLoaderService', 'launchService', 'stateService', 'logService',
    'ngRoute', 'comicTagsDirective', 'navService', 'comicLikesDirective',
    'comicCommentDirective', 'comicCommentsDirective', 'userLinkableDirective',
    'mementoService', 'classFromRouteDirective', 'avatarBuilderCtrl',
    'feedTabsDirective', 'authInterceptor', 'retryInterceptor',
    'offlineAlert', 'focusOnDirective', 'preventEnter', 'displayName',
    'feedComic', 'removeHashes', 'refreshButtonDirective',
    'visibleOnFocusDirective', 'HomeCtrl', 'UserCtrl', 'NotificationsCtrl',
    'blurOnSubmitDirective', 'loadingSpinner', 'disableDigestDirective',
    'fastFeedComicDirective', 'handlebars', 'jQuery',
    'makeComicWizard', 'appUpdateDirective', 'coachMarkDirective',
    'DirectFeedCtrl', 'ShareCtrl', 'avatarBuilderService',
    'sharingService', 'imageLoaderService', 'directComicsService',
    'bitmojiServices', 'refreshService', 'schemeURIService', 'fbService',
    'ngCordova', 'drawingService', 'uploadService', 'dynamicSize',
    'pushNotificationsService', 'photosService', 'handleTextareaClicks'];

var myApp = angular.module('mfbApp', myAppModules);

myApp.constant('VIEWS', 'views/');

myApp.config(function ($provide) {
    $provide.decorator("$exceptionHandler", ['$delegate', function ($delegate) {
        return function (exception, cause) {
            Raygun.send(exception);
            $delegate(exception, cause);
        };
    }]);
});

/*
 myApp.config(function($provide) {
 $provide.decorator('$rootScope', function($delegate) {
 var proto = Object.getPrototypeOf($delegate);

 proto.oldDigest = proto.$digest;

 proto.$digest = function() {
 console.time('DigestCycle');
 this.oldDigest();
 console.timeEnd('DigestCycle');
 };

 return $delegate;
 });
 });
 */


myApp.config(function ($routeProvider, VIEWS) {
    var comics_loaded = function (Templates) {
        return Templates.waiting();
    };

    var comicDetailRoute = {
        templateUrl: VIEWS + 'view_comic.html',
        controller: 'ViewComicCtrl',
        hide_footer: true,
        body_class: 'body-view-comic'
    };

    var comicDetailWithoutHistory = angular.extend({
        noHistory: true
    }, comicDetailRoute);

    // home routes
    $routeProvider.when('/home/',
        {
            templateUrl: VIEWS + 'home.html',
            controller: 'HomeCtrl',
            footer_tab: 'home'
        })
        .when('/home/intro', {
            templateUrl: VIEWS + 'intro.html',
            controller: 'IntroCtrl',
            body_class: 'remove-padding-top',
            hide_footer: true
        })
        .when('/home/notifications', {
            templateUrl: VIEWS + 'notifications.html',
            controller: 'NotificationsCtrl',
            body_class: 'body-view-comic',
            footer_tab: 'home'
        })
        .when('/home/direct', {
            templateUrl: VIEWS + 'direct.html',
            controller: 'DirectCtrl',
            footer_tab: 'home'
        })
        .when('/home/view_comic/:id', comicDetailRoute)
        .when('/home/view_comic/:id/:notification', comicDetailWithoutHistory)
        .when('/home/user/:fb_id',
        {
            templateUrl: VIEWS + 'user.html',
            controller: 'UserCtrl',
            footer_tab: 'home',
            hide_footer: true
        });

    // templates routes
    // Duplicated routes
    var shareRoute = {
        templateUrl: VIEWS + 'share.html',
        controller: 'ShareCtrl',
        hide_footer: true
    };

    $routeProvider.when('/templates/select_friend/:pick_type',
        {
            templateUrl: VIEWS + 'friend-select.html',
            controller: 'FriendSelectCtrl',
            footer_tab: 'comic',
            hide_footer: true,
            noHistory: true
        })
        .when('/templates/select_friend_without_avatar/:pick_type',
        {
            templateUrl: VIEWS + 'friendsWithoutAvatars.html',
            controller: 'FriendSelectCtrl',
            footer_tab: 'comic',
            hide_footer: true,
            noHistory: true
        })
        .when('/templates/edit',
        {
            templateUrl: VIEWS + 'customizeScene.html',
            controller: 'CustomizeCtrl',
            body_class: 'body-edit',
            resolve: {loaded: comics_loaded},
            hide_footer: true
        })
        .when('/photo',
        {
            templateUrl: VIEWS + 'photoCompose.html',
            controller: 'PhotoComposeCtrl',
            body_class: 'body-edit',
            resolve: {loaded: comics_loaded},
            hide_footer: true
        })
        .when('/photo/share', shareRoute)
        .when('/templates/share', shareRoute)
        .when('/templates/:search?/:template_id?/:selected_tag?',
        {
            templateUrl: VIEWS + 'templates.html',
            controller: 'TemplatesCtrl',
            resolve: {loaded: comics_loaded},
            footer_tab: 'comic'
        });

    // avatar routes
    $routeProvider.when('/avatar',
        {
            templateUrl: VIEWS + 'avatar.html',
            controller: 'UserCtrl',
            footer_tab: 'avatar'
        })
        .when('/avatar/profile_pics',
        {
            templateUrl: VIEWS + 'profile_pic_select.html',
            controller: 'ProfilePicsCtrl',
            hide_footer: true
        })
        .when('/avatar/view_comic/:id',
        {
            templateUrl: VIEWS + 'view_comic.html',
            controller: 'ViewComicCtrl',
            hide_footer: true,
            body_class: 'body-view-comic'
        })
        .when('/avatar/user/:fb_id',
        {
            templateUrl: VIEWS + 'user.html',
            controller: 'UserCtrl',
            hide_footer: true
        })
        .when('/avatar/builder/:mode',
        {
            templateUrl: VIEWS + 'avatar_builder.html',
            controller: 'AvatarBuilderCtrl',
            hide_footer: true
        });


    // settings routes
    $routeProvider.when('/avatar/settings',
        {
            templateUrl: VIEWS + 'settings.html',
            controller: 'SettingsCtrl',
            hide_footer: true
        })
        .when('/avatar/settings/:terms',
        {
            templateUrl: VIEWS + 'privacy_tou_faq.html',
            controller: 'SettingsCtrl',
            hide_footer: true
        });

    // other routes
    $routeProvider.when('/launch',
        {
            templateUrl: VIEWS + 'launch.html',
            controller: 'HomeCtrl'
        })
        .when('/launch/:stuff',
        {
            templateUrl: VIEWS + 'launch.html',
            controller: 'HomeCtrl'
        })
        .when('/error/:type',
        {
            templateUrl: VIEWS + 'error.html',
            controller: 'ErrorCtrl',
            body_class: 'error-bg',
            hide_footer: true
        })
        .when('/add_costar',
        {
            templateUrl: VIEWS + 'friend-select.html',
            controller: 'FriendSelectCtrl'
        })
        .when('/login',
        {
            templateUrl: VIEWS + 'login.html',
            controller: 'LoginCtrl',
            body_class: 'body-login',
            hide_footer: true
        })
        .when('/login/:version/:token',
        {
            templateUrl: VIEWS + 'login.html',
            controller: 'LoginCtrl',
            body_class: 'body-login',
            hide_footer: true
        })
        .when('/login/:version',
        {
            templateUrl: VIEWS + 'login.html',
            controller: 'LoginCtrl',
            body_class: 'body-login',
            hide_footer: true
        })
        .when('/progress',
        {
            templateUrl: VIEWS + 'progress.html',
            hide_footer: true
        });

    $routeProvider.otherwise({redirectTo: '/home/'});

});

// Uncomment this line to run an automated performance test
//myApp.run(function(PerformanceLog) {});

myApp.run(function ($rootScope, ImageBaseURL, Log) {
    Log.log("BITSTRIPS_ENV configuration: ImageBaseURL = " + ImageBaseURL);
});

myApp.run(function ($http, $templateCache, VIEWS) {
    // prepopulating the template cache for view_comic.html for synchronous rendering of this page
    // it allows the native autofocus to work on the comment box (tested on android only)
    var view_comic_template = VIEWS + 'view_comic.html';
    if (!$templateCache.get(view_comic_template)) {
        $http.get('views/view_comic.html', {cache: $templateCache});
    }
});

myApp.run(function update_footer_on_location_change($rootScope, $route, State) {
    $rootScope.$on('$locationChangeSuccess', function () {
        var hide_footer = !!$route.current.hide_footer;
        if (hide_footer) {
            State.hide_footer(true);
        } else {
            State.set_footer($route.current.footer_tab);
        }
    });
});

myApp.run(function trackScreenOnRouteChange($rootScope, $window, $location, $cordovaGoogleAnalytics, ANALYTICS_TRACKING_ID) {
    function trackScreen() {
        if (!$window.analytics) {
            console.warn('Cordova Google Analytics plugin not supported in this browser.');
            return;
        }

        $cordovaGoogleAnalytics.startTrackerWithId(ANALYTICS_TRACKING_ID);

        $rootScope.$on('$locationChangeSuccess', function () {
            var appScreen = $location.path();
            $cordovaGoogleAnalytics.trackView(appScreen);
        });
    }

    document.addEventListener('deviceready', trackScreen, false);
});

myApp.run(function handle_back_button($rootScope, Launch, $window, NavHelper, $timeout) {
    // We have to wait for deviceready before we can add a listener for backbutton
    document.addEventListener("deviceready", function () {
        document.addEventListener("backbutton", backButton, false);
    }, false);

    var backButton = function (event) {
        // Will exit the app
        // TODO: Launch the home intenet, or decide to use the browers' history
        // (see 'home intent' plugins as solution to back button)
        if (!NavHelper.can_go_back()) {
            navigator.app.exitApp();
            return;
        }
        event.preventDefault();

        var childScope = $rootScope.$$childHead;

        while (!!childScope) {
            if (childScope.back) {
                $rootScope.$apply(childScope.back);
                return;
            }
            childScope = childScope.$$childHead;
        }

        $rootScope.$apply(NavHelper.back);
    };
});

myApp.run(function ($rootScope, $location, UserAuth, TemplatesHelper, Users, Log, NavHelper) {
    Log.log("myApp.run");
    var user = Users.me();

    $rootScope.$on('$locationChangeStart', function () {
        if (UserAuth.is_logged_in() === false && ($location.path().substr(0, 6) !== '/login' && $location.path().substr(0, 6) != '/error')) {
            Log.log('Not logged in, going to login');
            UserAuth.logged_in_path($location.path());
            $location.path('/login');
            return;
        }
        if (user.avatar_id && user.avatar_id === '1') {
            Log.log('No avatar, going to avatar builder');
            NavHelper.avatar_builder('edit');
        }
    });
});

myApp.run(function ($window, $timeout, Feeds) {
    var get_flash_scope = function (method_check) {
        if (angular.isString(method_check) === false) {
            throw new Error("get_flash_scope called with no method");
        }
        var e = document.getElementById('flash_ref');
        if (e === null) {
            throw new Error("Unable to find flash ref dom element for " + method_check);
        }
        var scope = angular.element(e).scope();
        if (scope === null) {
            throw new Error("Couldn't find id footer scope, " + method_check);
        }

        if (angular.isUndefined(scope[method_check])) {
            throw new Error("No " + method_check + " method, but we had an id flash_ref");
        }
        return scope;
    };

    var get_scope = function (id, method_check) {
        var e = document.getElementById(id);
        if (e === null) {
            return false;
        }
        var scope = angular.element(e).scope();
        if (scope === null) {
            return false;
        }

        if (angular.isUndefined(scope[method_check])) {
            return false;
        }
        return scope;
    };


    var get_footer_scope = function (method_check) {
        var e = document.getElementById('footer');
        if (e === null) {
            throw new Error("Couldn't find id footer, " + method_check);
        }
        var scope = angular.element(e).scope();
        if (!scope) {
            throw new Error("Couldn't find id footer scope, " + method_check);
        }

        if (angular.isUndefined(scope[method_check])) {
            throw new Error("No " + method_check + " method, but we had an id footer");
        }
        return scope;
    };

// Called by flash when the user cancels editing a comic
    $window.customize_cancel = function () {
        var scope = get_flash_scope('customize_cancel');

        $timeout(scope.customize_cancel);
    };

// Called by flash when the user cancels editing a comic
    $window.customize_done = function (caption) {
        var scope = get_flash_scope('customize_done');
        $timeout(function () {
            scope.customize_done(caption);
        });
    };

    $window.share_failed = function () {
        var scope = get_flash_scope('share_failed');
        $timeout(scope.share_failed);
    };

    $window.share_done = function (fb_comic_id, photo_id, src) {
        var scope = get_flash_scope('share_done');
        $timeout(function () {
            scope.share_done(fb_comic_id, photo_id, src);
        });
    };

    $window.hide_blocker = function () {
        var scope = get_scope('flash_ref', 'hide_blocker');
        if (!scope) {
            scope = get_footer_scope('hide_blocker');
        }
        $timeout(scope.hide_blocker);
    };

    $window.new_day = function () {
        var scope = get_footer_scope('new_day');
        $timeout(scope.new_day);
    };

    $window.new_friend_comics = function () {
        Feeds.respondToNativeNotification();
    };


    $window.health_ping = function (ping) {
        var scope = get_footer_scope('health_ping');
        $timeout(function () {
            scope.health_ping(ping);
        });
    };

    $window.permission_update = function (token) {
        var scope = get_scope('flash_ref', 'permission_update');
        $timeout(function () {
            scope.permission_update(token);
        });
    };

    $window.show_message = function (message) {
        alert('They wanted me to show you this: ' + message);
    };

    $window.app_resume_handler = function () {
        $timeout(function () {
            console.log("App Resume Handler");
            var feed = angular.element(document.getElementsByTagName('html')).injector().get('Feed');
            if (feed) {
                feed.load_more_tomorrow();
            }
        });
    };
});


myApp.run(function ($window, Comics, Feeds, $timeout, SchemeURIService) {
    $window.show_comic = function (comic_id) {
        $timeout(function () {
            Comics.respondToNativeNotification(comic_id);
            Feeds.respondToNativeNotification();
        });
    };

    // bitstripsapp:// links
    $window.handleOpenURL = function (url) {
        $timeout(function () {
            SchemeURIService.execute(url);
        }, 0);
    };


});

// TODO: Better way to wait for everything to load?
var hideSplash = function () {
    navigator.splashscreen.hide();
};
document.addEventListener("deviceready", hideSplash, false);
