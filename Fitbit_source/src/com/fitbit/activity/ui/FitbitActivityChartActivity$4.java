// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.activity.ui;

import android.support.v4.app.FragmentActivity;
import com.fitbit.home.ui.g;

// Referenced classes of package com.fitbit.activity.ui:
//            FitbitActivityChartActivity

class a extends g
{

    final FitbitActivityChartActivity a;

    public void a()
    {
        if (FitbitActivityChartActivity.d(a) == this)
        {
            FitbitActivityChartActivity.a(a, null);
        }
        FitbitActivityChartActivity.e(a);
    }

    public void a(Exception exception)
    {
        if (FitbitActivityChartActivity.d(a) == this)
        {
            FitbitActivityChartActivity.a(a, null);
        }
        FitbitActivityChartActivity.f(a);
    }

    (FitbitActivityChartActivity fitbitactivitychartactivity, FragmentActivity fragmentactivity, int i)
    {
        a = fitbitactivitychartactivity;
        super(fragmentactivity, i);
    }
}
