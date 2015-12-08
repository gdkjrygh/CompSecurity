// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.util.debug;

import LB;
import afw;

public final class ExceptionReporter_Factory extends Enum
    implements afw
{

    private static final ExceptionReporter_Factory $VALUES[];
    public static final ExceptionReporter_Factory INSTANCE;

    private ExceptionReporter_Factory(String s)
    {
        super(s, 0);
    }

    public static afw create()
    {
        return INSTANCE;
    }

    public static ExceptionReporter_Factory valueOf(String s)
    {
        return (ExceptionReporter_Factory)Enum.valueOf(com/snapchat/android/util/debug/ExceptionReporter_Factory, s);
    }

    public static ExceptionReporter_Factory[] values()
    {
        return (ExceptionReporter_Factory[])$VALUES.clone();
    }

    public final LB get()
    {
        return new LB();
    }

    public final volatile Object get()
    {
        return get();
    }

    static 
    {
        INSTANCE = new ExceptionReporter_Factory("INSTANCE");
        $VALUES = (new ExceptionReporter_Factory[] {
            INSTANCE
        });
    }
}
