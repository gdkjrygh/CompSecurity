// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.activity.ui.landing;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import com.fitbit.activity.ui.charts.ActivityType;
import com.fitbit.ui.FitbitActivity;

// Referenced classes of package com.fitbit.activity.ui.landing:
//            ActivityDaysListFragment

public class ActivityLandingActivity extends FitbitActivity
{

    public static final String a = "ActivityLandingActivity.TAG_ACTIVITY_DAYS_LIST_FRAGMENT";
    public static final String b = "com.fitbit.activity.ui.landing.ActivityLandingActivity.EXTRA_ACTIVITY_TYPE";
    private ActivityType c;

    public ActivityLandingActivity()
    {
    }

    public static Intent a(Context context, ActivityType activitytype)
    {
        context = new Intent(context, com/fitbit/activity/ui/landing/ActivityLandingActivity);
        context.putExtra("com.fitbit.activity.ui.landing.ActivityLandingActivity.EXTRA_ACTIVITY_TYPE", activitytype);
        return context;
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f040003);
        bundle = getIntent();
        if (bundle.hasExtra("com.fitbit.activity.ui.landing.ActivityLandingActivity.EXTRA_ACTIVITY_TYPE"))
        {
            c = (ActivityType)bundle.getSerializableExtra("com.fitbit.activity.ui.landing.ActivityLandingActivity.EXTRA_ACTIVITY_TYPE");
        }
        Object obj = getSupportFragmentManager().findFragmentByTag("ActivityLandingActivity.TAG_ACTIVITY_DAYS_LIST_FRAGMENT");
        bundle = ((Bundle) (obj));
        if (obj == null)
        {
            bundle = ActivityDaysListFragment.a(c);
        }
        obj = getSupportFragmentManager().beginTransaction();
        ((FragmentTransaction) (obj)).replace(0x7f110009, bundle, "ActivityLandingActivity.TAG_ACTIVITY_DAYS_LIST_FRAGMENT");
        ((FragmentTransaction) (obj)).commit();
        setTitle(getString(c.e()));
    }
}
