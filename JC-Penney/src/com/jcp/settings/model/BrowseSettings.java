// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.settings.model;


public class BrowseSettings
{

    private Integer maxItemsPerPage;

    public BrowseSettings()
    {
        maxItemsPerPage = Integer.valueOf(-1);
    }

    public Integer getMaxItemsPerPage()
    {
        return maxItemsPerPage;
    }

    public void setMaxItemsPerPage(Integer integer)
    {
        maxItemsPerPage = integer;
    }
}
