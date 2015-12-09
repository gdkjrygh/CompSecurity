// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.productentity;

import java.io.Serializable;

public class OffersEntity
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    private String code;
    private String description;
    private String href;
    private String name;

    public OffersEntity()
    {
    }

    public String getCode()
    {
        return code;
    }

    public String getDescription()
    {
        return description;
    }

    public String getHref()
    {
        return href;
    }

    public String getName()
    {
        return name;
    }

    public void setCode(String s)
    {
        code = s;
    }

    public void setDescription(String s)
    {
        description = s;
    }

    public void setHref(String s)
    {
        href = s;
    }

    public void setName(String s)
    {
        name = s;
    }
}
