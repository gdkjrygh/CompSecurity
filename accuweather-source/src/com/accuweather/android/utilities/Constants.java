// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.utilities;

import java.util.ArrayList;

public final class Constants
{
    public static class Actions
    {

        public static final String ADVANCE_LOCATION_DARK = "com.accuweather.android.action.ADVANCE_LOCATION_DARK";
        public static final String ADVANCE_LOCATION_LIGHT = "com.accuweather.android.action.ADVANCE_LOCATION_LIGHT";
        public static final String APPWIDGET_ENABLED = "android.appwidget.action.APPWIDGET_ENABLED";
        public static final String CURRENT_LOCATION_CHANGED = "com.accuweather.android.action.CURRENT_LOCATION_CHANGED";
        public static final String GET_FULL_APP = "com.accuweather.android.action.GET_FULL_APP";
        public static final String HOME_LOCATION_CHANGED = "com.accuweather.android.action.HOME_LOCATION_CHANGED";
        public static final String WIDGET_RESIZE = "com.accuweather.android.action.WIDGET_RESIZE";

        public Actions()
        {
        }
    }

    public static class Alerts
    {

        public Alerts()
        {
        }
    }

    public static class Alerts.Imperial
    {

        public static final double ICE_MIN = 0.10000000000000001D;
        public static final double RAIN_MIN = 0.5D;
        public static final double SNOW_MIN = 1D;
        public static final int THUNDERSTORM_MIN = 75;
        public static final int WIND_GUSTS_MIN = 40;
        public static final int WIND_SPEED_MIN = 30;

        public Alerts.Imperial()
        {
        }
    }

    public static class Alerts.Metric
    {

        public static final double ICE_MIN = 2.54D;
        public static final double RAIN_MIN = 12.699999999999999D;
        public static final double SNOW_MIN = 2.54D;
        public static final int THUNDERSTORM_MIN = 75;
        public static final int WIND_GUSTS_MIN = 64;
        public static final int WIND_SPEED_MIN = 48;

        public Alerts.Metric()
        {
        }
    }

    public static class AppAttach
    {

        public static final String APP_ATTACH_EVENT_ACTIVATED = "Activated";
        public static final String IS_APPATTACH_ACTIVATED = "was_appattach_activated";

        public AppAttach()
        {
        }
    }

    public static class ComScoreVariable
    {

        public static final String CS_CLIENT_ID = "6005068";
        public static final String CS_PUBLISHER_SECRET = "c7d1f7f9920e55503ee3470a942d6341";

        public ComScoreVariable()
        {
        }
    }

    public static class CountryCode
    {

        public static final String CANADA = "CA";
        public static final String JAPAN = "JP";
        public static final String UNITED_KINGDOM = "GB";
        public static final String US = "US";

        public CountryCode()
        {
        }
    }

    public static class DeviceModel
    {

        public DeviceModel()
        {
        }
    }

    public static final class DeviceModel.Amazon extends Enum
    {

        private static final DeviceModel.Amazon $VALUES[];
        public static final DeviceModel.Amazon KINDLE_FIRE_1ST_GEN;
        public static final DeviceModel.Amazon KINDLE_FIRE_2ND_GEN;
        public static final DeviceModel.Amazon KINDLE_FIRE_HDX_7_WAN_3RD_GEN;
        public static final DeviceModel.Amazon KINDLE_FIRE_HDX_7_WIFI_3RD_GEN;
        public static final DeviceModel.Amazon KINDLE_FIRE_HDX_9_WAN_3RD_GEN;
        public static final DeviceModel.Amazon KINDLE_FIRE_HDX_9_WIFI_3RD_GEN;
        public static final DeviceModel.Amazon KINDLE_FIRE_HD_7_2ND_GEN;
        public static final DeviceModel.Amazon KINDLE_FIRE_HD_9_WAN_2ND_GEN;
        public static final DeviceModel.Amazon KINDLE_FIRE_HD_9_WIFI_2ND_GEN;
        private String model;

