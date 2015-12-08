// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.sync.posts;

import android.util.Pair;
import com.soundcloud.android.api.model.ApiPlaylist;
import com.soundcloud.android.commands.LegacyCommand;
import com.soundcloud.android.model.Urn;
import com.soundcloud.propeller.PropellerDatabase;
import com.soundcloud.propeller.WriteResult;

class ReplacePlaylistPostCommand extends LegacyCommand
{

    private final PropellerDatabase propeller;

    public ReplacePlaylistPostCommand(PropellerDatabase propellerdatabase)
    {
        propeller = propellerdatabase;
    }

    public WriteResult call()
        throws Exception
    {
        final Urn localPlaylistUrn = (Urn)((Pair)input).first;
        final ApiPlaylist newPlaylist = (ApiPlaylist)((Pair)input).second;
        return propeller.runTransaction(new _cls1());
    }

    public volatile Object call()
        throws Exception
    {
        return call();
    }

    private class _cls1 extends com.soundcloud.propeller.PropellerDatabase.Transaction
    {

        final ReplacePlaylistPostCommand this$0;
        final Urn val$localPlaylistUrn;
        final ApiPlaylist val$newPlaylist;

        public void steps(PropellerDatabase propellerdatabase)
        {
            step(propellerdatabase.upsert(Table.Users, StoreUsersCommand.buildUserContentValues(newPlaylist.getUser())));
            step(propellerdatabase.insert(Table.Sounds, StorePlaylistsCommand.buildPlaylistContentValues(newPlaylist)));
            ContentValues contentvalues = new ContentValues();
            contentvalues.put("playlist_id", Long.valueOf(newPlaylist.getId()));
            step(propellerdatabase.update(Table.PlaylistTracks, contentvalues, Filter.filter().whereEq("playlist_id", Long.valueOf(localPlaylistUrn.getNumericId()))));
            step(propellerdatabase.delete(Table.Sounds, Filter.filter().whereEq("_id", Long.valueOf(localPlaylistUrn.getNumericId())).whereEq("_type", Integer.valueOf(1))));
            contentvalues = new ContentValues();
            contentvalues.put("target_id", Long.valueOf(newPlaylist.getId()));
            step(propellerdatabase.update(Table.Posts, contentvalues, Filter.filter().whereEq("target_id", Long.valueOf(localPlaylistUrn.getNumericId())).whereEq("target_type", Integer.valueOf(1))));
            contentvalues = new ContentValues();
            contentvalues.put(com.soundcloud.android.storage.Tables.OfflineContent._ID.name(), Long.valueOf(newPlaylist.getUrn().getNumericId()));
            contentvalues.put(com.soundcloud.android.storage.Tables.OfflineContent._TYPE.name(), Integer.valueOf(1));
            if (((ChangeResult)step(propellerdatabase.delete(com.soundcloud.android.storage.Tables.OfflineContent.TABLE, Filter.filter().whereEq(com.soundcloud.android.storage.Tables.OfflineContent._ID, Long.valueOf(localPlaylistUrn.getNumericId())).whereEq(com.soundcloud.android.storage.Tables.OfflineContent._TYPE, Integer.valueOf(1))))).getNumRowsAffected() > 0)
            {
                step(propellerdatabase.insert(com.soundcloud.android.storage.Tables.OfflineContent.TABLE, contentvalues));
            }
        }

        _cls1()
        {
            this$0 = ReplacePlaylistPostCommand.this;
            newPlaylist = apiplaylist;
            localPlaylistUrn = urn;
            super();
        }
    }

}
