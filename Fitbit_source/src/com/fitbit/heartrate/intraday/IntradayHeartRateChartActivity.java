// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.heartrate.intraday;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTabHost;
import android.widget.TabWidget;
import com.fitbit.mixpanel.f;
import com.fitbit.ui.charts.ChartActivity;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

// Referenced classes of package com.fitbit.heartrate.intraday:
//            IntradayHeartRatePagerTabFragment

public class IntradayHeartRateChartActivity extends ChartActivity
{

    private static final String a = "IntradayHeartrateChartActivity";

    public IntradayHeartRateChartActivity()
    {
    }

    public static void a(Context context, Date date)
    {
        com.fitbit.mixpanel.f.c("Heart Rate: View Large Heart Rate Graph");
        Intent intent = new Intent(context, com/fitbit/heartrate/intraday/IntradayHeartRateChartActivity);
        intent.putExtra("startDate", date);
        intent.putExtra("endDate", date);
        context.startActivity(intent);
    }

    protected int a()
    {
        return 0x7f040020;
    }

    protected String b()
    {
        return "IntradayHeartrateChartActivity";
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
        arraylist.add(new com.fitbit.ui.charts.ChartFragment.a(com/fitbit/heartrate/intraday/IntradayHeartRatePagerTabFragment, bundle));
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
}
