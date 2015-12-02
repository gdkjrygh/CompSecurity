// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.alibaba.api.order.pojo;

import com.alibaba.api.base.pojo.Amount;
import java.io.Serializable;
import java.util.Date;

// Referenced classes of package com.alibaba.api.order.pojo:
//            OrderConfirmResult

public static class 
    implements Serializable
{

    public String couponCode;
    public long couponId;
    public Amount discountAmount;
    public Date endDate;
    public String isMobileSpecial;
    public boolean isSelected;
    public String isSellerCoupon;
    public Amount orderLimitAmount;
    public Long sellerAdminSeq;
    public Date startDate;

    public ()
    {
    }
}
