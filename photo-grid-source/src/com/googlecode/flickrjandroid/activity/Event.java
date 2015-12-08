// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.flickrjandroid.activity;

import java.io.Serializable;
import java.util.Date;

public class Event
    implements Serializable
{

    private Date dateadded;
    private String id;
    private String type;
    private String user;
    private String username;
    private String value;

    public Event()
    {
    }

    public Date getDateadded()
    {
        return dateadded;
    }

    public String getId()
    {
        return id;
    }

    public String getType()
    {
        return type;
    }

    public String getUser()
    {
        return user;
    }

    public String getUsername()
    {
        return username;
    }

    public String getValue()
    {
        return value;
    }

    public void setDateadded(String s)
    {
        if (s == null || "".equals(s))
        {
            return;
        } else
        {
            setDateadded(new Date(Long.parseLong(s) * 1000L));
            return;
        }
    }

    public void setDateadded(Date date)
    {
        dateadded = date;
    }

    public void setId(String s)
    {
        id = s;
    }

    public void setType(String s)
    {
        type = s;
    }

    public void setUser(String s)
    {
        user = s;
    }

    public void setUsername(String s)
    {
        username = s;
    }

    public void setValue(String s)
    {
        value = s;
    }
}
