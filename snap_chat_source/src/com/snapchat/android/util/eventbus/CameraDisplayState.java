// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.util.eventbus;


public final class CameraDisplayState extends Enum
{

    private static final CameraDisplayState $VALUES[];
    public static final CameraDisplayState CLOSE;
    public static final CameraDisplayState SHOW;
    public static final CameraDisplayState SHOW_WITHOUT_DECOR;

    private CameraDisplayState(String s, int i)
    {
        super(s, i);
    }

    public static CameraDisplayState valueOf(String s)
    {
        return (CameraDisplayState)Enum.valueOf(com/snapchat/android/util/eventbus/CameraDisplayState, s);
    }

    public static CameraDisplayState[] values()
    {
        return (CameraDisplayState[])$VALUES.clone();
    }

    static 
    {
        SHOW = new CameraDisplayState("SHOW", 0);
        SHOW_WITHOUT_DECOR = new CameraDisplayState("SHOW_WITHOUT_DECOR", 1);
        CLOSE = new CameraDisplayState("CLOSE", 2);
        $VALUES = (new CameraDisplayState[] {
            SHOW, SHOW_WITHOUT_DECOR, CLOSE
        });
    }
}
