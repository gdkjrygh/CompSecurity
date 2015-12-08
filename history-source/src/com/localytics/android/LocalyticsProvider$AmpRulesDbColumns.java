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

    public static final String AB_TEST = "ab_test";
    public static final String CAMPAIGN_ID = "campaign_id";
    public static final String DEVICES = "devices";
    public static final String DISPLAY_SECONDS = "display_seconds";
    public static final String DISPLAY_SESSION = "display_session";
    public static final String EXPIRATION = "expiration";
    public static final String INTERNET_REQUIRED = "internet_required";
    public static final String LOCATION = "location";
    public static final String PHONE_LOCATION = "phone_location";
    public static final String PHONE_SIZE_HEIGHT = "phone_size_height";
    public static final String PHONE_SIZE_WIDTH = "phone_size_width";
    public static final String RULE_NAME = "rule_name";
    public static final String TABLET_LOCATION = "tablet_location";
    public static final String TABLET_SIZE_HEIGHT = "tablet_size_height";
    public static final String TABLET_SIZE_WIDTH = "tablet_size_width";
    public static final String TABLE_NAME = "amp_rules";
    public static final String TIME_TO_DISPLAY = "time_to_display";
    public static final String VERSION = "version";

    private A()
    {
        throw new UnsupportedOperationException("This class is non-instantiable");
    }
}
