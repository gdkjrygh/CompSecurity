// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.activity.ui;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.artfulbits.aiCharts.Base.ChartAxis;
import com.artfulbits.aiCharts.Base.ChartAxisScale;
import com.artfulbits.aiCharts.Base.ChartNamedCollection;
import com.artfulbits.aiCharts.Base.ChartSeries;
import com.artfulbits.aiCharts.Base.j;
import com.artfulbits.aiCharts.Base.l;
import com.artfulbits.aiCharts.Types.e;
import com.fitbit.FitBitApplication;
import com.fitbit.data.bl.de;
import com.fitbit.data.bl.fs;
import com.fitbit.data.bl.t;
import com.fitbit.data.domain.TimeSeriesObject;
import com.fitbit.ui.FitbitChartView;
import com.fitbit.util.bg;
import com.fitbit.util.chart.Filter;
import com.fitbit.util.format.IntradayChartDateFormat;
import com.fitbit.util.o;
import com.fitbit.weight.ui.a;
import java.text.Format;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

// Referenced classes of package com.fitbit.activity.ui:
//            FitbitActivityChartActivity, f

public abstract class IntradayActivityChartFragment extends Fragment
    implements f.a, com.fitbit.ui.FitbitChartView.a, com.fitbit.ui.FitbitChartView.d
{
    private static final class State extends Enum
    {

        public static final State a;
        public static final State b;
        public static final State c;
        private static final State d[];

        public static State valueOf(String s1)
        {
            return (State)Enum.valueOf(com/fitbit/activity/ui/IntradayActivityChartFragment$State, s1);
        }

        public static State[] values()
        {
            return (State[])d.clone();
        }

        static 
        {
            a = new State("NORMAL", 0);
            b = new State("LOADING", 1);
            c = new State("EMPTY", 2);
            d = (new State[] {
                a, b, c
            });
        }

        private State(String s1, int i1)
        {
            super(s1, i1);
        }
    }


    private static final String d = "EXTRA_RESOURSE_TYPE";
    private static final String e = "EXTRA_DATE";
    protected FitbitChartView a;
    protected TextView b;
    protected ProgressBar c;
    private f f;
    private AbsActivityChartFragment.a g;
    private boolean h;
    private boolean i;
    private boolean j;
    private Date k;
    private Date l;
    private Runnable m;
    private boolean n;
    private Date o;
    private com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType p;
    private Handler q;
    private Runnable r;
    private State s;

    public IntradayActivityChartFragment()
    {
        i = false;
        m = new Runnable() {

            final IntradayActivityChartFragment a;

            private com.fitbit.data.domain.Goal.GoalType a()
            {
                static class _cls5
                {

                    static final int a[];
                    static final int b[];

                    static 
                    {
                        b = new int[State.values().length];
                        try
                        {
                            b[State.c.ordinal()] = 1;
                        }
                        catch (NoSuchFieldError nosuchfielderror7) { }
                        try
                        {
                            b[com.fitbit.activity.ui.State.a.ordinal()] = 2;
                        }
                        catch (NoSuchFieldError nosuchfielderror6) { }
                        try
                        {
                            b[State.b.ordinal()] = 3;
                        }
                        catch (NoSuchFieldError nosuchfielderror5) { }
                        a = new int[com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.values().length];
                        try
                        {
                            a[com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.CALORIES_INTRADAY.ordinal()] = 1;
                        }
                        catch (NoSuchFieldError nosuchfielderror4) { }
                        try
                        {
                            a[com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.STEPS_INTRADAY.ordinal()] = 2;
                        }
                        catch (NoSuchFieldError nosuchfielderror3) { }
                        try
                        {
                            a[com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.DISTANCE_INTRADAY.ordinal()] = 3;
                        }
                        catch (NoSuchFieldError nosuchfielderror2) { }
                        try
                        {
                            a[com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.MINUTES_VERY_ACTIVE_INTRADAY.ordinal()] = 4;
                        }
                        catch (NoSuchFieldError nosuchfielderror1) { }
                        try
                        {
                            a[com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.FLOORS_INTRADAY.ordinal()] = 5;
                        }
                        catch (NoSuchFieldError nosuchfielderror)
                        {
                            return;
                        }
                    }
                }

                switch (com.fitbit.activity.ui._cls5.a[IntradayActivityChartFragment.c(a).ordinal()])
                {
                default:
                    throw new IllegalArgumentException((new StringBuilder()).append("Unknown resource type ").append(IntradayActivityChartFragment.c(a)).toString());

                case 1: // '\001'
                    return com.fitbit.data.domain.Goal.GoalType.CALORIES_BURNED_GOAL;

                case 2: // '\002'
                    return com.fitbit.data.domain.Goal.GoalType.STEPS_GOAL;

                case 3: // '\003'
                    return com.fitbit.data.domain.Goal.GoalType.DISTANCE_GOAL;

                case 4: // '\004'
                    return com.fitbit.data.domain.Goal.GoalType.MINUTES_VERY_ACTIVE_GOAL;

                case 5: // '\005'
                    return com.fitbit.data.domain.Goal.GoalType.FLOORS_GOAL;
                }
            }

            public void run()
            {
                Object obj = com.fitbit.activity.ui.IntradayActivityChartFragment.a(a);
                Date date = IntradayActivityChartFragment.b(a);
                if (obj == null || date == null)
                {
                    return;
                }
                bg bg1 = new bg();
                AbsActivityChartFragment.a a1 = new AbsActivityChartFragment.a();
                Object obj1 = fs.a().a(IntradayActivityChartFragment.c(a), ((Date) (obj)), date);
                a1.c = com.fitbit.data.bl.t.a().a(a(), date);
                obj = new ArrayList();
                double d4 = 0.0D;
                double d5 = 1.7976931348623157E+308D;
                double d7 = 1.7976931348623157E+308D;
                double d1 = 4.9406564584124654E-324D;
                obj1 = ((List) (obj1)).iterator();
                do
                {
                    if (!((Iterator) (obj1)).hasNext())
                    {
                        break;
                    }
                    TimeSeriesObject timeseriesobject = (TimeSeriesObject)((Iterator) (obj1)).next();
                    double d2 = timeseriesobject.b();
                    if (d2 > 0.0D)
                    {
                        j j2 = new j(timeseriesobject.a().getTime(), new double[] {
                            d2
                        });
                        j2.a(timeseriesobject);
                        j2.a(a.a(j2, timeseriesobject));
                        a.a(j2);
                        ((List) (obj)).add(j2);
                    }
                } while (true);
                double d6 = 0.0D;
                date = com.fitbit.util.chart.a.a(com.fitbit.util.chart.Filter.Type.t, date);
                int i1 = ((List) (obj)).size() - 1;
                while (i1 >= 0) 
                {
                    j j1 = (j)((List) (obj)).get(i1);
                    double d3 = j1.a(0);
                    boolean flag;
                    if (j1.a() >= (double)date.getTime())
                    {
                        double d8 = d7;
                        if (d3 < d7)
                        {
                            d8 = d3;
                        }
                        if (d3 > d1)
                        {
                            d1 = d3;
                        }
                        double d10 = d6 + d3;
                        d7 = d8;
                        d6 = d1;
                        d1 = d10;
                    } else
                    {
                        double d9 = d1;
                        d1 = d6;
                        d6 = d9;
                    }
                    if (d3 < d5)
                    {
                        d5 = d3;
                    }
                    if (d3 <= d4)
                    {
                        d3 = d4;
                    }
                    i1--;
                    d4 = d6;
                    d6 = d1;
                    d1 = d4;
                    d4 = d3;
                }
                if (d7 != 1.7976931348623157E+308D);
                d3 = d1;
                if (d1 == 4.9406564584124654E-324D)
                {
                    d3 = 0.0D;
                }
                a1.b = d6;
                a1.a = ((List) (obj));
                a1.e = Math.max(0.0D, d5);
                a1.f = Math.max(a.h_(), d4);
                a1.h = Math.max(a.h_(), d3);
                a1.g = 0.0D;
                if (IntradayActivityChartFragment.d(a) == null)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                a1.i = flag;
                bg1.a("intraday graph load");
                com.fitbit.activity.ui.IntradayActivityChartFragment.a(a, a1);
            }

            
            {
                a = IntradayActivityChartFragment.this;
                super();
            }
        };
        q = new Handler();
        r = new Runnable() {

            final IntradayActivityChartFragment a;

            public void run()
            {
                com.fitbit.activity.ui.IntradayActivityChartFragment.e(a);
                UUID uuid = UUID.randomUUID();
                IntradayActivityChartFragment.g(a).a(IntradayActivityChartFragment.f(a));
                IntradayActivityChartFragment.g(a).a(de.a(FitBitApplication.a(), IntradayActivityChartFragment.c(a), IntradayActivityChartFragment.h(a), IntradayActivityChartFragment.h(a), false, uuid), uuid);
                if (IntradayActivityChartFragment.d(a) == null || IntradayActivityChartFragment.d(a).a.size() == 0)
                {
                    com.fitbit.activity.ui.IntradayActivityChartFragment.a(a, null);
                    a.a(State.b);
                }
            }

            
            {
                a = IntradayActivityChartFragment.this;
                super();
            }
        };
        s = State.b;
    }

    static AbsActivityChartFragment.a a(IntradayActivityChartFragment intradayactivitychartfragment, AbsActivityChartFragment.a a1)
    {
        intradayactivitychartfragment.g = a1;
        return a1;
    }

    static Date a(IntradayActivityChartFragment intradayactivitychartfragment)
    {
        return intradayactivitychartfragment.k;
    }

    static Date b(IntradayActivityChartFragment intradayactivitychartfragment)
    {
        return intradayactivitychartfragment.l;
    }

    static com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType c(IntradayActivityChartFragment intradayactivitychartfragment)
    {
        return intradayactivitychartfragment.p;
    }

    static AbsActivityChartFragment.a d(IntradayActivityChartFragment intradayactivitychartfragment)
    {
        return intradayactivitychartfragment.g;
    }

    private void e()
    {
        k = com.fitbit.util.o.d(o);
        l = com.fitbit.util.o.f(o);
    }

    static void e(IntradayActivityChartFragment intradayactivitychartfragment)
    {
        intradayactivitychartfragment.e();
    }

    static Runnable f(IntradayActivityChartFragment intradayactivitychartfragment)
    {
        return intradayactivitychartfragment.m;
    }

    static f g(IntradayActivityChartFragment intradayactivitychartfragment)
    {
        return intradayactivitychartfragment.f;
    }

    static Date h(IntradayActivityChartFragment intradayactivitychartfragment)
    {
        return intradayactivitychartfragment.o;
    }

    static boolean i(IntradayActivityChartFragment intradayactivitychartfragment)
    {
        return intradayactivitychartfragment.i;
    }

    private void s()
    {
        switch (_cls5.b[s.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            b.setVisibility(0);
            a.setVisibility(8);
            c.setVisibility(8);
            return;

        case 2: // '\002'
            b.setVisibility(8);
            a.setVisibility(0);
            c.setVisibility(8);
            return;

        case 3: // '\003'
            b.setVisibility(8);
            break;
        }
        a.setVisibility(8);
        c.setVisibility(0);
    }

    private void t()
    {
        FitbitActivityChartActivity fitbitactivitychartactivity = (FitbitActivityChartActivity)getActivity();
        if (fitbitactivitychartactivity != null)
        {
            fitbitactivitychartactivity.k_();
        }
    }

    protected Drawable a(j j1, TimeSeriesObject timeseriesobject)
    {
        return com.fitbit.weight.ui.a.a(timeseriesobject.e());
    }

    public abstract Format a();

    public void a(View view, j j1, TextView textview, TextView textview1, TextView textview2)
    {
label0:
        {
label1:
            {
                if (isResumed())
                {
                    textview1.setVisibility(0);
                    switch (((TimeSeriesObject)j1.h()).e())
                    {
                    default:
                        textview1.setText(0x7f08028a);
                        textview1.setTextColor(getResources().getColor(0x7f0f00e1));
                        break;

                    case 2: // '\002'
                        break label0;

                    case 3: // '\003'
                        break label1;
                    }
                }
                return;
            }
            textview1.setText(0x7f08028c);
            textview1.setTextColor(getResources().getColor(0x7f0f00e3));
            return;
        }
        textview1.setText(0x7f08028b);
        textview1.setTextColor(getResources().getColor(0x7f0f00e2));
    }

    protected void a(j j1)
    {
    }

    protected void a(State state)
    {
        s = state;
        if (j)
        {
            s();
        }
    }

    public void a(com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType timeseriesresourcetype)
    {
        p = timeseriesresourcetype;
    }

    protected void a(FitbitChartView fitbitchartview)
    {
        com.fitbit.util.chart.a.a(fitbitchartview, getActivity());
        Object obj = new ChartSeries("MAIN_SERIES", new e());
        ((ChartSeries) (obj)).a(true);
        fitbitchartview.h().add(obj);
        obj = ((com.artfulbits.aiCharts.Base.a)fitbitchartview.g().get(0)).d();
        ChartAxis chartaxis = ((com.artfulbits.aiCharts.Base.a)fitbitchartview.g().get(0)).e();
        com.artfulbits.aiCharts.Base.ChartAxis.c c1 = new com.artfulbits.aiCharts.Base.ChartAxis.c(fitbitchartview) {

            final FitbitChartView a;
            final IntradayActivityChartFragment b;

            public void a(com.artfulbits.aiCharts.Base.e e1, ChartAxis chartaxis1)
            {
            }

            public void b(com.artfulbits.aiCharts.Base.e e1, ChartAxis chartaxis1)
            {
                if (!IntradayActivityChartFragment.i(b))
                {
                    a.s();
                }
            }

            
            {
                b = IntradayActivityChartFragment.this;
                a = fitbitchartview;
                super();
            }
        };
        ((ChartAxis) (obj)).a(c1);
        chartaxis.a(c1);
        ((ChartAxis) (obj)).a(com.artfulbits.aiCharts.Base.ChartAxis.LabelPosition.a);
        chartaxis.a(com.artfulbits.aiCharts.Base.ChartAxis.LabelPosition.a);
        ((ChartAxis) (obj)).r().setColor(getActivity().getResources().getColor(0x106000d));
        chartaxis.r().setColor(getActivity().getResources().getColor(0x106000d));
        ((ChartAxis) (obj)).a(getActivity().getResources().getDimensionPixelSize(0x7f0a00ce));
        obj = Filter.a(com.fitbit.util.chart.Filter.Type.t, getActivity());
        if (obj != null)
        {
            ((com.artfulbits.aiCharts.Base.a)fitbitchartview.g().get(0)).d().a(((com.artfulbits.aiCharts.Base.ChartAxis.b) (obj)));
        }
        fitbitchartview.a(h_());
        fitbitchartview.c(0x7f04012e);
        fitbitchartview.a(this);
        fitbitchartview.a(this);
    }

    public void a(Date date)
    {
        o = date;
    }

    public void f()
    {
        if (g == null || g.a.size() == 0)
        {
            g = null;
            a(State.b);
        }
    }

    public void g()
    {
        if (g == null || g.a.size() == 0)
        {
            g = null;
            a(State.b);
            return;
        } else
        {
            q();
            return;
        }
    }

    public void h()
    {
        if (f.h())
        {
            return;
        }
        if (g == null || g.a.size() == 0)
        {
            g = null;
            a(State.c);
            return;
        } else
        {
            q();
            return;
        }
    }

    protected double h_()
    {
        return 5D;
    }

    public void i()
    {
        q.removeCallbacks(r);
        q.postDelayed(r, 100L);
    }

    public Context j()
    {
        return getActivity();
    }

    protected void j_()
    {
        a(a);
    }

    protected void k()
    {
        n = true;
    }

    protected boolean l()
    {
        boolean flag = n;
        n = false;
        return flag;
    }

    public void m()
    {
        a.s();
    }

    public double n()
    {
        double d1;
        double d2;
        if (g != null)
        {
            d1 = g.b;
        } else
        {
            d1 = 0.0D;
        }
        d2 = d1;
        if (com.fitbit.util.o.j(o))
        {
            double d3 = com.fitbit.util.a.a(p);
            d2 = d1;
            if (d3 > d1)
            {
                d2 = d3;
            }
        }
        return d2;
    }

    public com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType o()
    {
        return p;
    }

    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        f = new f(this, activity.getApplication());
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (bundle != null)
        {
            p = (com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType)bundle.get("EXTRA_RESOURSE_TYPE");
            o = (Date)bundle.get("EXTRA_DATE");
        }
    }

    public void onDetach()
    {
        super.onDetach();
        if (f != null)
        {
            f.f();
        }
    }

    public void onPause()
    {
        super.onPause();
        q.removeCallbacks(r);
        f.e();
        j = false;
        p();
    }

    public void onResume()
    {
        super.onResume();
        f.d();
        j = true;
        com.fitbit.util.chart.a.a(a);
        s();
        if (h)
        {
            q();
        }
        i();
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putSerializable("EXTRA_RESOURSE_TYPE", p);
        bundle.putSerializable("EXTRA_DATE", o);
    }

    public void p()
    {
        f.f();
    }

    protected void q()
    {
        if (!j)
        {
            h = true;
            return;
        }
        h = false;
        Object obj = g;
        a.a(a());
        i = true;
        a.p();
        Object obj1 = (ChartSeries)a.h().a("MAIN_SERIES");
        l();
        ((ChartSeries) (obj1)).F().clear();
        ((ChartSeries) (obj1)).F().a(g.a, new com.artfulbits.aiCharts.Base.t() {

            final IntradayActivityChartFragment a;

            public j a(Object obj2, j j1)
            {
                return new j((j)obj2);
            }

            public volatile Object a(Object obj2, Object obj3)
            {
                return a(obj2, (j)obj3);
            }

            
            {
                a = IntradayActivityChartFragment.this;
                super();
            }
        });
        obj1 = ((com.artfulbits.aiCharts.Base.a)a.g().get(0)).e().a();
        ((ChartAxisScale) (obj1)).a(Double.valueOf(0.0D));
        ((ChartAxisScale) (obj1)).b(Double.valueOf(g.f));
        if (g.i || obj == null)
        {
            a.t();
            ((ChartAxisScale) (obj1)).c(g.g, g.h);
        }
        a.b(new IntradayChartDateFormat());
        obj = ((com.artfulbits.aiCharts.Base.a)a.g().get(0)).d().a();
        ((ChartAxisScale) (obj)).a(Double.valueOf(k.getTime() - 0x6ddd0L));
        ((ChartAxisScale) (obj)).b(Double.valueOf(l.getTime() + 0x6ddd0L));
        ((ChartAxisScale) (obj)).c(((ChartAxisScale) (obj)).c(), ((ChartAxisScale) (obj)).d());
        a.q();
        i = false;
        a(com.fitbit.activity.ui.State.a);
        t();
    }

    public void r()
    {
        ChartSeries chartseries = (ChartSeries)a.h().a("MAIN_SERIES");
        if (chartseries.H() instanceof e)
        {
            float f1 = com.fitbit.util.chart.a.a(a, com.fitbit.util.chart.Filter.Type.t, getActivity());
            chartseries.a(e.i, Float.valueOf(f1));
        }
    }
}
