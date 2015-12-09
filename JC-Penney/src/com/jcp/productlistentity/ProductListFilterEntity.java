// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.productlistentity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ProductListFilterEntity
    implements Serializable
{

    private String id;
    private String name;
    private String type;
    private List values;

    public ProductListFilterEntity()
    {
        values = new ArrayList();
    }

    public String getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public String getType()
    {
        return type;
    }

    public List getValues()
    {
        return values;
    }

    public void setId(String s)
    {
        id = s;
    }

    public void setName(String s)
    {
        name = s;
    }

    public void setType(String s)
    {
        type = s;
    }

    public void setValues(List list)
    {
        values = list;
    }
}
