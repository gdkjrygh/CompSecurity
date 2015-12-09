// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.heartrate.charts.views;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.artfulbits.aiCharts.Base.ChartAxis;
import com.artfulbits.aiCharts.Base.ChartAxisScale;
import com.artfulbits.aiCharts.Base.ChartCollection;
import com.artfulbits.aiCharts.Base.ChartNamedCollection;
import com.artfulbits.aiCharts.Base.ChartSeries;
import com.artfulbits.aiCharts.Base.a;
import com.artfulbits.aiCharts.Base.q;
import com.artfulbits.aiCharts.ChartView;
import com.artfulbits.aiCharts.Enums.Alignment;
import com.artfulbits.aiCharts.Types.ChartLineType;
import com.artfulbits.aiCharts.Types.o;
import com.fitbit.data.domain.TimeSeriesObject;
import com.fitbit.data.domain.heartrate.HeartRateDailySummary;
import com.fitbit.data.domain.heartrate.HeartRateZone;
import com.fitbit.heartrate.charts.HeartRateIntradayTimeSeriesInterpolator;
import com.fitbit.ui.charts.h;
import com.fitbit.util.ap;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

public class IntradayHeartRateBabyChartView extends FrameLayout
{
    private class a
        implements com.artfulbits.aiCharts.Base.ChartAxis.b
    {

        final IntradayHeartRateBabyChartView a;

        private com.artfulbits.aiCharts.Base.ChartAxis.a a()
        {
            int l = (int)Math.round(com.fitbit.heartrate.charts.views.IntradayHeartRateBabyChartView.a(a));
            com.artfulbits.aiCharts.Base.ChartAxis.a a1 = new com.artfulbits.aiCharts.Base.ChartAxis.a(String.valueOf(l), l);
            a(a1);
            return a1;
        }

        private void a(com.artfulbits.aiCharts.Base.ChartAxis.a a1)
        {
            a1.a(IntradayHeartRateBabyChartView.c(a));
            a1.b(3);
        }

        private com.artfulbits.aiCharts.Base.ChartAxis.a b()
        {
            int l = (int)Math.round(IntradayHeartRateBabyChartView.b(a));
            int i1 = (int)Math.round(com.fitbit.heartrate.charts.views.IntradayHeartRateBabyChartView.a(a));
            l = Math.round((l - i1) / 2 + i1);
            com.artfulbits.aiCharts.Base.ChartAxis.a a1 = new com.artfulbits.aiCharts.Base.ChartAxis.a(String.valueOf(l), l);
            a(a1);
            return a1;
        }

        private com.artfulbits.aiCharts.Base.ChartAxis.a c()
        {
            int l = (int)Math.round(IntradayHeartRateBabyChartView.b(a));
            com.artfulbits.aiCharts.Base.ChartAxis.a a1 = new com.artfulbits.aiCharts.Base.ChartAxis.a(String.valueOf(l), l);
            a(a1);
            return a1;
        }

        public void a(ChartAxis chartaxis, List list)
        {
            list.clear();
            list.add(a());
            list.add(b());
            list.add(c());
        }

        private a()
        {
            a = IntradayHeartRateBabyChartView.this;
            super();
        }

    }


    private static final double b = 40D;
    protected ChartView a;
    private HeartRateDailySummary c;
    private List d;
    private q e;
    private double f;
    private double g;
    private Paint h;
    private com.artfulbits.aiCharts.Base.ChartAxis.b i;
    private final a j;
    private Comparator k = new Comparator() {

        final IntradayHeartRateBabyChartView a;

        public int a(TimeSeriesObject timeseriesobject, TimeSeriesObject timeseriesobject1)
        {
            if (timeseriesobject.b() < timeseriesobject1.b())
            {
                return -1;
            }
            return timeseriesobject.b() <= timeseriesobject1.b() ? 0 : 1;
        }

        public int compare(Object obj, Object obj1)
        {
            return a((TimeSeriesObject)obj, (TimeSeriesObject)obj1);
        }

            
            {
                a = IntradayHeartRateBabyChartView.this;
                super();
            }
    };

    public IntradayHeartRateBabyChartView(Context context)
    {
        super(context);
        h = new Paint(1);
        j = new a();
    }

