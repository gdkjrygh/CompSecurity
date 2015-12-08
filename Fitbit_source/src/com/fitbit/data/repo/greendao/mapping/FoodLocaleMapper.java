// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao.mapping;

import com.fitbit.data.domain.FoodLocale;

// Referenced classes of package com.fitbit.data.repo.greendao.mapping:
//            EntityMapper

public class FoodLocaleMapper
    implements EntityMapper
{

    public FoodLocaleMapper()
    {
    }

    public FoodLocale fromDbEntity(com.fitbit.data.repo.greendao.food.FoodLocale foodlocale)
    {
        return new FoodLocale(foodlocale.getId().longValue(), foodlocale.getValue(), foodlocale.getLabel(), foodlocale.getSupportsLookupByBarCode().booleanValue(), foodlocale.getImageUpload().booleanValue());
    }

    public volatile Object fromDbEntity(Object obj)
    {
        return fromDbEntity((com.fitbit.data.repo.greendao.food.FoodLocale)obj);
    }

    public com.fitbit.data.repo.greendao.food.FoodLocale toDbEntity(FoodLocale foodlocale)
    {
        return new com.fitbit.data.repo.greendao.food.FoodLocale(foodlocale.getEntityId(), foodlocale.a(), foodlocale.b(), Boolean.valueOf(foodlocale.c()), Boolean.valueOf(foodlocale.d()));
    }

    public com.fitbit.data.repo.greendao.food.FoodLocale toDbEntity(FoodLocale foodlocale, com.fitbit.data.repo.greendao.food.FoodLocale foodlocale1)
    {
        if (foodlocale == null)
        {
            return null;
        }
        com.fitbit.data.repo.greendao.food.FoodLocale foodlocale2 = foodlocale1;
        if (foodlocale1 == null)
        {
            foodlocale2 = new com.fitbit.data.repo.greendao.food.FoodLocale();
        }
        if (foodlocale2.getId() == null)
        {
            foodlocale2.setId(foodlocale.getEntityId());
        }
        foodlocale2.setValue(foodlocale.a());
        foodlocale2.setLabel(foodlocale.b());
        foodlocale2.setSupportsLookupByBarCode(Boolean.valueOf(foodlocale.c()));
        foodlocale2.setImageUpload(Boolean.valueOf(foodlocale.d()));
        return foodlocale2;
    }

    public volatile Object toDbEntity(Object obj)
    {
        return toDbEntity((FoodLocale)obj);
    }

    public volatile Object toDbEntity(Object obj, Object obj1)
    {
        return toDbEntity((FoodLocale)obj, (com.fitbit.data.repo.greendao.food.FoodLocale)obj1);
    }
}
