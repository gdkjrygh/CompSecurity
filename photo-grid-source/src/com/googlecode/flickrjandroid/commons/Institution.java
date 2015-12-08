// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.flickrjandroid.commons;

import java.util.Date;

public class Institution
{

    public static final long serialVersionUID = 12L;
    private Date dateLaunch;
    private String flickrUrl;
    private String id;
    private String licenseUrl;
    private String name;
    private String siteUrl;

    public Institution()
    {
    }

    public Date getDateLaunch()
    {
        return dateLaunch;
    }

    public String getFlickrUrl()
    {
        return flickrUrl;
    }

    public String getId()
    {
        return id;
    }

    public String getLicenseUrl()
    {
        return licenseUrl;
    }

    public String getName()
    {
        return name;
    }

    public String getSiteUrl()
    {
        return siteUrl;
    }

    public void setDateLaunch(long l)
    {
        setDateLaunch(new Date(l));
    }

    public void setDateLaunch(String s)
    {
        if (s == null || "".equals(s))
        {
            return;
        } else
        {
            setDateLaunch(Long.parseLong(s) * 1000L);
            return;
        }
    }

    public void setDateLaunch(Date date)
    {
        dateLaunch = date;
    }

    public void setFlickrUrl(String s)
    {
        flickrUrl = s;
    }

    public void setId(String s)
    {
        id = s;
    }

    public void setLicenseUrl(String s)
    {
        licenseUrl = s;
    }

    public void setName(String s)
    {
        name = s;
    }

    public void setSiteUrl(String s)
    {
        siteUrl = s;
    }
}
