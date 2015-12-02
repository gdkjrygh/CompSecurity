// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.alibaba.api.order.pojo;

import com.alibaba.api.base.pojo.Amount;
import com.alibaba.api.base.pojo.BaseProductView;
import com.alibaba.api.base.pojo.FixedDiscountPromotion;
import com.alibaba.api.base.pojo.FreightView;
import com.alibaba.api.base.pojo.PromotionView;

public class OrderConfirmView
{

    public Amount availableProductAmount;
    public Amount availableProductTotalAmount;
    public BaseProductView baseProductView;
    public long companyId;
    public String companyName;
    public FixedDiscountPromotion fixedDiscountPromotion;
    public Amount fixedDiscountSaveAmount;
    public FreightView freightView;
    public boolean hasError;
    public boolean hasWarning;
    public boolean isSuccess;
    public String itemMsg;
    public String mbExclusiveFlag;
    public String orderUniqueId;
    public String productJsonString;
    public PromotionView promotionView;
    public Amount savedFreightAmount;
    public long sellerAdminSeq;
    public OrderConfirmView subTotalProductView;
    public Amount totalFreightAmount;
    public int viewType;

    public OrderConfirmView()
    {
    }
}
