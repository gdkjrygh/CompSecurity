// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.sync.playlists;

import com.soundcloud.android.model.Urn;
import com.soundcloud.android.storage.Table;
import com.soundcloud.propeller.PropellerDatabase;
import com.soundcloud.propeller.query.Filter;
import java.util.List;

// Referenced classes of package com.soundcloud.android.sync.playlists:
//            ReplacePlaylistTracksCommand

class this._cls0 extends com.soundcloud.propeller.cksCommand._cls1
{

    final ReplacePlaylistTracksCommand this$0;

    public void steps(PropellerDatabase propellerdatabase)
    {
        step(propellerdatabase.delete(Table.PlaylistTracks, Filter.filter().whereEq("playlist_id", Long.valueOf(ReplacePlaylistTracksCommand.access$000(ReplacePlaylistTracksCommand.this).getNumericId()))));
        for (int i = 0; i < ((List)ReplacePlaylistTracksCommand.access$100(ReplacePlaylistTracksCommand.this)).size(); i++)
        {
            step(propellerdatabase.upsert(Table.PlaylistTracks, ReplacePlaylistTracksCommand.access$300(ReplacePlaylistTracksCommand.this, (Urn)((List)ReplacePlaylistTracksCommand.access$200(ReplacePlaylistTracksCommand.this)).get(i), i)));
        }

    }

    ()
    {
        this$0 = ReplacePlaylistTracksCommand.this;
        super();
    }
}
