// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.productentity;

import java.io.Serializable;

public class WarrantyEntity
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    private String data;
    private String description;
    private String name;
    private String referenceNumber;
    private Boolean selected;
    private String title;

    public WarrantyEntity()
    {
    }

    public String getData()
    {
        return data;
    }

    public String getDescription()
    {
        return description;
    }

    public String getName()
    {
        return name;
    }

    public String getReferenceNumber()
    {
        return referenceNumber;
    }

    public Boolean getSelected()
    {
        return selected;
    }

    public String getTitle()
    {
        return title;
    }

    public void setData(String s)
    {
        data = s;
    }

    public void setDescription(String s)
    {
        description = s;
    }

    public void setName(String s)
    {
        name = s;
    }

    public void setReferenceNumber(String s)
    {
        referenceNumber = s;
    }

    public void setSelected(Boolean boolean1)
    {
        selected = boolean1;
    }

    public void setTitle(String s)
    {
        title = s;
    }
}
