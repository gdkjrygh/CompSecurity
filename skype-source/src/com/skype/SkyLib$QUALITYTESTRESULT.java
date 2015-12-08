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
    public static final value QTR_AVERAGE;
    public static final value QTR_CRITICAL;
    public static final value QTR_EXCELLENT;
    public static final value QTR_GOOD;
    public static final value QTR_POOR;
    public static final value QTR_UNDEFINED;
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
        return (WRAPPER_UNKNOWN_VALUE)Enum.valueOf(com/skype/SkyLib$QUALITYTESTRESULT, s);
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
        QTR_UNDEFINED = new <init>("QTR_UNDEFINED", 0, 0);
        QTR_CRITICAL = new <init>("QTR_CRITICAL", 1, 1);
        QTR_POOR = new <init>("QTR_POOR", 2, 2);
        QTR_AVERAGE = new <init>("QTR_AVERAGE", 3, 3);
        QTR_GOOD = new <init>("QTR_GOOD", 4, 4);
        QTR_EXCELLENT = new <init>("QTR_EXCELLENT", 5, 5);
        WRAPPER_UNKNOWN_VALUE = new <init>("WRAPPER_UNKNOWN_VALUE", 6, 0x7fffffff);
        $VALUES = (new .VALUES[] {
            QTR_UNDEFINED, QTR_CRITICAL, QTR_POOR, QTR_AVERAGE, QTR_GOOD, QTR_EXCELLENT, WRAPPER_UNKNOWN_VALUE
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
