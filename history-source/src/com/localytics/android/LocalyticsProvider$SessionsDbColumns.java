// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.localytics.android;

import android.provider.BaseColumns;

// Referenced classes of package com.localytics.android:
//            LocalyticsProvider

public static final class A
    implements BaseColumns
{

    public static final String ANDROID_SDK = "android_sdk";
    public static final String ANDROID_VERSION = "android_version";
    public static final String API_KEY_REF = "api_key_ref";
    public static final String APP_VERSION = "app_version";
    public static final String DEVICE_ADVERTISING_ID = "device_advertising_id";
    public static final String DEVICE_ANDROID_ID = "device_android_id";
    public static final String DEVICE_ANDROID_ID_HASH = "device_android_id_hash";
    public static final String DEVICE_COUNTRY = "device_country";
    public static final String DEVICE_MANUFACTURER = "device_manufacturer";
    public static final String DEVICE_MODEL = "device_model";
    public static final String DEVICE_SERIAL_NUMBER_HASH = "device_serial_number_hash";
    public static final String DEVICE_TELEPHONY_ID = "device_telephony_id";
    public static final String DEVICE_TELEPHONY_ID_HASH = "device_telephony_id_hash";
    public static final String DEVICE_WIFI_MAC_HASH = "device_wifi_mac_hash";
    public static final String ELAPSED_TIME_SINCE_LAST_SESSION = "elapsed";
    public static final String LATITUDE = "latitude";
    public static final String LOCALE_COUNTRY = "locale_country";
    public static final String LOCALE_LANGUAGE = "locale_language";
    public static final String LOCALYTICS_INSTALLATION_ID = "iu";
    public static final String LOCALYTICS_LIBRARY_VERSION = "localytics_library_version";
    public static final String LONGITUDE = "longitude";
    public static final String NETWORK_CARRIER = "network_carrier";
    public static final String NETWORK_COUNTRY = "network_country";
    public static final String NETWORK_TYPE = "network_type";
    public static final String SESSION_START_WALL_TIME = "session_start_wall_time";
    public static final String TABLE_NAME = "sessions";
    public static final String UUID = "uuid";

    private A()
    {
        throw new UnsupportedOperationException("This class is non-instantiable");
    }
}
