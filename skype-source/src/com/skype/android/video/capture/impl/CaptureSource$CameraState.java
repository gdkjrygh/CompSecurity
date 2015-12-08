// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.video.capture.impl;


// Referenced classes of package com.skype.android.video.capture.impl:
//            CaptureSource

public static final class  extends Enum
{

    private static final INVALID $VALUES[];
    public static final INVALID CLOSED;
    public static final INVALID INVALID;
    public static final INVALID STARTED;
    public static final INVALID STOPPED;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/skype/android/video/capture/impl/CaptureSource$CameraState, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        STARTED = new <init>("STARTED", 0);
        STOPPED = new <init>("STOPPED", 1);
        CLOSED = new <init>("CLOSED", 2);
        INVALID = new <init>("INVALID", 3);
        $VALUES = (new .VALUES[] {
            STARTED, STOPPED, CLOSED, INVALID
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
