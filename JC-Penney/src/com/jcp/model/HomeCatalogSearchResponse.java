// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.model;

import java.util.List;

public class HomeCatalogSearchResponse
{

    private String promo;
    private Integer result;
    private List sku;
    private String type;

    public HomeCatalogSearchResponse()
    {
    }

    public String getPromo()
    {
        return promo;
    }

    public Integer getResult()
    {
        return result;
    }

    public List getSku()
    {
        return sku;
    }

    public String getType()
    {
        return type;
    }

    public void setPromo(String s)
    {
        promo = s;
    }

    public void setResult(Integer integer)
    {
        result = integer;
    }

    public void setSku(List list)
    {
        sku = list;
    }

    public void setType(String s)
    {
        type = s;
    }
}
