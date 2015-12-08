// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.stream;

import com.soundcloud.android.api.model.Sharing;
import com.soundcloud.android.model.PlayableProperty;
import com.soundcloud.android.model.PostProperty;
import com.soundcloud.android.model.PromotedItemProperty;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.playlists.PlaylistProperty;
import com.soundcloud.android.storage.Table;
import com.soundcloud.android.sync.timeline.TimelineStorage;
import com.soundcloud.android.tracks.TrackProperty;
import com.soundcloud.android.utils.ErrorUtils;
import com.soundcloud.java.collections.Lists;
import com.soundcloud.java.collections.Property;
import com.soundcloud.java.collections.PropertyBinding;
import com.soundcloud.java.collections.PropertySet;
import com.soundcloud.java.optional.Optional;
import com.soundcloud.java.strings.Strings;
import com.soundcloud.propeller.CursorReader;
import com.soundcloud.propeller.PropellerDatabase;
import com.soundcloud.propeller.QueryResult;
import com.soundcloud.propeller.query.ColumnFunctions;
import com.soundcloud.propeller.query.Exists;
import com.soundcloud.propeller.query.Field;
import com.soundcloud.propeller.query.Query;
import com.soundcloud.propeller.rx.PropellerRx;
import com.soundcloud.propeller.rx.RxResultMapper;
import java.util.List;
import rx.b;

