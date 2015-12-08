// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.weight.ui;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.Loader;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.artfulbits.aiCharts.Base.ChartAxis;
import com.artfulbits.aiCharts.Base.ChartAxisScale;
import com.artfulbits.aiCharts.Base.ChartCollection;
import com.artfulbits.aiCharts.Base.ChartNamedCollection;
import com.artfulbits.aiCharts.Base.ChartSeries;
import com.artfulbits.aiCharts.Base.a;
import com.artfulbits.aiCharts.Base.l;
import com.fitbit.FitBitApplication;
import com.fitbit.data.domain.WeightGoal;
import com.fitbit.data.domain.r;
import com.fitbit.savedstate.v;
import com.fitbit.ui.FitbitChartView;
import com.fitbit.ui.g;
import com.fitbit.util.ap;
import com.fitbit.util.chart.Filter;
import com.fitbit.util.format.f;
import com.fitbit.weight.Weight;
import java.util.Date;
import java.util.List;

// Referenced classes of package com.fitbit.weight.ui:
//            AbsBodyChartFragment, a

public class WeightChartFragment extends AbsBodyChartFragment
    implements android.support.v4.app.LoaderManager.LoaderCallbacks
{

    private static final String a = "%s %s";
    private a b;

    public WeightChartFragment()
    {
    }

    protected String a(String s)
    {
        return String.format("%s %s", new Object[] {
            getString(0x7f080590), s
        });
    }

    public void a(Loader loader, a a1)
    {
        b = a1;
        if (!v.a(k()))
        {
            b(true);
        } else
        {
            if (a1 == null)
            {
                a(true);
                return;
            }
            o();
    /* block-local class not found */
    class a {}

            Object obj = new _cls1(a1.c);
            h().a(((java.text.Format) (obj)));
            h().p();
            obj = (ChartSeries)h().h().a("MAIN_SERIES");
            boolean flag = m();
            ((ChartSeries) (obj)).F().clear();
            ((ChartSeries) (obj)).F().a(a1.a, new _cls2());
            Object obj1 = (ChartSeries)h().h().a("area");
            ((ChartSeries) (obj1)).F().clear();
            ((ChartSeries) (obj1)).F().a(a1.a, new _cls3());
            obj1 = ((a)h().g().get(0)).e().a();
            ((ChartAxisScale) (obj1)).b(Double.valueOf(a1.f));
            if (a1.i || s())
            {
                h().t();
                ((ChartAxisScale) (obj1)).c(a1.g, a1.h);
            }
            int i = a1.a.size();
            obj1 = (com.fitbit.weight.ui.a)loader;
            loader = ((a)h().g().get(0)).d().a();
            com.fitbit.util.chart.a.b(h(), d(), e(), ((com.fitbit.weight.ui.a) (obj1)).l().a(), flag, new List[] {
                ((ChartSeries) (obj)).I()
            });
            obj1 = (g)h().k().get(0);
            if (a1.b == null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            ((g) (obj1)).a(flag);
            obj = r.a();
            if (a1.b != null)
            {
                Weight weight = ((Weight)a1.b.j()).a(((com.fitbit.data.domain.WeightLogEntry.WeightUnits) (obj)));
                ((g) (obj1)).a(weight.b());
                ((g) (obj1)).b(getString(0x7f080229, new Object[] {
                    f.a(FitBitApplication.a(), weight)
                }));
            }
            h().q();
            obj1 = new Weight(5D, com.fitbit.data.domain.WeightLogEntry.WeightUnits.LBS);
            h().a(((Weight) (obj1)).a(((com.fitbit.data.domain.WeightLogEntry.WeightUnits) (obj))).b());
            com.fitbit.util.chart.a.a("historical", a1.a, h(), loader.c(), getResources().getColor(0x7f0f005a), getResources().getColor(0x7f0f005b), Integer.valueOf(ap.a(getActivity(), 3F)));
            b(false);
            if (i <= 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            a(flag);
            p();
            if (!v.a(b.j))
            {
                b(true);
                return;
            }
        }
    }

    protected void a(FitbitChartView fitbitchartview)
    {
        com.fitbit.util.chart.a.b(fitbitchartview, getActivity());
        com.fitbit.util.chart.a.a("historical", null, h(), 0.0D, getResources().getColor(0x7f0f005a), getResources().getColor(0x7f0f005b), Integer.valueOf(ap.a(getActivity(), 3F)));
        ChartSeries chartseries = new ChartSeries("MAIN_SERIES", new com.fitbit.ui.a(getResources().getColor(0x7f0f005a)));
        chartseries.d(Integer.valueOf(ap.a(getActivity(), 3F)));
        chartseries.c(getResources().getDrawable(0x7f0203ca));
        chartseries.a(Integer.valueOf(getResources().getColor(0x7f0f005b)));
        chartseries.c(Integer.valueOf(getResources().getColor(0x7f0f005b)));
        chartseries.a(true);
        ChartSeries chartseries1 = new ChartSeries("area", new com.artfulbits.aiCharts.Types.a());
        chartseries1.d(Integer.valueOf(0));
        chartseries1.a(Integer.valueOf(getResources().getColor(0x7f0f005a)));
        g g1 = com.fitbit.util.chart.a.b(getActivity());
        fitbitchartview.k().add(g1);
        fitbitchartview.h().add(chartseries1);
        fitbitchartview.h().add(chartseries);
    }

    protected boolean a()
    {
        if (b != null)
        {
            Object obj = h();
            ChartAxisScale chartaxisscale = ((a)h().g().get(0)).e().a();
            ((FitbitChartView) (obj)).t();
            chartaxisscale.c(b.g, b.h);
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
        com.fitbit.e.a.a(getClass().toString(), "onTimeIntervalChanged", new Object[0]);
        u();
    }

    public Loader onCreateLoader(int i, Bundle bundle)
    {
    /* block-local class not found */
    class b {}

        return new b(getActivity(), (Date)bundle.get("com.fitbit.weight.ui.AbsChartFragment.EXTRA_START_DATE"), (Date)bundle.get("com.fitbit.weight.ui.AbsChartFragment.EXTRA_END_DATE"), Filter.a(k()));
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return layoutinflater.inflate(0x7f04016b, null);
    }

    public void onLoadFinished(Loader loader, Object obj)
    {
        a(loader, (a)obj);
    }

    public void onLoaderReset(Loader loader)
    {
    }

    public void onResume()
    {
        super.onResume();
        u();
    }

    protected String t()
    {
        if (getActivity() == null)
        {
            return "";
        }
        com.fitbit.data.domain.WeightLogEntry.WeightUnits weightunits;
        if (b != null && b.c != null)
        {
            weightunits = b.c;
        } else
        {
            weightunits = r.a();
        }
        return weightunits.getShortDisplayName();
    }

    public void u()
    {
        b(true);
        getLoaderManager().restartLoader(101, a(f(), g(), new Bundle()), this);
    }

    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls2 {}


    /* member class not found */
    class _cls3 {}

}
