// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

// Referenced classes of package com.fitbit.data.bl:
//            c, df, dg, ez, 
//            bs

public class dd extends c
{

    private static final String d = "SyncIntradayGraphOperation";
    private final com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType e;

    public dd(bs bs, boolean flag, Date date, Date date1, com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType timeseriesresourcetype)
    {
        super(bs, true);
        b(false);
        e = timeseriesresourcetype;
        bs = new GregorianCalendar();
        bs.setTime(date1);
        do
        {
            a(new df(e(), timeseriesresourcetype, bs.getTime(), flag));
            bs.add(5, -1);
        } while (bs.getTime().after(date));
    }

    public static String a(com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType timeseriesresourcetype)
    {
        return (new StringBuilder()).append("SyncIntradayGraphOperation-").append(timeseriesresourcetype.toString()).toString();
    }

    public static void b()
    {
        int i = 0;
        com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType atimeseriesresourcetype[] = new com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType[5];
        atimeseriesresourcetype[0] = com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.STEPS_INTRADAY;
        atimeseriesresourcetype[1] = com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.CALORIES_INTRADAY;
        atimeseriesresourcetype[2] = com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.DISTANCE_INTRADAY;
        atimeseriesresourcetype[3] = com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.FLOORS_INTRADAY;
        atimeseriesresourcetype[4] = com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.MINUTES_VERY_ACTIVE_INTRADAY;
        Date date = Calendar.getInstance().getTime();
        for (int j = atimeseriesresourcetype.length; i < j; i++)
        {
            com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType timeseriesresourcetype = atimeseriesresourcetype[i];
            String s = a(timeseriesresourcetype);
            dg.d().c().d(s);
            df.a(date, timeseriesresourcetype);
        }

    }

    public static void b(com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType timeseriesresourcetype)
    {
        timeseriesresourcetype = a(timeseriesresourcetype);
        dg.d().c().d(timeseriesresourcetype);
    }

    public String c()
    {
        return a(e);
    }
}
