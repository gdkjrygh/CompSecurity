// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy;

import android.os.Build;

public final class Constants
{

    public static final String APPBOY = "Appboy";
    public static final String APPBOY_ACTION_CLICKED_ACTION = "com.appboy.action.APPBOY_ACTION_CLICKED";
    public static final String APPBOY_ACTION_ICON_KEY = "appboy_action_icon";
    public static final String APPBOY_ACTION_ID_KEY = "appboy_action_id";
    public static final String APPBOY_ACTION_INDEX_KEY = "appboy_action_index";
    public static final String APPBOY_ACTION_IS_CUSTOM_ACTION_KEY = "appboy_is_custom_action";
    public static final String APPBOY_ACTION_TAG = "APPBOY_ACTION";
    public static final String APPBOY_ACTION_TYPE_KEY = "appboy_action_type";
    public static final String APPBOY_ACTION_URI_KEY = "appboy_action_uri";
    public static final String APPBOY_CANCEL_NOTIFICATION_ACTION = "com.appboy.action.CANCEL_NOTIFICATION";
    public static final String APPBOY_CANCEL_NOTIFICATION_TAG = "appboy_cancel_notification";
    public static final String APPBOY_DATA_SYNC_REQUEST_INTENT = ".intent.APPBOY_DISPATCH_ALARM_EXPIRED";
    public static final int APPBOY_DEFAULT_NOTIFICATION_ID = -1;
    public static final String APPBOY_GCM_MESSAGE_TYPE_KEY = "collapse_key";
    public static final String APPBOY_INIT_LOCATION_SERVICE_INTENT_SUFFIX = ".INIT_APPBOY_LOCATION_SERVICE";
    public static final String APPBOY_LOCATION_DISTANCE_INTERVAL_KEY = "distance";
    public static final String APPBOY_LOCATION_ORIGIN_KEY = "origin";
    public static final String APPBOY_LOCATION_PROVIDER_KEY = "provider";
    public static final String APPBOY_LOCATION_TIME_INTERVAL_KEY = "time";
    public static final String APPBOY_LOG_TAG_PREFIX = String.format("%s v%s ", new Object[] {
        "Appboy", "1.10.0"
    });
    public static final int APPBOY_MAX_PURCHASE_QUANTITY = 100;
    public static final int APPBOY_MINIMUM_NOTIFICATION_DURATION_MILLIS = 1000;
    public static final String APPBOY_PUSH_ACCENT_KEY = "ac";
    public static final String APPBOY_PUSH_ACTION_ICON_KEY_TEMPLATE = "ab_a*_ic";
    public static final String APPBOY_PUSH_ACTION_ID_KEY_TEMPLATE = "ab_a*_id";
    public static final String APPBOY_PUSH_ACTION_TEXT_KEY_TEMPLATE = "ab_a*_t";
    public static final String APPBOY_PUSH_ACTION_TYPE_KEY_TEMPLATE = "ab_a*_a";
    public static final String APPBOY_PUSH_ACTION_TYPE_NONE = "ab_none";
    public static final String APPBOY_PUSH_ACTION_TYPE_OPEN = "ab_open";
    public static final String APPBOY_PUSH_ACTION_TYPE_SHARE = "ab_share";
    public static final String APPBOY_PUSH_ACTION_TYPE_URI = "ab_uri";
    public static final String APPBOY_PUSH_ACTION_URI_KEY_TEMPLATE = "ab_a*_uri";
    public static final String APPBOY_PUSH_APPBOY_KEY = "_ab";
    public static final String APPBOY_PUSH_BIG_IMAGE_URL_KEY = "appboy_image_url";
    public static final String APPBOY_PUSH_BIG_SUMMARY_TEXT_KEY = "ab_bs";
    public static final String APPBOY_PUSH_BIG_TITLE_TEXT_KEY = "ab_bt";
    public static final String APPBOY_PUSH_CAMPAIGN_ID_KEY = "cid";
    public static final String APPBOY_PUSH_CATEGORY_KEY = "ab_ct";
    public static final String APPBOY_PUSH_CLICKED_ACTION = "com.appboy.action.APPBOY_PUSH_CLICKED";
    public static final String APPBOY_PUSH_CONTENT_KEY = "a";
    public static final String APPBOY_PUSH_CUSTOM_NOTIFICATION_ID = "n";
    public static final String APPBOY_PUSH_CUSTOM_URI_KEY = "uri";
    public static final String APPBOY_PUSH_DEEP_LINK_KEY = "uri";
    public static final String APPBOY_PUSH_EXTRAS_KEY = "extra";
    public static final String APPBOY_PUSH_NOTIFICATION_DURATION_KEY = "nd";
    public static final String APPBOY_PUSH_NOTIFICATION_ID = "nid";
    public static final String APPBOY_PUSH_NOTIFICATION_SOUND_DEFAULT_VALUE = "d";
    public static final String APPBOY_PUSH_NOTIFICATION_SOUND_KEY = "sd";
    public static final String APPBOY_PUSH_NOTIFICATION_TAG = "appboy_notification";
    public static final String APPBOY_PUSH_PRIORITY_KEY = "p";
    public static final String APPBOY_PUSH_PUBLIC_NOTIFICATION_KEY = "ab_pn";
    public static final String APPBOY_PUSH_SUMMARY_TEXT_KEY = "s";
    public static final String APPBOY_PUSH_TITLE_KEY = "t";
    public static final String APPBOY_PUSH_UNINSTALL_TRACKING_KEY = "appboy_uninstall_tracking";
    public static final String APPBOY_PUSH_VISIBILITY_KEY = "ab_vs";
    public static final String APPBOY_PUSH_WEAR_BACKGROUND_IMAGE_URL_KEY = "ab_wb";
    public static final String APPBOY_PUSH_WEAR_EXTRA_PAGE_CONTENT_KEY_PREFIX = "ab_we_c";
    public static final String APPBOY_PUSH_WEAR_EXTRA_PAGE_TITLE_KEY_PREFIX = "ab_we_t";
    public static final String APPBOY_PUSH_WEAR_HIDE_APP_ICON_KEY = "ab_wi";
    public static final String APPBOY_REQUEST_LOCATION_UPDATES_INTENT_SUFFIX = ".REQUEST_APPBOY_LOCATION_UPDATES";
    public static final String APPBOY_REQUEST_REMOVE_LOCATION_UPDATES_INTENT_SUFFIX = ".REQUEST_REMOVE_APPBOY_LOCATION_UPDATES";
    public static final String APPBOY_REQUEST_SYNC_INTENT_SUFFIX = ".REQUEST_DATA_SYNC";
    public static final String APPBOY_SDK_VERSION = "1.10.0";
    public static final String APPBOY_SINGLE_LOCATION_UPDATE_INTENT_SUFFIX = ".SINGLE_APPBOY_LOCATION_UPDATE";
    public static final String APPBOY_WEBVIEW_URL_KEY = "APPBOY_WEBVIEW_URL";
    public static final String DEFAULT_TWELVE_HOUR_TIME_FORMAT = "h:mm a";
    public static final String DEFAULT_TWENTY_FOUR_HOUR_TIME_FORMAT = "HH:mm";
    public static final String HTTP_USER_AGENT_ANDROID = "android";
    public static final Boolean IS_AMAZON;
    public static final float LOCATION_UPDATE_DISTANCE_DEFAULT = 50F;
    public static final float LOCATION_UPDATE_DISTANCE_LOCAL_CONFIG_MINIMUM = 50F;
    public static final long LOCATION_UPDATE_TIME_INTERVAL_DEFAULT_MS = 0x36ee80L;
    public static final long LOCATION_UPDATE_TIME_INTERVAL_LOCAL_CONFIG_MINIMUM_MS = 0x493e0L;
    public static final boolean NETWORK_LOGGING = true;

    public Constants()
    {
    }

    static 
    {
        IS_AMAZON = Boolean.valueOf(Build.MANUFACTURER.equals("Amazon"));
    }
}
