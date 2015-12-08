// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.commerce.viewmodel;

import java.util.Map;

public class VariantRowItem
{

    private boolean isInStock;
    private Map options;
    private String price;
    private String title;
    private com.pinterest.api.model.BuyableProduct.Variant variant;

    public VariantRowItem(String s, String s1, boolean flag, Map map, com.pinterest.api.model.BuyableProduct.Variant variant1)
    {
        title = s;
        price = s1;
        isInStock = flag;
        options = map;
        variant = variant1;
    }

    public Map getOptions()
    {
        return options;
    }

    public String getPrice()
    {
        return price;
    }

    public String getTitle()
    {
        return title;
    }

    public com.pinterest.api.model.BuyableProduct.Variant getVariant()
    {
        return variant;
    }

    public boolean isInStock()
    {
        return isInStock;
    }
}
