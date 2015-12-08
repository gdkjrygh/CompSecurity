// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.camera.model;

import afw;
import rl;

public final class ZoomModel_Factory extends Enum
    implements afw
{

    private static final ZoomModel_Factory $VALUES[];
    public static final ZoomModel_Factory INSTANCE;

    private ZoomModel_Factory(String s)
    {
        super(s, 0);
    }

    public static afw create()
    {
        return INSTANCE;
    }

    public static ZoomModel_Factory valueOf(String s)
    {
        return (ZoomModel_Factory)Enum.valueOf(com/snapchat/android/camera/model/ZoomModel_Factory, s);
    }

    public static ZoomModel_Factory[] values()
    {
        return (ZoomModel_Factory[])$VALUES.clone();
    }

    public final volatile Object get()
    {
        return get();
    }

    public final rl get()
    {
        return new rl();
    }

    static 
    {
        INSTANCE = new ZoomModel_Factory("INSTANCE");
        $VALUES = (new ZoomModel_Factory[] {
            INSTANCE
        });
    }
}
