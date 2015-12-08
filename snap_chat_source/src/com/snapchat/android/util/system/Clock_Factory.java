// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.util.system;

import PB;
import afw;

public final class Clock_Factory extends Enum
    implements afw
{

    private static final Clock_Factory $VALUES[];
    public static final Clock_Factory INSTANCE;

    private Clock_Factory(String s)
    {
        super(s, 0);
    }

    public static afw create()
    {
        return INSTANCE;
    }

    public static Clock_Factory valueOf(String s)
    {
        return (Clock_Factory)Enum.valueOf(com/snapchat/android/util/system/Clock_Factory, s);
    }

    public static Clock_Factory[] values()
    {
        return (Clock_Factory[])$VALUES.clone();
    }

    public final PB get()
    {
        return new PB();
    }

    public final volatile Object get()
    {
        return get();
    }

    static 
    {
        INSTANCE = new Clock_Factory("INSTANCE");
        $VALUES = (new Clock_Factory[] {
            INSTANCE
        });
    }
}
