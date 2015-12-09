// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.water.ui;

import android.view.View;
import com.fitbit.water.ui.charts.WaterChartActivity;

// Referenced classes of package com.fitbit.water.ui:
//            WaterBabyChartFragment

class a
    implements android.view.ment._cls1
{

    final WaterBabyChartFragment a;

    public void onClick(View view)
    {
        view = WaterChartActivity.a(view.getContext());
        a.startActivity(view);
    }

    (WaterBabyChartFragment waterbabychartfragment)
    {
        a = waterbabychartfragment;
        super();
    }
}
