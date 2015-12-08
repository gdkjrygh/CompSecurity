'use strict';

angular.module('configuration', [])
    .constant('ImageBaseURL', 'http://devbox.l.bitstrips.com:81/v2/cpanel/')
    .constant('ImageBaseURLThumb', 'http://devbox.l.bitstrips.com:81/v2/cpanel/')
    .constant('API_HOST', 'http://devbox.l.bitstrips.com/')
    .constant('TEMPLATES_HOST', 'http://devbox.l.bitstrips.com/')
    .constant('TEMPLATES_SCENE_HOST', 'http://images.bitstrips.com.s3.amazonaws.com/fb_bgs/')
    .constant('AVATAR_TEMPLATE_HOST', 'http://devbox:81/render/')
    .constant('BITMOJI_SERVICES_HOST', 'http://services.bitmoji.staging.bs.ht/')
    .constant('ANALYTICS_TRACKING_ID', 'UA-50589015-6');
