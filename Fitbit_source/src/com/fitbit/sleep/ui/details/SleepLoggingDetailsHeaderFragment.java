// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.sleep.ui.details;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.Loader;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.TextView;
import com.fitbit.data.domain.SleepLogEntry;
import com.fitbit.sleep.ui.SleepIntradayChartLegendAdapter;
import com.fitbit.sleep.ui.intraday.SleepIntradayChartActivity;
import com.fitbit.sleep.ui.landing.b;
import com.fitbit.ui.fragments.LoadingFragment;
import com.fitbit.util.format.e;

// Referenced classes of package com.fitbit.sleep.ui.details:
//            IntradaySleepBabyChartView, a

public class SleepLoggingDetailsHeaderFragment extends LoadingFragment
    implements android.support.v4.app.LoaderManager.LoaderCallbacks
{

    private static final String a = "logId";
    private long b;
    private View c;
    private View d;
    private View e;
    private GridView f;
    private TextView g;
    private IntradaySleepBabyChartView h;
    private SleepLogEntry i;

    public SleepLoggingDetailsHeaderFragment()
    {
    }

    public static SleepLoggingDetailsHeaderFragment a(long l)
    {
        Bundle bundle = new Bundle();
        bundle.putLong("logId", l);
        SleepLoggingDetailsHeaderFragment sleeploggingdetailsheaderfragment = new SleepLoggingDetailsHeaderFragment();
        sleeploggingdetailsheaderfragment.setArguments(bundle);
        return sleeploggingdetailsheaderfragment;
    }

    static void a(SleepLoggingDetailsHeaderFragment sleeploggingdetailsheaderfragment)
    {
        sleeploggingdetailsheaderfragment.g();
    }

    private void f()
    {
        a(com.fitbit.ui.fragments.LoadingFragment.VisibilityState.a);
        f.setAdapter(new SleepIntradayChartLegendAdapter(getActivity()));
    }

    private void g()
    {
        if (i != null)
        {
            android.support.v4.app.FragmentActivity fragmentactivity = getActivity();
            fragmentactivity.startActivity(SleepIntradayChartActivity.a(fragmentactivity, i));
        }
    }

    protected View a()
    {
        return c;
    }

    public void a(Loader loader, b b1)
    {
        a(com.fitbit.ui.fragments.LoadingFragment.VisibilityState.b);
        i = b1.a();
        h.a(i);
        if (i != null)
        {
            g.setText(com.fitbit.util.format.e.p(getActivity(), i.getLogDate()));
        }
    }

    protected View d()
    {
        return e;
    }

    protected View e()
    {
        return d;
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        getLoaderManager().initLoader(502, null, this);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        bundle = getArguments();
        if (bundle != null && bundle.containsKey("logId"))
        {
            b = bundle.getLong("logId");
        }
    }

    public Loader onCreateLoader(int j, Bundle bundle)
    {
        return new a(getActivity(), b);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return layoutinflater.inflate(0x7f0400c8, viewgroup, false);
    }

    public void onLoadFinished(Loader loader, Object obj)
    {
        a(loader, (b)obj);
    }

    public void onLoaderReset(Loader loader)
    {
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        c = view.findViewById(0x7f11006c);
        g = (TextView)view.findViewById(0x7f110238);
        h = (IntradaySleepBabyChartView)view.findViewById(0x7f110234);
        f = (GridView)view.findViewById(0x7f11028e);
        e = view.findViewById(0x7f11006b);
        d = view.findViewById(0x7f110235);
        if (c != null)
        {
            c.setOnClickListener(new _cls1());
        }
        f();
    }

    /* member class not found */
    class _cls1 {}

}
