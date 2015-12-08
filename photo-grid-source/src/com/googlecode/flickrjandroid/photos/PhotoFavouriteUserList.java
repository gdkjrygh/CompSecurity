// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.flickrjandroid.photos;

import com.googlecode.flickrjandroid.SearchResultList;

public class PhotoFavouriteUserList extends SearchResultList
{

    private static final long serialVersionUID = 0x6f7e7abd268d7585L;
    private int farm;
    private String secret;
    private String server;

    public PhotoFavouriteUserList()
    {
        farm = -1;
    }

    public int getFarm()
    {
        return farm;
    }

    public String getSecret()
    {
        return secret;
    }

    public String getServer()
    {
        return server;
    }

    public void setFarm(int i)
    {
        farm = i;
    }

    public void setSecret(String s)
    {
        secret = s;
    }

    public void setServer(String s)
    {
        server = s;
    }
}
