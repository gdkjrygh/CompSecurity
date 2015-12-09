// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.goals.ui;

import android.support.v4.app.FragmentActivity;
import com.fitbit.home.ui.HomeActivity;
import com.fitbit.home.ui.g;
import com.fitbit.mixpanel.f;

// Referenced classes of package com.fitbit.goals.ui:
//            PlanSummaryActivity

class a extends g
{

    final PlanSummaryActivity a;

    public void a()
    {
        super.a();
        f.c("FoodGoal: Created");
        HomeActivity.c(a);
    }

    (PlanSummaryActivity plansummaryactivity, FragmentActivity fragmentactivity, int i)
    {
        a = plansummaryactivity;
        super(fragmentactivity, i);
    }
}
