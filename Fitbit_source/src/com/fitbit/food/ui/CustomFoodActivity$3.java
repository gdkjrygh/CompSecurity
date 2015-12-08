// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.food.ui;

import android.app.Activity;
import android.content.Intent;
import com.fitbit.data.bl.r;
import com.fitbit.data.domain.FoodItem;

// Referenced classes of package com.fitbit.food.ui:
//            CustomFoodActivity

class a extends com.fitbit.util.._cls3
{

    final FoodItem a;
    final CustomFoodActivity b;

    public void a(Activity activity)
    {
        r.a().a(a, activity);
    }

    public void a(Object obj)
    {
        b((Activity)obj);
    }

    public void b(Activity activity)
    {
        if (ates.a.equals(b.l))
        {
            Intent intent = new Intent();
            Long long1 = a.getEntityId();
            activity = long1;
            if (long1 == null)
            {
                activity = Long.valueOf(-1L);
            }
            intent.putExtra("com.fitbit.food.ui.CustomFoodActivity.EXTRA_CREATED_FOOD_ENTITY_ID", activity);
            b.setResult(-1, intent);
        }
        b.finish();
    }

    public void b(Object obj)
    {
        a((Activity)obj);
    }

    ates(CustomFoodActivity customfoodactivity, Activity activity, FoodItem fooditem)
    {
        b = customfoodactivity;
        a = fooditem;
        super(activity);
    }
}
