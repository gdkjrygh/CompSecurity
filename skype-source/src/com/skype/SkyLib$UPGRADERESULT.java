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
    public static final value BETA_AVAILABLE;
    public static final value DISCONTINUED;
    public static final value FORCED_STEALTH_UPGRADE;
    public static final value FORCED_UPGRADE;
    public static final value GOLD_AND_BETA_AVAILABLE;
    public static final value GOLD_AVAILABLE;
    public static final value NO_UPGRADE;
    public static final value RECOMMENDED_STEALTH_UPGRADE;
    public static final value RECOMMENDED_UPGRADE;
    public static final value UPGRADE_CHECK_FAILED;
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
        return (WRAPPER_UNKNOWN_VALUE)Enum.valueOf(com/skype/SkyLib$UPGRADERESULT, s);
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
        NO_UPGRADE = new <init>("NO_UPGRADE", 0, 0);
        RECOMMENDED_UPGRADE = new <init>("RECOMMENDED_UPGRADE", 1, 1);
        RECOMMENDED_STEALTH_UPGRADE = new <init>("RECOMMENDED_STEALTH_UPGRADE", 2, 2);
        FORCED_UPGRADE = new <init>("FORCED_UPGRADE", 3, 3);
        FORCED_STEALTH_UPGRADE = new <init>("FORCED_STEALTH_UPGRADE", 4, 4);
        DISCONTINUED = new <init>("DISCONTINUED", 5, 5);
        GOLD_AVAILABLE = new <init>("GOLD_AVAILABLE", 6, 10);
        BETA_AVAILABLE = new <init>("BETA_AVAILABLE", 7, 11);
        GOLD_AND_BETA_AVAILABLE = new <init>("GOLD_AND_BETA_AVAILABLE", 8, 12);
        UPGRADE_CHECK_FAILED = new <init>("UPGRADE_CHECK_FAILED", 9, 20);
        WRAPPER_UNKNOWN_VALUE = new <init>("WRAPPER_UNKNOWN_VALUE", 10, 0x7fffffff);
        $VALUES = (new .VALUES[] {
            NO_UPGRADE, RECOMMENDED_UPGRADE, RECOMMENDED_STEALTH_UPGRADE, FORCED_UPGRADE, FORCED_STEALTH_UPGRADE, DISCONTINUED, GOLD_AVAILABLE, BETA_AVAILABLE, GOLD_AND_BETA_AVAILABLE, UPGRADE_CHECK_FAILED, 
            WRAPPER_UNKNOWN_VALUE
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
