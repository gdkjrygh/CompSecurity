// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.flickrjandroid.groups;

import java.util.Collection;

public class Category
{

    public static final long serialVersionUID = 12L;
    private Collection groups;
    private String name;
    private String path;
    private String pathIds;
    private Collection subcategories;

    public Category()
    {
    }

    public Collection getGroups()
    {
        return groups;
    }

    public String getName()
    {
        return name;
    }

    public String getPath()
    {
        return path;
    }

    public String getPathIds()
    {
        return pathIds;
    }

    public Collection getSubcategories()
    {
        return subcategories;
    }

    public void setGroups(Collection collection)
    {
        groups = collection;
    }

    public void setName(String s)
    {
        name = s;
    }

    public void setPath(String s)
    {
        path = s;
    }

    public void setPathIds(String s)
    {
        pathIds = s;
    }

    public void setSubcategories(Collection collection)
    {
        subcategories = collection;
    }
}
