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
    public static final value CAPABILITY_EXISTS;
    public static final value FINAL_EXPIRY_WARNING;
    public static final value FIRST_EXPIRY_WARNING;
    public static final value NO_CAPABILITY;
    public static final value SECOND_EXPIRY_WARNING;
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
        return (WRAPPER_UNKNOWN_VALUE)Enum.valueOf(com/skype/Account$CAPABILITYSTATUS, s);
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
        NO_CAPABILITY = new <init>("NO_CAPABILITY", 0, 0);
        CAPABILITY_EXISTS = new <init>("CAPABILITY_EXISTS", 1, 1);
        FIRST_EXPIRY_WARNING = new <init>("FIRST_EXPIRY_WARNING", 2, 2);
        SECOND_EXPIRY_WARNING = new <init>("SECOND_EXPIRY_WARNING", 3, 3);
        FINAL_EXPIRY_WARNING = new <init>("FINAL_EXPIRY_WARNING", 4, 4);
        WRAPPER_UNKNOWN_VALUE = new <init>("WRAPPER_UNKNOWN_VALUE", 5, 0x7fffffff);
        $VALUES = (new .VALUES[] {
            NO_CAPABILITY, CAPABILITY_EXISTS, FIRST_EXPIRY_WARNING, SECOND_EXPIRY_WARNING, FINAL_EXPIRY_WARNING, WRAPPER_UNKNOWN_VALUE
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
