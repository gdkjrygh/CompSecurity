// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.model;

import com.jcp.b.b;
import com.jcp.model.trackorder.Price;
import com.jcp.model.trackorder.Tracking;
import com.jcp.storepickup.pojo.Inventory;
import java.io.Serializable;

// Referenced classes of package com.jcp.model:
//            Adjustments, AttributesCartItems, ItemFulfillmentDetails, PromotionDetails

public class CartItemsDetails
    implements Serializable
{

    private double activePrice;
    private String adjustmentTotal;
    private Adjustments adjustments[];
    private AttributesCartItems attributes[];
    private String brandName;
    private String categoryId;
    private String childId;
    private String description;
    private boolean digital;
    private String division;
    private String entity;
    private String estDeliveryMsg;
    private String exludedCoupon;
    private boolean factorForShippingDiscount;
    private ItemFulfillmentDetails fulfillmentOptions[];
    private String giftRegistry;
    private boolean giftWrappable;
    private String id;
    private String imageURL;
    private Inventory inventory;
    private String inventoryStatus;
    private boolean isClearance;
    private boolean isMattress;
    private boolean isNew;
    private boolean isPreOrder;
    private boolean isTruckDeliveryRequired;
    private String itemId;
    private boolean manufacturerAdvertisedPrice;
    private String marketingLabel;
    private String maxQuantity;
    private String name;
    private double originalPrice;
    private double overSizedItemSurcharge;
    private String parentId;
    private Price prices[];
    private String productId;
    private String productNumber;
    private String productURL;
    private PromotionDetails promotions[];
    private int quantity;
    private boolean readOnly;
    private double recycleFeePrice;
    private int recycleFeeQuantity;
    private boolean sale;
    private double savings;
    private String searchTerm;
    private double subTotal;
    private String subdivision;
    private String tags[];
    private double total;
    private double totalItemSavings;
    private double totalSavings;
    private double totalWithoutDiscount;
    private Tracking tracking;
    private String type;

    public CartItemsDetails()
    {
    }

    public double getActivePrice()
    {
        return activePrice;
    }

    public String getAdjustmentTotal()
    {
        return adjustmentTotal;
    }

    public Adjustments[] getAdjustments()
    {
        return adjustments;
    }

    public AttributesCartItems[] getAttributes()
    {
        return attributes;
    }

    public String getBrandName()
    {
        return brandName;
    }

    public String getCategoryId()
    {
        return categoryId;
    }

    public String getChildId()
    {
        return childId;
    }

    public String getDescription()
    {
        return description;
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

    public String getExludedCoupon()
    {
        return exludedCoupon;
    }

    public ItemFulfillmentDetails[] getFulfillmentOptions()
    {
        return fulfillmentOptions;
    }

    public String getGiftRegistry()
    {
        return giftRegistry;
    }

    public String getId()
    {
        return id;
    }

    public String getImageURL()
    {
        return imageURL;
    }

    public Inventory getInventory()
    {
        return inventory;
    }

    public String getInventoryStatus()
    {
        return inventoryStatus;
    }

    public String getItemId()
    {
        return itemId;
    }

    public String getMarketingLabel()
    {
        return marketingLabel;
    }

    public String getMaxQuantity()
    {
        return maxQuantity;
    }

    public String getName()
    {
        return name;
    }

    public double getOriginalPrice()
    {
        return originalPrice;
    }

    public double getOverSizedItemSurcharge()
    {
        return overSizedItemSurcharge;
    }

    public String getParentId()
    {
        return parentId;
    }

    public Price[] getPrices()
    {
        return prices;
    }

    public String getProductId()
    {
        return productId;
    }

    public String getProductNumber()
    {
        return productNumber;
    }

    public String getProductURL()
    {
        if (productURL != null)
        {
            return b.G(productURL);
        } else
        {
            return null;
        }
    }

    public PromotionDetails[] getPromotions()
    {
        return promotions;
    }

    public int getQuantity()
    {
        return quantity;
    }

    public boolean getReadOnly()
    {
        return readOnly;
    }

    public double getRecycleFeePrice()
    {
        return recycleFeePrice;
    }

    public int getRecycleFeeQuantity()
    {
        return recycleFeeQuantity;
    }

    public double getSavings()
    {
        return savings;
    }

    public String getSearchTerm()
    {
        return searchTerm;
    }

    public double getSubTotal()
    {
        return subTotal;
    }

    public String getSubdivision()
    {
        return subdivision;
    }

    public String[] getTags()
    {
        return tags;
    }

    public double getTotal()
    {
        return total;
    }

    public double getTotalItemSavings()
    {
        return totalItemSavings;
    }

    public double getTotalSavings()
    {
        return totalSavings;
    }

    public double getTotalWithoutDiscount()
    {
        return totalWithoutDiscount;
    }

    public Tracking getTracking()
    {
        return tracking;
    }

    public String getType()
    {
        return type;
    }

    public boolean isClearance()
    {
        return isClearance;
    }

    public boolean isFactorForShippingDiscount()
    {
        return factorForShippingDiscount;
    }

    public boolean isMattress()
    {
        return isMattress;
    }

    public boolean isNew()
    {
        return isNew;
    }

    public boolean isPreOrder()
    {
        return isPreOrder;
    }

    public boolean isSale()
    {
        return sale;
    }

    public boolean isTruckDeliveryRequired()
    {
        return isTruckDeliveryRequired;
    }

    public void setActivePrice(double d)
    {
        activePrice = d;
    }

    public void setAdjustments(Adjustments aadjustments[])
    {
        adjustments = aadjustments;
    }

    public void setAttributes(AttributesCartItems aattributescartitems[])
    {
        attributes = aattributescartitems;
    }

    public void setClearance(boolean flag)
    {
        isClearance = flag;
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

    public void setExludedCoupon(String s)
    {
        exludedCoupon = s;
    }

    public void setFactorForShippingDiscount(boolean flag)
    {
        factorForShippingDiscount = flag;
    }

    public void setFulfillmentOptions(ItemFulfillmentDetails aitemfulfillmentdetails[])
    {
        fulfillmentOptions = aitemfulfillmentdetails;
    }

    public void setId(String s)
    {
        id = s;
    }

    public void setImageURL(String s)
    {
        imageURL = s;
    }

    public void setInventoryStatus(String s)
    {
        inventoryStatus = s;
    }

    public void setIsMattress(boolean flag)
    {
        isMattress = flag;
    }

    public void setItemId(String s)
    {
        itemId = s;
    }

    public void setMarketingLabel(String s)
    {
        marketingLabel = s;
    }

    public void setMaxQuantity(String s)
    {
        maxQuantity = s;
    }

    public void setName(String s)
    {
        name = s;
    }

    public void setNew(boolean flag)
    {
        isNew = flag;
    }

    public void setOriginalPrice(double d)
    {
        originalPrice = d;
    }

    public void setOverSizedItemSurcharge(double d)
    {
        overSizedItemSurcharge = d;
    }

    public void setParentId(String s)
    {
        parentId = s;
    }

    public void setPreOrder(boolean flag)
    {
        isPreOrder = flag;
    }

    public void setProductId(String s)
    {
        productId = s;
    }

    public void setProductNumber(String s)
    {
        productNumber = s;
    }

    public void setProductURL(String s)
    {
        productURL = s;
    }

    public void setQuantity(int i)
    {
        quantity = i;
    }

    public void setRecycleFeePrice(double d)
    {
        recycleFeePrice = d;
    }

    public void setRecycleFeeQuantity(int i)
    {
        recycleFeeQuantity = i;
    }

    public void setSale(boolean flag)
    {
        sale = flag;
    }

    public void setSavings(double d)
    {
        savings = d;
    }

    public void setSearchTerm(String s)
    {
        searchTerm = s;
    }

    public void setSubTotal(double d)
    {
        subTotal = d;
    }

    public void setSubdivision(String s)
    {
        subdivision = s;
    }

    public void setTags(String as[])
    {
        tags = as;
    }

    public void setTotal(double d)
    {
        total = d;
    }

    public void setTotalItemSavings(double d)
    {
        totalItemSavings = d;
    }

    public void setTotalSavings(double d)
    {
        totalSavings = d;
    }

    public void setTotalWithoutDiscount(double d)
    {
        totalWithoutDiscount = d;
    }

    public void setTruckDeliveryRequired(boolean flag)
    {
        isTruckDeliveryRequired = flag;
    }

    public void setType(String s)
    {
        type = s;
    }
}
