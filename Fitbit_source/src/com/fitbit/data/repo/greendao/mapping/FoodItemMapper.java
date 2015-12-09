// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao.mapping;

import com.fitbit.d.a;
import com.fitbit.data.domain.Brand;
import com.fitbit.data.domain.FoodItem;
import com.fitbit.data.domain.h;
import com.fitbit.data.repo.greendao.food.DaoSession;
import com.fitbit.data.repo.greendao.food.LightServing;
import com.fitbit.util.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.fitbit.data.repo.greendao.mapping:
//            EntityMapper, LightServingMapper

public class FoodItemMapper
    implements EntityMapper
{

    private final LightServingMapper lightServingMapper;

    public FoodItemMapper(DaoSession daosession)
    {
        lightServingMapper = new LightServingMapper(daosession);
    }

    public FoodItem fromDbEntity(com.fitbit.data.repo.greendao.food.FoodItem fooditem)
    {
        if (fooditem == null)
        {
            return null;
        }
        FoodItem fooditem1 = new FoodItem();
        fooditem1.setEntityId(fooditem.getId());
        fooditem1.a(fooditem.getName());
        fooditem1.d(fooditem.getPopulated().booleanValue());
        fooditem1.setServerId(fooditem.getServerId().longValue());
        fooditem1.a(fooditem.getIsCustom().booleanValue());
        fooditem1.c(fooditem.getIsGeneric().booleanValue());
        fooditem1.b(fooditem.getIsRaw().booleanValue());
        if (fooditem.getMinGenericCalories() != null)
        {
            fooditem1.a(fooditem.getMinGenericCalories().doubleValue());
        }
        if (fooditem.getMostGenericCalories() != null)
        {
            fooditem1.b(fooditem.getMostGenericCalories().doubleValue());
        }
        if (fooditem.getMaxGenericCalories() != null)
        {
            fooditem1.c(fooditem.getMaxGenericCalories().doubleValue());
        }
        Object obj = new ArrayList();
        Object obj1;
        for (Iterator iterator = fooditem.getLightServings().iterator(); iterator.hasNext(); ((List) (obj)).add(obj1))
        {
            obj1 = (LightServing)iterator.next();
            obj1 = lightServingMapper.fromDbEntity(((LightServing) (obj1)));
            ((h) (obj1)).a(fooditem1);
        }

        fooditem1.a(((List) (obj)));
        obj = new Brand();
        ((Brand) (obj)).a(fooditem.getBrand());
        fooditem1.a(((Brand) (obj)));
        fooditem1.setEntityStatus((com.fitbit.data.domain.Entity.EntityStatus)w.a(fooditem.getEntityStatus().intValue(), com/fitbit/data/domain/Entity$EntityStatus));
        fooditem1.a(a.a(fooditem.getNutritionalValues(), FoodItem.e()));
        return fooditem1;
    }

    public volatile Object fromDbEntity(Object obj)
    {
        return fromDbEntity((com.fitbit.data.repo.greendao.food.FoodItem)obj);
    }

    public com.fitbit.data.repo.greendao.food.FoodItem toDbEntity(FoodItem fooditem)
    {
        return toDbEntity(fooditem, new com.fitbit.data.repo.greendao.food.FoodItem());
    }

    public com.fitbit.data.repo.greendao.food.FoodItem toDbEntity(FoodItem fooditem, com.fitbit.data.repo.greendao.food.FoodItem fooditem1)
    {
        if (fooditem == null)
        {
            return null;
        }
        com.fitbit.data.repo.greendao.food.FoodItem fooditem2 = fooditem1;
        if (fooditem1 == null)
        {
            fooditem2 = new com.fitbit.data.repo.greendao.food.FoodItem();
        }
        if (fooditem2.getId() == null)
        {
            fooditem2.setId(fooditem.getEntityId());
        }
        fooditem2.setName(fooditem.f());
        fooditem2.setBrand(fooditem.a().a());
        fooditem2.setPopulated(Boolean.valueOf(fooditem.n()));
        fooditem2.setServerId(Long.valueOf(fooditem.getServerId()));
        fooditem2.setEntityStatus(Integer.valueOf(fooditem.getEntityStatus().getCode()));
        fooditem2.setIsCustom(Boolean.valueOf(fooditem.g()));
        fooditem2.setIsGeneric(Boolean.valueOf(fooditem.i()));
        fooditem2.setIsRaw(Boolean.valueOf(fooditem.h()));
        fooditem2.setMinGenericCalories(Double.valueOf(fooditem.k()));
        fooditem2.setMostGenericCalories(Double.valueOf(fooditem.l()));
        fooditem2.setMaxGenericCalories(Double.valueOf(fooditem.m()));
        try
        {
            fooditem2.setNutritionalValues(a.a(fooditem.d()).toString());
        }
        // Misplaced declaration of an exception variable
        catch (FoodItem fooditem)
        {
            throw new RuntimeException(fooditem);
        }
        fooditem2.resetLightServings();
        return fooditem2;
    }

    public volatile Object toDbEntity(Object obj)
    {
        return toDbEntity((FoodItem)obj);
    }

    public volatile Object toDbEntity(Object obj, Object obj1)
    {
        return toDbEntity((FoodItem)obj, (com.fitbit.data.repo.greendao.food.FoodItem)obj1);
    }
}
