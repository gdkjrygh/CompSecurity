// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.searchentity;

import java.io.Serializable;

public class SearchRedirectUrl
    implements Serializable
{

    private String channel;
    private String searchUrl;
    private String url;

    public SearchRedirectUrl()
    {
    }

    public String getChannel()
    {
        return channel;
    }

    public String getSearchUrl()
    {
        return searchUrl;
    }

    public String getUrl()
    {
        return url;
    }

    public void setChannel(String s)
    {
        channel = s;
    }

    public void setSearchUrl(String s)
    {
        searchUrl = s;
    }

    public void setUrl(String s)
    {
        url = s;
    }
}
