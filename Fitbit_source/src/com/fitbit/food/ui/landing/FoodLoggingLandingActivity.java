// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.food.ui.landing;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import com.fitbit.analytics.core.a;
import com.fitbit.ui.FitbitActivity;

// Referenced classes of package com.fitbit.food.ui.landing:
//            FoodLoggingLandingActivity_, FoodLoggingDaysListFragment

public class FoodLoggingLandingActivity extends FitbitActivity
{

    private static final String a = "com.fitbit.food.ui.landing.FoodLoggingDaysListFragment.TAG";

    public FoodLoggingLandingActivity()
    {
    }

    public static void a(Context context)
    {
        FoodLoggingLandingActivity_.b(context).b();
    }

    public static void a(Context context, int i)
    {
        FoodLoggingLandingActivity_.b(context).a(i).b();
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        bundle = getSupportFragmentManager();
        if ((FoodLoggingDaysListFragment)bundle.findFragmentByTag("com.fitbit.food.ui.landing.FoodLoggingDaysListFragment.TAG") == null)
        {
            FoodLoggingDaysListFragment foodloggingdayslistfragment = FoodLoggingDaysListFragment.g();
            FragmentTransaction fragmenttransaction = bundle.beginTransaction();
            fragmenttransaction.replace(0x7f110415, foodloggingdayslistfragment);
            fragmenttransaction.setTransition(4099);
            fragmenttransaction.commitAllowingStateLoss();
            bundle.executePendingTransactions();
        }
    }

    protected void onResumeFragments()
    {
        super.onResumeFragments();
        com.fitbit.analytics.core.a.a(com.fitbit.analytics.core.Interaction.DEFAULTS.t);
    }
}