        public static DeviceModel.Amazon valueOf(String s)
        {
            return (DeviceModel.Amazon)Enum.valueOf(com/accuweather/android/utilities/Constants$DeviceModel$Amazon, s);
        }

        public static DeviceModel.Amazon[] values()
        {
            return (DeviceModel.Amazon[])$VALUES.clone();
        }

        static 
        {
            KINDLE_FIRE_1ST_GEN = new DeviceModel.Amazon("KINDLE_FIRE_1ST_GEN", 0, "Kindle Fire");
            KINDLE_FIRE_2ND_GEN = new DeviceModel.Amazon("KINDLE_FIRE_2ND_GEN", 1, "KFOT");
            KINDLE_FIRE_HD_7_2ND_GEN = new DeviceModel.Amazon("KINDLE_FIRE_HD_7_2ND_GEN", 2, "KFTT");
            KINDLE_FIRE_HD_9_WIFI_2ND_GEN = new DeviceModel.Amazon("KINDLE_FIRE_HD_9_WIFI_2ND_GEN", 3, "KFJWI");
            KINDLE_FIRE_HD_9_WAN_2ND_GEN = new DeviceModel.Amazon("KINDLE_FIRE_HD_9_WAN_2ND_GEN", 4, "KFJWA");
            KINDLE_FIRE_HDX_7_WAN_3RD_GEN = new DeviceModel.Amazon("KINDLE_FIRE_HDX_7_WAN_3RD_GEN", 5, "KFTHWA");
            KINDLE_FIRE_HDX_7_WIFI_3RD_GEN = new DeviceModel.Amazon("KINDLE_FIRE_HDX_7_WIFI_3RD_GEN", 6, "KFTHWI");
            KINDLE_FIRE_HDX_9_WAN_3RD_GEN = new DeviceModel.Amazon("KINDLE_FIRE_HDX_9_WAN_3RD_GEN", 7, "KFAPWA");
            KINDLE_FIRE_HDX_9_WIFI_3RD_GEN = new DeviceModel.Amazon("KINDLE_FIRE_HDX_9_WIFI_3RD_GEN", 8, "KFAPWI");
            $VALUES = (new DeviceModel.Amazon[] {
                KINDLE_FIRE_1ST_GEN, KINDLE_FIRE_2ND_GEN, KINDLE_FIRE_HD_7_2ND_GEN, KINDLE_FIRE_HD_9_WIFI_2ND_GEN, KINDLE_FIRE_HD_9_WAN_2ND_GEN, KINDLE_FIRE_HDX_7_WAN_3RD_GEN, KINDLE_FIRE_HDX_7_WIFI_3RD_GEN, KINDLE_FIRE_HDX_9_WAN_3RD_GEN, KINDLE_FIRE_HDX_9_WIFI_3RD_GEN
            });
        }


        private DeviceModel.Amazon(String s, int i, String s1)
        {
            super(s, i);
            model = s1;
        }
    }

    public static final class DeviceModel.BN extends Enum
    {

        private static final DeviceModel.BN $VALUES[];
        public static final DeviceModel.BN NOOK_COLOR;
        public static final DeviceModel.BN NOOK_HD;
        public static final DeviceModel.BN NOOK_HDPLUS;
        public static final DeviceModel.BN TABLET_16;
        public static final DeviceModel.BN TABLET_8;
        private String model;

        public static DeviceModel.BN valueOf(String s)
        {
            return (DeviceModel.BN)Enum.valueOf(com/accuweather/android/utilities/Constants$DeviceModel$BN, s);
        }

        public static DeviceModel.BN[] values()
        {
            return (DeviceModel.BN[])$VALUES.clone();
        }

        String model()
        {
            return model;
        }

