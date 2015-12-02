// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.alibaba.api.superdeal.pojo;

import java.io.Serializable;
import java.util.List;

public class StoreRecommendResult
{
    public static class ProductItem
        implements Serializable
    {

        public String action;
        public String imgUrl;

        public ProductItem()
        {
        }
    }

    public static class StoreRecommendItem
        implements Serializable
    {

        public String feedbackRating;
        public List products;
        public String sellerAdminSeq;
        public String storeName;
        public String storeNumber;
        public String storePortrait;

        public StoreRecommendItem()
        {
        }
    }


    public String endTime;
    public int pageSize;
    public List storeCollectionItems;

    public StoreRecommendResult()
    {
    }
}
