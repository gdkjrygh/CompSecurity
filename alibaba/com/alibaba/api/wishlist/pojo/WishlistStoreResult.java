// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.alibaba.api.wishlist.pojo;

import java.util.ArrayList;

public class WishlistStoreResult
{
    public static class WishlistStore
    {

        public boolean aplus;
        public long companyId;
        public int feedbackScore;
        public long id;
        public String logoUrl;
        public long memberSeq;
        public long sellerMemberSeq;
        public String storeName;
        public long storeNo;
        public String wishDate;

        public WishlistStore()
        {
        }
    }


    public static final int VERSION = 1;
    public int pageSize;
    public ArrayList resultList;
    public int totalNum;

    public WishlistStoreResult()
    {
    }
}
