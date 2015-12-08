// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.weight.ui;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.LoaderManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.artfulbits.aiCharts.Base.ChartAxis;
import com.artfulbits.aiCharts.Base.ChartAxisScale;
import com.artfulbits.aiCharts.Base.ChartNamedCollection;
import com.artfulbits.aiCharts.Base.ChartSeries;
import com.artfulbits.aiCharts.Base.e;
import com.fitbit.ui.ColorSectionsView;
import com.fitbit.ui.FitbitChartView;
import com.fitbit.util.ap;
import com.fitbit.util.bv;
import com.fitbit.util.chart.a;
import java.util.List;

// Referenced classes of package com.fitbit.weight.ui:
//            AbsBodyChartFragment

public class BmiChartFragment extends AbsBodyChartFragment
{

    private static final String a = "%s %s";
    private a b;
    private ColorSectionsView l;
    private android.support.v4.app.LoaderManager.LoaderCallbacks m;

    public BmiChartFragment()
    {
        m = new _cls1();
    }

    static a a(BmiChartFragment bmichartfragment, a a1)
    {
        bmichartfragment.b = a1;
        return a1;
    }

    protected String a(String s)
    {
        return String.format("%s %s", new Object[] {
            getString(0x7f080090), s
        });
    }

    protected void a(FitbitChartView fitbitchartview)
    {
        int j;
        com.fitbit.util.chart.a.b(fitbitchartview, getActivity());
        com.fitbit.util.chart.a.a("historical", null, h(), ((com.artfulbits.aiCharts.Base.a)h().g().get(0)).d().a().c(), getResources().getColor(0x7f0f004c), getResources().getColor(0x7f0f004d), Integer.valueOf(ap.a(getActivity(), 3F)));
        ChartSeries chartseries = new ChartSeries("MAIN_SERIES", new com.fitbit.ui.a(getResources().getColor(0x7f0f004c)));
        chartseries.d(Integer.valueOf(ap.a(getActivity(), 3F)));
        chartseries.c(getResources().getDrawable(0x7f020092));
        chartseries.a(Integer.valueOf(getResources().getColor(0x7f0f004d)));
        chartseries.c(Integer.valueOf(getResources().getColor(0x7f0f004d)));
        chartseries.a(true);
        ChartSeries chartseries1 = new ChartSeries("area", new com.artfulbits.aiCharts.Types.a());
        chartseries1.d(Integer.valueOf(0));
        chartseries1.a(Integer.valueOf(getResources().getColor(0x7f0f004c)));
        fitbitchartview.h().add(chartseries1);
        fitbitchartview.h().add(chartseries);
        j = 0;
_L6:
        int i;
        if (j >= 4)
        {
            break MISSING_BLOCK_LABEL_372;
        }
        fitbitchartview = bv.a(getString(0x7f080094));
        i = getResources().getColor(0x7f0f0057);
        j;
        JVM INSTR tableswitch 1 3: default 280
    //                   1 300
    //                   2 324
    //                   3 348;
           goto _L1 _L2 _L3 _L4
_L4:
        break MISSING_BLOCK_LABEL_348;
_L1:
        break; /* Loop/switch isn't completed */
_L2:
        break; /* Loop/switch isn't completed */
_L7:
        l.a(i, 0.0F, fitbitchartview);
        j++;
        if (true) goto _L6; else goto _L5
_L5:
        i = getResources().getColor(0x7f0f0056);
        fitbitchartview = bv.a(getString(0x7f080095));
          goto _L7
_L3:
        i = getResources().getColor(0x7f0f0054);
        fitbitchartview = bv.a(getString(0x7f080093));
          goto _L7
        i = getResources().getColor(0x7f0f0055);
        fitbitchartview = bv.a(getString(0x7f080096));
          goto _L7
    }

    public void a(boolean flag)
    {
        super.a(flag);
        ColorSectionsView colorsectionsview = l;
        byte byte0;
        if (flag)
        {
            byte0 = 8;
        } else
        {
            byte0 = 0;
        }
        colorsectionsview.setVisibility(byte0);
    }

    protected boolean a()
    {
        if (b != null)
        {
            Object obj = ((com.artfulbits.aiCharts.Base.a)h().g().get(0)).e().a();
            h().t();
    /* block-local class not found */
    class a {}

            ((ChartAxisScale) (obj)).c(b.g, b.h);
            obj = (ChartSeries)h().h().a("MAIN_SERIES");
            com.fitbit.util.chart.a.b(h(), d(), e(), b.j, true, new List[] {
                ((ChartSeries) (obj)).I()
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
        getLoaderManager().restartLoader(102, a(f(), g(), new Bundle()), m);
    }

    protected void b(e e, ChartAxis chartaxis)
    {
        super.b(e, chartaxis);
        double d2 = chartaxis.a().f();
        double d1 = chartaxis.a().g();
        double d = d1 - d2;
        com.fitbit.e.a.b("CHAPKA", "%s:%s:%s", new Object[] {
            Double.valueOf(d1), Double.valueOf(d2), Double.valueOf(d)
        });
        double d3 = Math.min(Math.max(0.0D, 18.5D - d2), d);
        double d4 = d - d3;
        d1 = Math.min(Math.max(0.0D, 25D - d2 - d3), d4);
        d4 = Math.min(Math.max(0.0D, 30D - d2 - d1 - d3), d4 - d1);
        d2 = d3 / d;
        d1 /= d;
        d = d4 / d;
        d3 = Math.max(0.0D, 1.0D - (d2 + d1 + d));
        if (l != null)
        {
            com.fitbit.e.a.b("CHAPKA", "%s:%s:%s:%s", new Object[] {
                Double.valueOf(d3), Double.valueOf(d), Double.valueOf(d1), Double.valueOf(d2)
            });
            l.a(new float[] {
                (float)d3, (float)d, (float)d1, (float)d2
            });
        }
    }

    public void b(boolean flag)
    {
        super.b(flag);
        ColorSectionsView colorsectionsview = l;
        byte byte0;
        if (flag)
        {
            byte0 = 4;
        } else
        {
            byte0 = 0;
        }
        colorsectionsview.setVisibility(byte0);
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f040124, null);
        l = (ColorSectionsView)layoutinflater.findViewById(0x7f1102cf);
        return layoutinflater;
    }

    public void onResume()
    {
        super.onResume();
        getLoaderManager().restartLoader(102, a(f(), g(), new Bundle()), m);
    }

    protected String t()
    {
        return null;
    }

    /* member class not found */
    class _cls1 {}

}
