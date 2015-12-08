// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.api2;

import afw;
import lX;

public final class ApiTaskFactory_Factory extends Enum
    implements afw
{

    private static final ApiTaskFactory_Factory $VALUES[];
    public static final ApiTaskFactory_Factory INSTANCE;

    private ApiTaskFactory_Factory(String s)
    {
        super(s, 0);
    }

    public static afw create()
    {
        return INSTANCE;
    }

    public static ApiTaskFactory_Factory valueOf(String s)
    {
        return (ApiTaskFactory_Factory)Enum.valueOf(com/snapchat/android/api2/ApiTaskFactory_Factory, s);
    }

    public static ApiTaskFactory_Factory[] values()
    {
        return (ApiTaskFactory_Factory[])$VALUES.clone();
    }

    public final volatile Object get()
    {
        return get();
    }

    public final lX get()
    {
        return new lX();
    }

    static 
    {
        INSTANCE = new ApiTaskFactory_Factory("INSTANCE");
        $VALUES = (new ApiTaskFactory_Factory[] {
            INSTANCE
        });
    }
}
