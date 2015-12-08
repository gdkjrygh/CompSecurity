// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.goals.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.fitbit.ui.FitbitActivity;

// Referenced classes of package com.fitbit.goals.ui:
//            FoodGoalActivity

public class SelectPlanIntensityActivity extends FitbitActivity
    implements android.view.View.OnClickListener
{

    private static final String a = "com.fitbit.goals.ui.SelectPlanIntensityActivity.EXTRA_SETUP";
    private boolean b;

    public SelectPlanIntensityActivity()
    {
    }

    public static void a(Activity activity, boolean flag)
    {
        Intent intent = new Intent(activity, com/fitbit/goals/ui/SelectPlanIntensityActivity);
        intent.putExtra("com.fitbit.goals.ui.SelectPlanIntensityActivity.EXTRA_SETUP", flag);
        activity.startActivity(intent);
    }

    public void onClick(View view)
    {
        FoodGoalActivity.a(this, b);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f040045);
        b = getIntent().getBooleanExtra("com.fitbit.goals.ui.SelectPlanIntensityActivity.EXTRA_SETUP", false);
        findViewById(0x7f11008e).setOnClickListener(this);
    }
}
