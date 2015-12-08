// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.domain;

import com.fitbit.FitBitApplication;
import com.fitbit.d.a;
import com.fitbit.d.b;
import com.fitbit.data.repo.greendao.food.FoodItemDao;
import com.fitbit.data.repo.greendao.mapping.FoodItemMapper;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.fitbit.data.domain:
//            LogEntry, d, e, FoodItem, 
//            MealType

public class FoodLogEntry extends LogEntry
    implements b, d, Cloneable
{

    private e entityWithFoodBase;
    private boolean isQuickCaloriesAdd;

    public FoodLogEntry()
    {
        entityWithFoodBase = new e();
    }

    public FoodLogEntry(e e1)
    {
        entityWithFoodBase = new e();
        entityWithFoodBase = e1;
    }

    public Object clone()
    {
        Object obj;
        try
        {
            obj = super.clone();
        }
        catch (CloneNotSupportedException clonenotsupportedexception)
        {
            return null;
        }
        return obj;
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

    public String getFoodLogName()
    {
        if (getFoodItem() != null)
        {
            return getFoodItem().f();
        }
        if (getName() != null)
        {
            return getName();
        } else
        {
            return FitBitApplication.a().getString(0x7f080470);
        }
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
        JSONObject jsonobject1;
        setServerId(a.b(jsonobject, "logId", -1));
        setLogDate(a.e(jsonobject, "logDate"));
        setQuickCaloriesAdd(a.a(jsonobject, "isQuickCaloriesAdd", false).booleanValue());
        jsonobject1 = null;
        if (!jsonobject.has("loggedFood")) goto _L2; else goto _L1
_L1:
        jsonobject1 = jsonobject.getJSONObject("loggedFood");
_L4:
        if (jsonobject1 != null)
        {
            entityWithFoodBase.initGeneralPartFromPublicApiJsonObject(jsonobject1);
        }
        if (jsonobject.has("food"))
        {
            jsonobject = jsonobject.getJSONObject("food");
            entityWithFoodBase.initFoodItemFromPublicApiJsonObject(jsonobject);
        }
        setEntityStatus(Entity.EntityStatus.SYNCED);
        return;
_L2:
        if (jsonobject.has("loggedCalories"))
        {
            jsonobject1 = jsonobject.getJSONObject("loggedCalories");
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public boolean isQuickCaloriesAdd()
    {
        return isQuickCaloriesAdd;
    }

    public void populateDbEntity(com.fitbit.data.repo.greendao.food.FoodLogEntry foodlogentry, FoodItemDao fooditemdao, boolean flag)
    {
        entityWithFoodBase.populateEntity(foodlogentry, fooditemdao, flag);
    }

    public void populateFromDbEntity(com.fitbit.data.repo.greendao.food.FoodLogEntry foodlogentry, FoodItemMapper fooditemmapper)
    {
        entityWithFoodBase.populateFromEntity(foodlogentry, fooditemmapper);
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

    public void setMealType(MealType mealtype)
    {
        entityWithFoodBase.setMealType(mealtype);
    }

    public void setName(String s)
    {
        entityWithFoodBase.setName(s);
    }

    public void setQuickCaloriesAdd(boolean flag)
    {
        isQuickCaloriesAdd = flag;
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
        stringbuilder.append(" ammout: ").append(getAmount());
        stringbuilder.append(" foodItem: {").append(getFoodItem()).append("}");
        return stringbuilder.toString();
    }
}
