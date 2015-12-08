// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.activity.ui.landing;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PointF;
import com.artfulbits.aiCharts.Base.ChartAxis;
import com.artfulbits.aiCharts.Base.ChartAxisScale;
import com.artfulbits.aiCharts.Base.ChartCollection;
import com.artfulbits.aiCharts.Base.ChartNamedCollection;
import com.artfulbits.aiCharts.Base.ChartSeries;
import com.artfulbits.aiCharts.Base.j;
import com.artfulbits.aiCharts.Base.l;
import com.artfulbits.aiCharts.Enums.Alignment;
import com.artfulbits.aiCharts.a.d;
import com.fitbit.activity.ui.charts.ActivityType;
import com.fitbit.activity.ui.charts.a.b;
import com.fitbit.activity.ui.charts.views.c;
import com.fitbit.ui.charts.ExtendedChartView;
import com.fitbit.ui.charts.Timeframe;
import com.fitbit.ui.charts.n;
import com.fitbit.ui.charts.s;
import com.fitbit.ui.charts.t;
import com.fitbit.ui.charts.v;
import com.fitbit.ui.g;
import com.fitbit.util.ap;
import com.fitbit.util.format.e;
import com.fitbit.util.o;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class com.fitbit.activity.ui.landing.a
    implements com.fitbit.ui.charts.ExtendedChartView.a
{
    private class a
        implements com.artfulbits.aiCharts.Base.ChartAxis.b
    {

        final com.fitbit.activity.ui.landing.a a;

        public void a(ChartAxis chartaxis, List list)
        {
            int k1 = 0;
            int i1 = 0;
            list.clear();
            int i2 = com.fitbit.activity.ui.landing.a.c(a).d(com.fitbit.activity.ui.landing.a.a(a).c(), com.fitbit.activity.ui.landing.a.b(a));
            int l1 = com.fitbit.activity.ui.landing.a.c(a).c();
            if (l1 == 1)
            {
                k1 = i2 / 2;
                for (; i1 < 3; i1++)
                {
                    list.add(new com.artfulbits.aiCharts.Base.ChartAxis.a(com.fitbit.util.format.e.a(i1 * k1 + 0), i1 * k1 + 0, 2));
                }

            } else
            {
                double d1 = (double)i2 / (double)l1 / 2D;
                for (int j1 = k1; j1 < 3; j1++)
                {
                    double d2 = 0.0D + (double)j1 * d1;
                    list.add(new com.artfulbits.aiCharts.Base.ChartAxis.a(com.fitbit.util.chart.a.a(d2, l1), d2, 2));
                }

            }
        }

        private a()
        {
            a = com.fitbit.activity.ui.landing.a.this;
            super();
        }

    }


    public static int a = 0;
    private static final String b = "REFLECTION_SERIES";
    private static final String c = "DAYS_SERIES";
    private final a d = new a();
    private boolean e;
    private g f;
    private Context g;
    private ActivityType h;
    private com.fitbit.activity.ui.charts.a.a i;
    private ExtendedChartView j;
    private t k;
    private double l;
    private List m;

    public com.fitbit.activity.ui.landing.a(Context context, ActivityType activitytype, ExtendedChartView extendedchartview)
    {
        e = false;
        g = context;
        h = activitytype;
        i = activitytype.d().a();
        j = extendedchartview;
        extendedchartview.a(this);
    }

    static t a(com.fitbit.activity.ui.landing.a a1)
    {
        return a1.k;
    }

    static double b(com.fitbit.activity.ui.landing.a a1)
    {
        return a1.l;
    }

    static com.fitbit.activity.ui.charts.a.a c(com.fitbit.activity.ui.landing.a a1)
    {
        return a1.i;
    }

    private void h()
    {
        l l1 = ((ChartSeries)j.h().a("DAYS_SERIES")).F();
        if (l1 != null)
        {
            for (int i1 = 0; i1 < l1.size(); i1++)
            {
                d d1 = (d)m.get(i1);
                d1.a(com.artfulbits.aiCharts.a.b.a("DAYS_SERIES", i1));
                d1.b(o.d((long)l1.a(i1).a()));
            }

            if (h == ActivityType.f)
            {
                ((d)m.get(0)).b(g.getResources().getColor(0x7f0f016d));
                ((d)m.get(0)).a(g.getResources().getDrawable(0x7f020101));
                ((d)m.get(0)).a((int)ap.b(-4F));
            }
        }
    }

    private void i()
    {
        l l1 = ((ChartSeries)j.h().a("DAYS_SERIES")).F();
        t t1 = new t();
        for (Iterator iterator = k.iterator(); iterator.hasNext(); t1.a(new s(((n)iterator.next()).a(), c().doubleValue() * f()))) { }
        l1.a();
        l1.a(t1, new com.artfulbits.aiCharts.Base.t() {

            final com.fitbit.activity.ui.landing.a a;

            public j a(Object obj, j j1)
            {
                obj = (n)obj;
                double d1 = ((n) (obj)).b();
                if (j1 != null)
                {
                    j1.a(((n) (obj)).a(), d1);
                    return j1;
                } else
                {
                    return new j(((n) (obj)).a(), new double[] {
                        d1
                    });
                }
            }

            public volatile Object a(Object obj, Object obj1)
            {
                return a(obj, (j)obj1);
            }

            
            {
                a = com.fitbit.activity.ui.landing.a.this;
                super();
            }
        });
        l1.b();
    }

    public void a()
    {
        m = new ArrayList(a);
        for (int i1 = 0; i1 < a; i1++)
        {
            d d1 = new d(" ");
            d1.a(com.artfulbits.aiCharts.a.b.a(new PointF(0.0F, 0.0F), ((com.artfulbits.aiCharts.Base.a)j.g().get(0)).a()));
            d1.a(Alignment.b, Alignment.a);
            d1.a(false);
            com.fitbit.activity.ui.charts.a.a(g, d1.f());
            m.add(d1);
            j.k().add(d1);
        }

    }

    public void a(double d1)
    {
        l = d1;
    }

    protected void a(l l1, double d1)
    {
        double d2 = k.c();
        if (d2 - 1.0000000000000001E-05D > 0.0D)
        {
            d1 /= d2;
        } else
        {
            d1 = 0.0D;
        }
        l1.a(k, new com.artfulbits.aiCharts.Base.t(d1) {

            final double a;
            final com.fitbit.activity.ui.landing.a b;

            public j a(Object obj, j j1)
            {
                obj = (n)obj;
                if (j1 != null)
                {
                    j1.a(((n) (obj)).a(), a * ((n) (obj)).b());
                    return j1;
                } else
                {
                    return new j(((n) (obj)).a(), new double[] {
                        a * ((n) (obj)).b()
                    });
                }
            }

            public volatile Object a(Object obj, Object obj1)
            {
                return a(obj, (j)obj1);
            }

            
            {
                b = com.fitbit.activity.ui.landing.a.this;
                a = d1;
                super();
            }
        });
    }

    protected void a(Timeframe timeframe)
    {
        ChartAxis chartaxis = ((com.artfulbits.aiCharts.Base.a)j.g().get(0)).d();
        Date date = o.c(new Date());
        long l1 = timeframe.a();
        long l3 = (timeframe.a() * 3L) / 28L;
        long l2 = (timeframe.a() * 3L) / 28L;
        l3 += date.getTime();
        chartaxis.a().a(l3 - l1 - l2, l3);
        chartaxis.a().c(l3 - l1 - l2, l3);
    }

    public void a(t t1, Timeframe timeframe, boolean flag)
    {
        if (t1 != null && timeframe != null)
        {
            k = t1;
            double d1 = ((com.artfulbits.aiCharts.Base.a)j.g().get(0)).d().a().o();
            b();
            b(l);
            t1 = (com.artfulbits.aiCharts.Base.a)j.g().get(0);
            t1.a((int)ap.b(2.5F), 0, 0, 0);
            ChartAxis chartaxis = t1.d();
            chartaxis.a(com.artfulbits.aiCharts.Base.ChartAxis.LabelPosition.c);
            chartaxis.a(new v(g, i.c(g), flag));
            com.fitbit.heartrate.charts.a.c(g, chartaxis.k());
            com.fitbit.heartrate.charts.a.a(g, chartaxis.r());
            t1 = t1.e();
            t1.a(com.artfulbits.aiCharts.Base.ChartAxis.LabelPosition.a);
            t1.a(Alignment.c);
            t1.a(d);
            com.fitbit.activity.ui.charts.a.b(g, t1.k());
            com.fitbit.heartrate.charts.a.b(g, t1.s());
            com.fitbit.heartrate.charts.a.a(g, t1.r());
            a(timeframe);
            if (!e)
            {
                if (com.fitbit.data.bl.t.a(h) != null)
                {
                    f = com.fitbit.util.chart.a.a(g, h, l);
                    j.k().add(f);
                }
                e = true;
            } else
            {
                j.k().remove(f);
                f = com.fitbit.util.chart.a.a(g, h, l);
                j.k().add(f);
            }
            if (!Double.isNaN(d1))
            {
                ((com.artfulbits.aiCharts.Base.a)j.g().get(0)).d().a().b(d1);
            }
            h();
            g();
            if (!j.isLayoutRequested())
            {
                j.requestLayout();
                return;
            }
        }
    }

    public void a(boolean flag, int i1, int j1, int k1, int l1)
    {
        if (k != null)
        {
            g();
        }
    }

    protected void b()
    {
        ChartNamedCollection chartnamedcollection = j.h();
        if ((ChartSeries)chartnamedcollection.a("MAIN_SERIES") == null)
        {
            ChartSeries chartseries = new ChartSeries("MAIN_SERIES", new c(g, false));
            chartseries.a(Integer.valueOf(g.getResources().getColor(0x7f0f000a)));
            chartseries.a(c.k, Float.valueOf(0.6F));
            chartnamedcollection.add(chartseries);
        }
        if ((ChartSeries)chartnamedcollection.a("DAYS_SERIES") == null)
        {
            ChartSeries chartseries1 = new ChartSeries("DAYS_SERIES", new com.artfulbits.aiCharts.Types.v());
            chartseries1.a(Integer.valueOf(0));
            chartseries1.a(c.k, Float.valueOf(0.6F));
            chartnamedcollection.add(chartseries1);
        }
        if ((ChartSeries)chartnamedcollection.a("REFLECTION_SERIES") == null)
        {
            int i1 = g.getResources().getColor(0x7f0f000e);
            int j1 = g.getResources().getColor(0x7f0f000d);
            ChartSeries chartseries2 = new ChartSeries("REFLECTION_SERIES", new com.fitbit.activity.ui.charts.views.a(i1, j1, false, true, g.getResources().getColor(0x7f0f000f), j1));
            chartseries2.a(Integer.valueOf(g.getResources().getColor(0x7f0f00c2)));
            chartseries2.a(c.k, Float.valueOf(0.6F));
            if (ActivityType.c.equals(h))
            {
                chartseries2.a(com.fitbit.activity.ui.charts.views.a.j, Double.valueOf(0.0001D));
            }
            chartnamedcollection.add(chartseries2);
        }
    }

    protected void b(double d1)
    {
        l l1 = ((ChartSeries)j.h().a("MAIN_SERIES")).F();
        l1.a();
        l1.a(k, new com.artfulbits.aiCharts.Base.t(d1) {

            final double a;
            final com.fitbit.activity.ui.landing.a b;

            public j a(Object obj, j j1)
            {
                obj = (n)obj;
                double d2 = ((n) (obj)).b();
                if (j1 != null)
                {
                    j1.a(((n) (obj)).a(), d2);
                } else
                {
                    j1 = new j(((n) (obj)).a(), new double[] {
                        d2
                    });
                }
                if (d2 >= a)
                {
                    j1.a(c.j, Boolean.valueOf(true));
                }
                return j1;
            }

            public volatile Object a(Object obj, Object obj1)
            {
                return a(obj, (j)obj1);
            }

            
            {
                b = com.fitbit.activity.ui.landing.a.this;
                a = d1;
                super();
            }
        });
        l1.b();
        i();
    }

    public Number c()
    {
        return i.c(k.c(), l);
    }

    public double d()
    {
        return c().doubleValue() * e();
    }

    public double e()
    {
        return 1.3D;
    }

    public double f()
    {
        return 1.2D;
    }

    protected void g()
    {
        Object obj = ((com.artfulbits.aiCharts.Base.a)j.g().get(0)).e();
        int i1 = j.getMeasuredHeight();
        double d1 = d();
        double d2 = i.b(g);
        d2 = -(d2 * d1) / ((double)i1 - d2);
        ((ChartAxis) (obj)).a().a(d2, d1);
        obj = ((ChartSeries)j.h().a("REFLECTION_SERIES")).F();
        ((l) (obj)).a();
        a(((l) (obj)), 0.98999999999999999D * d2);
        ((l) (obj)).b();
    }

    static 
    {
        a = 7;
    }
}
