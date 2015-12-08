// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.ui.choose.food;

import android.content.Context;
import com.fitbit.data.bl.r;
import com.fitbit.data.domain.Brand;
import com.fitbit.data.domain.FoodItem;
import com.fitbit.ui.a.b;
import com.fitbit.util.ab;
import com.fitbit.util.format.f;

// Referenced classes of package com.fitbit.ui.choose.food:
//            ChooseFoodActivity

private static class a extends b
{

    private Context a;

    protected CharSequence a(FoodItem fooditem)
    {
        return fooditem.f();
    }

    protected volatile CharSequence a(Object obj)
    {
        return a((FoodItem)obj);
    }

    protected CharSequence b(Object obj)
    {
        return c((FoodItem)obj);
    }

    protected boolean b(FoodItem fooditem)
    {
        return r.a().b(fooditem);
    }

    protected CharSequence c(FoodItem fooditem)
    {
        String s = ab.a(a, fooditem);
        int i = fooditem.c().intValue();
        String s1 = f.a(a, i);
        fooditem = fooditem.a().a();
        if (fooditem == null || fooditem.isEmpty())
        {
            return String.format(a.getString(0x7f0805e0), new Object[] {
                s, s1
            });
        } else
        {
            return String.format(a.getString(0x7f080606), new Object[] {
                fooditem, s, s1
            });
        }
    }

    protected boolean c(Object obj)
    {
        return b((FoodItem)obj);
    }

    public (Context context)
    {
        a = context;
    }
}
