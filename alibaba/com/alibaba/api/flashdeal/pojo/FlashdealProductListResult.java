// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.alibaba.api.flashdeal.pojo;

import java.io.Serializable;
import java.util.ArrayList;

public class FlashdealProductListResult
{
    public static class CurrencyPrice
        implements Serializable
    {

        public String originalPrice;
        public String price;

        public CurrencyPrice()
        {
        }
    }

    public static class FlashDealProduct
        implements Serializable
    {

        public long canOrderStock;
        public CurrencyPrice currencyPrice;
        public long discount;
        public boolean isSoldOut;
        public String ppStartDate;
        public String productDetailUrl;
        public long productId;
        public String productName;
        public long promotionId;
        public String promotionImgUrl;
        public int stock;

        public FlashDealProduct()
        {
            productId = -1L;
        }
    }


    public static final int VERSION = 1;
    public int pageSize;
    public ArrayList productList;
    public long totalItem;
    public int totalPage;

    public FlashdealProductListResult()
    {
    }
}
