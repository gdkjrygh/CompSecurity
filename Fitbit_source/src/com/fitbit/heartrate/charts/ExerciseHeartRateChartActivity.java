// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.heartrate.charts;

import android.content.Context;
import android.content.Intent;
import android.widget.TextView;
import com.fitbit.mixpanel.f;
import com.fitbit.savedstate.HeartRateSavedState;
import com.fitbit.ui.charts.ChartActivity;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

// Referenced classes of package com.fitbit.heartrate.charts:
//            ExerciseHeartRateChartFragment

public class ExerciseHeartRateChartActivity extends ChartActivity
{

    private static final String a = "ExercizeHeartrateChartActivity";

    public ExerciseHeartRateChartActivity()
    {
    }

    public static void a(Context context, Date date)
    {
        f.c("Heart Rate: View Large Heart Rate Graph");
        Intent intent = new Intent(context, com/fitbit/heartrate/charts/ExerciseHeartRateChartActivity);
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
        return "ExercizeHeartrateChartActivity";
    }

    protected void b_(int i)
    {
        HeartRateSavedState.a(i, com.fitbit.savedstate.HeartRateSavedState.HeartRateChartType.b);
    }

    protected List c()
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new com.fitbit.ui.charts.ChartFragment.a(com/fitbit/heartrate/charts/ExerciseHeartRateChartFragment, a(com.fitbit.util.chart.Filter.Type.A)));
        arraylist.add(new com.fitbit.ui.charts.ChartFragment.a(com/fitbit/heartrate/charts/ExerciseHeartRateChartFragment, a(com.fitbit.util.chart.Filter.Type.B)));
        arraylist.add(new com.fitbit.ui.charts.ChartFragment.a(com/fitbit/heartrate/charts/ExerciseHeartRateChartFragment, a(com.fitbit.util.chart.Filter.Type.C)));
        arraylist.add(new com.fitbit.ui.charts.ChartFragment.a(com/fitbit/heartrate/charts/ExerciseHeartRateChartFragment, a(com.fitbit.util.chart.Filter.Type.D)));
        return arraylist;
    }

    protected int d()
    {
        return HeartRateSavedState.a(com.fitbit.savedstate.HeartRateSavedState.HeartRateChartType.b);
    }

    protected void e()
    {
        super.e();
        f.setText(0x7f080527);
        f.setSelected(true);
    }
}
