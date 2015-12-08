// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.food.ui.logging;

import com.fitbit.data.domain.FoodLogEntry;
import com.fitbit.food.ui.logging.views.ServingSizeView;

// Referenced classes of package com.fitbit.food.ui.logging:
//            LogFoodActivity, d

class a
    implements com.fitbit.food.ui.logging.views.
{

    final LogFoodActivity a;

    public void a(ServingSizeView servingsizeview)
    {
        if (a.n != null)
        {
            a.n.a(servingsizeview.b());
            a.n.a(servingsizeview.c());
            a.n.a(a.z.getFoodItem());
            LogFoodActivity.a(a);
            LogFoodActivity.b(a);
        }
    }

    iew(LogFoodActivity logfoodactivity)
    {
        a = logfoodactivity;
        super();
    }
}
