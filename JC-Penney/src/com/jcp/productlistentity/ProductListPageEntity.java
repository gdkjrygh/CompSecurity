// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.productlistentity;

import java.io.Serializable;

public class ProductListPageEntity
    implements Serializable
{

    private Integer number;
    private Boolean selected;
    private String url;

    public ProductListPageEntity()
    {
    }

    public Integer getNumber()
    {
        return number;
    }

    public Boolean getSelected()
    {
        return selected;
    }

    public String getUrl()
    {
        return url;
    }

    public void setNumber(Integer integer)
    {
        number = integer;
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
