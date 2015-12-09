// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.activity.ui.details;

import com.artfulbits.aiCharts.Base.j;
import com.artfulbits.aiCharts.Base.t;
import com.fitbit.ui.charts.n;

// Referenced classes of package com.fitbit.activity.ui.details:
//            IntradayActivityBabyChartView

class a
    implements t
{

    final IntradayActivityBabyChartView a;

    public j a(Object obj, j j1)
    {
        obj = (n)obj;
        double d = ((n) (obj)).b();
        if (j1 != null)
        {
            j1.a(((n) (obj)).a(), d);
            return j1;
        } else
        {
            return new j(((n) (obj)).a(), new double[] {
                d
            });
        }
    }

    public volatile Object a(Object obj, Object obj1)
    {
        return a(obj, (j)obj1);
    }

    (IntradayActivityBabyChartView intradayactivitybabychartview)
    {
        a = intradayactivitybabychartview;
        super();
    }
}
