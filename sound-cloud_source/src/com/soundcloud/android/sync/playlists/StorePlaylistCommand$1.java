// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.sync.playlists;

import com.soundcloud.android.api.model.ApiPlaylist;
import com.soundcloud.android.commands.StorePlaylistsCommand;
import com.soundcloud.android.commands.StoreUsersCommand;
import com.soundcloud.android.playlists.PlaylistRecord;
import com.soundcloud.android.storage.Table;
import com.soundcloud.propeller.PropellerDatabase;

// Referenced classes of package com.soundcloud.android.sync.playlists:
//            StorePlaylistCommand

class  extends com.soundcloud.propeller.action
{

    final StorePlaylistCommand this$0;

    public void steps(PropellerDatabase propellerdatabase)
    {
        step(propellerdatabase.upsert(Table.Users, StoreUsersCommand.buildUserContentValues(((ApiPlaylist)StorePlaylistCommand.access$000(StorePlaylistCommand.this)).getUser())));
        step(propellerdatabase.upsert(Table.Sounds, StorePlaylistsCommand.buildPlaylistContentValues((PlaylistRecord)StorePlaylistCommand.access$100(StorePlaylistCommand.this))));
    }

    ()
    {
        this$0 = StorePlaylistCommand.this;
        super();
    }
}
