// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.model;


public class State
{

    private String abbreviation;
    private String name;

    public State()
    {
    }

    public String getAbbreviation()
    {
        return abbreviation;
    }

    public String getName()
    {
        return name;
    }

    public void setAbbreviation(String s)
    {
        abbreviation = s;
    }

    public void setName(String s)
    {
        name = s;
    }

    public String toString()
    {
        return getAbbreviation();
    }
}
