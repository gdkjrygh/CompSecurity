// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.weight.ui;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.LoaderManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import com.artfulbits.aiCharts.Base.ChartAxis;
import com.artfulbits.aiCharts.Base.ChartAxisScale;
import com.artfulbits.aiCharts.Base.ChartNamedCollection;
import com.artfulbits.aiCharts.Base.ChartSeries;
import com.artfulbits.aiCharts.Base.e;
import com.artfulbits.aiCharts.Base.j;
import com.fitbit.data.domain.r;
import com.fitbit.ui.FitbitChartView;
import com.fitbit.util.an;
import com.fitbit.util.ap;
import com.fitbit.util.bv;
import com.fitbit.util.chart.a;
import java.util.List;

// Referenced classes of package com.fitbit.weight.ui:
//            AbsBodyChartFragment

public class LeanVsFatChartFragment extends AbsBodyChartFragment
{

    public static final String a = "lean";
    private static final String b = "%s: %s";
    private View l;
    private a m;
    private android.support.v4.app.LoaderManager.LoaderCallbacks n;

    public LeanVsFatChartFragment()
    {
        n = new _cls1();
    }

    static a a(LeanVsFatChartFragment leanvsfatchartfragment, a a1)
    {
        leanvsfatchartfragment.m = a1;
        return a1;
    }

    public static String a(Context context)
    {
        return context.getString(0x7f0801b7);
    }

    protected String a(String s)
    {
        return String.format("%s: %s", new Object[] {
            bv.b(getString(0x7f080097)), s
        });
    }

    protected void a(e e1, ChartAxis chartaxis)
    {
        if (!q())
        {
            h().s();
        }
        Object obj = (ChartSeries)e1.c().a("MAIN_SERIES");
        double d = chartaxis.a().f();
        double d2 = chartaxis.a().g();
        chartaxis = com.fitbit.util.chart.a.b(((ChartSeries) (obj)).I(), d, d2);
        obj = com.fitbit.util.chart.a.a(((ChartSeries) (obj)).I(), d, d2);
        Object obj1 = (ChartSeries)e1.c().a("lean");
        e1 = com.fitbit.util.chart.a.b(((ChartSeries) (obj1)).I(), d, d2);
        obj1 = com.fitbit.util.chart.a.a(((ChartSeries) (obj1)).I(), d, d2);
        if (chartaxis != null && obj != null && e1 != null && obj1 != null && chartaxis.a() == e1.a() && ((j) (obj1)).a() == ((j) (obj)).a())
        {
            double d1 = an.a(((j) (obj)).a(0) - ((j) (obj1)).a(0), 1) - an.a(chartaxis.a(0) - e1.a(0), 1);
            if (k != d1)
            {
                a(d1);
            }
            return;
        }
        if (e1 != null && obj1 != null && e1 == obj1)
        {
            a(0.0D);
            return;
        } else
        {
            a(1.7976931348623157E+308D);
            return;
        }
    }

