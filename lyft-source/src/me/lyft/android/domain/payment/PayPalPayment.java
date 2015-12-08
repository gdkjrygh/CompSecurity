// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.domain.payment;


// Referenced classes of package me.lyft.android.domain.payment:
//            ChargeAccountPayment, Money

public class PayPalPayment extends ChargeAccountPayment
{

    private String chargeToken;

    public PayPalPayment(String s, Money money)
    {
        super(s, money);
    }

    public String getChargeToken()
    {
        return chargeToken;
    }

    public void setChargeToken(String s)
    {
        chargeToken = s;
    }
}
