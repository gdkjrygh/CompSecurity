// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aetn.history.android.historyhere.model;

import java.io.Serializable;

public class Asset
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    private String body;
    private String id;
    private String title;
    private String type;

    public Asset()
    {
    }

    public String getBody()
    {
        return body;
    }

    public String getId()
    {
        return id;
    }

    public String getTitle()
    {
        return title;
    }

    public String getType()
    {
        return type;
    }

    public void setBody(String s)
    {
        body = s;
    }

    public void setId(String s)
    {
        id = s;
    }

    public void setTitle(String s)
    {
        title = s;
    }

    public void setType(String s)
    {
        type = s;
    }
}
