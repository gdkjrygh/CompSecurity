// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.camera.model;

import afw;
import rj;

public final class FlashModel_Factory extends Enum
    implements afw
{

    private static final FlashModel_Factory $VALUES[];
    public static final FlashModel_Factory INSTANCE;

    private FlashModel_Factory(String s)
    {
        super(s, 0);
    }

    public static afw create()
    {
        return INSTANCE;
    }

    public static FlashModel_Factory valueOf(String s)
    {
        return (FlashModel_Factory)Enum.valueOf(com/snapchat/android/camera/model/FlashModel_Factory, s);
    }

    public static FlashModel_Factory[] values()
    {
        return (FlashModel_Factory[])$VALUES.clone();
    }

    public final volatile Object get()
    {
        return get();
    }

    public final rj get()
    {
        return new rj();
    }

    static 
    {
        INSTANCE = new FlashModel_Factory("INSTANCE");
        $VALUES = (new FlashModel_Factory[] {
            INSTANCE
        });
    }
}
