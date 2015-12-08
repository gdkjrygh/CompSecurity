// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao.mapping;

import com.fitbit.data.domain.FoodRelation;
import com.fitbit.data.repo.greendao.food.DaoSession;
import com.fitbit.data.repo.greendao.food.FoodItemDao;

// Referenced classes of package com.fitbit.data.repo.greendao.mapping:
//            EntityMapper, FoodItemMapper

public class FoodRelationMapper
    implements EntityMapper
{

    private final FoodItemDao foodItemDao;
    private FoodItemMapper foodItemMapper;

    public FoodRelationMapper(DaoSession daosession)
    {
        foodItemDao = daosession.getFoodItemDao();
        foodItemMapper = new FoodItemMapper(daosession);
    }

    public FoodRelation fromDbEntity(com.fitbit.data.repo.greendao.food.FoodRelation foodrelation)
    {
        if (foodrelation == null)
        {
            return null;
        }
        FoodRelation foodrelation1 = new FoodRelation();
        foodrelation1.setEntityId(foodrelation.getId());
        foodrelation1.setLastEaten(foodrelation.getDateLastEaten());
        foodrelation1.setGroup(com.fitbit.data.domain.FoodRelation.FoodRelationType.getByCode(foodrelation.getGroup().intValue()));
        if (foodrelation.getDisplayIndex() != null)
        {
            foodrelation1.setDisplayIndex(foodrelation.getDisplayIndex().intValue());
        }
        foodrelation1.populateFromDbEntity(foodrelation, foodItemMapper);
        return foodrelation1;
    }

    public volatile Object fromDbEntity(Object obj)
    {
        return fromDbEntity((com.fitbit.data.repo.greendao.food.FoodRelation)obj);
    }

    public com.fitbit.data.repo.greendao.food.FoodRelation toDbEntity(FoodRelation foodrelation)
    {
        return toDbEntity(foodrelation, new com.fitbit.data.repo.greendao.food.FoodRelation());
    }

    public com.fitbit.data.repo.greendao.food.FoodRelation toDbEntity(FoodRelation foodrelation, com.fitbit.data.repo.greendao.food.FoodRelation foodrelation1)
    {
        if (foodrelation == null)
        {
            return null;
        }
        com.fitbit.data.repo.greendao.food.FoodRelation foodrelation2 = foodrelation1;
        if (foodrelation1 == null)
        {
            foodrelation2 = new com.fitbit.data.repo.greendao.food.FoodRelation();
        }
        foodrelation2.setId(foodrelation.getEntityId());
        foodrelation2.setDateLastEaten(foodrelation.getLastEaten());
        foodrelation2.setGroup(Integer.valueOf(foodrelation.getGroup().getCode()));
        foodrelation2.setDisplayIndex(Integer.valueOf(foodrelation.getDisplayIndex()));
        foodrelation.populateDbEntity(foodrelation2, foodItemDao, true);
        return foodrelation2;
    }

    public volatile Object toDbEntity(Object obj)
    {
        return toDbEntity((FoodRelation)obj);
    }

    public volatile Object toDbEntity(Object obj, Object obj1)
    {
        return toDbEntity((FoodRelation)obj, (com.fitbit.data.repo.greendao.food.FoodRelation)obj1);
    }
}
