// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.models;

import com.dominos.android.sdk.core.models.coupon.Coupon;
import com.dominos.android.sdk.core.models.coupon.LabsCouponLine;

// Referenced classes of package com.dominos.android.sdk.core.models:
//            LabsProductLine

public class ProductCouponMatch
{

    private Coupon mCoupon;
    private LabsCouponLine mCouponLine;
    private LabsProductLine mProductLine;

    public ProductCouponMatch(LabsProductLine labsproductline)
    {
        mProductLine = labsproductline;
    }

    public Coupon getCouponDetail()
    {
        return mCoupon;
    }

    public LabsCouponLine getCouponLine()
    {
        return mCouponLine;
    }

    public LabsProductLine getProductLine()
    {
        return mProductLine;
    }

    public boolean isProductAvailable()
    {
        return mCoupon == null;
    }

    public void setCouponRelation(Coupon coupon, LabsCouponLine labscouponline)
    {
        mCoupon = coupon;
        mCouponLine = labscouponline;
    }

    public void setProductLine(LabsProductLine labsproductline)
    {
        mProductLine = labsproductline;
    }
}
