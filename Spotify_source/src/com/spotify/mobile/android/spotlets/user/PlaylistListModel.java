// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.user;

import com.spotify.mobile.android.cosmos.JacksonModel;

// Referenced classes of package com.spotify.mobile.android.spotlets.user:
//            PlaylistModel

public class PlaylistListModel
    implements JacksonModel
{

    private final PlaylistModel mPlaylists[];

    public PlaylistListModel(PlaylistModel aplaylistmodel[])
    {
        mPlaylists = aplaylistmodel;
    }

    public PlaylistModel[] getPlaylists()
    {
        return mPlaylists;
    }
}
