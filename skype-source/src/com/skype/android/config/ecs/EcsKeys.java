// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.config.ecs;

import com.skype.android.SkyLibSetup;
import com.skype.android.analytics.ExperimentEvent;
import com.skype.android.analytics.ExperimentTag;

// Referenced classes of package com.skype.android.config.ecs:
//            EcsKeyPolicy, EcsKeyLocation, EcsKey

public final class EcsKeys extends Enum
    implements EcsKeyPolicy
{

    private static final EcsKeys $VALUES[];
    public static final EcsKeys AD_ENABLED;
    public static final EcsKeys APS_SERVICE_URL;
    public static final EcsKeys ASYNC_FILE_SHARING_AUTO_DOWNLOAD_SIZE_LIMIT;
    public static final EcsKeys ASYNC_MEDIA_FILE_EXPIRATION_PERIOD;
    public static final EcsKeys ASYNC_MEDIA_FILE_ORIGINAL_SIZE_LIMIT;
    public static final EcsKeys ASYNC_MEDIA_VIDEO_EXPIRATION_PERIOD;
    public static final EcsKeys AUTO_BUDDY_SERVER_URL;
    public static final EcsKeys BADGE_NOTIFICATIONS_ENABLED;
    public static final EcsKeys CALL_EFFECTS;
    public static final EcsKeys CHANGE_UNREAD_MESSAGE_COLOR_RECENTS;
    public static final EcsKeys CLOUD_EMOTICONS;
    public static final EcsKeys DISABLE_MESSAGE_AREA_BEFORE_SENDING_ADD_REQUEST;
    public static final EcsKeys EAS_INGEST_ENABLED;
    public static final EcsKeys EAS_SYNC_TYPE;
    public static final EcsKeys ECS_EXPERIMENT_NAME;
    public static final EcsKeys ENABLE_AGENT_SUGGESTIONS;
    public static final EcsKeys ENABLE_HEARTMARKING;
    public static final EcsKeys ENABLE_MESSAGE_INDICATOR;
    public static final EcsKeys ENABLE_UNIFIED_PRESENCE;
    public static final EcsKeys ENVIRONMENT;
    public static final EcsKeys EXPERIMENT_CALENDAR_INTEGRATION_APP_CLIENT_OPTION;
    public static final EcsKeys EXPERIMENT_CALENDAR_INTEGRATION_GROUP;
    public static final EcsKeys EXPERIMENT_SIGNOUT_HIDDEN;
    public static final EcsKeys EXP_ADD_FRIENDS_FROM_CONTACT_LIST;
    public static final EcsKeys EXP_SPEX_MEDIA_PICKER_SEARCH_BUTTON_ENABLED;
    public static final EcsKeys EXP_SPEX_MOJI_FORWARD_BUTTON;
    public static final EcsKeys EXP_SPEX_MOJI_FORWARD_CONTEXT_MENU;
    public static final EcsKeys EXP_SPEX_MOJI_FORWARD_USER_GROUP;
    public static final EcsKeys INSTALL_OUTLOOK_URI;
    public static final EcsKeys IS_ASYNC_FILE_SHARING_ENABLED;
    public static final EcsKeys IS_ASYNC_VIDEO_MESSAGE_ENABLED;
    public static final EcsKeys IS_CALL_EFFECTS_ENABLED;
    public static final EcsKeys IS_FEEDBACK_UI_ENABLED;
    public static final EcsKeys IS_INVITE_FRIENDS_ENABLED;
    public static final EcsKeys IS_LOCAL_NODE_OFFLINE_ENABLED;
    public static final EcsKeys IS_LOCATION_SENDING_ENABLED;
    public static final EcsKeys IS_LOCATION_SHARING_ENABLED;
    public static final EcsKeys IS_MOJI_LONG_PRESS_TO_SEND_ENABLED;
    public static final EcsKeys IS_MOJI_SECTION_ENABLED;
    public static final EcsKeys IS_URL_PREVIEW_ENABLED;
    public static final EcsKeys IS_VIM_FAB_BUTTON_ENABLED;
    public static final EcsKeys IS_VIM_FILTERS_BADGE_ENABLED;
    public static final EcsKeys IS_VIM_ICON_VISIBLE;
    public static final EcsKeys IS_VIM_PROMO_ENABLED;
    public static final EcsKeys IS_VIM_REPLY_WITH_VIDEO_ENABLED;
    public static final EcsKeys IS_VIM_SAVE_TO_GALLERY_ENABLED;
    public static final EcsKeys IS_WEAR_REMOTE_CONTROL_ENABLED;
    public static final EcsKeys LOCAL_NODE_RECONNECT_BEFORE_TIMEOUT;
    public static final EcsKeys LOCAL_NODE_RECONNECT_TIME_SLICE;
    public static final EcsKeys LOCAL_NODE_TEMP_DISCONNECT_TIMEOUT;
    public static final EcsKeys MEASURE_LAYOUT_INSTRUMENTATION;
    public static final EcsKeys MEDIA_PHOTO_SHARING;
    public static final EcsKeys MOJI_TITLE_TEXT_EXPERIMENT_GROUPING_INT;
    public static final EcsKeys MSA_COBRAND_ID;
    public static final EcsKeys MSA_LOGIN_SCOPE;
    public static final EcsKeys MSNP_CONNECTION_INDICATOR_EN;
    public static final EcsKeys NOTIFICATION_ACTIONS;
    public static final EcsKeys OPEN_W_OFFICE_EXTENSIONS_EXCEL;
    public static final EcsKeys OPEN_W_OFFICE_EXTENSIONS_POWER_POINT;
    public static final EcsKeys OPEN_W_OFFICE_EXTENSIONS_WORD;
    public static final EcsKeys PHONE_VERIFICATION_CONNECTION_TIMEOUT;
    public static final EcsKeys PHONE_VERIFICATION_MAX_TIMEOUT_COUNT;
    public static final EcsKeys PHONE_VERIFICATION_NATIVE_TIMEOUT;
    public static final EcsKeys PHONE_VERIFICATION_NEXT_BUTTON;
    public static final EcsKeys PHONE_VERIFICATION_REQUIRED_CLOCK_SPEED;
    public static final EcsKeys PHONE_VERIFICATION_REQUIRED_PROCESSORS_COUNT;
    public static final EcsKeys PHONE_VERIFICATION_SKIP_BUTTON;
    public static final EcsKeys PHONE_VERIFICATION_SMS_TIMEOUT;
    public static final EcsKeys PHONE_VERIFICATION_URL;
    public static final EcsKeys PHONE_VERIFICATION_VERSION;
    public static final EcsKeys PICKER_CONTENT_UPDATE;
    public static final EcsKeys PROFILE_SERVICE_URL;
    public static final EcsKeys SEARCH_ACCOUNTS_TIMEOUT;
    public static final EcsKeys SHORT_CIRCUIT;
    public static final EcsKeys SHOW_EXTERNAL_CONTACTS;
    public static final EcsKeys SHOW_UNREAD_MESSAGE_COUNT_ORANGE_PILL;
    public static final EcsKeys SKYPE_LOGIN_URL;
    public static final EcsKeys SMART_HISTORY_SYNC;
    public static final EcsKeys SUPPORT_ACCOUNT_DISAMBIGUATION;
    public static final EcsKeys SUPPORT_LIGHTWEIGHT_MSA;
    public static final EcsKeys SUPPORT_MOJI;
    public static final EcsKeys SUPPORT_VARIABLE_DEFAULT_AVATAR_BACKGROUND_COLORS;
    public static final EcsKeys TELEMETRY_PROVIDERS;
    public static final EcsKeys TELEMETRY_PROVIDER_ARIA;
    public static final EcsKeys TELEMETRY_PROVIDER_FLURRY;
    public static final EcsKeys TRANSLATOR_ENABLED;
    public static final EcsKeys TYPE;
    public static final EcsKeys USE_MSA_FOR_NEW_ACCOUNT;
    public static final EcsKeys USE_MSA_SDK_FOR_LOGIN;
    public static final EcsKeys VERSION;
    public static final EcsKeys VIDEO_MESSAGE_FILTERS;
    public static final EcsKeys VimButtonIcon;
    private EcsKey ecsKey;

    private EcsKeys(String s, int i, String s1)
    {
        this(s, i, s1, false);
    }

    private EcsKeys(String s, int i, String s1, boolean flag)
    {
        this(s, i, s1, flag, null);
    }

    private EcsKeys(String s, int i, String s1, boolean flag, Object obj)
    {
        this(s, i, s1, flag, obj, EcsKeyLocation.SKYPE_ANDROID);
    }

    private EcsKeys(String s, int i, String s1, boolean flag, Object obj, EcsKeyLocation ecskeylocation)
    {
        super(s, i);
        ecsKey = new EcsKey(name(), s1, ecskeylocation, obj, flag);
    }

    public static EcsKeys valueOf(String s)
    {
        return (EcsKeys)Enum.valueOf(com/skype/android/config/ecs/EcsKeys, s);
    }

    public static EcsKeys[] values()
    {
        return (EcsKeys[])$VALUES.clone();
    }

    public final EcsKey getEcsKey()
    {
        return ecsKey;
    }

    static 
    {
        TYPE = new EcsKeys("TYPE", 0, "Type");
        VERSION = new EcsKeys("VERSION", 1, "Version");
        ENVIRONMENT = new EcsKeys("ENVIRONMENT", 2, "Environment");
        SHORT_CIRCUIT = new EcsKeys("SHORT_CIRCUIT", 3, "ShortCircuit", true);
        PHONE_VERIFICATION_URL = new EcsKeys("PHONE_VERIFICATION_URL", 4, "PhoneVerificationUrl");
        PHONE_VERIFICATION_VERSION = new EcsKeys("PHONE_VERIFICATION_VERSION", 5, "PhoneVerificationVersion");
        PHONE_VERIFICATION_NATIVE_TIMEOUT = new EcsKeys("PHONE_VERIFICATION_NATIVE_TIMEOUT", 6, "PhoneVerificationNativeTimeout");
        PHONE_VERIFICATION_SMS_TIMEOUT = new EcsKeys("PHONE_VERIFICATION_SMS_TIMEOUT", 7, "PhoneVerificationSmsTimeout");
        PHONE_VERIFICATION_MAX_TIMEOUT_COUNT = new EcsKeys("PHONE_VERIFICATION_MAX_TIMEOUT_COUNT", 8, "PhoneVerificationMaxTimeout");
        PHONE_VERIFICATION_CONNECTION_TIMEOUT = new EcsKeys("PHONE_VERIFICATION_CONNECTION_TIMEOUT", 9, "PhoneVerificationConnectionTimeout");
        PHONE_VERIFICATION_REQUIRED_CLOCK_SPEED = new EcsKeys("PHONE_VERIFICATION_REQUIRED_CLOCK_SPEED", 10, "PhoneVerificationRequiredClockSpeed");
        PHONE_VERIFICATION_REQUIRED_PROCESSORS_COUNT = new EcsKeys("PHONE_VERIFICATION_REQUIRED_PROCESSORS_COUNT", 11, "PhoneVerificationRequiredProcessorsCount");
        SEARCH_ACCOUNTS_TIMEOUT = new EcsKeys("SEARCH_ACCOUNTS_TIMEOUT", 12, "SearchAccountsTimeout", false, Integer.valueOf(5000));
        MEDIA_PHOTO_SHARING = new EcsKeys("MEDIA_PHOTO_SHARING", 13, "MediaPhotoSharing", true);
        SMART_HISTORY_SYNC = new EcsKeys("SMART_HISTORY_SYNC", 14, "SmartHistorySync", true, Boolean.valueOf(true));
        PHONE_VERIFICATION_SKIP_BUTTON = new EcsKeys("PHONE_VERIFICATION_SKIP_BUTTON", 15, "PhoneVerificationSkipButton");
        PHONE_VERIFICATION_NEXT_BUTTON = new EcsKeys("PHONE_VERIFICATION_NEXT_BUTTON", 16, "PhoneVerificationNextButton");
        CLOUD_EMOTICONS = new EcsKeys("CLOUD_EMOTICONS", 17, "CloudEmoticons", true, Boolean.valueOf(true));
        USE_MSA_FOR_NEW_ACCOUNT = new EcsKeys("USE_MSA_FOR_NEW_ACCOUNT", 18, "UseMsaForNewAccount", true, Boolean.valueOf(false));
        IS_FEEDBACK_UI_ENABLED = new EcsKeys("IS_FEEDBACK_UI_ENABLED", 19, "IsFeedbackUiEnabled", true, Boolean.valueOf(false));
        IS_URL_PREVIEW_ENABLED = new EcsKeys("IS_URL_PREVIEW_ENABLED", 20, "IsUrlPreviewEnabled", true, Boolean.valueOf(false));
        USE_MSA_SDK_FOR_LOGIN = new EcsKeys("USE_MSA_SDK_FOR_LOGIN", 21, "UseMsaSdkForLogin", true, Boolean.valueOf(false));
        SUPPORT_ACCOUNT_DISAMBIGUATION = new EcsKeys("SUPPORT_ACCOUNT_DISAMBIGUATION", 22, "SupportAccountDisambiguation", true, Boolean.valueOf(false));
        SUPPORT_MOJI = new EcsKeys("SUPPORT_MOJI", 23, "SupportFliks", true, Boolean.valueOf(false));
        EXP_SPEX_MOJI_FORWARD_USER_GROUP = new EcsKeys("EXP_SPEX_MOJI_FORWARD_USER_GROUP", 24, "exp_spex_moji_forward_user_group", false, ExperimentTag.a.name(), EcsKeyLocation.SPEX_FEATURES);
        EXP_SPEX_MOJI_FORWARD_CONTEXT_MENU = new EcsKeys("EXP_SPEX_MOJI_FORWARD_CONTEXT_MENU", 25, "exp_spex_moji_forward_context_menu", true, Boolean.valueOf(false), EcsKeyLocation.SPEX_FEATURES);
        EXP_SPEX_MOJI_FORWARD_BUTTON = new EcsKeys("EXP_SPEX_MOJI_FORWARD_BUTTON", 26, "exp_spex_moji_forward_forward_button", true, Boolean.valueOf(false), EcsKeyLocation.SPEX_FEATURES);
        EXP_SPEX_MEDIA_PICKER_SEARCH_BUTTON_ENABLED = new EcsKeys("EXP_SPEX_MEDIA_PICKER_SEARCH_BUTTON_ENABLED", 27, "exp_spex_media_picker_search_button", true, Boolean.valueOf(false), EcsKeyLocation.SPEX_FEATURES);
        IS_MOJI_LONG_PRESS_TO_SEND_ENABLED = new EcsKeys("IS_MOJI_LONG_PRESS_TO_SEND_ENABLED", 28, "SendMojiOnLongPressInRoster", true, Boolean.valueOf(false), EcsKeyLocation.SPEX_FEATURES);
        MOJI_TITLE_TEXT_EXPERIMENT_GROUPING_INT = new EcsKeys("MOJI_TITLE_TEXT_EXPERIMENT_GROUPING_INT", 29, "ShowMojiTitleInRosterGroupingInt", false, Integer.valueOf(0), EcsKeyLocation.SPEX_FEATURES);
        IS_MOJI_SECTION_ENABLED = new EcsKeys("IS_MOJI_SECTION_ENABLED", 30, "IsMojiSectionEnabled", true, Boolean.valueOf(false), EcsKeyLocation.SPEX_FEATURES);
        PICKER_CONTENT_UPDATE = new EcsKeys("PICKER_CONTENT_UPDATE", 31, "PickerContentUpdate", true, Boolean.valueOf(false), EcsKeyLocation.SPEX_FEATURES);
        SUPPORT_LIGHTWEIGHT_MSA = new EcsKeys("SUPPORT_LIGHTWEIGHT_MSA", 32, "LWEnabled", false, Integer.valueOf(0), EcsKeyLocation.SKYPE_ANDROID);
        MSA_LOGIN_SCOPE = new EcsKeys("MSA_LOGIN_SCOPE", 33, "MSALoginScope", false, "service::skype.com::MBI_SSL", EcsKeyLocation.SKYPE_ANDROID);
        EXP_ADD_FRIENDS_FROM_CONTACT_LIST = new EcsKeys("EXP_ADD_FRIENDS_FROM_CONTACT_LIST", 34, ExperimentEvent.a.name(), false, ExperimentTag.a.name());
        MEASURE_LAYOUT_INSTRUMENTATION = new EcsKeys("MEASURE_LAYOUT_INSTRUMENTATION", 35, "MeasureLayoutInstrumentation", true, Boolean.valueOf(false));
        IS_LOCATION_SHARING_ENABLED = new EcsKeys("IS_LOCATION_SHARING_ENABLED", 36, "IsLocationSharingEnabled", true, Boolean.valueOf(false));
        IS_LOCATION_SENDING_ENABLED = new EcsKeys("IS_LOCATION_SENDING_ENABLED", 37, "IsLocationSendingEnabled", true, Boolean.valueOf(false));
        IS_LOCAL_NODE_OFFLINE_ENABLED = new EcsKeys("IS_LOCAL_NODE_OFFLINE_ENABLED", 38, "IsLocalNodeOfflineEnabled", true, Boolean.valueOf(true));
        IS_WEAR_REMOTE_CONTROL_ENABLED = new EcsKeys("IS_WEAR_REMOTE_CONTROL_ENABLED", 39, "IsWearRemoteControlEnabled", true, Boolean.valueOf(true));
        LOCAL_NODE_TEMP_DISCONNECT_TIMEOUT = new EcsKeys("LOCAL_NODE_TEMP_DISCONNECT_TIMEOUT", 40, "LocalNodeTempDisconnectTimeout", false, Integer.valueOf(SkyLibSetup.a));
        LOCAL_NODE_RECONNECT_BEFORE_TIMEOUT = new EcsKeys("LOCAL_NODE_RECONNECT_BEFORE_TIMEOUT", 41, "LocalNodeReconnectBeforeTimeout", false, Integer.valueOf(SkyLibSetup.b));
        LOCAL_NODE_RECONNECT_TIME_SLICE = new EcsKeys("LOCAL_NODE_RECONNECT_TIME_SLICE", 42, "LocalNodeReconnectTimeSlice", false, Integer.valueOf(SkyLibSetup.c));
        IS_VIM_ICON_VISIBLE = new EcsKeys("IS_VIM_ICON_VISIBLE", 43, "IsViMIconVisibleInChatPage", true, Boolean.valueOf(false));
        IS_VIM_REPLY_WITH_VIDEO_ENABLED = new EcsKeys("IS_VIM_REPLY_WITH_VIDEO_ENABLED", 44, "IsViMReplyWithVideo", true, Boolean.valueOf(false));
        ASYNC_MEDIA_FILE_EXPIRATION_PERIOD = new EcsKeys("ASYNC_MEDIA_FILE_EXPIRATION_PERIOD", 45, "media_params/File.1/expiration_period", false, Integer.valueOf(30), EcsKeyLocation.ASYNC_MEDIA_CLIENT_FEATURES);
        ASYNC_MEDIA_VIDEO_EXPIRATION_PERIOD = new EcsKeys("ASYNC_MEDIA_VIDEO_EXPIRATION_PERIOD", 46, "media_params/Video.1/expiration_period", false, Integer.valueOf(30), EcsKeyLocation.ASYNC_MEDIA_CLIENT_FEATURES);
        ASYNC_MEDIA_FILE_ORIGINAL_SIZE_LIMIT = new EcsKeys("ASYNC_MEDIA_FILE_ORIGINAL_SIZE_LIMIT", 47, "storage_limits/original/size", false, Integer.valueOf(0x6400000), EcsKeyLocation.ASYNC_MEDIA_CLIENT_FEATURES);
        IS_ASYNC_VIDEO_MESSAGE_ENABLED = new EcsKeys("IS_ASYNC_VIDEO_MESSAGE_ENABLED", 48, "IsAsyncVideoMessageEnabled", true, Boolean.valueOf(false), EcsKeyLocation.SKYPE_TMX_FEATURES);
        IS_ASYNC_FILE_SHARING_ENABLED = new EcsKeys("IS_ASYNC_FILE_SHARING_ENABLED", 49, "IsAsyncFileSharingEnabled", true, Boolean.valueOf(false), EcsKeyLocation.SKYPE_TMX_FEATURES);
        ASYNC_FILE_SHARING_AUTO_DOWNLOAD_SIZE_LIMIT = new EcsKeys("ASYNC_FILE_SHARING_AUTO_DOWNLOAD_SIZE_LIMIT", 50, "AsyncFileAutoDownloadSizeLimit", false, Integer.valueOf(0x100000), EcsKeyLocation.SKYPE_TMX_FEATURES);
        IS_VIM_FAB_BUTTON_ENABLED = new EcsKeys("IS_VIM_FAB_BUTTON_ENABLED", 51, "IsViMFabButtonEnabled", true, Boolean.valueOf(false));
        IS_VIM_PROMO_ENABLED = new EcsKeys("IS_VIM_PROMO_ENABLED", 52, "IsVimPromoEnabled", true, Boolean.valueOf(false));
        IS_VIM_SAVE_TO_GALLERY_ENABLED = new EcsKeys("IS_VIM_SAVE_TO_GALLERY_ENABLED", 53, "IsVimSaveToGalleryEnabled", true, Boolean.valueOf(false), EcsKeyLocation.SKYPE_TMX_FEATURES);
        TELEMETRY_PROVIDER_ARIA = new EcsKeys("TELEMETRY_PROVIDER_ARIA", 54, "TelemetryProviderAria", true, Boolean.valueOf(true));
        IS_VIM_FILTERS_BADGE_ENABLED = new EcsKeys("IS_VIM_FILTERS_BADGE_ENABLED", 55, "IsVimFiltersBadgeEnabled", true, Boolean.valueOf(false), EcsKeyLocation.SKYPE_TMX_FEATURES);
        TELEMETRY_PROVIDER_FLURRY = new EcsKeys("TELEMETRY_PROVIDER_FLURRY", 56, "TelemetryProviderFlurry", true, Boolean.valueOf(true));
        TELEMETRY_PROVIDERS = new EcsKeys("TELEMETRY_PROVIDERS", 57, "TelemetryProviders", false, null);
        VimButtonIcon = new EcsKeys("VimButtonIcon", 58, "VimButtonIcon", false, null);
        ECS_EXPERIMENT_NAME = new EcsKeys("ECS_EXPERIMENT_NAME", 59, "EcsExperimentName", false, null);
        MSA_COBRAND_ID = new EcsKeys("MSA_COBRAND_ID", 60, "MsaCobrandId", false, "90002");
        CHANGE_UNREAD_MESSAGE_COLOR_RECENTS = new EcsKeys("CHANGE_UNREAD_MESSAGE_COLOR_RECENTS", 61, "isRecentsUnreadMessageColorChangeEnabled", true, Boolean.valueOf(false));
        SHOW_UNREAD_MESSAGE_COUNT_ORANGE_PILL = new EcsKeys("SHOW_UNREAD_MESSAGE_COUNT_ORANGE_PILL", 62, "showUnreadMessageCountOrangePill", true, Boolean.valueOf(false));
        SUPPORT_VARIABLE_DEFAULT_AVATAR_BACKGROUND_COLORS = new EcsKeys("SUPPORT_VARIABLE_DEFAULT_AVATAR_BACKGROUND_COLORS", 63, "SupportVariableDefaultAvatarBackgroundColors", true, Boolean.valueOf(false));
        NOTIFICATION_ACTIONS = new EcsKeys("NOTIFICATION_ACTIONS", 64, "NotificationActions", true, Boolean.valueOf(false));
        DISABLE_MESSAGE_AREA_BEFORE_SENDING_ADD_REQUEST = new EcsKeys("DISABLE_MESSAGE_AREA_BEFORE_SENDING_ADD_REQUEST", 65, "DisableMessageAreaBeforeSendingAddRequest", true, Boolean.valueOf(true));
        IS_CALL_EFFECTS_ENABLED = new EcsKeys("IS_CALL_EFFECTS_ENABLED", 66, "AreCallEffects", true, Boolean.valueOf(false));
        CALL_EFFECTS = new EcsKeys("CALL_EFFECTS", 67, "EnabledCallEffects", false, null, EcsKeyLocation.SPEX_FEATURES);
        VIDEO_MESSAGE_FILTERS = new EcsKeys("VIDEO_MESSAGE_FILTERS", 68, "EnabledFilters", false, null, EcsKeyLocation.SKYPE_TMX_FEATURES);
        OPEN_W_OFFICE_EXTENSIONS_WORD = new EcsKeys("OPEN_W_OFFICE_EXTENSIONS_WORD", 69, "FileTransferWordExt", false, "docx,odt,docm", EcsKeyLocation.SKYPE_TMX_FEATURES);
        OPEN_W_OFFICE_EXTENSIONS_EXCEL = new EcsKeys("OPEN_W_OFFICE_EXTENSIONS_EXCEL", 70, "FileTransferExcelExt", false, "xlsx, xlsb,xlsm,ods", EcsKeyLocation.SKYPE_TMX_FEATURES);
        OPEN_W_OFFICE_EXTENSIONS_POWER_POINT = new EcsKeys("OPEN_W_OFFICE_EXTENSIONS_POWER_POINT", 71, "FileTransferPowerPointExt", false, "pptx,pptm,ppsx,ppsm,pps,odp", EcsKeyLocation.SKYPE_TMX_FEATURES);
        IS_INVITE_FRIENDS_ENABLED = new EcsKeys("IS_INVITE_FRIENDS_ENABLED", 72, "IsInviteFriendsEnabled", true, Boolean.valueOf(false));
        String s;
        if ("releaseQb".contains("beta"))
        {
            s = "https://df-pf.directory.live.com";
        } else
        {
            s = "https://pf.directory.live.com";
        }
        PROFILE_SERVICE_URL = new EcsKeys("PROFILE_SERVICE_URL", 73, "ProfileServiceUrl", false, s);
        TRANSLATOR_ENABLED = new EcsKeys("TRANSLATOR_ENABLED", 74, "TranslatorEnabled", true, Boolean.valueOf(false));
        SKYPE_LOGIN_URL = new EcsKeys("SKYPE_LOGIN_URL", 75, "LoginInAuthorizeUrl", false, "https://login.skype.com");
        if ("releaseQb".contains("beta"))
        {
            s = "https://df-people.directory.live.com";
        } else
        {
            s = "https://people.directory.live.com";
        }
        AUTO_BUDDY_SERVER_URL = new EcsKeys("AUTO_BUDDY_SERVER_URL", 76, "AutoBuddyServerUrl", false, s);
        AD_ENABLED = new EcsKeys("AD_ENABLED", 77, "AdEnabled", true, Boolean.valueOf(false));
        BADGE_NOTIFICATIONS_ENABLED = new EcsKeys("BADGE_NOTIFICATIONS_ENABLED", 78, "BadgeNotificationsEnabled", true, Boolean.valueOf(false));
        MSNP_CONNECTION_INDICATOR_EN = new EcsKeys("MSNP_CONNECTION_INDICATOR_EN", 79, "MsnpConnectionIndicator", true, Boolean.valueOf(false));
        ENABLE_UNIFIED_PRESENCE = new EcsKeys("ENABLE_UNIFIED_PRESENCE", 80, "isUnifiedPresenceEnabled", true, Boolean.valueOf(false));
        ENABLE_MESSAGE_INDICATOR = new EcsKeys("ENABLE_MESSAGE_INDICATOR", 81, "MessageStatusIndicatorEnabled", true, Boolean.valueOf(false));
        ENABLE_AGENT_SUGGESTIONS = new EcsKeys("ENABLE_AGENT_SUGGESTIONS", 82, "AgentSuggestionsEnabled", true, Boolean.valueOf(false));
        APS_SERVICE_URL = new EcsKeys("APS_SERVICE_URL", 83, "APSServiceUrl", false, "https://aps-dev-0-skype.cloudapp.net/v1/");
        ENABLE_HEARTMARKING = new EcsKeys("ENABLE_HEARTMARKING", 84, "isHeartMarkingEnabled", true, Boolean.valueOf(false));
        EXPERIMENT_CALENDAR_INTEGRATION_GROUP = new EcsKeys("EXPERIMENT_CALENDAR_INTEGRATION_GROUP", 85, ExperimentEvent.b.name(), false, ExperimentTag.a.name());
        EXPERIMENT_CALENDAR_INTEGRATION_APP_CLIENT_OPTION = new EcsKeys("EXPERIMENT_CALENDAR_INTEGRATION_APP_CLIENT_OPTION", 86, "exp_calendar_integration_app_client_option");
        EXPERIMENT_SIGNOUT_HIDDEN = new EcsKeys("EXPERIMENT_SIGNOUT_HIDDEN", 87, ExperimentEvent.e.name(), false, ExperimentTag.a.name());
        EAS_SYNC_TYPE = new EcsKeys("EAS_SYNC_TYPE", 88, "EasSyncType", false, Integer.valueOf(0));
        EAS_INGEST_ENABLED = new EcsKeys("EAS_INGEST_ENABLED", 89, "EasIngestEnabled", true, Boolean.valueOf(true));
        SHOW_EXTERNAL_CONTACTS = new EcsKeys("SHOW_EXTERNAL_CONTACTS", 90, "ShowExternalContacts", true, Boolean.valueOf(true));
        INSTALL_OUTLOOK_URI = new EcsKeys("INSTALL_OUTLOOK_URI", 91, "InstallOutlookUri");
        $VALUES = (new EcsKeys[] {
            TYPE, VERSION, ENVIRONMENT, SHORT_CIRCUIT, PHONE_VERIFICATION_URL, PHONE_VERIFICATION_VERSION, PHONE_VERIFICATION_NATIVE_TIMEOUT, PHONE_VERIFICATION_SMS_TIMEOUT, PHONE_VERIFICATION_MAX_TIMEOUT_COUNT, PHONE_VERIFICATION_CONNECTION_TIMEOUT, 
            PHONE_VERIFICATION_REQUIRED_CLOCK_SPEED, PHONE_VERIFICATION_REQUIRED_PROCESSORS_COUNT, SEARCH_ACCOUNTS_TIMEOUT, MEDIA_PHOTO_SHARING, SMART_HISTORY_SYNC, PHONE_VERIFICATION_SKIP_BUTTON, PHONE_VERIFICATION_NEXT_BUTTON, CLOUD_EMOTICONS, USE_MSA_FOR_NEW_ACCOUNT, IS_FEEDBACK_UI_ENABLED, 
            IS_URL_PREVIEW_ENABLED, USE_MSA_SDK_FOR_LOGIN, SUPPORT_ACCOUNT_DISAMBIGUATION, SUPPORT_MOJI, EXP_SPEX_MOJI_FORWARD_USER_GROUP, EXP_SPEX_MOJI_FORWARD_CONTEXT_MENU, EXP_SPEX_MOJI_FORWARD_BUTTON, EXP_SPEX_MEDIA_PICKER_SEARCH_BUTTON_ENABLED, IS_MOJI_LONG_PRESS_TO_SEND_ENABLED, MOJI_TITLE_TEXT_EXPERIMENT_GROUPING_INT, 
            IS_MOJI_SECTION_ENABLED, PICKER_CONTENT_UPDATE, SUPPORT_LIGHTWEIGHT_MSA, MSA_LOGIN_SCOPE, EXP_ADD_FRIENDS_FROM_CONTACT_LIST, MEASURE_LAYOUT_INSTRUMENTATION, IS_LOCATION_SHARING_ENABLED, IS_LOCATION_SENDING_ENABLED, IS_LOCAL_NODE_OFFLINE_ENABLED, IS_WEAR_REMOTE_CONTROL_ENABLED, 
            LOCAL_NODE_TEMP_DISCONNECT_TIMEOUT, LOCAL_NODE_RECONNECT_BEFORE_TIMEOUT, LOCAL_NODE_RECONNECT_TIME_SLICE, IS_VIM_ICON_VISIBLE, IS_VIM_REPLY_WITH_VIDEO_ENABLED, ASYNC_MEDIA_FILE_EXPIRATION_PERIOD, ASYNC_MEDIA_VIDEO_EXPIRATION_PERIOD, ASYNC_MEDIA_FILE_ORIGINAL_SIZE_LIMIT, IS_ASYNC_VIDEO_MESSAGE_ENABLED, IS_ASYNC_FILE_SHARING_ENABLED, 
            ASYNC_FILE_SHARING_AUTO_DOWNLOAD_SIZE_LIMIT, IS_VIM_FAB_BUTTON_ENABLED, IS_VIM_PROMO_ENABLED, IS_VIM_SAVE_TO_GALLERY_ENABLED, TELEMETRY_PROVIDER_ARIA, IS_VIM_FILTERS_BADGE_ENABLED, TELEMETRY_PROVIDER_FLURRY, TELEMETRY_PROVIDERS, VimButtonIcon, ECS_EXPERIMENT_NAME, 
            MSA_COBRAND_ID, CHANGE_UNREAD_MESSAGE_COLOR_RECENTS, SHOW_UNREAD_MESSAGE_COUNT_ORANGE_PILL, SUPPORT_VARIABLE_DEFAULT_AVATAR_BACKGROUND_COLORS, NOTIFICATION_ACTIONS, DISABLE_MESSAGE_AREA_BEFORE_SENDING_ADD_REQUEST, IS_CALL_EFFECTS_ENABLED, CALL_EFFECTS, VIDEO_MESSAGE_FILTERS, OPEN_W_OFFICE_EXTENSIONS_WORD, 
            OPEN_W_OFFICE_EXTENSIONS_EXCEL, OPEN_W_OFFICE_EXTENSIONS_POWER_POINT, IS_INVITE_FRIENDS_ENABLED, PROFILE_SERVICE_URL, TRANSLATOR_ENABLED, SKYPE_LOGIN_URL, AUTO_BUDDY_SERVER_URL, AD_ENABLED, BADGE_NOTIFICATIONS_ENABLED, MSNP_CONNECTION_INDICATOR_EN, 
            ENABLE_UNIFIED_PRESENCE, ENABLE_MESSAGE_INDICATOR, ENABLE_AGENT_SUGGESTIONS, APS_SERVICE_URL, ENABLE_HEARTMARKING, EXPERIMENT_CALENDAR_INTEGRATION_GROUP, EXPERIMENT_CALENDAR_INTEGRATION_APP_CLIENT_OPTION, EXPERIMENT_SIGNOUT_HIDDEN, EAS_SYNC_TYPE, EAS_INGEST_ENABLED, 
            SHOW_EXTERNAL_CONTACTS, INSTALL_OUTLOOK_URI
        });
    }
}
