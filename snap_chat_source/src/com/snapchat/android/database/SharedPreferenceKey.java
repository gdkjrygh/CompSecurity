// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.database;

import android.content.SharedPreferences;
import com.snapchat.android.model.SharedPreferenceGroup;
import eb;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public final class SharedPreferenceKey extends Enum
{

    private static final SharedPreferenceKey $VALUES[];
    public static final SharedPreferenceKey AD_INDUSTRIES;
    public static final SharedPreferenceKey ALLOWED_GPS;
    public static final SharedPreferenceKey ANDROID_DISPLAY_NAME;
    public static final SharedPreferenceKey APP_INSTALL_LOGGED;
    public static final SharedPreferenceKey APP_VERSION_CODE;
    public static final SharedPreferenceKey AUTH_TOKEN;
    public static final SharedPreferenceKey AUTO_LIBRARY_SCANNING_ENABLED;
    public static final SharedPreferenceKey AUTO_LIBRARY_SCANNING_FIRST_LAUNCHED_ON;
    public static final SharedPreferenceKey AUTO_LIBRARY_SCANNING_SHOWN_FIRST_NOTIFICATION;
    public static final SharedPreferenceKey BIRTHDAY_THIS_YEAR_IN_MILLIS;
    public static final SharedPreferenceKey CASH_CARD_BRAND;
    public static final SharedPreferenceKey CASH_CARD_LINKED;
    public static final SharedPreferenceKey CASH_CARD_SUFFIX;
    public static final SharedPreferenceKey CASH_CUSTOMER_ALLOWED;
    public static final SharedPreferenceKey CASH_CUSTOMER_ID;
    public static final SharedPreferenceKey CASH_HAS_TRANSACTIONS;
    public static final SharedPreferenceKey CASH_OUTDATED_PROFILE;
    public static final SharedPreferenceKey CASH_PROVIDER_NAME;
    public static final SharedPreferenceKey CASH_SEND_CONFIRMATION;
    public static final SharedPreferenceKey CASH_SERVICE_ACTIVE;
    public static final SharedPreferenceKey CASH_SWIPE_SEND_CONFIRMATION;
    public static final SharedPreferenceKey CASH_TOOLTIP_DISPLAY_COUNT;
    public static final SharedPreferenceKey CHANNEL_LIST_TIMESTAMP;
    public static final SharedPreferenceKey CHAT_SESSIONS_AFTER_CHAT1_5;
    public static final SharedPreferenceKey CLIENT_PROMPT_UUID;
    public static final SharedPreferenceKey CONVERSATIONS_ITER_TOKEN;
    public static final SharedPreferenceKey CURRENT_EDITION_IDS;
    public static final SharedPreferenceKey DEMOGRAPHICS_TRACKING_SENT_FLAG;
    public static final SharedPreferenceKey DEVELOPER_OPTIONS_ADD_CONTACTS_FOOTER_ENABLED;
    public static final SharedPreferenceKey DEVELOPER_OPTIONS_ADD_FRIENDS_FROM_SCREENSHOT_ENABLED;
    public static final SharedPreferenceKey DEVELOPER_OPTIONS_CUSTOM_ENDPOINT;
    public static final SharedPreferenceKey DEVELOPER_OPTIONS_DISCOVER_CUSTOM_ENDPOINT;
    public static final SharedPreferenceKey DEVELOPER_OPTIONS_ENABLE_TERMS_OF_USE;
    public static final SharedPreferenceKey DEVELOPER_OPTIONS_FAKE_DISPLAY_NAME_ON_SEARCH_FRIEND_ENABLED;
    public static final SharedPreferenceKey DEVELOPER_OPTIONS_FAKE_FRIENDMOJI_ENABLED;
    public static final SharedPreferenceKey DEVELOPER_OPTIONS_HORIZONTAL_SCROLL;
    public static final SharedPreferenceKey DEVELOPER_OPTIONS_HTTP_METRICS_ENABLED;
    public static final SharedPreferenceKey DEVELOPER_OPTIONS_MINI_PROFILE_ENABLED;
    public static final SharedPreferenceKey DEVELOPER_OPTIONS_NUM_STORIES_PER_THUMBNAIL;
    public static final SharedPreferenceKey DEVELOPER_OPTIONS_PHONE_VERIFICATION_EXPERIMENT;
    public static final SharedPreferenceKey DEVELOPER_OPTIONS_RELEASE_DELAY_TIMER;
    public static final SharedPreferenceKey DEVELOPER_OPTIONS_SHOULD_DISABLE_PINNING;
    public static final SharedPreferenceKey DEVELOPER_OPTIONS_SHOULD_FAKE_CELLULAR_CONNECTION;
    public static final SharedPreferenceKey DEVELOPER_OPTIONS_SHOULD_IGNORE_LOOKSERY_WHITELIST;
    public static final SharedPreferenceKey DEVELOPER_OPTIONS_SHOULD_SHOW_DEVICE_TOKEN_TOASTS;
    public static final SharedPreferenceKey DEVELOPER_OPTIONS_SHOULD_SHOW_FPS_OVERLAY;
    public static final SharedPreferenceKey DEVELOPER_OPTIONS_SHOW_DIAGNOSTIC_OVERLAY;
    public static final SharedPreferenceKey DEVELOPER_OPTIONS_SHOW_PROFILE_PICTURES;
    public static final SharedPreferenceKey DEVELOPER_OPTIONS_SHOW_TERMS_OF_USE;
    public static final SharedPreferenceKey DEVELOPER_OPTIONS_SNI_ENABLED;
    public static final SharedPreferenceKey DEVELOPER_OPTIONS_SQUARE_SANDBOX;
    public static final SharedPreferenceKey DEVELOPER_OPTIONS_TAP_TO_VIEW;
    public static final SharedPreferenceKey DEVELOPER_OPTIONS_UPGRADE_PROMPT_ENABLED;
    public static final SharedPreferenceKey DEVICE_HARDWARE_INFO_V1;
    public static final SharedPreferenceKey DISABLED_SAVE_STORY_TO_GALLERY_CONFIRMATION;
    public static final SharedPreferenceKey DISCOVER_RESOURCE_PARAM_NAME;
    public static final SharedPreferenceKey DISCOVER_RESOURCE_PARAM_VALUE;
    public static final SharedPreferenceKey DISCOVER_SEEN_ONBOARDING;
    public static final SharedPreferenceKey DISCOVER_TIME_LAST_SEEN;
    public static final SharedPreferenceKey DISPLAY_NAME;
    public static final SharedPreferenceKey EMAIL;
    public static final SharedPreferenceKey ENDPOINT_SET;
    public static final SharedPreferenceKey FILTERS_ENABLED;
    public static final SharedPreferenceKey FINDFRIENDS_TIMESTAMPS;
    public static final SharedPreferenceKey FIND_FRIENDS_ENABLED_FOR_CAPTCHA;
    public static final SharedPreferenceKey FIND_FRIENDS_TRIMMED;
    public static final SharedPreferenceKey FIND_VERIFIED_USERS;
    public static final SharedPreferenceKey FRONT_FACING_FLASH_SETTING;
    public static final SharedPreferenceKey GCM_REGISTRATION_ID;
    public static final Map GROUP_TO_KEYS;
    public static final SharedPreferenceKey HAS_ACCEPTED_ADD_NEARBY_PROMPT;
    public static final SharedPreferenceKey HAS_ACCEPTED_SNAPCASH_TOS;
    public static final SharedPreferenceKey HAS_ACCEPTED_SQUARE_TOS;
    public static final SharedPreferenceKey HAS_ACCEPTED_TOU_9_14;
    public static final SharedPreferenceKey HAS_GIVEN_ACCESS_TO_CONTACTS;
    public static final SharedPreferenceKey HAS_LONG_PRESSED_TO_SAVE_OR_UNSAVE_CHAT;
    public static final SharedPreferenceKey HAS_POSTED_STORY_FROM_SEND_TO;
    public static final SharedPreferenceKey HAS_PROFILE_IMAGES;
    public static final SharedPreferenceKey HAS_SEEN_CAPTION_ONBOARDING_MESSAGE;
    public static final SharedPreferenceKey HAS_SEEN_LENS_TOOLTIP;
    public static final SharedPreferenceKey HAS_SEEN_NEW_FRIEND_REQUEST_ONBOARDING_MESSAGE;
    public static final SharedPreferenceKey HAS_SEEN_POST_STORY_DIALOG;
    public static final SharedPreferenceKey HAS_SEEN_PROFILE_PAGE_ONBOARDING_MESSAGE;
    public static final SharedPreferenceKey HAS_SEEN_PROFILE_PICTURES_ONBOARDING_MESSAGE;
    public static final SharedPreferenceKey HAS_SEEN_PROMPT_FOR_LOCATION_IN_CAMERA;
    public static final SharedPreferenceKey HAS_SEEN_SWIPE_FILTERS_ONBOARDING_MESSAGE;
    public static final SharedPreferenceKey HAS_SEEN_TAKE_SNAP_ONBOARDING_MESSAGE;
    public static final SharedPreferenceKey HAS_SEEN_TROPHY_CASE_TOOLTIP;
    public static final SharedPreferenceKey HAS_SHARED_DISCOVER_SNAP;
    public static final SharedPreferenceKey HAS_VERIFIED_CAPTCHA;
    public static final SharedPreferenceKey IDENTITY_FRIENDS_SYNC_TOKEN;
    public static final SharedPreferenceKey IDENTITY_IS_ADD_NEARBY_ENABLED;
    public static final SharedPreferenceKey IDENTITY_IS_EMAIL_VERIFIED;
    public static final SharedPreferenceKey IDENTITY_IS_HIGH_LOCATION_REQUIRED;
    public static final SharedPreferenceKey IDENTITY_IS_PHONE_PASSWORD_CONFIRMED;
    public static final SharedPreferenceKey IDENTITY_IS_TWO_FA_ENABLED;
    public static final SharedPreferenceKey IDENTITY_LAST_CHECKED_TROPHY_CASE_TIMESTAMP;
    public static final SharedPreferenceKey IDENTITY_PENDING_EMAIL;
    public static final SharedPreferenceKey IDENTITY_RED_GEAR_IS_ON;
    public static final SharedPreferenceKey IDENTITY_SUGGESTED_FRIEND_FETCH_THRESHOLD;
    public static final SharedPreferenceKey IDENTITY_SUGGESTED_FRIEND_FIND_TIMESTAMPS;
    public static final SharedPreferenceKey INFORMATION_SAVED_IN_DATABASE;
    public static final SharedPreferenceKey IS_ACCOUNT_LOCKED;
    public static final SharedPreferenceKey IS_DEVICE_WHITELISTED_FOR_LENSES_ON_BACKEND;
    public static final SharedPreferenceKey IS_LOGGED_IN;
    public static final SharedPreferenceKey IS_REGISTERING;
    public static final SharedPreferenceKey IS_SEARCHABLE_BY_PHONE_NUMBER;
    public static final SharedPreferenceKey IS_TEMPERATURE_SCALE_IMPERIAL;
    public static final SharedPreferenceKey IS_VERIFIED_USER;
    public static final SharedPreferenceKey KEYBOARD_HEIGHT_LANDSCAPE;
    public static final SharedPreferenceKey KEYBOARD_HEIGHT_PORTRAIT;
    public static final SharedPreferenceKey LAST_ADDRESS_BOOK_UPDATED_TIMESTAMP;
    public static final SharedPreferenceKey LAST_CARD_DIGITS;
    public static final SharedPreferenceKey LAST_EXTERNAL_IMAGE_TAKEN_TIMESTAMP;
    public static final SharedPreferenceKey LAST_FIND_FRIENDS_WITHOUT_CACHE_TIMESTAMP;
    public static final SharedPreferenceKey LAST_IDENTITY_ACTION_TIMESTAMP;
    public static final SharedPreferenceKey LAST_OWNED_LENSES_CHECK_TIME;
    public static final SharedPreferenceKey LAST_PING_RESULTS;
    public static final SharedPreferenceKey LAST_PROFILE_IMAGES_CACHED_TIMESTAMP;
    public static final SharedPreferenceKey LAST_PROFILE_IMAGES_DELETED_TIMESTAMP;
    public static final SharedPreferenceKey LAST_PROFILE_IMAGES_TAKEN_TIMESTAMP;
    public static final SharedPreferenceKey LAST_PROMO_LENSES_CHECK_TIME;
    public static final SharedPreferenceKey LAST_SCANNED_LIBRARY_IMAGE;
    public static final SharedPreferenceKey LAST_SCHEDULED_LENSES_CHECK_TIME;
    public static final SharedPreferenceKey LAST_SCHEDULED_LENSES_COUNT;
    public static final SharedPreferenceKey LAST_SEEN_ADDED_ME_TIMESTAMP;
    public static final SharedPreferenceKey LAST_SEEN_NEW_FRIENDS_TOOLTIP_TIMESTAMP;
    public static final SharedPreferenceKey LAST_START_TRACKING_ANR;
    public static final SharedPreferenceKey LAST_SUCCESSFUL_LOGIN_USERNAME;
    public static final SharedPreferenceKey LED_ENABLED;
    public static final SharedPreferenceKey LEGACY_SOUND_VIBRATION_ENABLED;
    public static final SharedPreferenceKey LENSES_IAPS_LIST;
    public static final SharedPreferenceKey LENSES_NATIVE_FLAG;
    public static final SharedPreferenceKey LENSES_NATIVE_FLAG_LAST_SELECTED_LENS;
    public static final SharedPreferenceKey LENSES_NATIVE_FLAG_LENSES_GL_RENDERER;
    public static final SharedPreferenceKey LENSES_STORE_AVAILABLE;
    public static final SharedPreferenceKey LOGGEDIN_IN_AFTER_CHAT_V1_5;
    public static final SharedPreferenceKey MOBILE_VERIFICATION_KEY;
    public static final SharedPreferenceKey MOBILE_VERIFICATION_SEND_TO_NUMBER;
    public static final SharedPreferenceKey NEEDS_CAPTCHA_VERIFICATION;
    public static final SharedPreferenceKey NEEDS_PHONE_VERIFICATION;
    public static final SharedPreferenceKey NOTIFICATIONS_ENABLED;
    public static final SharedPreferenceKey NUM_ADDED_FRIENDS_IN_REGISTRATION;
    public static final SharedPreferenceKey NUM_SNAPS_RECEIVED;
    public static final SharedPreferenceKey NUM_SNAPS_SENT;
    public static final SharedPreferenceKey PAY_REPLAY_SNAPS_ENABLED;
    public static final SharedPreferenceKey PENDING_CLEAR_CHAT_CONVERSATION_ID;
    public static final SharedPreferenceKey PHONE_NUMBER;
    public static final SharedPreferenceKey PHONE_VERIFICATION_SMS_FORMAT;
    public static final SharedPreferenceKey PROFILE_IMAGES_SHARING_COUNT;
    public static final SharedPreferenceKey PROFILE_IMAGES_UPLOADED;
    public static final SharedPreferenceKey PROMO_LENSES_DISPLAY_COUNT;
    public static final SharedPreferenceKey PROXY_ENDPOINT;
    public static final SharedPreferenceKey QUICKSNAP_ONBOARDING_REPEATS;
    public static final SharedPreferenceKey RAW_THUMBNAIL_UPLOAD_ENABLED;
    public static final SharedPreferenceKey RECENTLY_USED_EMOJI;
    public static final SharedPreferenceKey REPLAY_SETTING;
    public static final SharedPreferenceKey RESPONSE_CHECKSUM_CONVERSATIONS;
    public static final SharedPreferenceKey RESPONSE_CHECKSUM_FRIENDS;
    public static final SharedPreferenceKey RESPONSE_CHECKSUM_STORIES;
    public static final SharedPreferenceKey RESPONSE_CHECKSUM_STUDY_SETTINGS;
    public static final SharedPreferenceKey RESPONSE_CHECKSUM_UPDATES;
    public static final SharedPreferenceKey SAVE_STORY_TO_GALLERY_ENABLED;
    public static final SharedPreferenceKey SCORE;
    public static final SharedPreferenceKey SECURITY_CODE_SETTING;
    public static final SharedPreferenceKey SEEN_SWIPE_DOWN_TUTORIAL;
    public static final SharedPreferenceKey SERVER_CONFIGS;
    public static final SharedPreferenceKey SHOULD_BOUNCE_TEAM_SNAPCHAT_CELL_IN_FEED;
    public static final SharedPreferenceKey SHOULD_SHOW_CLEAR_CONVERSATION_DIALOG;
    public static final SharedPreferenceKey SHOULD_SHOW_SUGGESTION_PROMPT;
    public static final SharedPreferenceKey SNAP_CAPTURE_ROTATION;
    public static final SharedPreferenceKey SNAP_PREFERRED_TIME;
    public static final SharedPreferenceKey SNAP_PRIVACY_SETTING;
    public static final SharedPreferenceKey SNAP_TAG_IMAGE_ID;
    public static final SharedPreferenceKey SOUND_ENABLED;
    public static final SharedPreferenceKey SPEED_USE_MPH;
    public static final SharedPreferenceKey SPONSORED_SLUG_DEFAULT_STYLE;
    public static final SharedPreferenceKey STORY_EXPLORER_TOOLTIP_DISPLAY_COUNT;
    public static final SharedPreferenceKey STORY_PRIVACY_SETTING;
    public static final SharedPreferenceKey STUDY_SETTINGS;
    public static final SharedPreferenceKey SUGGESTION_PROMPT_BUTTON_TEXT;
    public static final SharedPreferenceKey SUGGESTION_PROMPT_DURATION_IN_MILLIS;
    public static final SharedPreferenceKey SUGGESTION_PROMPT_LAST_DISMISSED_TIMESTAMP;
    public static final SharedPreferenceKey SUGGESTION_PROMPT_LINK;
    public static final SharedPreferenceKey SUGGESTION_PROMPT_TEXT;
    public static final SharedPreferenceKey SWIPED_DOWN_IN_VIEWER;
    public static final SharedPreferenceKey SYNC_ON_FEED_OPEN;
    public static final SharedPreferenceKey TAPPED_TO_SKIP;
    public static final SharedPreferenceKey TAP_TO_SKIP_COUNT;
    public static final SharedPreferenceKey TIMES_DISPLAYED_HERE_TOOLTIP;
    public static final SharedPreferenceKey TRANSCODING_HISTORY;
    public static final SharedPreferenceKey TRANSCODING_IN_PROGRESS_FLAG;
    public static final SharedPreferenceKey TRANSCODING_IS_IMAGE_TRANSCODING_ENABLED;
    public static final SharedPreferenceKey TRANSCODING_OVERWRITE_STATE;
    public static final SharedPreferenceKey TRANSCODING_PROFILE_LEVEL_CONFIGURATION_STATUS;
    public static final SharedPreferenceKey TRANSCODING_RESET_TIMESTAMP;
    public static final SharedPreferenceKey TRANSCODING_STATE;
    public static final SharedPreferenceKey TRAVEL_MODE_ENABLED;
    public static final SharedPreferenceKey UNIQUE_DEVICE_ID;
    public static final SharedPreferenceKey URL_ROUTING_MAP;
    public static final SharedPreferenceKey USERNAME;
    public static final SharedPreferenceKey USER_ID;
    public static final SharedPreferenceKey USER_JSON;
    public static final SharedPreferenceKey USER_TARGETING;
    public static final SharedPreferenceKey USE_ADDLIVE_PRESENCE;
    public static final SharedPreferenceKey VIBRATION_ENABLED;
    public static final SharedPreferenceKey VIDEO_CHAT_ONBOARDING_REPEATS;
    public static final SharedPreferenceKey VIDEO_ENCODING_RESOLUTIONS;
    public static final SharedPreferenceKey VIDEO_FILTERS;
    public static final SharedPreferenceKey WAKE_SCREEN_ENABLED;
    private SharedPreferenceGroup a;
    private String b;
    private boolean c;

    private SharedPreferenceKey(String s, int i, SharedPreferenceGroup sharedpreferencegroup, String s1, boolean flag)
    {
        super(s, i);
        a = sharedpreferencegroup;
        b = s1;
        c = flag;
    }

    private SharedPreferenceKey(String s, int i, String s1, boolean flag)
    {
        this(s, i, SharedPreferenceGroup.DEFAULT_GROUP, s1, flag);
    }

    public static SharedPreferenceKey valueOf(String s)
    {
        return (SharedPreferenceKey)Enum.valueOf(com/snapchat/android/database/SharedPreferenceKey, s);
    }

    public static SharedPreferenceKey[] values()
    {
        return (SharedPreferenceKey[])$VALUES.clone();
    }

    public final boolean exists()
    {
        return getSharedPreferences().contains(b);
    }

    public final boolean getBoolean()
    {
        return getBoolean(false);
    }

    public final boolean getBoolean(boolean flag)
    {
        return getSharedPreferences().getBoolean(b, flag);
    }

    public final SharedPreferenceGroup getGroup()
    {
        return a;
    }

    public final int getInt()
    {
        return getInt(0);
    }

    public final int getInt(int i)
    {
        return getSharedPreferences().getInt(b, i);
    }

    public final String getKey()
    {
        return b;
    }

    public final long getLong()
    {
        return getLong(0L);
    }

    public final long getLong(long l)
    {
        return getSharedPreferences().getLong(b, l);
    }

    public final SharedPreferences getSharedPreferences()
    {
        return a.getSharedPreferences();
    }

    public final String getString()
    {
        return getString(null);
    }

    public final String getString(String s)
    {
        return getSharedPreferences().getString(b, s);
    }

    public final Set getStringSet()
    {
        return getStringSet(null);
    }

    public final Set getStringSet(Set set)
    {
        return getSharedPreferences().getStringSet(b, set);
    }

    public final void putBoolean(boolean flag)
    {
        getSharedPreferences().edit().putBoolean(b, flag).apply();
    }

    public final void putInt(int i)
    {
        getSharedPreferences().edit().putInt(b, i).apply();
    }

    public final void putLong(long l)
    {
        getSharedPreferences().edit().putLong(b, l).apply();
    }

    public final void putString(String s)
    {
        getSharedPreferences().edit().putString(b, s).apply();
    }

    public final void putStringSet(Set set)
    {
        getSharedPreferences().edit().putStringSet(b, set).apply();
    }

    public final void remove()
    {
        getSharedPreferences().edit().remove(b).apply();
    }

    public final boolean shouldPersistOnLogout()
    {
        return c;
    }

    static 
    {
        int i = 0;
        LAST_SUCCESSFUL_LOGIN_USERNAME = new SharedPreferenceKey("LAST_SUCCESSFUL_LOGIN_USERNAME", 0, "lastSuccessfulLoginUsername", true);
        QUICKSNAP_ONBOARDING_REPEATS = new SharedPreferenceKey("QUICKSNAP_ONBOARDING_REPEATS", 1, "quickSnapOnboardingRepeats", true);
        INFORMATION_SAVED_IN_DATABASE = new SharedPreferenceKey("INFORMATION_SAVED_IN_DATABASE", 2, "informationSavedInDatabase", false);
        USERNAME = new SharedPreferenceKey("USERNAME", 3, "username", false);
        USER_ID = new SharedPreferenceKey("USER_ID", 4, "user_id", false);
        DISPLAY_NAME = new SharedPreferenceKey("DISPLAY_NAME", 5, "display_name", false);
        EMAIL = new SharedPreferenceKey("EMAIL", 6, "email", false);
        PHONE_NUMBER = new SharedPreferenceKey("PHONE_NUMBER", 7, "phone_number", false);
        BIRTHDAY_THIS_YEAR_IN_MILLIS = new SharedPreferenceKey("BIRTHDAY_THIS_YEAR_IN_MILLIS", 8, "birthday_this_year_in_millis", false);
        AUTH_TOKEN = new SharedPreferenceKey("AUTH_TOKEN", 9, "auth_token", false);
        NUM_SNAPS_RECEIVED = new SharedPreferenceKey("NUM_SNAPS_RECEIVED", 10, "num_snaps_received", false);
        NUM_SNAPS_SENT = new SharedPreferenceKey("NUM_SNAPS_SENT", 11, "num_snaps_sent", false);
        SCORE = new SharedPreferenceKey("SCORE", 12, "score", false);
        GCM_REGISTRATION_ID = new SharedPreferenceKey("GCM_REGISTRATION_ID", 13, "gcm_registration_id", false);
        IS_LOGGED_IN = new SharedPreferenceKey("IS_LOGGED_IN", 14, "is_logged_in", false);
        MOBILE_VERIFICATION_KEY = new SharedPreferenceKey("MOBILE_VERIFICATION_KEY", 15, "mobile_verification_key", false);
        MOBILE_VERIFICATION_SEND_TO_NUMBER = new SharedPreferenceKey("MOBILE_VERIFICATION_SEND_TO_NUMBER", 16, "mobile_verification_send_to_number", false);
        SNAP_PRIVACY_SETTING = new SharedPreferenceKey("SNAP_PRIVACY_SETTING", 17, "snap_privacy_setting", false);
        STORY_PRIVACY_SETTING = new SharedPreferenceKey("STORY_PRIVACY_SETTING", 18, "story_privacy_setting", false);
        LAST_SEEN_ADDED_ME_TIMESTAMP = new SharedPreferenceKey("LAST_SEEN_ADDED_ME_TIMESTAMP", 19, "last_seen_added_me_timestamp", false);
        LAST_SEEN_NEW_FRIENDS_TOOLTIP_TIMESTAMP = new SharedPreferenceKey("LAST_SEEN_NEW_FRIENDS_TOOLTIP_TIMESTAMP", 20, "last_seen_new_friends_tooltip_timestamp", false);
        APP_VERSION_CODE = new SharedPreferenceKey("APP_VERSION_CODE", 21, "app_version_code", true);
        IS_SEARCHABLE_BY_PHONE_NUMBER = new SharedPreferenceKey("IS_SEARCHABLE_BY_PHONE_NUMBER", 22, "is_searchable_by_phone_number", false);
        HAS_GIVEN_ACCESS_TO_CONTACTS = new SharedPreferenceKey("HAS_GIVEN_ACCESS_TO_CONTACTS", 23, "has_given_access_to_contacts", true);
        VIDEO_CHAT_ONBOARDING_REPEATS = new SharedPreferenceKey("VIDEO_CHAT_ONBOARDING_REPEATS", 24, "videoChatOnboardingRepeats", true);
        ALLOWED_GPS = new SharedPreferenceKey("ALLOWED_GPS", 25, "allowedGps", false);
        SYNC_ON_FEED_OPEN = new SharedPreferenceKey("SYNC_ON_FEED_OPEN", 26, "sync_on_feed_open", false);
        STUDY_SETTINGS = new SharedPreferenceKey("STUDY_SETTINGS", 27, "study_settings", false);
        SERVER_CONFIGS = new SharedPreferenceKey("SERVER_CONFIGS", 28, "server_configs", false);
        ANDROID_DISPLAY_NAME = new SharedPreferenceKey("ANDROID_DISPLAY_NAME", 29, "android_display_name", false);
        IS_VERIFIED_USER = new SharedPreferenceKey("IS_VERIFIED_USER", 30, "is_verified_user", false);
        TAP_TO_SKIP_COUNT = new SharedPreferenceKey("TAP_TO_SKIP_COUNT", 31, "tap_that_count", true);
        TAPPED_TO_SKIP = new SharedPreferenceKey("TAPPED_TO_SKIP", 32, "tapped_to_skip", false);
        SEEN_SWIPE_DOWN_TUTORIAL = new SharedPreferenceKey("SEEN_SWIPE_DOWN_TUTORIAL", 33, "seen_swipe_down_tutorial", true);
        SWIPED_DOWN_IN_VIEWER = new SharedPreferenceKey("SWIPED_DOWN_IN_VIEWER", 34, "swiped_down_in_viewer", true);
        IS_REGISTERING = new SharedPreferenceKey("IS_REGISTERING", 35, "is_registering", false);
        NEEDS_PHONE_VERIFICATION = new SharedPreferenceKey("NEEDS_PHONE_VERIFICATION", 36, "needs_phone_verification", false);
        NEEDS_CAPTCHA_VERIFICATION = new SharedPreferenceKey("NEEDS_CAPTCHA_VERIFICATION", 37, "needs_captcha_verification", false);
        HAS_VERIFIED_CAPTCHA = new SharedPreferenceKey("HAS_VERIFIED_CAPTCHA", 38, "has_verified_captcha", false);
        FIND_FRIENDS_ENABLED_FOR_CAPTCHA = new SharedPreferenceKey("FIND_FRIENDS_ENABLED_FOR_CAPTCHA", 39, "find_friends_enabled_for_captcha", false);
        USER_JSON = new SharedPreferenceKey("USER_JSON", 40, "user_json", false);
        RESPONSE_CHECKSUM_FRIENDS = new SharedPreferenceKey("RESPONSE_CHECKSUM_FRIENDS", 41, "checksum_friends", false);
        RESPONSE_CHECKSUM_UPDATES = new SharedPreferenceKey("RESPONSE_CHECKSUM_UPDATES", 42, "checksum_updates", false);
        RESPONSE_CHECKSUM_CONVERSATIONS = new SharedPreferenceKey("RESPONSE_CHECKSUM_CONVERSATIONS", 43, "checksum_conversations", false);
        RESPONSE_CHECKSUM_STORIES = new SharedPreferenceKey("RESPONSE_CHECKSUM_STORIES", 44, "checksums_stories", false);
        RESPONSE_CHECKSUM_STUDY_SETTINGS = new SharedPreferenceKey("RESPONSE_CHECKSUM_STUDY_SETTINGS", 45, "checksums_study_settings", false);
        SHOULD_BOUNCE_TEAM_SNAPCHAT_CELL_IN_FEED = new SharedPreferenceKey("SHOULD_BOUNCE_TEAM_SNAPCHAT_CELL_IN_FEED", 46, "should_bounce_team_snapchat_cell_in_feed", false);
        SHOULD_SHOW_CLEAR_CONVERSATION_DIALOG = new SharedPreferenceKey("SHOULD_SHOW_CLEAR_CONVERSATION_DIALOG", 47, "should_show_clear_conversation_dialog", false);
        HAS_SEEN_TAKE_SNAP_ONBOARDING_MESSAGE = new SharedPreferenceKey("HAS_SEEN_TAKE_SNAP_ONBOARDING_MESSAGE", 48, "has_seen_snap_onboarding_message", false);
        HAS_SEEN_CAPTION_ONBOARDING_MESSAGE = new SharedPreferenceKey("HAS_SEEN_CAPTION_ONBOARDING_MESSAGE", 49, "has_seen_caption_onboarding_message", false);
        HAS_SEEN_SWIPE_FILTERS_ONBOARDING_MESSAGE = new SharedPreferenceKey("HAS_SEEN_SWIPE_FILTERS_ONBOARDING_MESSAGE", 50, "has_seen_swipe_filters_onboarding_message", false);
        HAS_POSTED_STORY_FROM_SEND_TO = new SharedPreferenceKey("HAS_POSTED_STORY_FROM_SEND_TO", 51, "has_posted_story_from_send_to", false);
        HAS_SEEN_POST_STORY_DIALOG = new SharedPreferenceKey("HAS_SEEN_POST_STORY_DIALOG", 52, "has_seen_post_story_dialog", false);
        HAS_SEEN_PROMPT_FOR_LOCATION_IN_CAMERA = new SharedPreferenceKey("HAS_SEEN_PROMPT_FOR_LOCATION_IN_CAMERA", 53, "has_seen_prompt_for_location_in_camera", false);
        STORY_EXPLORER_TOOLTIP_DISPLAY_COUNT = new SharedPreferenceKey("STORY_EXPLORER_TOOLTIP_DISPLAY_COUNT", 54, "story_explorer_tooltip_display_count", true);
        LAST_PING_RESULTS = new SharedPreferenceKey("LAST_PING_RESULTS", 55, "last_ping_results", true);
        PROXY_ENDPOINT = new SharedPreferenceKey("PROXY_ENDPOINT", 56, "proxy_endpoint", true);
        ENDPOINT_SET = new SharedPreferenceKey("ENDPOINT_SET", 57, "endpoint_set", true);
        FILTERS_ENABLED = new SharedPreferenceKey("FILTERS_ENABLED", 58, "smart_filters_setting", false);
        REPLAY_SETTING = new SharedPreferenceKey("REPLAY_SETTING", 59, "replay_setting", false);
        FRONT_FACING_FLASH_SETTING = new SharedPreferenceKey("FRONT_FACING_FLASH_SETTING", 60, "front_facing_flash_setting", false);
        TRAVEL_MODE_ENABLED = new SharedPreferenceKey("TRAVEL_MODE_ENABLED", 61, "travel_mode_enabled", false);
        CLIENT_PROMPT_UUID = new SharedPreferenceKey("CLIENT_PROMPT_UUID", 62, "client_prompt_uuid", false);
        LAST_ADDRESS_BOOK_UPDATED_TIMESTAMP = new SharedPreferenceKey("LAST_ADDRESS_BOOK_UPDATED_TIMESTAMP", 63, "last_address_book_updated_timestamp", false);
        USER_TARGETING = new SharedPreferenceKey("USER_TARGETING", 64, "user_targeting", false);
        AD_INDUSTRIES = new SharedPreferenceKey("AD_INDUSTRIES", 65, "ad_industries", false);
        LAST_EXTERNAL_IMAGE_TAKEN_TIMESTAMP = new SharedPreferenceKey("LAST_EXTERNAL_IMAGE_TAKEN_TIMESTAMP", 66, "last_external_image_taken_timestamp", false);
        KEYBOARD_HEIGHT_PORTRAIT = new SharedPreferenceKey("KEYBOARD_HEIGHT_PORTRAIT", 67, "caption_view_keyboard_height_portrait", true);
        KEYBOARD_HEIGHT_LANDSCAPE = new SharedPreferenceKey("KEYBOARD_HEIGHT_LANDSCAPE", 68, "caption_view_keyboard_height_landscape", true);
        IS_TEMPERATURE_SCALE_IMPERIAL = new SharedPreferenceKey("IS_TEMPERATURE_SCALE_IMPERIAL", 69, "isTemperatureScaleImperial", true);
        SPEED_USE_MPH = new SharedPreferenceKey("SPEED_USE_MPH", 70, "speedUseMph", true);
        CONVERSATIONS_ITER_TOKEN = new SharedPreferenceKey("CONVERSATIONS_ITER_TOKEN", 71, "conversationsIterToken", false);
        PENDING_CLEAR_CHAT_CONVERSATION_ID = new SharedPreferenceKey("PENDING_CLEAR_CHAT_CONVERSATION_ID", 72, "pendingClearChatConversationId", false);
        TIMES_DISPLAYED_HERE_TOOLTIP = new SharedPreferenceKey("TIMES_DISPLAYED_HERE_TOOLTIP", 73, (new StringBuilder("timesDisplayedHereTooltip_")).append((new SimpleDateFormat("MM-yyyy")).format(new Date())).toString(), true);
        USE_ADDLIVE_PRESENCE = new SharedPreferenceKey("USE_ADDLIVE_PRESENCE", 74, "useAddlivePresence", true);
        LOGGEDIN_IN_AFTER_CHAT_V1_5 = new SharedPreferenceKey("LOGGEDIN_IN_AFTER_CHAT_V1_5", 75, "loggedInAfterChatV1_5", true);
        HAS_LONG_PRESSED_TO_SAVE_OR_UNSAVE_CHAT = new SharedPreferenceKey("HAS_LONG_PRESSED_TO_SAVE_OR_UNSAVE_CHAT", 76, "hasLongPressedToSaveOrUnsaveChat", true);
        CHAT_SESSIONS_AFTER_CHAT1_5 = new SharedPreferenceKey("CHAT_SESSIONS_AFTER_CHAT1_5", 77, "chatSessionsAfterChat1_5", true);
        SNAP_PREFERRED_TIME = new SharedPreferenceKey("SNAP_PREFERRED_TIME", 78, "snapchatTimerPreference", false);
        SNAP_CAPTURE_ROTATION = new SharedPreferenceKey("SNAP_CAPTURE_ROTATION", 79, "captureRotation", false);
        DEVELOPER_OPTIONS_UPGRADE_PROMPT_ENABLED = new SharedPreferenceKey("DEVELOPER_OPTIONS_UPGRADE_PROMPT_ENABLED", 80, "developerOptionsUpgradePromptEnabled", true);
        DEVELOPER_OPTIONS_FAKE_FRIENDMOJI_ENABLED = new SharedPreferenceKey("DEVELOPER_OPTIONS_FAKE_FRIENDMOJI_ENABLED", 81, "developerOptionsFakeFriendmojiEnabled", true);
        DEVELOPER_OPTIONS_TAP_TO_VIEW = new SharedPreferenceKey("DEVELOPER_OPTIONS_TAP_TO_VIEW", 82, "developerOptionsTapToView", true);
        DEVELOPER_OPTIONS_HORIZONTAL_SCROLL = new SharedPreferenceKey("DEVELOPER_OPTIONS_HORIZONTAL_SCROLL", 83, "developerOptionsHorizontalScroll", true);
        DEVELOPER_OPTIONS_ADD_FRIENDS_FROM_SCREENSHOT_ENABLED = new SharedPreferenceKey("DEVELOPER_OPTIONS_ADD_FRIENDS_FROM_SCREENSHOT_ENABLED", 84, "developerOptionsAddFriendsFromScreenshotEnabled", true);
        DEVELOPER_OPTIONS_SNI_ENABLED = new SharedPreferenceKey("DEVELOPER_OPTIONS_SNI_ENABLED", 85, "developerOptionsSniEnabled", true);
        DEVELOPER_OPTIONS_CUSTOM_ENDPOINT = new SharedPreferenceKey("DEVELOPER_OPTIONS_CUSTOM_ENDPOINT", 86, "developerOptionsCustomEndpoint", true);
        DEVELOPER_OPTIONS_DISCOVER_CUSTOM_ENDPOINT = new SharedPreferenceKey("DEVELOPER_OPTIONS_DISCOVER_CUSTOM_ENDPOINT", 87, "developerOptionsDiscoverCustomEndpoint", true);
        DEVELOPER_OPTIONS_SQUARE_SANDBOX = new SharedPreferenceKey("DEVELOPER_OPTIONS_SQUARE_SANDBOX", 88, "developerOptionsSquareSandbox", true);
        DEVELOPER_OPTIONS_RELEASE_DELAY_TIMER = new SharedPreferenceKey("DEVELOPER_OPTIONS_RELEASE_DELAY_TIMER", 89, "developerOptionsReleaseDelayTimer", true);
        DEVELOPER_OPTIONS_SHOULD_SHOW_DEVICE_TOKEN_TOASTS = new SharedPreferenceKey("DEVELOPER_OPTIONS_SHOULD_SHOW_DEVICE_TOKEN_TOASTS", 90, "developerOptionsShouldShowDeviceTokenToasts", true);
        DEVELOPER_OPTIONS_SHOULD_DISABLE_PINNING = new SharedPreferenceKey("DEVELOPER_OPTIONS_SHOULD_DISABLE_PINNING", 91, "developerOptionsShouldDisablePinning", true);
        DEVELOPER_OPTIONS_NUM_STORIES_PER_THUMBNAIL = new SharedPreferenceKey("DEVELOPER_OPTIONS_NUM_STORIES_PER_THUMBNAIL", 92, "developerOptionsNumStoriesPerThumbnail", true);
        DEVELOPER_OPTIONS_SHOW_DIAGNOSTIC_OVERLAY = new SharedPreferenceKey("DEVELOPER_OPTIONS_SHOW_DIAGNOSTIC_OVERLAY", 93, "developerOptionsShowDiagnosticOverlay", true);
        DEVELOPER_OPTIONS_SHOW_PROFILE_PICTURES = new SharedPreferenceKey("DEVELOPER_OPTIONS_SHOW_PROFILE_PICTURES", 94, "developerOptionsShowProfilePictures", true);
        DEVELOPER_OPTIONS_HTTP_METRICS_ENABLED = new SharedPreferenceKey("DEVELOPER_OPTIONS_HTTP_METRICS_ENABLED", 95, "developerOptionsHttpMetricsEnabled", true);
        DEVELOPER_OPTIONS_ENABLE_TERMS_OF_USE = new SharedPreferenceKey("DEVELOPER_OPTIONS_ENABLE_TERMS_OF_USE", 96, "developerOptionsEnableTermsOfUse", true);
        DEVELOPER_OPTIONS_SHOW_TERMS_OF_USE = new SharedPreferenceKey("DEVELOPER_OPTIONS_SHOW_TERMS_OF_USE", 97, "developerOptionsShowTermsOfUse", true);
        DEVELOPER_OPTIONS_SHOULD_IGNORE_LOOKSERY_WHITELIST = new SharedPreferenceKey("DEVELOPER_OPTIONS_SHOULD_IGNORE_LOOKSERY_WHITELIST", 98, "developerOptionsShouldIgnoreLookseryWhitelist", true);
        DEVELOPER_OPTIONS_SHOULD_SHOW_FPS_OVERLAY = new SharedPreferenceKey("DEVELOPER_OPTIONS_SHOULD_SHOW_FPS_OVERLAY", 99, "developerOptionsShouldShowFpsOverlay", true);
        DEVELOPER_OPTIONS_SHOULD_FAKE_CELLULAR_CONNECTION = new SharedPreferenceKey("DEVELOPER_OPTIONS_SHOULD_FAKE_CELLULAR_CONNECTION", 100, "developerOptionsShouldFakeCellularConnection", true);
        DEVELOPER_OPTIONS_PHONE_VERIFICATION_EXPERIMENT = new SharedPreferenceKey("DEVELOPER_OPTIONS_PHONE_VERIFICATION_EXPERIMENT", 101, "developerOptionsPhoneVerificationExperiment", true);
        DEVELOPER_OPTIONS_MINI_PROFILE_ENABLED = new SharedPreferenceKey("DEVELOPER_OPTIONS_MINI_PROFILE_ENABLED", 102, "developerOptionsMiniProfile", true);
        DEVELOPER_OPTIONS_FAKE_DISPLAY_NAME_ON_SEARCH_FRIEND_ENABLED = new SharedPreferenceKey("DEVELOPER_OPTIONS_FAKE_DISPLAY_NAME_ON_SEARCH_FRIEND_ENABLED", 103, "developerOptionsFakeDisplaynameOnSearchFriendEnabled", true);
        DEVELOPER_OPTIONS_ADD_CONTACTS_FOOTER_ENABLED = new SharedPreferenceKey("DEVELOPER_OPTIONS_ADD_CONTACTS_FOOTER_ENABLED", 104, "developerOptionAddContactsFooter", true);
        LAST_START_TRACKING_ANR = new SharedPreferenceKey("LAST_START_TRACKING_ANR", 105, "lastTrackingAnr", true);
        NOTIFICATIONS_ENABLED = new SharedPreferenceKey("NOTIFICATIONS_ENABLED", 106, "notificationsEnabled", true);
        LEGACY_SOUND_VIBRATION_ENABLED = new SharedPreferenceKey("LEGACY_SOUND_VIBRATION_ENABLED", 107, "notificationSoundVibration", true);
        VIBRATION_ENABLED = new SharedPreferenceKey("VIBRATION_ENABLED", 108, "notificationVibration", true);
        SOUND_ENABLED = new SharedPreferenceKey("SOUND_ENABLED", 109, "notificationSound", true);
        LED_ENABLED = new SharedPreferenceKey("LED_ENABLED", 110, "notificationLed", true);
        WAKE_SCREEN_ENABLED = new SharedPreferenceKey("WAKE_SCREEN_ENABLED", 111, "notificationWakeScreen", true);
        CASH_SERVICE_ACTIVE = new SharedPreferenceKey("CASH_SERVICE_ACTIVE", 112, "cash_service_active", false);
        CASH_PROVIDER_NAME = new SharedPreferenceKey("CASH_PROVIDER_NAME", 113, "cash_provider_name", false);
        CASH_CUSTOMER_ID = new SharedPreferenceKey("CASH_CUSTOMER_ID", 114, "cash_customer_id", false);
        CASH_CUSTOMER_ALLOWED = new SharedPreferenceKey("CASH_CUSTOMER_ALLOWED", 115, "cash_customer_allowed", false);
        CASH_CARD_LINKED = new SharedPreferenceKey("CASH_CARD_LINKED", 116, "cash_card_linked", false);
        CASH_CARD_SUFFIX = new SharedPreferenceKey("CASH_CARD_SUFFIX", 117, "cash_card_suffix", false);
        CASH_CARD_BRAND = new SharedPreferenceKey("CASH_CARD_BRAND", 118, "cash_card_brand", false);
        CASH_HAS_TRANSACTIONS = new SharedPreferenceKey("CASH_HAS_TRANSACTIONS", 119, "cash_has_transactions", false);
        CASH_OUTDATED_PROFILE = new SharedPreferenceKey("CASH_OUTDATED_PROFILE", 120, "cash_outdated_profile", false);
        CASH_SEND_CONFIRMATION = new SharedPreferenceKey("CASH_SEND_CONFIRMATION", 121, "cash_send_confirmation", false);
        CASH_SWIPE_SEND_CONFIRMATION = new SharedPreferenceKey("CASH_SWIPE_SEND_CONFIRMATION", 122, "cash_swipe_send_confirmation", false);
        SECURITY_CODE_SETTING = new SharedPreferenceKey("SECURITY_CODE_SETTING", 123, "security_code_setting", false);
        IS_ACCOUNT_LOCKED = new SharedPreferenceKey("IS_ACCOUNT_LOCKED", 124, "isAccountLocked", false);
        HAS_ACCEPTED_SQUARE_TOS = new SharedPreferenceKey("HAS_ACCEPTED_SQUARE_TOS", 125, "square_tos_accepted", false);
        HAS_ACCEPTED_SNAPCASH_TOS = new SharedPreferenceKey("HAS_ACCEPTED_SNAPCASH_TOS", 126, "snapcash_tos_accepted", false);
        LAST_CARD_DIGITS = new SharedPreferenceKey("LAST_CARD_DIGITS", 127, "last_card_digits", false);
        CASH_TOOLTIP_DISPLAY_COUNT = new SharedPreferenceKey("CASH_TOOLTIP_DISPLAY_COUNT", 128, "cash_tooltip_display_count", true);
        RECENTLY_USED_EMOJI = new SharedPreferenceKey("RECENTLY_USED_EMOJI", 129, "recently_used_emoji", false);
        TRANSCODING_OVERWRITE_STATE = new SharedPreferenceKey("TRANSCODING_OVERWRITE_STATE", 130, "transcoding_overwrite_state", true);
        TRANSCODING_HISTORY = new SharedPreferenceKey("TRANSCODING_HISTORY", 131, "transcodingHistory", true);
        TRANSCODING_STATE = new SharedPreferenceKey("TRANSCODING_STATE", 132, "transcodingState", true);
        TRANSCODING_RESET_TIMESTAMP = new SharedPreferenceKey("TRANSCODING_RESET_TIMESTAMP", 133, "transcoding_reset_timestamp", true);
        TRANSCODING_IN_PROGRESS_FLAG = new SharedPreferenceKey("TRANSCODING_IN_PROGRESS_FLAG", 134, "transcoding_in_progress", false);
        TRANSCODING_PROFILE_LEVEL_CONFIGURATION_STATUS = new SharedPreferenceKey("TRANSCODING_PROFILE_LEVEL_CONFIGURATION_STATUS", 135, "transcoder_profile_level_configuration_status", false);
        TRANSCODING_IS_IMAGE_TRANSCODING_ENABLED = new SharedPreferenceKey("TRANSCODING_IS_IMAGE_TRANSCODING_ENABLED", 136, "is_image_transcoding_enabled", false);
        VIDEO_FILTERS = new SharedPreferenceKey("VIDEO_FILTERS", 137, "video_filters", false);
        VIDEO_ENCODING_RESOLUTIONS = new SharedPreferenceKey("VIDEO_ENCODING_RESOLUTIONS", 138, "video_encoding_resolutions", true);
        DEMOGRAPHICS_TRACKING_SENT_FLAG = new SharedPreferenceKey("DEMOGRAPHICS_TRACKING_SENT_FLAG", 139, "demographics_tracking_sent_flag", false);
        DISABLED_SAVE_STORY_TO_GALLERY_CONFIRMATION = new SharedPreferenceKey("DISABLED_SAVE_STORY_TO_GALLERY_CONFIRMATION", 140, "disabled_save_story_to_gallery_confirmation", false);
        SAVE_STORY_TO_GALLERY_ENABLED = new SharedPreferenceKey("SAVE_STORY_TO_GALLERY_ENABLED", 141, "save_story_to_gallery_enabled", false);
        RAW_THUMBNAIL_UPLOAD_ENABLED = new SharedPreferenceKey("RAW_THUMBNAIL_UPLOAD_ENABLED", 142, "raw_thumbnail_upload_enabled", false);
        DEVICE_HARDWARE_INFO_V1 = new SharedPreferenceKey("DEVICE_HARDWARE_INFO_V1", 143, "device_hardware_info_v1", true);
        CURRENT_EDITION_IDS = new SharedPreferenceKey("CURRENT_EDITION_IDS", 144, "current_edition_ids", false);
        DISCOVER_TIME_LAST_SEEN = new SharedPreferenceKey("DISCOVER_TIME_LAST_SEEN", 145, "discover_time_last_seen", false);
        DISCOVER_SEEN_ONBOARDING = new SharedPreferenceKey("DISCOVER_SEEN_ONBOARDING", 146, "discover_seen_onboarding", false);
        HAS_SHARED_DISCOVER_SNAP = new SharedPreferenceKey("HAS_SHARED_DISCOVER_SNAP", 147, "has_shared_discover_snap", false);
        DISCOVER_RESOURCE_PARAM_NAME = new SharedPreferenceKey("DISCOVER_RESOURCE_PARAM_NAME", 148, "discover_resource_param_name", true);
        DISCOVER_RESOURCE_PARAM_VALUE = new SharedPreferenceKey("DISCOVER_RESOURCE_PARAM_VALUE", 149, "discover_resource_param_value", true);
        CHANNEL_LIST_TIMESTAMP = new SharedPreferenceKey("CHANNEL_LIST_TIMESTAMP", 150, "last_channel_list_generation_ts", true);
        LAST_PROFILE_IMAGES_TAKEN_TIMESTAMP = new SharedPreferenceKey("LAST_PROFILE_IMAGES_TAKEN_TIMESTAMP", 151, SharedPreferenceGroup.IDENTITY_GROUP, "last_profile_images_taken_timestamp", false);
        LAST_PROFILE_IMAGES_DELETED_TIMESTAMP = new SharedPreferenceKey("LAST_PROFILE_IMAGES_DELETED_TIMESTAMP", 152, SharedPreferenceGroup.IDENTITY_GROUP, "last_profile_images_deleted_timestamp", false);
        LAST_PROFILE_IMAGES_CACHED_TIMESTAMP = new SharedPreferenceKey("LAST_PROFILE_IMAGES_CACHED_TIMESTAMP", 153, SharedPreferenceGroup.IDENTITY_GROUP, "last_profile_images_cached_timestamp", false);
        PROFILE_IMAGES_UPLOADED = new SharedPreferenceKey("PROFILE_IMAGES_UPLOADED", 154, SharedPreferenceGroup.IDENTITY_GROUP, "profile_images_uploaded", false);
        HAS_PROFILE_IMAGES = new SharedPreferenceKey("HAS_PROFILE_IMAGES", 155, SharedPreferenceGroup.IDENTITY_GROUP, "has_profile_images", false);
        PROFILE_IMAGES_SHARING_COUNT = new SharedPreferenceKey("PROFILE_IMAGES_SHARING_COUNT", 156, SharedPreferenceGroup.IDENTITY_GROUP, "profile_images_sharing_count", false);
        HAS_SEEN_PROFILE_PICTURES_ONBOARDING_MESSAGE = new SharedPreferenceKey("HAS_SEEN_PROFILE_PICTURES_ONBOARDING_MESSAGE", 157, SharedPreferenceGroup.IDENTITY_GROUP, "has_seen_profile_pictures_onboarding_message", false);
        HAS_ACCEPTED_TOU_9_14 = new SharedPreferenceKey("HAS_ACCEPTED_TOU_9_14", 158, SharedPreferenceGroup.IDENTITY_GROUP, "accepted_tou_9_14", false);
        HAS_SEEN_PROFILE_PAGE_ONBOARDING_MESSAGE = new SharedPreferenceKey("HAS_SEEN_PROFILE_PAGE_ONBOARDING_MESSAGE", 159, SharedPreferenceGroup.IDENTITY_GROUP, "has_seen_profile_page_onboarding_message", false);
        HAS_SEEN_NEW_FRIEND_REQUEST_ONBOARDING_MESSAGE = new SharedPreferenceKey("HAS_SEEN_NEW_FRIEND_REQUEST_ONBOARDING_MESSAGE", 160, SharedPreferenceGroup.IDENTITY_GROUP, "has_seen_new_friend_request_onboarding_message", false);
        HAS_ACCEPTED_ADD_NEARBY_PROMPT = new SharedPreferenceKey("HAS_ACCEPTED_ADD_NEARBY_PROMPT", 161, SharedPreferenceGroup.IDENTITY_GROUP, "has_accepted_add_nearby_prompt", false);
        SNAP_TAG_IMAGE_ID = new SharedPreferenceKey("SNAP_TAG_IMAGE_ID", 162, SharedPreferenceGroup.IDENTITY_GROUP, "snap_tag_image", false);
        LAST_IDENTITY_ACTION_TIMESTAMP = new SharedPreferenceKey("LAST_IDENTITY_ACTION_TIMESTAMP", 163, SharedPreferenceGroup.IDENTITY_GROUP, "last_identity_action_timestamp", false);
        IDENTITY_RED_GEAR_IS_ON = new SharedPreferenceKey("IDENTITY_RED_GEAR_IS_ON", 164, SharedPreferenceGroup.IDENTITY_GROUP, "identity_red_gear_is_on", false);
        IDENTITY_IS_EMAIL_VERIFIED = new SharedPreferenceKey("IDENTITY_IS_EMAIL_VERIFIED", 165, SharedPreferenceGroup.IDENTITY_GROUP, "identity_is_email_verified", false);
        IDENTITY_IS_PHONE_PASSWORD_CONFIRMED = new SharedPreferenceKey("IDENTITY_IS_PHONE_PASSWORD_CONFIRMED", 166, SharedPreferenceGroup.IDENTITY_GROUP, "identity_is_phone_password_confirmed", false);
        IDENTITY_PENDING_EMAIL = new SharedPreferenceKey("IDENTITY_PENDING_EMAIL", 167, SharedPreferenceGroup.IDENTITY_GROUP, "identity_pending_email", false);
        IDENTITY_IS_TWO_FA_ENABLED = new SharedPreferenceKey("IDENTITY_IS_TWO_FA_ENABLED", 168, SharedPreferenceGroup.IDENTITY_GROUP, "is_two_fa_enabled", false);
        IDENTITY_IS_ADD_NEARBY_ENABLED = new SharedPreferenceKey("IDENTITY_IS_ADD_NEARBY_ENABLED", 169, SharedPreferenceGroup.IDENTITY_GROUP, "is_add_nearby_enabled", true);
        IDENTITY_IS_HIGH_LOCATION_REQUIRED = new SharedPreferenceKey("IDENTITY_IS_HIGH_LOCATION_REQUIRED", 170, SharedPreferenceGroup.IDENTITY_GROUP, "is_high_accuracy_required_for_nearby", false);
        IDENTITY_SUGGESTED_FRIEND_FETCH_THRESHOLD = new SharedPreferenceKey("IDENTITY_SUGGESTED_FRIEND_FETCH_THRESHOLD", 171, SharedPreferenceGroup.IDENTITY_GROUP, "suggested_friend_fetch_threshold", true);
        IDENTITY_SUGGESTED_FRIEND_FIND_TIMESTAMPS = new SharedPreferenceKey("IDENTITY_SUGGESTED_FRIEND_FIND_TIMESTAMPS", 172, SharedPreferenceGroup.IDENTITY_GROUP, "suggested_friend_find_timestamps", true);
        LAST_FIND_FRIENDS_WITHOUT_CACHE_TIMESTAMP = new SharedPreferenceKey("LAST_FIND_FRIENDS_WITHOUT_CACHE_TIMESTAMP", 173, SharedPreferenceGroup.IDENTITY_GROUP, "last_find_friend_without_cache", true);
        IDENTITY_LAST_CHECKED_TROPHY_CASE_TIMESTAMP = new SharedPreferenceKey("IDENTITY_LAST_CHECKED_TROPHY_CASE_TIMESTAMP", 174, SharedPreferenceGroup.IDENTITY_GROUP, "last_checked_trophycase_timestamp", true);
        IDENTITY_FRIENDS_SYNC_TOKEN = new SharedPreferenceKey("IDENTITY_FRIENDS_SYNC_TOKEN", 175, SharedPreferenceGroup.IDENTITY_GROUP, "friends_sync_token", false);
        SHOULD_SHOW_SUGGESTION_PROMPT = new SharedPreferenceKey("SHOULD_SHOW_SUGGESTION_PROMPT", 176, SharedPreferenceGroup.IDENTITY_GROUP, "should_show_suggestion_prompt", false);
        SUGGESTION_PROMPT_LINK = new SharedPreferenceKey("SUGGESTION_PROMPT_LINK", 177, SharedPreferenceGroup.IDENTITY_GROUP, "suggestion_prompt_link", false);
        SUGGESTION_PROMPT_TEXT = new SharedPreferenceKey("SUGGESTION_PROMPT_TEXT", 178, SharedPreferenceGroup.IDENTITY_GROUP, "suggestion_prompt_text", false);
        SUGGESTION_PROMPT_BUTTON_TEXT = new SharedPreferenceKey("SUGGESTION_PROMPT_BUTTON_TEXT", 179, SharedPreferenceGroup.IDENTITY_GROUP, "suggestion_prompt_button_text", false);
        SUGGESTION_PROMPT_LAST_DISMISSED_TIMESTAMP = new SharedPreferenceKey("SUGGESTION_PROMPT_LAST_DISMISSED_TIMESTAMP", 180, SharedPreferenceGroup.IDENTITY_GROUP, "suggestion_prompt_last_dismissed_timestamp", false);
        SUGGESTION_PROMPT_DURATION_IN_MILLIS = new SharedPreferenceKey("SUGGESTION_PROMPT_DURATION_IN_MILLIS", 181, SharedPreferenceGroup.IDENTITY_GROUP, "suggestion_prompt_duration_in_millis", false);
        PHONE_VERIFICATION_SMS_FORMAT = new SharedPreferenceKey("PHONE_VERIFICATION_SMS_FORMAT", 182, SharedPreferenceGroup.IDENTITY_GROUP, "phone_verification_sms_format", false);
        FINDFRIENDS_TIMESTAMPS = new SharedPreferenceKey("FINDFRIENDS_TIMESTAMPS", 183, SharedPreferenceGroup.IDENTITY_GROUP, "recent_findfriends_requests_timestamps", false);
        FIND_FRIENDS_TRIMMED = new SharedPreferenceKey("FIND_FRIENDS_TRIMMED", 184, SharedPreferenceGroup.IDENTITY_GROUP, "find_friends_trimmed", false);
        NUM_ADDED_FRIENDS_IN_REGISTRATION = new SharedPreferenceKey("NUM_ADDED_FRIENDS_IN_REGISTRATION", 185, SharedPreferenceGroup.IDENTITY_GROUP, "num_added_friends_in_registration", false);
        FIND_VERIFIED_USERS = new SharedPreferenceKey("FIND_VERIFIED_USERS", 186, "find_verified_users_by_search", true);
        URL_ROUTING_MAP = new SharedPreferenceKey("URL_ROUTING_MAP", 187, "url_routing_map", false);
        UNIQUE_DEVICE_ID = new SharedPreferenceKey("UNIQUE_DEVICE_ID", 188, "device_id", true);
        AUTO_LIBRARY_SCANNING_FIRST_LAUNCHED_ON = new SharedPreferenceKey("AUTO_LIBRARY_SCANNING_FIRST_LAUNCHED_ON", 189, "auto_library_scanning_first_launched_on", true);
        AUTO_LIBRARY_SCANNING_ENABLED = new SharedPreferenceKey("AUTO_LIBRARY_SCANNING_ENABLED", 190, "auto_library_scanning_enabled", false);
        AUTO_LIBRARY_SCANNING_SHOWN_FIRST_NOTIFICATION = new SharedPreferenceKey("AUTO_LIBRARY_SCANNING_SHOWN_FIRST_NOTIFICATION", 191, "auto_library_scanning_shown_first_notification", false);
        LAST_SCANNED_LIBRARY_IMAGE = new SharedPreferenceKey("LAST_SCANNED_LIBRARY_IMAGE", 192, "last_scanned_library_image_file", true);
        HAS_SEEN_TROPHY_CASE_TOOLTIP = new SharedPreferenceKey("HAS_SEEN_TROPHY_CASE_TOOLTIP", 193, "has_seen_trophy_case_tool_tip", true);
        PAY_REPLAY_SNAPS_ENABLED = new SharedPreferenceKey("PAY_REPLAY_SNAPS_ENABLED", 194, "pay_replay_snaps_enabled", false);
        SPONSORED_SLUG_DEFAULT_STYLE = new SharedPreferenceKey("SPONSORED_SLUG_DEFAULT_STYLE", 195, "sponsored_slug_default_style", true);
        HAS_SEEN_LENS_TOOLTIP = new SharedPreferenceKey("HAS_SEEN_LENS_TOOLTIP", 196, "has_seen_lens_tooltip", false);
        LAST_SCHEDULED_LENSES_CHECK_TIME = new SharedPreferenceKey("LAST_SCHEDULED_LENSES_CHECK_TIME", 197, "last_schedule_update", false);
        LAST_SCHEDULED_LENSES_COUNT = new SharedPreferenceKey("LAST_SCHEDULED_LENSES_COUNT", 198, "last_scheduled_lenses_count", false);
        LAST_PROMO_LENSES_CHECK_TIME = new SharedPreferenceKey("LAST_PROMO_LENSES_CHECK_TIME", 199, "last_promo_lenses_check_time", false);
        LAST_OWNED_LENSES_CHECK_TIME = new SharedPreferenceKey("LAST_OWNED_LENSES_CHECK_TIME", 200, "last_owned_lenses_check_time", false);
        PROMO_LENSES_DISPLAY_COUNT = new SharedPreferenceKey("PROMO_LENSES_DISPLAY_COUNT", 201, "promo_lenses_display_count", false);
        IS_DEVICE_WHITELISTED_FOR_LENSES_ON_BACKEND = new SharedPreferenceKey("IS_DEVICE_WHITELISTED_FOR_LENSES_ON_BACKEND", 202, "is_device_whitelisted_for_lenses_on_backend", true);
        LENSES_NATIVE_FLAG = new SharedPreferenceKey("LENSES_NATIVE_FLAG", 203, "lenses_native_flag", false);
        LENSES_NATIVE_FLAG_LAST_SELECTED_LENS = new SharedPreferenceKey("LENSES_NATIVE_FLAG_LAST_SELECTED_LENS", 204, "lenses_native_flag_last_selected_lens", false);
        LENSES_NATIVE_FLAG_LENSES_GL_RENDERER = new SharedPreferenceKey("LENSES_NATIVE_FLAG_LENSES_GL_RENDERER", 205, "lenses_native_flag_lenses_gl_renderer", false);
        LENSES_STORE_AVAILABLE = new SharedPreferenceKey("LENSES_STORE_AVAILABLE", 206, "lenses_store_available", false);
        LENSES_IAPS_LIST = new SharedPreferenceKey("LENSES_IAPS_LIST", 207, "lenses_iaps_list", false);
        APP_INSTALL_LOGGED = new SharedPreferenceKey("APP_INSTALL_LOGGED", 208, "app_install_logged", true);
        $VALUES = (new SharedPreferenceKey[] {
            LAST_SUCCESSFUL_LOGIN_USERNAME, QUICKSNAP_ONBOARDING_REPEATS, INFORMATION_SAVED_IN_DATABASE, USERNAME, USER_ID, DISPLAY_NAME, EMAIL, PHONE_NUMBER, BIRTHDAY_THIS_YEAR_IN_MILLIS, AUTH_TOKEN, 
            NUM_SNAPS_RECEIVED, NUM_SNAPS_SENT, SCORE, GCM_REGISTRATION_ID, IS_LOGGED_IN, MOBILE_VERIFICATION_KEY, MOBILE_VERIFICATION_SEND_TO_NUMBER, SNAP_PRIVACY_SETTING, STORY_PRIVACY_SETTING, LAST_SEEN_ADDED_ME_TIMESTAMP, 
            LAST_SEEN_NEW_FRIENDS_TOOLTIP_TIMESTAMP, APP_VERSION_CODE, IS_SEARCHABLE_BY_PHONE_NUMBER, HAS_GIVEN_ACCESS_TO_CONTACTS, VIDEO_CHAT_ONBOARDING_REPEATS, ALLOWED_GPS, SYNC_ON_FEED_OPEN, STUDY_SETTINGS, SERVER_CONFIGS, ANDROID_DISPLAY_NAME, 
            IS_VERIFIED_USER, TAP_TO_SKIP_COUNT, TAPPED_TO_SKIP, SEEN_SWIPE_DOWN_TUTORIAL, SWIPED_DOWN_IN_VIEWER, IS_REGISTERING, NEEDS_PHONE_VERIFICATION, NEEDS_CAPTCHA_VERIFICATION, HAS_VERIFIED_CAPTCHA, FIND_FRIENDS_ENABLED_FOR_CAPTCHA, 
            USER_JSON, RESPONSE_CHECKSUM_FRIENDS, RESPONSE_CHECKSUM_UPDATES, RESPONSE_CHECKSUM_CONVERSATIONS, RESPONSE_CHECKSUM_STORIES, RESPONSE_CHECKSUM_STUDY_SETTINGS, SHOULD_BOUNCE_TEAM_SNAPCHAT_CELL_IN_FEED, SHOULD_SHOW_CLEAR_CONVERSATION_DIALOG, HAS_SEEN_TAKE_SNAP_ONBOARDING_MESSAGE, HAS_SEEN_CAPTION_ONBOARDING_MESSAGE, 
            HAS_SEEN_SWIPE_FILTERS_ONBOARDING_MESSAGE, HAS_POSTED_STORY_FROM_SEND_TO, HAS_SEEN_POST_STORY_DIALOG, HAS_SEEN_PROMPT_FOR_LOCATION_IN_CAMERA, STORY_EXPLORER_TOOLTIP_DISPLAY_COUNT, LAST_PING_RESULTS, PROXY_ENDPOINT, ENDPOINT_SET, FILTERS_ENABLED, REPLAY_SETTING, 
            FRONT_FACING_FLASH_SETTING, TRAVEL_MODE_ENABLED, CLIENT_PROMPT_UUID, LAST_ADDRESS_BOOK_UPDATED_TIMESTAMP, USER_TARGETING, AD_INDUSTRIES, LAST_EXTERNAL_IMAGE_TAKEN_TIMESTAMP, KEYBOARD_HEIGHT_PORTRAIT, KEYBOARD_HEIGHT_LANDSCAPE, IS_TEMPERATURE_SCALE_IMPERIAL, 
            SPEED_USE_MPH, CONVERSATIONS_ITER_TOKEN, PENDING_CLEAR_CHAT_CONVERSATION_ID, TIMES_DISPLAYED_HERE_TOOLTIP, USE_ADDLIVE_PRESENCE, LOGGEDIN_IN_AFTER_CHAT_V1_5, HAS_LONG_PRESSED_TO_SAVE_OR_UNSAVE_CHAT, CHAT_SESSIONS_AFTER_CHAT1_5, SNAP_PREFERRED_TIME, SNAP_CAPTURE_ROTATION, 
            DEVELOPER_OPTIONS_UPGRADE_PROMPT_ENABLED, DEVELOPER_OPTIONS_FAKE_FRIENDMOJI_ENABLED, DEVELOPER_OPTIONS_TAP_TO_VIEW, DEVELOPER_OPTIONS_HORIZONTAL_SCROLL, DEVELOPER_OPTIONS_ADD_FRIENDS_FROM_SCREENSHOT_ENABLED, DEVELOPER_OPTIONS_SNI_ENABLED, DEVELOPER_OPTIONS_CUSTOM_ENDPOINT, DEVELOPER_OPTIONS_DISCOVER_CUSTOM_ENDPOINT, DEVELOPER_OPTIONS_SQUARE_SANDBOX, DEVELOPER_OPTIONS_RELEASE_DELAY_TIMER, 
            DEVELOPER_OPTIONS_SHOULD_SHOW_DEVICE_TOKEN_TOASTS, DEVELOPER_OPTIONS_SHOULD_DISABLE_PINNING, DEVELOPER_OPTIONS_NUM_STORIES_PER_THUMBNAIL, DEVELOPER_OPTIONS_SHOW_DIAGNOSTIC_OVERLAY, DEVELOPER_OPTIONS_SHOW_PROFILE_PICTURES, DEVELOPER_OPTIONS_HTTP_METRICS_ENABLED, DEVELOPER_OPTIONS_ENABLE_TERMS_OF_USE, DEVELOPER_OPTIONS_SHOW_TERMS_OF_USE, DEVELOPER_OPTIONS_SHOULD_IGNORE_LOOKSERY_WHITELIST, DEVELOPER_OPTIONS_SHOULD_SHOW_FPS_OVERLAY, 
            DEVELOPER_OPTIONS_SHOULD_FAKE_CELLULAR_CONNECTION, DEVELOPER_OPTIONS_PHONE_VERIFICATION_EXPERIMENT, DEVELOPER_OPTIONS_MINI_PROFILE_ENABLED, DEVELOPER_OPTIONS_FAKE_DISPLAY_NAME_ON_SEARCH_FRIEND_ENABLED, DEVELOPER_OPTIONS_ADD_CONTACTS_FOOTER_ENABLED, LAST_START_TRACKING_ANR, NOTIFICATIONS_ENABLED, LEGACY_SOUND_VIBRATION_ENABLED, VIBRATION_ENABLED, SOUND_ENABLED, 
            LED_ENABLED, WAKE_SCREEN_ENABLED, CASH_SERVICE_ACTIVE, CASH_PROVIDER_NAME, CASH_CUSTOMER_ID, CASH_CUSTOMER_ALLOWED, CASH_CARD_LINKED, CASH_CARD_SUFFIX, CASH_CARD_BRAND, CASH_HAS_TRANSACTIONS, 
            CASH_OUTDATED_PROFILE, CASH_SEND_CONFIRMATION, CASH_SWIPE_SEND_CONFIRMATION, SECURITY_CODE_SETTING, IS_ACCOUNT_LOCKED, HAS_ACCEPTED_SQUARE_TOS, HAS_ACCEPTED_SNAPCASH_TOS, LAST_CARD_DIGITS, CASH_TOOLTIP_DISPLAY_COUNT, RECENTLY_USED_EMOJI, 
            TRANSCODING_OVERWRITE_STATE, TRANSCODING_HISTORY, TRANSCODING_STATE, TRANSCODING_RESET_TIMESTAMP, TRANSCODING_IN_PROGRESS_FLAG, TRANSCODING_PROFILE_LEVEL_CONFIGURATION_STATUS, TRANSCODING_IS_IMAGE_TRANSCODING_ENABLED, VIDEO_FILTERS, VIDEO_ENCODING_RESOLUTIONS, DEMOGRAPHICS_TRACKING_SENT_FLAG, 
            DISABLED_SAVE_STORY_TO_GALLERY_CONFIRMATION, SAVE_STORY_TO_GALLERY_ENABLED, RAW_THUMBNAIL_UPLOAD_ENABLED, DEVICE_HARDWARE_INFO_V1, CURRENT_EDITION_IDS, DISCOVER_TIME_LAST_SEEN, DISCOVER_SEEN_ONBOARDING, HAS_SHARED_DISCOVER_SNAP, DISCOVER_RESOURCE_PARAM_NAME, DISCOVER_RESOURCE_PARAM_VALUE, 
            CHANNEL_LIST_TIMESTAMP, LAST_PROFILE_IMAGES_TAKEN_TIMESTAMP, LAST_PROFILE_IMAGES_DELETED_TIMESTAMP, LAST_PROFILE_IMAGES_CACHED_TIMESTAMP, PROFILE_IMAGES_UPLOADED, HAS_PROFILE_IMAGES, PROFILE_IMAGES_SHARING_COUNT, HAS_SEEN_PROFILE_PICTURES_ONBOARDING_MESSAGE, HAS_ACCEPTED_TOU_9_14, HAS_SEEN_PROFILE_PAGE_ONBOARDING_MESSAGE, 
            HAS_SEEN_NEW_FRIEND_REQUEST_ONBOARDING_MESSAGE, HAS_ACCEPTED_ADD_NEARBY_PROMPT, SNAP_TAG_IMAGE_ID, LAST_IDENTITY_ACTION_TIMESTAMP, IDENTITY_RED_GEAR_IS_ON, IDENTITY_IS_EMAIL_VERIFIED, IDENTITY_IS_PHONE_PASSWORD_CONFIRMED, IDENTITY_PENDING_EMAIL, IDENTITY_IS_TWO_FA_ENABLED, IDENTITY_IS_ADD_NEARBY_ENABLED, 
            IDENTITY_IS_HIGH_LOCATION_REQUIRED, IDENTITY_SUGGESTED_FRIEND_FETCH_THRESHOLD, IDENTITY_SUGGESTED_FRIEND_FIND_TIMESTAMPS, LAST_FIND_FRIENDS_WITHOUT_CACHE_TIMESTAMP, IDENTITY_LAST_CHECKED_TROPHY_CASE_TIMESTAMP, IDENTITY_FRIENDS_SYNC_TOKEN, SHOULD_SHOW_SUGGESTION_PROMPT, SUGGESTION_PROMPT_LINK, SUGGESTION_PROMPT_TEXT, SUGGESTION_PROMPT_BUTTON_TEXT, 
            SUGGESTION_PROMPT_LAST_DISMISSED_TIMESTAMP, SUGGESTION_PROMPT_DURATION_IN_MILLIS, PHONE_VERIFICATION_SMS_FORMAT, FINDFRIENDS_TIMESTAMPS, FIND_FRIENDS_TRIMMED, NUM_ADDED_FRIENDS_IN_REGISTRATION, FIND_VERIFIED_USERS, URL_ROUTING_MAP, UNIQUE_DEVICE_ID, AUTO_LIBRARY_SCANNING_FIRST_LAUNCHED_ON, 
            AUTO_LIBRARY_SCANNING_ENABLED, AUTO_LIBRARY_SCANNING_SHOWN_FIRST_NOTIFICATION, LAST_SCANNED_LIBRARY_IMAGE, HAS_SEEN_TROPHY_CASE_TOOLTIP, PAY_REPLAY_SNAPS_ENABLED, SPONSORED_SLUG_DEFAULT_STYLE, HAS_SEEN_LENS_TOOLTIP, LAST_SCHEDULED_LENSES_CHECK_TIME, LAST_SCHEDULED_LENSES_COUNT, LAST_PROMO_LENSES_CHECK_TIME, 
            LAST_OWNED_LENSES_CHECK_TIME, PROMO_LENSES_DISPLAY_COUNT, IS_DEVICE_WHITELISTED_FOR_LENSES_ON_BACKEND, LENSES_NATIVE_FLAG, LENSES_NATIVE_FLAG_LAST_SELECTED_LENS, LENSES_NATIVE_FLAG_LENSES_GL_RENDERER, LENSES_STORE_AVAILABLE, LENSES_IAPS_LIST, APP_INSTALL_LOGGED
        });
        HashMap hashmap = new HashMap();
        SharedPreferenceKey asharedpreferencekey[] = values();
        for (int j = asharedpreferencekey.length; i < j; i++)
        {
            SharedPreferenceKey sharedpreferencekey = asharedpreferencekey[i];
            SharedPreferenceGroup sharedpreferencegroup = sharedpreferencekey.getGroup();
            Set set = (Set)hashmap.get(sharedpreferencegroup);
            Object obj = set;
            if (set == null)
            {
                obj = new HashSet();
                hashmap.put(sharedpreferencegroup, obj);
            }
            ((Set) (obj)).add(sharedpreferencekey);
        }

        GROUP_TO_KEYS = eb.a(hashmap);
    }
}
