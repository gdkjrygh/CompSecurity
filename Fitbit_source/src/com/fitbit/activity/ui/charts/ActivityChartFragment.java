// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.activity.ui.charts;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.Loader;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.fitbit.activity.ui.charts.views.ActivityInteractiveChartView;
import com.fitbit.e.a;
import com.fitbit.ui.charts.ChartFragment;
import com.fitbit.ui.charts.Timeframe;
import com.fitbit.ui.charts.l;
import com.fitbit.ui.charts.m;
import com.fitbit.ui.charts.t;
import com.fitbit.ui.endless.d;
import com.fitbit.util.bm;
import com.fitbit.util.format.e;
import com.fitbit.util.o;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

// Referenced classes of package com.fitbit.activity.ui.charts:
//            b, ActivityType

public class ActivityChartFragment extends ChartFragment
    implements android.support.v4.app.LoaderManager.LoaderCallbacks, l, m
{

    public static final String a = "com.fitbit.heartrate.ActivityChartFragment.ARG_ACTIVITY_TYPE";
    public static final String b = "com.fitbit.heartrate.ActivityChartFragment.ARG_TIME_INTERVAL";
    private static final String i = "StepsChartFragment.KEY_START_DATE";
    private static final String j = "StepsChartFragment.KEY_END_DATE";
    private List k;
    private ActivityType l;
    private Timeframe m;
    private double n;
    private Date o;
    private boolean p;
    private TextView q;
    private TextView r;
    private TextView s;
    private ActivityInteractiveChartView t;

    public ActivityChartFragment()
    {
        k = new ArrayList();
        n = (1.0D / 0.0D);
        p = false;
    }

    private Bundle a(Date date, Date date1)
    {
        Bundle bundle = new Bundle();
        bundle.putSerializable("StepsChartFragment.KEY_START_DATE", date);
        bundle.putSerializable("StepsChartFragment.KEY_END_DATE", date1);
        return bundle;
    }

    static Timeframe a(ActivityChartFragment activitychartfragment)
    {
        return activitychartfragment.m;
    }

    private void a(d d1)
    {
        if (d1 != null)
        {
            k.removeAll(d1.b());
            k.addAll(d1.b());
            bm.a(k);
        }
    }

    static ActivityType b(ActivityChartFragment activitychartfragment)
    {
        return activitychartfragment.l;
    }

    static ActivityInteractiveChartView c(ActivityChartFragment activitychartfragment)
    {
        return activitychartfragment.t;
    }

    public void a(double d1)
    {
        if (d1 < n && p && isAdded())
        {
            n = d1;
            p = false;
            Date date = new Date((long)d1 - 0x9a7ec800L);
            Date date1 = new Date(o.getTime() - 0x5265c00L);
            o = date;
            getLoaderManager().restartLoader(135, a(date, date1), this);
            com.fitbit.e.a.a(getTag(), "restartLoader with startDate: %s", new Object[] {
                date
            });
        }
    }

    public void a(Loader loader, b b1)
    {
        a(((d) (b1)));
        if (k == null || k.size() == 0)
        {
            a(com.fitbit.ui.fragments.LoadingFragment.VisibilityState.c);
            return;
        } else
        {
            p = b1.c();
            double d1 = com.fitbit.util.a.a(m, b1.a().doubleValue());
            loader = com.fitbit.ui.charts.t.a(bm.a(k, new Date(), 1), m);
            t.a(new Runnable(loader, d1) {

                final t a;
                final double b;
                final ActivityChartFragment c;

                public void run()
                {
                    ActivityChartFragment.c(c).a(a, b, com.fitbit.activity.ui.charts.ActivityChartFragment.a(c), ActivityChartFragment.b(c));
                }

            
            {
                c = ActivityChartFragment.this;
                a = t1;
                b = d1;
                super();
            }
            });
            a(com.fitbit.ui.fragments.LoadingFragment.VisibilityState.b);
            return;
        }
    }

    protected void a(View view)
    {
        super.a(view);
        q = (TextView)view.findViewById(0x7f1100fb);
        r = (TextView)view.findViewById(0x7f110287);
        s = (TextView)view.findViewById(0x7f1102ad);
        t = (ActivityInteractiveChartView)view.findViewById(0x7f110234);
    }

    public void a(com.fitbit.ui.charts.l.a a1)
    {
        if (q != null && r != null)
        {
            long l1 = a1.a().getTime();
            long l2 = a1.b().getTime();
            if (l1 != 0x7fffffffffffffffL && l2 != 0x7fffffffffffffffL)
            {
                Object obj1 = com.fitbit.util.o.h(new Date(l1));
                Date date = new Date(l2);
                Object obj = com.fitbit.util.o.e(new Date());
                if (date.after(((Date) (obj))))
                {
                    date = ((Date) (obj));
                }
                obj = Calendar.getInstance();
                ((Calendar) (obj)).setTime(com.fitbit.util.o.d(((Date) (obj1))));
                Object obj2 = Calendar.getInstance();
                ((Calendar) (obj2)).setTime(com.fitbit.util.o.d(date));
                double d1;
                double d2;
                if (((Calendar) (obj)).get(2) == ((Calendar) (obj2)).get(2) && ((Calendar) (obj)).get(1) == ((Calendar) (obj2)).get(1))
                {
                    r.setText(e.d(getActivity(), ((Date) (obj1)), date));
                } else
                {
                    if (((Calendar) (obj)).get(1) == ((Calendar) (obj2)).get(1))
                    {
                        obj1 = e.v(getActivity(), ((Date) (obj1)));
                        obj = e.v(getActivity(), date);
                    } else
                    {
                        obj1 = e.g(getActivity(), ((Date) (obj1)));
                        obj = e.g(getActivity(), date);
                    }
                    obj2 = r;
                    if (com.fitbit.util.o.j(new Date(), date))
                    {
                        obj = getActivity().getResources().getText(0x7f080540);
                    }
                    ((TextView) (obj2)).setText(String.format("%s - %s", new Object[] {
                        obj1, obj
                    }));
                }
            } else
            {
                r.setText("");
            }
            if (isAdded())
            {
                d1 = ((Double)a1.c()).doubleValue();
                q.setText(com.fitbit.util.a.a(getActivity(), l, Double.valueOf(d1)));
                d2 = d1 / (double)(m.a() / 0x5265c00L);
                d1 = d2;
                if (ActivityType.c != l)
                {
                    d1 = Math.round(d2);
                }
                s.setText(String.format(getString(0x7f080219), new Object[] {
                    e.b(d1)
                }));
            }
        }
    }

    protected com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType c()
    {
        return l.a();
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        bundle = com.fitbit.util.o.d().getTime();
        Date date = new Date(bundle.getTime() - 0x9a7ec800L);
        o = date;
        getLoaderManager().initLoader(135, a(date, bundle), this);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        l = (ActivityType)getArguments().getSerializable("com.fitbit.heartrate.ActivityChartFragment.ARG_ACTIVITY_TYPE");
        m = (Timeframe)getArguments().getSerializable("com.fitbit.heartrate.ActivityChartFragment.ARG_TIME_INTERVAL");
    }

    public Loader onCreateLoader(int i1, Bundle bundle)
    {
        Date date = (Date)bundle.getSerializable("StepsChartFragment.KEY_START_DATE");
        bundle = (Date)bundle.getSerializable("StepsChartFragment.KEY_END_DATE");
        return new com.fitbit.activity.ui.d(getActivity(), l, date, bundle, true);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return layoutinflater.inflate(0x7f0400a2, viewgroup, false);
    }

    public void onLoadFinished(Loader loader, Object obj)
    {
        a(loader, (b)obj);
    }

    public void onLoaderReset(Loader loader)
    {
    }

    public void onPause()
    {
        super.onPause();
        t.d();
    }

    protected void u_()
    {
        super.u_();
        t.a(this);
        t.a(this);
        t.a(this);
        t.a(this);
        q.setSelected(true);
        r.setSelected(true);
        a(com.fitbit.ui.fragments.LoadingFragment.VisibilityState.a);
    }
}
