// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.util;

import Jj;
import com.snapchat.android.util.debug.ReleaseManager;

public final class Property extends Enum
{

    private static final Property $VALUES[];
    public static final Property ENABLE_CURSOR_ADAPTER;
    public static final Property ENABLE_GEOFILTER_LOGGING;
    public static final Property ENABLE_SNAPSCAN_DEBUG;
    public static final Property ENABLE_USER_INIT_DELAY;
    private final String mDefaultValue;
    private final String mKey;

    private Property(String s, int i, String s1)
    {
        this(s, i, s1, (byte)0);
    }

    private Property(String s, int i, String s1, byte byte0)
    {
        super(s, i);
        mKey = s1;
        mDefaultValue = null;
    }

    public static Property valueOf(String s)
    {
        return (Property)Enum.valueOf(com/snapchat/android/util/Property, s);
    }

    public static Property[] values()
    {
        return (Property[])$VALUES.clone();
    }

    public final String get()
    {
        if (ReleaseManager.f())
        {
            return Jj.a(mKey, mDefaultValue);
        } else
        {
            return null;
        }
    }

    public final boolean getBoolean()
    {
        return Boolean.valueOf(get()).booleanValue();
    }

    static 
    {
        ENABLE_GEOFILTER_LOGGING = new Property("ENABLE_GEOFILTER_LOGGING", 0, "debug.sc.geofilter_logging");
        ENABLE_USER_INIT_DELAY = new Property("ENABLE_USER_INIT_DELAY", 1, "debug.sc.user_init_delay");
        ENABLE_CURSOR_ADAPTER = new Property("ENABLE_CURSOR_ADAPTER", 2, "debug.sc.cursor_adapter");
        ENABLE_SNAPSCAN_DEBUG = new Property("ENABLE_SNAPSCAN_DEBUG", 3, "debug.sc.enable_snapscan_debug");
        $VALUES = (new Property[] {
            ENABLE_GEOFILTER_LOGGING, ENABLE_USER_INIT_DELAY, ENABLE_CURSOR_ADAPTER, ENABLE_SNAPSCAN_DEBUG
        });
    }
}
