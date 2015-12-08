// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.commands;

import android.content.ContentValues;
import com.soundcloud.android.api.model.Sharing;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.tracks.TrackRecord;
import com.soundcloud.android.users.UserRecord;
import com.soundcloud.android.utils.ErrorUtils;
import com.soundcloud.java.optional.Optional;
import com.soundcloud.propeller.ContentValuesBuilder;
import com.soundcloud.propeller.PropellerDatabase;
import com.soundcloud.propeller.WriteResult;
import java.util.Date;

// Referenced classes of package com.soundcloud.android.commands:
//            DefaultWriteStorageCommand

public class StoreTracksCommand extends DefaultWriteStorageCommand
{

    public StoreTracksCommand(PropellerDatabase propellerdatabase)
    {
        super(propellerdatabase);
    }

    public static ContentValues buildPolicyContentValues(TrackRecord trackrecord)
    {
        ContentValuesBuilder contentvaluesbuilder = ContentValuesBuilder.values().put("track_id", trackrecord.getUrn().getNumericId()).put("monetizable", trackrecord.isMonetizable()).put("policy", trackrecord.getPolicy()).put("syncable", trackrecord.isSyncable()).put("last_updated", System.currentTimeMillis());
        if (trackrecord.getMonetizationModel().isPresent())
        {
            contentvaluesbuilder.put("monetization_model", (String)trackrecord.getMonetizationModel().get());
        }
        if (trackrecord.isSubMidTier().isPresent())
        {
            contentvaluesbuilder.put("sub_mid_tier", ((Boolean)trackrecord.isSubMidTier().get()).booleanValue());
        }
        if (trackrecord.isSubHighTier().isPresent())
        {
            contentvaluesbuilder.put("sub_high_tier", ((Boolean)trackrecord.isSubHighTier().get()).booleanValue());
        }
        return contentvaluesbuilder.get();
    }

    public static ContentValues buildTrackContentValues(TrackRecord trackrecord)
    {
        if (trackrecord.getTitle() == null)
        {
            ErrorUtils.handleSilentException(new IllegalStateException((new StringBuilder("Inserting a track with a NULL title: ")).append(trackrecord.getUrn()).toString()));
        }
        ContentValuesBuilder contentvaluesbuilder = ContentValuesBuilder.values();
        contentvaluesbuilder.put("_id", trackrecord.getUrn().getNumericId()).put("_type", 0).put("title", trackrecord.getTitle()).put("duration", trackrecord.getDuration()).put("waveform_url", trackrecord.getWaveformUrl()).put("stream_url", trackrecord.getStreamUrl()).put("permalink_url", trackrecord.getPermalinkUrl()).put("created_at", trackrecord.getCreatedAt().getTime()).put("genre", trackrecord.getGenre()).put("sharing", trackrecord.getSharing().value()).put("commentable", trackrecord.isCommentable()).put("playback_count", trackrecord.getPlaybackCount()).put("comment_count", trackrecord.getCommentsCount()).put("favoritings_count", trackrecord.getLikesCount()).put("reposts_count", trackrecord.getRepostsCount()).put("user_id", trackrecord.getUser().getUrn().getNumericId());
        if (trackrecord.getDescription().isPresent())
        {
            contentvaluesbuilder.put("description", (String)trackrecord.getDescription().get());
        }
        return contentvaluesbuilder.get();
    }

    protected WriteResult write(PropellerDatabase propellerdatabase, final Iterable input)
    {
        return propellerdatabase.runTransaction(new _cls1());
    }

    protected volatile WriteResult write(PropellerDatabase propellerdatabase, Object obj)
    {
        return write(propellerdatabase, (Iterable)obj);
    }

    private class _cls1 extends com.soundcloud.propeller.PropellerDatabase.Transaction
    {

        final StoreTracksCommand this$0;
        final Iterable val$input;

        public void steps(PropellerDatabase propellerdatabase)
        {
            TrackRecord trackrecord;
            for (Iterator iterator = input.iterator(); iterator.hasNext(); step(propellerdatabase.upsert(Table.TrackPolicies, StoreTracksCommand.buildPolicyContentValues(trackrecord))))
            {
                trackrecord = (TrackRecord)iterator.next();
                step(propellerdatabase.upsert(Table.Users, StoreUsersCommand.buildUserContentValues(trackrecord.getUser())));
                step(propellerdatabase.upsert(Table.Sounds, StoreTracksCommand.buildTrackContentValues(trackrecord)));
            }

        }

        _cls1()
        {
            this$0 = StoreTracksCommand.this;
            input = iterable;
            super();
        }
    }

}