        static 
        {
            NOOK_COLOR = new DeviceModel.BN("NOOK_COLOR", 0, "BNRV200");
            NOOK_HD = new DeviceModel.BN("NOOK_HD", 1, "BNTV400");
            NOOK_HDPLUS = new DeviceModel.BN("NOOK_HDPLUS", 2, "BNTV600");
            TABLET_8 = new DeviceModel.BN("TABLET_8", 3, "BNTV250A");
            TABLET_16 = new DeviceModel.BN("TABLET_16", 4, "BNTV250");
            $VALUES = (new DeviceModel.BN[] {
                NOOK_COLOR, NOOK_HD, NOOK_HDPLUS, TABLET_8, TABLET_16
            });
        }


        private DeviceModel.BN(String s, int i, String s1)
        {
            super(s, i);
            model = s1;
        }
    }

    public static class Extras
    {

        public static final String AUTOCOMPLETE_PAYLOAD = "autocomplete_payload";
        public static final String CLEAR_INPUT = "clear_input";
        public static final String DELETE_CODE = "location_code_delete";
        public static final String FRAGMENT_PAYLOAD = "fragment_payload";
        public static final String FROM_PUSH_ALERT = "from_push_alert";
        public static final String IS_AUTOCOMPLETE = "is_autocomplete";
        public static final String IS_GPS = "is_gps";
        public static final String LOCATION_CODE = "location_code";
        public static final String NOTIFICATION_ACTIVITY = "notification_activity";
        public static final String PAGE_INDEX_FROM_NOW_CARD = "page_index_from_now_card";
        public static final String PAGE_INDEX_FROM_WIDGET = "page_index_from_widget";
        public static final String PUSH_CITY_TAG = "push_city_tag";
        public static final String REQUEST_FOCUS = "request_focus";
        public static final String START_INDEX = "start_index";
        public static final String WEATHER_UPDATE_TIMER_BASED = "weather_update_timer_based";
        public static final String WIDGET_ID = "widget_id";

        public Extras()
        {
        }
    }

    public static class FaceBookProperties
    {

        public static final String FREE_FACEBOOK_APP_ID = "757481634289798";
        public static final String PAID_FACEBOOK_APP_ID = "722281767861797";

        public FaceBookProperties()
        {
        }
    }

    public static class GAWigetCons
    {

        public static final String GA_TRACKING_URL = "http://www.accuweather.com/get/beacon?account=UA-28728915-16&path=%2Fwidget%2FWIDGET_TYPE&event_info=Widget_Monthly_Count;WIDGET_TYPE";
        public static final String GA_TRACKING_URL_OLD = "http://www.accuweather.com/get/beacon?account=UA-28728915-16&path=%2Fwidget%2FWIDGET_TYPE&event_info=Widget_Unique_Monthly_View;WIDGET_TYPE";
        public static final String INTENT_ACTION_RESET_TRACKING_WIDGET = "com.accuweather.android.widget.ga.reset";
        public static final String INTENT_ACTION_START_TRACKING_WIDGET = "com.accuweather.android.widget.ga.fire_beacon";
        public static final String KEY_LAST_TIME_TRIGGER = "last_time_trigger_new";
        public static final String KEY_LIST_PROVIDER_REMAINING = "list_provider_remaining_new";
        public static final String KEY_NUMBER_TIME_RETRY = "key_number_time_retry_new";
        public static final String KEY_RETRY_ERROR = "retry_error_new";
        public static final int MAX_TIME_RETRY = 10;
        public static final long TIME_INTERVAL_RETRY_IN_MILLIS = 0x1d4c0L;
        public static final int TIME_TRIGGER_TYPE = 2;
        public static final int TIME_TRIGGER_VALUE = 1;
        public static final String WIDGET_TYPE_CLOCK = "Clock";
        public static final String WIDGET_TYPE_HOLO_DARK = "Holo_dark";
        public static final String WIDGET_TYPE_HOLO_LIGHT = "Holo_light";
        public static final String WIDGET_TYPE_MINUTE_CAST = "MinuteCast";

        public GAWigetCons()
        {
        }
    }

    public static class Intents
    {

