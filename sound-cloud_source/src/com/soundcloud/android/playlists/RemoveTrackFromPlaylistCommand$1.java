// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playlists;

import com.soundcloud.android.model.Urn;
import com.soundcloud.android.storage.Table;
import com.soundcloud.propeller.PropellerDatabase;
import com.soundcloud.propeller.query.Filter;
import com.soundcloud.propeller.query.Where;
import java.util.List;

// Referenced classes of package com.soundcloud.android.playlists:
//            RemoveTrackFromPlaylistCommand

class val.playlistTracks extends com.soundcloud.propeller.mmand._cls1
{

    final RemoveTrackFromPlaylistCommand this$0;
    final moveTrackFromPlaylistParams val$params;
    final List val$playlistTracks;

    public void steps(PropellerDatabase propellerdatabase)
    {
        step(propellerdatabase.delete(Table.PlaylistTracks, Filter.filter().whereEq("playlist_id", Long.valueOf(val$params.playlistUrn.getNumericId())).whereNull("removed_at")));
        for (int i = 0; i < val$playlistTracks.size(); i++)
        {
            step(propellerdatabase.upsert(Table.PlaylistTracks, RemoveTrackFromPlaylistCommand.access$100(RemoveTrackFromPlaylistCommand.this, val$params.playlistUrn, (Urn)val$playlistTracks.get(i), i)));
        }

        step(propellerdatabase.insert(Table.PlaylistTracks, RemoveTrackFromPlaylistCommand.access$200(RemoveTrackFromPlaylistCommand.this, val$params.playlistUrn, val$params.trackUrn)));
    }

    moveTrackFromPlaylistParams()
    {
        this$0 = final_removetrackfromplaylistcommand;
        val$params = movetrackfromplaylistparams;
        val$playlistTracks = List.this;
        super();
    }
}
