// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.productentity;

import java.util.ArrayList;
import java.util.List;

public class RecommendationsEntityContainer
{

    private String placement;
    private List products;
    private String strategyMessage;

    public RecommendationsEntityContainer(RecommendationsEntityContainer recommendationsentitycontainer)
    {
        products = new ArrayList();
    }

    public String getPlacement()
    {
        return placement;
    }

    public List getProducts()
    {
        return products;
    }

    public String getStrategyMessage()
    {
        return strategyMessage;
    }

    public void setPlacement(String s)
    {
        placement = s;
    }

    public void setProducts(List list)
    {
        products = list;
    }

    public void setStrategyMessage(String s)
    {
        strategyMessage = s;
    }
}
