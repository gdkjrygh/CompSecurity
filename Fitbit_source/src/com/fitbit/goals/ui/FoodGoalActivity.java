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
//            CaloriesEatenVsBurnedActivity

public class FoodGoalActivity extends FitbitActivity
{

    private static final String a = "com.fitbit.goals.ui.FoodGoalActivity.EXTRA_SETUP";
    private ImageView b;
    private boolean c;

    public FoodGoalActivity()
    {
    }

    public static void a(Activity activity, boolean flag)
    {
        Intent intent = new Intent(activity, com/fitbit/goals/ui/FoodGoalActivity);
        intent.putExtra("com.fitbit.goals.ui.FoodGoalActivity.EXTRA_SETUP", flag);
        activity.startActivity(intent);
    }

    static boolean a(FoodGoalActivity foodgoalactivity)
    {
        return foodgoalactivity.c;
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f04001f);
        c = getIntent().getBooleanExtra("com.fitbit.goals.ui.FoodGoalActivity.EXTRA_SETUP", false);
        ((Button)findViewById(0x7f11008e)).setOnClickListener(new android.view.View.OnClickListener() {

            final FoodGoalActivity a;

            public void onClick(View view)
            {
                CaloriesEatenVsBurnedActivity.a(a, FoodGoalActivity.a(a));
            }

            
            {
                a = FoodGoalActivity.this;
                super();
            }
        });
        b = (ImageView)findViewById(0x7f1100f9);
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
