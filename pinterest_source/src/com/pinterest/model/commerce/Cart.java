// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.model.commerce;

import java.util.List;
import java.util.Map;

// Referenced classes of package com.pinterest.model.commerce:
//            DetailedShipping, Incentive, Merchant, ShippingRate, 
//            UserCard

public class Cart
{

    private final String basePrice = null;
    private final DetailedShipping billingDetail = null;
    private final String country = null;
    private final long createdAt = 0L;
    private final String currency = null;
    private final DetailedShipping detailedShipping = null;
    private final String displayBasePrice = null;
    private final String displayShippingCost = null;
    private final String displayStatus = null;
    private final String displayTaxes = null;
    private final String displayTotalPrice = null;
    private final Object externalShipping = null;
    private final String id = null;
    private final Incentive incentive = null;
    private final boolean isActive = false;
    private final boolean isVisible = false;
    private final Map itemMap = null;
    private final Merchant merchant = null;
    private final String orderId = null;
    private final long paidAt = 0L;
    private final String policyLink = null;
    private final String preferredCardId = null;
    private final int preferredVaultType = 0;
    private final List productPins = null;
    private final boolean requireShipping = false;
    private final ShippingRate selectedShippingRate = null;
    private final String shippingDetailId = null;
    private final List shippingRates = null;
    private final int status = 0;
    private final long submittedAt = 0L;
    private final String totalPrice = null;
    private final String totalTaxes = null;
    private final long updatedAt = 0L;
    private final UserCard userCard = null;
    private final String userId = null;
    private final int walletType = 0;

    public Cart()
    {
    }

    public String getBasePrice()
    {
        return basePrice;
    }

    public DetailedShipping getBillingDetail()
    {
        return billingDetail;
    }

    public String getCountry()
    {
        return country;
    }

    public long getCreatedAt()
    {
        return createdAt;
    }

    public String getCurrency()
    {
        return currency;
    }

    public DetailedShipping getDetailedShipping()
    {
        return detailedShipping;
    }

    public String getDisplayBasePrice()
    {
        return displayBasePrice;
    }

    public String getDisplayShippingCost()
    {
        return displayShippingCost;
    }

    public String getDisplayStatus()
    {
        return displayStatus;
    }

    public String getDisplayTaxes()
    {
        return displayTaxes;
    }

    public String getDisplayTotalPrice()
    {
        return displayTotalPrice;
    }

    public Object getExternalShipping()
    {
        return externalShipping;
    }

    public String getId()
    {
        return id;
    }

    public Incentive getIncentive()
    {
        return incentive;
    }

    public Map getItemMap()
    {
        return itemMap;
    }

    public Merchant getMerchant()
    {
        return merchant;
    }

    public String getOrderId()
    {
        return orderId;
    }

    public long getPaidAt()
    {
        return paidAt;
    }

    public String getPolicyLink()
    {
        return policyLink;
    }

    public String getPreferredCardId()
    {
        return preferredCardId;
    }

    public int getPreferredVaultType()
    {
        return preferredVaultType;
    }

    public List getProductPins()
    {
        return productPins;
    }

    public ShippingRate getSelectedShippingRate()
    {
        return selectedShippingRate;
    }

    public String getShippingDetailId()
    {
        return shippingDetailId;
    }

    public List getShippingRates()
    {
        return shippingRates;
    }

    public int getStatus()
    {
        return status;
    }

    public long getSubmittedAt()
    {
        return submittedAt;
    }

    public String getTotalPrice()
    {
        return totalPrice;
    }

    public String getTotalTaxes()
    {
        return totalTaxes;
    }

    public long getUpdatedAt()
    {
        return updatedAt;
    }

    public UserCard getUserCard()
    {
        return userCard;
    }

    public String getUserId()
    {
        return userId;
    }

    public int getWalletType()
    {
        return walletType;
    }

    public boolean isActive()
    {
        return isActive;
    }

    public boolean isRequireShipping()
    {
        return requireShipping;
    }

    public boolean isVisible()
    {
        return isVisible;
    }
}
