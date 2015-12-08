// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.models.photos;

import java.io.Serializable;

public class Links
    implements Serializable
{

    private static final long serialVersionUID = 0x976022341cb13f3aL;
    private Double Height;
    private Double Size;
    private String Url;
    private Double Width;

    public Links()
    {
    }

    public Double getHeight()
    {
        return Height;
    }

    public Double getSize()
    {
        return Size;
    }

    public String getUrl()
    {
        return Url;
    }

    public Double getWidth()
    {
        return Width;
    }

    public void setHeight(Double double1)
    {
        Height = double1;
    }

    public void setSize(Double double1)
    {
        Size = double1;
    }

    public void setUrl(String s)
    {
        Url = s;
    }

    public void setWidth(Double double1)
    {
        Width = double1;
    }
}
