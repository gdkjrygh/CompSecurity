// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.activity.ui.charts.views;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import com.artfulbits.aiCharts.Base.ChartAxis;
import com.artfulbits.aiCharts.Base.ChartAxisScale;
import com.artfulbits.aiCharts.Base.ChartNamedCollection;
import com.artfulbits.aiCharts.Base.ChartSeries;
import com.artfulbits.aiCharts.Base.e;
import com.artfulbits.aiCharts.Base.j;
import com.artfulbits.aiCharts.Base.l;
import com.artfulbits.aiCharts.ChartView;
import com.artfulbits.aiCharts.Enums.Alignment;
import com.fitbit.activity.ui.charts.ActivityType;
import com.fitbit.activity.ui.charts.a.b;
import com.fitbit.activity.ui.charts.a.d;
import com.fitbit.ui.charts.InteractiveChartView;
import com.fitbit.ui.charts.Timeframe;
import com.fitbit.ui.charts.m;
import com.fitbit.ui.charts.n;
import com.fitbit.ui.charts.t;
import com.fitbit.util.ap;
import com.fitbit.util.chart.a;
import com.fitbit.util.o;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.fitbit.activity.ui.charts.views:
//            c, a

public class ActivityInteractiveChartView extends InteractiveChartView
{
    private static class a
    {

        public TextView a;
        public TextView b;

        private a()
        {
        }

    }

    private class b
        implements com.artfulbits.aiCharts.Base.ChartAxis.b
    {

        final ActivityInteractiveChartView a;

        public void a(ChartAxis chartaxis, List list)
        {
            list.clear();
            int i1 = ActivityInteractiveChartView.f(a).b(com.fitbit.activity.ui.charts.views.ActivityInteractiveChartView.e(a).c(), ActivityInteractiveChartView.c(a));
            int j1 = ActivityInteractiveChartView.f(a).c();
            if (j1 == 1)
            {
                j1 = i1 / 4;
                i1 = 0;
                while (i1 < 5) 
                {
                    if (i1 % 2 == 0)
                    {
                        chartaxis = new com.artfulbits.aiCharts.Base.ChartAxis.a(com.fitbit.util.format.e.a(i1 * j1 + 0), i1 * j1 + 0, 2);
                    } else
                    {
                        chartaxis = new com.artfulbits.aiCharts.Base.ChartAxis.a("", i1 * j1 + 0, 2);
                    }
                    list.add(chartaxis);
                    i1++;
                }
            } else
            {
                double d1 = (double)i1 / (double)j1 / 4D;
                i1 = 0;
                while (i1 < 5) 
                {
                    if (i1 % 2 == 0)
                    {
                        double d2 = (double)i1 * d1 + 0.0D;
                        chartaxis = new com.artfulbits.aiCharts.Base.ChartAxis.a(com.fitbit.util.chart.a.a(d2, j1), d2, 2);
                    } else
                    {
                        chartaxis = new com.artfulbits.aiCharts.Base.ChartAxis.a("", (double)i1 * d1 + 0.0D, 2);
                    }
                    list.add(chartaxis);
                    i1++;
                }
            }
        }

        private b()
        {
            a = ActivityInteractiveChartView.this;
            super();
        }

    }


    private static final String b = "REFLECTION_SERIES";
    private t c;
    private double d;
    private Timeframe e;
    private ActivityType f;
    private d g;
    private double h;
    private m i;
    private com.fitbit.ui.charts.l j;
    private final b k;
    private View l;
    private long m;

    public ActivityInteractiveChartView(Context context)
    {
        super(context);
        k = new b();
        m = -1L;
    }

