// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.recommendation.placements;

import java.util.List;

public class Placements
{

    private String htmlElementId;
    private String placement;
    private String placementType;
    private List recommendedProducts;
    private String strategyMessage;

    public Placements()
    {
    }

    public String getHtmlElementId()
    {
        return htmlElementId;
    }

    public String getPlacement()
    {
        return placement;
    }

    public String getPlacementType()
    {
        return placementType;
    }

    public List getRecommendedProducts()
    {
        return recommendedProducts;
    }

    public String getStrategyMessage()
    {
        return strategyMessage;
    }

    public void setHtmlElementId(String s)
    {
        htmlElementId = s;
    }

    public void setPlacement(String s)
    {
        placement = s;
    }

    public void setPlacementType(String s)
    {
        placementType = s;
    }

    public void setRecommendedProducts(List list)
    {
        recommendedProducts = list;
    }

    public void setStrategyMessage(String s)
    {
        strategyMessage = s;
    }
}
