// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.recommendation.myrecs;

import com.jcp.model.Product;

public class RecommendedProduct extends Product
{

    private String clickURL;
    private String imageURL;

    public RecommendedProduct()
    {
    }

    public String getClickURL()
    {
        return clickURL;
    }

    public String getImageURL()
    {
        return imageURL;
    }

    public void setClickURL(String s)
    {
        clickURL = s;
    }

    public void setImageURL(String s)
    {
        imageURL = s;
    }
}
