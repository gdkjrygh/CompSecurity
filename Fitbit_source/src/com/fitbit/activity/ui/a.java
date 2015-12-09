// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.activity.ui;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.drawable.Drawable;
import com.artfulbits.aiCharts.Base.j;
import com.fitbit.data.bl.fs;
import com.fitbit.data.domain.TimeSeriesObject;
import com.fitbit.util.aq;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

public class a extends aq
{

    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 3;
    public static final int e = 4;

    public a(Context context, Date date, Date date1)
    {
        super(context, date, date1);
    }

    public a(Context context, Date date, Date date1, IntentFilter intentfilter)
    {
        super(context, date, date1, intentfilter);
    }

    private com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType c(int i)
    {
        switch (i)
        {
        default:
            return null;

        case 0: // '\0'
            return com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.STEPS_INTRADAY;

        case 1: // '\001'
            return com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.CALORIES_INTRADAY;

        case 2: // '\002'
            return com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.DISTANCE_INTRADAY;

        case 3: // '\003'
            return com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.MINUTES_VERY_ACTIVE_INTRADAY;

        case 4: // '\004'
            return com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.FLOORS_INTRADAY;
        }
    }

    protected Drawable a(int i, j j1)
    {
        return null;
    }

    public com.fitbit.weight.ui.b.a a(int i)
    {
        com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType timeseriesresourcetype = c(i);
        com.fitbit.weight.ui.b.a a1 = new com.fitbit.weight.ui.b.a();
        Object obj = fs.a().a(timeseriesresourcetype, d(), h());
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
            if (timeseriesresourcetype == com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.MINUTES_VERY_ACTIVE_INTRADAY)
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

    protected Intent[] a()
    {
        return new Intent[0];
    }

    protected com.fitbit.util.chart.Filter.Type b(int i)
    {
        return com.fitbit.util.chart.Filter.Type.t;
    }

    public Callable b()
    {
        return new Callable() {

            final a a;

            public Object call()
                throws Exception
            {
                return a.loadInBackground();
            }

            
            {
                a = a.this;
                super();
            }
        };
    }

    public int c()
    {
        return 5;
    }
}
