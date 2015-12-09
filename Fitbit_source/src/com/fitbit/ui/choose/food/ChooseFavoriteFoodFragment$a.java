// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.ui.choose.food;

import android.content.Context;
import com.fitbit.data.domain.Brand;
import com.fitbit.data.domain.FoodItem;
import com.fitbit.ui.a.b;
import com.fitbit.util.ab;
import com.fitbit.util.format.f;
import java.util.List;

// Referenced classes of package com.fitbit.ui.choose.food:
//            ChooseFavoriteFoodFragment

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

    protected CharSequence b(FoodItem fooditem)
    {
        String s1 = ab.a(a, fooditem);
        String s = f.b(a, fooditem.c().doubleValue());
        Object obj;
        boolean flag;
        boolean flag1;
        if (fooditem.a() != null)
        {
            obj = fooditem.a().a();
        } else
        {
            obj = "";
        }
        if (s1 != null && !s1.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (obj != null && !((String) (obj)).isEmpty())
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        fooditem = s;
        if (flag1)
        {
            fooditem = String.format(a.getString(0x7f0805e0), new Object[] {
                obj, s
            });
        }
        obj = fooditem;
        if (flag)
        {
            obj = String.format(a.getString(0x7f0805e0), new Object[] {
                s1, fooditem
            });
        }
        return ((CharSequence) (obj));
    }

    protected volatile CharSequence b(Object obj)
    {
        return b((FoodItem)obj);
    }

    public (Context context, List list)
    {
        addAll(list);
        a = context;
    }
}
