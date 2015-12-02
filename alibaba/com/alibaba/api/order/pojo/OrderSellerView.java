// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.alibaba.api.order.pojo;

import com.alibaba.api.base.pojo.Amount;
import com.alibaba.api.base.pojo.FixedDiscountPromotion;
import java.util.List;

public class OrderSellerView
{

    public Amount availableProductAmount;
    public Amount availableProductTotalAmount;
    public long companyId;
    public String companyName;
    public FixedDiscountPromotion fixedDiscountPromotion;
    public Amount fixedDiscountSaveAmount;
    public List orderItems;
    public String orderUniqueId;
    public Amount savedFreightAmount;
    public long sellerAdminSeq;
    public Amount totalFreightAmount;

    public OrderSellerView()
    {
    }
}
