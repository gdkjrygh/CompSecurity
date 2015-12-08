// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playlists;

import com.soundcloud.android.commands.LegacyCommand;
import com.soundcloud.android.commands.TrackUrnMapper;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.storage.Table;
import com.soundcloud.propeller.PropellerDatabase;
import com.soundcloud.propeller.QueryResult;
import com.soundcloud.propeller.query.Field;
import com.soundcloud.propeller.query.Filter;
import com.soundcloud.propeller.query.Query;
import com.soundcloud.propeller.query.Where;
import java.util.List;

public class LoadPlaylistTrackUrnsCommand extends LegacyCommand
{

    private final PropellerDatabase database;

    public LoadPlaylistTrackUrnsCommand(PropellerDatabase propellerdatabase)
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
        Object obj = Filter.filter().whereEq(Table.PlaylistTracks.field("track_id"), Table.Sounds.field("_id")).whereEq(Table.Sounds.field("_type"), Integer.valueOf(0));
        obj = ((Query)Query.from(new String[] {
            Table.PlaylistTracks.name()
        }).innerJoin(Table.Sounds.name(), ((Where) (obj))).select(new Object[] {
            Field.field("track_id").as("_id")
        }).whereEq("playlist_id", Long.valueOf(((Urn)input).getNumericId()))).order("position", com.soundcloud.propeller.query.Query.Order.ASC);
        return database.query(((Query) (obj))).toList(new TrackUrnMapper());
    }
}
