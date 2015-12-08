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
    public static final value SA_PAYMENT_SID_AMOUNT_STR;
    public static final value SA_PAYMENT_SID_CARDHOLDER;
    public static final value SA_PAYMENT_SID_CARD_NO;
    public static final value SA_PAYMENT_SID_CARD_VAL_NO;
    public static final value SA_PAYMENT_SID_COUNTRY;
    public static final value SA_PAYMENT_SID_CURRENCY;
    public static final value SA_PAYMENT_SID_ORDER_ID;
    public static final value SA_PAYMENT_SID_SKYPENAME;
    public static final value SA_PAYMENT_SID_SKYPERPWD;
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
        return (WRAPPER_UNKNOWN_VALUE)Enum.valueOf(com/skype/SkyLib$SA_PAYMENT_SID, s);
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
        SA_PAYMENT_SID_SKYPENAME = new <init>("SA_PAYMENT_SID_SKYPENAME", 0, 0);
        SA_PAYMENT_SID_SKYPERPWD = new <init>("SA_PAYMENT_SID_SKYPERPWD", 1, 1);
        SA_PAYMENT_SID_CARDHOLDER = new <init>("SA_PAYMENT_SID_CARDHOLDER", 2, 2);
        SA_PAYMENT_SID_CARD_NO = new <init>("SA_PAYMENT_SID_CARD_NO", 3, 3);
        SA_PAYMENT_SID_CARD_VAL_NO = new <init>("SA_PAYMENT_SID_CARD_VAL_NO", 4, 4);
        SA_PAYMENT_SID_AMOUNT_STR = new <init>("SA_PAYMENT_SID_AMOUNT_STR", 5, 5);
        SA_PAYMENT_SID_CURRENCY = new <init>("SA_PAYMENT_SID_CURRENCY", 6, 6);
        SA_PAYMENT_SID_COUNTRY = new <init>("SA_PAYMENT_SID_COUNTRY", 7, 7);
        SA_PAYMENT_SID_ORDER_ID = new <init>("SA_PAYMENT_SID_ORDER_ID", 8, 8);
        WRAPPER_UNKNOWN_VALUE = new <init>("WRAPPER_UNKNOWN_VALUE", 9, 0x7fffffff);
        $VALUES = (new .VALUES[] {
            SA_PAYMENT_SID_SKYPENAME, SA_PAYMENT_SID_SKYPERPWD, SA_PAYMENT_SID_CARDHOLDER, SA_PAYMENT_SID_CARD_NO, SA_PAYMENT_SID_CARD_VAL_NO, SA_PAYMENT_SID_AMOUNT_STR, SA_PAYMENT_SID_CURRENCY, SA_PAYMENT_SID_COUNTRY, SA_PAYMENT_SID_ORDER_ID, WRAPPER_UNKNOWN_VALUE
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
