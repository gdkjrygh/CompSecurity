// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.iap.internal.model;

import com.amazon.device.iap.model.Product;
import com.amazon.device.iap.model.ProductType;

public class ProductBuilder
{

    private String description;
    private String price;
    private ProductType productType;
    private String sku;
    private String smallIconUrl;
    private String title;

    public ProductBuilder()
    {
    }

    public Product build()
    {
        return new Product(this);
    }

    public String getDescription()
    {
        return description;
    }

    public String getPrice()
    {
        return price;
    }

    public ProductType getProductType()
    {
        return productType;
    }

    public String getSku()
    {
        return sku;
    }

    public String getSmallIconUrl()
    {
        return smallIconUrl;
    }

    public String getTitle()
    {
        return title;
    }

    public ProductBuilder setDescription(String s)
    {
        description = s;
        return this;
    }

    public ProductBuilder setPrice(String s)
    {
        price = s;
        return this;
    }

    public ProductBuilder setProductType(ProductType producttype)
    {
        productType = producttype;
        return this;
    }

    public ProductBuilder setSku(String s)
    {
        sku = s;
        return this;
    }

    public ProductBuilder setSmallIconUrl(String s)
    {
        smallIconUrl = s;
        return this;
    }

    public ProductBuilder setTitle(String s)
    {
        title = s;
        return this;
    }
}
