// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.goals.ui;

import android.view.View;

// Referenced classes of package com.fitbit.goals.ui:
//            FoodGoalActivity, CaloriesEatenVsBurnedActivity

class a
    implements android.view.r
{

    final FoodGoalActivity a;

    public void onClick(View view)
    {
        CaloriesEatenVsBurnedActivity.a(a, FoodGoalActivity.a(a));
    }

    edActivity(FoodGoalActivity foodgoalactivity)
    {
        a = foodgoalactivity;
        super();
    }
}
