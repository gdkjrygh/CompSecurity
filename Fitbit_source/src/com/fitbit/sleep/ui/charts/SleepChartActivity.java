// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.sleep.ui.charts;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import com.fitbit.savedstate.r;
import com.fitbit.ui.charts.ChartActivity;
import com.fitbit.ui.charts.Timeframe;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.fitbit.sleep.ui.charts:
//            SleepParam, SleepChartFragment

public class SleepChartActivity extends ChartActivity
{

    private static final String a = "SleepChartActivity";
    private static final String i = "sleepParam";
    private SleepParam j;

    public SleepChartActivity()
    {
    }

    public static Intent a(Context context, SleepParam sleepparam)
    {
        context = new Intent(context, com/fitbit/sleep/ui/charts/SleepChartActivity);
        context.putExtra("sleepParam", sleepparam);
        return context;
    }

    protected int a()
    {
        return 0x7f040020;
    }

    protected void a(Intent intent)
    {
        super.a(intent);
        j = (SleepParam)intent.getSerializableExtra("sleepParam");
    }

    protected String b()
    {
        return "SleepChartActivity";
    }

    protected void b_(int k)
    {
        if (SleepParam.a.equals(j))
        {
            r.a(k);
        } else
        if (SleepParam.b.equals(j))
        {
            r.b(k);
            return;
        }
    }

    protected List c()
    {
        ArrayList arraylist = new ArrayList();
        Bundle bundle = new Bundle();
        bundle.putString("ARG_SLEEP_PARAM", j.toString());
        Bundle bundle1 = new Bundle(bundle);
        bundle1.putString("ARG_TIMEFRAME", Timeframe.a.toString());
        arraylist.add(new com.fitbit.ui.charts.ChartFragment.a(com/fitbit/sleep/ui/charts/SleepChartFragment, bundle1));
        bundle1 = new Bundle(bundle);
        bundle1.putString("ARG_TIMEFRAME", Timeframe.b.toString());
        arraylist.add(new com.fitbit.ui.charts.ChartFragment.a(com/fitbit/sleep/ui/charts/SleepChartFragment, bundle1));
        bundle1 = new Bundle(bundle);
        bundle1.putString("ARG_TIMEFRAME", Timeframe.c.toString());
        arraylist.add(new com.fitbit.ui.charts.ChartFragment.a(com/fitbit/sleep/ui/charts/SleepChartFragment, bundle1));
        bundle = new Bundle(bundle);
        bundle.putString("ARG_TIMEFRAME", Timeframe.d.toString());
        arraylist.add(new com.fitbit.ui.charts.ChartFragment.a(com/fitbit/sleep/ui/charts/SleepChartFragment, bundle));
        return arraylist;
    }

    protected int d()
    {
        int k = 1;
        if (SleepParam.a.equals(j))
        {
            k = r.h();
        } else
        if (SleepParam.b.equals(j))
        {
            return r.i();
        }
        return k;
    }

    protected void e()
    {
        super.e();
        f.setText(j.b());
        f.setSelected(true);
    }

    protected void onResume()
    {
        super.onResume();
        getWindow().getDecorView().setSystemUiVisibility(512);
    }
}
