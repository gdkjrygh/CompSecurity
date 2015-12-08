// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.auditude.ads.network.vast.model;

import com.auditude.ads.util.StringUtil;
import java.util.ArrayList;

public class VASTClick
{

    private ArrayList customClickUrls;
    private ArrayList trackingUrls;
    private String url;

    public VASTClick()
    {
    }

    public final void addClickTrackingUrl(String s)
    {
        if (StringUtil.isNullOrEmpty(s))
        {
            return;
        }
        if (trackingUrls == null)
        {
            trackingUrls = new ArrayList();
        }
        trackingUrls.add(s);
    }

    public final void addCustomClickUrl(String s)
    {
        if (StringUtil.isNullOrEmpty(s))
        {
            return;
        }
        if (customClickUrls == null)
        {
            customClickUrls = new ArrayList();
        }
        customClickUrls.add(s);
    }

    public final ArrayList getCustomClickUrls()
    {
        return customClickUrls;
    }

    public final ArrayList getTrackingUrls()
    {
        return trackingUrls;
    }

    public final String getUrl()
    {
        return url;
    }

    public final void setCustomClickUrls(ArrayList arraylist)
    {
        customClickUrls = arraylist;
    }

    public final void setTrackingUrls(ArrayList arraylist)
    {
        trackingUrls = arraylist;
    }

    public final void setUrl(String s)
    {
        url = s;
    }
}
