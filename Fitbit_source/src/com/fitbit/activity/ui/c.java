// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.activity.ui;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.artfulbits.aiCharts.Base.j;
import com.fitbit.data.bl.fs;
import com.fitbit.data.domain.TimeSeriesObject;
import com.fitbit.weight.ui.a;
import com.fitbit.weight.ui.b;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

public class c extends b
{

    private com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType a;

    public c(Context context, Date date, Date date1, IntentFilter intentfilter, com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType timeseriesresourcetype)
    {
        super(context, date, date1, intentfilter);
        a = timeseriesresourcetype;
    }

    public c(Context context, Date date, Date date1, com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType timeseriesresourcetype)
    {
        super(context, date, date1);
        a = timeseriesresourcetype;
    }

    protected Intent[] a()
    {
        return new Intent[0];
    }

    public Callable b()
    {
        return new Callable() {

            final c a;

            public Object call()
                throws Exception
            {
                return a.loadInBackground();
            }

            
            {
                a = c.this;
                super();
            }
        };
    }

    protected com.fitbit.util.chart.Filter.Type c()
    {
        return com.fitbit.util.chart.Filter.Type.t;
    }

    public com.fitbit.weight.ui.b.a d()
    {
        com.fitbit.weight.ui.b.a a1 = new com.fitbit.weight.ui.b.a();
        Object obj = fs.a().a(a, h(), i());
        ArrayList arraylist = new ArrayList();
        obj = ((List) (obj)).iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            TimeSeriesObject timeseriesobject = (TimeSeriesObject)((Iterator) (obj)).next();
            j j1 = new j(timeseriesobject.a().getTime(), new double[] {
                timeseriesobject.b()
            });
            int i;
            if (a == com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.MINUTES_VERY_ACTIVE_INTRADAY)
            {
                i = 3;
            } else
            {
                i = timeseriesobject.e();
            }
            j1.a(com.fitbit.weight.ui.a.a(i));
            j1.a(timeseriesobject.a().toString());
            if (timeseriesobject.b() > 0.0D)
            {
                arraylist.add(j1);
            }
        } while (true);
        a1.a = arraylist;
        return a1;
    }
}
