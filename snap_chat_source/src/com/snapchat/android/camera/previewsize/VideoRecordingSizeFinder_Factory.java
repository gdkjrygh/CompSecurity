// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.camera.previewsize;

import afw;
import rq;

public final class VideoRecordingSizeFinder_Factory extends Enum
    implements afw
{

    private static final VideoRecordingSizeFinder_Factory $VALUES[];
    public static final VideoRecordingSizeFinder_Factory INSTANCE;

    private VideoRecordingSizeFinder_Factory(String s)
    {
        super(s, 0);
    }

    public static afw create()
    {
        return INSTANCE;
    }

    public static VideoRecordingSizeFinder_Factory valueOf(String s)
    {
        return (VideoRecordingSizeFinder_Factory)Enum.valueOf(com/snapchat/android/camera/previewsize/VideoRecordingSizeFinder_Factory, s);
    }

    public static VideoRecordingSizeFinder_Factory[] values()
    {
        return (VideoRecordingSizeFinder_Factory[])$VALUES.clone();
    }

    public final volatile Object get()
    {
        return get();
    }

    public final rq get()
    {
        return new rq();
    }

    static 
    {
        INSTANCE = new VideoRecordingSizeFinder_Factory("INSTANCE");
        $VALUES = (new VideoRecordingSizeFinder_Factory[] {
            INSTANCE
        });
    }
}
