// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.food.ui.logging;

import com.fitbit.food.ui.logging.views.EstimateCaloriesView;

// Referenced classes of package com.fitbit.food.ui.logging:
//            LogFoodActivity, d

class a
    implements com.fitbit.food.ui.logging.views.ew.a
{

    final LogFoodActivity a;

    public void a(EstimateCaloriesView estimatecaloriesview)
    {
        if (a.n != null)
        {
            a.n.b(estimatecaloriesview.c());
            a.n.e();
            LogFoodActivity.a(a);
        }
    }

    riesView(LogFoodActivity logfoodactivity)
    {
        a = logfoodactivity;
        super();
    }
}
