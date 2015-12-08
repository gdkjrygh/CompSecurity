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
    public static final value QTT_AUDIO_IN;
    public static final value QTT_AUDIO_OUT;
    public static final value QTT_CPU;
    public static final value QTT_NETWORK;
    public static final value QTT_VIDEO_IN;
    public static final value QTT_VIDEO_OUT;
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
        return (WRAPPER_UNKNOWN_VALUE)Enum.valueOf(com/skype/SkyLib$QUALITYTESTTYPE, s);
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
        QTT_AUDIO_IN = new <init>("QTT_AUDIO_IN", 0, 0);
        QTT_AUDIO_OUT = new <init>("QTT_AUDIO_OUT", 1, 1);
        QTT_VIDEO_OUT = new <init>("QTT_VIDEO_OUT", 2, 2);
        QTT_CPU = new <init>("QTT_CPU", 3, 3);
        QTT_NETWORK = new <init>("QTT_NETWORK", 4, 4);
        QTT_VIDEO_IN = new <init>("QTT_VIDEO_IN", 5, 5);
        WRAPPER_UNKNOWN_VALUE = new <init>("WRAPPER_UNKNOWN_VALUE", 6, 0x7fffffff);
        $VALUES = (new .VALUES[] {
            QTT_AUDIO_IN, QTT_AUDIO_OUT, QTT_VIDEO_OUT, QTT_CPU, QTT_NETWORK, QTT_VIDEO_IN, WRAPPER_UNKNOWN_VALUE
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
