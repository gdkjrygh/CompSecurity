// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.flickrjandroid.tags;

import java.util.ArrayList;
import java.util.List;

public class TagRaw
{

    private static final long serialVersionUID = 12L;
    String clean;
    String owner;
    List raw;

    public TagRaw()
    {
        raw = new ArrayList();
    }

    public void addRaw(String s)
    {
        raw.add(s);
    }

    public String getClean()
    {
        return clean;
    }

    public String getOwner()
    {
        return owner;
    }

    public List getRaw()
    {
        return raw;
    }

    public void setClean(String s)
    {
        clean = s;
    }

    public void setOwner(String s)
    {
        owner = s;
    }
}