    protected void a(FitbitChartView fitbitchartview)
    {
        com.fitbit.util.chart.a.b(fitbitchartview, getActivity());
        ((com.artfulbits.aiCharts.Base.a)fitbitchartview.g().get(0)).a(0, ap.a(getActivity(), 70F), 0, 0);
        ChartSeries chartseries = new ChartSeries("area1", new com.artfulbits.aiCharts.Types.a());
        chartseries.d(Integer.valueOf(0));
        chartseries.a(Integer.valueOf(getResources().getColor(0x7f0f0052)));
        ChartSeries chartseries1 = new ChartSeries("area2", new com.artfulbits.aiCharts.Types.a());
        chartseries1.d(Integer.valueOf(0));
        chartseries1.a(Integer.valueOf(getResources().getColor(0x7f0f0050)));
        ChartSeries chartseries2 = new ChartSeries("MAIN_SERIES", new com.fitbit.ui.a(getResources().getColor(0x7f0f0052)));
        chartseries2.d(Integer.valueOf(ap.a(getActivity(), 3F)));
        chartseries2.c(getResources().getDrawable(0x7f0202c9));
        chartseries2.a(Integer.valueOf(getResources().getColor(0x7f0f0053)));
        chartseries2.c(Integer.valueOf(getResources().getColor(0x7f0f0053)));
        ChartSeries chartseries3 = new ChartSeries("lean", new com.fitbit.ui.a(getResources().getColor(0x7f0f0050)));
        chartseries3.d(Integer.valueOf(ap.a(getActivity(), 3F)));
        chartseries3.a(Integer.valueOf(getResources().getColor(0x7f0f0051)));
        chartseries3.c(Integer.valueOf(getResources().getColor(0x7f0f0051)));
        com.fitbit.util.chart.a.a("historicalWeight", null, h(), ((com.artfulbits.aiCharts.Base.a)h().g().get(0)).d().a().c(), getResources().getColor(0x7f0f0052), getResources().getColor(0x7f0f0053), Integer.valueOf(ap.a(getActivity(), 3F)));
        fitbitchartview.h().add(chartseries);
        fitbitchartview.h().add(chartseries2);
        com.fitbit.util.chart.a.a("historicalLean", null, h(), ((com.artfulbits.aiCharts.Base.a)h().g().get(0)).d().a().c(), getResources().getColor(0x7f0f0050), getResources().getColor(0x7f0f0051), Integer.valueOf(ap.a(getActivity(), 3F)));
        fitbitchartview.h().add(chartseries1);
        fitbitchartview.h().add(chartseries3);
    }

    public void a(boolean flag)
    {
        super.a(flag);
        View view = l;
        byte byte0;
        if (flag)
        {
            byte0 = 8;
        } else
        {
            byte0 = 0;
        }
        view.setVisibility(byte0);
    }

    protected boolean a()
    {
        if (m != null)
        {
            Object obj = ((com.artfulbits.aiCharts.Base.a)h().g().get(0)).e().a();
            h().t();
    /* block-local class not found */
    class a {}

            ((ChartAxisScale) (obj)).c(m.g, m.h);
            obj = (ChartSeries)h().h().a("lean");
            ChartSeries chartseries = (ChartSeries)h().h().a("MAIN_SERIES");
            com.fitbit.util.chart.a.b(h(), d(), e(), m.j, true, new List[] {
                chartseries.I(), ((ChartSeries) (obj)).I()
            });
            return true;
        } else
        {
            return super.a();
        }
    }

    protected boolean a(com.fitbit.util.chart.Filter.Type type)
    {
        return type != com.fitbit.util.chart.Filter.Type.n;
    }

    protected void b()
    {
        b(true);
        getLoaderManager().restartLoader(103, a(f(), g(), new Bundle()), n);
    }

    public void b(boolean flag)
    {
        byte byte0 = 8;
        View view = j;
        int i;
        if (flag)
        {
            i = 8;
        } else
        {
            i = 0;
        }
        view.setVisibility(i);
        if (this.i != null)
        {
            Object obj = this.i;
            if (flag)
            {
                i = 0;
            } else
            {
                i = 8;
            }
            ((ProgressBar) (obj)).setVisibility(i);
        }
        obj = l;
        if (flag)
        {
            i = byte0;
        } else
        {
            i = 0;
        }
        ((View) (obj)).setVisibility(i);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f040183, null);
        l = layoutinflater.findViewById(0x7f11033b);
        return layoutinflater;
    }

    public void onResume()
    {
        super.onResume();
        getLoaderManager().restartLoader(103, a(f(), g(), new Bundle()), n);
    }

    protected String t()
    {
        com.fitbit.data.domain.WeightLogEntry.WeightUnits weightunits;
        if (m != null && m.c != null)
        {
            weightunits = m.c;
        } else
        {
            weightunits = r.a();
        }
        return weightunits.getShortDisplayName();
    }

    /* member class not found */
    class _cls1 {}

}
