// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.productlistentity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ProductListProductEntity
    implements Serializable
{

    private String brandLogoUrl;
    private String id;
    private List images;
    private Boolean isNew;
    private Boolean isPreOrder;
    private boolean isSaved;
    private boolean manufacturerAdvertisedPrice;
    private String marketingLabel;
    private String name;
    private List prices;
    private List promotionMessages;
    private float rating;
    private int reviewCount;
    private String tags[];
    private String url;
    private List videos;

    public ProductListProductEntity()
    {
        isNew = Boolean.valueOf(false);
        isPreOrder = Boolean.valueOf(false);
        images = new ArrayList();
        prices = new ArrayList();
        promotionMessages = new ArrayList();
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

    public Boolean getIsNew()
    {
        return isNew;
    }

    public Boolean getIsPreOrder()
    {
        return isPreOrder;
    }

    public Boolean getManufacturerAdvertisedPrice()
    {
        return Boolean.valueOf(manufacturerAdvertisedPrice);
    }

    public String getMarketingLabel()
    {
        return marketingLabel;
    }

    public String getName()
    {
        return name;
    }

    public List getPrices()
    {
        return prices;
    }

    public List getPromotionMessages()
    {
        return promotionMessages;
    }

    public float getRating()
    {
        return rating;
    }

    public int getReviewCount()
    {
        return reviewCount;
    }

    public String[] getTags()
    {
        return tags;
    }

    public String getUrl()
    {
        return url;
    }

    public List getVideos()
    {
        return videos;
    }

    public boolean isExcludedFromSimilarSearch()
    {
        boolean flag;
        boolean flag1;
        flag1 = false;
        flag = flag1;
        if (tags == null) goto _L2; else goto _L1
_L1:
        String as[];
        int i;
        int j;
        as = tags;
        j = as.length;
        i = 0;
_L7:
        flag = flag1;
        if (i >= j) goto _L2; else goto _L3
_L3:
        if (!"suppressSimilarSearch".equalsIgnoreCase(as[i])) goto _L5; else goto _L4
_L4:
        flag = true;
_L2:
        return flag;
_L5:
        i++;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public boolean isSaved()
    {
        return isSaved;
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

    public void setIsNew(Boolean boolean1)
    {
        isNew = boolean1;
    }

    public void setIsPreOrder(Boolean boolean1)
    {
        isPreOrder = boolean1;
    }

    public void setManufacturerAdvertisedPrice(Boolean boolean1)
    {
        manufacturerAdvertisedPrice = boolean1.booleanValue();
    }

    public void setMarketingLabel(String s)
    {
        marketingLabel = s;
    }

    public void setName(String s)
    {
        name = s;
    }

    public void setPrices(List list)
    {
        prices = list;
    }

    public void setPromotionMessages(List list)
    {
        promotionMessages = list;
    }

    public void setRating(float f)
    {
        rating = f;
    }

    public void setReviewCount(int i)
    {
        reviewCount = i;
    }

    public void setSaved(boolean flag)
    {
        isSaved = flag;
    }

    public void setTags(String as[])
    {
        tags = as;
    }

    public void setUrl(String s)
    {
        url = s;
    }

    public void setVideos(List list)
    {
        videos = list;
    }
}
