// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.api2.cash;

import afw;
import na;

public final class CashErrorReporter_Factory extends Enum
    implements afw
{

    private static final CashErrorReporter_Factory $VALUES[];
    public static final CashErrorReporter_Factory INSTANCE;

    private CashErrorReporter_Factory(String s)
    {
        super(s, 0);
    }

    public static afw create()
    {
        return INSTANCE;
    }

    public static CashErrorReporter_Factory valueOf(String s)
    {
        return (CashErrorReporter_Factory)Enum.valueOf(com/snapchat/android/api2/cash/CashErrorReporter_Factory, s);
    }

    public static CashErrorReporter_Factory[] values()
    {
        return (CashErrorReporter_Factory[])$VALUES.clone();
    }

    public final volatile Object get()
    {
        return get();
    }

    public final na get()
    {
        return new na();
    }

    static 
    {
        INSTANCE = new CashErrorReporter_Factory("INSTANCE");
        $VALUES = (new CashErrorReporter_Factory[] {
            INSTANCE
        });
    }
}
