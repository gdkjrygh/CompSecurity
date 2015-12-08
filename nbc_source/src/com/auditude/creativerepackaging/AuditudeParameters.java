// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.auditude.creativerepackaging;


public class AuditudeParameters
{

    private String adId;
    private String domain;
    private String externalAdId;
    private int zoneId;

    public AuditudeParameters()
    {
    }

    public String getAdId()
    {
        return adId;
    }

    public String getDomain()
    {
        return domain;
    }

    public String getExternalAdId()
    {
        return externalAdId;
    }

    public int getZoneId()
    {
        return zoneId;
    }

    public void setAdId(String s)
    {
        adId = s;
    }

    public void setDomain(String s)
    {
        domain = s;
    }

    public void setExternalAdId(String s)
    {
        externalAdId = s;
    }

    public void setZoneId(int i)
    {
        zoneId = i;
    }
}
