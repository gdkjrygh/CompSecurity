// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.ui.charts;

import com.fitbit.activity.ui.charts.views.d;
import com.fitbit.data.domain.TimeSeriesObject;
import com.fitbit.data.domain.WaterLogEntry;
import com.fitbit.util.o;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.fitbit.ui.charts:
//            o, s, Timeframe

public class t extends com.fitbit.ui.charts.o
{

    public t()
    {
    }

    public static t a(List list)
    {
        t t1 = new t();
        for (int i = 0; i < list.size(); i++)
        {
            TimeSeriesObject timeseriesobject = (TimeSeriesObject)list.get(i);
            t1.a(((n) (new s(timeseriesobject.a().getTime(), timeseriesobject.b()))));
        }

        return t1;
    }

    public static t a(List list, Timeframe timeframe)
    {
        t t1 = new t();
        if (timeframe == Timeframe.c || timeframe == com.fitbit.ui.charts.Timeframe.d)
        {
            double d1;
            int i;
            int j;
            byte byte0;
            byte byte1;
            long l1;
            if (timeframe == Timeframe.c)
            {
                byte0 = 3;
            } else
            {
                byte0 = 2;
            }
            if (timeframe == Timeframe.c)
            {
                byte1 = 7;
            } else
            {
                byte1 = 5;
            }
            timeframe = o.c();
            l1 = -1L;
            d1 = 0.0D;
            list = list.iterator();
            i = -1;
            j = 0;
            while (list.hasNext()) 
            {
                d d2 = (d)list.next();
                timeframe.setTime(d2.a());
                int l = timeframe.get(byte0);
                int k;
                if (l == i)
                {
                    k = 1;
                } else
                {
                    k = 0;
                }
                if (k != 0)
                {
                    d1 += d2.b();
                    k = j + 1;
                    j = i;
                    i = k;
                } else
                {
                    if (j != 0)
                    {
                        timeframe.setTimeInMillis(l1);
                        a(((Calendar) (timeframe)), byte1);
                        t1.a(((n) (new s(timeframe.getTimeInMillis(), d1))));
                    }
                    l1 = d2.a().getTime();
                    d1 = d2.b();
                    i = 1;
                    j = l;
                }
                k = j;
                j = i;
                i = k;
            }
            timeframe.setTimeInMillis(l1);
            a(((Calendar) (timeframe)), byte1);
            t1.a(((n) (new s(timeframe.getTimeInMillis(), d1))));
            return t1;
        } else
        {
            return b(list);
        }
    }

    public static void a(Calendar calendar, int i)
    {
        switch (i)
        {
        case 6: // '\006'
        default:
            return;

        case 7: // '\007'
            calendar.set(i, calendar.getFirstDayOfWeek());
            return;

        case 5: // '\005'
            calendar.set(i, 1);
            return;
        }
    }

    public static t b(List list)
    {
        t t1 = new t();
        d d1;
        for (list = list.iterator(); list.hasNext(); t1.a(new s(d1.a().getTime(), d1.b())))
        {
            d1 = (d)list.next();
            if (d1 instanceof WaterLogEntry)
            {
                ((WaterLogEntry)d1).setLogDate(o.b(d1.a()));
            }
        }

        return t1;
    }
}
