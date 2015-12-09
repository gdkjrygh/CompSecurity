// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.activity.ui.details;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.artfulbits.aiCharts.Base.ChartAxis;
import com.artfulbits.aiCharts.Base.ChartAxisScale;
import com.artfulbits.aiCharts.Base.ChartNamedCollection;
import com.artfulbits.aiCharts.Base.ChartSeries;
import com.artfulbits.aiCharts.Base.j;
import com.artfulbits.aiCharts.Base.l;
import com.artfulbits.aiCharts.ChartView;
import com.artfulbits.aiCharts.Enums.Alignment;
import com.fitbit.activity.ui.charts.views.a;
import com.fitbit.activity.ui.charts.views.c;
import com.fitbit.ui.charts.h;
import com.fitbit.ui.charts.n;
import com.fitbit.ui.charts.s;
import com.fitbit.ui.charts.t;
import com.fitbit.util.ap;
import com.fitbit.util.format.e;
import com.fitbit.util.o;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.fitbit.activity.ui.details:
//            b

public class IntradayActivityBabyChartView extends FrameLayout
{
    private class a
        implements com.artfulbits.aiCharts.Base.ChartAxis.b
    {

        private static final double b = 0.75D;
        final IntradayActivityBabyChartView a;
        private final double c[] = {
            400D, 200D, 100D, 20D, 10D, 6D, 4D, 2D, 1.0D, 0.59999999999999998D, 
            0.40000000000000002D, 0.20000000000000001D, 0.10000000000000001D
        };

        private double a()
        {
            double d1 = IntradayActivityBabyChartView.b(a).c();
            int i1 = 0;
            do
            {
                if (i1 >= c.length)
                {
                    break;
                }
                double d2 = c[i1];
                if (d2 < 2D)
                {
                    break;
                }
                int j1 = com.fitbit.heartrate.charts.a.a((int)d1, (int)d2);
                if (j1 != 0 && (double)j1 > 0.75D * d1)
                {
                    return (double)j1;
                }
                i1++;
            } while (true);
            return 2D;
        }

        private com.artfulbits.aiCharts.Base.ChartAxis.a a(double d1)
        {
            com.artfulbits.aiCharts.Base.ChartAxis.a a1;
            if (com.fitbit.activity.ui.details.IntradayActivityBabyChartView.a(a))
            {
                a1 = new com.artfulbits.aiCharts.Base.ChartAxis.a(com.fitbit.util.format.e.b(d1), d1);
            } else
            {
                a1 = new com.artfulbits.aiCharts.Base.ChartAxis.a(com.fitbit.util.format.e.b((int)d1), (int)d1);
            }
            a(a1);
            return a1;
        }

        private void a(com.artfulbits.aiCharts.Base.ChartAxis.a a1)
        {
            a1.a(new Paint());
            com.fitbit.heartrate.charts.a.c(a.getContext(), a1.c());
            a1.b(3);
        }

        private double b()
        {
            double d1 = IntradayActivityBabyChartView.b(a).c();
            double d2 = c[c.length - 1];
            for (int i1 = 0; i1 < c.length; i1++)
            {
                double d3 = c[i1];
                if (d3 >= 2D)
                {
                    int j1 = com.fitbit.heartrate.charts.a.a((int)d1, (int)d3);
                    if (j1 != 0 && (double)j1 > d1 * 0.75D)
                    {
                        return (double)j1;
                    }
                    continue;
                }
                int k1 = (int)(d1 * 10D);
                int l1 = com.fitbit.heartrate.charts.a.a(k1, (int)(d3 * 10D));
                if (l1 != 0 && l1 > (int)((double)k1 * 0.75D))
                {
                    return (double)l1 / 10D;
                }
            }

            return d2;
        }

        public void a(ChartAxis chartaxis, List list)
        {
            list.clear();
            double d1;
            if (com.fitbit.activity.ui.details.IntradayActivityBabyChartView.a(a))
            {
                d1 = b();
            } else
            {
                d1 = a();
            }
            list.add(a(d1));
            list.add(a(d1 / 2D));
            list.add(a(0.0D));
        }

        private a()
        {
            a = IntradayActivityBabyChartView.this;
            super();
        }

    }


    private static final String a = "MAIN_SERIES";
    private static final String b = "REFLECTION_SERIES";
    private static final double c = 1.03D;
    private static final double d = 2D;
    private static final double e = 0.10000000000000001D;
    private static final double f = 0.0001D;
    private static final float g = 0.9F;
    private t h;
    private boolean i;
    private com.artfulbits.aiCharts.Base.ChartAxis.b j;
    private final a k;
    private Paint l;
    private ChartView m;
    private View n;

    public IntradayActivityBabyChartView(Context context)
    {
        super(context);
        k = new a();
        a();
    }

