// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.domain.ridehistory.charge;

import me.lyft.android.common.INullable;

// Referenced classes of package me.lyft.android.domain.ridehistory.charge:
//            CouponAccountInfoItem, CreditCardAccountInfoItem, CreditLineAccountInfoItem, GoogleWalletAccountInfoItem, 
//            NullAccountInfoItem, PayPalAccountInfoItem

public class AccountInfoItem extends me.lyft.android.domain.ridehistory.PaymentBreakdown.ReceiptItem
    implements INullable
{

    public static final String METHOD_CARD = "card";
    public static final String METHOD_COUPON = "coupon";
    public static final String METHOD_CREDITLINE = "creditLine";
    public static final String METHOD_GOOGLE_WALLET = "googleWallet";
    public static final String METHOD_PAYPAL = "paypal";
    private String clientChargeMethod;
    private String type;

    public AccountInfoItem(String s, String s1, String s2, String s3)
    {
        super(s, s1);
        clientChargeMethod = s2;
        type = s3;
    }

    public String getClientChargeMethod()
    {
        return clientChargeMethod;
    }

    public String getType()
    {
        return type;
    }

    public boolean isCoupon()
    {
        return this instanceof CouponAccountInfoItem;
    }

    public boolean isCreditCard()
    {
        return this instanceof CreditCardAccountInfoItem;
    }

    public boolean isCreditLine()
    {
        return this instanceof CreditLineAccountInfoItem;
    }

    public boolean isGoogleWallet()
    {
        return this instanceof GoogleWalletAccountInfoItem;
    }

    public boolean isNull()
    {
        return this instanceof NullAccountInfoItem;
    }

    public boolean isPayPal()
    {
        return this instanceof PayPalAccountInfoItem;
    }
}
