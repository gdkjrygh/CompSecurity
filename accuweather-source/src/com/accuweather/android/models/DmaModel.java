// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.models;

import java.io.Serializable;

public class DmaModel
    implements Serializable
{

    private static final long serialVersionUID = 0x51bd7d54144c628fL;
    private String marketId;
    private String mobileLogo;
    private String mobileUrl;

    public DmaModel()
    {
        marketId = "";
        mobileLogo = "";
        mobileUrl = "";
    }

    public String getMarketId()
    {
        return marketId;
    }

    public String getMobileLogo()
    {
        return mobileLogo;
    }

    public String getMobileUrl()
    {
        return mobileUrl;
    }

    public void setMarketId(String s)
    {
        marketId = s;
    }

    public void setMobileLogo(String s)
    {
        mobileLogo = s;
    }

    public void setMobileUrl(String s)
    {
        mobileUrl = s;
    }
}
