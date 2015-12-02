// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.alibaba.api.flashdeal.pojo;

import java.io.Serializable;
import java.util.ArrayList;

public class FlashdealExpiredProductListResult
{
    public static class FlashDealExpiredProduct
        implements Serializable
    {

        public long discount;
        public String originalPriceCurrency;
        public String ppStartDate;
        public String priceCurrency;
        public String productDetailUrl;
        public long productId;
        public long promotionId;
        public String promotionImgUrl;
        public int stock;
        public String subject;

        public FlashDealExpiredProduct()
        {
            productId = -1L;
        }
    }


    public static final int VERSION = 1;
    public ArrayList gagaProductList;
    public int pageSize;
    public long totalItem;
    public int totalPage;

    public FlashdealExpiredProductListResult()
    {
    }
}
