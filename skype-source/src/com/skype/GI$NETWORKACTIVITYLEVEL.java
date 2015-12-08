// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype;

import android.support.v4.util.j;

// Referenced classes of package com.skype:
//            GI

public static final class value extends Enum
{

    private static final value $VALUES[];
    public static final value NAL_FIRST_QUIET_LEVEL;
    public static final value NAL_LAST_LEVEL_DONT_USE;
    public static final value NAL_NORMAL_LEVEL;
    public static final value NAL_QUIET_SUSPENDED_LEVEL;
    public static final value NAL_QUIET_SUSPENDED_OFFLINE_LEVEL;
    public static final value NAL_QUIET_WITH_NETWORK_LEVEL;
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
        return (WRAPPER_UNKNOWN_VALUE)Enum.valueOf(com/skype/GI$NETWORKACTIVITYLEVEL, s);
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
        NAL_NORMAL_LEVEL = new <init>("NAL_NORMAL_LEVEL", 0, 3);
        NAL_FIRST_QUIET_LEVEL = new <init>("NAL_FIRST_QUIET_LEVEL", 1, 7);
        NAL_QUIET_WITH_NETWORK_LEVEL = new <init>("NAL_QUIET_WITH_NETWORK_LEVEL", 2, 7);
        NAL_QUIET_SUSPENDED_LEVEL = new <init>("NAL_QUIET_SUSPENDED_LEVEL", 3, 8);
        NAL_QUIET_SUSPENDED_OFFLINE_LEVEL = new <init>("NAL_QUIET_SUSPENDED_OFFLINE_LEVEL", 4, 9);
        NAL_LAST_LEVEL_DONT_USE = new <init>("NAL_LAST_LEVEL_DONT_USE", 5, 10);
        WRAPPER_UNKNOWN_VALUE = new <init>("WRAPPER_UNKNOWN_VALUE", 6, 0x7fffffff);
        $VALUES = (new .VALUES[] {
            NAL_NORMAL_LEVEL, NAL_FIRST_QUIET_LEVEL, NAL_QUIET_WITH_NETWORK_LEVEL, NAL_QUIET_SUSPENDED_LEVEL, NAL_QUIET_SUSPENDED_OFFLINE_LEVEL, NAL_LAST_LEVEL_DONT_USE, WRAPPER_UNKNOWN_VALUE
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
