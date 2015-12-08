// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao.mapping;

import com.fitbit.data.domain.FoodMeasurementUnit;
import com.fitbit.util.w;

// Referenced classes of package com.fitbit.data.repo.greendao.mapping:
//            EntityMapper, MappingUtils

public class FoodMeasurementUnitMapper
    implements EntityMapper
{

    public FoodMeasurementUnitMapper()
    {
    }

    public FoodMeasurementUnit fromDbEntity(com.fitbit.data.repo.greendao.food.FoodMeasurementUnit foodmeasurementunit)
    {
        if (foodmeasurementunit == null)
        {
            return null;
        } else
        {
            FoodMeasurementUnit foodmeasurementunit1 = new FoodMeasurementUnit();
            foodmeasurementunit1.setEntityId(foodmeasurementunit.getId());
            foodmeasurementunit1.setEntityStatus((com.fitbit.data.domain.Entity.EntityStatus)w.a(foodmeasurementunit.getEntityStatus().intValue(), com/fitbit/data/domain/Entity$EntityStatus));
            foodmeasurementunit1.a(foodmeasurementunit.getFoodMeasurementUnitTypeBitmap().intValue());
            foodmeasurementunit1.a(foodmeasurementunit.getName());
            foodmeasurementunit1.b(foodmeasurementunit.getPluralForm());
            foodmeasurementunit1.setServerId(foodmeasurementunit.getServerId().longValue());
            foodmeasurementunit1.setTimeCreated(foodmeasurementunit.getTimeCreated());
            foodmeasurementunit1.setTimeUpdated(foodmeasurementunit.getTimeUpdated());
            foodmeasurementunit1.setUuid(MappingUtils.uuidFromString(foodmeasurementunit.getUuid()));
            return foodmeasurementunit1;
        }
    }

    public volatile Object fromDbEntity(Object obj)
    {
        return fromDbEntity((com.fitbit.data.repo.greendao.food.FoodMeasurementUnit)obj);
    }

    public com.fitbit.data.repo.greendao.food.FoodMeasurementUnit toDbEntity(FoodMeasurementUnit foodmeasurementunit)
    {
        return toDbEntity(foodmeasurementunit, new com.fitbit.data.repo.greendao.food.FoodMeasurementUnit());
    }

    public com.fitbit.data.repo.greendao.food.FoodMeasurementUnit toDbEntity(FoodMeasurementUnit foodmeasurementunit, com.fitbit.data.repo.greendao.food.FoodMeasurementUnit foodmeasurementunit1)
    {
        if (foodmeasurementunit == null)
        {
            return null;
        }
        com.fitbit.data.repo.greendao.food.FoodMeasurementUnit foodmeasurementunit2 = foodmeasurementunit1;
        if (foodmeasurementunit1 == null)
        {
            foodmeasurementunit2 = new com.fitbit.data.repo.greendao.food.FoodMeasurementUnit();
        }
        if (foodmeasurementunit2.getId() == null)
        {
            foodmeasurementunit2.setId(foodmeasurementunit.getEntityId());
        }
        foodmeasurementunit2.setEntityStatus(Integer.valueOf(foodmeasurementunit.getEntityStatus().getCode()));
        foodmeasurementunit2.setFoodMeasurementUnitTypeBitmap(Integer.valueOf(foodmeasurementunit.a()));
        foodmeasurementunit2.setName(foodmeasurementunit.b());
        foodmeasurementunit2.setPluralForm(foodmeasurementunit.c());
        foodmeasurementunit2.setServerId(Long.valueOf(foodmeasurementunit.getServerId()));
        foodmeasurementunit2.setTimeCreated(foodmeasurementunit.getTimeCreated());
        foodmeasurementunit2.setTimeUpdated(foodmeasurementunit.getTimeUpdated());
        foodmeasurementunit2.setUuid(MappingUtils.uuidToString(foodmeasurementunit.getUuid()));
        return foodmeasurementunit2;
    }

    public volatile Object toDbEntity(Object obj)
    {
        return toDbEntity((FoodMeasurementUnit)obj);
    }

    public volatile Object toDbEntity(Object obj, Object obj1)
    {
        return toDbEntity((FoodMeasurementUnit)obj, (com.fitbit.data.repo.greendao.food.FoodMeasurementUnit)obj1);
    }
}
