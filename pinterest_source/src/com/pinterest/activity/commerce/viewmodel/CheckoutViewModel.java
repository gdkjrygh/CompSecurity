// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.commerce.viewmodel;

import com.pinterest.model.commerce.Cart;
import com.pinterest.model.commerce.DetailedShipping;
import com.pinterest.model.commerce.Item;
import com.pinterest.model.commerce.ShippingRate;
import com.pinterest.model.commerce.UserCard;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CheckoutViewModel
{

    private List availableShippingMethods;
    private String costEstimatedTax;
    private String costShipping;
    private String costSubtotal;
    private String costTotal;
    private boolean hasError;
    private boolean isInProgress;
    private boolean isInitialized;
    private String merchantName;
    private String paymentIncentiveExtra;
    private UserCard paymentMethod;
    private String privacyPolicyLink;
    private int quantity;
    private DetailedShipping shippingAddress;
    private ShippingRate shippingMethod;

    public CheckoutViewModel()
    {
    }

    public void clear()
    {
        isInitialized = false;
        quantity = 0;
        shippingAddress = null;
        shippingMethod = null;
        availableShippingMethods = null;
        paymentMethod = null;
        costSubtotal = null;
        costTotal = null;
        costShipping = null;
        costEstimatedTax = null;
        hasError = false;
        isInProgress = false;
    }

    public void clearPaymentIncentive()
    {
        paymentIncentiveExtra = null;
    }

    public void flagFailure()
    {
        hasError = true;
        isInProgress = false;
    }

    public List getAvailableShippingMethods()
    {
        return availableShippingMethods;
    }

    public String getCostEstimatedTax()
    {
        return costEstimatedTax;
    }

    public String getCostShipping()
    {
        return costShipping;
    }

    public String getCostSubtotal()
    {
        return costSubtotal;
    }

    public String getCostTotal()
    {
        return costTotal;
    }

    public String getMerchantName()
    {
        return merchantName;
    }

    public String getPaymentIncentiveExtra()
    {
        return paymentIncentiveExtra;
    }

    public UserCard getPaymentMethod()
    {
        return paymentMethod;
    }

    public String getPrivacyPolicyLink()
    {
        return privacyPolicyLink;
    }

    public int getQuantity()
    {
        return quantity;
    }

    public DetailedShipping getShippingAddress()
    {
        return shippingAddress;
    }

    public ShippingRate getShippingMethod()
    {
        return shippingMethod;
    }

    public boolean hasError()
    {
        return hasError;
    }

    public boolean isInProgress()
    {
        return isInProgress;
    }

    public boolean isInitialized()
    {
        return isInitialized;
    }

    public void setShowProgress()
    {
        isInProgress = true;
    }

    public void updateCartWithTotals(Cart cart)
    {
        updateWithCart(cart);
    }

    public void updatePayment(UserCard usercard)
    {
        paymentMethod = usercard;
    }

    public void updatePaymentIncentive(String s)
    {
        paymentIncentiveExtra = s;
    }

    public void updateQuantity(int i)
    {
        quantity = i;
    }

    public void updateShippingAddress(DetailedShipping detailedshipping)
    {
        shippingAddress = detailedshipping;
    }

    public void updateShippingMethod(ShippingRate shippingrate)
    {
        shippingMethod = shippingrate;
    }

    public void updateWithCart(Cart cart)
    {
        if (cart == null)
        {
            return;
        }
        isInitialized = true;
        hasError = false;
        isInProgress = false;
        Object obj = (String)cart.getItemMap().keySet().toArray()[0];
        obj = (Item)cart.getItemMap().get(obj);
        quantity = ((Item) (obj)).getQuantity();
        merchantName = ((Item) (obj)).getSiteName();
        privacyPolicyLink = cart.getPolicyLink();
        shippingAddress = cart.getDetailedShipping();
        if (cart.getSelectedShippingRate() != null)
        {
            shippingMethod = cart.getSelectedShippingRate();
        }
        availableShippingMethods = cart.getShippingRates();
        paymentMethod = cart.getUserCard();
        costSubtotal = cart.getDisplayBasePrice();
        costEstimatedTax = cart.getDisplayTaxes();
        costShipping = cart.getDisplayShippingCost();
        costTotal = cart.getDisplayTotalPrice();
    }
}
