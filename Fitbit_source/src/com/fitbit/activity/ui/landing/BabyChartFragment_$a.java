// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.activity.ui.landing;

import android.os.Bundle;
import com.fitbit.activity.ui.charts.ActivityType;

// Referenced classes of package com.fitbit.activity.ui.landing:
//            BabyChartFragment_, BabyChartFragment

public static class <init>
{

    private Bundle a;

    public BabyChartFragment a()
    {
        BabyChartFragment_ babychartfragment_ = new BabyChartFragment_();
        babychartfragment_.setArguments(a);
        return babychartfragment_;
    }

    public a a(ActivityType activitytype)
    {
        a.putSerializable("activityType", activitytype);
        return this;
    }

    private _cls9()
    {
        a = new Bundle();
    }

    a(a a1)
    {
        this();
    }
}
