// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype;

import android.support.v4.util.j;

// Referenced classes of package com.skype:
//            AccessSession

public static final class value extends Enum
{

    private static final value $VALUES[];
    public static final value SA_ASK_TO_RATE;
    public static final value SA_LOW_CREDIT;
    public static final value SA_NO_CURRENCY_CHANGE;
    public static final value SA_OPEN_URL;
    public static final value SA_PRODUCT_CREDIT;
    public static final value SA_SHOW_PROMO_DIALOG;
    public static final value SA_STAR_RATING_0;
    public static final value SA_STAR_RATING_1;
    public static final value SA_STAR_RATING_2;
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
        return (WRAPPER_UNKNOWN_VALUE)Enum.valueOf(com/skype/AccessSession$SESSIONFLAGS, s);
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
        SA_OPEN_URL = new <init>("SA_OPEN_URL", 0, 1);
        SA_SHOW_PROMO_DIALOG = new <init>("SA_SHOW_PROMO_DIALOG", 1, 2);
        SA_NO_CURRENCY_CHANGE = new <init>("SA_NO_CURRENCY_CHANGE", 2, 4);
        SA_ASK_TO_RATE = new <init>("SA_ASK_TO_RATE", 3, 8);
        SA_STAR_RATING_0 = new <init>("SA_STAR_RATING_0", 4, 32);
        SA_STAR_RATING_1 = new <init>("SA_STAR_RATING_1", 5, 64);
        SA_STAR_RATING_2 = new <init>("SA_STAR_RATING_2", 6, 128);
        SA_PRODUCT_CREDIT = new <init>("SA_PRODUCT_CREDIT", 7, 256);
        SA_LOW_CREDIT = new <init>("SA_LOW_CREDIT", 8, 0x10000);
        WRAPPER_UNKNOWN_VALUE = new <init>("WRAPPER_UNKNOWN_VALUE", 9, 0x7fffffff);
        $VALUES = (new .VALUES[] {
            SA_OPEN_URL, SA_SHOW_PROMO_DIALOG, SA_NO_CURRENCY_CHANGE, SA_ASK_TO_RATE, SA_STAR_RATING_0, SA_STAR_RATING_1, SA_STAR_RATING_2, SA_PRODUCT_CREDIT, SA_LOW_CREDIT, WRAPPER_UNKNOWN_VALUE
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
