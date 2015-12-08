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
    public static final value OM_3G;
    public static final value OM_4G;
    public static final value OM_FREE;
    public static final value OM_FREE_WIRELESS;
    public static final value OM_UNKNOWN;
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
        return (WRAPPER_UNKNOWN_VALUE)Enum.valueOf(com/skype/SkyLib$OPERATING_MEDIA, s);
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
        OM_UNKNOWN = new <init>("OM_UNKNOWN", 0, 0);
        OM_FREE = new <init>("OM_FREE", 1, 1);
        OM_FREE_WIRELESS = new <init>("OM_FREE_WIRELESS", 2, 2);
        OM_3G = new <init>("OM_3G", 3, 3);
        OM_4G = new <init>("OM_4G", 4, 4);
        WRAPPER_UNKNOWN_VALUE = new <init>("WRAPPER_UNKNOWN_VALUE", 5, 0x7fffffff);
        $VALUES = (new .VALUES[] {
            OM_UNKNOWN, OM_FREE, OM_FREE_WIRELESS, OM_3G, OM_4G, WRAPPER_UNKNOWN_VALUE
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
