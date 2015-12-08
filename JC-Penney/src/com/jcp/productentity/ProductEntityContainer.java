// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.productentity;

import android.text.TextUtils;
import com.jcp.model.PromotionDetails;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.jcp.productentity:
//            InventoryEntity, Restrictions

public class ProductEntityContainer
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    private String brand;
    private String brandLogoUrl;
    private String channelOffering;
    private String description;
    private String division;
    private String entity;
    private String estDeliveryMsg;
    private String id;
    private List images;
    private InventoryEntity inventory;
    private boolean isFurnitureProduct;
    private boolean isNew;
    private boolean isPreOrder;
    private boolean isTruckDeliveryRequired;
    private boolean isWhiteGlovedDelivery;
    private String itemId;
    private List knowledgeAssistants;
    private List links;
    private boolean manufacturerAdvertisedPrice;
    private String marketingLabel;
    private String name;
    private List offers;
    private List options;
    private double overSizedItemSurcharge;
    private String parentEnsembleId;
    private List prices;
    private List productUrls;
    private PromotionDetails promotions[];
    private float rating;
    private String recommendationsURL;
    private Restrictions restrictions;
    private int reviewCount;
    private String reviewsId;
    private List serviceAgreements;
    private String skuId;
    private String subdivision;
    private String tags[];
    private String type;
    private String url;
    private List vDataOption;
    private String vDataType;
    private List videos;
    private List warranties;
    private String webId;

    public ProductEntityContainer()
    {
        knowledgeAssistants = new ArrayList();
        vDataOption = new ArrayList();
        serviceAgreements = new ArrayList();
        warranties = new ArrayList();
        options = new ArrayList();
        offers = new ArrayList();
        images = new ArrayList();
        prices = new ArrayList();
    }

    public String getBrand()
    {
        return brand;
    }

    public String getBrandLogoUrl()
    {
        return brandLogoUrl;
    }

    public String getChannelOffering()
    {
        return channelOffering;
    }

    public String getDescription()
    {
        if (TextUtils.isEmpty(description))
        {
            return "";
        } else
        {
            return description;
        }
    }

    public String getDivision()
    {
        return division;
    }

    public String getEntity()
    {
        return entity;
    }

    public String getEstDeliveryMsg()
    {
        return estDeliveryMsg;
    }

    public String getId()
    {
        if (TextUtils.isEmpty(id))
        {
            return "";
        } else
        {
            return id;
        }
    }

    public List getImages()
    {
        return images;
    }

    public InventoryEntity getInventory()
    {
        return inventory;
    }

    public boolean getIsFurnitureProduct()
    {
        return isFurnitureProduct;
    }

    public boolean getIsNew()
    {
        return isNew;
    }

    public boolean getIsPreOrder()
    {
        return isPreOrder;
    }

    public boolean getIsTruckDeliveryRequired()
    {
        return isTruckDeliveryRequired;
    }

    public boolean getIsWhiteGlovedDelivery()
    {
        return isWhiteGlovedDelivery;
    }

    public String getItemId()
    {
        return itemId;
    }

    public List getKnowledgeAssistants()
    {
        return knowledgeAssistants;
    }

    public List getLinks()
    {
        return links;
    }

    public boolean getManufacturerAdvertisedPrice()
    {
        return manufacturerAdvertisedPrice;
    }

    public String getMarketingLabel()
    {
        return marketingLabel;
    }

    public String getName()
    {
        if (TextUtils.isEmpty(name))
        {
            return "";
        } else
        {
            return name;
        }
    }

    public List getOffers()
    {
        return offers;
    }

    public List getOptions()
    {
        return options;
    }

    public double getOverSizedItemSurcharge()
    {
        return overSizedItemSurcharge;
    }

    public String getParentEnsembleId()
    {
        if (TextUtils.isEmpty(parentEnsembleId))
        {
            return "";
        } else
        {
            return parentEnsembleId;
        }
    }

    public List getPrices()
    {
        return prices;
    }

    public List getProductUrls()
    {
        return productUrls;
    }

    public PromotionDetails[] getPromotions()
    {
        return promotions;
    }

    public float getRating()
    {
        return rating;
    }

    public String getRecommendationsURL()
    {
        return recommendationsURL;
    }

    public Restrictions getRestrictions()
    {
        return restrictions;
    }

    public int getReviewCount()
    {
        return reviewCount;
    }

    public String getReviewsId()
    {
        return reviewsId;
    }

    public List getServiceAgreements()
    {
        return serviceAgreements;
    }

    public String getSkuId()
    {
        return skuId;
    }

    public String getSubdivision()
    {
        return subdivision;
    }

    public String[] getTags()
    {
        return tags;
    }

    public String getType()
    {
        return type;
    }

    public String getUrl()
    {
        return url;
    }

    public List getVideos()
    {
        return videos;
    }

    public List getWarranties()
    {
        return warranties;
    }

    public String getWebId()
    {
        if (TextUtils.isDigitsOnly(webId))
        {
            return webId;
        } else
        {
            return "";
        }
    }

    public List getvDataOption()
    {
        return vDataOption;
    }

    public String getvDataType()
    {
        return vDataType;
    }

    public void setBrand(String s)
    {
        brand = s;
    }

    public void setBrandLogoUrl(String s)
    {
        brandLogoUrl = s;
    }

    public void setChannelOffering(String s)
    {
        channelOffering = s;
    }

    public void setDescription(String s)
    {
        description = s;
    }

    public void setDivision(String s)
    {
        division = s;
    }

    public void setEntity(String s)
    {
        entity = s;
    }

    public void setEstDeliveryMsg(String s)
    {
        estDeliveryMsg = s;
    }

    public void setId(String s)
    {
        id = s;
    }

    public void setImages(List list)
    {
        images = list;
    }

    public void setInventory(InventoryEntity inventoryentity)
    {
        inventory = inventoryentity;
    }

    public void setIsFurnitureProduct(boolean flag)
    {
        isFurnitureProduct = flag;
    }

    public void setIsNew(boolean flag)
    {
        isNew = flag;
    }

    public void setIsPreOrder(boolean flag)
    {
        isPreOrder = flag;
    }

    public void setIsTruckDeliveryRequired(boolean flag)
    {
        isTruckDeliveryRequired = flag;
    }

    public void setIsWhiteGlovedDelivery(boolean flag)
    {
        isWhiteGlovedDelivery = flag;
    }

    public void setItemId(String s)
    {
        itemId = s;
    }

    public void setKnowledgeAssistants(List list)
    {
        knowledgeAssistants = list;
    }

    public void setLinks(List list)
    {
        links = list;
    }

    public void setManufacturerAdvertisedPrice(boolean flag)
    {
        manufacturerAdvertisedPrice = flag;
    }

    public void setMarketingLabel(String s)
    {
        marketingLabel = s;
    }

    public void setName(String s)
    {
        name = s;
    }

    public void setOffers(List list)
    {
        offers = list;
    }

    public void setOptions(List list)
    {
        options = list;
    }

    public void setOverSizedItemSurcharge(double d)
    {
        overSizedItemSurcharge = d;
    }

    public void setParentEnsembleId(String s)
    {
        parentEnsembleId = s;
    }

    public void setPrices(List list)
    {
        prices = list;
    }

    public void setProductUrls(List list)
    {
        productUrls = list;
    }

    public void setRating(float f)
    {
        rating = f;
    }

    public void setRecommendationsURL(String s)
    {
        recommendationsURL = s;
    }

    public void setRestrictions(Restrictions restrictions1)
    {
        restrictions = restrictions1;
    }

    public void setReviewCount(int i)
    {
        reviewCount = i;
    }

    public void setReviewsId(String s)
    {
        reviewsId = s;
    }

    public void setServiceAgreements(List list)
    {
        serviceAgreements = list;
    }

    public void setSkuId(String s)
    {
        skuId = s;
    }

    public void setSubdivision(String s)
    {
        subdivision = s;
    }

    public void setTags(String as[])
    {
        tags = as;
    }

    public void setType(String s)
    {
        type = s;
    }

    public void setUrl(String s)
    {
        url = s;
    }

    public void setVideos(List list)
    {
        videos = list;
    }

    public void setWarranties(List list)
    {
        warranties = list;
    }

    public void setWebId(String s)
    {
        webId = s;
    }

    public void setvDataOption(List list)
    {
        vDataOption = list;
    }

    public void setvDataType(String s)
    {
        vDataType = s;
    }
}
