// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.ui.choose.food;

import android.content.Context;
import com.fitbit.data.domain.Entity;
import com.fitbit.data.domain.FoodItem;
import com.fitbit.data.domain.Meal;

// Referenced classes of package com.fitbit.ui.choose.food:
//            ChooseCustomFragment

public static class a
{

    private Entity a;

    public Entity a()
    {
        return a;
    }

    public String a(Context context)
    {
        if (a instanceof Meal)
        {
            return ChooseCustomFragment.a((Meal)a);
        }
        if (a instanceof FoodItem)
        {
            return ChooseCustomFragment.a((FoodItem)a);
        } else
        {
            return "";
        }
    }

    public String b(Context context)
    {
        if (a instanceof Meal)
        {
            return ChooseCustomFragment.a(context, (Meal)a);
        }
        if (a instanceof FoodItem)
        {
            return ChooseCustomFragment.a(context, (FoodItem)a);
        } else
        {
            return "";
        }
    }

    public boolean b()
    {
        return false;
    }

    public (Entity entity)
    {
        a = entity;
    }
}
