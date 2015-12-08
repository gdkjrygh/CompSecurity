// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playlists;

import android.content.ContentValues;
import com.soundcloud.android.commands.WriteStorageCommand;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.storage.Table;
import com.soundcloud.propeller.ContentValuesBuilder;
import com.soundcloud.propeller.CursorReader;
import com.soundcloud.propeller.PropellerDatabase;
import com.soundcloud.propeller.QueryResult;
import com.soundcloud.propeller.WriteResult;
import com.soundcloud.propeller.query.Query;
import com.soundcloud.propeller.rx.RxResultMapper;
import java.util.List;

class RemoveTrackFromPlaylistCommand extends WriteStorageCommand
{
    private static final class GetPlaylistTrackUrnsMapper extends RxResultMapper
    {

        public final Urn map(CursorReader cursorreader)
        {
            return Urn.forTrack(cursorreader.getLong("track_id"));
        }

        public final volatile Object map(CursorReader cursorreader)
        {
            return map(cursorreader);
        }

        private GetPlaylistTrackUrnsMapper()
        {
        }

        GetPlaylistTrackUrnsMapper(_cls1 _pcls1)
        {
            this();
        }
    }

    static final class RemoveTrackFromPlaylistParams
    {

        final Urn playlistUrn;
        final Urn trackUrn;

        RemoveTrackFromPlaylistParams(Urn urn, Urn urn1)
        {
            playlistUrn = urn;
            trackUrn = urn1;
        }
    }


    private int updatedTrackCount;

    RemoveTrackFromPlaylistCommand(PropellerDatabase propellerdatabase)
    {
        super(propellerdatabase);
    }

    private ContentValues buildPlaylistTrackContentValues(Urn urn, Urn urn1, int i)
    {
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("playlist_id", Long.valueOf(urn.getNumericId()));
        contentvalues.put("track_id", Long.valueOf(urn1.getNumericId()));
        contentvalues.put("position", Integer.valueOf(i));
        return contentvalues;
    }

    private ContentValues getInsertTrackPendingRemovalParams(Urn urn, Urn urn1)
    {
        return ContentValuesBuilder.values().put("playlist_id", urn.getNumericId()).put("track_id", urn1.getNumericId()).put("removed_at", System.currentTimeMillis()).get();
    }

    private Query getPlaylistTracks(Urn urn)
    {
        return ((Query)((Query)Query.from(new String[] {
            Table.PlaylistTracks.name()
        }).select(new Object[] {
            "track_id"
        }).whereEq("playlist_id", Long.valueOf(urn.getNumericId()))).whereNull("removed_at")).order("position", com.soundcloud.propeller.query.Query.Order.ASC);
    }

    protected Integer transform(WriteResult writeresult)
    {
        return Integer.valueOf(updatedTrackCount);
    }

    protected volatile Object transform(WriteResult writeresult)
    {
        return transform(writeresult);
    }

    protected WriteResult write(PropellerDatabase propellerdatabase, final RemoveTrackFromPlaylistParams params)
    {
        final List playlistTracks = propellerdatabase.query(getPlaylistTracks(params.playlistUrn)).toList(new GetPlaylistTrackUrnsMapper(null));
        playlistTracks.remove(params.trackUrn);
        updatedTrackCount = playlistTracks.size();
        return propellerdatabase.runTransaction(new _cls1());
    }

    protected volatile WriteResult write(PropellerDatabase propellerdatabase, Object obj)
    {
        return write(propellerdatabase, (RemoveTrackFromPlaylistParams)obj);
    }



    private class _cls1 extends com.soundcloud.propeller.PropellerDatabase.Transaction
    {

        final RemoveTrackFromPlaylistCommand this$0;
        final RemoveTrackFromPlaylistParams val$params;
        final List val$playlistTracks;

        public void steps(PropellerDatabase propellerdatabase)
        {
            step(propellerdatabase.delete(Table.PlaylistTracks, Filter.filter().whereEq("playlist_id", Long.valueOf(params.playlistUrn.getNumericId())).whereNull("removed_at")));
            for (int i = 0; i < playlistTracks.size(); i++)
            {
                step(propellerdatabase.upsert(Table.PlaylistTracks, buildPlaylistTrackContentValues(params.playlistUrn, (Urn)playlistTracks.get(i), i)));
            }

            step(propellerdatabase.insert(Table.PlaylistTracks, getInsertTrackPendingRemovalParams(params.playlistUrn, params.trackUrn)));
        }

        _cls1()
        {
            this$0 = RemoveTrackFromPlaylistCommand.this;
            params = removetrackfromplaylistparams;
            playlistTracks = list;
            super();
        }
    }

}
