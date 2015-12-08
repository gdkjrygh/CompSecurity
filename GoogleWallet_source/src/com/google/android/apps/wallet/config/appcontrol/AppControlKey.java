// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.config.appcontrol;

import com.google.common.base.Preconditions;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.apps.wallet.config.appcontrol:
//            AppControl

public final class AppControlKey extends Enum
{

    private static final AppControlKey $VALUES[];
    public static final AppControlKey ADDRESS_AUTOCOMPLETE_API_KEY;
    public static final AppControlKey ADDRESS_AUTOCOMPLETE_THRESHOLD_ADDRESS_LINE_1;
    public static final AppControlKey ADDRESS_AUTOCOMPLETE_THRESHOLD_DEFAULT;
    public static final AppControlKey BANK_ACCOUNT_IAV_URL;
    public static final AppControlKey CARD_BLOCKED_PHONE_NUMBER;
    public static final AppControlKey CARD_PIN_PHONE_NUMBER;
    public static final AppControlKey CSI_SAMPLING_RATIO;
    public static final AppControlKey GAIA_ACCOUNT_CHOOSER_URL;
    public static final AppControlKey GEOFENCING_NOTIFICATIONS_ENABLED;
    public static final AppControlKey GEOFENCING_NOTIFICATIONS_REFRESH_ZONES_ON_WOB_UPDATE;
    public static final AppControlKey GEOFENCING_NOTIFICATIONS_RETRY_SERVER_CALL;
    public static final AppControlKey GLOBAL_RESOURCES_SYNC_REFRESH_RATE_MS;
    public static final AppControlKey HERE_AND_NOW_CACHE_TTL_MINUTES;
    public static final AppControlKey IMAGE_CACHE_MAX_MEMORY_FRACTION;
    public static final AppControlKey LOYALTY_DISCOVERABLE_PROGRAM_LOCATION_STALE_TIME;
    public static final AppControlKey NOTIFICATION_FETCH_RETRIES;
    public static final AppControlKey OCR_ENABLED;
    public static final AppControlKey OCR_MODEL_BLACKLIST;
    public static final AppControlKey PDF_VIEWER_URL;
    public static final AppControlKey PLASTIC_CARD_ACTIVATE_URL;
    public static final AppControlKey PLASTIC_CARD_ORDER_URL;
    public static final AppControlKey PURCHASE_RECORD_LIST_CACHE_TTL_MINS;
    public static final AppControlKey RESPONSE_METADATA_HANDLING;
    public static final AppControlKey TAP_AND_PAY_FIND_MERCHANTS_URI;
    public static final AppControlKey TEST_ONLY_KEY;
    public static final AppControlKey TOP_UP_AMOUNTS;
    public static final AppControlKey TOS_V2_LATEST_PRIVACY_URL;
    public static final AppControlKey TOS_V2_LEGAL_DOC_TUPLE;
    public static final AppControlKey WEBVIEW_VALID_BASE_URLS;
    public static final AppControlKey WHISKY_RESET_PIN_URL;
    public static final AppControlKey WOBS_AUTO_SNAP_MODEL_BLACKLIST;
    public static final AppControlKey WOBS_CONTINUOUS_PICTURE_FOCUS_MODE_MODEL_BLACKLIST;
    public static final AppControlKey WOBS_FULL_SYNC_ON_REFRESH;
    public static final AppControlKey WOBS_OCR_BLOCKED_NETWORK_TYPES;
    public static final AppControlKey WOBS_OCR_ENABLED;
    public static final AppControlKey WOBS_OCR_MODEL_BLACKLIST;
    public static final AppControlKey WOB_EXTRA_ENTRY_POINTS;
    public static final AppControlKey WOB_INSTANCE_BYTE_SIZE_LIMIT;
    public static final AppControlKey WOB_OCR_CAMERA_STOP_DELAY;
    public static final AppControlKey WOB_OCR_MAX_ALLOWABLE_SERVER_ERRORS_PER_SCAN;
    public static final AppControlKey WOB_OCR_MAX_QPS;
    public static final AppControlKey WOB_OCR_MAX_REQUESTS_PER_SCAN;
    public static final AppControlKey WOB_OCR_TIMEOUT_AFTER_BARCODE_DETECTION;
    public static final AppControlKey WOB_SHOW_SAVE_NOTIFICATION_SETTING;
    private final String mDefaultValue;
    private final String mProtoKeyName;

