// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.localytics.android;

import android.provider.BaseColumns;

// Referenced classes of package com.localytics.android:
//            LocalyticsProvider

public static final class I
    implements BaseColumns
{

    static final String CUSTOM_DIMENSION_1 = String.format("%s:%s", new Object[] {
        "com.localytics.android", "custom_dimension_0"
    });
    static final String CUSTOM_DIMENSION_10 = String.format("%s:%s", new Object[] {
        "com.localytics.android", "custom_dimension_9"
    });
    static final String CUSTOM_DIMENSION_2 = String.format("%s:%s", new Object[] {
        "com.localytics.android", "custom_dimension_1"
    });
    static final String CUSTOM_DIMENSION_3 = String.format("%s:%s", new Object[] {
        "com.localytics.android", "custom_dimension_2"
    });
    static final String CUSTOM_DIMENSION_4 = String.format("%s:%s", new Object[] {
        "com.localytics.android", "custom_dimension_3"
    });
    static final String CUSTOM_DIMENSION_5 = String.format("%s:%s", new Object[] {
        "com.localytics.android", "custom_dimension_4"
    });
    static final String CUSTOM_DIMENSION_6 = String.format("%s:%s", new Object[] {
        "com.localytics.android", "custom_dimension_5"
    });
    static final String CUSTOM_DIMENSION_7 = String.format("%s:%s", new Object[] {
        "com.localytics.android", "custom_dimension_6"
    });
    static final String CUSTOM_DIMENSION_8 = String.format("%s:%s", new Object[] {
        "com.localytics.android", "custom_dimension_7"
    });
    static final String CUSTOM_DIMENSION_9 = String.format("%s:%s", new Object[] {
        "com.localytics.android", "custom_dimension_8"
    });
    static final String CUSTOM_DIMENSION_FORMAT = "%s:%s";
    public static final String CUSTOM_DIMENSION_KEY = "custom_dimension_key";
    public static final String CUSTOM_DIMENSION_VALUE = "custom_dimension_value";
    public static final String TABLE_NAME = "custom_dimensions";


    private I()
    {
        throw new UnsupportedOperationException("This class is non-instantiable");
    }
}
