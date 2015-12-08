// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.ui.choose.food;

import android.content.Context;
import com.fitbit.data.domain.FoodRelation;
import com.fitbit.ui.a.b;
import com.fitbit.util.format.f;
import java.util.List;

// Referenced classes of package com.fitbit.ui.choose.food:
//            ChooseRecentFoodFragment

public class addAll extends b
{

    final ChooseRecentFoodFragment a;
    private Context b;

    protected CharSequence a(FoodRelation foodrelation)
    {
        return foodrelation.getName();
    }

    protected volatile CharSequence a(Object obj)
    {
        return a((FoodRelation)obj);
    }

    protected CharSequence b(FoodRelation foodrelation)
    {
        String s = f.a(b, foodrelation.getAmount(), foodrelation.getUnitName(), foodrelation.getUnitNamePlural());
        String s1 = f.b(b, foodrelation.getCalories());
        foodrelation = foodrelation.getBrand();
        if (foodrelation == null || foodrelation.isEmpty())
        {
            return String.format(b.getString(0x7f0805e0), new Object[] {
                s, s1
            });
        } else
        {
            return String.format(b.getString(0x7f080606), new Object[] {
                foodrelation, s, s1
            });
        }
    }

    protected volatile CharSequence b(Object obj)
    {
        return b((FoodRelation)obj);
    }

    public (ChooseRecentFoodFragment chooserecentfoodfragment, Context context, List list)
    {
        a = chooserecentfoodfragment;
        super();
        b = context;
        addAll(list);
    }
}
