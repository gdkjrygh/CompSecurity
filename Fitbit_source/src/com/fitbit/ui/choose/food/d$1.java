// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.ui.choose.food;

import com.fitbit.data.domain.FoodItem;
import java.util.Comparator;

// Referenced classes of package com.fitbit.ui.choose.food:
//            d

class a
    implements Comparator
{

    final d a;

    public int a(FoodItem fooditem, FoodItem fooditem1)
    {
        return fooditem.f().compareTo(fooditem1.f());
    }

    public int compare(Object obj, Object obj1)
    {
        return a((FoodItem)obj, (FoodItem)obj1);
    }

    m(d d1)
    {
        a = d1;
        super();
    }
}
