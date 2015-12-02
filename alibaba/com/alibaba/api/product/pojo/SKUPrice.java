// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.alibaba.api.product.pojo;

import com.alibaba.api.base.pojo.Amount;

public class SKUPrice
{
    public static class SkuActivityPriceVO
    {

        public boolean isDisplayBulkPrice;
        public Amount previewSkuActivityAmount;
        public Amount priviewSkuActivityBulkAmount;
        public Amount skuActivityAmount;
        public Amount skuActivityBulkAmount;
        public int skuActivityStock;
        public String skuSoldQuantity;

        public SkuActivityPriceVO()
        {
        }
    }


    public int deliveryTime;
    public boolean isActivityProduct;
    public boolean isSkuBulk;
    public Amount previewSkuAmount;
    public Amount previewSkuBulkAmount;
    public long productId;
    public long sellerAdminSeq;
    public SkuActivityPriceVO skuActivityPriceVO;
    public Amount skuAmount;
    public String skuAttr;
    public Amount skuBulkAmount;
    public int skuBulkDiscount;
    public int skuBulkOrder;
    public String skuImage;
    public String skuPerPiecePrice;
    public String skuPropertyIds;
    public int skuStock;

    public SKUPrice()
    {
    }
}
