// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.activity.ui;

import com.artfulbits.aiCharts.Base.j;
import com.fitbit.data.bl.fs;
import com.fitbit.data.bl.t;
import com.fitbit.data.domain.TimeSeriesObject;
import com.fitbit.util.bg;
import com.fitbit.util.chart.a;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.fitbit.activity.ui:
//            IntradayActivityChartFragment

class a
    implements Runnable
{

    final IntradayActivityChartFragment a;

    private com.fitbit.data.domain.a a()
    {
        switch (com.fitbit.activity.ui.a[IntradayActivityChartFragment.c(a).ordinal()])
        {
        default:
            throw new IllegalArgumentException((new StringBuilder()).append("Unknown resource type ").append(IntradayActivityChartFragment.c(a)).toString());

        case 1: // '\001'
            return com.fitbit.data.domain.AL;

        case 2: // '\002'
            return com.fitbit.data.domain.AL;

        case 3: // '\003'
            return com.fitbit.data.domain.AL;

        case 4: // '\004'
            return com.fitbit.data.domain.E_GOAL;

        case 5: // '\005'
            return com.fitbit.data.domain.E_GOAL;
        }
    }

    public void run()
    {
        Object obj = com.fitbit.activity.ui.IntradayActivityChartFragment.a(a);
        Date date = IntradayActivityChartFragment.b(a);
        if (obj == null || date == null)
        {
            return;
        }
        bg bg1 = new bg();
        rceType rcetype = new >();
        Object obj1 = fs.a().a(IntradayActivityChartFragment.c(a), ((Date) (obj)), date);
        rcetype.a = t.a().a(a(), date);
        obj = new ArrayList();
        double d3 = 0.0D;
        double d4 = 1.7976931348623157E+308D;
        double d6 = 1.7976931348623157E+308D;
        double d = 4.9406564584124654E-324D;
        obj1 = ((List) (obj1)).iterator();
        do
        {
            if (!((Iterator) (obj1)).hasNext())
            {
                break;
            }
            TimeSeriesObject timeseriesobject = (TimeSeriesObject)((Iterator) (obj1)).next();
            double d1 = timeseriesobject.b();
            if (d1 > 0.0D)
            {
                j j2 = new j(timeseriesobject.a().getTime(), new double[] {
                    d1
                });
                j2.a(timeseriesobject);
                j2.a(a.a(j2, timeseriesobject));
                a.a(j2);
                ((List) (obj)).add(j2);
            }
        } while (true);
        double d5 = 0.0D;
        date = com.fitbit.util.chart.a.a(com.fitbit.util.chart., date);
        int i = ((List) (obj)).size() - 1;
        while (i >= 0) 
        {
            j j1 = (j)((List) (obj)).get(i);
            double d2 = j1.a(0);
            boolean flag;
            if (j1.a() >= (double)date.getTime())
            {
                double d7 = d6;
                if (d2 < d6)
                {
                    d7 = d2;
                }
                if (d2 > d)
                {
                    d = d2;
                }
                double d9 = d5 + d2;
                d6 = d7;
                d5 = d;
                d = d9;
            } else
            {
                double d8 = d;
                d = d5;
                d5 = d8;
            }
            if (d2 < d4)
            {
                d4 = d2;
            }
            if (d2 <= d3)
            {
                d2 = d3;
            }
            i--;
            d3 = d5;
            d5 = d;
            d = d3;
            d3 = d2;
        }
        if (d6 != 1.7976931348623157E+308D);
        d2 = d;
        if (d == 4.9406564584124654E-324D)
        {
            d2 = 0.0D;
        }
        rcetype.a = d5;
        rcetype.a = ((List) (obj));
        rcetype.a = Math.max(0.0D, d4);
        rcetype.a = Math.max(a.h_(), d3);
        rcetype. = Math.max(a.h_(), d2);
        rcetype. = 0.0D;
        if (IntradayActivityChartFragment.d(a) == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        rcetype.a = flag;
        bg1.a("intraday graph load");
        com.fitbit.activity.ui.IntradayActivityChartFragment.a(a, rcetype);
    }

    rceType(IntradayActivityChartFragment intradayactivitychartfragment)
    {
        a = intradayactivitychartfragment;
        super();
    }
}
