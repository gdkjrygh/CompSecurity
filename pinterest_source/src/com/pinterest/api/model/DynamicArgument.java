// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.model;


public class DynamicArgument
{

    private String id;
    private String render;
    private String type;

    public DynamicArgument()
    {
    }

    public DynamicArgument(String s, String s1, String s2)
    {
        type = s;
        id = s1;
        render = s2;
    }

    public String getId()
    {
        return id;
    }

    public String getRender()
    {
        return render;
    }

    public String getType()
    {
        return type;
    }

    public void setId(String s)
    {
        id = s;
    }

    public void setRender(String s)
    {
        render = s;
    }

    public void setType(String s)
    {
        type = s;
    }
}
