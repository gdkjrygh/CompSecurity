// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.apptentive.android.sdk.util;


public class Constants
{

    public static final String APPTENTIVE = "apptentive";
    public static final String APPTENTIVE_SDK_VERSION = "1.6.4";
    public static final int CONFIG_DEFAULT_APP_CONFIG_EXPIRATION_DURATION_SECONDS = 0x15180;
    public static final int CONFIG_DEFAULT_APP_CONFIG_EXPIRATION_MILLIS = 0;
    public static final boolean CONFIG_DEFAULT_HIDE_BRANDING = false;
    public static final int CONFIG_DEFAULT_INTERACTION_CACHE_EXPIRATION_DURATION_SECONDS = 28800;
    public static final int CONFIG_DEFAULT_MESSAGE_CENTER_BG_POLL_SECONDS = 60;
    public static final boolean CONFIG_DEFAULT_MESSAGE_CENTER_EMAIL_REQUIRED = false;
    public static final boolean CONFIG_DEFAULT_MESSAGE_CENTER_ENABLED = true;
    public static final int CONFIG_DEFAULT_MESSAGE_CENTER_FG_POLL_SECONDS = 15;
    public static final android.view.ViewGroup.LayoutParams ITEM_LAYOUT = new android.view.ViewGroup.LayoutParams(-2, -2);
    public static final String MANIFEST_KEY_APPTENTIVE_API_KEY = "apptentive_api_key";
    public static final String MANIFEST_KEY_APPTENTIVE_DEBUG = "apptentive_debug";
    public static final String MANIFEST_KEY_EMAIL_REQUIRED = "apptentive_email_required";
    public static final String MANIFEST_KEY_INITIALLY_HIDE_BRANDING = "apptentive_initially_hide_branding";
    public static final String MANIFEST_KEY_MESSAGE_CENTER_ENABLED = "apptentive_message_center_enabled";
    public static final String MANIFEST_KEY_SDK_DISTRIBUTION = "apptentive_sdk_distribution";
    public static final String MANIFEST_KEY_SDK_DISTRIBUTION_VERSION = "apptentive_sdk_distribution_version";
    public static final String PREF_KEY_APP_ACTIVITY_STATE_QUEUE = "appActivityStateQueue";
    public static final String PREF_KEY_APP_CONFIG_EXPIRATION = "appConfiguration.cache-expiration";
    public static final String PREF_KEY_APP_CONFIG_JSON = "appConfiguration.json";
    public static final String PREF_KEY_APP_CONFIG_PREFIX = "appConfiguration.";
    public static final String PREF_KEY_APP_MAIN_ACTIVITY_NAME = "mainActivityName";
    public static final String PREF_KEY_APP_RELEASE = "app_release";
    public static final String PREF_KEY_APP_VERSION_CODE = "app_version_code";
    public static final String PREF_KEY_APP_VERSION_NAME = "app_version_name";
    public static final String PREF_KEY_AUTO_MESSAGE_SHOWN_AUTO_MESSAGE = "autoMessageShownAutoMessage";
    public static final String PREF_KEY_AUTO_MESSAGE_SHOWN_MANUAL = "autoMessageShownManual";
    public static final String PREF_KEY_AUTO_MESSAGE_SHOWN_NO_LOVE = "autoMessageShownNoLove";
    public static final String PREF_KEY_CODE_POINT_STORE = "codePointStore";
    public static final String PREF_KEY_CONVERSATION_ID = "conversationId";
    public static final String PREF_KEY_CONVERSATION_TOKEN = "conversationToken";
    public static final String PREF_KEY_DEVICE = "device";
    public static final String PREF_KEY_DEVICE_DATA = "deviceData";
    public static final String PREF_KEY_DEVICE_DATA_SENT = "deviceDataSent";
    public static final String PREF_KEY_DEVICE_INTEGRATION_CONFIG = "integrationConfig";
    public static final String PREF_KEY_INTERACTIONS = "interactions";
    public static final String PREF_KEY_INTERACTIONS_CACHE_EXPIRATION = "interactionsCacheExpiration";
    public static final String PREF_KEY_MESSAGE_CENTER_SHOULD_SHOW_INTRO_DIALOG = "messageCenterShouldShowIntroDialog";
    public static final String PREF_KEY_PENDING_PUSH_NOTIFICATION = "pendingPushNotification";
    public static final String PREF_KEY_PERSON = "person";
    public static final String PREF_KEY_PERSON_DATA = "personData";
    public static final String PREF_KEY_PERSON_EMAIL = "personEmail";
    public static final String PREF_KEY_PERSON_ID = "personId";
    public static final String PREF_KEY_PERSON_INITIAL_EMAIL = "personInitialEmail";
    public static final String PREF_KEY_PERSON_INITIAL_USER_NAME = "personInitialUserName";
    public static final String PREF_KEY_RATING_EVENTS = "events";
    public static final String PREF_KEY_RATING_STATE = "ratingState";
    public static final String PREF_KEY_RATING_USES = "uses";
    public static final String PREF_KEY_SDK = "sdk";
    public static final String PREF_KEY_START_OF_RATING_PERIOD = "startOfRatingPeriod";
    public static final String PREF_KEY_SURVEYS = "surveys";
    public static final String PREF_KEY_SURVEYS_CACHE_EXPIRATION = "surveyCacheExpiration";
    public static final String PREF_KEY_SURVEYS_HISTORY = "surveyHistory";
    public static final String PREF_KEY_USER_ENTERED_EMAIL = "userEnteredEmail";
    public static final String PREF_KEY_VERSION_HISTORY = "versionHistory";
    public static final String PREF_NAME = "APPTENTIVE";
    public static final int REQUEST_CODE_PHOTO_FROM_MESSAGE_CENTER = 1000;
    public static final android.view.ViewGroup.LayoutParams ROW_LAYOUT = new android.view.ViewGroup.LayoutParams(-1, -2);
    private static final String networkTypeLookup[] = {
        "UNKNOWN", "GPRS", "EDGE", "UMTS", "CDMA", "EVDO_0", "EVDO_A", "1xRTT", "HSDPA", "HSUPA", 
        "HSPA", "IDEN", "EVDO_B", "LTE", "EHRPD", "HSPAP"
    };

    public Constants()
    {
    }

    public static String networkTypeAsString(int i)
    {
        String s;
        try
        {
            s = networkTypeLookup[i];
        }
        catch (ArrayIndexOutOfBoundsException arrayindexoutofboundsexception)
        {
            return networkTypeLookup[0];
        }
        return s;
    }

}
