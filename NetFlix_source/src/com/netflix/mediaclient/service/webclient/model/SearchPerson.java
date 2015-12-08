// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.webclient.model;


public class SearchPerson
    implements com.netflix.mediaclient.servicemgr.SearchPerson
{

    public String id;
    public String imgUrl;
    public String title;

    public SearchPerson()
    {
    }

    public String getId()
    {
        return id;
    }

    public String getImgUrl()
    {
        return imgUrl;
    }

    public String getName()
    {
        return title;
    }

    public String toString()
    {
        return title;
    }
}
