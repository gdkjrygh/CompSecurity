// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.productentity;

import java.io.Serializable;

public class Videos
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    private String href;
    private String id;
    private String type;

    public Videos()
    {
    }

    public String getHref()
    {
        return href;
    }

    public String getId()
    {
        return id;
    }

    public String getType()
    {
        return type;
    }

    public void setHref(String s)
    {
        href = s;
    }

    public void setId(String s)
    {
        id = s;
    }

    public void setType(String s)
    {
        type = s;
    }
}
