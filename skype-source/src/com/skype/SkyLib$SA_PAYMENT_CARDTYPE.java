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
    public static final value SA_PAYMENT_CARDTYPE_AMEX;
    public static final value SA_PAYMENT_CARDTYPE_MC;
    public static final value SA_PAYMENT_CARDTYPE_UNKNOWN;
    public static final value SA_PAYMENT_CARDTYPE_VISA;
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
        return (WRAPPER_UNKNOWN_VALUE)Enum.valueOf(com/skype/SkyLib$SA_PAYMENT_CARDTYPE, s);
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
        SA_PAYMENT_CARDTYPE_UNKNOWN = new <init>("SA_PAYMENT_CARDTYPE_UNKNOWN", 0, 0);
        SA_PAYMENT_CARDTYPE_VISA = new <init>("SA_PAYMENT_CARDTYPE_VISA", 1, 1);
        SA_PAYMENT_CARDTYPE_MC = new <init>("SA_PAYMENT_CARDTYPE_MC", 2, 2);
        SA_PAYMENT_CARDTYPE_AMEX = new <init>("SA_PAYMENT_CARDTYPE_AMEX", 3, 3);
        WRAPPER_UNKNOWN_VALUE = new <init>("WRAPPER_UNKNOWN_VALUE", 4, 0x7fffffff);
        $VALUES = (new .VALUES[] {
            SA_PAYMENT_CARDTYPE_UNKNOWN, SA_PAYMENT_CARDTYPE_VISA, SA_PAYMENT_CARDTYPE_MC, SA_PAYMENT_CARDTYPE_AMEX, WRAPPER_UNKNOWN_VALUE
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
