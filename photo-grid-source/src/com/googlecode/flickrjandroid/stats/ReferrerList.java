// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.flickrjandroid.stats;

import com.googlecode.flickrjandroid.SearchResultList;

public class ReferrerList extends SearchResultList
{

    private static final long serialVersionUID = 1L;
    private String name;

    public ReferrerList()
    {
    }

    public String getName()
    {
        return name;
    }

    public void setName(String s)
    {
        name = s;
    }
}
