'use strict';

angular.module('configuration', [])
    .constant('ImageBaseURL', 'http://compose.staging.bs.ht/v2/cpanel/')
    .constant('ImageBaseURLThumb', 'http://compose.staging.bs.ht/v2/cpanel/')
    .constant('API_HOST', 'http://test.bitstrips.com/')
    .constant('BITMOJI_SERVICES_HOST', 'http://services.bitmoji.staging.bs.ht/')
    .constant('TEMPLATES_SCENE_HOST', 'http://images.staging.bitstrips.com.s3.amazonaws.com/fb_bgs/')
    .constant('AVATAR_TEMPLATE_HOST', 'http://render.staging.bs.ht/render/')
    .constant('TEMPLATES_HOST', 'http://test.bitstrips.com/')
    .constant('ANALYTICS_TRACKING_ID', 'UA-50589015-6');
