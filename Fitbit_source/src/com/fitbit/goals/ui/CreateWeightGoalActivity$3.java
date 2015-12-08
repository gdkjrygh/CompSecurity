// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.goals.ui;

import com.fitbit.data.domain.PendingPlan;
import com.fitbit.weight.Weight;

// Referenced classes of package com.fitbit.goals.ui:
//            CreateWeightGoalActivity

class a
    implements com.fitbit.customui.a
{

    final CreateWeightGoalActivity a;

    public void a(Weight weight)
    {
        CreateWeightGoalActivity.c(a).b(weight);
    }

    public volatile void a(Object obj)
    {
        a((Weight)obj);
    }

    (CreateWeightGoalActivity createweightgoalactivity)
    {
        a = createweightgoalactivity;
        super();
    }
}
