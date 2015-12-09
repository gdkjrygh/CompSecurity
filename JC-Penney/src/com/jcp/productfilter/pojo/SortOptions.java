// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.productfilter.pojo;

import java.io.Serializable;

public class SortOptions
    implements Serializable
{

    private String name;
    private String order;
    private String selected;
    private String url;

    public SortOptions()
    {
    }

    public String getName()
    {
        return name;
    }

    public String getOrder()
    {
        return order;
    }

    public String getSelected()
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

    public void setOrder(String s)
    {
        order = s;
    }

    public void setSelected(String s)
    {
        selected = s;
    }

    public void setUrl(String s)
    {
        url = s;
    }
}
