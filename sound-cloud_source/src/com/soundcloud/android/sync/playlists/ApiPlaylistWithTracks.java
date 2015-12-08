// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.sync.playlists;

import com.soundcloud.android.api.model.ApiPlaylist;
import com.soundcloud.android.api.model.ModelCollection;

public class ApiPlaylistWithTracks
{

    private final ApiPlaylist playlist;
    private final ModelCollection playlistTracks;

    public ApiPlaylistWithTracks(ApiPlaylist apiplaylist, ModelCollection modelcollection)
    {
        playlist = apiplaylist;
        playlistTracks = modelcollection;
    }

    public ApiPlaylist getPlaylist()
    {
        return playlist;
    }

    public ModelCollection getPlaylistTracks()
    {
        return playlistTracks;
    }
}