class SoundStreamStorage
    implements TimelineStorage
{
    private static class PromotedStreamItemMapper extends StreamItemMapper
    {

        private void addOptionalPromotedProperties(CursorReader cursorreader, PropertySet propertyset)
        {
            if (cursorreader.isNotNull("ad_urn"))
            {
                propertyset.put(PromotedItemProperty.AD_URN, cursorreader.getString("ad_urn"));
                propertyset.put(PromotedItemProperty.TRACK_CLICKED_URLS, splitUrls(cursorreader.getString("tracking_track_clicked_urls")));
                propertyset.put(PromotedItemProperty.TRACK_IMPRESSION_URLS, splitUrls(cursorreader.getString("tracking_track_impression_urls")));
                propertyset.put(PromotedItemProperty.TRACK_PLAYED_URLS, splitUrls(cursorreader.getString("tracking_track_played_urls")));
                propertyset.put(PromotedItemProperty.PROMOTER_CLICKED_URLS, splitUrls(cursorreader.getString("tracking_promoter_clicked_urls")));
                addOptionalPromoter(cursorreader, propertyset);
            }
        }

        private void addOptionalPromoter(CursorReader cursorreader, PropertySet propertyset)
        {
            if (cursorreader.isNotNull("promoter_id"))
            {
                propertyset.put(PromotedItemProperty.PROMOTER_URN, Optional.of(Urn.forUser(cursorreader.getLong("promoter_id"))));
                propertyset.put(PromotedItemProperty.PROMOTER_NAME, Optional.of(cursorreader.getString("promoter_name")));
                return;
            } else
            {
                propertyset.put(PromotedItemProperty.PROMOTER_URN, Optional.absent());
                propertyset.put(PromotedItemProperty.PROMOTER_NAME, Optional.absent());
                return;
            }
        }

        private List splitUrls(String s)
        {
            return Lists.newArrayList(s.split(" "));
        }

        public PropertySet map(CursorReader cursorreader)
        {
            PropertySet propertyset = super.map(cursorreader);
            addOptionalPromotedProperties(cursorreader, propertyset);
            return propertyset;
        }

        public volatile Object map(CursorReader cursorreader)
        {
            return map(cursorreader);
        }

        private PromotedStreamItemMapper()
        {
            super(null);
        }

        PromotedStreamItemMapper(_cls1 _pcls1)
        {
            this();
        }
    }

    private static class StreamItemMapper extends RxResultMapper
    {

        private void addOptionalPlayCount(CursorReader cursorreader, PropertySet propertyset)
        {
            if (getSoundType(cursorreader) == 0)
            {
                propertyset.put(TrackProperty.PLAY_COUNT, Integer.valueOf(cursorreader.getInt("playback_count")));
            }
        }

        private void addOptionalReposter(CursorReader cursorreader, PropertySet propertyset)
        {
            if (Strings.isNotBlank(cursorreader.getString("reposter_username")))
            {
                propertyset.put(PostProperty.REPOSTER, cursorreader.getString("reposter_username"));
                propertyset.put(PostProperty.REPOSTER_URN, Urn.forUser(cursorreader.getInt("reposter_id")));
            }
        }

        private void addOptionalTrackCount(CursorReader cursorreader, PropertySet propertyset)
        {
            if (getSoundType(cursorreader) == 1)
            {
                propertyset.put(PlaylistProperty.TRACK_COUNT, Integer.valueOf(cursorreader.getInt("track_count")));
            }
        }

        private void addTitle(CursorReader cursorreader, PropertySet propertyset)
        {
            String s = cursorreader.getString("title");
            if (s == null)
            {
                ErrorUtils.handleSilentException((new StringBuilder("urn : ")).append(readSoundUrn(cursorreader)).toString(), new IllegalStateException("Unexpected null title in stream"));
                propertyset.put(PlayableProperty.TITLE, "");
                return;
            } else
            {
                propertyset.put(PlayableProperty.TITLE, s);
                return;
            }
        }

        private void addUserLike(CursorReader cursorreader, PropertySet propertyset)
        {
            propertyset.put(PlayableProperty.IS_LIKED, Boolean.valueOf(cursorreader.getBoolean("sound_user_like")));
            propertyset.put(PlayableProperty.LIKES_COUNT, Integer.valueOf(cursorreader.getInt("favoritings_count")));
        }

        private void addUserRepost(CursorReader cursorreader, PropertySet propertyset)
        {
            propertyset.put(PlayableProperty.IS_REPOSTED, Boolean.valueOf(cursorreader.getBoolean("sound_user_repost")));
            propertyset.put(PlayableProperty.REPOSTS_COUNT, Integer.valueOf(cursorreader.getInt("reposts_count")));
        }

        private static int getSoundType(CursorReader cursorreader)
        {
            return cursorreader.getInt("sound_type");
        }

        private Urn readSoundUrn(CursorReader cursorreader)
        {
            int i = cursorreader.getInt("sound_id");
            if (getSoundType(cursorreader) == 0)
            {
                return Urn.forTrack(i);
            } else
            {
                return Urn.forPlaylist(i);
            }
        }

        public PropertySet map(CursorReader cursorreader)
        {
            PropertySet propertyset = PropertySet.create(cursorreader.getColumnCount());
            propertyset.put(PlayableProperty.URN, readSoundUrn(cursorreader));
            addTitle(cursorreader, propertyset);
            propertyset.put(PlayableProperty.DURATION, Long.valueOf(cursorreader.getLong("duration")));
            propertyset.put(PlayableProperty.CREATOR_NAME, cursorreader.getString("sound_user_username"));
            propertyset.put(PlayableProperty.CREATOR_URN, Urn.forUser(cursorreader.getInt("sound_user_id")));
            propertyset.put(PlayableProperty.CREATED_AT, cursorreader.getDateFromTimestamp("created_at"));
            propertyset.put(PlayableProperty.IS_PRIVATE, Boolean.valueOf(Sharing.PRIVATE.name().equalsIgnoreCase(cursorreader.getString("sharing"))));
            addUserLike(cursorreader, propertyset);
            addUserRepost(cursorreader, propertyset);
            addOptionalPlayCount(cursorreader, propertyset);
            addOptionalTrackCount(cursorreader, propertyset);
            addOptionalReposter(cursorreader, propertyset);
            if (cursorreader.isNotNull("sound_policies_sub_mid_tier"))
            {
                propertyset.put(TrackProperty.SUB_MID_TIER, Boolean.valueOf(cursorreader.getBoolean("sound_policies_sub_mid_tier")));
            }
            return propertyset;
        }

        public volatile Object map(CursorReader cursorreader)
        {
            return map(cursorreader);
        }

        private StreamItemMapper()
        {
        }

        StreamItemMapper(_cls1 _pcls1)
        {
            this();
        }
    }

    private static final class TrackForPlaybackMapper extends RxResultMapper
    {

        public final PropertySet map(CursorReader cursorreader)
        {
            PropertySet propertyset = PropertySet.from(new PropertyBinding[] {
                TrackProperty.URN.bind(Urn.forTrack(cursorreader.getLong("sound_id")))
            });
            if (cursorreader.isNotNull("reposter_id"))
            {
                propertyset.put(PostProperty.REPOSTER_URN, Urn.forUser(cursorreader.getLong("reposter_id")));
            }
            return propertyset;
        }

        public final volatile Object map(CursorReader cursorreader)
        {
            return map(cursorreader);
        }

        private TrackForPlaybackMapper()
        {
        }

        TrackForPlaybackMapper(_cls1 _pcls1)
        {
            this();
        }
    }


    private static final Object PROMOTED_EXTRAS[];
    private static final Object PROMOTED_STREAM_SELECTION[] = buildPromotedSelection();
    private static final Object STREAM_SELECTION[];
    private static final Object TRACKS_FOR_PLAYBACK_SELECTION[] = {
        "sound_id", "reposter_id"
    };
    private final PropellerDatabase database;
    private final PropellerRx propellerRx;

    public SoundStreamStorage(PropellerRx propellerrx, PropellerDatabase propellerdatabase)
    {
        propellerRx = propellerrx;
        database = propellerdatabase;
    }

    private static Object[] buildPromotedSelection()
    {
        Object aobj[] = new Object[STREAM_SELECTION.length + PROMOTED_EXTRAS.length];
        System.arraycopy(((Object) (STREAM_SELECTION)), 0, ((Object) (aobj)), 0, STREAM_SELECTION.length);
        System.arraycopy(((Object) (PROMOTED_EXTRAS)), 0, ((Object) (aobj)), STREAM_SELECTION.length, PROMOTED_EXTRAS.length);
        return aobj;
    }

    private static Query likeQuery()
    {
        return (Query)Query.from(new String[] {
            Table.Likes.name(), Table.Sounds.name()
        }).joinOn("sound_id", Table.Likes.field("_id")).joinOn("sound_type", Table.Likes.field("_type")).whereNull("removed_at");
    }

    private static Query repostQuery()
    {
        return (Query)Query.from(new String[] {
            Table.Posts.name(), Table.Sounds.name()
        }).joinOn("sound_id", Table.Posts.field("target_id")).joinOn("sound_type", Table.Posts.field("target_type")).whereEq(Table.Posts.field("type"), "repost");
    }

    public List loadStreamItemsSince(long l, int i)
    {
        Query query = ((Query)((Query)((Query)Query.from(new String[] {
            Table.SoundStreamView.name()
        }).select(STREAM_SELECTION).whereGt(Table.SoundStreamView.field("created_at"), Long.valueOf(l))).whereNull("promoted_id")).whereNotNull("title")).limit(i);
        return database.query(query).toList(new StreamItemMapper(null));
    }

    public b timelineItems(int i)
    {
        Query query = ((Query)((Query)Query.from(new String[] {
            Table.SoundStreamView.name()
        }).select(PROMOTED_STREAM_SELECTION).leftJoin(Table.PromotedTracks.name(), Table.PromotedTracks.field("_id"), "promoted_id").whereLe(Table.SoundStreamView.field("created_at"), Long.valueOf(0x7fffffffffffffffL))).whereNotNull("title")).limit(i);
        return propellerRx.query(query).map(new PromotedStreamItemMapper(null));
    }

    public b timelineItemsBefore(long l, int i)
    {
        Query query = ((Query)((Query)((Query)Query.from(new String[] {
            Table.SoundStreamView.name()
        }).select(STREAM_SELECTION).whereLt(Table.SoundStreamView.field("created_at"), Long.valueOf(l))).whereNull("promoted_id")).whereNotNull("title")).limit(i);
        return propellerRx.query(query).map(new StreamItemMapper(null));
    }

    public b tracksForPlayback()
    {
        Query query = (Query)Query.from(new String[] {
            Table.SoundStreamView.name()
        }).select(TRACKS_FOR_PLAYBACK_SELECTION).whereEq("sound_type", Integer.valueOf(0));
        return propellerRx.query(query).map(new TrackForPlaybackMapper(null));
    }

    static 
    {
        STREAM_SELECTION = (new Object[] {
            "sound_id", "sound_type", "title", "sound_user_username", "sound_user_id", "duration", "playback_count", "track_count", "favoritings_count", "reposts_count", 
            "sharing", Field.field(Table.SoundStreamView.field("created_at")).as("created_at"), "sound_policies_sub_mid_tier", "reposter_username", "reposter_id", ColumnFunctions.exists(likeQuery()).as("sound_user_like"), ColumnFunctions.exists(repostQuery()).as("sound_user_repost")
        });
        PROMOTED_EXTRAS = (new Object[] {
            Field.field(Table.PromotedTracks.field("ad_urn")).as("ad_urn"), "promoter_id", "promoter_name", "tracking_track_clicked_urls", "tracking_track_impression_urls", "tracking_track_played_urls", "tracking_promoter_clicked_urls", "tracking_profile_clicked_urls"
        });
    }
}
