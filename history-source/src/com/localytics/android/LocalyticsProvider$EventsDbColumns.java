// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.localytics.android;

import android.provider.BaseColumns;

// Referenced classes of package com.localytics.android:
//            LocalyticsProvider

public static final class 
    implements BaseColumns
{

    public static final String CLV_INCREASE = "clv_increase";
    public static final String CUST_ID = "customer_id";
    public static final String EVENT_NAME = "event_name";
    public static final String IDENTIFIERS = "ids";
    public static final String LAT_NAME = "event_lat";
    public static final String LNG_NAME = "event_lng";
    public static final String REAL_TIME = "real_time";
    public static final String SESSION_KEY_REF = "session_key_ref";
    public static final String TABLE_NAME = "events";
    public static final String USER_TYPE = "user_type";
    public static final String UUID = "uuid";
    public static final String WALL_TIME = "wall_time";

    private ()
    {
        throw new UnsupportedOperationException("This class is non-instantiable");
    }
}
