// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.activity.ui.landing;

import android.os.Bundle;
import com.fitbit.activity.ui.charts.ActivityType;

// Referenced classes of package com.fitbit.activity.ui.landing:
//            ActivityDaysListFragment_, ActivityDaysListFragment

public static class <init>
{

    private Bundle a;

    public ActivityDaysListFragment a()
    {
        ActivityDaysListFragment_ activitydayslistfragment_ = new ActivityDaysListFragment_();
        activitydayslistfragment_.setArguments(a);
        return activitydayslistfragment_;
    }

    public a a(ActivityType activitytype)
    {
        a.putSerializable("activityType", activitytype);
        return this;
    }

    private ()
    {
        a = new Bundle();
    }

    a(a a1)
    {
        this();
    }
}