    public ActivityInteractiveChartView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        k = new b();
        m = -1L;
    }

    public ActivityInteractiveChartView(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        k = new b();
        m = -1L;
    }

    private com.fitbit.ui.charts.l.a a(e e1, ChartAxis chartaxis)
    {
        long l1 = Math.round(chartaxis.a().f());
        long l2 = Math.round(chartaxis.a().g());
        Date date = new Date(l1);
        Date date1 = new Date(l2);
        Calendar.getInstance().setTime(o.d(date));
        Calendar.getInstance().setTime(o.d(date1));
        e1 = (ChartSeries)e1.c().a("MAIN_SERIES");
        double d1 = chartaxis.a().f();
        double d2 = chartaxis.a().g();
        e1 = e1.I();
        int i1 = com.fitbit.util.chart.a.d(e1, d1, d2);
        int j1 = com.fitbit.util.chart.a.c(e1, d1, d2);
        d2 = 0.0D;
        d1 = d2;
        if (i1 != -1)
        {
            d1 = d2;
            if (j1 != -1)
            {
                d1 = 0.0D;
                for (; i1 <= j1; i1++)
                {
                    d1 += ((j)e1.get(i1)).a(0);
                }

            }
        }
        return new com.fitbit.ui.charts.l.a(date, date1, Double.valueOf(d1));
    }

    static com.fitbit.ui.charts.l.a a(ActivityInteractiveChartView activityinteractivechartview, e e1, ChartAxis chartaxis)
    {
        return activityinteractivechartview.a(e1, chartaxis);
    }

    static com.fitbit.ui.charts.l a(ActivityInteractiveChartView activityinteractivechartview)
    {
        return activityinteractivechartview.j;
    }

    private void a(Context context, ChartView chartview, Timeframe timeframe)
    {
        float f1;
        if (Timeframe.b.equals(timeframe))
        {
            f1 = 0.8F;
        } else
        {
            f1 = 0.6F;
        }
        chartview = chartview.h();
        if ((ChartSeries)chartview.a("MAIN_SERIES") == null)
        {
            timeframe = new ChartSeries("MAIN_SERIES", new c(context, true));
            timeframe.a(Integer.valueOf(context.getResources().getColor(0x7f0f000a)));
            timeframe.a(c.k, Float.valueOf(f1));
            chartview.add(timeframe);
        }
        if ((ChartSeries)chartview.a("REFLECTION_SERIES") == null)
        {
            int i1 = context.getResources().getColor(0x7f0f000e);
            int j1 = context.getResources().getColor(0x7f0f000d);
            timeframe = new ChartSeries("REFLECTION_SERIES", new com.fitbit.activity.ui.charts.views.a(i1, j1, true, true, context.getResources().getColor(0x7f0f000f), j1));
            timeframe.a(Integer.valueOf(context.getResources().getColor(0x7f0f00c2)));
            timeframe.a(c.k, Float.valueOf(f1));
            if (ActivityType.c.equals(f))
            {
                timeframe.a(com.fitbit.activity.ui.charts.views.a.j, Double.valueOf(0.0001D));
            }
            chartview.add(timeframe);
        }
    }

    private void a(l l1, double d1)
    {
        double d2 = c.c();
        if (d2 - 1.0000000000000001E-05D > 0.0D)
        {
            d1 /= d2;
        } else
        {
            d1 = 0.0D;
        }
        l1.a(c, new com.artfulbits.aiCharts.Base.t(d1) {

            final double a;
            final ActivityInteractiveChartView b;

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
                b = ActivityInteractiveChartView.this;
                a = d1;
                super();
            }
        });
    }

    private void a(ChartView chartview)
    {
        chartview = ((ChartSeries)chartview.h().a("MAIN_SERIES")).F();
        chartview.a();
        chartview.a(c, new com.artfulbits.aiCharts.Base.t() {

            final ActivityInteractiveChartView a;

            public j a(Object obj, j j1)
            {
                obj = (n)obj;
                double d1 = ((n) (obj)).b();
                if (j1 != null)
                {
                    j1.a(((n) (obj)).a(), d1);
                } else
                {
                    j1 = new j(((n) (obj)).a(), new double[] {
                        d1
                    });
                }
                if (d1 >= ActivityInteractiveChartView.c(a))
                {
                    j1.a(com.fitbit.activity.ui.charts.views.c.j, Boolean.valueOf(true));
                }
                if ((long)j1.a() == com.fitbit.activity.ui.charts.views.ActivityInteractiveChartView.d(a))
                {
                    j1.a(com.fitbit.activity.ui.charts.views.c.l, Boolean.valueOf(true));
                }
                return j1;
            }

            public volatile Object a(Object obj, Object obj1)
            {
                return a(obj, (j)obj1);
            }

            
            {
                a = ActivityInteractiveChartView.this;
                super();
            }
        });
        h();
        chartview.b();
    }

    static m b(ActivityInteractiveChartView activityinteractivechartview)
    {
        return activityinteractivechartview.i;
    }

    static double c(ActivityInteractiveChartView activityinteractivechartview)
    {
        return activityinteractivechartview.d;
    }

    static long d(ActivityInteractiveChartView activityinteractivechartview)
    {
        return activityinteractivechartview.m;
    }

    static t e(ActivityInteractiveChartView activityinteractivechartview)
    {
        return activityinteractivechartview.c;
    }

    static d f(ActivityInteractiveChartView activityinteractivechartview)
    {
        return activityinteractivechartview.g;
    }

    private void h()
    {
        ChartAxis chartaxis = ((com.artfulbits.aiCharts.Base.a)a.g().get(0)).d();
        Date date = o.c(new Date());
        Iterator iterator = c.iterator();
        long l1 = 0x7fffffffffffffffL;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            n n1 = (n)iterator.next();
            if (n1.a() < l1)
            {
                l1 = n1.a();
            }
        } while (true);
        long l2 = e.a();
        long l3 = e.a() / 15L + date.getTime();
        l1 = Math.min(l1, l3);
        chartaxis.a().a(l1 - l2, l3);
        chartaxis.a().c(l3 - l2, l3);
    }

    protected int a()
    {
        return 0x7f04019a;
    }

    protected View a(j j1)
    {
        double d1;
        a a1;
        if (l == null)
        {
            l = View.inflate(getContext(), 0x7f040171, null);
            a1 = new a();
            a1.a = (TextView)l.findViewById(0x7f11041b);
            a1.b = (TextView)l.findViewById(0x7f110145);
            l.setTag(a1);
        } else
        {
            a1 = (a)l.getTag();
        }
        d1 = j1.a(0);
        j1.a(Integer.valueOf(getContext().getResources().getColor(0x7f0f0172)));
        a1.a.setText(com.fitbit.util.a.a(getContext(), f, Double.valueOf(d1)));
        j1 = new Date((long)j1.a());
        j1 = com.fitbit.util.chart.a.a(getContext(), j1, e);
        a1.b.setText(j1);
        return l;
    }

    protected j a(MotionEvent motionevent)
    {
        return com.fitbit.util.chart.a.a(g(), "MAIN_SERIES", motionevent);
    }

    protected void a(long l1)
    {
        m = l1;
        a(c, d, e, f);
    }

    public void a(com.fitbit.ui.charts.l l1)
    {
        j = l1;
    }

    public void a(m m1)
    {
        i = m1;
    }

    public void a(t t1, double d1, Timeframe timeframe, ActivityType activitytype)
    {
        if (t1 != null && timeframe != null)
        {
            h = ((com.artfulbits.aiCharts.Base.a)g().g().get(0)).d().a().o();
            c = t1;
            d = d1;
            e = timeframe;
            f = activitytype;
            g = activitytype.d().b();
            t1 = getContext();
            a(((Context) (t1)), g(), e);
            a(g());
            activitytype = (com.artfulbits.aiCharts.Base.a)g().g().get(0);
            int i1 = (int)Math.ceil(ap.b(24F));
            activitytype.a((int)ap.b(2.5F), i1, 0, 0);
            timeframe = activitytype.d();
            timeframe.a(com.artfulbits.aiCharts.Base.ChartAxis.LabelPosition.c);
            timeframe.a(com.fitbit.util.chart.a.a(t1, e));
            com.fitbit.heartrate.charts.a.c(t1, timeframe.k());
            activitytype = activitytype.e();
            activitytype.a(com.artfulbits.aiCharts.Base.ChartAxis.LabelPosition.c);
            activitytype.a(Alignment.c);
            activitytype.a(k);
            com.fitbit.activity.ui.charts.a.b(t1, activitytype.k());
            com.fitbit.heartrate.charts.a.b(t1, activitytype.s());
            com.fitbit.heartrate.charts.a.a(t1, activitytype.r());
            com.fitbit.heartrate.charts.a.a(t1, timeframe.r());
            if (j != null)
            {
                t1 = a(g().b(), ((ChartAxis) (timeframe)));
                j.a(t1);
            }
            if (!Double.isNaN(h))
            {
                ((com.artfulbits.aiCharts.Base.a)g().g().get(0)).d().a().b(h);
            }
            if (!isLayoutRequested())
            {
                requestLayout();
                return;
            }
        }
    }

    protected void b()
    {
        super.b();
        ((com.artfulbits.aiCharts.Base.a)g().g().get(0)).d().a(new com.artfulbits.aiCharts.Base.ChartAxis.c() {

            final ActivityInteractiveChartView a;

            public void a(e e1, ChartAxis chartaxis)
            {
            }

            public void b(e e1, ChartAxis chartaxis)
            {
                if (com.fitbit.activity.ui.charts.views.ActivityInteractiveChartView.a(a) != null)
                {
                    com.fitbit.activity.ui.charts.views.ActivityInteractiveChartView.a(a).a(com.fitbit.activity.ui.charts.views.ActivityInteractiveChartView.a(a, e1, chartaxis));
                }
                if (com.fitbit.activity.ui.charts.views.ActivityInteractiveChartView.b(a) != null)
                {
                    double d1 = ((com.artfulbits.aiCharts.Base.a)e1.b().get(0)).d().a().o();
                    com.fitbit.activity.ui.charts.views.ActivityInteractiveChartView.b(a).a(d1);
                }
            }

            
            {
                a = ActivityInteractiveChartView.this;
                super();
            }
        });
    }

    protected com.fitbit.ui.charts.b c()
    {
        return com.fitbit.ui.charts.b.a(getContext(), false);
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        j = null;
        i = null;
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        double d1 = 0.0D;
        if (c != null)
        {
            d1 = c.c();
        }
        int i2 = a.getMeasuredHeight();
        d1 = 1.01D * Math.max(d1, g.a(d1, d).doubleValue());
        double d2 = g.b(getContext());
        d2 = -(d2 * d1) / ((double)i2 - d2);
        ((com.artfulbits.aiCharts.Base.a)g().g().get(0)).e().a().a(d2, d1);
        l l2 = ((ChartSeries)g().h().a("REFLECTION_SERIES")).F();
        l2.a();
        a(l2, d2 * 0.98999999999999999D);
        l2.b();
        super.onLayout(flag, i1, j1, k1, l1);
    }
}
