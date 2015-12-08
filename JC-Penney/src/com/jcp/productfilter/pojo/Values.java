// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.productfilter.pojo;

import java.io.Serializable;

public class Values
    implements Serializable
{

    private String available;
    private String count;
    private String dimensions;
    private String id;
    private String imageURL;
    private String name;
    private String selected;
    private boolean selectedStatus;
    private String url;

    public Values()
    {
    }

    public String getAvailable()
    {
        return available;
    }

    public String getCount()
    {
        return count;
    }

    public String getDimensions()
    {
        return dimensions;
    }

    public String getId()
    {
        return id;
    }

    public String getImageURL()
    {
        return imageURL;
    }

    public String getName()
    {
        return name;
    }

    public String getSelected()
    {
        return selected;
    }

    public String getUrl()
    {
        return url;
    }

    public boolean isSelectedStatus()
    {
        return selectedStatus;
    }

    public void setAvailable(String s)
    {
        available = s;
    }

    public void setCount(String s)
    {
        count = s;
    }

    public void setDimensions(String s)
    {
        dimensions = s;
    }

    public void setId(String s)
    {
        id = s;
    }

    public void setImageURL(String s)
    {
        imageURL = s;
    }

    public void setName(String s)
    {
        name = s;
    }

    public void setSelected(String s)
    {
        selected = s;
    }

    public void setSelectedStatus(boolean flag)
    {
        selectedStatus = flag;
    }

    public void setUrl(String s)
    {
        url = s;
    }
}
