// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.domain.payment;


// Referenced classes of package me.lyft.android.domain.payment:
//            Payment, Money

public class CouponPayment extends Payment
{

    private final String couponId;

    public CouponPayment(String s, Money money)
    {
        super(money);
        couponId = s;
    }

    public String getCouponId()
    {
        return couponId;
    }
}
