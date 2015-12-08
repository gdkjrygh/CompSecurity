// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.flickrjandroid.collections;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Collection
{

    private int childCount;
    private final List collections = new ArrayList();
    private Date dateCreate;
    private String description;
    private String iconLarge;
    private String iconSmall;
    private String id;
    private final List photoSets = new ArrayList();
    private String secret;
    private String server;
    private String title;

    public Collection()
    {
    }

    public int getChildCount()
    {
        return childCount;
    }

    public List getCollections()
    {
        return collections;
    }

    public Date getDateCreate()
    {
        return dateCreate;
    }

    public String getDescription()
    {
        return description;
    }

    public String getIconLarge()
    {
        return iconLarge;
    }

    public String getIconSmall()
    {
        return iconSmall;
    }

    public String getId()
    {
        return id;
    }

    public List getPhotoSets()
    {
        return photoSets;
    }

    public String getSecret()
    {
        return secret;
    }

    public String getServer()
    {
        return server;
    }

    public String getTitle()
    {
        return title;
    }

    public void setChildCount(int i)
    {
        childCount = i;
    }

    public void setDateCreate(String s)
    {
        if (s == null || "".equals(s))
        {
            return;
        } else
        {
            setDateCreate(new Date(Long.parseLong(s) * 1000L));
            return;
        }
    }

    public void setDateCreate(Date date)
    {
        dateCreate = date;
    }

    public void setDescription(String s)
    {
        description = s;
    }

    public void setIconLarge(String s)
    {
        iconLarge = s;
    }

    public void setIconSmall(String s)
    {
        iconSmall = s;
    }

    public void setId(String s)
    {
        id = s;
    }

    public void setSecret(String s)
    {
        secret = s;
    }

    public void setServer(String s)
    {
        server = s;
    }

    public void setTitle(String s)
    {
        title = s;
    }
}
