// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.flickrjandroid.stats;

import java.net.URL;

public class Referrer
{

    private String searchterm;
    private URL url;
    private int views;

    public Referrer()
    {
    }

    public String getSearchterm()
    {
        return searchterm;
    }

    public URL getUrl()
    {
        return url;
    }

    public int getViews()
    {
        return views;
    }

    public void setSearchterm(String s)
    {
        searchterm = s;
    }

    public void setUrl(URL url1)
    {
        url = url1;
    }

    public void setViews(int i)
    {
        views = i;
    }
}
