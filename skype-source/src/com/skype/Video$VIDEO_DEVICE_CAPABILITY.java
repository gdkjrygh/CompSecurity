// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype;

import android.support.v4.util.j;

// Referenced classes of package com.skype:
//            Video

public static final class value extends Enum
{

    private static final value $VALUES[];
    public static final value VIDEOCAP_HQ_CAPABLE;
    public static final value VIDEOCAP_HQ_CERTIFIED;
    public static final value VIDEOCAP_REQ_DRIVERUPDATE;
    public static final value VIDEOCAP_USB_HIGHSPEED;
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
        return (WRAPPER_UNKNOWN_VALUE)Enum.valueOf(com/skype/Video$VIDEO_DEVICE_CAPABILITY, s);
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
        VIDEOCAP_HQ_CAPABLE = new <init>("VIDEOCAP_HQ_CAPABLE", 0, 0);
        VIDEOCAP_HQ_CERTIFIED = new <init>("VIDEOCAP_HQ_CERTIFIED", 1, 1);
        VIDEOCAP_REQ_DRIVERUPDATE = new <init>("VIDEOCAP_REQ_DRIVERUPDATE", 2, 2);
        VIDEOCAP_USB_HIGHSPEED = new <init>("VIDEOCAP_USB_HIGHSPEED", 3, 3);
        WRAPPER_UNKNOWN_VALUE = new <init>("WRAPPER_UNKNOWN_VALUE", 4, 0x7fffffff);
        $VALUES = (new .VALUES[] {
            VIDEOCAP_HQ_CAPABLE, VIDEOCAP_HQ_CERTIFIED, VIDEOCAP_REQ_DRIVERUPDATE, VIDEOCAP_USB_HIGHSPEED, WRAPPER_UNKNOWN_VALUE
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
