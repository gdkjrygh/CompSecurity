// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.mobilesafe.opti.sysclear.model;

import java.io.Serializable;

public class Item
    implements Serializable
{

    private String a;
    private int b;
    private int c;

    public Item()
    {
    }

    public int getCategory()
    {
        return c;
    }

    public int getFlag()
    {
        return b;
    }

    public String getName()
    {
        return a;
    }

    public void setCategory(int i)
    {
        c = i;
    }

    public void setFlag(int i)
    {
        b = i;
    }

    public void setName(String s)
    {
        a = s;
    }

    public String toString()
    {
        return (new StringBuilder("name=")).append(a).append("  flag=").append(b).append("  category=").append(c).toString();
    }
}
