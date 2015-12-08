// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.food.ui.daydetails;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.widget.ProgressBar;
import com.fitbit.ui.FitbitActivity;
import java.util.Date;

// Referenced classes of package com.fitbit.food.ui.daydetails:
//            FoodLoggingDayDetailsActivity_, FoodLoggingDayDetailsFragment

public class FoodLoggingDayDetailsActivity extends FitbitActivity
{

    private static final String c = "com.fitbit.food.ui.FoodLoggingDayDetailsFragment.TAG";
    protected ProgressBar a;
    protected Date b;

    public FoodLoggingDayDetailsActivity()
    {
    }

    public static void a(Context context, Date date)
    {
        FoodLoggingDayDetailsActivity_.a(context).a(date).b();
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        bundle = getSupportFragmentManager();
        if ((FoodLoggingDayDetailsFragment)bundle.findFragmentByTag("com.fitbit.food.ui.FoodLoggingDayDetailsFragment.TAG") == null)
        {
            FoodLoggingDayDetailsFragment foodloggingdaydetailsfragment = FoodLoggingDayDetailsFragment.a(b);
            FragmentTransaction fragmenttransaction = bundle.beginTransaction();
            fragmenttransaction.replace(0x7f110415, foodloggingdaydetailsfragment);
            fragmenttransaction.setTransition(4099);
            fragmenttransaction.commitAllowingStateLoss();
            bundle.executePendingTransactions();
        }
    }
}
