// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.cast.companionlibrary.cast;


// Referenced classes of package com.google.android.libraries.cast.companionlibrary.cast:
//            VideoCastManager

public static final class Y extends Enum
{

    private static final DEVICE $VALUES[];
    public static final DEVICE DEVICE;
    public static final DEVICE STREAM;

    public static Y valueOf(String s)
    {
        return (Y)Enum.valueOf(com/google/android/libraries/cast/companionlibrary/cast/VideoCastManager$VolumeType, s);
    }

    public static Y[] values()
    {
        return (Y[])$VALUES.clone();
    }

    static 
    {
        STREAM = new <init>("STREAM", 0);
        DEVICE = new <init>("DEVICE", 1);
        $VALUES = (new .VALUES[] {
            STREAM, DEVICE
        });
    }

    private Y(String s, int i)
    {
        super(s, i);
    }
}
