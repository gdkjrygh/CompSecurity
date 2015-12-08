// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.inputs;


final class  extends Enum
{

    public static final WL_VIDEO_FRAME TAKE_SNAPSHOT;
    public static final WL_VIDEO_FRAME TEXTINPUT_VIDEO_FRAME;
    public static final WL_VIDEO_FRAME WL_VIDEO_FRAME;
    private static final WL_VIDEO_FRAME a[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/android/apps/translate/inputs/Camera2InputPopup$PausedFrameSource, s);
    }

    public static [] values()
    {
        return ([])a.clone();
    }

    static 
    {
        TAKE_SNAPSHOT = new <init>("TAKE_SNAPSHOT", 0);
        TEXTINPUT_VIDEO_FRAME = new <init>("TEXTINPUT_VIDEO_FRAME", 1);
        WL_VIDEO_FRAME = new <init>("WL_VIDEO_FRAME", 2);
        a = (new a[] {
            TAKE_SNAPSHOT, TEXTINPUT_VIDEO_FRAME, WL_VIDEO_FRAME
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
