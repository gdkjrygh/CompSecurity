// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.domain.payment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import me.lyft.android.common.Preconditions;
import me.lyft.android.infrastructure.lyft.payment.PaymentDTO;

// Referenced classes of package me.lyft.android.domain.payment:
//            Payment, MoneyMapper, PayPalPayment, ChargeAccountPayment, 
//            CouponPayment, SplitFarePayment

public class PaymentMapper
{

    public PaymentMapper()
    {
    }

    public static List fromPaymentDomain(List list)
    {
        ArrayList arraylist = new ArrayList();
        for (list = list.iterator(); list.hasNext(); arraylist.add(fromPaymentDomain((Payment)list.next()))) { }
        return arraylist;
    }

    public static PaymentDTO fromPaymentDomain(Payment payment)
    {
        Preconditions.checkNotNull(payment);
        return new PaymentDTO(resolvePaymentMethodFromPayment(payment), resolveChargeAccountOrCouponId(payment), MoneyMapper.fromMoneyDomain(payment.getMoney()), getChargeToken(payment));
    }

    private static String getChargeToken(Payment payment)
    {
        if (payment instanceof PayPalPayment)
        {
            return ((PayPalPayment)payment).getChargeToken();
        } else
        {
            return null;
        }
    }

    static String resolveChargeAccountOrCouponId(Payment payment)
    {
        if (payment instanceof ChargeAccountPayment)
        {
            return ((ChargeAccountPayment)payment).getChargeAccountId();
        }
        if (payment instanceof CouponPayment)
        {
            return ((CouponPayment)payment).getCouponId();
        } else
        {
            return null;
        }
    }

    static me.lyft.android.infrastructure.lyft.payment.PaymentDTO.PaymentMethod resolvePaymentMethodFromPayment(Payment payment)
    {
        if (payment instanceof ChargeAccountPayment)
        {
            return me.lyft.android.infrastructure.lyft.payment.PaymentDTO.PaymentMethod.CHARGE_ACCOUNT;
        }
        if (payment instanceof CouponPayment)
        {
            return me.lyft.android.infrastructure.lyft.payment.PaymentDTO.PaymentMethod.COUPON;
        }
        if (payment instanceof SplitFarePayment)
        {
            return me.lyft.android.infrastructure.lyft.payment.PaymentDTO.PaymentMethod.SPLIT_FARE;
        }
        if (payment == null)
        {
            payment = "null";
        } else
        {
            payment = payment.getClass().getSimpleName();
        }
        throw new IllegalArgumentException((new StringBuilder()).append("Unknown payment type ").append(payment).toString());
    }
}
