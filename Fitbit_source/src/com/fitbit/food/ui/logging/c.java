// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.food.ui.logging;

import android.content.Context;
import com.fitbit.data.bl.dg;
import com.fitbit.data.bl.exceptions.ServerCommunicationException;
import com.fitbit.data.bl.r;
import com.fitbit.data.domain.Brand;
import com.fitbit.data.domain.FoodItem;
import com.fitbit.data.domain.FoodLogEntry;
import com.fitbit.data.domain.MealType;
import com.fitbit.data.domain.h;
import com.fitbit.util.ab;
import java.util.Date;
import org.json.JSONException;

// Referenced classes of package com.fitbit.food.ui.logging:
//            b

public class c extends b
{

    private final long c;
    private final long d;

    public c(Context context, long l, long l1, long l2, 
            LogFoodBaseActivity.Mode mode)
    {
        super(context, l, mode);
        c = l1;
        d = l2;
    }

    protected b.a e()
    {
        Object obj;
        b.a a;
        obj = null;
        a = super.e();
        if (a.b() != -1 || a.a == null)
        {
            break MISSING_BLOCK_LABEL_468;
        }
        static class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[LogFoodBaseActivity.Mode.values().length];
                try
                {
                    a[LogFoodBaseActivity.Mode.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[LogFoodBaseActivity.Mode.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1.a[b.ordinal()];
        JVM INSTR tableswitch 1 2: default 468
    //                   1 56
    //                   2 422;
           goto _L1 _L2 _L3
_L1:
        break MISSING_BLOCK_LABEL_468;
_L2:
        long l = c;
        if (-1L == l) goto _L5; else goto _L4
_L4:
        Object obj1 = dg.d().a(c, null);
        obj = obj1;
        if (obj1 != null)
        {
            break MISSING_BLOCK_LABEL_100;
        }
        obj = r.a().c(c);
_L9:
        if (obj == null) goto _L7; else goto _L6
_L6:
        if (((FoodItem) (obj)).n()) goto _L8; else goto _L7
_L7:
        a.a(-3);
        return a;
        obj;
        Object obj2;
        try
        {
            obj = r.a().c(c);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            a.a(-3);
            return a;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            a.a(-3);
            return a;
        }
          goto _L9
        obj;
        obj = r.a().c(c);
          goto _L9
_L5:
        if (-1L == d) goto _L9; else goto _L10
_L10:
        obj = r.a().b(d);
          goto _L9
_L8:
        obj1 = a.a;
        if (obj == null) goto _L12; else goto _L11
_L11:
        obj2 = r.a().g(((FoodItem) (obj)).getEntityId().longValue());
        if (obj2 == null) goto _L14; else goto _L13
_L13:
        ((FoodLogEntry) (obj1)).setName(((FoodLogEntry) (obj2)).getName());
        ((FoodLogEntry) (obj1)).setBrand(((FoodLogEntry) (obj2)).getBrand());
        ((FoodLogEntry) (obj1)).setAmount(((FoodLogEntry) (obj2)).getAmount());
        ((FoodLogEntry) (obj1)).setMealType(((FoodLogEntry) (obj2)).getMealType());
        ((FoodLogEntry) (obj1)).setQuickCaloriesAdd(((FoodLogEntry) (obj2)).isQuickCaloriesAdd());
        ((FoodLogEntry) (obj1)).setCalories(((FoodLogEntry) (obj2)).getCalories());
        ((FoodLogEntry) (obj1)).setUnitName(((FoodLogEntry) (obj2)).getUnitName());
        ((FoodLogEntry) (obj1)).setUnitNamePlural(((FoodLogEntry) (obj2)).getUnitNamePlural());
_L19:
        ((FoodLogEntry) (obj1)).setFoodItem(((FoodItem) (obj)));
        return a;
_L14:
        Brand brand;
        obj2 = ab.a(((FoodItem) (obj)));
        ((FoodLogEntry) (obj1)).setName(((FoodItem) (obj)).f());
        brand = ((FoodItem) (obj)).a();
        if (brand == null) goto _L16; else goto _L15
_L15:
        ((FoodLogEntry) (obj1)).setBrand(brand.a());
_L16:
        ((FoodLogEntry) (obj1)).setUnitName(((h) (obj2)).a());
        ((FoodLogEntry) (obj1)).setUnitNamePlural(((h) (obj2)).b());
        ((FoodLogEntry) (obj1)).setAmount(ab.a(((h) (obj2))));
        ((FoodLogEntry) (obj1)).setCalories(((FoodItem) (obj)).c().doubleValue());
        obj2 = r.a().a(new Date());
        if (obj2 == null) goto _L18; else goto _L17
_L17:
        ((FoodLogEntry) (obj1)).setMealType(((FoodLogEntry) (obj2)).getMealType());
          goto _L19
_L18:
        ((FoodLogEntry) (obj1)).setMealType(MealType.BREAKFAST);
          goto _L19
_L12:
        a.a(-2);
        return a;
_L3:
        obj = a.a;
        obj1 = ((FoodLogEntry) (obj)).getFoodItem();
        if (obj1 == null) goto _L21; else goto _L20
_L20:
        if (((FoodItem) (obj1)).n())
        {
            break MISSING_BLOCK_LABEL_468;
        }
        ((FoodLogEntry) (obj)).setFoodItem(dg.d().a(((FoodItem) (obj1)).getServerId(), null));
        return a;
_L21:
        a.a(-2);
        return a;
        return a;
    }

    protected Object f_()
    {
        return e();
    }

    protected b.a g()
    {
        d();
        return (b.a)super.onLoadInBackground();
    }

    protected Object onLoadInBackground()
    {
        return g();
    }
}
