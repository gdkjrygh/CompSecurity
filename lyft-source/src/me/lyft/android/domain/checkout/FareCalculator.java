// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.domain.checkout;

import java.util.ArrayList;
import java.util.List;
import me.lyft.android.domain.payment.ChargeAccount;
import me.lyft.android.domain.payment.Coupon;
import me.lyft.android.domain.payment.IPaymentFactory;
import me.lyft.android.domain.payment.Money;

public class FareCalculator
{

    private int contributorsIncludingUserCount;
    private IPaymentFactory paymentFactory;
    private Money rideTotal;
    private ChargeAccount selectedChargeAccount;
    private Coupon selectedCoupon;
    private Integer tip;

    public FareCalculator(IPaymentFactory ipaymentfactory)
    {
        paymentFactory = ipaymentfactory;
    }

    public List calculatePayments()
    {
        int j1 = 0;
        int j = rideTotal.getAmount().intValue();
        Object obj = rideTotal.getAmountCurrency();
        ArrayList arraylist;
        int i;
        boolean flag;
        int l;
        int i1;
        if (tip != null)
        {
            i = tip.intValue() + j;
        } else
        {
            i = j;
        }
        if (contributorsIncludingUserCount > 1)
        {
            int k = (int)Math.ceil((double)i / (double)contributorsIncludingUserCount);
            l = (int)Math.ceil((double)j / (double)contributorsIncludingUserCount);
            j = k;
            k = i;
            boolean flag1 = true;
            i = j;
            j = k;
            flag = flag1;
        } else
        {
            l = j;
            flag = false;
        }
        i1 = i;
        if (selectedCoupon != null)
        {
            j1 = Math.min(selectedCoupon.getMoney().getAmount().intValue(), l);
            i1 = i - j1;
        }
        arraylist = new ArrayList();
        if (i1 >= 0)
        {
            Money money = Money.create(i1, ((String) (obj)));
            arraylist.add(paymentFactory.createPayment(selectedChargeAccount, money));
        }
        if (j1 > 0)
        {
            Money money1 = Money.create(j1, ((String) (obj)));
            arraylist.add(paymentFactory.createCouponPayment(selectedCoupon.getId(), money1));
        }
        if (flag)
        {
            obj = Money.create(j, ((String) (obj)));
            arraylist.add(paymentFactory.createSplitFarePayment(((Money) (obj))));
        }
        return arraylist;
    }

    public void setRideTotal(Money money)
    {
        rideTotal = money;
    }

    public void setSelectedChargeAccount(ChargeAccount chargeaccount)
    {
        selectedChargeAccount = chargeaccount;
    }

    public void setSelectedCoupon(Coupon coupon)
    {
        selectedCoupon = coupon;
    }

    public void setTip(Integer integer)
    {
        tip = integer;
    }

    public void setTotalContributorsCount(int i)
    {
        contributorsIncludingUserCount = i;
    }
}
