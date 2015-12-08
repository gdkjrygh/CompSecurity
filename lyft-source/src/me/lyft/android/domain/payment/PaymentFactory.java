// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.domain.payment;

import me.lyft.android.common.Preconditions;

// Referenced classes of package me.lyft.android.domain.payment:
//            IPaymentFactory, CouponPayment, ChargeAccount, PayPalPayment, 
//            ChargeAccountPayment, SplitFarePayment, Money

public class PaymentFactory
    implements IPaymentFactory
{

    private IPaymentFactory.IPaymentMetadataProvider metadataProvider;

    public PaymentFactory(IPaymentFactory.IPaymentMetadataProvider ipaymentmetadataprovider)
    {
        Preconditions.checkNotNull(ipaymentmetadataprovider);
        metadataProvider = ipaymentmetadataprovider;
    }

    public CouponPayment createCouponPayment(String s, Money money)
    {
        return new CouponPayment(s, money);
    }

    public ChargeAccountPayment createPayment(ChargeAccount chargeaccount, Money money)
    {
        if (chargeaccount.isPayPal())
        {
            chargeaccount = new PayPalPayment(chargeaccount.getId(), money);
        } else
        {
            chargeaccount = new ChargeAccountPayment(chargeaccount.getId(), money);
        }
        metadataProvider.provideMetadata(chargeaccount);
        return chargeaccount;
    }

    public SplitFarePayment createSplitFarePayment(Money money)
    {
        return new SplitFarePayment(money);
    }
}
