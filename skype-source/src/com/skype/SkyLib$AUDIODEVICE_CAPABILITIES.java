// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype;

import android.support.v4.util.j;

// Referenced classes of package com.skype:
//            SkyLib

public static final class value extends Enum
{

    private static final value $VALUES[];
    public static final value CAN_BE_CHOSEN_IN_LOUD_SPEAKER_MODE;
    public static final value HAS_AUDIO_CAPTURE;
    public static final value HAS_AUDIO_RENDERING;
    public static final value HAS_BLUETOOTH_INTERFACE;
    public static final value HAS_LOWBANDWIDTH_CAPTURE;
    public static final value HAS_USB_INTERFACE;
    public static final value HAS_VIDEO_CAPTURE;
    public static final value HAS_VIDEO_RENDERING;
    public static final value IS_HEADSET;
    public static final value IS_WEBCAM;
    public static final value POSSIBLY_HEADSET;
    public static final value POSSIBLY_WEBCAM;
    public static final value WRAPPER_UNKNOWN_VALUE;
    private static final j intToTypeMap;
    private final int value;

    public static value fromInt(int i)
    {
        value value1 = (value)intToTypeMap.a(i);
        if (value1 != null)
        {
            return value1;
        } else
        {
            return WRAPPER_UNKNOWN_VALUE;
        }
    }

    public static WRAPPER_UNKNOWN_VALUE valueOf(String s)
    {
        return (WRAPPER_UNKNOWN_VALUE)Enum.valueOf(com/skype/SkyLib$AUDIODEVICE_CAPABILITIES, s);
    }

    public static WRAPPER_UNKNOWN_VALUE[] values()
    {
        return (WRAPPER_UNKNOWN_VALUE[])$VALUES.clone();
    }

    public final int toInt()
    {
        return value;
    }

    static 
    {
        HAS_VIDEO_CAPTURE = new <init>("HAS_VIDEO_CAPTURE", 0, 1);
        HAS_USB_INTERFACE = new <init>("HAS_USB_INTERFACE", 1, 2);
        POSSIBLY_HEADSET = new <init>("POSSIBLY_HEADSET", 2, 4);
        HAS_AUDIO_CAPTURE = new <init>("HAS_AUDIO_CAPTURE", 3, 8);
        HAS_AUDIO_RENDERING = new <init>("HAS_AUDIO_RENDERING", 4, 16);
        HAS_LOWBANDWIDTH_CAPTURE = new <init>("HAS_LOWBANDWIDTH_CAPTURE", 5, 32);
        IS_WEBCAM = new <init>("IS_WEBCAM", 6, 64);
        IS_HEADSET = new <init>("IS_HEADSET", 7, 128);
        POSSIBLY_WEBCAM = new <init>("POSSIBLY_WEBCAM", 8, 256);
        HAS_VIDEO_RENDERING = new <init>("HAS_VIDEO_RENDERING", 9, 2048);
        HAS_BLUETOOTH_INTERFACE = new <init>("HAS_BLUETOOTH_INTERFACE", 10, 4096);
        CAN_BE_CHOSEN_IN_LOUD_SPEAKER_MODE = new <init>("CAN_BE_CHOSEN_IN_LOUD_SPEAKER_MODE", 11, 8192);
        WRAPPER_UNKNOWN_VALUE = new <init>("WRAPPER_UNKNOWN_VALUE", 12, 0x7fffffff);
        $VALUES = (new .VALUES[] {
            HAS_VIDEO_CAPTURE, HAS_USB_INTERFACE, POSSIBLY_HEADSET, HAS_AUDIO_CAPTURE, HAS_AUDIO_RENDERING, HAS_LOWBANDWIDTH_CAPTURE, IS_WEBCAM, IS_HEADSET, POSSIBLY_WEBCAM, HAS_VIDEO_RENDERING, 
            HAS_BLUETOOTH_INTERFACE, CAN_BE_CHOSEN_IN_LOUD_SPEAKER_MODE, WRAPPER_UNKNOWN_VALUE
        });
        intToTypeMap = new j();
        value avalue[] = values();
        int k = avalue.length;
        for (int i = 0; i < k; i++)
        {
            value value1 = avalue[i];
            intToTypeMap.a(value1.value, value1);
        }

    }

    private (String s, int i, int k)
    {
        super(s, i);
        value = k;
    }
}
