// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.analytics.tracking.android;


class AnalyticsConstants
{

    static final String ANALYTICS_PATH_INSECURE = "http://www.google-analytics.com/collect";
    static final String ANALYTICS_PATH_SECURE = "https://ssl.google-analytics.com/collect";
    static final String CLIENT_ID_FILE = "gaClientId";
    static final long DATABASE_RECOVERY_TIMEOUT_MS = 0x36ee80L;
    static final String HIT_URL_MODEL_FIELD = "internalHitUrl";
    static final String INSTALL_DATA_FILE = "gaInstallData";
    static final int MAX_GET_LENGTH = 2036;
    static final int MAX_NUM_STORED_HITS = 2000;
    static final int MAX_POST_LENGTH = 8192;
    static final int MAX_REQUESTS_PER_DISPATCH = 40;
    static final long MILLISECONDS_PER_DAY = 0x5265c00L;
    static final long MILLISECONDS_PER_HOUR = 0x36ee80L;
    static final long MILLISECONDS_PER_MINUTE = 60000L;
    static final long MILLISECONDS_PER_MONTH = 0x9a7ec800L;
    static final String OPTOUT_ID = "com.google.analytics.optout";
    static final int OPTOUT_TIME_CHECK_IN_SECONDS = 300;
    static final String OPT_OUT_FILE = "gaOptOut";
    static final String PRODUCT = "GoogleAnalytics";
    static final String VERSION = "2.0";

    AnalyticsConstants()
    {
    }
}
