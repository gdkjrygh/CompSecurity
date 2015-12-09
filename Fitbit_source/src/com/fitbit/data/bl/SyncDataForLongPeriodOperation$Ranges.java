// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl;


// Referenced classes of package com.fitbit.data.bl:
//            SyncDataForLongPeriodOperation

public static final class chartType extends Enum
{

    public static final e a;
    public static final e b;
    public static final e c;
    public static final e d;
    public static final e e;
    private static final e f[];
    private com.fitbit.util.chart.it> chartType;
    private int monthCount;

    public static chartType valueOf(String s)
    {
        return (chartType)Enum.valueOf(com/fitbit/data/bl/SyncDataForLongPeriodOperation$Ranges, s);
    }

    public static chartType[] values()
    {
        return (chartType[])f.clone();
    }

    public s_3B_.clone a()
    {
        return s_3B_.clone(monthCount);
    }

    public monthCount b()
    {
        return monthCount(monthCount);
    }

    public com.fitbit.util.chart.thCount c()
    {
        return chartType;
    }

    static 
    {
        a = new <init>("MONTH", 0, 2, com.fitbit.util.chart.it>);
        b = new <init>("THREE_MONTHS", 1, 4, com.fitbit.util.chart.it>);
        c = new <init>("HALF_YEAR", 2, 7, com.fitbit.util.chart.it>);
        d = new <init>("YEAR", 3, 13, com.fitbit.util.chart.it>);
        e = new <init>("ONE_AND_HALF_YEAR", 4, 19, com.fitbit.util.chart.it>);
        f = (new f[] {
            a, b, c, d, e
        });
    }

    private (String s, int i, int j, com.fitbit.util.chart.A a1)
    {
        super(s, i);
        monthCount = j;
        chartType = a1;
    }
}
