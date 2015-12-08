// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.models.photos;

import java.io.Serializable;

public class Category
    implements Serializable
{

    private static final long serialVersionUID = 0xaa55df32f15d1144L;
    private String Id;
    private Integer Priority;
    private boolean Required;
    private String Type;

    public Category()
    {
    }

    public String getId()
    {
        return Id;
    }

    public Integer getPriority()
    {
        return Priority;
    }

    public String getType()
    {
        return Type;
    }

    public boolean isRequired()
    {
        return Required;
    }

    public void setId(String s)
    {
        Id = s;
    }

    public void setPriority(Integer integer)
    {
        Priority = integer;
    }

    public void setRequired(boolean flag)
    {
        Required = flag;
    }

    public void setType(String s)
    {
        Type = s;
    }
}
