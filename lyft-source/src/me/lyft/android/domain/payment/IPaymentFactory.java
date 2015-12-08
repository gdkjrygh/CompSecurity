// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.domain.payment;


// Referenced classes of package me.lyft.android.domain.payment:
//            Money, CouponPayment, ChargeAccount, ChargeAccountPayment, 
//            SplitFarePayment

public interface IPaymentFactory
{

    public abstract CouponPayment createCouponPayment(String s, Money money);

    public abstract ChargeAccountPayment createPayment(ChargeAccount chargeaccount, Money money);

    public abstract SplitFarePayment createSplitFarePayment(Money money);
}
