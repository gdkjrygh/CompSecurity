// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.food.ui;

import com.fitbit.data.domain.Brand;
import com.fitbit.data.domain.FoodItem;
import com.fitbit.data.domain.h;
import com.fitbit.food.NutritionalValue;
import com.fitbit.util.ab;
import com.fitbit.util.bh;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.fitbit.food.ui:
//            CustomFoodActivity

protected static class servingSize
    implements Serializable
{

    private static final double a = 999999D;
    private static final long b = 6000L;
    private static final long serialVersionUID = 1L;
    List additionalValues;
    String brand;
    String name;
    double servingSize;
    String servingUnit;
    boolean showMoreDetails;
    Map usedNutritionalValues;

    Map a()
    {
        HashMap hashmap = new HashMap();
        NutritionalValue nutritionalvalue;
        for (Iterator iterator = usedNutritionalValues.keySet().iterator(); iterator.hasNext(); hashmap.put(nutritionalvalue.c(), usedNutritionalValues.get(nutritionalvalue)))
        {
            nutritionalvalue = (NutritionalValue)iterator.next();
        }

        return hashmap;
    }

    int b()
    {
        name = bh.f(name);
        if (name.isEmpty() || name.trim().isEmpty())
        {
            return 0x7f08012b;
        }
        if (((Double)usedNutritionalValues.get(NutritionalValue.a)).doubleValue() == 0.0D)
        {
            return 0x7f08012b;
        }
        if (Math.abs(servingSize) < 0.0001D || Math.abs(servingSize) > 999999D)
        {
            return 0x7f0803e4;
        }
        return ((Double)usedNutritionalValues.get(NutritionalValue.a)).doubleValue() <= 6000D ? 0 : 0x7f080124;
    }

    (FoodItem fooditem, String s)
    {
        usedNutritionalValues = new HashMap();
        additionalValues = new ArrayList();
        showMoreDetails = false;
        usedNutritionalValues.put(NutritionalValue.a, Double.valueOf(0.0D));
        usedNutritionalValues.put(NutritionalValue.b, Double.valueOf(0.0D));
        additionalValues.add(NutritionalValue.c);
        additionalValues.add(NutritionalValue.d);
        additionalValues.add(NutritionalValue.e);
        additionalValues.add(NutritionalValue.f);
        additionalValues.add(NutritionalValue.g);
        additionalValues.add(NutritionalValue.h);
        additionalValues.add(NutritionalValue.i);
        additionalValues.add(NutritionalValue.j);
        additionalValues.add(NutritionalValue.k);
        additionalValues.add(NutritionalValue.l);
        NutritionalValue nutritionalvalue1;
        for (Iterator iterator = additionalValues.iterator(); iterator.hasNext(); usedNutritionalValues.put(nutritionalvalue1, Double.valueOf(0.0D)))
        {
            nutritionalvalue1 = (NutritionalValue)iterator.next();
        }

        if (fooditem != null)
        {
            name = fooditem.f();
            brand = "";
            s = fooditem.a();
            if (s != null)
            {
                brand = s.a();
            }
            s = ab.a(fooditem);
            servingSize = ab.a(s);
            servingUnit = s.a();
            fooditem = fooditem.d();
            s = usedNutritionalValues.keySet().iterator();
            do
            {
                if (!s.hasNext())
                {
                    break;
                }
                NutritionalValue nutritionalvalue = (NutritionalValue)s.next();
                Double double1 = (Double)fooditem.get(nutritionalvalue.c());
                if (double1 != null)
                {
                    usedNutritionalValues.put(nutritionalvalue, double1);
                }
            } while (true);
        } else
        {
            if (s == null || s.isEmpty())
            {
                s = "";
            }
            name = s;
            brand = "";
            servingSize = 1.0D;
        }
    }
}
