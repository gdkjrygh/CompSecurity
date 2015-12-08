// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.localytics.android;


final class JsonObjects
{
    public static final class BlobHeader
    {

        public static final String KEY_ATTRIBUTES = "attrs";
        public static final String KEY_DATA_TYPE = "dt";
        public static final String KEY_IDENTIFIERS = "ids";
        public static final String KEY_PERSISTENT_STORAGE_CREATION_TIME_SECONDS = "pa";
        public static final String KEY_SEQUENCE_NUMBER = "seq";
        public static final String KEY_UNIQUE_ID = "u";
        public static final String VALUE_DATA_TYPE = "h";

        private BlobHeader()
        {
            throw new UnsupportedOperationException("This class is non-instantiable");
        }
    }

    public static final class BlobHeader.Attributes
    {

        public static final String KEY_CLIENT_APP_VERSION = "av";
        public static final String KEY_CURRENT_ADVERTISING_ID = "gcadid";
        public static final String KEY_CURRENT_ANDROID_ID = "caid";
        public static final String KEY_CURRENT_TELEPHONY_ID = "ctdid";
        public static final String KEY_DATA_CONNECTION = "dac";
        public static final String KEY_DEVICE_ADVERTISING_ID = "gadid";
        public static final String KEY_DEVICE_ANDROID_ID = "aid";
        public static final String KEY_DEVICE_ANDROID_ID_HASH = "du";
        public static final String KEY_DEVICE_COUNTRY = "dc";
        public static final String KEY_DEVICE_MANUFACTURER = "dma";
        public static final String KEY_DEVICE_MODEL = "dmo";
        public static final String KEY_DEVICE_OS_VERSION = "dov";
        public static final String KEY_DEVICE_PLATFORM = "dp";
        public static final String KEY_DEVICE_SDK_LEVEL = "dsdk";
        public static final String KEY_DEVICE_SERIAL_HASH = "dms";
        public static final String KEY_DEVICE_TELEPHONY_ID = "tdid";
        public static final String KEY_DEVICE_TELEPHONY_ID_HASH = "dtidh";
        public static final String KEY_FB_COOKIE = "fbat";
        public static final String KEY_GOOGLE_PLAY_ATTRIBUTION = "aurl";
        public static final String KEY_LOCALE_COUNTRY = "dlc";
        public static final String KEY_LOCALE_LANGUAGE = "dll";
        public static final String KEY_LOCALYTICS_API_KEY = "au";
        public static final String KEY_LOCALYTICS_CLIENT_LIBRARY_VERSION = "lv";
        public static final String KEY_LOCALYTICS_DATA_TYPE = "dt";
        public static final String KEY_LOCALYTICS_INSTALLATION_ID = "iu";
        public static final String KEY_NETWORK_CARRIER = "nca";
        public static final String KEY_NETWORK_COUNTRY = "nc";
        public static final String KEY_PACKAGE_NAME = "pkg";
        public static final String KEY_PUSH_ID = "push";
        public static final String VALUE_DATA_TYPE = "a";
        public static final String VALUE_PLATFORM = "Android";

        private BlobHeader.Attributes()
        {
            throw new UnsupportedOperationException("This class is non-instantiable");
        }
    }

    public static final class BlobHeader.Identifiers
    {

        public static final String KEY = "key";

        private BlobHeader.Identifiers()
        {
            throw new UnsupportedOperationException("This class is non-instantiable");
        }
    }

    static final class EventFlow
    {

        public static final String KEY_DATA_TYPE = "dt";
        public static final String KEY_EVENT_UUID = "u";
        public static final String KEY_FLOW_NEW = "nw";
        public static final String KEY_FLOW_OLD = "od";
        public static final String KEY_SESSION_START_TIME = "ss";
        public static final String VALUE_DATA_TYPE = "f";

        private EventFlow()
        {
            throw new UnsupportedOperationException("This class is non-instantiable");
        }
    }

    static final class EventFlow.Element
    {

        public static final String TYPE_EVENT = "e";
        public static final String TYPE_SCREEN = "s";

        private EventFlow.Element()
        {
            throw new UnsupportedOperationException("This class is non-instantiable");
        }
    }