    public IntradayHeartRateBabyChartView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        h = new Paint(1);
        j = new a();
    }

    public IntradayHeartRateBabyChartView(Context context, AttributeSet attributeset, int l)
    {
        super(context, attributeset, l);
        h = new Paint(1);
        j = new a();
    }

    static double a(IntradayHeartRateBabyChartView intradayheartratebabychartview)
    {
        return intradayheartratebabychartview.c();
    }

    private q a(Date date)
    {
        if (e == null)
        {
            e = new o();
        }
        return e;
    }

    static double b(IntradayHeartRateBabyChartView intradayheartratebabychartview)
    {
        return intradayheartratebabychartview.e();
    }

    private void b()
    {
        if (d != null && d.size() > 0)
        {
            Object obj = ((TimeSeriesObject)d.get(0)).a();
            Object obj1 = com.fitbit.util.o.d(((Date) (obj)));
            Object obj2 = new Date(com.fitbit.util.o.f(((Date) (obj))).getTime());
            ((com.artfulbits.aiCharts.Base.a)a.g().get(0)).d().a().a(((Date) (obj1)), ((Date) (obj2)));
            g = c();
            f = d();
            ((com.artfulbits.aiCharts.Base.a)a.g().get(0)).e().a().a(g, f + 2D);
            obj1 = a.h();
            ((ChartNamedCollection) (obj1)).clear();
            obj = new ChartSeries("MAIN_SERIES", a(((Date) (obj))));
            ((ChartSeries) (obj)).a(Integer.valueOf(0));
            obj2 = ((ChartSeries) (obj)).F();
            ((ChartSeries) (obj)).a(ChartLineType.h, com.artfulbits.aiCharts.Types.ChartLineType.BreakMode.c);
            HeartRateIntradayTimeSeriesInterpolator.a(d, ((com.artfulbits.aiCharts.Base.l) (obj2)));
            ((ChartNamedCollection) (obj1)).add(obj);
            com.fitbit.heartrate.charts.a.a(getContext(), ((ChartNamedCollection) (obj1)), ((com.artfulbits.aiCharts.Base.l) (obj2)), h);
        }
    }

    private double c()
    {
        double d1 = 40D;
        double d2 = f();
        if (d2 < 40D)
        {
            d1 = d2 - 1.0D;
        }
        return d1;
    }

    static Paint c(IntradayHeartRateBabyChartView intradayheartratebabychartview)
    {
        return intradayheartratebabychartview.g();
    }

    private double d()
    {
        return e();
    }

    private double e()
    {
        return ((TimeSeriesObject)Collections.max(d, k)).b();
    }

    private double f()
    {
        return ((TimeSeriesObject)Collections.min(d, k)).b();
    }

    private Paint g()
    {
        Paint paint = new Paint();
        com.fitbit.heartrate.charts.a.c(getContext(), paint);
        return paint;
    }

    private com.artfulbits.aiCharts.Base.ChartAxis.b h()
    {
        if (i == null)
        {
            Date date = ((TimeSeriesObject)d.get(0)).a();
            i = new h(getContext(), date, g());
        }
        return i;
    }

    protected void a()
    {
        a.setLayerType(1, null);
    }

    public void a(com.fitbit.heartrate.charts.b.a a1)
    {
        a.k().clear();
        a.h().clear();
        c = a1.a();
        d = a1.b();
        if (a1.a() == null || !a1.a().d() || a1.b() == null || a1.b().size() == 0)
        {
            return;
        } else
        {
            int l = (int)Math.ceil(getResources().getDimensionPixelSize(0x7f0a00e5) / 2);
            ((com.artfulbits.aiCharts.Base.a)a.g().get(0)).a((int)ap.b(2.5F), l, 0, (int)ap.b(2.0F));
            ChartAxis chartaxis = ((com.artfulbits.aiCharts.Base.a)a.g().get(0)).d();
            chartaxis.a(h());
            chartaxis.a(ap.b(2.0F), -1);
            a1 = getContext();
            com.fitbit.heartrate.charts.a.a(a1, chartaxis.r());
            chartaxis.d((int)ap.b(10F));
            chartaxis.a(Alignment.c);
            chartaxis = ((com.artfulbits.aiCharts.Base.a)a.g().get(0)).e();
            com.fitbit.heartrate.charts.a.b(a1, chartaxis.s());
            com.fitbit.heartrate.charts.a.a(a1, chartaxis.r());
            chartaxis.d((int)ap.b(5F));
            chartaxis.a(j);
            chartaxis.a(com.artfulbits.aiCharts.Base.ChartAxis.LabelPosition.a);
            chartaxis.a(Alignment.b);
            b();
            requestLayout();
            return;
        }
    }

    protected void onLayout(boolean flag, int l, int i1, int j1, int k1)
    {
        if (d != null && d.size() > 0 && c != null && c.d())
        {
            Object obj = ((TimeSeriesObject)d.get(0)).a();
            double d1 = c.a(com.fitbit.data.domain.heartrate.HeartRateZone.HeartRateZoneType.PEAK).b();
            double d2 = com.fitbit.heartrate.charts.a.a(((Date) (obj)));
            int l1 = a.getMeasuredHeight();
            double d3 = f;
            double d4 = g;
            obj = com.fitbit.heartrate.charts.a.a(getContext(), l1, d1, d2, d3, d4);
            h.setShader(((android.graphics.Shader) (obj)));
        }
        super.onLayout(flag, l, i1, j1, k1);
    }
}
