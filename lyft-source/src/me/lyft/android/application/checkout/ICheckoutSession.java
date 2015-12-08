// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application.checkout;

import java.util.List;
import me.lyft.android.domain.payment.ChargeAccount;
import me.lyft.android.domain.payment.Coupon;
import rx.Observable;

public interface ICheckoutSession
{

    public abstract List getPayments();

    public abstract ChargeAccount getSelectedOrDefaultChargeAccount();

    public abstract Coupon getSelectedOrFirstEligibleCoupon();

    public abstract String getSelectedPaymentMethodId();

    public abstract int getSelectedTipAmount();

    public abstract Observable observeTipChange();

    public abstract boolean requireExpenseNote();

    public abstract void reset();

    public abstract void selectChargeAccount(String s);

    public abstract boolean selectCoupon(String s);

    public abstract void selectTip(int i);
}
