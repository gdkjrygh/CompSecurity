// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.food.ui;

import android.content.Context;
import com.fitbit.data.bl.r;
import com.fitbit.data.domain.FoodItem;
import com.fitbit.util.bf;

// Referenced classes of package com.fitbit.food.ui:
//            CustomFoodActivity

class a extends bf
{

    final CustomFoodActivity a;

    public FoodItem a()
    {
label0:
        {
            CustomFoodActivity.b(a);
            FoodItem fooditem = null;
            if (ates.b == a.l)
            {
                if (-1L == a.m)
                {
                    break label0;
                }
                fooditem = r.a().c(a.m);
            }
            return fooditem;
        }
        return r.a().b(a.n);
    }

    public Object f_()
    {
        return a();
    }

    ates(CustomFoodActivity customfoodactivity, Context context)
    {
        a = customfoodactivity;
        super(context);
    }
}
