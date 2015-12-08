// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.localytics.android;


// Referenced classes of package com.localytics.android:
//            DatapointHelper

class Constants
{

    public static String ANALYTICS_URL = "analytics.localytics.com";
    static final String CLOSE_EVENT = String.format("%s:%s", new Object[] {
        "com.localytics.android", "close"
    });
    static final int CURRENT_API_LEVEL = DatapointHelper.getApiLevel();
    static final String EVENT_FORMAT = "%s:%s";
    static final String FLOW_EVENT = String.format("%s:%s", new Object[] {
        "com.localytics.android", "flow"
    });
    public static final boolean IS_DEVICE_IDENTIFIER_UPLOADED = true;
    public static final boolean IS_EXCEPTION_SUPPRESSION_ENABLED = true;
    public static boolean IS_LOGGABLE = false;
    public static final boolean IS_PARAMETER_CHECKING_ENABLED = true;
    public static final String LOCALYTICS_CLIENT_LIBRARY_VERSION = "androida_2.72";
    public static final String LOCALYTICS_METADATA_APP_KEY = "LOCALYTICS_APP_KEY";
    public static final String LOCALYTICS_METADATA_NOTIFICATION_ICON = "LOCALYTICS_NOTIFICATION_ICON";
    public static final String LOCALYTICS_METADATA_ROLLUP_KEY = "LOCALYTICS_ROLLUP_KEY";
    public static final String LOCALYTICS_PACKAGE_NAME = "com.localytics.android";
    public static final String LOG_TAG = "Localytics";
    public static final int MAX_CUSTOM_DIMENSIONS = 10;
    public static final int MAX_NAME_LENGTH = 128;
    public static final int MAX_NUM_ATTRIBUTES = 50;
    public static final int MAX_NUM_SESSIONS = 10;
    public static final int MAX_VALUE_LENGTH = 255;
    static final String OPEN_EVENT = String.format("%s:%s", new Object[] {
        "com.localytics.android", "open"
    });
    static final String OPT_IN_EVENT = String.format("%s:%s", new Object[] {
        "com.localytics.android", "opt_in"
    });
    static final String OPT_OUT_EVENT = String.format("%s:%s", new Object[] {
        "com.localytics.android", "opt_out"
    });
    public static String PROFILES_URL = "profile.localytics.com";
    public static long SESSION_EXPIRATION = 15000L;
    public static boolean USE_HTTPS = true;

    protected Constants()
    {
        throw new UnsupportedOperationException("This class is non-instantiable");
    }

    static 
    {
        IS_LOGGABLE = false;
    }
}
