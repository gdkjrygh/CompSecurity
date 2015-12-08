// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.sync.playlists;

import com.soundcloud.android.commands.StoreCommand;
import com.soundcloud.propeller.PropellerDatabase;
import com.soundcloud.propeller.WriteResult;

class StorePlaylistCommand extends StoreCommand
{

    public StorePlaylistCommand(PropellerDatabase propellerdatabase)
    {
        super(propellerdatabase);
    }

    protected WriteResult store()
    {
        return database.runTransaction(new _cls1());
    }



    private class _cls1 extends com.soundcloud.propeller.PropellerDatabase.Transaction
    {

        final StorePlaylistCommand this$0;

        public void steps(PropellerDatabase propellerdatabase)
        {
            step(propellerdatabase.upsert(Table.Users, StoreUsersCommand.buildUserContentValues(((ApiPlaylist)).getUser())));
            step(propellerdatabase.upsert(Table.Sounds, StorePlaylistsCommand.buildPlaylistContentValues((PlaylistRecord))));
        }

        _cls1()
        {
            this$0 = StorePlaylistCommand.this;
            super();
        }
    }

}
