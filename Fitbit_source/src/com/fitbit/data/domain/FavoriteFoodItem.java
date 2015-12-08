// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.domain;


// Referenced classes of package com.fitbit.data.domain:
//            Entity, d, FoodItem

public class FavoriteFoodItem extends Entity
    implements d
{

    private FoodItem foodItem;

    public FavoriteFoodItem()
    {
    }

    public FavoriteFoodItem(FoodItem fooditem)
    {
        foodItem = fooditem;
    }

    public FoodItem getFoodItem()
    {
        return foodItem;
    }

    public long getServerId()
    {
        return foodItem.getServerId();
    }

    public void setFoodItem(FoodItem fooditem)
    {
        foodItem = fooditem;
    }

    public void setServerId(long l)
    {
        foodItem.setServerId(l);
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder(super.toString());
        stringbuilder.append(" foodItem: {").append(foodItem).append("}");
        return stringbuilder.toString();
    }
}
