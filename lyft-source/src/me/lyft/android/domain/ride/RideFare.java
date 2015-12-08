// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.domain.ride;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import me.lyft.android.common.Iterables;
import me.lyft.android.common.Objects;
import me.lyft.android.common.Strings;
import me.lyft.android.domain.payment.Coupon;
import me.lyft.android.domain.payment.Money;
import me.lyft.android.domain.payment.NullMoney;

public class RideFare
{

    private static final RideFare EMPTY = new RideFare(0, NullMoney.getInstance(), Collections.emptyList());
    private final int maximumContributors;
    private final Money totalMoney;
    private final List validCoupons;

    public RideFare(int i, Money money, List list)
    {
        maximumContributors = i;
        totalMoney = money;
        validCoupons = list;
    }

    public static RideFare empty()
    {
        return EMPTY;
    }

    private List getValidCoupons()
    {
        return (List)Objects.firstNonNull(validCoupons, Collections.emptyList());
    }

    public Coupon findValidCouponById(String s)
    {
        if (Strings.isNullOrEmpty(s))
        {
            return null;
        }
        for (Iterator iterator = getValidCoupons().iterator(); iterator.hasNext();)
        {
            Coupon coupon = (Coupon)iterator.next();
            if (coupon.getId().equalsIgnoreCase(s))
            {
                return coupon;
            }
        }

        return null;
    }

    public Coupon getFirstValidCoupon()
    {
        return (Coupon)Iterables.firstOrDefault(getValidCoupons(), null);
    }

    public int getMaximumContributors()
    {
        return maximumContributors;
    }

    public Money getTotalMoney()
    {
        return (Money)Objects.firstNonNull(totalMoney, NullMoney.getInstance());
    }

    public boolean isCouponAvailableForRide(String s)
    {
        return findValidCouponById(s) != null;
    }

}
