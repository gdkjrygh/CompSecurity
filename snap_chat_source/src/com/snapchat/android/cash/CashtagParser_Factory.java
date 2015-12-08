// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.cash;

import afw;
import sf;

public final class CashtagParser_Factory extends Enum
    implements afw
{

    private static final CashtagParser_Factory $VALUES[];
    public static final CashtagParser_Factory INSTANCE;

    private CashtagParser_Factory(String s)
    {
        super(s, 0);
    }

    public static afw create()
    {
        return INSTANCE;
    }

    public static CashtagParser_Factory valueOf(String s)
    {
        return (CashtagParser_Factory)Enum.valueOf(com/snapchat/android/cash/CashtagParser_Factory, s);
    }

    public static CashtagParser_Factory[] values()
    {
        return (CashtagParser_Factory[])$VALUES.clone();
    }

    public final volatile Object get()
    {
        return get();
    }

    public final sf get()
    {
        return new sf();
    }

    static 
    {
        INSTANCE = new CashtagParser_Factory("INSTANCE");
        $VALUES = (new CashtagParser_Factory[] {
            INSTANCE
        });
    }
}
