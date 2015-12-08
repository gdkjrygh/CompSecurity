// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.productentity;

import java.io.Serializable;

public class AttributesList
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    private String type;
    private String value;

    public AttributesList()
    {
    }

    public String getType()
    {
        return type;
    }

    public String getValue()
    {
        return value;
    }

    public void setType(String s)
    {
        type = s;
    }

    public void setValue(String s)
    {
        value = s;
    }
}
