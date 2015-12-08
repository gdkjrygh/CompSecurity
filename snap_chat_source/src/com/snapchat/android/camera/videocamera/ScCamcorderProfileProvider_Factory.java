// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.camera.videocamera;

import afw;
import rU;

public final class ScCamcorderProfileProvider_Factory extends Enum
    implements afw
{

    private static final ScCamcorderProfileProvider_Factory $VALUES[];
    public static final ScCamcorderProfileProvider_Factory INSTANCE;

    private ScCamcorderProfileProvider_Factory(String s)
    {
        super(s, 0);
    }

    public static afw create()
    {
        return INSTANCE;
    }

    public static ScCamcorderProfileProvider_Factory valueOf(String s)
    {
        return (ScCamcorderProfileProvider_Factory)Enum.valueOf(com/snapchat/android/camera/videocamera/ScCamcorderProfileProvider_Factory, s);
    }

    public static ScCamcorderProfileProvider_Factory[] values()
    {
        return (ScCamcorderProfileProvider_Factory[])$VALUES.clone();
    }

    public final volatile Object get()
    {
        return get();
    }

    public final rU get()
    {
        return new rU();
    }

    static 
    {
        INSTANCE = new ScCamcorderProfileProvider_Factory("INSTANCE");
        $VALUES = (new ScCamcorderProfileProvider_Factory[] {
            INSTANCE
        });
    }
}
