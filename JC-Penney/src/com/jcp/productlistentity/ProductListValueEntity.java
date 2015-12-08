// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.productlistentity;

import java.io.Serializable;

public class ProductListValueEntity
    implements Serializable
{

    private Boolean available;
    private Integer count;
    private String id;
    private String imageURL;
    private String name;
    private Boolean selected;
    private String url;

    public ProductListValueEntity()
    {
    }

    public Boolean getAvailable()
    {
        return available;
    }

    public Integer getCount()
    {
        return count;
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

    public Boolean getSelected()
    {
        return selected;
    }

    public String getUrl()
    {
        return url;
    }

    public void setAvailable(Boolean boolean1)
    {
        available = boolean1;
    }

    public void setCount(Integer integer)
    {
        count = integer;
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

    public void setSelected(Boolean boolean1)
    {
        selected = boolean1;
    }

    public void setUrl(String s)
    {
        url = s;
    }
}
