// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.collections;

import java.util.List;

public class MyCollections
{

    private final boolean atLeastOneError;
    private final List likedAndPostedPlaylists;
    private final List likes;
    private final List recentStations;

    public MyCollections(List list, List list1, List list2, boolean flag)
    {
        likes = list;
        likedAndPostedPlaylists = list1;
        recentStations = list2;
        atLeastOneError = flag;
    }

    public List getLikes()
    {
        return likes;
    }

    public List getPlaylistItems()
    {
        return likedAndPostedPlaylists;
    }

    public List getRecentStations()
    {
        return recentStations;
    }

    public boolean hasError()
    {
        return atLeastOneError;
    }
}
