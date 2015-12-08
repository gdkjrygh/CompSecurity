// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.weight.ui;

import android.content.res.Resources;
import android.graphics.Paint;
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
import com.fitbit.data.domain.r;
import com.fitbit.ui.FitbitChartView;
import com.fitbit.util.chart.Filter;
import com.fitbit.util.chart.a;
import com.fitbit.util.format.e;
import com.fitbit.util.o;
import java.util.Calendar;
import java.util.Date;

public abstract class AbsChartFragment extends Fragment
    implements com.fitbit.ui.FitbitChartView.a
{

    public static final String c = "com.fitbit.weight.ui.AbsChartFragment.EXTRA_START_DATE";
    public static final String d = "com.fitbit.weight.ui.AbsChartFragment.EXTRA_END_DATE";
    public static final String e = "com.fitbit.weight.ui.AbsChartFragment.EXTRA_FILTER_TYPE";
    private FitbitChartView a;
    private Date b;
    protected TextView f;
    protected TextView g;
    protected Handler h;
    protected ProgressBar i;
    protected View j;
    protected double k;
    private Date l;
    private android.view.View.OnClickListener m;
    private com.fitbit.util.chart.Filter.Type n;
    private boolean o;
    private boolean p;
    private Date q;
    private Date r;

    public AbsChartFragment()
    {
        n = com.fitbit.util.chart.Filter.Type.a;
    }

    public static Bundle a(Date date, Date date1, Bundle bundle)
    {
        bundle.putSerializable("com.fitbit.weight.ui.AbsChartFragment.EXTRA_START_DATE", date);
        bundle.putSerializable("com.fitbit.weight.ui.AbsChartFragment.EXTRA_END_DATE", date1);
        return bundle;
    }

    static FitbitChartView a(AbsChartFragment abschartfragment)
    {
        return abschartfragment.a;
    }

    protected static final int b(double d1)
    {
        if (d1 != 1.7976931348623157E+308D)
        {
            if (d1 > 0.050000000000000003D)
            {
                return 0x7f0203cf;
            }
            if (d1 < -0.050000000000000003D)
            {
                return 0x7f0203cd;
            }
        }
        return 0;
    }

    public void a(double d1)
    {
        k = d1;
        if (f != null && isResumed())
        {
            if (d1 == 1.7976931348623157E+308D)
            {
                f.setText("--");
            } else
            {
                String s2 = t();
                TextView textview = f;
                StringBuilder stringbuilder = (new StringBuilder()).append(com.fitbit.util.format.e.a(d1));
                String s1 = s2;
                if (s2 == null)
                {
                    s1 = "";
                }
                textview.setText(stringbuilder.append(s1).toString());
            }
            f.setCompoundDrawablesWithIntrinsicBounds(0, 0, b(d1), 0);
        }
    }

    protected void a(long l1, long l2)
    {
        TextView textview;
label0:
        {
            Date date;
            Date date1;
label1:
            {
                textview = i();
                if (textview != null && isResumed())
                {
                    if (l1 == 0x7fffffffffffffffL || l2 == 0x7fffffffffffffffL)
                    {
                        break label0;
                    }
                    date = com.fitbit.util.o.h(new Date(l1));
                    date1 = new Date(l2);
                    if (k() != com.fitbit.util.chart.Filter.Type.t)
                    {
                        break label1;
                    }
                    textview.setText(com.fitbit.util.format.e.s(getActivity(), date));
                }
                return;
            }
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(com.fitbit.util.o.d(date));
            Calendar calendar1 = Calendar.getInstance();
            calendar1.setTime(com.fitbit.util.o.d(date1));
            if (calendar.get(2) == calendar1.get(2))
            {
                textview.setText(com.fitbit.util.format.e.c(getActivity(), date, date1));
                return;
            } else
            {
                textview.setText(String.format("%s - %s", new Object[] {
                    com.fitbit.util.format.e.v(getActivity(), date), com.fitbit.util.format.e.v(getActivity(), date1)
                }));
                return;
            }
        }
        textview.setText("");
    }

    public void a(android.view.View.OnClickListener onclicklistener)
    {
        m = onclicklistener;
        if (a != null)
        {
            a.setOnClickListener(onclicklistener);
        }
    }

    public void a(TextView textview)
    {
        f = textview;
    }

    protected void a(com.artfulbits.aiCharts.Base.e e1, ChartAxis chartaxis)
    {
        if (getActivity() != null)
        {
            e1 = (ChartSeries)e1.c().a("MAIN_SERIES");
            double d1 = chartaxis.a().f();
            double d3 = chartaxis.a().g();
            chartaxis = com.fitbit.util.chart.a.b(e1.I(), d1, d3);
            e1 = com.fitbit.util.chart.a.a(e1.I(), d1, d3);
            if (chartaxis != null && e1 != null)
            {
                double d2 = e1.a(0) - chartaxis.a(0);
                if (k != d2)
                {
                    a(d2);
                    return;
                }
            } else
            {
                a(1.7976931348623157E+308D);
                return;
            }
        }
    }

    protected abstract void a(FitbitChartView fitbitchartview);

    public void a(Date date, Date date1, com.fitbit.util.chart.Filter.Type type)
    {
        Object obj = null;
        TextView textview = i();
        if (textview != null)
        {
            if (a(type))
            {
                a(0x7fffffffffffffffL, 0x7fffffffffffffffL);
                textview.setVisibility(0);
            } else
            {
                textview.setVisibility(8);
            }
        }
        b = date;
        l = date1;
        if (date == null)
        {
            date = null;
        } else
        {
            date = com.fitbit.util.o.a(date);
        }
        if (date1 == null)
        {
            date1 = obj;
        } else
        {
            date1 = com.fitbit.util.o.e(date1);
        }
        if (q == null || date == null || r == null || date1 == null || !q.equals(date) || !r.equals(date1) || type != n)
        {
            q = date;
            r = date1;
            n = type;
            if (a != null)
            {
                a.s();
                date = Filter.a(type, getActivity());
                if (date != null)
                {
                    ((com.artfulbits.aiCharts.Base.a)a.g().get(0)).d().a(date);
                }
                if (!c())
                {
                    date = Filter.b(type, getActivity());
                    if (date != null)
                    {
                        ((com.artfulbits.aiCharts.Base.a)a.g().get(0)).e().a(date);
                    }
                }
                date = ((com.artfulbits.aiCharts.Base.a)a.g().get(0)).e().F();
                if (date instanceof com.fitbit.util.chart.a.b)
                {
                    ((com.fitbit.util.chart.a.b)date).b();
                }
            }
            l();
            a(1.7976931348623157E+308D);
            h().r();
            b();
        }
    }

    public void a(boolean flag)
    {
        boolean flag1 = false;
        byte byte0;
        if (flag)
        {
            byte0 = 8;
        } else
        {
            byte0 = 0;
        }
        a.setVisibility(byte0);
        if (f != null)
        {
            TextView textview = f;
            byte0 = flag1;
            if (flag)
            {
                byte0 = 4;
            }
            textview.setVisibility(byte0);
        }
    }

    protected boolean a()
    {
        return false;
    }

    protected boolean a(com.fitbit.util.chart.Filter.Type type)
    {
        return false;
    }

    protected abstract void b();

    public void b(TextView textview)
    {
        g = textview;
    }

    protected void b(com.artfulbits.aiCharts.Base.e e1, ChartAxis chartaxis)
    {
    }

    public void b(boolean flag)
    {
        boolean flag1 = false;
        int i1;
        if (flag)
        {
            i1 = 8;
        } else
        {
            i1 = 0;
        }
        a.setVisibility(i1);
        j.setVisibility(i1);
        if (i != null)
        {
            ProgressBar progressbar = i;
            if (flag)
            {
                i1 = ((flag1) ? 1 : 0);
            } else
            {
                i1 = 8;
            }
            progressbar.setVisibility(i1);
        }
    }

    protected boolean c()
    {
        return true;
    }

    public Date d()
    {
        return q;
    }

    public Date e()
    {
        return r;
    }

    public Date f()
    {
        return com.fitbit.util.o.d(b);
    }

    public Date g()
    {
        return com.fitbit.util.o.f(l);
    }

    public FitbitChartView h()
    {
        return a;
    }

    public TextView i()
    {
        return g;
    }

    public TextView j()
    {
        return f;
    }

    public com.fitbit.util.chart.Filter.Type k()
    {
        return n;
    }

    protected void l()
    {
        o = true;
    }

    protected boolean m()
    {
        boolean flag = o;
        o = false;
        return flag;
    }

    public void n()
    {
        k = 1.7976931348623157E+308D;
        a(a.b(), ((com.artfulbits.aiCharts.Base.a)a.g().get(0)).d());
    }

    protected void o()
    {
        p = true;
    }

    public void onActivityCreated(Bundle bundle)
    {
        Date date = null;
        super.onActivityCreated(bundle);
        Object obj = com.fitbit.util.chart.Filter.Type.a;
        if (bundle != null)
        {
            date = (Date)bundle.get("com.fitbit.weight.ui.AbsChartFragment.EXTRA_START_DATE");
            Date date2 = (Date)bundle.get("com.fitbit.weight.ui.AbsChartFragment.EXTRA_END_DATE");
            bundle = bundle.getString("com.fitbit.weight.ui.AbsChartFragment.EXTRA_FILTER_TYPE");
            if (bundle != null)
            {
                bundle = com.fitbit.util.chart.Filter.Type.valueOf(bundle);
                obj = date;
                date = date2;
            } else
            {
                Date date1 = date;
                bundle = ((Bundle) (obj));
                date = date2;
                obj = date1;
            }
        } else
        {
            bundle = ((Bundle) (obj));
            obj = null;
        }
        a(((Date) (obj)), date, bundle);
    }

    public void onPause()
    {
        super.onPause();
        h().r();
        h().u();
    }

    public void onResume()
    {
        h().s();
        super.onResume();
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        if (b != null)
        {
            bundle.putSerializable("com.fitbit.weight.ui.AbsChartFragment.EXTRA_START_DATE", b);
        }
        if (l != null)
        {
            bundle.putSerializable("com.fitbit.weight.ui.AbsChartFragment.EXTRA_END_DATE", l);
        }
        if (n != null)
        {
            bundle.putString("com.fitbit.weight.ui.AbsChartFragment.EXTRA_FILTER_TYPE", n.name());
        }
        super.onSaveInstanceState(bundle);
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        h = new Handler();
        a = (FitbitChartView)view.findViewById(0x7f110234);
        a.setOnClickListener(m);
        i = (ProgressBar)view.findViewById(0x102000d);
        j = view.findViewById(0x1020004);
        a.a(new _cls1());
        a(a);
        view = ((com.artfulbits.aiCharts.Base.a)a.g().get(0)).d();
        view.a(getActivity().getResources().getDimensionPixelSize(0x7f0a00ce));
        view.r().setColor(getActivity().getResources().getColor(0x106000d));
        view.a(new _cls2());
        view = ((com.artfulbits.aiCharts.Base.a)a.g().get(0)).e();
        view.r().setColor(getActivity().getResources().getColor(0x106000d));
        view.a(new _cls3());
    }

    protected void p()
    {
        p = false;
    }

    protected boolean q()
    {
        return p;
    }

    public void r()
    {
        ChartSeries chartseries = (ChartSeries)h().h().a("MAIN_SERIES");
        if (chartseries.H() instanceof com.artfulbits.aiCharts.Types.e)
        {
            float f1 = com.fitbit.util.chart.a.a(h(), k(), getActivity());
            chartseries.a(com.artfulbits.aiCharts.Types.e.i, Float.valueOf(f1));
        }
    }

    public boolean s()
    {
        return i.getVisibility() == 0;
    }

    protected String t()
    {
        if (getActivity() == null)
        {
            return "";
        } else
        {
            return com.fitbit.data.domain.r.a().getShortDisplayName();
        }
    }

    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls2 {}


    /* member class not found */
    class _cls3 {}

}
