// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.video.capture;


// Referenced classes of package com.skype.android.video.capture:
//            LegacyCapturer

public static final class  extends Enum
{

    private static final SurfaceProvided $VALUES[];
    public static final SurfaceProvided CallbackEnabled;
    public static final SurfaceProvided StartRequested;
    public static final SurfaceProvided SurfaceProvided;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/skype/android/video/capture/LegacyCapturer$State$Flags, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        StartRequested = new <init>("StartRequested", 0);
        CallbackEnabled = new <init>("CallbackEnabled", 1);
        SurfaceProvided = new <init>("SurfaceProvided", 2);
        $VALUES = (new .VALUES[] {
            StartRequested, CallbackEnabled, SurfaceProvided
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
