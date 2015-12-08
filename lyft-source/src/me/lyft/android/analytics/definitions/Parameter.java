// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.analytics.definitions;


public final class Parameter extends Enum
{

    private static final Parameter $VALUES[];
    public static final Parameter ACCURACY;
    public static final Parameter ACTION;
    public static final Parameter ACTION_ID;
    public static final Parameter ACTION_NAME;
    public static final Parameter ALTITUDE;
    public static final Parameter ANDROID_ID;
    public static final Parameter APP;
    public static final Parameter APP_ID;
    public static final Parameter APP_VERSION;
    public static final Parameter AUTHORITY;
    public static final Parameter BACKGROUND;
    public static final Parameter BATTERY_CHARGING;
    public static final Parameter BATTERY_LEVEL;
    public static final Parameter BATTERY_LIFE_MS;
    public static final Parameter BEARING;
    public static final Parameter BUNDLE_ID;
    public static final Parameter CALL;
    public static final Parameter CALL_ID;
    public static final Parameter CANONICAL_ERROR_CODE;
    public static final Parameter CARRIER;
    public static final Parameter CARRIER_ISO;
    public static final Parameter CARRIER_MCC;
    public static final Parameter CARRIER_MNC;
    public static final Parameter CATEGORY;
    public static final Parameter COPY;
    public static final Parameter DEEP_LINK_URL;
    public static final Parameter DEVICE_ID;
    public static final Parameter DURATION_MS;
    public static final Parameter ELEMENT;
    public static final Parameter ELEMENT_VALUE;
    public static final Parameter ERROR_CODE;
    public static final Parameter ERROR_MESSAGE;
    public static final Parameter ERROR_TYPE;
    public static final Parameter EVENT_ID;
    public static final Parameter EVENT_NAME;
    public static final Parameter EVENT_VERSION;
    public static final Parameter EXPERIMENT;
    public static final Parameter FROM_STATE;
    public static final Parameter GOOGLE_AID;
    public static final Parameter HANDLED;
    public static final Parameter HOST;
    public static final Parameter INSTALLED;
    public static final Parameter INSTALLED_AT;
    public static final Parameter INTENT;
    public static final Parameter INTENT_ID;
    public static final Parameter KEEP_DRIVING_BUTTON_TEXT;
    public static final Parameter LATITUDE;
    public static final Parameter LOCALE;
    public static final Parameter LONGITUDE;
    public static final Parameter MANUFACTURER;
    public static final Parameter MESSAGE;
    public static final Parameter METHOD;
    public static final Parameter MODEL;
    public static final Parameter NETWORK_TYPE;
    public static final Parameter OCCURRED_AT;
    public static final Parameter OS;
    public static final Parameter OS_VERSION;
    public static final Parameter PAGE;
    public static final Parameter PAGE_VALUE;
    public static final Parameter PARAMETER;
    public static final Parameter PARENT;
    public static final Parameter PATH;
    public static final Parameter PORT;
    public static final Parameter PREVIOUS_PAGE;
    public static final Parameter PREVIOUS_PAGE_MS;
    public static final Parameter PROTOCOL;
    public static final Parameter PUSH_ID;
    public static final Parameter PUSH_TOKEN;
    public static final Parameter QUERY;
    public static final Parameter RADIO_SIGNAL;
    public static final Parameter RADIO_TYPE;
    public static final Parameter REASON;
    public static final Parameter RECOGNIZED;
    public static final Parameter REGION;
    public static final Parameter REQUEST_BODY_BYTES;
    public static final Parameter REQUEST_ID;
    public static final Parameter RESOLVED_IP;
    public static final Parameter RESPONSE_BODY_BYTES;
    public static final Parameter RESPONSE_DECODED_BYTES;
    public static final Parameter RESPONSE_STARTED_MS;
    public static final Parameter RESPONSE_TIME;
    public static final Parameter RESULT;
    public static final Parameter RIDE_ID;
    public static final Parameter RIDE_STATE;
    public static final Parameter RIDE_TYPE;
    public static final Parameter RIDE_TYPE_SELECTED;
    public static final Parameter SAMPLED_AT;
    public static final Parameter SAMPLE_RATE;
    public static final Parameter SCHEME;
    public static final Parameter SCREEN_DPI;
    public static final Parameter SCREEN_HEIGHT;
    public static final Parameter SCREEN_WIDTH;
    public static final Parameter SCREEN_X;
    public static final Parameter SCREEN_Y;
    public static final Parameter SERVER;
    public static final Parameter SERVICE_MS;
    public static final Parameter SESSION_ID;
    public static final Parameter SIGNOUT_BUTTON_TEXT;
    public static final Parameter SOURCE;
    public static final Parameter SPEED;
    public static final Parameter STANDARD_URL;
    public static final Parameter STATUS;
    public static final Parameter STATUS_CODE;
    public static final Parameter TAG;
    public static final Parameter TIME_ON_SCREEN_MILLIS;
    public static final Parameter TITLE;
    public static final Parameter TO_STATE;
    public static final Parameter TUNE_MAT_ID;
    public static final Parameter TYPE;
    public static final Parameter URL;
    public static final Parameter USER_CREDIT;
    public static final Parameter USER_ID;
    public static final Parameter USER_MODE;
    public static final Parameter USER_REFERRAL_CODE;
    public static final Parameter VALUE;
    public static final Parameter VARIANT;
    private final String value = name().toLowerCase();

