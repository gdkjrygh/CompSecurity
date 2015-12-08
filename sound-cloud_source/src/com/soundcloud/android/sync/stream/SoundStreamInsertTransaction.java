// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.sync.stream;

import android.content.ContentValues;
import com.soundcloud.android.api.model.ApiPlaylist;
import com.soundcloud.android.api.model.ApiTrack;
import com.soundcloud.android.api.model.ApiUser;
import com.soundcloud.android.api.model.stream.ApiStreamItem;
import com.soundcloud.android.commands.StorePlaylistsCommand;
import com.soundcloud.android.commands.StoreTracksCommand;
import com.soundcloud.android.commands.StoreUsersCommand;
import com.soundcloud.android.playlists.PlaylistRecord;
import com.soundcloud.android.storage.Table;
import com.soundcloud.android.tracks.TrackRecord;
import com.soundcloud.android.users.UserRecord;
import com.soundcloud.java.optional.Optional;
import com.soundcloud.java.strings.Joiner;
import com.soundcloud.java.strings.Strings;
import com.soundcloud.propeller.ContentValuesBuilder;
import com.soundcloud.propeller.InsertResult;
import com.soundcloud.propeller.PropellerDatabase;
import com.soundcloud.propeller.QueryResult;
import com.soundcloud.propeller.ScalarMapper;
import com.soundcloud.propeller.query.Filter;
import com.soundcloud.propeller.query.Query;
import java.util.Iterator;

class SoundStreamInsertTransaction extends com.soundcloud.propeller.PropellerDatabase.Transaction
{

    private final Iterable streamItems;

    SoundStreamInsertTransaction(Iterable iterable)
    {
        streamItems = iterable;
    }

    private ContentValues buildPromotedContentValues(ApiStreamItem apistreamitem)
    {
        Object obj = Strings.joinOn(" ");
        obj = ContentValuesBuilder.values().put("ad_urn", (String)apistreamitem.getAdUrn().get()).put("created_at", System.currentTimeMillis()).put("tracking_profile_clicked_urls", ((Joiner) (obj)).join(apistreamitem.getTrackingProfileClickedUrls())).put("tracking_promoter_clicked_urls", ((Joiner) (obj)).join(apistreamitem.getTrackingPromoterClickedUrls())).put("tracking_track_clicked_urls", ((Joiner) (obj)).join(apistreamitem.getTrackingItemClickedUrls())).put("tracking_track_impression_urls", ((Joiner) (obj)).join(apistreamitem.getTrackingItemImpressionUrls())).put("tracking_track_played_urls", ((Joiner) (obj)).join(apistreamitem.getTrackingTrackPlayedUrls()));
        apistreamitem = apistreamitem.getPromoter();
        if (apistreamitem.isPresent())
        {
            ((ContentValuesBuilder) (obj)).put("promoter_id", ((ApiUser)apistreamitem.get()).getId());
            ((ContentValuesBuilder) (obj)).put("promoter_name", ((ApiUser)apistreamitem.get()).getUsername());
        }
        return ((ContentValuesBuilder) (obj)).get();
    }

    private ContentValuesBuilder buildSoundStreamContentValues(ApiStreamItem apistreamitem)
    {
        ContentValuesBuilder contentvaluesbuilder = ContentValuesBuilder.values().put("sound_id", getSoundId(apistreamitem)).put("sound_type", getSoundType(apistreamitem)).put("created_at", apistreamitem.getCreatedAtTime());
        apistreamitem = apistreamitem.getReposter();
        if (apistreamitem.isPresent())
        {
            contentvaluesbuilder.put("reposter_id", ((ApiUser)apistreamitem.get()).getId());
        }
        return contentvaluesbuilder;
    }

    private ContentValuesBuilder buildSoundStreamContentValues(ApiStreamItem apistreamitem, long l)
    {
        apistreamitem = buildSoundStreamContentValues(apistreamitem);
        apistreamitem.put("promoted_id", l);
        return apistreamitem;
    }

