// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.domain.payment;


// Referenced classes of package me.lyft.android.domain.payment:
//            Payment, Money

public class ChargeAccountPayment extends Payment
{

    private final String chargeAccountId;

    public ChargeAccountPayment(String s, Money money)
    {
        super(money);
        chargeAccountId = s;
    }

    public final String getChargeAccountId()
    {
        return chargeAccountId;
    }
}
