// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.goals.ui;

import android.view.View;
import com.fitbit.data.bl.gd;
import com.fitbit.data.bl.t;
import com.fitbit.data.domain.PendingPlan;
import com.fitbit.weight.Weight;

// Referenced classes of package com.fitbit.goals.ui:
//            CreateWeightGoalActivity, SelectPlanIntensityActivity, FoodGoalActivity

class a
    implements android.view.vity._cls1
{

    final CreateWeightGoalActivity a;

    public void onClick(View view)
    {
label0:
        {
            if (CreateWeightGoalActivity.a(a))
            {
                view = gd.a().c().a(CreateWeightGoalActivity.b(a)).c();
                t.a().a(CreateWeightGoalActivity.c(a), view, CreateWeightGoalActivity.d(a));
                if (!CreateWeightGoalActivity.c(a).f())
                {
                    break label0;
                }
                SelectPlanIntensityActivity.a(a, CreateWeightGoalActivity.e(a));
            }
            return;
        }
        FoodGoalActivity.a(a, CreateWeightGoalActivity.e(a));
    }

    (CreateWeightGoalActivity createweightgoalactivity)
    {
        a = createweightgoalactivity;
        super();
    }
}
