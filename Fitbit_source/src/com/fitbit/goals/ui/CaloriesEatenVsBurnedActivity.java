// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.goals.ui;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import com.fitbit.ui.FitbitActivity;

// Referenced classes of package com.fitbit.goals.ui:
//            PlanSummaryActivity

public class CaloriesEatenVsBurnedActivity extends FitbitActivity
{

    private static final String a = "com.fitbit.goals.ui.CaloriesEeatenVsBurnedActivity.EXTRA_SETUP";
    private ImageView b;
    private boolean c;

    public CaloriesEatenVsBurnedActivity()
    {
    }

    public static void a(Activity activity, boolean flag)
    {
        Intent intent = new Intent(activity, com/fitbit/goals/ui/CaloriesEatenVsBurnedActivity);
        intent.putExtra("com.fitbit.goals.ui.CaloriesEeatenVsBurnedActivity.EXTRA_SETUP", flag);
        activity.startActivity(intent);
    }

    static boolean a(CaloriesEatenVsBurnedActivity calorieseatenvsburnedactivity)
    {
        return calorieseatenvsburnedactivity.c;
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f04000c);
        c = getIntent().getBooleanExtra("com.fitbit.goals.ui.CaloriesEeatenVsBurnedActivity.EXTRA_SETUP", false);
        b = (ImageView)findViewById(0x7f110099);
        ((Button)findViewById(0x7f11008e)).setOnClickListener(new android.view.View.OnClickListener() {

            final CaloriesEatenVsBurnedActivity a;

            public void onClick(View view)
            {
                PlanSummaryActivity.a(a, CaloriesEatenVsBurnedActivity.a(a));
            }

            
            {
                a = CaloriesEatenVsBurnedActivity.this;
                super();
            }
        });
    }

    public void onWindowFocusChanged(boolean flag)
    {
        super.onWindowFocusChanged(flag);
        if (flag)
        {
            ((AnimationDrawable)b.getDrawable()).start();
        }
    }
}
