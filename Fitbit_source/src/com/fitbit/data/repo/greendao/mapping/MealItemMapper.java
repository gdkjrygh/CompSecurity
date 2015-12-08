// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao.mapping;

import com.fitbit.data.domain.Meal;
import com.fitbit.data.domain.MealItem;
import com.fitbit.data.repo.greendao.food.DaoSession;
import com.fitbit.data.repo.greendao.food.FoodItemDao;
import com.fitbit.util.w;

// Referenced classes of package com.fitbit.data.repo.greendao.mapping:
//            EntityMapper, FoodItemMapper, MappingUtils

public class MealItemMapper
    implements EntityMapper
{

    private final FoodItemDao foodItemDao;
    private final FoodItemMapper foodItemMapper;

    public MealItemMapper(DaoSession daosession)
    {
        foodItemMapper = new FoodItemMapper(daosession);
        foodItemDao = daosession.getFoodItemDao();
    }

    public MealItem fromDbEntity(com.fitbit.data.repo.greendao.food.MealItem mealitem)
    {
        if (mealitem == null)
        {
            return null;
        } else
        {
            MealItem mealitem1 = new MealItem();
            mealitem1.setEntityId(mealitem.getId());
            mealitem1.setEntityStatus((com.fitbit.data.domain.Entity.EntityStatus)w.a(mealitem.getEntityStatus().intValue(), com/fitbit/data/domain/Entity$EntityStatus));
            mealitem1.setTimeCreated(mealitem.getTimeCreated());
            mealitem1.setTimeUpdated(mealitem.getTimeUpdated());
            mealitem1.setUuid(MappingUtils.uuidFromString(mealitem.getUuid()));
            mealitem1.populateFromDbEntity(mealitem, foodItemMapper);
            return mealitem1;
        }
    }

    public volatile Object fromDbEntity(Object obj)
    {
        return fromDbEntity((com.fitbit.data.repo.greendao.food.MealItem)obj);
    }

    public com.fitbit.data.repo.greendao.food.MealItem toDbEntity(MealItem mealitem)
    {
        return toDbEntity(mealitem, new com.fitbit.data.repo.greendao.food.MealItem());
    }

    public com.fitbit.data.repo.greendao.food.MealItem toDbEntity(MealItem mealitem, com.fitbit.data.repo.greendao.food.MealItem mealitem1)
    {
        if (mealitem == null)
        {
            return null;
        }
        com.fitbit.data.repo.greendao.food.MealItem mealitem2 = mealitem1;
        if (mealitem1 == null)
        {
            mealitem2 = new com.fitbit.data.repo.greendao.food.MealItem();
        }
        if (mealitem2.getId() == null)
        {
            mealitem2.setId(mealitem.getEntityId());
        }
        mealitem2.setEntityStatus(Integer.valueOf(mealitem.getEntityStatus().getCode()));
        mealitem2.setTimeCreated(mealitem.getTimeCreated());
        mealitem2.setTimeUpdated(mealitem.getTimeUpdated());
        mealitem2.setUuid(MappingUtils.uuidToString(mealitem.getUuid()));
        mealitem.populateDbEntity(mealitem2, foodItemDao, true);
        MappingUtils.assertEntityHasId(mealitem.getMeal());
        mealitem2.setMealId(mealitem.getMeal().getEntityId());
        return mealitem2;
    }

    public volatile Object toDbEntity(Object obj)
    {
        return toDbEntity((MealItem)obj);
    }

    public volatile Object toDbEntity(Object obj, Object obj1)
    {
        return toDbEntity((MealItem)obj, (com.fitbit.data.repo.greendao.food.MealItem)obj1);
    }
}
