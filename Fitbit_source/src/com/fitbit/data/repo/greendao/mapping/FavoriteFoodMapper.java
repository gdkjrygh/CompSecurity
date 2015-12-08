// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao.mapping;

import com.fitbit.data.domain.FavoriteFoodItem;
import com.fitbit.data.domain.FoodItem;
import com.fitbit.data.repo.greendao.food.DaoSession;
import com.fitbit.data.repo.greendao.food.FavoriteFood;
import com.fitbit.util.w;

// Referenced classes of package com.fitbit.data.repo.greendao.mapping:
//            EntityMapper, FoodItemMapper

public class FavoriteFoodMapper
    implements EntityMapper
{

    private FoodItemMapper foodItemMapper;

    public FavoriteFoodMapper(DaoSession daosession)
    {
        foodItemMapper = new FoodItemMapper(daosession);
    }

    public FavoriteFoodItem fromDbEntity(FavoriteFood favoritefood)
    {
        if (favoritefood == null)
        {
            return null;
        } else
        {
            FavoriteFoodItem favoritefooditem = new FavoriteFoodItem(foodItemMapper.fromDbEntity(favoritefood.getFoodItem()));
            favoritefooditem.setEntityId(favoritefood.getId());
            favoritefooditem.setEntityStatus((com.fitbit.data.domain.Entity.EntityStatus)w.a(favoritefood.getEntityStatus().intValue(), com/fitbit/data/domain/Entity$EntityStatus));
            return favoritefooditem;
        }
    }

    public volatile Object fromDbEntity(Object obj)
    {
        return fromDbEntity((FavoriteFood)obj);
    }

    public FavoriteFood toDbEntity(FavoriteFoodItem favoritefooditem)
    {
        return toDbEntity(favoritefooditem, new FavoriteFood());
    }

    public FavoriteFood toDbEntity(FavoriteFoodItem favoritefooditem, FavoriteFood favoritefood)
    {
        if (favoritefooditem == null)
        {
            return null;
        }
        FavoriteFood favoritefood1 = favoritefood;
        if (favoritefood == null)
        {
            favoritefood1 = new FavoriteFood();
        }
        if (favoritefood1.getId() == null)
        {
            favoritefood1.setId(favoritefooditem.getEntityId());
        }
        favoritefood1.setEntityStatus(Integer.valueOf(favoritefooditem.getEntityStatus().getCode()));
        favoritefood1.setFoodId(favoritefooditem.getFoodItem().getEntityId());
        favoritefood1.setServerFoodId(Long.valueOf(favoritefooditem.getFoodItem().getServerId()));
        return favoritefood1;
    }

    public volatile Object toDbEntity(Object obj)
    {
        return toDbEntity((FavoriteFoodItem)obj);
    }

    public volatile Object toDbEntity(Object obj, Object obj1)
    {
        return toDbEntity((FavoriteFoodItem)obj, (FavoriteFood)obj1);
    }
}
