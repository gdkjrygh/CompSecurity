// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.model.gson;

import java.util.List;

public class AlbumList
{

    private List albumList;
    private int albumListCount;
    private int hasNextPage;
    private int page;
    private int perPage;

    public AlbumList()
    {
    }

    public int getAlbumListCount()
    {
        return albumListCount;
    }

    public List getList()
    {
        return albumList;
    }

    public int getPage()
    {
        return page;
    }

    public int getPerPage()
    {
        return perPage;
    }

    public boolean hasNextPage()
    {
        return hasNextPage != 0;
    }
}
