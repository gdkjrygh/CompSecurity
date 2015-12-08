// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.flickrjandroid.photos.comments;

import java.util.Date;

public class Comment
{

    private static final long serialVersionUID = 12L;
    String author;
    String authorName;
    Date dateCreate;
    int iconFarm;
    int iconServer;
    String id;
    String permaLink;
    String text;

    public Comment()
    {
    }

    public String getAuthor()
    {
        return author;
    }

    public String getAuthorName()
    {
        return authorName;
    }

    public Date getDateCreate()
    {
        return dateCreate;
    }

    public int getIconFarm()
    {
        return iconFarm;
    }

    public int getIconServer()
    {
        return iconServer;
    }

    public String getId()
    {
        return id;
    }

    public String getPermaLink()
    {
        return permaLink;
    }

    public String getText()
    {
        return text;
    }

    public void setAuthor(String s)
    {
        author = s;
    }

    public void setAuthorName(String s)
    {
        authorName = s;
    }

    public void setDateCreate(Date date)
    {
        dateCreate = date;
    }

    public void setIconFarm(int i)
    {
        iconFarm = i;
    }

    public void setIconServer(int i)
    {
        iconServer = i;
    }

    public void setId(String s)
    {
        id = s;
    }

    public void setPermaLink(String s)
    {
        permaLink = s;
    }

    public void setText(String s)
    {
        text = s;
    }
}
