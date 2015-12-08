// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao.mapping;

import com.fitbit.data.domain.FoodLogEntry;
import com.fitbit.data.repo.greendao.food.DaoSession;
import com.fitbit.data.repo.greendao.food.FoodItemDao;
import com.fitbit.util.w;

// Referenced classes of package com.fitbit.data.repo.greendao.mapping:
//            EntityMapper, FoodItemMapper, MappingUtils

public class FoodLogEntryMapper
    implements EntityMapper
{

    private final FoodItemDao foodItemDao;
    private final FoodItemMapper foodItemMapper;

    public FoodLogEntryMapper(DaoSession daosession)
    {
        foodItemDao = daosession.getFoodItemDao();
        foodItemMapper = new FoodItemMapper(daosession);
    }

    public FoodLogEntry fromDbEntity(com.fitbit.data.repo.greendao.food.FoodLogEntry foodlogentry)
    {
        if (foodlogentry == null)
        {
            return null;
        } else
        {
            FoodLogEntry foodlogentry1 = new FoodLogEntry();
            foodlogentry1.setEntityId(foodlogentry.getId());
            foodlogentry1.setServerId(foodlogentry.getServerId().longValue());
            foodlogentry1.setLogDate(foodlogentry.getLogDate());
            foodlogentry1.setTimeCreated(foodlogentry.getTimeCreated());
            foodlogentry1.setTimeUpdated(foodlogentry.getTimeUpdated());
            foodlogentry1.setUuid(MappingUtils.uuidFromString(foodlogentry.getUuid()));
            foodlogentry1.setEntityStatus((com.fitbit.data.domain.Entity.EntityStatus)w.a(foodlogentry.getEntityStatus().intValue(), com/fitbit/data/domain/Entity$EntityStatus));
            foodlogentry1.setQuickCaloriesAdd(foodlogentry.getIsQuickCaloriesAdd().booleanValue());
            foodlogentry1.populateFromDbEntity(foodlogentry, foodItemMapper);
            return foodlogentry1;
        }
    }

    public volatile Object fromDbEntity(Object obj)
    {
        return fromDbEntity((com.fitbit.data.repo.greendao.food.FoodLogEntry)obj);
    }

    public com.fitbit.data.repo.greendao.food.FoodLogEntry toDbEntity(FoodLogEntry foodlogentry)
    {
        return toDbEntity(foodlogentry, new com.fitbit.data.repo.greendao.food.FoodLogEntry());
    }

    public com.fitbit.data.repo.greendao.food.FoodLogEntry toDbEntity(FoodLogEntry foodlogentry, com.fitbit.data.repo.greendao.food.FoodLogEntry foodlogentry1)
    {
        if (foodlogentry == null)
        {
            return null;
        }
        com.fitbit.data.repo.greendao.food.FoodLogEntry foodlogentry2 = foodlogentry1;
        if (foodlogentry1 == null)
        {
            foodlogentry2 = new com.fitbit.data.repo.greendao.food.FoodLogEntry();
        }
        if (foodlogentry2.getId() == null)
        {
            foodlogentry2.setId(foodlogentry.getEntityId());
        }
        foodlogentry2.setServerId(Long.valueOf(foodlogentry.getServerId()));
        foodlogentry2.setLogDate(foodlogentry.getLogDate());
        foodlogentry2.setTimeCreated(foodlogentry.getTimeCreated());
        foodlogentry2.setTimeUpdated(foodlogentry.getTimeUpdated());
        foodlogentry2.setUuid(MappingUtils.uuidToString(foodlogentry.getUuid()));
        foodlogentry2.setEntityStatus(Integer.valueOf(foodlogentry.getEntityStatus().getCode()));
        foodlogentry2.setIsQuickCaloriesAdd(Boolean.valueOf(foodlogentry.isQuickCaloriesAdd()));
        foodlogentry1 = foodItemDao;
        boolean flag;
        if (!foodlogentry.isQuickCaloriesAdd() && foodlogentry.getFoodItem() != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        foodlogentry.populateDbEntity(foodlogentry2, foodlogentry1, flag);
        return foodlogentry2;
    }

    public volatile Object toDbEntity(Object obj)
    {
        return toDbEntity((FoodLogEntry)obj);
    }

    public volatile Object toDbEntity(Object obj, Object obj1)
    {
        return toDbEntity((FoodLogEntry)obj, (com.fitbit.data.repo.greendao.food.FoodLogEntry)obj1);
    }
}
