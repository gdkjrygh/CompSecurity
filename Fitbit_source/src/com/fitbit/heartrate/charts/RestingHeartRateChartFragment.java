// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.heartrate.charts;

import android.os.Bundle;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.Loader;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.fitbit.e.a;
import com.fitbit.heartrate.charts.views.RestingHeartRateInteractiveChartView;
import com.fitbit.ui.charts.ChartFragment;
import com.fitbit.ui.charts.Timeframe;
import com.fitbit.ui.charts.l;
import com.fitbit.ui.charts.m;
import com.fitbit.ui.endless.d;
import com.fitbit.util.format.e;
import com.fitbit.util.o;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

// Referenced classes of package com.fitbit.heartrate.charts:
//            a

public class RestingHeartRateChartFragment extends ChartFragment
    implements android.support.v4.app.LoaderManager.LoaderCallbacks, l, m
{

    private static final String a = "com.fitbit.heartrate.charts.RestingHeartRateChartFragment";
    private static final String b = "RestingHeartRateChartFragment.KEY_START_DATE";
    private static final String i = "RestingHeartRateChartFragment.KEY_END_DATE";
    private List j;
    private double k;
    private Date l;
    private boolean m;
    private TextView n;
    private TextView o;
    private RestingHeartRateInteractiveChartView p;

    public RestingHeartRateChartFragment()
    {
        j = new ArrayList();
        k = (1.0D / 0.0D);
        m = false;
    }

    private Bundle a(Date date, Date date1)
    {
        Bundle bundle = new Bundle();
        bundle.putSerializable("RestingHeartRateChartFragment.KEY_START_DATE", date);
        bundle.putSerializable("RestingHeartRateChartFragment.KEY_END_DATE", date1);
        return bundle;
    }

    static List a(RestingHeartRateChartFragment restingheartratechartfragment)
    {
        return restingheartratechartfragment.j;
    }

    private void a(d d1)
    {
        if (d1 != null)
        {
            j.removeAll(d1.b());
            j.addAll(0, d1.b());
        }
    }

    static RestingHeartRateInteractiveChartView b(RestingHeartRateChartFragment restingheartratechartfragment)
    {
        return restingheartratechartfragment.p;
    }

    public void a(double d1)
    {
        if (d1 < k && m && isAdded())
        {
            k = d1;
            m = false;
            Date date = new Date((long)d1 - 0x9a7ec800L);
            Date date1 = new Date(l.getTime() - 0x5265c00L);
            l = date;
            getLoaderManager().restartLoader(127, a(date, date1), this);
            com.fitbit.e.a.a(getTag(), "restartLoader with startDate: %s", new Object[] {
                date
            });
        }
    }

    public void a(Loader loader, d d1)
    {
        a(d1);
        if (j.size() == 0)
        {
            if (d1.c())
            {
                loader = com.fitbit.util.o.d().getTime();
                Date date = new Date(l.getTime() - 0x9a7ec800L);
                l = date;
                if (l.getTime() < loader.getTime() - com.fitbit.heartrate.charts.a.a(n()).a() - 0x757b12c00L)
                {
                    a(com.fitbit.ui.fragments.LoadingFragment.VisibilityState.c);
                    getLoaderManager().destroyLoader(127);
                } else
                {
                    getLoaderManager().restartLoader(127, a(date, ((Date) (loader))), this);
                }
            }
        } else
        {
            p.a(new _cls1());
            a(com.fitbit.ui.fragments.LoadingFragment.VisibilityState.b);
        }
        m = d1.c();
    }

    protected void a(View view)
    {
        super.a(view);
        n = (TextView)view.findViewById(0x7f1100fb);
        o = (TextView)view.findViewById(0x7f110287);
        p = (RestingHeartRateInteractiveChartView)view.findViewById(0x7f110234);
    }

    public void a(com.fitbit.ui.charts.l.a a1)
    {
        if (n != null && o != null)
        {
            long l1 = a1.a().getTime();
            long l2 = a1.b().getTime();
            if (l1 != 0x7fffffffffffffffL && l2 != 0x7fffffffffffffffL)
            {
                Date date1 = com.fitbit.util.o.h(new Date(l1));
                Date date = new Date(l2);
                Object obj = com.fitbit.util.o.e(new Date());
                if (date.after(((Date) (obj))))
                {
                    date = ((Date) (obj));
                }
                obj = Calendar.getInstance();
                ((Calendar) (obj)).setTime(com.fitbit.util.o.d(date1));
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(com.fitbit.util.o.d(date));
                if (((Calendar) (obj)).get(2) == calendar.get(2))
                {
                    o.setText(e.c(getActivity(), date1, date));
                } else
                {
                    o.setText(String.format("%s - %s", new Object[] {
                        e.v(getActivity(), date1), e.v(getActivity(), date)
                    }));
                }
            } else
            {
                o.setText("");
            }
            if (isAdded())
            {
                n.setText(String.format(getString(0x7f080216), new Object[] {
                    a1.c()
                }));
            }
        }
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        bundle = com.fitbit.util.o.d().getTime();
        Date date = new Date(bundle.getTime() - com.fitbit.heartrate.charts.a.a(n()).a());
        l = date;
        getLoaderManager().initLoader(127, a(date, bundle), this);
    }

    public Loader onCreateLoader(int i1, Bundle bundle)
    {
        Date date = (Date)bundle.getSerializable("RestingHeartRateChartFragment.KEY_START_DATE");
        bundle = (Date)bundle.getSerializable("RestingHeartRateChartFragment.KEY_END_DATE");
    /* block-local class not found */
    class a {}

        return new a(getActivity(), date, bundle);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return layoutinflater.inflate(0x7f0400c5, viewgroup, false);
    }

    public void onLoadFinished(Loader loader, Object obj)
    {
        a(loader, (d)obj);
    }

    public void onLoaderReset(Loader loader)
    {
    }

    public void onPause()
    {
        super.onPause();
        p.d();
    }

    protected void u_()
    {
        super.u_();
        p.a(this);
        p.a(this);
        p.a(this);
        p.a(this);
        n.setSelected(true);
        o.setSelected(true);
        a(com.fitbit.ui.fragments.LoadingFragment.VisibilityState.a);
    }

    /* member class not found */
    class _cls1 {}

}
