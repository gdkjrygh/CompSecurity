// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.productentity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ServiceAgreementEntity
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    private String data;
    private String itemId;
    private String name;
    private List prices;
    private Boolean selected;
    private String url;

    public ServiceAgreementEntity()
    {
        prices = new ArrayList();
    }

    public String getData()
    {
        return data;
    }

    public String getItemId()
    {
        return itemId;
    }

    public String getName()
    {
        return name;
    }

    public List getPrices()
    {
        return prices;
    }

    public Boolean getSelected()
    {
        return selected;
    }

    public String getUrl()
    {
        return url;
    }

    public void setData(String s)
    {
        data = s;
    }

    public void setItemId(String s)
    {
        itemId = s;
    }

    public void setName(String s)
    {
        name = s;
    }

    public void setPrices(List list)
    {
        prices = list;
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