    private Parameter(String s, int i)
    {
        super(s, i);
    }

    public static Parameter valueOf(String s)
    {
        return (Parameter)Enum.valueOf(me/lyft/android/analytics/definitions/Parameter, s);
    }

    public static Parameter[] values()
    {
        return (Parameter[])$VALUES.clone();
    }

    public String toString()
    {
        return value;
    }

    static 
    {
        EVENT_NAME = new Parameter("EVENT_NAME", 0);
        EVENT_ID = new Parameter("EVENT_ID", 1);
        EVENT_VERSION = new Parameter("EVENT_VERSION", 2);
        OCCURRED_AT = new Parameter("OCCURRED_AT", 3);
        SESSION_ID = new Parameter("SESSION_ID", 4);
        PARAMETER = new Parameter("PARAMETER", 5);
        TAG = new Parameter("TAG", 6);
        VALUE = new Parameter("VALUE", 7);
        SAMPLE_RATE = new Parameter("SAMPLE_RATE", 8);
        USER_ID = new Parameter("USER_ID", 9);
        USER_MODE = new Parameter("USER_MODE", 10);
        USER_CREDIT = new Parameter("USER_CREDIT", 11);
        USER_REFERRAL_CODE = new Parameter("USER_REFERRAL_CODE", 12);
        RIDE_ID = new Parameter("RIDE_ID", 13);
        RIDE_STATE = new Parameter("RIDE_STATE", 14);
        RIDE_TYPE = new Parameter("RIDE_TYPE", 15);
        PORT = new Parameter("PORT", 16);
        PROTOCOL = new Parameter("PROTOCOL", 17);
        METHOD = new Parameter("METHOD", 18);
        AUTHORITY = new Parameter("AUTHORITY", 19);
        SCHEME = new Parameter("SCHEME", 20);
        HOST = new Parameter("HOST", 21);
        PATH = new Parameter("PATH", 22);
        QUERY = new Parameter("QUERY", 23);
        SERVER = new Parameter("SERVER", 24);
        STATUS_CODE = new Parameter("STATUS_CODE", 25);
        SERVICE_MS = new Parameter("SERVICE_MS", 26);
        ANDROID_ID = new Parameter("ANDROID_ID", 27);
        GOOGLE_AID = new Parameter("GOOGLE_AID", 28);
        TUNE_MAT_ID = new Parameter("TUNE_MAT_ID", 29);
        SCREEN_DPI = new Parameter("SCREEN_DPI", 30);
        SCREEN_HEIGHT = new Parameter("SCREEN_HEIGHT", 31);
        SCREEN_WIDTH = new Parameter("SCREEN_WIDTH", 32);
        BATTERY_CHARGING = new Parameter("BATTERY_CHARGING", 33);
        BATTERY_LEVEL = new Parameter("BATTERY_LEVEL", 34);
        BATTERY_LIFE_MS = new Parameter("BATTERY_LIFE_MS", 35);
        REGION = new Parameter("REGION", 36);
        LATITUDE = new Parameter("LATITUDE", 37);
        LONGITUDE = new Parameter("LONGITUDE", 38);
        ALTITUDE = new Parameter("ALTITUDE", 39);
        BEARING = new Parameter("BEARING", 40);
        SPEED = new Parameter("SPEED", 41);
        SAMPLED_AT = new Parameter("SAMPLED_AT", 42);
        ACCURACY = new Parameter("ACCURACY", 43);
        RADIO_TYPE = new Parameter("RADIO_TYPE", 44);
        NETWORK_TYPE = new Parameter("NETWORK_TYPE", 45);
        RADIO_SIGNAL = new Parameter("RADIO_SIGNAL", 46);
        CARRIER = new Parameter("CARRIER", 47);
        CARRIER_ISO = new Parameter("CARRIER_ISO", 48);
        CARRIER_MCC = new Parameter("CARRIER_MCC", 49);
        CARRIER_MNC = new Parameter("CARRIER_MNC", 50);
        APP_ID = new Parameter("APP_ID", 51);
        APP_VERSION = new Parameter("APP_VERSION", 52);
        OS = new Parameter("OS", 53);
        OS_VERSION = new Parameter("OS_VERSION", 54);
        DEVICE_ID = new Parameter("DEVICE_ID", 55);
        MANUFACTURER = new Parameter("MANUFACTURER", 56);
        MODEL = new Parameter("MODEL", 57);
        BACKGROUND = new Parameter("BACKGROUND", 58);
        LOCALE = new Parameter("LOCALE", 59);
        ELEMENT = new Parameter("ELEMENT", 60);
        PARENT = new Parameter("PARENT", 61);
        SCREEN_X = new Parameter("SCREEN_X", 62);
        SCREEN_Y = new Parameter("SCREEN_Y", 63);
        REASON = new Parameter("REASON", 64);
        DURATION_MS = new Parameter("DURATION_MS", 65);
        RESULT = new Parameter("RESULT", 66);
        TYPE = new Parameter("TYPE", 67);
        CALL_ID = new Parameter("CALL_ID", 68);
        CALL = new Parameter("CALL", 69);
        ERROR_CODE = new Parameter("ERROR_CODE", 70);
        ERROR_TYPE = new Parameter("ERROR_TYPE", 71);
        ERROR_MESSAGE = new Parameter("ERROR_MESSAGE", 72);
        ACTION_ID = new Parameter("ACTION_ID", 73);
        ACTION = new Parameter("ACTION", 74);
        INTENT = new Parameter("INTENT", 75);
        INTENT_ID = new Parameter("INTENT_ID", 76);
        COPY = new Parameter("COPY", 77);
        DEEP_LINK_URL = new Parameter("DEEP_LINK_URL", 78);
        STANDARD_URL = new Parameter("STANDARD_URL", 79);
        FROM_STATE = new Parameter("FROM_STATE", 80);
        TO_STATE = new Parameter("TO_STATE", 81);
        ACTION_NAME = new Parameter("ACTION_NAME", 82);
        RESPONSE_TIME = new Parameter("RESPONSE_TIME", 83);
        STATUS = new Parameter("STATUS", 84);
        ELEMENT_VALUE = new Parameter("ELEMENT_VALUE", 85);
        CATEGORY = new Parameter("CATEGORY", 86);
        TITLE = new Parameter("TITLE", 87);
        MESSAGE = new Parameter("MESSAGE", 88);
        SIGNOUT_BUTTON_TEXT = new Parameter("SIGNOUT_BUTTON_TEXT", 89);
        KEEP_DRIVING_BUTTON_TEXT = new Parameter("KEEP_DRIVING_BUTTON_TEXT", 90);
        TIME_ON_SCREEN_MILLIS = new Parameter("TIME_ON_SCREEN_MILLIS", 91);
        RIDE_TYPE_SELECTED = new Parameter("RIDE_TYPE_SELECTED", 92);
        RESOLVED_IP = new Parameter("RESOLVED_IP", 93);
        RESPONSE_STARTED_MS = new Parameter("RESPONSE_STARTED_MS", 94);
        REQUEST_BODY_BYTES = new Parameter("REQUEST_BODY_BYTES", 95);
        RESPONSE_DECODED_BYTES = new Parameter("RESPONSE_DECODED_BYTES", 96);
        RESPONSE_BODY_BYTES = new Parameter("RESPONSE_BODY_BYTES", 97);
        CANONICAL_ERROR_CODE = new Parameter("CANONICAL_ERROR_CODE", 98);
        REQUEST_ID = new Parameter("REQUEST_ID", 99);
        PAGE = new Parameter("PAGE", 100);
        PREVIOUS_PAGE = new Parameter("PREVIOUS_PAGE", 101);
        PREVIOUS_PAGE_MS = new Parameter("PREVIOUS_PAGE_MS", 102);
        PUSH_ID = new Parameter("PUSH_ID", 103);
        SOURCE = new Parameter("SOURCE", 104);
        APP = new Parameter("APP", 105);
        BUNDLE_ID = new Parameter("BUNDLE_ID", 106);
        INSTALLED = new Parameter("INSTALLED", 107);
        EXPERIMENT = new Parameter("EXPERIMENT", 108);
        VARIANT = new Parameter("VARIANT", 109);
        PUSH_TOKEN = new Parameter("PUSH_TOKEN", 110);
        URL = new Parameter("URL", 111);
        HANDLED = new Parameter("HANDLED", 112);
        RECOGNIZED = new Parameter("RECOGNIZED", 113);
        INSTALLED_AT = new Parameter("INSTALLED_AT", 114);
        PAGE_VALUE = new Parameter("PAGE_VALUE", 115);
        $VALUES = (new Parameter[] {
            EVENT_NAME, EVENT_ID, EVENT_VERSION, OCCURRED_AT, SESSION_ID, PARAMETER, TAG, VALUE, SAMPLE_RATE, USER_ID, 
            USER_MODE, USER_CREDIT, USER_REFERRAL_CODE, RIDE_ID, RIDE_STATE, RIDE_TYPE, PORT, PROTOCOL, METHOD, AUTHORITY, 
            SCHEME, HOST, PATH, QUERY, SERVER, STATUS_CODE, SERVICE_MS, ANDROID_ID, GOOGLE_AID, TUNE_MAT_ID, 
            SCREEN_DPI, SCREEN_HEIGHT, SCREEN_WIDTH, BATTERY_CHARGING, BATTERY_LEVEL, BATTERY_LIFE_MS, REGION, LATITUDE, LONGITUDE, ALTITUDE, 
            BEARING, SPEED, SAMPLED_AT, ACCURACY, RADIO_TYPE, NETWORK_TYPE, RADIO_SIGNAL, CARRIER, CARRIER_ISO, CARRIER_MCC, 
            CARRIER_MNC, APP_ID, APP_VERSION, OS, OS_VERSION, DEVICE_ID, MANUFACTURER, MODEL, BACKGROUND, LOCALE, 
            ELEMENT, PARENT, SCREEN_X, SCREEN_Y, REASON, DURATION_MS, RESULT, TYPE, CALL_ID, CALL, 
            ERROR_CODE, ERROR_TYPE, ERROR_MESSAGE, ACTION_ID, ACTION, INTENT, INTENT_ID, COPY, DEEP_LINK_URL, STANDARD_URL, 
            FROM_STATE, TO_STATE, ACTION_NAME, RESPONSE_TIME, STATUS, ELEMENT_VALUE, CATEGORY, TITLE, MESSAGE, SIGNOUT_BUTTON_TEXT, 
            KEEP_DRIVING_BUTTON_TEXT, TIME_ON_SCREEN_MILLIS, RIDE_TYPE_SELECTED, RESOLVED_IP, RESPONSE_STARTED_MS, REQUEST_BODY_BYTES, RESPONSE_DECODED_BYTES, RESPONSE_BODY_BYTES, CANONICAL_ERROR_CODE, REQUEST_ID, 
            PAGE, PREVIOUS_PAGE, PREVIOUS_PAGE_MS, PUSH_ID, SOURCE, APP, BUNDLE_ID, INSTALLED, EXPERIMENT, VARIANT, 
            PUSH_TOKEN, URL, HANDLED, RECOGNIZED, INSTALLED_AT, PAGE_VALUE
        });
    }
}
