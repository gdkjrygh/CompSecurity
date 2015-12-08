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
import com.fitbit.heartrate.charts.views.ExerciseHeartRateInteractiveChartView;
import com.fitbit.ui.charts.ChartFragment;
import com.fitbit.ui.charts.Timeframe;
import com.fitbit.ui.charts.l;
import com.fitbit.ui.charts.m;
import com.fitbit.ui.endless.d;
import com.fitbit.util.format.e;
import com.fitbit.util.o;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

// Referenced classes of package com.fitbit.heartrate.charts:
//            a

public class ExerciseHeartRateChartFragment extends ChartFragment
    implements android.support.v4.app.LoaderManager.LoaderCallbacks, l, m
{

    private static final String a = "ExerciseHeartrateChartFragment";
    private static final String b = "ExerciseHeartRateChartFragment.KEY_START_DATE";
    private static final String i = "ExerciseHeartRateChartFragment.KEY_END_DATE";
    private double j;
    private Date k;
    private boolean l;
    private TextView m;
    private TextView n;
    private ExerciseHeartRateInteractiveChartView o;

    public ExerciseHeartRateChartFragment()
    {
        j = (1.0D / 0.0D);
        l = false;
    }

    private Bundle a(Date date, Date date1)
    {
        Bundle bundle = new Bundle();
        bundle.putSerializable("ExerciseHeartRateChartFragment.KEY_START_DATE", date);
        bundle.putSerializable("ExerciseHeartRateChartFragment.KEY_END_DATE", date1);
        return bundle;
    }

    static ExerciseHeartRateInteractiveChartView a(ExerciseHeartRateChartFragment exerciseheartratechartfragment)
    {
        return exerciseheartratechartfragment.o;
    }

    public void a(double d1)
    {
        if (d1 < j && l && isAdded())
        {
            j = d1;
            l = false;
            Date date = new Date((long)d1 - 0x9a7ec800L);
            Date date1 = new Date(k.getTime() - 0x5265c00L);
            k = date;
            getLoaderManager().restartLoader(129, a(date, date1), this);
            com.fitbit.e.a.a("ExerciseHeartrateChartFragment", "restartLoader with startDate: %s", new Object[] {
                date
            });
        }
    }

    public void a(Loader loader, d d1)
    {
        if (d1 == null || d1.b() == null || d1.b().size() == 0)
        {
            a(com.fitbit.ui.fragments.LoadingFragment.VisibilityState.c);
            return;
        } else
        {
            l = d1.c();
            o.a(new _cls1(d1));
            a(com.fitbit.ui.fragments.LoadingFragment.VisibilityState.b);
            com.fitbit.e.a.a("ExerciseHeartrateChartFragment", "onLoadFinished result: %s", new Object[] {
                d1
            });
            return;
        }
    }

    protected void a(View view)
    {
        super.a(view);
        m = (TextView)view.findViewById(0x7f1100fb);
        n = (TextView)view.findViewById(0x7f110287);
        o = (ExerciseHeartRateInteractiveChartView)view.findViewById(0x7f110234);
    }

    public void a(com.fitbit.ui.charts.l.a a1)
    {
        if (m != null && n != null)
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
                    n.setText(e.c(getActivity(), date1, date));
                } else
                {
                    n.setText(String.format("%s - %s", new Object[] {
                        e.v(getActivity(), date1), e.v(getActivity(), date)
                    }));
                }
            } else
            {
                n.setText("");
            }
            m.setText(e.a(getActivity(), ((Integer)a1.c()).intValue()));
        }
    }

    public void onActivityCreated(Bundle bundle)
    {
        long l1 = 0x9a7ec800L;
        super.onActivityCreated(bundle);
        bundle = new Date();
        long l2 = com.fitbit.heartrate.charts.a.a(n()).a();
        Date date;
        if (l2 >= 0x9a7ec800L)
        {
            l1 = l2;
        }
        date = new Date(bundle.getTime() - l1);
        k = date;
        getLoaderManager().initLoader(129, a(date, bundle), this);
    }

    public Loader onCreateLoader(int i1, Bundle bundle)
    {
        Date date = (Date)bundle.getSerializable("ExerciseHeartRateChartFragment.KEY_START_DATE");
        bundle = (Date)bundle.getSerializable("ExerciseHeartRateChartFragment.KEY_END_DATE");
    /* block-local class not found */
    class a {}

        bundle = new a(getActivity(), date, bundle);
        com.fitbit.e.a.a("ExerciseHeartrateChartFragment", "Creating activity loader %s at %s", new Object[] {
            bundle, this
        });
        return bundle;
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return layoutinflater.inflate(0x7f040097, viewgroup, false);
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
        o.d();
    }

    protected void u_()
    {
        super.u_();
        o.a(this);
        o.a(this);
        o.a(this);
        o.a(this);
        m.setSelected(true);
        n.setSelected(true);
        a(com.fitbit.ui.fragments.LoadingFragment.VisibilityState.a);
    }

    /* member class not found */
    class _cls1 {}

}