    public IntradayActivityBabyChartView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        k = new a();
        a();
    }

    public IntradayActivityBabyChartView(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        k = new a();
        a();
    }

    private void a(double d1)
    {
        l l1 = e().F();
        l1.a();
        l1.clear();
        for (int i1 = 0; i1 < h.d(); i1++)
        {
            s s1 = (s)h.a(i1);
            l1.b(new j(s1.a(), new double[] {
                s1.b() * -d1
            }));
        }

        l1.b();
    }

    static boolean a(IntradayActivityBabyChartView intradayactivitybabychartview)
    {
        return intradayactivitybabychartview.i;
    }

    private double b()
    {
        return h.c();
    }

    static t b(IntradayActivityBabyChartView intradayactivitybabychartview)
    {
        return intradayactivitybabychartview.h;
    }

    private double c()
    {
        if (i)
        {
            return Math.max(h.c(), 0.10000000000000001D) * 1.03D;
        } else
        {
            return Math.max(h.c(), 2D) * 1.03D;
        }
    }

    private void d()
    {
        ChartNamedCollection chartnamedcollection = m.h();
        if ((ChartSeries)chartnamedcollection.a("REFLECTION_SERIES") == null)
        {
            Object obj = getContext().getResources();
            obj = new com.fitbit.activity.ui.charts.views.a(((Resources) (obj)).getColor(0x7f0f000e), ((Resources) (obj)).getColor(0x7f0f000d), false);
            ((com.fitbit.activity.ui.charts.views.a) (obj)).a(ap.b(0.2F));
            ((com.fitbit.activity.ui.charts.views.a) (obj)).a((int)ap.b(1.5F));
            obj = new ChartSeries("REFLECTION_SERIES", ((com.artfulbits.aiCharts.Base.q) (obj)));
            ((ChartSeries) (obj)).a(c.k, Float.valueOf(0.9F));
            chartnamedcollection.add(obj);
        }
    }

    private ChartSeries e()
    {
        d();
        return (ChartSeries)m.h().a("REFLECTION_SERIES");
    }

    private void f()
    {
        ChartAxis chartaxis = ((com.artfulbits.aiCharts.Base.a)m.g().get(0)).d();
        Date date = new Date((long)h.a());
        long l1 = o.a(date).getTime();
        long l2 = o.e(date).getTime();
        chartaxis.a().a(l1, l2);
    }

    private com.artfulbits.aiCharts.Base.ChartAxis.b g()
    {
        if (j == null)
        {
            Date date = new Date((long)h.a());
            j = new h(getContext(), date, h(), true);
        }
        return j;
    }

    private Paint h()
    {
        if (l == null)
        {
            l = new Paint();
            com.fitbit.heartrate.charts.a.c(getContext(), l);
        }
        return l;
    }

    private void i()
    {
        ChartNamedCollection chartnamedcollection = m.h();
        ChartSeries chartseries1 = (ChartSeries)chartnamedcollection.a("MAIN_SERIES");
        ChartSeries chartseries = chartseries1;
        if (chartseries1 == null)
        {
            chartseries = new ChartSeries("MAIN_SERIES", new b());
            chartseries.a(Integer.valueOf(-1));
            chartnamedcollection.add(chartseries);
        }
        chartseries.F().a(h, new com.artfulbits.aiCharts.Base.t() {

            final IntradayActivityBabyChartView a;

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
                a = IntradayActivityBabyChartView.this;
                super();
            }
        });
    }

    protected void a()
    {
        inflate(getContext(), 0x7f04017f, this);
        n = findViewById(0x7f11042d);
        m = (ChartView)findViewById(0x7f110234);
        m.setLayerType(1, null);
    }

    public void a(t t1, boolean flag)
    {
        h = t1;
        i = flag;
        t1 = t1.iterator();
        double d1;
        for (d1 = 0.0D; t1.hasNext(); d1 = ((s)t1.next()).b() + d1) { }
        if (d1 < 0.0001D)
        {
            m.setVisibility(8);
            n.setVisibility(0);
            return;
        } else
        {
            m.setVisibility(0);
            n.setVisibility(8);
            t1 = ((com.artfulbits.aiCharts.Base.a)m.g().get(0)).d();
            t1.a(g());
            t1.a(ap.b(2.0F), -1);
            com.fitbit.heartrate.charts.a.a(getContext(), t1.r());
            t1.d((int)ap.b(10F));
            t1.a(com.artfulbits.aiCharts.Base.ChartAxis.LabelPosition.c);
            t1.a(Alignment.c);
            t1 = ((com.artfulbits.aiCharts.Base.a)m.g().get(0)).e();
            com.fitbit.heartrate.charts.a.b(getContext(), t1.s());
            com.fitbit.heartrate.charts.a.a(getContext(), t1.r());
            t1.d((int)ap.b(5F));
            t1.a(k);
            t1.a(com.artfulbits.aiCharts.Base.ChartAxis.LabelPosition.a);
            t1.a(Alignment.b);
            i();
            f();
            t1.a().b(Double.valueOf(c()));
            requestLayout();
            return;
        }
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        if (h != null && h.d() > 0)
        {
            int i2 = m.getMeasuredHeight();
            double d1 = c();
            double d2 = getContext().getResources().getDimensionPixelSize(0x7f0a0056);
            d1 = (d1 * d2) / ((double)i2 - d2);
            ((com.artfulbits.aiCharts.Base.a)m.g().get(0)).e().a().a(Double.valueOf(-d1));
            a(d1 / b());
        }
        super.onLayout(flag, i1, j1, k1, l1);
    }
}
