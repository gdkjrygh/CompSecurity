// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.flickrjandroid;


public class Parameter
{

    private String name;
    private Object value;

    public Parameter(String s, long l)
    {
        name = s;
        value = new Long(l);
    }

    public Parameter(String s, Object obj)
    {
        name = s;
        value = obj;
    }

    public String getName()
    {
        return name;
    }

    public Object getValue()
    {
        return value;
    }

    public String toString()
    {
        return (new StringBuilder("Parameter [name=")).append(name).append(", value=").append(value).append("]").toString();
    }
}