        public static final String ACTION_UPDATE_CHANNEL = "com.accuweather.android.ACTION_UPDATE_CHANNEL";
        public static final String ADD_WIDGET_LOCATION = "accuwx.intent.action.ADD_WIDGET_LOCATION";
        public static final String CANCEL_UPDATE_ACCUWEATHER_EVENING_NOW_CARDS = "com.accuweather.android.CANCEL_UPDATE_ACCUWEATHER_EVENING_NOW_CARDS";
        public static final String CANCEL_UPDATE_ACCUWEATHER_NOW_CARDS = "com.accuweather.android.CANCEL_UPDATE_ACCUWEATHER_NOW_CARDS";
        public static final String CLOCK_WIDGET_UPDATE = "com.accuweather.android.widget.CLOCK_WIDGET_UPDATE";
        public static final String DELETE_LOCATION = "accuwx.intent.action.DELETE_LOCATION";
        public static final String LOCATION_PROVIDERS_CHANGED = "android.location.PROVIDERS_CHANGED";
        public static final String REMOVE_NOTIFICATION = "accuwx.intent.action.REMOVE_NOTIFICATION";
        public static final String UPDATE_ACCUWEATHER_EVENING_NOW_CARDS = "com.accuweather.android.UPDATE_ACCUWEATHER_EVENING_NOW_CARDS";
        public static final String UPDATE_ACCUWEATHER_NOW_CARDS = "com.accuweather.android.UPDATE_ACCUWEATHER_NOW_CARDS";
        public static final String UPDATE_AMAZON_PRODUCTS = "accuwx.intent.action.UPDATE_AMAZON_PRODUCTS";
        public static final String UPDATE_FRAGMENT = "accuwx.intent.action.UPDATE_FRAGMENT";
        public static final String UPDATE_LOCATION_AUTOCOMPLETE = "accuwx.intent.action.UPDATE_LOCATION_AUTOCOMPLETE";
        public static final String UPDATE_MAPS_FRAGMENT = "accuwx.intent.action.UPDATE_MAPS_FRAGMENT";
        public static final String UPDATE_METRIC = "accuwx.intent.action.UPDATE_METRIC";
        public static final String UPDATE_NOTIFICATION = "accuwx.intent.action.UPDATE_NOTIFICATION";
        public static final String UPDATE_NOW_FRAGMENT = "accuwx.intent.action.UPDATE_NOW_FRAGMENT";
        public static final String UPDATE_WIDGET_DATA = "accuwx.intent.action.UPDATE_WIDGET_DATA";
        public static final String WIDGET_TRANSACTION_COMPLETE = "accuwx.intent.action.WIDGET_TRANSACTION_COMPLETE";

        public Intents()
        {
        }
    }

    public static class Locations
    {

        public static final String GPS_LOCATION_KEY = "-1";

        public Locations()
        {
        }
    }

    public static class Maps
    {

        public static final int MAX_MAP_TILE_COUNT = 5;

        public Maps()
        {
        }
    }

    public static class MinuteCastProperties
    {

        public static final String SELECTED_MINUTE_KEY = "selectedMinute";

        public MinuteCastProperties()
        {
        }
    }

    public static class NotificationInterval
    {

        public static final int FIFTEEN_MIN = 15;
        public static final int FIVE_MIN = 5;
        public static final int SIXTY_MIN = 60;
        public static final int TEN_MIN = 10;
        public static final int THIRTY_MIN = 30;

        public NotificationInterval()
        {
        }
    }

    public static class Notifications
    {

        public static final String ALERT_VIEWED = "alert_viewed";
        public static final String CITY_ID = "city_id";
        public static final String CITY_NAME = "city_name";
        public static final String CURRENT_REALFEEL = "realfeel";
        public static final String CURRENT_TEMPERATURE = "current_temperature";
        public static final String EXPANDED_NOTIFICATION_ICON_ID = "icon_id";
        public static final String NOTIFY_NUMBER_ID = "notify_number_id";
        public static final String SHORT_TEXT = "short_text";
        public static final String UPDATE_TIME = "update_time";

