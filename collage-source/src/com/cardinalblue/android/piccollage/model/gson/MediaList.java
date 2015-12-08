// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.model.gson;

import java.util.List;

public class MediaList
{

    private int hasNextPage;
    private List mediaList;
    private int mediaListCount;
    private int page;
    private int perPage;

    public MediaList()
    {
    }

    public List getList()
    {
        return mediaList;
    }

    public int getMediaListCount()
    {
        return mediaListCount;
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
