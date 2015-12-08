// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.searchentity;

import java.io.Serializable;

public class SearchRelatedTermEntity
    implements Serializable
{

    private String text;
    private String url;

    public SearchRelatedTermEntity()
    {
    }

    public String getText()
    {
        return text;
    }

    public String getUrl()
    {
        return url;
    }

    public void setText(String s)
    {
        text = s;
    }

    public void setUrl(String s)
    {
        url = s;
    }
}
