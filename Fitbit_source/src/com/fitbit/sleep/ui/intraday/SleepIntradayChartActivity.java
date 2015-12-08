// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.sleep.ui.intraday;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTabHost;
import android.view.View;
import android.view.Window;
import android.widget.TabWidget;
import com.fitbit.data.domain.SleepLogEntry;
import com.fitbit.ui.charts.ChartActivity;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.fitbit.sleep.ui.intraday:
//            SleepIntradayPagerFragment

public class SleepIntradayChartActivity extends ChartActivity
{

    private static final String a = "SleepIntradayChartActivity";

    public SleepIntradayChartActivity()
    {
    }

    public static Intent a(Context context, SleepLogEntry sleeplogentry)
    {
        context = new Intent(context, com/fitbit/sleep/ui/intraday/SleepIntradayChartActivity);
        context.putExtra("startDate", sleeplogentry.getLogDate());
        context.putExtra("endDate", sleeplogentry.getLogDate());
        return context;
    }

    protected int a()
    {
        return 0x7f040020;
    }

    protected String b()
    {
        return "SleepIntradayChartActivity";
    }

    protected void b_(int i)
    {
    }

    protected List c()
    {
        Bundle bundle = new Bundle();
        bundle.putSerializable("com.fitbit.heartrate.ChartFragment.EXTRA_START_DATE", j());
        bundle.putSerializable("com.fitbit.heartrate.ChartFragment.EXTRA_END_DATE", k());
        ArrayList arraylist = new ArrayList();
        arraylist.add(new com.fitbit.ui.charts.ChartFragment.a(com/fitbit/sleep/ui/intraday/SleepIntradayPagerFragment, bundle));
        return arraylist;
    }

    protected int d()
    {
        return 0;
    }

    protected void e()
    {
        h.setVisibility(8);
        super.e();
    }

    public void f()
    {
        com.fitbit.ui.charts.InteractiveChartView.d d1 = (com.fitbit.ui.charts.InteractiveChartView.d)getSupportFragmentManager().findFragmentByTag(g.getCurrentTabTag());
        if (d1 != null)
        {
            d1.f();
        }
    }

    public void g()
    {
        com.fitbit.ui.charts.InteractiveChartView.c c1 = (com.fitbit.ui.charts.InteractiveChartView.c)getSupportFragmentManager().findFragmentByTag(g.getCurrentTabTag());
        if (c1 != null)
        {
            c1.g();
        }
    }

    protected void onResume()
    {
        super.onResume();
        getWindow().getDecorView().setSystemUiVisibility(512);
    }
}
