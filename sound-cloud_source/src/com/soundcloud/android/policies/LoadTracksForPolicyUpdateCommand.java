// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.policies;

import com.soundcloud.android.commands.Command;
import com.soundcloud.android.commands.TrackUrnMapper;
import com.soundcloud.android.storage.Table;
import com.soundcloud.java.collections.Lists;
import com.soundcloud.propeller.PropellerDatabase;
import com.soundcloud.propeller.QueryResult;
import com.soundcloud.propeller.query.Field;
import com.soundcloud.propeller.query.Filter;
import com.soundcloud.propeller.query.Query;
import com.soundcloud.propeller.query.Where;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class LoadTracksForPolicyUpdateCommand extends Command
{

    private final PropellerDatabase propeller;

    public LoadTracksForPolicyUpdateCommand(PropellerDatabase propellerdatabase)
    {
        propeller = propellerdatabase;
    }

    private List loadLikedTracks()
    {
        Object obj = Filter.filter().whereEq(Table.Likes.field("_id"), Table.Sounds.field("_id")).whereEq(Table.Likes.field("_type"), Table.Sounds.field("_type"));
        obj = (Query)((Query)Query.from(new String[] {
            Table.Likes.name()
        }).select(new Object[] {
            Field.field(Table.Likes.field("_id")).as("_id")
        }).innerJoin(Table.Sounds.name(), ((Where) (obj))).whereEq(Table.Likes.field("_type"), Integer.valueOf(0))).whereNull(Table.Likes.field("removed_at"));
        return propeller.query(((Query) (obj))).toList(new TrackUrnMapper());
    }

    private List loadPlaylistTracks()
    {
        Query query = (Query)Query.from(new String[] {
            Table.PlaylistTracks.name()
        }).select(new Object[] {
            Field.field(Table.PlaylistTracks.field("track_id")).as("_id")
        }).whereNull(Table.PlaylistTracks.field("removed_at"));
        return propeller.query(query).toList(new TrackUrnMapper());
    }

    public volatile Object call(Object obj)
    {
        return call((Void)obj);
    }

    public List call(Void void1)
    {
        void1 = new HashSet();
        void1.addAll(loadLikedTracks());
        void1.addAll(loadPlaylistTracks());
        return Lists.newArrayList(void1);
    }
}