    static final class OptEvent
    {

        public static final String KEY_API_KEY = "u";
        public static final String KEY_DATA_TYPE = "dt";
        public static final String KEY_OPT = "out";
        public static final String KEY_WALL_TIME_SECONDS = "ct";
        public static final String VALUE_DATA_TYPE = "o";

        private OptEvent()
        {
            throw new UnsupportedOperationException("This class is non-instantiable");
        }
    }

    static final class ProfileUpload
    {

        public static final String KEY_JSON_ATTRIBUTE = "attributes";

        private ProfileUpload()
        {
            throw new UnsupportedOperationException("This class is non-instantiable");
        }
    }

    static final class SessionClose
    {

        public static final String KEY_CUSTOM_DIMENSION_1 = "c0";
        public static final String KEY_CUSTOM_DIMENSION_2 = "c1";
        public static final String KEY_CUSTOM_DIMENSION_3 = "c2";
        public static final String KEY_CUSTOM_DIMENSION_4 = "c3";
        public static final String KEY_DATA_TYPE = "dt";
        public static final String KEY_EVENT_UUID = "u";
        public static final String KEY_FLOW_ARRAY = "fl";
        public static final String KEY_SESSION_LENGTH_SECONDS = "ctl";
        public static final String KEY_SESSION_START_TIME = "ss";
        public static final String KEY_SESSION_UUID = "su";
        public static final String KEY_WALL_TIME_SECONDS = "ct";
        public static final String VALUE_DATA_TYPE = "c";

        private SessionClose()
        {
            throw new UnsupportedOperationException("This class is non-instantiable");
        }
    }

    static final class SessionEvent
    {

        public static final String CUST_ID = "cid";
        public static final String IDENTIFIERS = "ids";
        public static final String KEY_ATTRIBUTES = "attrs";
        public static final String KEY_CUSTOMER_VALUE_INCREASE = "v";
        public static final String KEY_CUSTOM_DIMENSION_1 = "c0";
        public static final String KEY_CUSTOM_DIMENSION_2 = "c1";
        public static final String KEY_CUSTOM_DIMENSION_3 = "c2";
        public static final String KEY_CUSTOM_DIMENSION_4 = "c3";
        public static final String KEY_DATA_TYPE = "dt";
        public static final String KEY_EVENT_UUID = "u";
        public static final String KEY_LATITUDE = "lat";
        public static final String KEY_LONGITUDE = "lng";
        public static final String KEY_NAME = "n";
        public static final String KEY_SESSION_UUID = "su";
        public static final String KEY_WALL_TIME_SECONDS = "ct";
        public static final String USER_TYPE = "utp";
        public static final String VALUE_DATA_TYPE = "e";

        private SessionEvent()
        {
            throw new UnsupportedOperationException("This class is non-instantiable");
        }
    }

    static final class SessionOpen
    {

        public static final String KEY_COUNT = "nth";
        public static final String KEY_CUSTOM_DIMENSION_1 = "c0";
        public static final String KEY_CUSTOM_DIMENSION_10 = "c9";
        public static final String KEY_CUSTOM_DIMENSION_2 = "c1";
        public static final String KEY_CUSTOM_DIMENSION_3 = "c2";
        public static final String KEY_CUSTOM_DIMENSION_4 = "c3";
        public static final String KEY_CUSTOM_DIMENSION_5 = "c4";
        public static final String KEY_CUSTOM_DIMENSION_6 = "c5";
        public static final String KEY_CUSTOM_DIMENSION_7 = "c6";
        public static final String KEY_CUSTOM_DIMENSION_8 = "c7";
        public static final String KEY_CUSTOM_DIMENSION_9 = "c8";
        public static final String KEY_DATA_TYPE = "dt";
        public static final String KEY_EVENT_UUID = "u";
        public static final String KEY_TIME_SINCE_LAST = "sl";
        public static final String KEY_WALL_TIME_SECONDS = "ct";
        public static final String VALUE_DATA_TYPE = "s";

        private SessionOpen()
        {
            throw new UnsupportedOperationException("This class is non-instantiable");
        }
    }


    private JsonObjects()
    {
        throw new UnsupportedOperationException("This class is non-instantiable");
    }
}
