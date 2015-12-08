// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.sync.playlists;

import com.soundcloud.android.commands.LegacyCommand;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.playlists.PlaylistTrackProperty;
import com.soundcloud.android.storage.Table;
import com.soundcloud.java.collections.Property;
import com.soundcloud.java.collections.PropertyBinding;
import com.soundcloud.java.collections.PropertySet;
import com.soundcloud.propeller.CursorReader;
import com.soundcloud.propeller.PropellerDatabase;
import com.soundcloud.propeller.QueryResult;
import com.soundcloud.propeller.query.Query;
import com.soundcloud.propeller.rx.RxResultMapper;
import java.util.List;

class LoadPlaylistTracksWithChangesCommand extends LegacyCommand
{
    private class PlaylistTrackUrnMapper extends RxResultMapper
    {

        final LoadPlaylistTracksWithChangesCommand this$0;

        public PropertySet map(CursorReader cursorreader)
        {
            Object obj = Urn.forTrack(cursorreader.getLong("track_id"));
            obj = PropertySet.from(new PropertyBinding[] {
                PlaylistTrackProperty.TRACK_URN.bind(obj)
            });
            if (cursorreader.isNotNull("added_at"))
            {
                ((PropertySet) (obj)).put(PlaylistTrackProperty.ADDED_AT, cursorreader.getDateFromTimestamp("added_at"));
            }
            if (cursorreader.isNotNull("removed_at"))
            {
                ((PropertySet) (obj)).put(PlaylistTrackProperty.REMOVED_AT, cursorreader.getDateFromTimestamp("removed_at"));
            }
            return ((PropertySet) (obj));
        }

        public volatile Object map(CursorReader cursorreader)
        {
            return map(cursorreader);
        }

        private PlaylistTrackUrnMapper()
        {
            this$0 = LoadPlaylistTracksWithChangesCommand.this;
            super();
        }

        PlaylistTrackUrnMapper(_cls1 _pcls1)
        {
            this();
        }
    }


    private final PropellerDatabase database;

    LoadPlaylistTracksWithChangesCommand(PropellerDatabase propellerdatabase)
    {
        database = propellerdatabase;
    }

    public volatile Object call()
        throws Exception
    {
        return call();
    }

    public List call()
        throws Exception
    {
        return database.query(((Query)Query.from(new String[] {
            Table.PlaylistTracks.name()
        }).select(new Object[] {
            "track_id", "added_at", "removed_at"
        }).whereEq("playlist_id", Long.valueOf(((Urn)input).getNumericId()))).order("position", com.soundcloud.propeller.query.Query.Order.ASC)).toList(new PlaylistTrackUrnMapper(null));
    }
}