    private AppControlKey(String s, int i, String s1, String s2)
    {
        super(s, i);
        mProtoKeyName = (String)Preconditions.checkNotNull(s1);
        mDefaultValue = (String)Preconditions.checkNotNull(s2);
    }

    public static AppControlKey valueOf(String s)
    {
        return (AppControlKey)Enum.valueOf(com/google/android/apps/wallet/config/appcontrol/AppControlKey, s);
    }

    public static AppControlKey[] values()
    {
        return (AppControlKey[])$VALUES.clone();
    }

    public final String getDefaultValue()
    {
        return mDefaultValue;
    }

    public final String getProtoKeyName()
    {
        return mProtoKeyName;
    }

    static 
    {
        CARD_BLOCKED_PHONE_NUMBER = new AppControlKey("CARD_BLOCKED_PHONE_NUMBER", 0, "decline:card_blocked_phone_number", "855-492-5538");
        CARD_PIN_PHONE_NUMBER = new AppControlKey("CARD_PIN_PHONE_NUMBER", 1, "card_pin:card_pin_phone_number", "1-866-439-8420");
        GLOBAL_RESOURCES_SYNC_REFRESH_RATE_MS = new AppControlKey("GLOBAL_RESOURCES_SYNC_REFRESH_RATE_MS", 2, "global_resources:sync_refresh_rate_ms", String.valueOf(TimeUnit.DAYS.toMillis(1L)));
        IMAGE_CACHE_MAX_MEMORY_FRACTION = new AppControlKey("IMAGE_CACHE_MAX_MEMORY_FRACTION", 3, "image_cache:max_memory_fraction", "0.125");
        PLASTIC_CARD_ACTIVATE_URL = new AppControlKey("PLASTIC_CARD_ACTIVATE_URL", 4, "plastic_card:activate_url", "https://wallet.google.com/activate-wallet-card");
        PLASTIC_CARD_ORDER_URL = new AppControlKey("PLASTIC_CARD_ORDER_URL", 5, "plastic_card:order_url", "https://wallet.google.com/get-wallet-card");
        PURCHASE_RECORD_LIST_CACHE_TTL_MINS = new AppControlKey("PURCHASE_RECORD_LIST_CACHE_TTL_MINS", 6, "purchase_record_list:cache_ttl_minutes", "60");
        RESPONSE_METADATA_HANDLING = new AppControlKey("RESPONSE_METADATA_HANDLING", 7, "response_metadata_processing:enable", "true");
        TEST_ONLY_KEY = new AppControlKey("TEST_ONLY_KEY", 8, "wallet:debug_key", AppControl.DEFAULT_BOOLEAN);
        TOP_UP_AMOUNTS = new AppControlKey("TOP_UP_AMOUNTS", 9, "wallet:top_up_amounts", "20,50,100");
        TOS_V2_LEGAL_DOC_TUPLE = new AppControlKey("TOS_V2_LEGAL_DOC_TUPLE", 10, "tos_v2:legal_doc_tuple", "");
        TOS_V2_LATEST_PRIVACY_URL = new AppControlKey("TOS_V2_LATEST_PRIVACY_URL", 11, "tos_v2:latest_privacy_url", "https://wallet.google.com/files/privacy.html");
        GEOFENCING_NOTIFICATIONS_ENABLED = new AppControlKey("GEOFENCING_NOTIFICATIONS_ENABLED", 12, "geofencing_notifications:enabled", "true");
        GEOFENCING_NOTIFICATIONS_RETRY_SERVER_CALL = new AppControlKey("GEOFENCING_NOTIFICATIONS_RETRY_SERVER_CALL", 13, "geofencing_notifications:retry_server_call", "true");
        GEOFENCING_NOTIFICATIONS_REFRESH_ZONES_ON_WOB_UPDATE = new AppControlKey("GEOFENCING_NOTIFICATIONS_REFRESH_ZONES_ON_WOB_UPDATE", 14, "geofencing_notifications:refresh_zones_on_wob_update", "true");
        HERE_AND_NOW_CACHE_TTL_MINUTES = new AppControlKey("HERE_AND_NOW_CACHE_TTL_MINUTES", 15, "here_and_now:cache_ttl_minutes", "5");
        OCR_ENABLED = new AppControlKey("OCR_ENABLED", 16, "ocr:enabled", "true");
        OCR_MODEL_BLACKLIST = new AppControlKey("OCR_MODEL_BLACKLIST", 17, "ocr:model_blacklist", String.valueOf("unknown,unsupported"));
        WOBS_FULL_SYNC_ON_REFRESH = new AppControlKey("WOBS_FULL_SYNC_ON_REFRESH", 18, "wobs:full_sync_on_refresh", "true");
        WOB_INSTANCE_BYTE_SIZE_LIMIT = new AppControlKey("WOB_INSTANCE_BYTE_SIZE_LIMIT", 19, "wobs:wob_instance_byte_size_limit", "800000");
        WOB_OCR_CAMERA_STOP_DELAY = new AppControlKey("WOB_OCR_CAMERA_STOP_DELAY", 20, "wobs_ocr:camera_stop_delay", "500");
        WOBS_OCR_ENABLED = new AppControlKey("WOBS_OCR_ENABLED", 21, "wobs_ocr:android_enabled", "true");
        WOBS_OCR_BLOCKED_NETWORK_TYPES = new AppControlKey("WOBS_OCR_BLOCKED_NETWORK_TYPES", 22, "wobs_ocr:blocked_network_types_android", String.valueOf("1,2,3,4,5,6,7"));
        WOBS_OCR_MODEL_BLACKLIST = new AppControlKey("WOBS_OCR_MODEL_BLACKLIST", 23, "wobs_ocr:model_blacklist", String.valueOf("unknown,unsupported"));
        WOBS_CONTINUOUS_PICTURE_FOCUS_MODE_MODEL_BLACKLIST = new AppControlKey("WOBS_CONTINUOUS_PICTURE_FOCUS_MODE_MODEL_BLACKLIST", 24, "wobs:continuous_picture_focus_mode_model_blacklist", String.valueOf("unknown,unsupported"));
        WOBS_AUTO_SNAP_MODEL_BLACKLIST = new AppControlKey("WOBS_AUTO_SNAP_MODEL_BLACKLIST", 25, "wobs:auto_snap_model_blacklist", String.valueOf("unknown,unsupported"));
        WOB_OCR_MAX_QPS = new AppControlKey("WOB_OCR_MAX_QPS", 26, "wobs_ocr:max_qps", "2");
        WOB_OCR_MAX_REQUESTS_PER_SCAN = new AppControlKey("WOB_OCR_MAX_REQUESTS_PER_SCAN", 27, "wobs_ocr:max_requests_per_scan", "30");
        WOB_OCR_MAX_ALLOWABLE_SERVER_ERRORS_PER_SCAN = new AppControlKey("WOB_OCR_MAX_ALLOWABLE_SERVER_ERRORS_PER_SCAN", 28, "wobs_ocr:max_allowable_server_errors_per_scan", "5");
        WOB_OCR_TIMEOUT_AFTER_BARCODE_DETECTION = new AppControlKey("WOB_OCR_TIMEOUT_AFTER_BARCODE_DETECTION", 29, "wobs_ocr:timeout_after_barcode_detection", "4000");
        GAIA_ACCOUNT_CHOOSER_URL = new AppControlKey("GAIA_ACCOUNT_CHOOSER_URL", 30, "gaia:account_chooser_url", "https://accounts.google.com/AccountChooser?Email=%s&continue=%s");
        WHISKY_RESET_PIN_URL = new AppControlKey("WHISKY_RESET_PIN_URL", 31, "whisky:reset_pin_path", "https://wallet.google.com/resetPin?continue=%s");
        WOB_EXTRA_ENTRY_POINTS = new AppControlKey("WOB_EXTRA_ENTRY_POINTS", 32, "wobs:fetch_wobs_diff_extra_entry_points", "");
        WOB_SHOW_SAVE_NOTIFICATION_SETTING = new AppControlKey("WOB_SHOW_SAVE_NOTIFICATION_SETTING", 33, "wobs:show_save_notification_setting", "false");
        BANK_ACCOUNT_IAV_URL = new AppControlKey("BANK_ACCOUNT_IAV_URL", 34, "webflow:bank_account_iav", "https://wallet.google.com/m/iav");
        CSI_SAMPLING_RATIO = new AppControlKey("CSI_SAMPLING_RATIO", 35, "csi:sampling_ratio_android", "1.0");
        PDF_VIEWER_URL = new AppControlKey("PDF_VIEWER_URL", 36, "statements:pdf_viewer_url", "market://details?id=com.quickoffice.android");
        NOTIFICATION_FETCH_RETRIES = new AppControlKey("NOTIFICATION_FETCH_RETRIES", 37, "notification:fetch_retries", "3");
        WEBVIEW_VALID_BASE_URLS = new AppControlKey("WEBVIEW_VALID_BASE_URLS", 38, "webview:valid_base_urls", "gmail https://mail.google.com/");
        LOYALTY_DISCOVERABLE_PROGRAM_LOCATION_STALE_TIME = new AppControlKey("LOYALTY_DISCOVERABLE_PROGRAM_LOCATION_STALE_TIME", 39, "loyalty_discoverable_programs:stale_time_in_seconds", String.valueOf(TimeUnit.MINUTES.toSeconds(10L)));
        TAP_AND_PAY_FIND_MERCHANTS_URI = new AppControlKey("TAP_AND_PAY_FIND_MERCHANTS_URI", 40, "tap_and_pay:find_merchants", "http://m.mastercard.us/cardholder-services/paypass-locator.html");
        ADDRESS_AUTOCOMPLETE_API_KEY = new AppControlKey("ADDRESS_AUTOCOMPLETE_API_KEY", 41, "address_autocomplete:api_key", "AIzaSyD4GfakA4NP9ZwbgHRAzc3xxQ0ZF_7IaI8");
        ADDRESS_AUTOCOMPLETE_THRESHOLD_ADDRESS_LINE_1 = new AppControlKey("ADDRESS_AUTOCOMPLETE_THRESHOLD_ADDRESS_LINE_1", 42, "address_autocomplete:threshold_address_line_1", "4");
        ADDRESS_AUTOCOMPLETE_THRESHOLD_DEFAULT = new AppControlKey("ADDRESS_AUTOCOMPLETE_THRESHOLD_DEFAULT", 43, "address_autocomplete:threshold_default", "1");
        $VALUES = (new AppControlKey[] {
            CARD_BLOCKED_PHONE_NUMBER, CARD_PIN_PHONE_NUMBER, GLOBAL_RESOURCES_SYNC_REFRESH_RATE_MS, IMAGE_CACHE_MAX_MEMORY_FRACTION, PLASTIC_CARD_ACTIVATE_URL, PLASTIC_CARD_ORDER_URL, PURCHASE_RECORD_LIST_CACHE_TTL_MINS, RESPONSE_METADATA_HANDLING, TEST_ONLY_KEY, TOP_UP_AMOUNTS, 
            TOS_V2_LEGAL_DOC_TUPLE, TOS_V2_LATEST_PRIVACY_URL, GEOFENCING_NOTIFICATIONS_ENABLED, GEOFENCING_NOTIFICATIONS_RETRY_SERVER_CALL, GEOFENCING_NOTIFICATIONS_REFRESH_ZONES_ON_WOB_UPDATE, HERE_AND_NOW_CACHE_TTL_MINUTES, OCR_ENABLED, OCR_MODEL_BLACKLIST, WOBS_FULL_SYNC_ON_REFRESH, WOB_INSTANCE_BYTE_SIZE_LIMIT, 
            WOB_OCR_CAMERA_STOP_DELAY, WOBS_OCR_ENABLED, WOBS_OCR_BLOCKED_NETWORK_TYPES, WOBS_OCR_MODEL_BLACKLIST, WOBS_CONTINUOUS_PICTURE_FOCUS_MODE_MODEL_BLACKLIST, WOBS_AUTO_SNAP_MODEL_BLACKLIST, WOB_OCR_MAX_QPS, WOB_OCR_MAX_REQUESTS_PER_SCAN, WOB_OCR_MAX_ALLOWABLE_SERVER_ERRORS_PER_SCAN, WOB_OCR_TIMEOUT_AFTER_BARCODE_DETECTION, 
            GAIA_ACCOUNT_CHOOSER_URL, WHISKY_RESET_PIN_URL, WOB_EXTRA_ENTRY_POINTS, WOB_SHOW_SAVE_NOTIFICATION_SETTING, BANK_ACCOUNT_IAV_URL, CSI_SAMPLING_RATIO, PDF_VIEWER_URL, NOTIFICATION_FETCH_RETRIES, WEBVIEW_VALID_BASE_URLS, LOYALTY_DISCOVERABLE_PROGRAM_LOCATION_STALE_TIME, 
            TAP_AND_PAY_FIND_MERCHANTS_URI, ADDRESS_AUTOCOMPLETE_API_KEY, ADDRESS_AUTOCOMPLETE_THRESHOLD_ADDRESS_LINE_1, ADDRESS_AUTOCOMPLETE_THRESHOLD_DEFAULT
        });
    }
}