    private ContentValues getContentValuesForSoundOwner(ApiStreamItem apistreamitem)
    {
        Optional optional = apistreamitem.getTrack();
        if (optional.isPresent())
        {
            return StoreUsersCommand.buildUserContentValues(((ApiTrack)optional.get()).getUser());
        } else
        {
            return StoreUsersCommand.buildUserContentValues(((ApiPlaylist)apistreamitem.getPlaylist().get()).getUser());
        }
    }

    private ContentValues getContentValuesForSoundTable(ApiStreamItem apistreamitem)
    {
        Optional optional = apistreamitem.getTrack();
        if (optional.isPresent())
        {
            return StoreTracksCommand.buildTrackContentValues((TrackRecord)optional.get());
        } else
        {
            return StorePlaylistsCommand.buildPlaylistContentValues((PlaylistRecord)apistreamitem.getPlaylist().get());
        }
    }

    private long getSoundId(ApiStreamItem apistreamitem)
    {
        Optional optional = apistreamitem.getTrack();
        if (optional.isPresent())
        {
            return ((ApiTrack)optional.get()).getId();
        } else
        {
            return ((ApiPlaylist)apistreamitem.getPlaylist().get()).getId();
        }
    }

    private int getSoundType(ApiStreamItem apistreamitem)
    {
        return !apistreamitem.getTrack().isPresent() ? 1 : 0;
    }

    private boolean isTrack(ApiStreamItem apistreamitem)
    {
        return apistreamitem.getTrack().isPresent();
    }

    protected void beforeInserts(PropellerDatabase propellerdatabase)
    {
        java.util.List list = propellerdatabase.query((Query)Query.from(new String[] {
            Table.SoundStream.name()
        }).select(new Object[] {
            "promoted_id"
        }).whereNotNull("promoted_id")).toList(ScalarMapper.create(java/lang/Long));
        step(propellerdatabase.delete(Table.SoundStream, Filter.filter().whereNotNull("promoted_id")));
        step(propellerdatabase.delete(Table.PromotedTracks, Filter.filter().whereIn("_id", list)));
    }

    public void steps(PropellerDatabase propellerdatabase)
    {
        beforeInserts(propellerdatabase);
        for (Iterator iterator = streamItems.iterator(); iterator.hasNext();)
        {
            ApiStreamItem apistreamitem = (ApiStreamItem)iterator.next();
            step(propellerdatabase.upsert(Table.Users, getContentValuesForSoundOwner(apistreamitem)));
            step(propellerdatabase.upsert(Table.Sounds, getContentValuesForSoundTable(apistreamitem)));
            if (isTrack(apistreamitem))
            {
                step(propellerdatabase.upsert(Table.TrackPolicies, StoreTracksCommand.buildPolicyContentValues((TrackRecord)apistreamitem.getTrack().get())));
            }
            Optional optional = apistreamitem.getReposter();
            if (optional.isPresent())
            {
                step(propellerdatabase.upsert(Table.Users, StoreUsersCommand.buildUserContentValues((UserRecord)optional.get())));
            }
            if (apistreamitem.isPromotedStreamItem())
            {
                Object obj = apistreamitem.getPromoter();
                if (((Optional) (obj)).isPresent())
                {
                    step(propellerdatabase.upsert(Table.Users, StoreUsersCommand.buildUserContentValues((UserRecord)((Optional) (obj)).get())));
                }
                obj = (InsertResult)step(propellerdatabase.insert(Table.PromotedTracks, buildPromotedContentValues(apistreamitem)));
                step(propellerdatabase.insert(Table.SoundStream, buildSoundStreamContentValues(apistreamitem, ((InsertResult) (obj)).getRowId()).get()));
            } else
            {
                step(propellerdatabase.insert(Table.SoundStream, buildSoundStreamContentValues(apistreamitem).get()));
            }
        }

    }
}
