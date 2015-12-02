// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.alibaba.api.flashdeal.pojo;

import java.io.Serializable;
import java.util.ArrayList;

public class FlashdealProductListNewResult
{
    public static class FlashDealProductNew
        implements Serializable
    {

        public long canOrderStock;
        public long discount;
        public boolean isSoldOut;
        public String originalPriceCurrency;
        public String ppStartDate;
        public String priceCurrency;
        public long productId;
        public long promotionId;
        public String promotionImgUrl;
        public String promotionType;
        public long sellerAdminSeq;
        public int stock;
        public String subject;

        public FlashDealProductNew()
        {
            productId = -1L;
        }
    }


    public static final int VERSION = 1;
    public ArrayList mobilePromotionProductList;
    public int pageSize;
    public long totalItem;
    public int totalPage;

    public FlashdealProductListNewResult()
    {
    }
}
