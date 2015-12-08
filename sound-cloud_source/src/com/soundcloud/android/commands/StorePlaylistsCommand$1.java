// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.commands;

import com.soundcloud.android.playlists.PlaylistRecord;
import com.soundcloud.android.storage.Table;
import com.soundcloud.propeller.PropellerDatabase;
import java.util.Iterator;

// Referenced classes of package com.soundcloud.android.commands:
//            StoreUsersCommand, StorePlaylistsCommand

class init> extends com.soundcloud.propeller.ction
{

    final StorePlaylistsCommand this$0;
    final Iterable val$input;

    public void steps(PropellerDatabase propellerdatabase)
    {
        PlaylistRecord playlistrecord;
        for (Iterator iterator = val$input.iterator(); iterator.hasNext(); step(propellerdatabase.upsert(Table.Sounds, StorePlaylistsCommand.buildPlaylistContentValues(playlistrecord))))
        {
            playlistrecord = (PlaylistRecord)iterator.next();
            step(propellerdatabase.upsert(Table.Users, StoreUsersCommand.buildUserContentValues(playlistrecord.getUser())));
        }

    }

    ()
    {
        this$0 = final_storeplaylistscommand;
        val$input = Iterable.this;
        super();
    }
}
