// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.cart;


public final class CartErrorType extends Enum
{

    private static final CartErrorType $VALUES[];
    public static final CartErrorType COUPON_PRODUCT_REMOVED;
    public static final CartErrorType COUPON_REMOVED;
    public static final CartErrorType PRODUCT_REMOVED;
    public static final CartErrorType SUCCESS;

    private CartErrorType(String s, int i)
    {
        super(s, i);
    }

    public static CartErrorType valueOf(String s)
    {
        return (CartErrorType)Enum.valueOf(com/dominos/android/sdk/core/cart/CartErrorType, s);
    }

    public static CartErrorType[] values()
    {
        return (CartErrorType[])$VALUES.clone();
    }

    static 
    {
        COUPON_REMOVED = new CartErrorType("COUPON_REMOVED", 0);
        PRODUCT_REMOVED = new CartErrorType("PRODUCT_REMOVED", 1);
        COUPON_PRODUCT_REMOVED = new CartErrorType("COUPON_PRODUCT_REMOVED", 2);
        SUCCESS = new CartErrorType("SUCCESS", 3);
        $VALUES = (new CartErrorType[] {
            COUPON_REMOVED, PRODUCT_REMOVED, COUPON_PRODUCT_REMOVED, SUCCESS
        });
    }
}
