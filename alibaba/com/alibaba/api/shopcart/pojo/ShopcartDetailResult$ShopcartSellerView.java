// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.alibaba.api.shopcart.pojo;

import com.alibaba.api.base.pojo.Amount;
import com.alibaba.api.base.pojo.FixedDiscountPromotion;
import java.util.List;

// Referenced classes of package com.alibaba.api.shopcart.pojo:
//            ShopcartDetailResult

public static class 
{

    public Amount availableProductAmount;
    public Amount availableProductTotalAmount;
    public long companyId;
    public String companyName;
    public Integer couponCount;
    public FixedDiscountPromotion fixedDiscountPromotion;
    public Amount fixedDiscountSaveAmount;
    public boolean hasCoupon;
    public Amount previewProductTotalAmount;
    public Amount savedFreightAmount;
    public long sellerAdminSeq;
    public String sellerCountryCode;
    public List shopcartItems;
    public Amount totalFreightAmount;

    public ()
    {
    }
}
