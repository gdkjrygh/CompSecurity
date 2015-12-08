// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.weight.ui;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.Loader;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import com.artfulbits.aiCharts.Base.ChartAxis;
import com.artfulbits.aiCharts.Base.ChartAxisScale;
import com.artfulbits.aiCharts.Base.ChartNamedCollection;
import com.artfulbits.aiCharts.Base.ChartSeries;
import com.artfulbits.aiCharts.Base.j;
import com.artfulbits.aiCharts.ChartView;
import com.fitbit.FitBitApplication;
import com.fitbit.activity.ui.f;
import com.fitbit.customui.TimeNavigator;
import com.fitbit.customui.viewpager.FitBitCircledViewPager;
import com.fitbit.data.bl.cq;
import com.fitbit.data.bl.gd;
import com.fitbit.data.domain.r;
import com.fitbit.e.a;
import com.fitbit.savedstate.c;
import com.fitbit.ui.MeasurementsWithChartsFragment;
import com.fitbit.util.al;
import com.fitbit.util.ap;
import com.fitbit.util.bn;
import com.fitbit.util.format.e;
import com.fitbit.util.l;
import com.fitbit.util.o;
import com.fitbit.weight.Weight;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

// Referenced classes of package com.fitbit.weight.ui:
//            c, WeightLogActivity, WeightChartActivity

