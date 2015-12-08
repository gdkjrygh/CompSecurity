// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.domain;

import com.fitbit.d.b;
import com.fitbit.data.repo.greendao.food.FoodItemDao;
import com.fitbit.data.repo.greendao.mapping.FoodItemMapper;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.fitbit.data.domain:
//            Entity, d, e, FoodLogEntry, 
//            FoodItem, Meal, MealType

public class MealItem extends Entity
    implements b, d
{

    private e entityWithFoodBase;
    private Meal meal;

    public MealItem()
    {
        entityWithFoodBase = new e();
    }

    public FoodLogEntry createFoodLogEntryBasedOnMealItem()
    {
        return new FoodLogEntry(entityWithFoodBase);
    }

    public double getAmount()
    {
        return entityWithFoodBase.getAmount();
    }

    public String getBrand()
    {
        return entityWithFoodBase.getBrand();
    }

    public double getCalories()
    {
        return entityWithFoodBase.getCalories();
    }

    public FoodItem getFoodItem()
    {
        return entityWithFoodBase.getFoodItem();
    }

    public Meal getMeal()
    {
        return meal;
    }

    public MealType getMealType()
    {
        return entityWithFoodBase.getMealType();
    }

    public String getName()
    {
        return entityWithFoodBase.getName();
    }

    public String getUnitName()
    {
        return entityWithFoodBase.getUnitName();
    }

    public String getUnitNamePlural()
    {
        return entityWithFoodBase.getUnitNamePlural();
    }

    public void initFromPublicApiJsonObject(JSONObject jsonobject)
        throws JSONException
    {
        entityWithFoodBase.initGeneralPartFromPublicApiJsonObject(jsonobject);
        entityWithFoodBase.initFoodItemFromPublicApiJsonObject(jsonobject);
        entityWithFoodBase.initFoodDefaultServing();
        setEntityStatus(Entity.EntityStatus.SYNCED);
    }

    public void populateDbEntity(com.fitbit.data.repo.greendao.food.MealItem mealitem, FoodItemDao fooditemdao, boolean flag)
    {
        entityWithFoodBase.populateEntity(mealitem, fooditemdao, flag);
    }

    public void populateFromDbEntity(com.fitbit.data.repo.greendao.food.MealItem mealitem, FoodItemMapper fooditemmapper)
    {
        entityWithFoodBase.populateFromEntity(mealitem, fooditemmapper);
    }

    public void setAmount(double d1)
    {
        entityWithFoodBase.setAmount(d1);
    }

    public void setBrand(String s)
    {
        entityWithFoodBase.setBrand(s);
    }

    public void setCalories(double d1)
    {
        entityWithFoodBase.setCalories(d1);
    }

    public void setFoodItem(FoodItem fooditem)
    {
        entityWithFoodBase.setFoodItem(fooditem);
    }

    public void setMeal(Meal meal1)
    {
        meal = meal1;
    }

    public void setMealType(MealType mealtype)
    {
        entityWithFoodBase.setMealType(mealtype);
    }

    public void setName(String s)
    {
        entityWithFoodBase.setName(s);
    }

    public void setUnitName(String s)
    {
        entityWithFoodBase.setUnitName(s);
    }

    public void setUnitNamePlural(String s)
    {
        entityWithFoodBase.setUnitNamePlural(s);
    }

    public JSONObject toPublicApiJsonObject()
        throws JSONException
    {
        throw new UnsupportedOperationException();
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder(super.toString());
        stringbuilder.append(" mealType: ").append(getMealType());
        stringbuilder.append(" amount: ").append(getAmount());
        stringbuilder.append(" calories: ").append(getCalories());
        StringBuilder stringbuilder1 = stringbuilder.append(" foodId: ");
        long l;
        if (getFoodItem() != null)
        {
            l = getFoodItem().getServerId();
        } else
        {
            l = -1L;
        }
        stringbuilder1.append(l);
        return stringbuilder.toString();
    }
}