        public Notifications()
        {
        }
    }

    public static class NowCard
    {

        public static final String IS_SEVERE_WEATHER = "IS_SEVERE_WEATHER";
        public static final String KEY_PREFS_CARD_ID = "KEY_PREFS_CARD_ID";
        public static final String SERVER_CLIENT_ID = "732023175389-uvjm3ac8919d8ctlnmfo99e73lmdbd8h.apps.googleusercontent.com";

        public NowCard()
        {
        }
    }

    public static class PackageProperties
    {

        public static final boolean BACKGROUND_IMAGES_LOCAL = false;
        public static final String DEFAULT_WIDGET_LOCATION_KEY = "";
        public static final boolean IS_AMOBEE_TESTING = false;
        public static final boolean IS_ANDROIDLITE = false;
        public static final boolean IS_DEBUGGABLE = false;
        public static boolean IS_FORCE_STOPPED = false;
        public static final boolean IS_PAID = false;
        public static final boolean IS_TEST_ALERTS = false;
        public static final boolean IS_TREMOR = true;
        public static final boolean IS_WEARABLES_CURRENT_LOCATION = true;
        public static final boolean IS_WEARABLES_IDLE_UPDATE = true;
        public static final boolean SHOULD_SHOW_ALERT_INAPP = false;
        public static final int WEARABLES_MINUTE_UPDATE_REPEAT = 0x124f80;
        public static final boolean mUSE_WEARABLES = true;

        static 
        {
            IS_FORCE_STOPPED = true;
        }

        public PackageProperties()
        {
        }
    }

    public static class Preferences
    {