public class WeightFragment extends MeasurementsWithChartsFragment
    implements android.support.v4.app.LoaderManager.LoaderCallbacks, com.fitbit.activity.ui.f.a, l
{

    private static final String j = "WeightFragment";
    private f k;
    private Runnable l;
    private com.fitbit.data.domain.WeightLogEntry.WeightUnits m;
    private b n;
    private com.fitbit.util.aq.a o;
    private Handler p;
    private Runnable q;

    public WeightFragment()
    {
        l = new _cls1();
    /* block-local class not found */
    class b {}

        n = new b(null);
        q = new _cls2();
    }

    static FitBitCircledViewPager a(WeightFragment weightfragment)
    {
        return weightfragment.f;
    }

    private static String a(Context context, Date date, Date date1)
    {
        date = com.fitbit.util.o.m(date);
        date1 = com.fitbit.util.o.m(date1);
        GregorianCalendar gregoriancalendar = new GregorianCalendar(al.a());
        gregoriancalendar.setTime(date);
        int i = gregoriancalendar.get(1);
        gregoriancalendar.setTime(date1);
        if (i != gregoriancalendar.get(1))
        {
            return String.format("%s - %s", new Object[] {
                com.fitbit.util.format.e.h(context, date), com.fitbit.util.format.e.h(context, date1)
            });
        } else
        {
            return com.fitbit.util.format.e.b(context, date, date1);
        }
    }

    private transient void a(int i, ChartSeries achartseries[])
    {
        if (i != 0)
        {
            int i1 = getResources().getColor(i);
            int j1 = achartseries.length;
            for (i = 0; i < j1; i++)
            {
                ChartSeries chartseries = achartseries[i];
                if (chartseries != null)
                {
                    chartseries.c(Integer.valueOf(i1));
                    chartseries.a(Integer.valueOf(i1));
                }
            }

        }
    }

    private void a(ChartView chartview, ChartSeries chartseries, ChartSeries chartseries1, List list, b.a a1)
    {
        chartseries.F().clear();
        chartseries1.F().clear();
        if (list.size() == 0)
        {
            chartview = gd.a().b();
            if (chartview != null && chartview.b() != 0.0D)
            {
                chartview = new j(0.0D, new double[] {
                    chartview.a(m).b()
                });
                list.add(chartview);
                a1.e = chartview.a(0);
                a1.d = chartview.a(0);
            }
        }
        chartseries.F().a(list, new _cls4());
        chartseries1.F().a(list, new _cls5());
    }

    static FitBitCircledViewPager b(WeightFragment weightfragment)
    {
        return weightfragment.f;
    }

    private void b(boolean flag)
    {
    /* block-local class not found */
    class WeightCharts {}

        WeightCharts aweightcharts[] = WeightCharts.values();
        int i1 = aweightcharts.length;
        for (int i = 0; i < i1; i++)
        {
            b(flag, ((com.fitbit.ui.MeasurementsWithChartsFragment.a) (aweightcharts[i])));
        }

    }

    static FitBitCircledViewPager c(WeightFragment weightfragment)
    {
        return weightfragment.f;
    }

    static void d(WeightFragment weightfragment)
    {
        weightfragment.v();
    }

    static void e(WeightFragment weightfragment)
    {
        weightfragment.t();
    }

    static void f(WeightFragment weightfragment)
    {
        weightfragment.u();
    }

    private void r()
    {
        if (o == null || o.a == null || o.a.size() == 0)
        {
            for (int i = 0; i < p().length; i++)
            {
                a(true, p()[i]);
            }

        } else
        {
            int i1 = 0;
            while (i1 < o.a.size()) 
            {
                boolean flag;
                if (((b.a)o.a.get(i1)).a.size() == 0)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                a(flag, p()[i1]);
                i1++;
            }
        }
    }

    private void s()
    {
        p.removeCallbacks(q);
        p.post(q);
    }

    private void t()
    {
        if (k != null)
        {
            k.f();
            k.a(null);
            k = null;
        }
    }

    private void u()
    {
        k = new f(this, getActivity().getApplication());
        Object obj = new GregorianCalendar(bn.b());
        ((Calendar) (obj)).add(5, -14);
        ((Calendar) (obj)).clear(11);
        ((Calendar) (obj)).clear(10);
        ((Calendar) (obj)).clear(12);
        ((Calendar) (obj)).clear(14);
        ((Calendar) (obj)).clear(13);
        FitBitApplication fitbitapplication = FitBitApplication.a();
        obj = new com.fitbit.weight.ui.c(fitbitapplication, ((Calendar) (obj)).getTime(), com.fitbit.util.o.f(new Date()));
        k.a(((com.fitbit.weight.ui.c) (obj)).b());
        obj = UUID.randomUUID();
        k.a(cq.a(fitbitapplication, i(), new com.fitbit.data.bl.SyncDataForDayOperation.DailyDataType[] {
            com.fitbit.data.bl.SyncDataForDayOperation.DailyDataType.l
        }), ((UUID) (obj)));
    }

    private void v()
    {
        int i = 0;
        if (o == null || o.a == null || o.a.size() == 0)
        {
            WeightCharts aweightcharts[] = WeightCharts.values();
            for (int j1 = aweightcharts.length; i < j1; i++)
            {
                WeightCharts weightcharts = aweightcharts[i];
                a(true, weightcharts);
                b(true, weightcharts);
            }

        } else
        {
            int i1 = 0;
            while (i1 < o.a.size()) 
            {
                if (((b.a)o.a.get(i1)).a.size() == 0)
                {
                    b(true, p()[i1]);
                } else
                {
                    b(false, p()[i1]);
                    a(false, p()[i1]);
                }
                i1++;
            }
        }
    }

    protected String a(int i)
    {
        return getString(com.fitbit.weight.ui.WeightCharts.a(WeightCharts.values()[i])).toUpperCase();
    }

    protected void a()
    {
        Intent intent = new Intent(getActivity(), com/fitbit/weight/ui/WeightLogActivity);
        Date date1 = i();
        Date date = date1;
        if (com.fitbit.util.o.i(date1))
        {
            date = new Date();
        }
        intent.putExtra("com.fitbit.weight.ui.EXTRA_DATE", date);
        startActivity(intent);
    }

    public void a(Loader loader, List list)
    {
        com.fitbit.e.a.a("WeightFragment", "Weight loader %s finished at %s", new Object[] {
            loader, this
        });
        m = com.fitbit.data.domain.r.a();
        n.a(list);
        s();
        if (e.getVisibility() != 0)
        {
            e.setVisibility(0);
            loader = AnimationUtils.loadAnimation(getActivity(), 0x10a0000);
            loader.setDuration(150L);
            e.setAnimation(loader);
        }
    }

    protected void a(ChartView chartview, int i)
    {
        int i2;
        chartview.b(0x7f060018);
        ((ChartAxis)((com.artfulbits.aiCharts.Base.a)chartview.g().get(0)).h().get(0)).a().a(0.0D);
        chartview.setPadding(-14, 0, -11, -14);
        i2 = ap.a(getActivity(), 3F);
        i;
        JVM INSTR tableswitch 0 2: default 88
    //                   0 258
    //                   1 281
    //                   2 308;
           goto _L1 _L2 _L3 _L4
_L1:
        int i1;
        int j1;
        int k1;
        int l1;
        i = 0;
        i1 = 0;
        j1 = 0;
        k1 = 0;
        l1 = 0;
_L6:
        ChartSeries chartseries;
        ChartSeries chartseries1;
        ChartSeries chartseries2;
        ChartSeries chartseries3;
        ChartSeries chartseries4;
        ChartSeries chartseries5;
        ChartSeries chartseries6;
        ChartSeries chartseries7;
        chartseries = (ChartSeries)chartview.h().a("series");
        chartseries1 = (ChartSeries)chartview.h().a("area");
        chartseries2 = (ChartSeries)chartview.h().a("histLine");
        chartseries3 = (ChartSeries)chartview.h().a("histArea");
        chartseries4 = (ChartSeries)chartview.h().a("secondarySeries");
        chartseries5 = (ChartSeries)chartview.h().a("secondaryArea");
        chartseries6 = (ChartSeries)chartview.h().a("secondaryHistLine");
        chartseries7 = (ChartSeries)chartview.h().a("secondaryHistArea");
        for (chartview = chartview.h().iterator(); chartview.hasNext(); ((ChartSeries)chartview.next()).d(Integer.valueOf(i2))) { }
        break; /* Loop/switch isn't completed */
_L2:
        i = 0x7f0203ca;
        i1 = 0;
        j1 = 0;
        k1 = 0x7f0f005a;
        l1 = 0x7f0f005b;
        continue; /* Loop/switch isn't completed */
_L3:
        i = 0x7f0202c9;
        i1 = 0x7f0f0050;
        j1 = 0x7f0f0051;
        k1 = 0x7f0f0052;
        l1 = 0x7f0f0053;
        continue; /* Loop/switch isn't completed */
_L4:
        i = 0x7f020092;
        i1 = 0;
        j1 = 0;
        k1 = 0x7f0f004c;
        l1 = 0x7f0f004d;
        if (true) goto _L6; else goto _L5
_L5:
        if (chartseries != null)
        {
            if (k1 != 0)
            {
                chartseries.a(new com.fitbit.ui.a(getResources().getColor(k1)));
            }
            if (i != 0)
            {
                chartseries.c(getResources().getDrawable(i));
            }
        }
        if (chartseries4 != null && i1 != 0)
        {
            chartseries4.a(new com.fitbit.ui.a(getResources().getColor(i1)));
        }
        a(l1, new ChartSeries[] {
            chartseries, chartseries2
        });
        a(k1, new ChartSeries[] {
            chartseries1, chartseries3
        });
        a(j1, new ChartSeries[] {
            chartseries4, chartseries6
        });
        a(i1, new ChartSeries[] {
            chartseries5, chartseries7
        });
        return;
    }

    protected void a(Date date)
    {
        q();
    }

    protected void b(ChartView chartview, int i)
    {
        if (o == null || o.a == null || o.a.size() <= i)
        {
            return;
        }
        Object obj = (b.a)o.a.get(i);
        Object obj2 = (ChartSeries)chartview.h().a("series");
        Object obj3 = (ChartSeries)chartview.h().a("area");
        Object obj1 = (ChartSeries)chartview.h().a("histLine");
        ChartSeries chartseries = (ChartSeries)chartview.h().a("histArea");
        ChartSeries chartseries3 = (ChartSeries)chartview.h().a("secondarySeries");
        ChartSeries chartseries4 = (ChartSeries)chartview.h().a("secondaryArea");
        ChartSeries chartseries1 = (ChartSeries)chartview.h().a("secondaryHistLine");
        ChartSeries chartseries2 = (ChartSeries)chartview.h().a("secondaryHistArea");
        a(chartview, ((ChartSeries) (obj2)), ((ChartSeries) (obj3)), ((b.a) (obj)).a, ((b.a) (obj)));
        if (((b.a) (obj)).b != null && chartseries3 != null)
        {
            a(chartview, chartseries3, chartseries4, ((b.a) (obj)).b, ((b.a) (obj)));
        }
        obj2 = ((com.artfulbits.aiCharts.Base.a)chartview.g().get(0)).d().a();
        double d3 = o.b.getTime();
        double d2 = com.fitbit.util.o.f(o.c).getTime();
        obj3 = o.b;
        double d1;
        if (((b.a) (obj)).a.size() > 0)
        {
            double d4 = ((j)((b.a) (obj)).a.get(0)).a();
            double d6 = ((j)((b.a) (obj)).a.get(0)).b()[0];
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(((Date) (obj3)));
            Calendar calendar1 = Calendar.getInstance();
            calendar1.setTime(new Date((long)d4));
            d1 = d3;
            if (calendar.get(1) == calendar1.get(1))
            {
                d1 = d3;
                if (calendar.get(2) == calendar1.get(2))
                {
                    d1 = d3;
                    if (calendar.get(5) == calendar1.get(5))
                    {
                        d1 = calendar1.getTime().getTime();
                    }
                }
            }
            calendar = Calendar.getInstance();
            calendar.setTime(new Date((long)((j)((b.a) (obj)).a.get(((b.a) (obj)).a.size() - 1)).a()));
            calendar1 = Calendar.getInstance();
            calendar1.setTime(o.c);
            if (calendar1.get(1) == calendar.get(1) && calendar1.get(2) == calendar.get(2) && calendar1.get(5) == calendar.get(5))
            {
                d2 = calendar.getTime().getTime();
            }
            if (obj1 != null)
            {
                ((ChartSeries) (obj1)).F().clear();
                ((ChartSeries) (obj1)).F().b(new j(((Date) (obj3)).getTime(), new double[] {
                    d6
                }));
                ((ChartSeries) (obj1)).F().b(new j(d4, new double[] {
                    d6
                }));
            }
            if (chartseries != null)
            {
                chartseries.F().clear();
                chartseries.F().b(new j(((Date) (obj3)).getTime(), new double[] {
                    d6
                }));
                chartseries.F().b(new j(d4, new double[] {
                    d6
                }));
            }
            d3 = d2;
            d2 = d1;
            d1 = d3;
        } else
        {
            d1 = d2;
            d2 = d3;
        }
        if (((b.a) (obj)).b != null && ((b.a) (obj)).b.size() > 0)
        {
            d3 = ((j)((b.a) (obj)).b.get(0)).a();
            double d5 = ((j)((b.a) (obj)).b.get(0)).b()[0];
            if (chartseries1 != null)
            {
                chartseries1.F().clear();
                chartseries1.F().b(new j(((Date) (obj3)).getTime(), new double[] {
                    d5
                }));
                chartseries1.F().b(new j(d3, new double[] {
                    d5
                }));
            }
            if (chartseries2 != null)
            {
                chartseries2.F().clear();
                chartseries2.F().b(new j(((Date) (obj3)).getTime(), new double[] {
                    d5
                }));
                chartseries2.F().b(new j(d3, new double[] {
                    d5
                }));
            }
        }
        ((ChartAxisScale) (obj2)).a(Double.valueOf(d2));
        ((ChartAxisScale) (obj2)).b(Double.valueOf(1000D + d1));
        obj1 = new Weight(5D, com.fitbit.data.domain.WeightLogEntry.WeightUnits.LBS);
        if (i == 2)
        {
            d1 = 5D;
        } else
        {
            d1 = ((Weight) (obj1)).a(m).b();
        }
        d2 = ((b.a) (obj)).d + d1;
        d1 = Math.max(0.0D, ((b.a) (obj)).e - d1);
        obj = ((com.artfulbits.aiCharts.Base.a)chartview.g().get(0)).e();
        ((ChartAxis) (obj)).a().b(Double.valueOf(d2));
        ((ChartAxis) (obj)).a().a(Double.valueOf(d1));
        if (i == 2)
        {
            a(com.fitbit.util.format.e.a(d2, 1), i);
            b(com.fitbit.util.format.e.a(d1, 1), i);
            return;
        } else
        {
            Weight weight = new Weight(d2, m);
            a(com.fitbit.util.format.f.a(chartview.getContext(), weight).toString(), i);
            weight = new Weight(d1, m);
            b(com.fitbit.util.format.f.a(chartview.getContext(), weight).toString(), i);
            return;
        }
    }

    public void f()
    {
        v();
    }

    public void g()
    {
        if (k == null || k.h() || !isResumed())
        {
            return;
        }
        o = (com.fitbit.util.aq.a)k.c();
        m = com.fitbit.data.domain.r.a();
        if (o != null)
        {
            a(a(FitBitApplication.a(), o.b, o.c));
        }
        v();
    }

    public void h()
    {
        if (k == null || k.h() || !isResumed())
        {
            return;
        }
        o = (com.fitbit.util.aq.a)k.c();
        m = com.fitbit.data.domain.r.a();
        if (o != null)
        {
            a(a(FitBitApplication.a(), o.b, o.c));
        }
        b(false);
        r();
    }

    protected void j()
    {
        super.j();
        d.setAdapter(n);
        d.setEnabled(false);
        f.a(new _cls3());
        e.setVisibility(4);
        m = com.fitbit.data.domain.r.a();
        String s1 = getString(0x7f0803bd);
        (new StringBuilder()).append(s1.substring(0, 1).toUpperCase()).append(s1.substring(1).toLowerCase()).toString();
    }

    protected Class o()
    {
        return com/fitbit/weight/ui/WeightChartActivity;
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        p = new Handler();
        K_();
    }

    public Loader onCreateLoader(int i, Bundle bundle)
    {
    /* block-local class not found */
    class a {}

        bundle = new a(getActivity());
        com.fitbit.e.a.a("WeightFragment", "Creating weight loader %s at %s", new Object[] {
            bundle, this
        });
        bundle.a(i());
        return bundle;
    }

    public void onLoadFinished(Loader loader, Object obj)
    {
        a(loader, (List)obj);
    }

    public void onLoaderReset(Loader loader)
    {
        com.fitbit.e.a.a("WeightFragment", "Weight loader %s reset at %s", new Object[] {
            loader, this
        });
    }

    public void onPause()
    {
        super.onPause();
        t();
    }

    public void onResume()
    {
        super.onResume();
        p.post(l);
        TimeNavigator timenavigator = (TimeNavigator)getView().findViewById(0x7f11042b);
        a(false);
        Date date = com.fitbit.savedstate.c.h();
        Date date1 = com.fitbit.util.o.b();
        if (date.after(date1))
        {
            date = date1;
        }
        timenavigator.a(date, true, true);
        a(i());
    }

    protected com.fitbit.ui.MeasurementsWithChartsFragment.a[] p()
    {
        return WeightCharts.values();
    }

    protected void q()
    {
        if (isResumed())
        {
            v();
            getLoaderManager().restartLoader(0, null, this);
            t();
            u();
        }
    }

    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls2 {}


    /* member class not found */
    class _cls4 {}


    /* member class not found */
    class _cls5 {}


    /* member class not found */
    class _cls3 {}

}
