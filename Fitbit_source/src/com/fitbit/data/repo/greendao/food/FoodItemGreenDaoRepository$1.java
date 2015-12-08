// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao.food;

import com.fitbit.data.domain.FoodItem;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.fitbit.data.repo.greendao.food:
//            FoodItemGreenDaoRepository

class val.entities
    implements Runnable
{

    final FoodItemGreenDaoRepository this$0;
    final List val$entities;

    public void run()
    {
        FoodItem fooditem;
        for (Iterator iterator = val$entities.iterator(); iterator.hasNext(); add(fooditem))
        {
            fooditem = (FoodItem)iterator.next();
        }

    }

    ()
    {
        this$0 = final_fooditemgreendaorepository;
        val$entities = List.this;
        super();
    }
}
