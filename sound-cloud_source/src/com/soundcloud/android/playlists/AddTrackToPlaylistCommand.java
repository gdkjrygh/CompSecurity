// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playlists;

import android.content.ContentValues;
import com.soundcloud.android.commands.WriteStorageCommand;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.storage.Table;
import com.soundcloud.android.utils.CurrentDateProvider;
import com.soundcloud.android.utils.DateProvider;
import com.soundcloud.propeller.ContentValuesBuilder;
import com.soundcloud.propeller.CursorReader;
import com.soundcloud.propeller.PropellerDatabase;
import com.soundcloud.propeller.QueryResult;
import com.soundcloud.propeller.WriteResult;
import com.soundcloud.propeller.query.ColumnFunctions;
import com.soundcloud.propeller.query.Count;
import com.soundcloud.propeller.query.Query;
import com.soundcloud.propeller.rx.RxResultMapper;
import java.util.Date;

// Referenced classes of package com.soundcloud.android.playlists:
//            PlaylistMapper

class AddTrackToPlaylistCommand extends WriteStorageCommand
{
    static final class AddTrackToPlaylistParams
    {

        final Urn playlistUrn;
        final Urn trackUrn;

        AddTrackToPlaylistParams(Urn urn, Urn urn1)
        {
            playlistUrn = urn;
            trackUrn = urn1;
        }
    }

    private static final class TrackCountMapper extends RxResultMapper
    {

        public final Integer map(CursorReader cursorreader)
        {
            return Integer.valueOf(PlaylistMapper.readTrackCount(cursorreader));
        }

        public final volatile Object map(CursorReader cursorreader)
        {
            return map(cursorreader);
        }

        private TrackCountMapper()
        {
        }

        TrackCountMapper(_cls1 _pcls1)
        {
            this();
        }
    }


    private final DateProvider dateProvider;
    private int updatedTrackCount;

    AddTrackToPlaylistCommand(PropellerDatabase propellerdatabase, CurrentDateProvider currentdateprovider)
    {
        super(propellerdatabase);
        dateProvider = currentdateprovider;
    }

    private ContentValues getContentValues(long l, Urn urn, int i)
    {
        return ContentValuesBuilder.values().put("playlist_id", l).put("track_id", urn.getNumericId()).put("position", i).put("added_at", dateProvider.getCurrentDate().getTime()).get();
    }

    private int getCurrentTrackCount(PropellerDatabase propellerdatabase, Urn urn)
    {
        return ((Integer)propellerdatabase.query(((Query)((Query)Query.from(new String[] {
            Table.SoundView.name()
        }).select(new Object[] {
            "track_count", ColumnFunctions.count("playlist_id").as("local_track_count")
        }).whereEq("_id", Long.valueOf(urn.getNumericId()))).whereEq("_type", Integer.valueOf(1))).leftJoin(Table.PlaylistTracks.name(), "_id", "playlist_id")).first(new TrackCountMapper(null))).intValue();
    }

    protected Integer transform(WriteResult writeresult)
    {
        return Integer.valueOf(updatedTrackCount);
    }

    protected volatile Object transform(WriteResult writeresult)
    {
        return transform(writeresult);
    }

    protected WriteResult write(PropellerDatabase propellerdatabase, AddTrackToPlaylistParams addtracktoplaylistparams)
    {
        int i = getCurrentTrackCount(propellerdatabase, addtracktoplaylistparams.playlistUrn);
        updatedTrackCount = i + 1;
        return propellerdatabase.insert(Table.PlaylistTracks, getContentValues(addtracktoplaylistparams.playlistUrn.getNumericId(), addtracktoplaylistparams.trackUrn, i));
    }

    protected volatile WriteResult write(PropellerDatabase propellerdatabase, Object obj)
    {
        return write(propellerdatabase, (AddTrackToPlaylistParams)obj);
    }
}
