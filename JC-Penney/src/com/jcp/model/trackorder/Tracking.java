// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.model.trackorder;

import java.io.Serializable;

public class Tracking
    implements Serializable
{

    private String href;
    private String id;

    public Tracking()
    {
    }

    public String getHref()
    {
        return href;
    }

    public String getId()
    {
        return id;
    }

    public void setHref(String s)
    {
        href = s;
    }

    public void setId(String s)
    {
        id = s;
    }
}
