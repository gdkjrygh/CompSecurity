// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype;

import android.support.v4.util.j;

// Referenced classes of package com.skype:
//            Account

public static final class value extends Enum
{

    private static final value $VALUES[];
    public static final value ALL_NUMBERS_CAN_CALL;
    public static final value BUDDY_NUMBERS_CAN_CALL;
    public static final value DISCLOSED_NUMBERS_CAN_CALL;
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
        return (WRAPPER_UNKNOWN_VALUE)Enum.valueOf(com/skype/Account$PSTNCALLPOLICY, s);
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
        ALL_NUMBERS_CAN_CALL = new <init>("ALL_NUMBERS_CAN_CALL", 0, 0);
        DISCLOSED_NUMBERS_CAN_CALL = new <init>("DISCLOSED_NUMBERS_CAN_CALL", 1, 1);
        BUDDY_NUMBERS_CAN_CALL = new <init>("BUDDY_NUMBERS_CAN_CALL", 2, 2);
        WRAPPER_UNKNOWN_VALUE = new <init>("WRAPPER_UNKNOWN_VALUE", 3, 0x7fffffff);
        $VALUES = (new .VALUES[] {
            ALL_NUMBERS_CAN_CALL, DISCLOSED_NUMBERS_CAN_CALL, BUDDY_NUMBERS_CAN_CALL, WRAPPER_UNKNOWN_VALUE
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
