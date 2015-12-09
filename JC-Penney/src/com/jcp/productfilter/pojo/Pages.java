// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.productfilter.pojo;

import java.io.Serializable;

public class Pages
    implements Serializable
{

    private String number;
    private String selected;
    private String url;

    public Pages()
    {
    }

    public String getNumber()
    {
        return number;
    }

    public String getSelected()
    {
        return selected;
    }

    public String getUrl()
    {
        return url;
    }

    public void setNumber(String s)
    {
        number = s;
    }

    public void setSelected(String s)
    {
        selected = s;
    }

    public void setUrl(String s)
    {
        url = s;
    }
}
