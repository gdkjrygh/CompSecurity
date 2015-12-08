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
    public static final value VIDEO_DEVICE_CAPTURE_ADAPTER;
    public static final value VIDEO_DEVICE_SR_AUGMENTED;
    public static final value VIDEO_DEVICE_USB_CAMERA;
    public static final value VIDEO_DEVICE_VIRTUAL;
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
        return (WRAPPER_UNKNOWN_VALUE)Enum.valueOf(com/skype/SkyLib$VIDEO_DEVICE_TYPE, s);
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
        VIDEO_DEVICE_USB_CAMERA = new <init>("VIDEO_DEVICE_USB_CAMERA", 0, 0);
        VIDEO_DEVICE_CAPTURE_ADAPTER = new <init>("VIDEO_DEVICE_CAPTURE_ADAPTER", 1, 1);
        VIDEO_DEVICE_VIRTUAL = new <init>("VIDEO_DEVICE_VIRTUAL", 2, 2);
        VIDEO_DEVICE_SR_AUGMENTED = new <init>("VIDEO_DEVICE_SR_AUGMENTED", 3, 5);
        WRAPPER_UNKNOWN_VALUE = new <init>("WRAPPER_UNKNOWN_VALUE", 4, 0x7fffffff);
        $VALUES = (new .VALUES[] {
            VIDEO_DEVICE_USB_CAMERA, VIDEO_DEVICE_CAPTURE_ADAPTER, VIDEO_DEVICE_VIRTUAL, VIDEO_DEVICE_SR_AUGMENTED, WRAPPER_UNKNOWN_VALUE
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
