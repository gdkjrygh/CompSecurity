// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.tracks;

import com.soundcloud.android.model.Urn;
import com.soundcloud.android.storage.Table;
import com.soundcloud.java.collections.PropertySet;
import com.soundcloud.propeller.query.ColumnFunctions;
import com.soundcloud.propeller.query.Exists;
import com.soundcloud.propeller.query.Filter;
import com.soundcloud.propeller.query.Query;
import com.soundcloud.propeller.query.Where;
import com.soundcloud.propeller.rx.PropellerRx;
import rx.b;

// Referenced classes of package com.soundcloud.android.tracks:
//            TrackItemMapper, TrackDescriptionMapper

class TrackStorage
{

    private final PropellerRx propeller;

    TrackStorage(PropellerRx propellerrx)
    {
        propeller = propellerrx;
    }

    private Query buildTrackDescriptionQuery(Urn urn)
    {
        return (Query)((Query)Query.from(new String[] {
            Table.SoundView.name()
        }).select(new Object[] {
            "description"
        }).whereEq("_id", Long.valueOf(urn.getNumericId()))).whereEq("_type", Integer.valueOf(0));
    }

    private Query buildTrackQuery(Urn urn)
    {
        return (Query)((Query)Query.from(new String[] {
            Table.SoundView.name()
        }).select(new Object[] {
            "_id", "title", "sound_user_username", "sound_user_id", "duration", "playback_count", "comment_count", "favoritings_count", "reposts_count", "waveform_url", 
            "stream_url", "sound_policies_monetizable", "sound_policies_policy", "permalink_url", "sharing", "created_at", "sound_offline_downloaded_at", "sound_offline_removed_at", ColumnFunctions.exists(likeQuery(urn)).as("sound_user_like"), ColumnFunctions.exists(repostQuery(urn)).as("sound_user_repost")
        }).whereEq("_id", Long.valueOf(urn.getNumericId()))).whereEq("_type", Integer.valueOf(0));
    }

    private Query likeQuery(Urn urn)
    {
        Where where = Filter.filter().whereEq(Table.Sounds.field("_id"), Table.Likes.field("_id")).whereEq(Table.Sounds.field("_type"), Table.Likes.field("_type"));
        return (Query)((Query)((Query)Query.from(new String[] {
            Table.Likes.name()
        }).innerJoin(Table.Sounds.name(), where).whereEq(Table.Sounds.field("_id"), Long.valueOf(urn.getNumericId()))).whereEq(Table.Sounds.field("_type"), Integer.valueOf(0))).whereNull("removed_at");
    }

    private Query repostQuery(Urn urn)
    {
        Where where = Filter.filter().whereEq("_id", "target_id").whereEq("_type", "target_type");
        return (Query)((Query)((Query)Query.from(new String[] {
            Table.Posts.name()
        }).innerJoin(Table.Sounds.name(), where).whereEq("_id", Long.valueOf(urn.getNumericId()))).whereEq(Table.Sounds.field("_type"), Integer.valueOf(0))).whereEq("type", "repost");
    }

    b loadTrack(Urn urn)
    {
        return propeller.query(buildTrackQuery(urn)).map(new TrackItemMapper()).firstOrDefault(PropertySet.create());
    }

    b loadTrackDescription(Urn urn)
    {
        return propeller.query(buildTrackDescriptionQuery(urn)).map(new TrackDescriptionMapper()).firstOrDefault(PropertySet.create());
    }
}
