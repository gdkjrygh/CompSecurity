// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.model;

import java.util.List;

public class LocalAdsCatalogs
{

    private List adsCatalogs;
    private String promotionType;

    public LocalAdsCatalogs(String s, List list)
    {
        promotionType = s;
        adsCatalogs = list;
    }

    public List getAdsCatalogs()
    {
        return adsCatalogs;
    }

    public String getPromotionType()
    {
        return promotionType;
    }
}
