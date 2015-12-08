// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.offline;

import com.soundcloud.android.commands.Command;
import com.soundcloud.android.commands.TrackUrnMapper;
import com.soundcloud.android.policies.PolicyOperations;
import com.soundcloud.android.storage.Table;
import com.soundcloud.propeller.PropellerDatabase;
import com.soundcloud.propeller.QueryResult;
import com.soundcloud.propeller.query.Field;
import com.soundcloud.propeller.query.Filter;
import com.soundcloud.propeller.query.Query;
import com.soundcloud.propeller.query.Where;
import com.soundcloud.propeller.schema.Column;
import java.util.Collection;
import java.util.TreeSet;

// Referenced classes of package com.soundcloud.android.offline:
//            OfflineContentStorage

class LoadTracksWithStalePoliciesCommand extends Command
{

    private final PropellerDatabase database;

    public LoadTracksWithStalePoliciesCommand(PropellerDatabase propellerdatabase)
    {
        database = propellerdatabase;
    }

    static Query buildOfflineLikedTracksQuery()
    {
        Where where = Filter.filter().whereEq(Table.Likes.field("_id"), Table.Sounds.field("_id")).whereEq(Table.Likes.field("_type"), Table.Sounds.field("_type"));
        String s = Table.Likes.field("_id");
        return (Query)((Query)Query.from(new String[] {
            Table.Likes.name()
        }).select(new Object[] {
            Field.field(s).as("_id")
        }).innerJoin(Table.Sounds.name(), where).leftJoin(Table.TrackPolicies.name(), s, "track_id").whereEq(Table.Likes.field("_type"), Integer.valueOf(0))).whereNull(Table.Likes.field("removed_at"));
    }

    static Query buildOfflinePlaylistTracksQuery()
    {
        Where where = Filter.filter().whereEq("playlist_id", com.soundcloud.android.storage.Tables.OfflineContent._ID.qualifiedName()).whereEq(com.soundcloud.android.storage.Tables.OfflineContent._TYPE, Integer.valueOf(1));
        String s = Table.PlaylistTracks.field("track_id");
        return Query.from(new String[] {
            Table.PlaylistTracks.name()
        }).select(new Object[] {
            Field.field(s).as("_id")
        }).innerJoin(com.soundcloud.android.storage.Tables.OfflineContent.TABLE.name(), where).leftJoin(Table.TrackPolicies.name(), s, Table.TrackPolicies.field("track_id"));
    }

    private boolean isOfflineLikesEnabled()
    {
        return ((Boolean)database.query(OfflineContentStorage.isOfflineLikesEnabledQuery()).firstOrDefault(java/lang/Boolean, Boolean.valueOf(false))).booleanValue();
    }

    private Where stalePolicyCondition()
    {
        long l = System.currentTimeMillis();
        long l1 = PolicyOperations.POLICY_STALE_AGE_MILLISECONDS;
        return Filter.filter().whereLt(Table.TrackPolicies.field("last_updated"), Long.valueOf(l - l1)).orWhereNull(Table.TrackPolicies.field("last_updated"));
    }

    public volatile Object call(Object obj)
    {
        return call((Void)obj);
    }

    public Collection call(Void void1)
    {
        void1 = new TreeSet();
        Where where = stalePolicyCondition();
        if (isOfflineLikesEnabled())
        {
            void1.addAll(database.query(buildOfflineLikedTracksQuery().where(where)).toList(new TrackUrnMapper()));
        }
        void1.addAll(database.query(buildOfflinePlaylistTracksQuery().where(where)).toList(new TrackUrnMapper()));
        return void1;
    }
}
