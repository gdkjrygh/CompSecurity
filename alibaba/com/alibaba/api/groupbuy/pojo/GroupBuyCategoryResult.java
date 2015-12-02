// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.alibaba.api.groupbuy.pojo;

import java.io.Serializable;
import java.util.ArrayList;

public class GroupBuyCategoryResult
{
    public static class GroupBuyBanner
        implements Serializable
    {

        public String groupBannerImage;
        public String groupBannerUrl;

        public GroupBuyBanner()
        {
        }
    }

    public static class GroupBuyCategory
        implements Serializable
    {

        public long categoryId;
        public String categoryKeyName;
        public String categoryShowName;

        public GroupBuyCategory()
        {
        }
    }


    public ArrayList groupBuyCategoryList;
    public GroupBuyBanner mobileGroupBuyBannerDTO;

    public GroupBuyCategoryResult()
    {
    }
}
