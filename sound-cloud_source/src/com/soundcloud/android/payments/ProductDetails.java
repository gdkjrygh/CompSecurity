// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.payments;


public class ProductDetails
{

    private final String description;
    private final String id;
    private final String price;
    private final String title;

    public ProductDetails(String s, String s1, String s2, String s3)
    {
        id = s;
        title = s1;
        description = s2;
        price = s3;
    }

    public String getDescription()
    {
        return description;
    }

    public String getId()
    {
        return id;
    }

    public String getPrice()
    {
        return price;
    }

    public String getTitle()
    {
        return title;
    }
}
