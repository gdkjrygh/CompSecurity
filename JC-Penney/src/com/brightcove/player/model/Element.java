// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.model;

import java.io.Serializable;

public class Element
    implements Serializable
{

    protected String d;

    public Element()
    {
    }

    public String getID()
    {
        return d;
    }

    public void setID(String s)
    {
        d = s;
    }
}
