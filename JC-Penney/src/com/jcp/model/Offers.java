// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.model;


public class Offers
{

    private String description;
    private String name;

    public Offers()
    {
    }

    public String getDescription()
    {
        if (description != null)
        {
            return description;
        } else
        {
            return "";
        }
    }

    public String getName()
    {
        if (name != null)
        {
            return name;
        } else
        {
            return "";
        }
    }

    public void setDescription(String s)
    {
        description = s;
    }

    public void setName(String s)
    {
        name = s;
    }
}
