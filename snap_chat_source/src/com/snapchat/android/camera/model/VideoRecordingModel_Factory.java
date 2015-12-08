// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.camera.model;

import afw;
import rk;

public final class VideoRecordingModel_Factory extends Enum
    implements afw
{

    private static final VideoRecordingModel_Factory $VALUES[];
    public static final VideoRecordingModel_Factory INSTANCE;

    private VideoRecordingModel_Factory(String s)
    {
        super(s, 0);
    }

    public static afw create()
    {
        return INSTANCE;
    }

    public static VideoRecordingModel_Factory valueOf(String s)
    {
        return (VideoRecordingModel_Factory)Enum.valueOf(com/snapchat/android/camera/model/VideoRecordingModel_Factory, s);
    }

    public static VideoRecordingModel_Factory[] values()
    {
        return (VideoRecordingModel_Factory[])$VALUES.clone();
    }

    public final volatile Object get()
    {
        return get();
    }

    public final rk get()
    {
        return new rk();
    }

    static 
    {
        INSTANCE = new VideoRecordingModel_Factory("INSTANCE");
        $VALUES = (new VideoRecordingModel_Factory[] {
            INSTANCE
        });
    }
}
