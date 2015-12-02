// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.alibaba.api.shopcart.pojo;

import com.alibaba.api.base.pojo.BaseProductView;
import com.alibaba.api.base.pojo.FreightView;
import com.alibaba.api.base.pojo.PromotionView;

public class ShopcartItemView
{

    public BaseProductView baseProductView;
    public FreightView freightView;
    public boolean hasError;
    public boolean hasWarning;
    public boolean isBigSaleItem;
    public String itemMsg;
    public String mbExclusiveFlag;
    public PromotionView promotionView;

    public ShopcartItemView()
    {
    }
}
