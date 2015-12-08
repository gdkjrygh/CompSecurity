// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.analytics;

import afw;
import lc;

public final class CashEventAnalytics_Factory extends Enum
    implements afw
{

    private static final CashEventAnalytics_Factory $VALUES[];
    public static final CashEventAnalytics_Factory INSTANCE;

    private CashEventAnalytics_Factory(String s)
    {
        super(s, 0);
    }

    public static afw create()
    {
        return INSTANCE;
    }

    public static CashEventAnalytics_Factory valueOf(String s)
    {
        return (CashEventAnalytics_Factory)Enum.valueOf(com/snapchat/android/analytics/CashEventAnalytics_Factory, s);
    }

    public static CashEventAnalytics_Factory[] values()
    {
        return (CashEventAnalytics_Factory[])$VALUES.clone();
    }

    public final volatile Object get()
    {
        return get();
    }

    public final lc get()
    {
        return new lc();
    }

    static 
    {
        INSTANCE = new CashEventAnalytics_Factory("INSTANCE");
        $VALUES = (new CashEventAnalytics_Factory[] {
            INSTANCE
        });
    }
}
