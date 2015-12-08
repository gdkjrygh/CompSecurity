// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.flickrjandroid.activity;

import java.io.Serializable;
import java.util.Collection;

public class Item
    implements Serializable
{

    private int comments;
    private int commentsNew;
    private int commentsOld;
    private Collection events;
    private String farm;
    private int faves;
    private String id;
    private int more;
    private int notes;
    private int notesNew;
    private int notesOld;
    private String owner;
    private String secret;
    private String server;
    private String title;
    private String type;
    private int views;

    public Item()
    {
        comments = 0;
        notes = 0;
        commentsOld = 0;
        commentsNew = 0;
        notesOld = 0;
        notesNew = 0;
        views = 0;
        faves = 0;
        more = 0;
    }

    public int getComments()
    {
        return comments;
    }

    public int getCommentsNew()
    {
        return commentsNew;
    }

    public int getCommentsOld()
    {
        return commentsOld;
    }

    public Collection getEvents()
    {
        return events;
    }

    public String getFarm()
    {
        return farm;
    }

    public int getFaves()
    {
        return faves;
    }

    public String getId()
    {
        return id;
    }

    public int getMore()
    {
        return more;
    }

    public int getNotes()
    {
        return notes;
    }

    public int getNotesNew()
    {
        return notesNew;
    }

    public int getNotesOld()
    {
        return notesOld;
    }

    public String getOwner()
    {
        return owner;
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

    public String getType()
    {
        return type;
    }

    public int getViews()
    {
        return views;
    }

    public void setComments(int i)
    {
        comments = i;
    }

    public void setCommentsNew(int i)
    {
        commentsNew = i;
    }

    public void setCommentsOld(int i)
    {
        commentsOld = i;
    }

    public void setEvents(Collection collection)
    {
        events = collection;
    }

    public void setFarm(String s)
    {
        farm = s;
    }

    public void setFaves(int i)
    {
        faves = i;
    }

    public void setId(String s)
    {
        id = s;
    }

    public void setMore(int i)
    {
        more = i;
    }

    public void setNotes(int i)
    {
        notes = i;
    }

    public void setNotesNew(int i)
    {
        notesNew = i;
    }

    public void setNotesOld(int i)
    {
        notesOld = i;
    }

    public void setOwner(String s)
    {
        owner = s;
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

    public void setType(String s)
    {
        type = s;
    }

    public void setViews(int i)
    {
        views = i;
    }
}
