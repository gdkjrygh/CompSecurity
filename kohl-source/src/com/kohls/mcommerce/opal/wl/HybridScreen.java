// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.wl;


public final class HybridScreen extends Enum
{

    private static final HybridScreen $VALUES[];
    public static final HybridScreen ADD_PAYMENT_METHOD;
    public static final HybridScreen ADD_SHIPPING_ADDRESS;
    public static final HybridScreen CHANGELOCATION;
    public static final HybridScreen CHECKOUT;
    public static final HybridScreen CONFIRMATION;
    public static final HybridScreen DISCOUNTS;
    public static final HybridScreen EDIT_BILLING_ADDRESS;
    public static final HybridScreen EDIT_PAYMENT_METHOD;
    public static final HybridScreen EDIT_SHIPPING_ADDRESS;
    public static final HybridScreen EMPTY_SHOPPINGBAG;
    public static final HybridScreen GIFTOPTIONS;
    public static final HybridScreen GIFT_SERVICE;
    public static final HybridScreen INVALID_ORDER_DETAILS;
    public static final HybridScreen LIST_SHIPPING_ADDRESS;
    public static final HybridScreen MORE_ORDER_DETAILS;
    public static final HybridScreen MY_INFORMATION;
    public static final HybridScreen MY_INFORMATION_ADD_PAYMENT_METHOD;
    public static final HybridScreen MY_INFORMATION_ADD_PAYMENT_METHOD_FIRST;
    public static final HybridScreen MY_INFORMATION_ADD_SHIPPING_ADDRESS;
    public static final HybridScreen MY_INFORMATION_EDIT_BILLING_ADDRESS;
    public static final HybridScreen MY_INFORMATION_EDIT_PAYMENT_METHOD;
    public static final HybridScreen MY_INFORMATION_EDIT_SHIPPING_ADDRESS;
    public static final HybridScreen MY_INFORMATION_LIST_SHIPPING_ADDRESS;
    public static final HybridScreen MY_INFORMATION_PAYMENT_METHOD_LIST;
    public static final HybridScreen NO_ORDER_DETAILS;
    public static final HybridScreen OFFER_APPLIED;
    public static final HybridScreen ORDER_DETAILS;
    public static final HybridScreen ORDER_HISTORY;
    public static final HybridScreen PAYMENT;
    public static final HybridScreen PAYMENT_METHOD_LIST;
    public static final HybridScreen REVIEW;
    public static final HybridScreen SHIPPING;
    public static final HybridScreen SHIPPINGTAX;
    public static final HybridScreen SHIPPING_METHODS;
    public static final HybridScreen SHOPPINGBAG;
    private boolean moveToShoppingBag;
    private String mscreenTitle;
    private String mscreenUrl;
    private String mscreenUrlPrefix;

    private HybridScreen(String s, int i, String s1, String s2, String s3, boolean flag)
    {
        super(s, i);
        mscreenTitle = s1;
        mscreenUrlPrefix = s2;
        mscreenUrl = s3;
        moveToShoppingBag = flag;
    }

    private static HybridScreen getScreenFromStringUrl(String s, boolean flag)
    {
        if (s != null)
        {
            HybridScreen ahybridscreen[] = values();
            int j = ahybridscreen.length;
            String s1;
            HybridScreen hybridscreen;
            for (int i = 0; i < j; i++)
            {
                hybridscreen = ahybridscreen[i];
                if (!flag)
                {
                    s1 = (new StringBuilder()).append(hybridscreen.getScreenUrlPrefix()).append(hybridscreen.getScreenUrl()).toString();
                } else
                {
                    s1 = hybridscreen.getScreenUrl();
                }
                if (s1.equalsIgnoreCase(s))
                {
                    return hybridscreen;
                }
            }

        }
        return null;
    }

    public static HybridScreen getScreenFromUrl(String s)
    {
        Object obj1 = null;
        Object obj = obj1;
        if (s != null)
        {
            int i = s.indexOf("#");
            obj = obj1;
            if (i >= 0)
            {
                obj = s.substring(i + 1);
                s = ((String) (obj));
                if (((String) (obj)).endsWith("/"))
                {
                    s = ((String) (obj)).substring(0, ((String) (obj)).length() - 1);
                }
                obj = getScreenFromStringUrl(s, false);
            }
        }
        return ((HybridScreen) (obj));
    }

