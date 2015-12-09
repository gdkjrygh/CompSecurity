// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.models;

import java.util.Map;

public class FoodMenu
{

    private String BusinessDate;
    private String ExpiresOn;
    private String LanguageCode;
    private int Status;
    private String StoreAsOfTime;
    private String StoreID;
    private String Version;
    private Map categoryMap;
    private Map couponMap;
    private Map flavorMap;
    public byte initialized;
    private Map productMap;
    private Map sidesMap;
    private Map sizesMap;
    private Map toppingMap;
    private Map variantsMap;

    public FoodMenu()
    {
        initialized = 1;
        Status = -1;
        StoreID = "";
        BusinessDate = "";
        StoreAsOfTime = "";
        LanguageCode = "";
        Version = "";
        ExpiresOn = "";
    }

    public String getBusinessDate()
    {
        return BusinessDate;
    }

    public Map getCategoryMap()
    {
        return categoryMap;
    }

    public Map getCouponMap()
    {
        return couponMap;
    }

    public String getExpiresOn()
    {
        return ExpiresOn;
    }

    public Map getFlavorMap()
    {
        return flavorMap;
    }

    public String getLanguageCode()
    {
        return LanguageCode;
    }

    public Map getProductMap()
    {
        return productMap;
    }

    public Map getSidesMap()
    {
        return sidesMap;
    }

    public Map getSizesMap()
    {
        return sizesMap;
    }

    public int getStatus()
    {
        return Status;
    }

    public String getStoreAsOfTime()
    {
        return StoreAsOfTime;
    }

    public String getStoreID()
    {
        return StoreID;
    }

    public Map getToppingMap()
    {
        return toppingMap;
    }

    public Map getVariantsMap()
    {
        return variantsMap;
    }

    public String getVersion()
    {
        return Version;
    }

    public boolean hasVariant(String s)
    {
        if (variantsMap != null)
        {
            return variantsMap.containsKey(s);
        } else
        {
            return false;
        }
    }

    public void setBusinessDate(String s)
    {
        BusinessDate = s;
    }

    public void setCategoryMap(Map map)
    {
        categoryMap = map;
    }

    public void setCouponMap(Map map)
    {
        couponMap = map;
    }

    public void setExpiresOn(String s)
    {
        ExpiresOn = s;
    }

    public void setFlavorMap(Map map)
    {
        flavorMap = map;
    }

    public void setLanguageCode(String s)
    {
        LanguageCode = s;
    }

    public void setProductMap(Map map)
    {
        productMap = map;
    }

    public void setSidesMap(Map map)
    {
        sidesMap = map;
    }

    public void setSizesMap(Map map)
    {
        sizesMap = map;
    }

    public void setStatus(int i)
    {
        Status = i;
    }

    public void setStoreAsOfTime(String s)
    {
        StoreAsOfTime = s;
    }

    public void setStoreID(String s)
    {
        StoreID = s;
    }

    public void setToppingMap(Map map)
    {
        toppingMap = map;
    }

    public void setVariantsMap(Map map)
    {
        variantsMap = map;
    }

    public void setVersion(String s)
    {
        Version = s;
    }
}
