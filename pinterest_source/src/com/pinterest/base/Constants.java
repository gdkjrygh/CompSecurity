// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.base;

import com.pinterest.kit.application.Resources;

// Referenced classes of package com.pinterest.base:
//            ApplicationInfo

public class Constants
{

    public static final int ACTIONBAR_HEIGHT;
    public static final String ACTION_GCM_RECEIVE = "com.google.android.c2dm.intent.RECEIVE";
    public static final String ACTION_GCM_REGISTRATION = "com.google.android.c2dm.intent.REGISTRATION";
    public static final String ACTION_GCM_RETRY = "com.google.android.gcm.intent.RETRY";
    public static final String ACTION_NOTIF_1 = "com.pinterest.action.NOTIF_1";
    public static final String ACTION_NOTIF_2 = "com.pinterest.action.NOTIF_2";
    public static final String ACTION_NOTIF_3 = "com.pinterest.action.NOTIF_3";
    public static final String ACTION_PIN_IT = "com.pinterest.action.PIN_IT";
    public static final String ADJUST_APP_TOKEN = "c7mmnwll85ea";
    public static final String ADJUST_INSTALL_EVENT_TOKEN = "6mxvu6";
    public static final String ADJUST_KEY_UNAUTHID = "unauth_id";
    public static final int ANIM_SPEED_FAST = Resources.integer(0x7f0d000d).intValue();
    public static final int ANIM_SPEED_NORMAL = Resources.integer(0x7f0d000c).intValue();
    public static final int ANIM_SPEED_SLOW = Resources.integer(0x7f0d000f).intValue();
    public static final float BIG_SCREEN_WIDTH_MULTIPLIER_DEFAULT = 0.7F;
    public static final int BUTTON_HEIGHT = (int)Resources.dimension(0x7f0a000a);
    public static final String CACHE_CONTROL = "Cache-Control";
    public static final String CACHE_CONTROl_VALUE = "public";
    public static final int CINEMATIC_CACHE_SIZE = 0x400000;
    public static final String CLOSEUP_PIN_ID = "CLOSEUP_PIN_ID";
    public static final String CLOSEUP_PIN_LINK_URL = "CLOSEUP_PIN_LINK_URL";
    public static final int COLOR_GRAY = Resources.color(0x7f0e006d);
    public static final int CORNER_RADIUS = (int)Resources.dimension(0x7f0a00f5);
    public static final boolean DEBUG = false;
    public static final boolean DEBUG_OR_OTA = ApplicationInfo.isOta();
    private static final String DEMIN = "://";
    public static final int EXPLORE_BOARD_CELL_CORNER_RADIUS = (int)Resources.dimension(0x7f0a0118);
    public static final String EXTRA_ACCESS_TOKEN = "com.pinterest.EXTRA_ACCESS_TOKEN";
    public static final String EXTRA_ALLOW_REDIRECT_BACK = "com.pinterest.EXTRA_ALLOW_REDIRECT_BACK";
    public static final String EXTRA_APP_MODE = "com.pinterest.EXTRA_APP_MODE";
    public static final String EXTRA_BACK_TO_ROOT = "com.pinterest.EXTRA_BACK_TO_ROOT";
    public static final String EXTRA_BIRTHDAY = "com.pinterest.EXTRA_BIRTHDAY";
    public static final String EXTRA_BOARD_ID = "com.pinterest.EXTRA_BOARD_ID";
    public static final String EXTRA_CATCH_BY_WEBHOOK = "com.pinterest.EXTRA_CATCH_BY_WEBHOOK";
    public static final String EXTRA_CATEGORY_ID = "com.pinterest.EXTRA_CATEGORY_ID";
    public static final String EXTRA_COMMERCE_INCENTIVE_MESSSAGE = "com.pinterest.EXTRA_COMMERCE_INCENTIVE_MESSSAGE";
    public static final String EXTRA_COMMERCE_SETTINGS = "com.pinterest.EXTRA_COMMERCE_SETTINGS";
    public static final String EXTRA_CONNECT_TWITTER = "com.pinterest.EXTRA_CONNECT_TWITTER";
    public static final String EXTRA_CONVERSATION_ID = "com.pinterest.EXTRA_CONVERSATION_ID";
    public static final String EXTRA_CSR_ID = "com.pinterest.EXTRA_CSR_ID";
    public static final String EXTRA_DEEPLINK_SOURCE = "com.pinterest.EXTRA_DEEPLINK_SOURCE";
    public static final String EXTRA_DESCRIPTION = "com.pinterest.EXTRA_DESCRIPTION";
    public static final String EXTRA_DIGEST_ID = "com.pinterest.EXTRA_DIGEST_ID";
    public static final String EXTRA_DIGEST_MODE = "com.pinterest.EXTRA_DIGEST_MODE";
    public static final String EXTRA_DIGEST_PIN_ITEMS = "com.pinterest.EXTRA_DIGEST_PIN_ITEMS";
    public static final String EXTRA_DOMAIN = "com.pinterest.EXTRA_DOMAIN";
    public static final String EXTRA_EDU_FINISH = "com.pinterest.EXTRA_EDU_FINISH";
    public static final String EXTRA_EDU_INDEX = "com.pinterest.EXTRA_EDU_INDEX";
    public static final String EXTRA_EDU_MODE = "com.pinterest.EXTRA_EDU_MODE";
    public static final String EXTRA_EMAIL = "com.pinterest.EXTRA_EMAIL";
    public static final String EXTRA_EXPERIMENT_LOADED = "com.pinterest.EXTRA_EXPERIMENT_LOADED";
    public static final String EXTRA_FB_PERMISSIONS = "com.pinterest.EXTRA_FB_PERMISSIONS";
    public static final String EXTRA_FEED = "com.pinterest.EXTRA_FEED";
    public static final String EXTRA_FINISH_ONSTOP = "com.pinterest.EXTRA_FINISH_ONSTOP";
    public static final String EXTRA_FIRST_NAME = "com.pinterest.EXTRA_FIRST_NAME";
    public static final String EXTRA_GENDER = "com.pinterest.EXTRA_GENDER";
    public static final String EXTRA_GRADIENT_BLACK = "com.pinterest.EXTRA_GRADIENT_BLACK";
    public static final String EXTRA_HAS_URL = "com.pinterest.EXTRA_HAS_URL";
    public static final String EXTRA_HIDE_SECRET_BOARDS = "com.pinterest.EXTRA_HIDE_SECRET_BOARDS";
    public static final String EXTRA_HOMEFEED_WAIT_TIME = "com.pinterest.EXTRA_HOMEFEED_WAIT_TIME";
    public static final String EXTRA_HOME_CONTROL = "com.pinterest.EXTRA_HOME_CONTROL";
    public static final String EXTRA_ID = "com.pinterest.EXTRA_ID";
    public static final String EXTRA_IMAGE = "com.pinterest.EXTRA_IMAGE";
    public static final String EXTRA_IMAGE_SIGNATURE = "com.pinterest.EXTRA_IMAGE_SIGNATURE";
    public static final String EXTRA_IS_HOMEFEED_PIN = "com.pinterest.EXTRA_IS_HOMEFEED_PIN";
    public static final String EXTRA_LAST_NAME = "com.pinterest.EXTRA_LAST_NAME";
    public static final String EXTRA_MANUAL_UPDATE = "com.pinterest.EXTRA_MANUAL_UPDATE";
    public static final String EXTRA_MERCHANT_NAME = "com.pinterest.EXTRA_MERCHANT_NAME";
    public static final String EXTRA_MESSAGE = "com.pinterest.EXTRA_MESSAGE";
    public static final String EXTRA_MODE = "com.pinterest.EXTRA_MODE";
    public static final String EXTRA_NAME = "com.pinterest.EXTRA_NAME";
    public static final String EXTRA_NOTIF_COUNT = "com.pinterest.EXTRA_NOTIF_COUNT";
    public static final String EXTRA_OCF_FLAG = "com.pinterest.EXTRA_OCF_FLAG";
    public static final String EXTRA_ONLY_UPDATE_NOTIF = "com.pinterest.EXTRA_ONLY_UPDATE_NOTIF";
    public static final String EXTRA_PARTNER_ID = "com.pinterest.EXTRA_PARTNER_ID";
    public static final String EXTRA_PARTNER_PACKAGE = "com.pinterest.EXTRA_PARTNER_PACKAGE";
    public static final String EXTRA_PASSWORD = "com.pinterest.EXTRA_PASSWORD";
    public static final String EXTRA_PENDING_DIALOG = "com.pinterest.EXTRA_PENDING_DIALOG";
    public static final String EXTRA_PENDING_TASK = "com.pinterest.EXTRA_PENDING_TASK";
    public static final String EXTRA_PHONE_NUMBER = "com.pinterest.EXTRA_PHONE_NUMBER";
    public static final String EXTRA_PIN_CREATE_TYPE = "com.pinterest.EXTRA_PIN_CREATE_TYPE";
    public static final String EXTRA_PIN_ID = "com.pinterest.EXTRA_PIN_ID";
    public static final String EXTRA_PIN_POSITION = "com.pinterest.EXTRA_PIN_POSITION";
    public static final String EXTRA_PLACE_ID = "com.pinterest.EXTRA_PLACE_ID";
    public static final String EXTRA_PLACE_LOCATION = "com.pinterest.EXTRA_PLACE_LOCATION";
    public static final String EXTRA_PLACE_NAME = "com.pinterest.EXTRA_PLACE_NAME";
    public static final String EXTRA_PREFILL_TEXT = "com.pinterest.EXTRA_PREFILL_TEXT";
    public static final String EXTRA_PROFILE_TAB_INDEX = "com.pinterest.EXTRA_PROFILE_TAB_INDEX";
    public static final String EXTRA_PROMOTED_DIALOG_FROM_PIN_CLOSEUP = "com.pinterest.EXTRA_PROMOTED_DIALOG_FROM_PIN_CLOSEUP";
    public static final String EXTRA_REDIRECT = "com.pinterest.EXTRA_REDIRECT";
    public static final String EXTRA_REFRESH_TOKEN = "com.pinterest.EXTRA_REFRESH_TOKEN";
    public static final String EXTRA_REMOVE_COOKIE = "com.pinterest.EXTRA_REMOVE_COOKIE";
    public static final String EXTRA_RETRY_NUMBER = "com.pinterest.EXTRA_RETRY_NUMBER";
    public static final String EXTRA_SDK_MODE = "com.pinterest.EXTRA_SDK_MODE";
    public static final String EXTRA_SEARCH_CONTEXT = "com.pinterest.EXTRA_SEARCH_CONTEXT";
    public static final String EXTRA_SEARCH_INDEX = "com.pinterest.EXTRA_SEARCH_INDEX";
    public static final String EXTRA_SEARCH_MODE = "com.pinterest.EXTRA_SEARCH_MODE";
    public static final String EXTRA_SEARCH_NAG = "com.pinterest.EXTRA_SEARCH_NAG";
    public static final String EXTRA_SEARCH_TERM = "com.pinterest.EXTRA_SEARCH_TERM";
    public static final String EXTRA_SECRET = "com.pinterest.EXTRA_SECRET";
    public static final String EXTRA_SHOW_KEYBOARD = "com.pinterest.EXTRA_SHOW_KEYBOARD";
    public static final String EXTRA_SIGNUP = "com.pinterest.EXTRA_SIGNUP";
    public static final String EXTRA_SIGNUP_HAS_INVALID_INVITE_CODE = "com.pinterest.EXTRA_SIGNUP_HAS_INVALID_INVITE_CODE";
    public static final String EXTRA_SIGNUP_INVITE_CODE = "com.pinterest.EXTRA_SIGNUP_INVITE_CODE";
    public static final String EXTRA_SIGNUP_INVITE_URL = "com.pinterest.EXTRA_SIGNUP_INVITE_URL";
    public static final String EXTRA_SORT_ORDER = "com.pinterest.EXTRA_SORT_ORDER";
    public static final String EXTRA_SOURCE = "com.pinterest.EXTRA_SOURCE";
    public static final String EXTRA_SOURCE_CAMERA = "com.pinterest.EXTRA_SOURCE_CAMERA";
    public static final String EXTRA_SOURCE_CSR = "com.pinterest.EXTRA_SOURCE_CSR";
    public static final String EXTRA_SOURCE_GALLERY = "com.pinterest.EXTRA_SOURCE_GALLERY";
    public static final String EXTRA_SOURCE_PACKAGE = "com.pinterest.EXTRA_SOURCE_PACKAGE";
    public static final String EXTRA_SOURCE_PLACE = "com.pinterest.EXTRA_SOURCE_PLACE";
    public static final String EXTRA_TITLE = "com.pinterest.EXTRA_TITLE";
    public static final String EXTRA_TOKEN = "com.pinterest.EXTRA_TOKEN";
    public static final String EXTRA_TOPIC_INDEX = "com.pinterest.EXTRA_TOPIC_INDEX";
    public static final String EXTRA_UPDATE_WIDGET_LOADING = "com.pinterest.EXTRA_UPDATE_WIDGET_LOADING";
    public static final String EXTRA_URI = "com.pinterest.EXTRA_URI";
    public static final String EXTRA_URL = "com.pinterest.EXTRA_URL";
    public static final String EXTRA_USER_ID = "com.pinterest.EXTRA_USER_ID";
    public static final String EXTRA_USER_NAME = "com.pinterest.EXTRA_USER_NAME";
    public static final String EXTRA_WEBPAGE_PINNABLE = "com.pinterest.EXTRA_WEBPAGE_PINNABLE";
    public static final String EXTRA_WEB_TITLE = "com.pinterest.EXTRA_WEB_TITLE";
    public static final String EXTRA_WEB_TITLE_STRING = "com.pinterest.EXTRA_WEB_TITLE_STRING";
    public static final String FLASHLIGHT_RESULTS_FRAGMENT_TAG = "flashlight_results_fragment";
    public static final int HAIRLINE = (int)Resources.dimension(0x7f0a0134);
    public static final String IS_CSR_REPIN = "com.pinterest.IS_CSR_REPIN";
    public static final int ITEM_COMPACT_HEIGHT = (int)Resources.dimension(0x7f0a0156);
    public static final int ITEM_HEIGHT = (int)Resources.dimension(0x7f0a0158);
    public static final int LIST_CELL_TEXT_IMAGE_GAP = (int)Resources.dimension(0x7f0a015d);
    public static final int MARGIN;
    public static final int MARGIN_DOUBLE;
    public static final int MARGIN_HALF = (int)Resources.dimension(0x7f0a0162);
    public static final int MARGIN_QUARTER = (int)Resources.dimension(0x7f0a0163);
    public static final int MAX_INTEREST_GRID_COLS = 8;
    public static final int MAX_RELATED_PINS_INLINE_INSERTIONS = 3;
    public static final int MAX_RELATED_PINS_STORY_INSERTIONS = 5;
    public static final String METADATA_KEY_AUTOCOMPLETE_IV = "AutoCompleteFileIv";
    public static final String METADATA_KEY_AUTOCOMPLETE_SECRET = "AutoCompleteFileSecret";
    public static final String METADATA_KEY_MAPBOX = "com.pinterest.mapbox.ApiKey";
    public static final String MODE_FILTER_DEFAULT_COLOR = "#bd081c";
    public static final int NEARBY_PINS_SEARCH_RADIUS = 12000;
    public static final long NEWS_REFRESH_TIME = 30000L;
    public static final int PLACE_MARKER_SIZE = (int)Resources.dimension(0x7f0a01a3);
    public static final String PREFS_KEY_CAMERA_ID = "PREFS_KEY_CAMERA_ID";
    public static final String PREF_ACCESSTOKEN = "PREF_ACCESSTOKEN";
    public static final String PREF_ACCOUNTS_STORED_CONTACTS = "PREF_ACCOUNTS_STORED_CONTACTS";
    public static final String PREF_APP_BADGE_SUPPORTED = "isBadgingSupported";
    public static final String PREF_APP_PERMISSION_REQUESTS = "PREF_APP_PERMISSION_REQUESTS";
    public static final String PREF_APP_PREFERENCES = "PREF_APP_PREFERENCES";
    public static final String PREF_AUTO_UPDATE_LAST_SHOWN = "PREF_AUTO_UPDATE_LAST_SHOWN";
    public static final String PREF_BASE_API_URL = "PREF_BASE_API_URL";
    public static final String PREF_BLOCK_SIGNUP = "BLOCK_SIGNUP";
    public static final String PREF_BOARD_SORT_ORDER = "PREF_LIBRARY_BOARD_SORT_ORDER";
    public static final String PREF_BRANCH_DATA = "PREF_BRANCH_DATA";
    public static final String PREF_CATEGORIES_LOCALE = "PREF_CATEGORIES_LOCALE";
    public static final String PREF_CINEMATIC_PIN_FRAMES = "PREF_CINEMATIC_PIN_FRAMES";
    public static final String PREF_CINEMATIC_PIN_LOOPCOUNT = "PREF_CINEMATIC_PIN_LOOPCOUNT";
    public static final String PREF_CONNETED_FACEBOOK = "PREF_CONNETED_FACEBOOK";
    public static final String PREF_CONNETED_FACEBOOK_ST = "PREF_CONNETED_FACEBOOK_ST";
    public static final String PREF_CONNETED_FACEBOOK_TL = "PREF_CONNETED_FACEBOOK_TL";
    public static final String PREF_CONNETED_GPLUS = "PREF_CONNETED_GPLUS";
    public static final String PREF_CONNETED_RAKUTEN = "PREF_CONNETED_RAKUTEN";
    public static final String PREF_CONNETED_TWITTER = "PREF_CONNETED_TWITTER";
    public static final String PREF_CONNETING_GPLUS = "PREF_CONNETING_GPLUS";
    public static final String PREF_DB_CREATED_AT = "PREF_DB_CREATED_AT";
    public static final String PREF_DB_NAME = "DB_NAME";
    public static final String PREF_DEV_BASE_API_URL = "PREF_DEV_BASE_API_URL";
    public static final String PREF_DEV_BASE_LOGGING_API_URL = "PREF_DEV_BASE_LOGGING_API_URL";
    public static final String PREF_DEV_BASE_LOGGING_API_URL_V4 = "PREF_DEV_BASE_LOGGING_API_URL_V4";
    public static final String PREF_FIRST_AUTH = "PREF_FIRST_AUTH";
    public static final String PREF_FIRST_LAUNCH = "PREF_FIRST_LAUNCH";
    public static final String PREF_FIRST_LOGIN_IN = "PREF_FIRST_LOGIN_IN";
    public static final String PREF_FOLLOWING = "PREF_FOLLOWING";
    public static final String PREF_GCM_APP_VERSION = "PREF_GCM_APP_VERSION";
    public static final String PREF_GCM_REG_ID = "PREF_GCM_REG_ID";
    public static final String PREF_GPLUS_ACCOUNT = "PREF_GPLUS_ACCOUNT";
    public static final String PREF_GUIDED_SEARCH_EDU_SHOWN = "PREF_GUIDED_SEARCH_EDU_SHOWN";
    public static final String PREF_HOME_FEED_STREAMING = "PREF_HOME_FEED_STREAMING";
    public static final String PREF_INSTALL_ID = "PREF_INSTALL_ID";
    public static final String PREF_LAST_BOARD = "PREF_LAST_BOARD";
    public static final String PREF_LAST_CATEGORY = "PREF_LAST_CATEGORY";
    public static final String PREF_LAST_GLOBAL_DATA_UPDATE = "PREF_LAST_GLOBAL_DATA_UPDATE";
    public static final String PREF_LAST_SAVED_INSTANCE_TIME = "PREF_LAST_SAVED_INSTANCE_TIME";
    public static final String PREF_LAST_USERNAME = "PREF_LAST_USERNAME";
    public static final String PREF_LIBRARY_EDU_SHOWN = "PREF_LIBRARY_EDU_SHOWN";
    public static final String PREF_MY_ID = "PREF_MY_ID";
    public static final String PREF_MY_USER = "PREF_MY_USER";
    public static final String PREF_MY_USERNAME = "PREF_MY_USERNAME";
    public static final String PREF_MY_USER_CUSTOM_GENDER = "PREF_MY_USER_CUSTOM_GENDER";
    public static final String PREF_MY_USER_SETTINGS = "PREF_MY_USER_SETTINGS";
    public static final String PREF_OFFLINE_BOARD_IDS = "PREF_OFFLINE_BOARD_IDS";
    public static final String PREF_OFFLINE_BOOKMARK = "PREF_OFFLINE_BOOKMARK";
    public static final String PREF_OFFLINE_ENABLED = "PREF_OFFLINE_ENABLED";
    public static final String PREF_OFFLINE_INITIALLY_SYNCED = "PREF_OFFLINE_INITIALLY_SYNCED";
    public static final String PREF_OFFLINE_LAST_SYNC = "PREF_OFFLINE_LAST_SYNC";
    public static final String PREF_PIN_PAGER_EDU_SEEN = "PREF_PIN_PAGER_EDU_SEEN";
    public static final String PREF_PLAY_SERVICE_DIALOG_SHOWN = "PREF_PLAY_SERVICE_DIALOG_SHOWN";
    public static final String PREF_POST_SINGUP = "PREF_POST_SINGUP";
    public static final String PREF_SEARCH_TYPEAHEAD_CACHE_VERSION = "PREF_SEARCH_TYPEAHEAD_CACHE_VERSION";
    public static final String PREF_SEND_ANALYTICS = "PREF_SEND_ANALYTICS";
    public static final String PREF_SEND_PINALYTICS = "PREF_SEND_PINALYTICS";
    public static final String PREF_SHARE_FACEBOOK = "PREF_SHARE_FACEBOOK";
    public static final String PREF_SHARE_TWITTER = "PREF_SHARE_TWITTER";
    public static final String PREF_SHOW_PIN_LONGPRESS_EDU = "PREF_SHOW_PIN_CONTEXTMENU_EDU";
    public static final String PREF_SIGNUP_NOTIF_SHOWN_TIMES = "PREF_SIGNUP_NOTIF_SHOWN_TIMES";
    public static final String PREF_TYPEAHEAD_CACHE_LAST_PARTITION_FETCHED = "PREF_TYPEAHEAD_CACHE_LAST_PARTITION_FETCHED";
    public static final String PREF_TYPEAHEAD_CACHE_PARTITIONS = "PREF_TYPEAHEAD_CACHE_PARTITIONS";
    public static final String PREF_TYPEAHEAD_CACHE_PARTITION_COUNT = "PREF_TYPEAHEAD_CACHE_PARTITION_COUNT";
    public static final String PREF_TYPEAHEAD_CACHE_READY = "PREF_TYPEAHEAD_CACHE_READY";
    public static final String PREF_UDID = "udid";
    public static final String PREF_UPLOAD_CONTACTS_DIALOG_LAST_SHOWN = "PREF_UPLOAD_CONTACTS_DIALOG_LAST_SHOWN";
    public static final String PREF_VISITED_PLACES = "PREF_VISITED_PLACES";
    public static final String PREF_WIDGET_LAST_ENABLED_DATE = "PREF_WIDGET_LAST_ENABLED_DATE";
    public static final int PUSH_NOTIF_MAX_HEIGHT = (int)Resources.dimension(0x7f0a01b0);
    public static final int PUSH_NOTIF_MAX_WIDTH = 1024;
    public static final String REFERRER_KEY_UNAUTHID = "install_id";
    public static final int SEARH_TYPEAHEAD_EMPTY_HEADER_MARGIN = (int)Resources.dimension(0x7f0a01c7);
    public static final int SHEET_MAX_WIDTH = (int)Resources.dimension(0x7f0a01cf);
    public static final String SPECIFIC_FILTER_DEFAULT_COLOR = "#32CD32";
    public static final long STALE_DIFF = 60000L;
    public static final int SWIPE_OFFSET_LENGTH;
    public static final float TABLET_SCREEN_WIDTH_MULTIPLIER_PORTRAIT = 0.8F;
    public static final int TEXT_BODY = (int)Resources.dimension(0x7f0a01d7);
    public static final int TEXT_GRID_CAPTION = (int)Resources.dimension(0x7f0a01e0);
    public static final long TIME_MULTIPLIER = 0xf4240L;
    public static final String TYPEAHEAD_CACHE_FILENAME = "ac.gzip.enc";
    public static final int TYPEAHEAD_CACHE_VERSION = 1;
    public static final int USERBAR_HEIGHT = (int)Resources.dimension(0x7f0a01f6);
    public static final String VALUE_ADDRESSES = "VALUE_ADDRESSES";
    public static final String VALUE_CONTEXTUAL = "VALUE_CONTEXTUAL";
    public static final String VALUE_HASHTAG = "VALUE_HASHTAG";
    public static final String VALUE_HOME = "VALUE_HOME";
    public static final String VALUE_LOGIN = "VALUE_LOGIN";
    public static final String VALUE_ORDER_HISTORY = "VALUE_ORDER_HISTORY";
    public static final String VALUE_PAYMENT_METHODS = "VALUE_PAYMENT_METHODS";
    public static final String VALUE_PROFILE = "VALUE_PROFILE";
    public static final String VALUE_SEARCH = "VALUE_SEARCH";
    public static final String VALUE_SEARCH_ADD_PIN = "VALUE_SEARCH_ADD_PIN";
    public static final String VALUE_SEARCH_BUYABLE = "VALUE_SEARCH_BUYABLE";
    public static final String VALUE_SEARCH_GLOBAL = "VALUE_SEARCH_GLOBAL";
    public static final String VALUE_SEARCH_LIBRARY = "VALUE_SEARCH_LIBRARY";
    public static final String VALUE_SEARCH_LOCAL = "VALUE_SEARCH_LOCAL";
    public static final String VALUE_SIGNUP = "VALUE_SIGNUP";
    public static final String VALUE_WELCOME = "VALUE_WELCOME";
    public static final int WIDGET_MAX_HEIGHT = 1024;

    public Constants()
    {
    }

    public static String appendEllipsis(int i)
    {
        return appendEllipsis(Resources.string(i));
    }

    public static String appendEllipsis(String s)
    {
        return (new StringBuilder()).append(s).append(Resources.string(0x7f070232)).toString();
    }

    public static Long getIdFromUrl(String s)
    {
        s = s.split("://");
        if (s.length != 2)
        {
            return null;
        }
        s = s[1];
        try
        {
            s = Long.valueOf(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        return s;
    }

    public static boolean isFalse(Boolean boolean1)
    {
        return Boolean.FALSE.equals(boolean1);
    }

    public static boolean isTrue(Boolean boolean1)
    {
        return Boolean.TRUE.equals(boolean1);
    }

    public static boolean timeIsStale(long l)
    {
        while (l == 0L || System.currentTimeMillis() - l <= 60000L) 
        {
            return false;
        }
        return true;
    }

    static 
    {
        MARGIN = (int)Resources.dimension(0x7f0a015f);
        MARGIN_DOUBLE = MARGIN * 2;
        ACTIONBAR_HEIGHT = (int)Resources.dimension(0x7f0a0009);
        SWIPE_OFFSET_LENGTH = ACTIONBAR_HEIGHT + MARGIN;
    }
}
