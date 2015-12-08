// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.api2.cash;

import afw;
import nm;

public final class ScProvider_Factory extends Enum
    implements afw
{

    private static final ScProvider_Factory $VALUES[];
    public static final ScProvider_Factory INSTANCE;

    private ScProvider_Factory(String s)
    {
        super(s, 0);
    }

    public static afw create()
    {
        return INSTANCE;
    }

    public static ScProvider_Factory valueOf(String s)
    {
        return (ScProvider_Factory)Enum.valueOf(com/snapchat/android/api2/cash/ScProvider_Factory, s);
    }

    public static ScProvider_Factory[] values()
    {
        return (ScProvider_Factory[])$VALUES.clone();
    }

    public final volatile Object get()
    {
        return get();
    }

    public final nm get()
    {
        return new nm();
    }

    static 
    {
        INSTANCE = new ScProvider_Factory("INSTANCE");
        $VALUES = (new ScProvider_Factory[] {
            INSTANCE
        });
    }
}
