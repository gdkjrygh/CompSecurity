// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.service.media.search;

import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import java.util.List;

public class mArtists
    implements JacksonModel
{

    private final mUri mAlbum;
    private final List mArtists;
    private final String mUri;

    public PlayerTrack convertToPlayerTrack()
    {
        return PlayerTrack.create(mUri, mAlbum.ri(), ((ri)mArtists.get(0)).Uri());
    }

    public Uri getAlbum()
    {
        return mAlbum;
    }

    public List getArtists()
    {
        return mArtists;
    }

    public String getUri()
    {
        return mUri;
    }

    public (String s,  , List list)
    {
        mUri = s;
        mAlbum = ;
        mArtists = list;
    }
}
