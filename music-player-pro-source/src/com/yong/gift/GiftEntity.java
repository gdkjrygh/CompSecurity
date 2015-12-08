// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.yong.gift;


public class GiftEntity
{

    private String detailed;
    private String icon_imagePath;
    private int id;
    private String marketUrl;
    private String title;

    public GiftEntity()
    {
        icon_imagePath = "";
    }

    public String getDetailed()
    {
        return detailed;
    }

    public String getIcon_imagePath()
    {
        return icon_imagePath;
    }

    public int getId()
    {
        return id;
    }

    public String getMarketUrl()
    {
        return marketUrl;
    }

    public String getTitle()
    {
        return title;
    }

    public void setDetailed(String s)
    {
        detailed = s;
    }

    public void setIcon_imagePath(String s)
    {
        icon_imagePath = s;
    }

    public void setId(int i)
    {
        id = i;
    }

    public void setMarketUrl(String s)
    {
        marketUrl = s;
    }

    public void setTitle(String s)
    {
        title = s;
    }
}