    public static HybridScreen getScreenFromUrlPostfix(String s)
    {
        return getScreenFromStringUrl(s, true);
    }

    public static HybridScreen valueOf(String s)
    {
        return (HybridScreen)Enum.valueOf(com/kohls/mcommerce/opal/wl/HybridScreen, s);
    }

    public static HybridScreen[] values()
    {
        return (HybridScreen[])$VALUES.clone();
    }

    public String getScreenTitle()
    {
        return mscreenTitle;
    }

    public String getScreenUrl()
    {
        return mscreenUrl;
    }

    public String getScreenUrlPrefix()
    {
        return mscreenUrlPrefix;
    }

    public boolean isMoveToShoppingBag()
    {
        return moveToShoppingBag;
    }

    public String toString()
    {
        return (new StringBuilder()).append("screenTitle: ").append(mscreenTitle).append(", screenUrl: ").append(mscreenUrl).toString();
    }

    static 
    {
        SHOPPINGBAG = new HybridScreen("SHOPPINGBAG", 0, "Shopping Bag", "", "/shoppingBag", false);
        EMPTY_SHOPPINGBAG = new HybridScreen("EMPTY_SHOPPINGBAG", 1, "Shopping Bag", "", "/emptyShoppingBag", false);
        OFFER_APPLIED = new HybridScreen("OFFER_APPLIED", 2, "Offer Details", "", "/offerApplied", false);
        DISCOUNTS = new HybridScreen("DISCOUNTS", 3, "Add Discounts", "", "/discounts", false);
        SHIPPINGTAX = new HybridScreen("SHIPPINGTAX", 4, "Checkout", "", "/shippingTax", false);
        CHANGELOCATION = new HybridScreen("CHANGELOCATION", 5, "Change Location", "", "/changeLocation", false);
        LIST_SHIPPING_ADDRESS = new HybridScreen("LIST_SHIPPING_ADDRESS", 6, "Shipping Addresses", "", "/addressList/Shipping", false);
        EDIT_SHIPPING_ADDRESS = new HybridScreen("EDIT_SHIPPING_ADDRESS", 7, "Edit Shipping Address", "", "/address/editAddress-Shipping", false);
        ADD_SHIPPING_ADDRESS = new HybridScreen("ADD_SHIPPING_ADDRESS", 8, "Add Shipping Address", "", "/address/addAddress-Shipping", false);
        SHIPPING_METHODS = new HybridScreen("SHIPPING_METHODS", 9, "Delivery Method", "", "/shippingMethodList", false);
        EDIT_BILLING_ADDRESS = new HybridScreen("EDIT_BILLING_ADDRESS", 10, "Edit Billing Address", "", "/editBillingAddress", false);
        PAYMENT_METHOD_LIST = new HybridScreen("PAYMENT_METHOD_LIST", 11, "Select a Card", "", "/paymentMethodList", false);
        EDIT_PAYMENT_METHOD = new HybridScreen("EDIT_PAYMENT_METHOD", 12, "Edit a card", "", "/addEditPaymentMethod/edit", false);
        ADD_PAYMENT_METHOD = new HybridScreen("ADD_PAYMENT_METHOD", 13, "Add a card", "", "/addEditPaymentMethod/add", false);
        GIFT_SERVICE = new HybridScreen("GIFT_SERVICE", 14, "Gift Service", "", "/giftService", false);
        CHECKOUT = new HybridScreen("CHECKOUT", 15, "Checkout", "", "/checkout", true);
        SHIPPING = new HybridScreen("SHIPPING", 16, "Checkout", "/checkout", "/shipping", true);
        GIFTOPTIONS = new HybridScreen("GIFTOPTIONS", 17, "Checkout", "/checkout", "/giftOptions", true);
        PAYMENT = new HybridScreen("PAYMENT", 18, "Checkout", "/checkout", "/payment", true);
        REVIEW = new HybridScreen("REVIEW", 19, "Checkout", "/checkout", "/review", true);
        CONFIRMATION = new HybridScreen("CONFIRMATION", 20, "Order Confirmation", "", "/orderConfirmation", false);
        MY_INFORMATION = new HybridScreen("MY_INFORMATION", 21, "My Information", "", "/myInformation", false);
        MY_INFORMATION_LIST_SHIPPING_ADDRESS = new HybridScreen("MY_INFORMATION_LIST_SHIPPING_ADDRESS", 22, "Shipping Addresses", "", "/listAddresses/shipping", false);
        MY_INFORMATION_EDIT_SHIPPING_ADDRESS = new HybridScreen("MY_INFORMATION_EDIT_SHIPPING_ADDRESS", 23, "Edit Shipping Address", "", "/myInfoAddEditAddress/editAddress-Shipping", false);
        MY_INFORMATION_ADD_SHIPPING_ADDRESS = new HybridScreen("MY_INFORMATION_ADD_SHIPPING_ADDRESS", 24, "Add Shipping Address", "", "/myInfoAddEditAddress/addAddress-shipping", false);
        MY_INFORMATION_EDIT_BILLING_ADDRESS = new HybridScreen("MY_INFORMATION_EDIT_BILLING_ADDRESS", 25, "Edit Billing Address", "", "/myInfoAddEditBillingAddress", false);
        MY_INFORMATION_ADD_PAYMENT_METHOD_FIRST = new HybridScreen("MY_INFORMATION_ADD_PAYMENT_METHOD_FIRST", 26, "Add a card", "", "/addPaymentMethod", false);
        MY_INFORMATION_PAYMENT_METHOD_LIST = new HybridScreen("MY_INFORMATION_PAYMENT_METHOD_LIST", 27, "Select a Card", "", "/editPaymentMethods/edit", false);
        MY_INFORMATION_EDIT_PAYMENT_METHOD = new HybridScreen("MY_INFORMATION_EDIT_PAYMENT_METHOD", 28, "Edit a card", "", "/myInfoEditPaymentMethod/edit", false);
        MY_INFORMATION_ADD_PAYMENT_METHOD = new HybridScreen("MY_INFORMATION_ADD_PAYMENT_METHOD", 29, "Add a card", "", "/myInfoEditPaymentMethod/add", false);
        ORDER_HISTORY = new HybridScreen("ORDER_HISTORY", 30, "Order History", "", "/orderHistory", false);
        ORDER_DETAILS = new HybridScreen("ORDER_DETAILS", 31, "Order Summary", "", "/orderDetails", false);
        NO_ORDER_DETAILS = new HybridScreen("NO_ORDER_DETAILS", 32, "Order Summary", "", "/noOrderDetails", false);
        INVALID_ORDER_DETAILS = new HybridScreen("INVALID_ORDER_DETAILS", 33, "Order Details", "", "/invalidOrderDetails", false);
        MORE_ORDER_DETAILS = new HybridScreen("MORE_ORDER_DETAILS", 34, "Order Details", "", "/moreOrderDetails", false);
        $VALUES = (new HybridScreen[] {
            SHOPPINGBAG, EMPTY_SHOPPINGBAG, OFFER_APPLIED, DISCOUNTS, SHIPPINGTAX, CHANGELOCATION, LIST_SHIPPING_ADDRESS, EDIT_SHIPPING_ADDRESS, ADD_SHIPPING_ADDRESS, SHIPPING_METHODS, 
            EDIT_BILLING_ADDRESS, PAYMENT_METHOD_LIST, EDIT_PAYMENT_METHOD, ADD_PAYMENT_METHOD, GIFT_SERVICE, CHECKOUT, SHIPPING, GIFTOPTIONS, PAYMENT, REVIEW, 
            CONFIRMATION, MY_INFORMATION, MY_INFORMATION_LIST_SHIPPING_ADDRESS, MY_INFORMATION_EDIT_SHIPPING_ADDRESS, MY_INFORMATION_ADD_SHIPPING_ADDRESS, MY_INFORMATION_EDIT_BILLING_ADDRESS, MY_INFORMATION_ADD_PAYMENT_METHOD_FIRST, MY_INFORMATION_PAYMENT_METHOD_LIST, MY_INFORMATION_EDIT_PAYMENT_METHOD, MY_INFORMATION_ADD_PAYMENT_METHOD, 
            ORDER_HISTORY, ORDER_DETAILS, NO_ORDER_DETAILS, INVALID_ORDER_DETAILS, MORE_ORDER_DETAILS
        });
    }
}