        public static final String CHANGED_ADVANCED_SETTINGS = "changed_advanced_settings";
        public static final String CHANGED_ADVANCED_SETTINGS_FOR_PRIMARY_ACTIVITY = "changed_advanced_settings_for_primary_activity";
        public static final String DEFAULT_LOCATION_ADDED = "default_location_added";
        public static final String DELETED_AL_FOLLOW_ME_WIDGET_IDS = "deleted_al_follow_me_widget_ids";
        public static final String DELETED_AL_WIDGET_IDS = "deleted_al_widget_ids";
        public static final String DELETED_SHARP_WIDGET_IDS = "deleted_sharp_widget_ids";
        public static final String FORECAST_GRAPH_SHOWING = "forecast_graph_showing";
        public static final String FORECAST_SPINNER_SELECTION = "forecast_spinner_selection";
        public static final String HAS_LOCATION_BEEN_EXPLICITLY_ADDED = "has_location_been_explicitly_added";
        public static final String HAVE_DMAS_BEEN_UPDATED = "have_dmas_been_updated";
        public static final String HOURLY_GRAPH_SHOWING = "hourly_graph_showing";
        public static final String HOURLY_SPINNER_SELECTION = "hourly_spinner_selection";
        public static final String INSTALL_DATE = "";
        public static final String IS_FROM_HOLO_DARK = "is_from_holo_dark";
        public static final String IS_FROM_HOLO_LIGHT = "is_from_holo_light";
        public static final String IS_FROM_RESIZABLE = "is_from_resizable";
        public static final String IS_PAID_APPLICATION = "is_paid_application";
        public static final String IS_WEARABLES_CURRENT_LOCATION = "is_wearables_current_location";
        public static final String LAST_UPDATED_TIME = "last_updated_time";
        public static final String LAST_VIEWED_LOCATION_KEY = "last_viewed_location_key";
        public static final String LAUNCH_PREF = "pref_open_at_launch";
        public static final String MAP_KEY_SHOWING = "map_key_showing";
        public static final String METRIC_REFRESHED_FROM_DETAILS = "metric_refreshed_from_details";
        public static final String NOTIFICATION_TEMPERATURE_SETTINGS = "pref_notification_temperature";
        public static final String OTHER_LEGAL_NOTICES = "other_legal_notices";
        public static final String PREF_ACCUWEATHER_BRANDING = "accuweatherBranding";
        public static final String PREF_ADVANCED = "advanced_pref";
        public static final String PREF_DATE_FORMAT = "pref_date";
        public static final String PREF_EMAIL = "pref_email";
        public static final String PREF_LAUNCH = "pref_open_at_launch";
        public static final String PREF_MEASUREMENT = "pref_measurement";
        public static final String PREF_METRIC = "pref_temp_units";
        public static final String PREF_NOTIFICATION = "notification_pref";
        public static final String PREF_NOTIFICATION_BAR_TEMPERATURE_STATE = "pref_temp_notifications";
        public static final String PREF_NOTIFICATION_BAR_TEMPERATURE_UPDATE_INTERVAL = "pref_notification_interval";
        public static final String PREF_NOTIFY_FLAG = "false";
        public static final String PREF_PARTNER_CODE = "pref_p_code";
        public static final String PREF_PRESSURE = "pref_pressure";
        public static final String PREF_PUSH_ENABLED_STATE = "pref_push_notification";
        public static final String PREF_RATE = "pref_rate";
        public static final String PREF_SHOW_EULA = "pref_show_eula";
        public static final String PREF_SHOW_PRIVACY_POLICY = "pref_show_privacy_policy";
        public static final String PREF_TERMS_OF_USE = "terms_of_use_pref";
        public static final String PREF_TIME_FORMAT = "pref_time";
        public static final String PREF_UPGRADE = "pref_upgrade";
        public static final String PREF_WIND_DIRECTION = "pref_wind_direction";
        public static final String PREF_WIND_SPEED = "pref_speed";
        public static final String PREVIOUS_HOME_LOCATION = "previous_home_location";
        public static final String PUSH_NOTIFICATION_VALUE_IS_SET = "push_notification_value_is_set";
        public static final String QUICK_SETUP_COMPLETED = "quick_setup_completed";
        public static final String RATINGS_PROMPT = "ratings_prompt";
        public static final String SAVE_CURRENT_PAGE_NUMBER = "save_current_page_number";
        public static final String SIMULATE_V2 = "simulate_v2";
        public static final String TERMS_AND_CONDITIONS_ACCEPTED = "terms_and_conditions_accepted";
        public static final String UPDATE_WEARABLES_SERVICE = "update_wearables_service";
        public static final String WAS_ANDROID_LITE_INSTALLED = "is_from_android_lite";
        public static final String WAS_UPGRADED_FROM_ANDROID_LITE = "upgraded_from_android_lite";
        public static final String WERE_ANALYTICS_FOR_PLATINUM_UPGRADE_SENT = "were_analytics_for_platinum_upgrade_sent";
        public static final String WHATS_NEW_PAGE1_VIEWED = "whats_new_page1_viewed";
        public static final String WHATS_NEW_PAGE2_VIEWED = "whats_new_page2_viewed";
        public static final String WHATS_NEW_VIEWED = "whats_new_viewed";
        public static final String WIDGET_WHATS_NEW_VIEWED = "widget_whats_new_viewed";

        public Preferences()
        {
        }
    }

    public static class Preferences.LaunchModes
    {

        public static final String CURRENT = "0";
        public static final String HOME = "1";
        public static final String LAST_VIEWED = "2";

        public Preferences.LaunchModes()
        {
        }
    }

    public static class Quantcast
    {

        public static final String API_KEY = "17ecxg1ih1ce4q6s-mtaq4cy6y01e1r1p";

        public Quantcast()
        {
        }
    }

    public static class RequestCodes
    {

        public static final int QUICK_SETUP_REQUEST_CODE = 201;
        public static final int WIDGET_TERMS_REQUEST_CODE = 200;
        public static final int WIDGET_WHATS_NEW_REQUEST_CODE = 203;

        public RequestCodes()
        {
        }
    }

    public static class Sharing
    {

        public static final String IMAGE_APPEND = "AccuWeather_ImageShare.png";
        public static final String IMAGE_MIME_TYPE = "image/png";
        public static final String SUBJECT = "AccuWeather.com";
        public static final String TITLE = "AccuWeather.com";

