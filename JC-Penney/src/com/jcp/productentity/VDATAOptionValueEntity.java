// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.productentity;

import java.io.Serializable;

public class VDATAOptionValueEntity
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    private String name;
    private boolean selected;
    private String url;
    private String value;

    public VDATAOptionValueEntity()
    {
    }

    public String getName()
    {
        return name;
    }

    public String getUrl()
    {
        return url;
    }

    public String getValue()
    {
        return value;
    }

    public boolean isSelected()
    {
        return selected;
    }

    public void setName(String s)
    {
        name = s;
    }

    public void setSelected(boolean flag)
    {
        selected = flag;
    }

    public void setUrl(String s)
    {
        url = s;
    }

    public void setValue(String s)
    {
        value = s;
    }
}
