// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.likes;

import com.soundcloud.android.model.Urn;
import com.soundcloud.android.storage.Table;
import com.soundcloud.propeller.query.Field;
import com.soundcloud.propeller.query.Filter;
import com.soundcloud.propeller.query.Query;
import com.soundcloud.propeller.query.Where;
import com.soundcloud.propeller.rx.PropellerRx;
import com.soundcloud.propeller.schema.Column;
import rx.b;

// Referenced classes of package com.soundcloud.android.likes:
//            LikedTrackMapper

public class LikedTrackStorage
{

    private final PropellerRx propellerRx;

    public LikedTrackStorage(PropellerRx propellerrx)
    {
        propellerRx = propellerrx;
    }

    private Query buildQuery(Urn urn)
    {
        return (Query)trackLikeQuery().whereEq(Table.Likes.field("_id"), Long.valueOf(urn.getNumericId()));
    }

    private Query buildTrackLikesQuery(int i, long l)
    {
        return ((Query)trackLikeQuery().whereLt(Table.Likes.field("created_at"), Long.valueOf(l))).order(Table.Likes.field("created_at"), com.soundcloud.propeller.query.Query.Order.DESC).limit(i);
    }

    static Where offlineLikesFilter()
    {
        return Filter.filter().whereEq(com.soundcloud.android.storage.Tables.OfflineContent._ID, Integer.valueOf(0)).whereEq(com.soundcloud.android.storage.Tables.OfflineContent._TYPE, Integer.valueOf(2));
    }

    static Query trackLikeQuery()
    {
        String s = Table.Sounds.field("_id");
        return (Query)((Query)Query.from(new String[] {
            Table.Likes.name(), Table.Sounds.name(), Table.Users.name()
        }).select(new Object[] {
            Field.field(s).as("_id"), "title", "username", "duration", "playback_count", "favoritings_count", "sharing", com.soundcloud.android.storage.Tables.TrackDownloads.REQUESTED_AT, com.soundcloud.android.storage.Tables.TrackDownloads.DOWNLOADED_AT, com.soundcloud.android.storage.Tables.TrackDownloads.UNAVAILABLE_AT, 
            com.soundcloud.android.storage.Tables.TrackDownloads.REMOVED_AT, "sub_mid_tier", Field.field(Table.Likes.field("created_at")).as("created_at"), com.soundcloud.android.storage.Tables.OfflineContent._ID
        }).leftJoin(com.soundcloud.android.storage.Tables.OfflineContent.TABLE, offlineLikesFilter()).leftJoin(com.soundcloud.android.storage.Tables.TrackDownloads.TABLE.name(), s, com.soundcloud.android.storage.Tables.TrackDownloads._ID.qualifiedName()).leftJoin(Table.TrackPolicies.name(), s, Table.TrackPolicies.field("track_id")).joinOn(Table.Likes.field("_id"), s).joinOn(Table.Sounds.field("user_id"), Table.Users.field("_id")).whereEq(Table.Likes.field("_type"), Integer.valueOf(0))).whereNull(Table.Likes.field("removed_at"));
    }

    public b loadTrackLike(Urn urn)
    {
        return propellerRx.query(buildQuery(urn)).map(new LikedTrackMapper());
    }

    public b loadTrackLikes(int i, long l)
    {
        return propellerRx.query(buildTrackLikesQuery(i, l)).map(new LikedTrackMapper()).toList();
    }
}
