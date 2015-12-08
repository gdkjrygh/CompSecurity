// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.domain;

import com.fitbit.d.a;
import com.fitbit.d.b;
import com.fitbit.data.repo.greendao.food.FoodItemDao;
import com.fitbit.data.repo.greendao.mapping.FoodItemMapper;
import java.util.Date;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.fitbit.data.domain:
//            Entity, d, e, FoodItem, 
//            MealType, a

public class FoodRelation extends Entity
    implements b, d
{
    public static final class FoodRelationType extends Enum
        implements com.fitbit.data.domain.a
    {

        private static final FoodRelationType $VALUES[];
        public static final FoodRelationType FREQUENT;
        public static final FoodRelationType RECENT;
        public static final FoodRelationType UNKNOWN;
        private final int code;

        public static FoodRelationType getByCode(int i)
        {
            FoodRelationType afoodrelationtype[] = values();
            int k = afoodrelationtype.length;
            for (int j = 0; j < k; j++)
            {
                FoodRelationType foodrelationtype = afoodrelationtype[j];
                if (i == foodrelationtype.code)
                {
                    return foodrelationtype;
                }
            }

            return null;
        }

        public static FoodRelationType valueOf(String s)
        {
            return (FoodRelationType)Enum.valueOf(com/fitbit/data/domain/FoodRelation$FoodRelationType, s);
        }

        public static FoodRelationType[] values()
        {
            return (FoodRelationType[])$VALUES.clone();
        }

        public int getCode()
        {
            return code;
        }

        static 
        {
            UNKNOWN = new FoodRelationType("UNKNOWN", 0, 0);
            RECENT = new FoodRelationType("RECENT", 1, 1);
            FREQUENT = new FoodRelationType("FREQUENT", 2, 2);
            $VALUES = (new FoodRelationType[] {
                UNKNOWN, RECENT, FREQUENT
            });
        }

        private FoodRelationType(String s, int i, int j)
        {
            super(s, i);
            code = j;
        }
    }


    private int displayIndex;
    private e entityWithFoodBase;
    private FoodRelationType group;
    private Date lastEaten;

    public FoodRelation()
    {
        entityWithFoodBase = new e();
        group = FoodRelationType.UNKNOWN;
    }

    public FoodRelation(FoodItem fooditem)
    {
        entityWithFoodBase = new e();
        group = FoodRelationType.UNKNOWN;
        setFoodItem(fooditem);
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

    public int getDisplayIndex()
    {
        return displayIndex;
    }

    public FoodItem getFoodItem()
    {
        return entityWithFoodBase.getFoodItem();
    }

    public FoodRelationType getGroup()
    {
        return group;
    }

    public Date getLastEaten()
    {
        return lastEaten;
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
        setLastEaten(a.e(jsonobject, "dateLastEaten"));
        entityWithFoodBase.initGeneralPartFromPublicApiJsonObject(jsonobject);
        entityWithFoodBase.initFoodItemFromPublicApiJsonObject(jsonobject);
        entityWithFoodBase.initFoodDefaultServing();
        setEntityStatus(Entity.EntityStatus.SYNCED);
    }

    public void populateDbEntity(com.fitbit.data.repo.greendao.food.FoodRelation foodrelation, FoodItemDao fooditemdao, boolean flag)
    {
        entityWithFoodBase.populateEntity(foodrelation, fooditemdao, flag);
    }

    public void populateFromDbEntity(com.fitbit.data.repo.greendao.food.FoodRelation foodrelation, FoodItemMapper fooditemmapper)
    {
        entityWithFoodBase.populateFromEntity(foodrelation, fooditemmapper);
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

    public void setDisplayIndex(int i)
    {
        displayIndex = i;
    }

    public void setFoodItem(FoodItem fooditem)
    {
        entityWithFoodBase.setFoodItem(fooditem);
    }

    public void setGroup(FoodRelationType foodrelationtype)
    {
        group = foodrelationtype;
    }

    public void setLastEaten(Date date)
    {
        lastEaten = date;
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
        stringbuilder.append(" foodItem: {").append(getFoodItem()).append("}");
        return stringbuilder.toString();
    }
}
