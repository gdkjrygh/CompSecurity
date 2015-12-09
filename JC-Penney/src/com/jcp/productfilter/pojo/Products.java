// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.productfilter.pojo;

import java.io.Serializable;
import java.util.List;

public class Products
    implements Serializable
{

    private String brandLogoUrl;
    private String id;
    private List images;
    private String isNew;
    private String isPreOrder;
    private String marketingLabel;
    private String messages;
    private String name;
    private List prices;
    private String promotions;
    private String rating;
    private String reviewCount;
    private String url;

    public Products()
    {
    }

    public String getBrandLogoUrl()
    {
        return brandLogoUrl;
    }

    public String getId()
    {
        return id;
    }

    public List getImages()
    {
        return images;
    }

    public String getIsNew()
    {
        return isNew;
    }

    public String getIsPreOrder()
    {
        return isPreOrder;
    }

    public String getMarketingLabel()
    {
        return marketingLabel;
    }

    public String getMessages()
    {
        return messages;
    }

    public String getName()
    {
        return name;
    }

    public List getPrices()
    {
        return prices;
    }

    public String getPromotions()
    {
        return promotions;
    }

    public String getRating()
    {
        return rating;
    }

    public String getReviewCount()
    {
        return reviewCount;
    }

    public String getUrl()
    {
        return url;
    }

    public void setBrandLogoUrl(String s)
    {
        brandLogoUrl = s;
    }

    public void setId(String s)
    {
        id = s;
    }

    public void setImages(List list)
    {
        images = list;
    }

    public void setIsNew(String s)
    {
        isNew = s;
    }

    public void setIsPreOrder(String s)
    {
        isPreOrder = s;
    }

    public void setMarketingLabel(String s)
    {
        marketingLabel = s;
    }

    public void setMessages(String s)
    {
        messages = s;
    }

    public void setName(String s)
    {
        name = s;
    }

    public void setPrices(List list)
    {
        prices = list;
    }

    public void setPromotions(String s)
    {
        promotions = s;
    }

    public void setRating(String s)
    {
        rating = s;
    }

    public void setReviewCount(String s)
    {
        reviewCount = s;
    }

    public void setUrl(String s)
    {
        url = s;
    }
}
