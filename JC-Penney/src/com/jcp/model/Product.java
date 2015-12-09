// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.model;

import java.util.List;

public class Product
{

    private String id;
    private List images;
    private boolean isNew;
    private boolean isPreOrder;
    private boolean isSavedFromHomeScreen;
    private boolean manufacturerAdvertisedPrice;
    private String name;
    private List prices;
    private float rating;
    private int reviewCount;
    private String url;

    public Product()
    {
    }

    public String getId()
    {
        return id;
    }

    public List getImages()
    {
        return images;
    }

    public boolean getManufacturerAdvertisedPrice()
    {
        return manufacturerAdvertisedPrice;
    }

    public String getName()
    {
        return name;
    }

    public List getPrices()
    {
        return prices;
    }

    public float getRating()
    {
        return rating;
    }

    public int getReviewCount()
    {
        return reviewCount;
    }

    public String getUrl()
    {
        return url;
    }

    public boolean isNew()
    {
        return isNew;
    }

    public boolean isPreOrder()
    {
        return isPreOrder;
    }

    public boolean isSavedFromHomeScreen()
    {
        return isSavedFromHomeScreen;
    }

    public void setId(String s)
    {
        id = s;
    }

    public void setImages(List list)
    {
        images = list;
    }

    public void setIsNew(boolean flag)
    {
        isNew = flag;
    }

    public void setIsPreOrder(boolean flag)
    {
        isPreOrder = flag;
    }

    public void setIsSavedFromHomeScreen(boolean flag)
    {
        isSavedFromHomeScreen = flag;
    }

    public void setManufacturerAdvertisedPrice(boolean flag)
    {
        manufacturerAdvertisedPrice = flag;
    }

    public void setName(String s)
    {
        name = s;
    }

    public void setPrices(List list)
    {
        prices = list;
    }

    public void setRating(float f)
    {
        rating = f;
    }

    public void setReviewCount(int i)
    {
        reviewCount = i;
    }

    public void setUrl(String s)
    {
        url = s;
    }

    public String toString()
    {
        return (new StringBuilder()).append("Products [id = ").append(id).append(", isNew = ").append(isNew).append(", reviewCount = ").append(reviewCount).append(", name = ").append(name).append(", manufacturerAdvertisedPrice = ").append(manufacturerAdvertisedPrice).append(", prices = ").append(prices).append(", images = ").append(images).append(", rating = ").append(rating).append(", url = ").append(url).append("]").toString();
    }
}
