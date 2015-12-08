// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.sleep.ui.charts;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.Loader;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.fitbit.ui.charts.InteractiveChartView;
import com.fitbit.ui.charts.ScrollableChartFragment;
import com.fitbit.ui.charts.ScrollableInteractiveChartView;
import com.fitbit.ui.charts.Timeframe;
import com.fitbit.ui.charts.t;
import com.fitbit.util.bm;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

// Referenced classes of package com.fitbit.sleep.ui.charts:
//            a, SleepScrollableChartView, SleepParam

public class SleepChartFragment extends ScrollableChartFragment
{

    public static final String a = "ARG_TIMEFRAME";
    public static final String b = "ARG_SLEEP_PARAM";
    private SleepParam i;
    private Timeframe j;
    private Double k;
    private TextView l;
    private SleepScrollableChartView m;
    private View n;

    public SleepChartFragment()
    {
        k = Double.valueOf((1.0D / 0.0D));
    }

    static Double a(SleepChartFragment sleepchartfragment)
    {
        return sleepchartfragment.k;
    }

    static Double a(SleepChartFragment sleepchartfragment, Double double1)
    {
        sleepchartfragment.k = double1;
        return double1;
    }

    static Timeframe b(SleepChartFragment sleepchartfragment)
    {
        return sleepchartfragment.j;
    }

    static SleepParam c(SleepChartFragment sleepchartfragment)
    {
        return sleepchartfragment.i;
    }

    static SleepScrollableChartView d(SleepChartFragment sleepchartfragment)
    {
        return sleepchartfragment.m;
    }

    protected Loader a(Date date, Date date1)
    {
        return new a(getActivity(), i, date, date1);
    }

    protected void a(View view)
    {
        super.a(view);
        n = view.findViewById(0x7f110084);
        l = (TextView)view.findViewById(0x7f1100fb);
        m = (SleepScrollableChartView)view.findViewById(0x7f110234);
    }

    protected void a(List list)
    {
        if (list == null || list.size() == 0)
        {
            a(com.fitbit.ui.fragments.LoadingFragment.VisibilityState.c);
            return;
        } else
        {
            list = t.a(bm.a(list, new Date(), 1), j);
            m.a(new _cls1(list));
            a(com.fitbit.ui.fragments.LoadingFragment.VisibilityState.b);
            return;
        }
    }

    protected ScrollableInteractiveChartView h()
    {
        return m;
    }

    protected Comparator i()
    {
        return bm.a();
    }

    protected InteractiveChartView j()
    {
        return h();
    }

    public void onActivityCreated(Bundle bundle)
    {
    /* block-local class not found */
    class b {}

        getLoaderManager().initLoader(184, null, new b(null));
        super.onActivityCreated(bundle);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        j = Timeframe.valueOf(getArguments().getString("ARG_TIMEFRAME"));
        i = SleepParam.valueOf(getArguments().getString("ARG_SLEEP_PARAM"));
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return layoutinflater.inflate(0x7f0400a1, viewgroup, false);
    }

    protected void u_()
    {
        super.u_();
        int i1 = getResources().getConfiguration().orientation;
        View view = n;
        if (i1 == 2)
        {
            i1 = 8;
        } else
        {
            i1 = 0;
        }
        view.setVisibility(i1);
        l.setText(getActivity().getString(i.b()));
        l.setSelected(true);
        a(com.fitbit.ui.fragments.LoadingFragment.VisibilityState.a);
    }

    // Unreferenced inner class com/fitbit/sleep/ui/charts/SleepChartFragment$a
    /* block-local class not found */
    class a {}


    /* member class not found */
    class _cls1 {}

}
