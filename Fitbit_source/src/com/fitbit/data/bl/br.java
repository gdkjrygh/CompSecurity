// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl;


// Referenced classes of package com.fitbit.data.bl:
//            ag, fq, ca, bs

public class br extends ag
{

    private static final String f = "SyncChartDataOperation";
    private final SyncDataForLongPeriodOperation.Ranges g;

    public br(bs bs, SyncDataForLongPeriodOperation.Ranges ranges, boolean flag)
    {
        super(bs, flag);
        g = ranges;
        a(new fq(bs, ranges, flag), 0);
        a(new ca(bs, ranges, flag), 1);
    }

    public String c()
    {
        return (new StringBuilder()).append("SyncChartDataOperation-").append(g).toString();
    }
}
