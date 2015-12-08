// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.camera.videocamera;


// Referenced classes of package com.snapchat.android.camera.videocamera:
//            VideoCameraHandler

public static final class a extends Enum
{

    private static final RECORDING_TOO_SHORT $VALUES[];
    public static final RECORDING_TOO_SHORT CAMERA_UNLOCK_EXCEPTION;
    public static final RECORDING_TOO_SHORT EXCEPTION_ON_START;
    public static final RECORDING_TOO_SHORT EXCEPTION_ON_STOP;
    public static final RECORDING_TOO_SHORT INITIALIZATION_ERROR;
    public static final RECORDING_TOO_SHORT NO_SURFACE_PROVIDED;
    public static final RECORDING_TOO_SHORT RECORDING_TOO_SHORT;
    public static final RECORDING_TOO_SHORT VIDEO_STORAGE_EXCEPTION;
    private int a;

    public static a valueOf(String s)
    {
        return (a)Enum.valueOf(com/snapchat/android/camera/videocamera/VideoCameraHandler$VideoFailureType, s);
    }

    public static a[] values()
    {
        return (a[])$VALUES.clone();
    }

    public final int getValue()
    {
        return a;
    }

    static 
    {
        VIDEO_STORAGE_EXCEPTION = new <init>("VIDEO_STORAGE_EXCEPTION", 0, 0);
        CAMERA_UNLOCK_EXCEPTION = new <init>("CAMERA_UNLOCK_EXCEPTION", 1, 1);
        EXCEPTION_ON_START = new <init>("EXCEPTION_ON_START", 2, 2);
        EXCEPTION_ON_STOP = new <init>("EXCEPTION_ON_STOP", 3, 3);
        INITIALIZATION_ERROR = new <init>("INITIALIZATION_ERROR", 4, 4);
        NO_SURFACE_PROVIDED = new <init>("NO_SURFACE_PROVIDED", 5, 5);
        RECORDING_TOO_SHORT = new <init>("RECORDING_TOO_SHORT", 6, 6);
        $VALUES = (new .VALUES[] {
            VIDEO_STORAGE_EXCEPTION, CAMERA_UNLOCK_EXCEPTION, EXCEPTION_ON_START, EXCEPTION_ON_STOP, INITIALIZATION_ERROR, NO_SURFACE_PROVIDED, RECORDING_TOO_SHORT
        });
    }

    private Q(String s, int i, int j)
    {
        super(s, i);
        a = j;
    }
}
