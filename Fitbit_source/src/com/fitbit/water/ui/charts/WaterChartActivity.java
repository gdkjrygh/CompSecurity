// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.water.ui.charts;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import com.fitbit.savedstate.u;
import com.fitbit.ui.charts.ChartActivity;
import com.fitbit.ui.charts.Timeframe;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.fitbit.water.ui.charts:
//            WaterChartFragment

public class WaterChartActivity extends ChartActivity
{

    private static final String a = "WaterChartActivity";

    public WaterChartActivity()
    {
    }

    public static Intent a(Context context)
    {
        return new Intent(context, com/fitbit/water/ui/charts/WaterChartActivity);
    }

    protected int a()
    {
        return 0x7f040020;
    }

    protected String b()
    {
        return "WaterChartActivity";
    }

    protected void b_(int i)
    {
        u.a(i);
    }

    protected List c()
    {
        ArrayList arraylist = new ArrayList();
        Timeframe atimeframe[] = Timeframe.values();
        int j = atimeframe.length;
        for (int i = 0; i < j; i++)
        {
            Timeframe timeframe = atimeframe[i];
            Bundle bundle = new Bundle();
            bundle.putString("GRAPH_TIMEFRAME", timeframe.toString());
            arraylist.add(new com.fitbit.ui.charts.ChartFragment.a(com/fitbit/water/ui/charts/WaterChartFragment, bundle));
        }

        return arraylist;
    }

    protected int d()
    {
        return u.h();
    }

    public void onResume()
    {
        super.onResume();
        getWindow().getDecorView().setSystemUiVisibility(512);
    }
}
