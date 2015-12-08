// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.sync.playlists;

import android.content.ContentValues;
import com.soundcloud.android.commands.StoreCommand;
import com.soundcloud.android.model.Urn;
import com.soundcloud.propeller.PropellerDatabase;
import com.soundcloud.propeller.WriteResult;

class ReplacePlaylistTracksCommand extends StoreCommand
{

    private Urn playlistUrn;

    public ReplacePlaylistTracksCommand(PropellerDatabase propellerdatabase)
    {
        super(propellerdatabase);
    }

    private ContentValues buildPlaylistTrackContentValues(Urn urn, int i)
    {
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("playlist_id", Long.valueOf(playlistUrn.getNumericId()));
        contentvalues.put("track_id", Long.valueOf(urn.getNumericId()));
        contentvalues.put("position", Integer.valueOf(i));
        return contentvalues;
    }

    protected WriteResult store()
    {
        return database.runTransaction(new _cls1());
    }

    public ReplacePlaylistTracksCommand with(Urn urn)
    {
        playlistUrn = urn;
        return this;
    }





    private class _cls1 extends com.soundcloud.propeller.PropellerDatabase.Transaction
    {

        final ReplacePlaylistTracksCommand this$0;

        public void steps(PropellerDatabase propellerdatabase)
        {
            step(propellerdatabase.delete(Table.PlaylistTracks, Filter.filter().whereEq("playlist_id", Long.valueOf(playlistUrn.getNumericId()))));
            for (int i = 0; i < ((List)).size(); i++)
            {
                step(propellerdatabase.upsert(Table.PlaylistTracks, buildPlaylistTrackContentValues((Urn)((List)).get(i), i)));
            }

        }

        _cls1()
        {
            this$0 = ReplacePlaylistTracksCommand.this;
            super();
        }
    }

}