        public Sharing()
        {
        }
    }

    public static class TestParameters
    {

        public static final String ADS = "adopstest";
        public static final String CLEAR_DATA_QUERY = "Clear Data";
        public static final String C_TEST_KEY = "35o127";
        public static final String C_TEST_QUERY = "CThree";
        public static final String F_TEST_KEY = "2233o81";
        public static final String F_TEST_QUERY = "FThree";
        public static final String PARTNER_CODE = "pcode";
        public static final String SIMULATE_V2_QUERY = "SimulateV2";
        public static final String WEATHER_DATA_DEBUG = "wdmdebug";

        public TestParameters()
        {
        }
    }

    public static class Units
    {

        public static final int IMPERIAL = 0;
        public static final int METRIC = 1;

        public Units()
        {
        }
    }

    public static class Units.PressureUnits
    {

        public static final int IN = 0;
        public static final int KPA = 1;
        public static final int MB = 2;

        public Units.PressureUnits()
        {
        }
    }

    public static class Units.PressureUnits.StringValue
    {

        public static final String IN = String.valueOf(0);
        public static final String KPA = String.valueOf(1);
        public static final String MB = String.valueOf(2);


        public Units.PressureUnits.StringValue()
        {
        }
    }

    public static class Units.StringValue
    {

        public static final String IMPERIAL = String.valueOf(0);
        public static final String METRIC = String.valueOf(1);


        public Units.StringValue()
        {
        }
    }

    public static class Widget
    {

        public static final int NUMBER_OF_MINUTES_BETWEEN_WIDGET_WEATHER_UPDATES = 5;
        public static final int NUMBER_OF_MINUTES_WIDGET_WEATHER_UPDATES_ALL_VALUES = 30;
        public static final String PRELOAD_LOCATION_ADDED = "preload_location_added";
        public static final String SHOULD_UPDATE_WEATHER = "should_update_weather";

        public Widget()
        {
        }
    }


    public static final String DEGREE_SYMBOL = "\260";
    public static ArrayList KINDLE_DEVICES;
    public static ArrayList NON_MARKET_PARTNERS;
    public static ArrayList NON_PUSH_MODELS;
    public static ArrayList NON_PUSH_PARTNERS;
    public static ArrayList NO_GPS_ALLOWED_PARTNERS;

    private Constants()
    {
    }

    static 
    {
        NO_GPS_ALLOWED_PARTNERS = new ArrayList();
        NO_GPS_ALLOWED_PARTNERS.add("androidapptoysrus");
        NON_MARKET_PARTNERS = new ArrayList();
        NON_MARKET_PARTNERS.add("androidpit");
        NON_MARKET_PARTNERS.add("androidgetjar");
        NON_MARKET_PARTNERS.add("androidorange");
        NON_MARKET_PARTNERS.add("androidvodafone");
        NON_MARKET_PARTNERS.add("androidyandex");
        NON_MARKET_PARTNERS.add("androidxiaomi");
        NON_MARKET_PARTNERS.add("androidapptoysrus");
        NON_MARKET_PARTNERS.add("androidtcl");
        NON_PUSH_MODELS = new ArrayList();
        for (int i = 0; i < DeviceModel.BN.values().length; i++)
        {
            NON_PUSH_MODELS.add(DeviceModel.BN.values()[i].model);
        }

        KINDLE_DEVICES = new ArrayList();
        for (int j = 0; j < DeviceModel.Amazon.values().length; j++)
        {
            KINDLE_DEVICES.add(DeviceModel.Amazon.values()[j].model);
        }

        NON_PUSH_PARTNERS = new ArrayList();
        NON_PUSH_PARTNERS.add("androidpit");
        NON_PUSH_PARTNERS.add("androidorange");
        NON_PUSH_PARTNERS.add("androidvodafone");
        NON_PUSH_PARTNERS.add("androidtcl");
    }
}
