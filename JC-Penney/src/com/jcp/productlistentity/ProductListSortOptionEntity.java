// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.productlistentity;

import java.io.Serializable;

public class ProductListSortOptionEntity
    implements Serializable
{

    private String name;
    private Integer order;
    private Boolean selected;
    private String url;

    public ProductListSortOptionEntity()
    {
    }

    public String getName()
    {
        return name;
    }

    public Integer getOrder()
    {
        return order;
    }

    public Boolean getSelected()
    {
        return selected;
    }

    public String getUrl()
    {
        return url;
    }

    public void setName(String s)
    {
        name = s;
    }

    public void setOrder(Integer integer)
    {
        order = integer;
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
