// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.food.ui.logging;

import android.content.Context;
import com.fitbit.data.bl.dg;
import com.fitbit.data.bl.exceptions.ServerCommunicationException;
import com.fitbit.data.bl.r;
import com.fitbit.data.domain.FoodItem;
import com.fitbit.data.domain.Meal;
import com.fitbit.data.domain.MealItem;
import com.fitbit.util.bf;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;

// Referenced classes of package com.fitbit.food.ui.logging:
//            LogMealActivity

class a extends bf
{

    final LogMealActivity a;

    protected a a()
    {
        a a1;
        Meal meal;
        a1 = new <init>();
        meal = r.a().f(a.j.longValue());
        if (meal == null)
        {
            break MISSING_BLOCK_LABEL_169;
        }
        Object obj;
        FoodItem fooditem;
        Iterator iterator;
        MealItem mealitem;
        long l;
        try
        {
            obj = meal.c();
        }
        catch (ServerCommunicationException servercommunicationexception)
        {
            a1.a(-3);
            return a1;
        }
        catch (JSONException jsonexception)
        {
            a1.a(-3);
            return a1;
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_156;
        }
        iterator = ((List) (obj)).iterator();
_L2:
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_156;
        }
        mealitem = (MealItem)iterator.next();
        obj = mealitem.getFoodItem();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_137;
        }
        l = ((FoodItem) (obj)).getServerId();
        if (((FoodItem) (obj)).n()) goto _L2; else goto _L1
_L1:
        fooditem = dg.d().a(l, null);
        obj = fooditem;
        if (fooditem != null)
        {
            break MISSING_BLOCK_LABEL_119;
        }
        obj = r.a().c(l);
        mealitem.setFoodItem(((FoodItem) (obj)));
          goto _L2
        iterator.remove();
          goto _L2
        a1.a = meal;
        a1.a(-1);
        return a1;
        a1.a(-2);
        return a1;
    }

    protected Object f_()
    {
        return a();
    }

    tionException(LogMealActivity logmealactivity, Context context)
    {
        a = logmealactivity;
        super(context);
    }
}
