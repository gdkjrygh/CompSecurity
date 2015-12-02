// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.alibaba.api.flashdeal.pojo;

import java.io.Serializable;
import java.util.ArrayList;

public class FlashdealDetailRecommendResult
{
    public static class BaseInfo
    {

        public String displayMaxPriceByPiece;
        public String id;
        public String imgURL;

        public BaseInfo()
        {
        }
    }

    public static class Product
        implements Serializable
    {

        public BaseInfo baseInfo;

        public Product()
        {
        }
    }


    public static final int VERSION = 1;
    public ArrayList products;

    public FlashdealDetailRecommendResult()
    {
    }
}
