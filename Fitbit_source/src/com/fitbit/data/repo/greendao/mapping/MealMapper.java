// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao.mapping;

import com.fitbit.data.domain.Meal;
import com.fitbit.data.repo.greendao.food.DaoSession;
import com.fitbit.data.repo.greendao.food.MealItem;
import com.fitbit.util.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.fitbit.data.repo.greendao.mapping:
//            EntityMapper, MealItemMapper, MappingUtils

public class MealMapper
    implements EntityMapper
{

    private final MealItemMapper mealItemMapper;

    public MealMapper(DaoSession daosession)
    {
        mealItemMapper = new MealItemMapper(daosession);
    }

    public Meal fromDbEntity(com.fitbit.data.repo.greendao.food.Meal meal)
    {
        if (meal == null)
        {
            return null;
        }
        Meal meal1 = new Meal();
        meal1.b(meal.getDescription());
        meal1.setEntityId(meal.getId());
        meal1.setEntityStatus((com.fitbit.data.domain.Entity.EntityStatus)w.a(meal.getEntityStatus().intValue(), com/fitbit/data/domain/Entity$EntityStatus));
        ArrayList arraylist = new ArrayList();
        Object obj;
        for (Iterator iterator = meal.getMealItemList().iterator(); iterator.hasNext(); arraylist.add(obj))
        {
            obj = (MealItem)iterator.next();
            obj = mealItemMapper.fromDbEntity(((MealItem) (obj)));
            ((com.fitbit.data.domain.MealItem) (obj)).setMeal(meal1);
        }

        meal1.a(arraylist);
        meal1.a(meal.getName());
        meal1.setServerId(meal.getServerId().longValue());
        meal1.setTimeCreated(meal.getTimeCreated());
        meal1.setTimeUpdated(meal.getTimeUpdated());
        meal1.setUuid(MappingUtils.uuidFromString(meal.getUuid()));
        return meal1;
    }

    public volatile Object fromDbEntity(Object obj)
    {
        return fromDbEntity((com.fitbit.data.repo.greendao.food.Meal)obj);
    }

    public com.fitbit.data.repo.greendao.food.Meal toDbEntity(Meal meal)
    {
        return toDbEntity(meal, new com.fitbit.data.repo.greendao.food.Meal());
    }

    public com.fitbit.data.repo.greendao.food.Meal toDbEntity(Meal meal, com.fitbit.data.repo.greendao.food.Meal meal1)
    {
        if (meal == null)
        {
            return null;
        }
        com.fitbit.data.repo.greendao.food.Meal meal2 = meal1;
        if (meal1 == null)
        {
            meal2 = new com.fitbit.data.repo.greendao.food.Meal();
        }
        if (meal2.getId() == null)
        {
            meal2.setId(meal.getEntityId());
        }
        meal2.setDescription(meal.b());
        meal2.setEntityStatus(Integer.valueOf(meal.getEntityStatus().getCode()));
        meal2.setName(meal.a());
        meal2.setServerId(Long.valueOf(meal.getServerId()));
        meal2.setTimeCreated(meal.getTimeCreated());
        meal2.setTimeUpdated(meal.getTimeUpdated());
        meal2.setUuid(MappingUtils.uuidToString(meal.getUuid()));
        return meal2;
    }

    public volatile Object toDbEntity(Object obj)
    {
        return toDbEntity((Meal)obj);
    }

    public volatile Object toDbEntity(Object obj, Object obj1)
    {
        return toDbEntity((Meal)obj, (com.fitbit.data.repo.greendao.food.Meal)obj1);
    }
}
