// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playlists;

import com.soundcloud.android.model.Urn;
import com.soundcloud.android.sync.SyncInitiator;
import rx.b;
import rx.b.f;

// Referenced classes of package com.soundcloud.android.playlists:
//            PlaylistWithTracks, PlaylistOperations

class val.playlistUrn
    implements f
{

    final PlaylistOperations this$0;
    final Urn val$playlistUrn;

    public volatile Object call(Object obj)
    {
        return call((PlaylistWithTracks)obj);
    }

    public b call(PlaylistWithTracks playlistwithtracks)
    {
        if (playlistwithtracks.isLocalPlaylist())
        {
            PlaylistOperations.access$400(PlaylistOperations.this).syncLocalPlaylists();
            return b.just(playlistwithtracks);
        }
        if (playlistwithtracks.isMissingMetaData())
        {
            return updatedPlaylistInfo(val$playlistUrn);
        }
        if (playlistwithtracks.needsTracks())
        {
            return b.concat(b.just(playlistwithtracks), updatedPlaylistInfo(val$playlistUrn));
        } else
        {
            return b.just(playlistwithtracks);
        }
    }

    ()
    {
        this$0 = final_playlistoperations;
        val$playlistUrn = Urn.this;
        super();
    }
}
