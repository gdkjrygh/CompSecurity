// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.models.photos;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class PhotoResult
    implements Serializable
{

    private static final long serialVersionUID = 0x45f4dda495e9aeadL;
    private String CountryCode;
    private String DateTaken;
    private String Description;
    private Integer Id;
    private boolean IsDefault;
    private String LandscapeLink;
    private String LocationKey;
    private String PortraitLink;
    private String Source;
    private List links;
    private List tags;

    public PhotoResult()
    {
        tags = new ArrayList();
        links = new ArrayList();
    }

    public String getCountryCode()
    {
        return CountryCode;
    }

    public String getDateTaken()
    {
        return DateTaken;
    }

    public String getDescription()
    {
        return Description;
    }

    public Integer getId()
    {
        return Id;
    }

    public boolean getIsDefault()
    {
        return IsDefault;
    }

    public String getLandscapeLink()
    {
        return LandscapeLink;
    }

    public List getLinks()
    {
        return links;
    }

    public String getLocationKey()
    {
        return LocationKey;
    }

    public String getPortraitLink()
    {
        return PortraitLink;
    }

    public String getSource()
    {
        return Source;
    }

    public List getTags()
    {
        return tags;
    }

    public void setCountryCode(String s)
    {
        CountryCode = s;
    }

    public void setDateTaken(String s)
    {
        DateTaken = s;
    }

    public void setDescription(String s)
    {
        Description = s;
    }

    public void setId(Integer integer)
    {
        Id = integer;
    }

    public void setIsDefault(boolean flag)
    {
        IsDefault = flag;
    }

    public void setLandscapeLink(String s)
    {
        LandscapeLink = s;
    }

    public void setLinks(List list)
    {
        links = list;
    }

    public void setLocationKey(String s)
    {
        LocationKey = s;
    }

    public void setPortraitLink(String s)
    {
        PortraitLink = s;
    }

    public void setSource(String s)
    {
        Source = s;
    }

    public void setTags(List list)
    {
        tags = list;
    }
}
