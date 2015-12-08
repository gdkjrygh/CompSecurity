// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.recommendation.myrecs;

import java.util.List;

public class StrategyResults
{

    private String message;
    private List recommendedProducts;
    private String strategyName;

    public StrategyResults()
    {
    }

    public String getMessage()
    {
        return message;
    }

    public List getRecommendedProducts()
    {
        return recommendedProducts;
    }

    public String getStrategyName()
    {
        return strategyName;
    }

    public void setMessage(String s)
    {
        message = s;
    }

    public void setRecommendedProducts(List list)
    {
        recommendedProducts = list;
    }

    public void setStrategyName(String s)
    {
        strategyName = s;
    }
}
