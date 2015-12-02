// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.alibaba.api.common.pojo;

import com.alibaba.api.base.pojo.Amount;
import java.util.Date;

// Referenced classes of package com.alibaba.api.common.pojo:
//            MobileAeCouponSellerShop

public class MobileAeCoupon
{

    public String couponId;
    public String currency;
    public double denomination;
    public Amount denominationAmount;
    public Date endDate;
    public boolean expired;
    public boolean mobileSpecial;
    public double orderAmountLimit;
    public Amount orderLimitAmount;
    public boolean sellerCoupon;
    public MobileAeCouponSellerShop shopInfo;
    public Date startDate;
    public String status;

    public MobileAeCoupon()
    {
    }
}
