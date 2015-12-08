// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.analytics;

import afw;
import lx;

public final class SnapbryoAnalytics_Factory extends Enum
    implements afw
{

    private static final SnapbryoAnalytics_Factory $VALUES[];
    public static final SnapbryoAnalytics_Factory INSTANCE;

    private SnapbryoAnalytics_Factory(String s)
    {
        super(s, 0);
    }

    public static afw create()
    {
        return INSTANCE;
    }

    public static SnapbryoAnalytics_Factory valueOf(String s)
    {
        return (SnapbryoAnalytics_Factory)Enum.valueOf(com/snapchat/android/analytics/SnapbryoAnalytics_Factory, s);
    }

    public static SnapbryoAnalytics_Factory[] values()
    {
        return (SnapbryoAnalytics_Factory[])$VALUES.clone();
    }

    public final volatile Object get()
    {
        return get();
    }

    public final lx get()
    {
        return new lx();
    }

    static 
    {
        INSTANCE = new SnapbryoAnalytics_Factory("INSTANCE");
        $VALUES = (new SnapbryoAnalytics_Factory[] {
            INSTANCE
        });
    }
}
