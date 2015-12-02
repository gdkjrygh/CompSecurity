// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.alibaba.api.common.pojo;

import java.util.Date;
import java.util.List;

public class PromotionProductsInfo
{
    public static class PromotionProduct
    {

        public int discount;
        public Date gmtCreate;
        public Date gmtModified;
        private long id;
        public Integer lotNum;
        public String newMaxPrice;
        public String newMinPrice;
        public boolean offline;
        public String oldMaxPrice;
        public String oldMinPrice;
        public String packageType;
        public String productId;
        public String productImageUrl;
        public String productName;
        public long promotionId;
        public int sortIndex;
        public long subjectId;
        public String unitType;

        public PromotionProduct()
        {
        }
    }


    public int currentPage;
    public int pageSize;
    public List promotionProductList;
    public int totalNum;

    public PromotionProductsInfo()
    {
    }
}
