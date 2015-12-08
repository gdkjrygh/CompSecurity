// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.activity.ui.charts;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.fitbit.savedstate.b;
import com.fitbit.ui.charts.ChartActivity;
import com.fitbit.ui.charts.Timeframe;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

// Referenced classes of package com.fitbit.activity.ui.charts:
//            ActivityType, ActivityChartFragment

public class ActivityChartActivity extends ChartActivity
{

    private static final String i = "ActivityChartActivity";
    private static final String j = "activityType";
    protected ActivityType a;

    public ActivityChartActivity()
    {
    }

    public static void a(Context context, ActivityType activitytype, Date date)
    {
        Intent intent = new Intent(context, com/fitbit/activity/ui/charts/ActivityChartActivity);
        intent.putExtra("activityType", activitytype);
        intent.putExtra("startDate", date);
        intent.putExtra("endDate", date);
        context.startActivity(intent);
    }

    protected int a()
    {
        return 0x7f040021;
    }

    protected void a(Intent intent)
    {
        super.a(intent);
        a = (ActivityType)intent.getSerializableExtra("activityType");
    }

    protected String b()
    {
        return "ActivityChartActivity";
    }

    protected void b_(int k)
    {
        com.fitbit.savedstate.b.a(k, a.name());
    }

    protected List c()
    {
        ArrayList arraylist = new ArrayList();
        Bundle bundle = new Bundle();
        bundle.putSerializable("com.fitbit.heartrate.ActivityChartFragment.ARG_ACTIVITY_TYPE", a);
        bundle.putSerializable("com.fitbit.heartrate.ActivityChartFragment.ARG_TIME_INTERVAL", Timeframe.a);
        arraylist.add(new com.fitbit.ui.charts.ChartFragment.a(com/fitbit/activity/ui/charts/ActivityChartFragment, bundle));
        bundle = new Bundle(bundle);
        bundle.putSerializable("com.fitbit.heartrate.ActivityChartFragment.ARG_TIME_INTERVAL", Timeframe.b);
        arraylist.add(new com.fitbit.ui.charts.ChartFragment.a(com/fitbit/activity/ui/charts/ActivityChartFragment, bundle));
        bundle = new Bundle(bundle);
        bundle.putSerializable("com.fitbit.heartrate.ActivityChartFragment.ARG_TIME_INTERVAL", Timeframe.c);
        arraylist.add(new com.fitbit.ui.charts.ChartFragment.a(com/fitbit/activity/ui/charts/ActivityChartFragment, bundle));
        bundle = new Bundle(bundle);
        bundle.putSerializable("com.fitbit.heartrate.ActivityChartFragment.ARG_TIME_INTERVAL", Timeframe.d);
        arraylist.add(new com.fitbit.ui.charts.ChartFragment.a(com/fitbit/activity/ui/charts/ActivityChartFragment, bundle));
        return arraylist;
    }

    protected int d()
    {
        return com.fitbit.savedstate.b.a(a.name());
    }
}
