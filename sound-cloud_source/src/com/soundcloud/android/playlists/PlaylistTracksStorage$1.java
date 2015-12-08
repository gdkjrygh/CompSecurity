// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playlists;

import com.soundcloud.android.model.Urn;
import com.soundcloud.android.storage.Table;
import com.soundcloud.propeller.PropellerDatabase;

// Referenced classes of package com.soundcloud.android.playlists:
//            PlaylistTracksStorage

class nit> extends com.soundcloud.propeller.ction
{

    final PlaylistTracksStorage this$0;
    final long val$createdAt;
    final Urn val$firstTrackUrn;
    final boolean val$isPrivate;
    final long val$localId;
    final String val$title;

    public void steps(PropellerDatabase propellerdatabase)
    {
        step(propellerdatabase.insert(Table.Sounds, PlaylistTracksStorage.access$000(PlaylistTracksStorage.this, val$localId, val$createdAt, val$title, val$isPrivate)));
        step(propellerdatabase.insert(Table.Posts, PlaylistTracksStorage.access$100(PlaylistTracksStorage.this, val$localId, val$createdAt)));
        step(propellerdatabase.insert(Table.PlaylistTracks, PlaylistTracksStorage.access$200(PlaylistTracksStorage.this, val$localId, val$firstTrackUrn)));
    }

    ()
    {
        this$0 = final_playlisttracksstorage;
        val$localId = l;
        val$createdAt = l1;
        val$title = s;
        val$isPrivate = flag;
        val$firstTrackUrn = Urn.this;
        super();
    }
}
