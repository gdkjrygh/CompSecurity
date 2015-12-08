// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.profile;

import com.soundcloud.android.api.model.Sharing;
import com.soundcloud.android.commands.TrackUrnMapper;
import com.soundcloud.android.likes.LikeProperty;
import com.soundcloud.android.model.PlayableProperty;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.playlists.OfflinePlaylistMapper;
import com.soundcloud.android.playlists.PlaylistProperty;
import com.soundcloud.android.tracks.TrackProperty;
import com.soundcloud.java.collections.PropertySet;
import com.soundcloud.propeller.CursorReader;
import com.soundcloud.propeller.query.ColumnFunctions;
import com.soundcloud.propeller.query.Count;
import com.soundcloud.propeller.query.Field;
import com.soundcloud.propeller.query.Filter;
import com.soundcloud.propeller.query.Query;
import com.soundcloud.propeller.query.Where;
import com.soundcloud.propeller.rx.PropellerRx;
import com.soundcloud.propeller.rx.RxResultMapper;
import com.soundcloud.propeller.schema.Table;
import rx.b;

public class LikesStorage
{
    private static class LikedPlaylistMapper extends OfflinePlaylistMapper
    {

        public PropertySet map(CursorReader cursorreader)
        {
            PropertySet propertyset = PropertySet.create(cursorreader.getColumnCount());
            propertyset.put(PlaylistProperty.URN, Urn.forPlaylist(cursorreader.getLong("_id")));
            propertyset.put(PlaylistProperty.TITLE, cursorreader.getString("title"));
            propertyset.put(PlaylistProperty.CREATOR_NAME, cursorreader.getString("sound_user_username"));
            propertyset.put(PlaylistProperty.TRACK_COUNT, Integer.valueOf(readTrackCount(cursorreader)));
            propertyset.put(PlaylistProperty.LIKES_COUNT, Integer.valueOf(cursorreader.getInt("favoritings_count")));
            propertyset.put(PlaylistProperty.IS_PRIVATE, Boolean.valueOf(Sharing.PRIVATE.name().equalsIgnoreCase(cursorreader.getString("sharing"))));
            propertyset.put(PlayableProperty.IS_LIKED, Boolean.valueOf(true));
            propertyset.put(LikeProperty.CREATED_AT, cursorreader.getDateFromTimestamp("created_at"));
            return propertyset;
        }

        public volatile Object map(CursorReader cursorreader)
        {
            return map(cursorreader);
        }

        int readTrackCount(CursorReader cursorreader)
        {
            return Math.max(cursorreader.getInt("local_track_count"), cursorreader.getInt("track_count"));
        }

        private LikedPlaylistMapper()
        {
        }

        LikedPlaylistMapper(_cls1 _pcls1)
        {
            this();
        }
    }

    private static class LikedTrackMapper extends OfflinePlaylistMapper
    {

        public PropertySet map(CursorReader cursorreader)
        {
            PropertySet propertyset = PropertySet.create(cursorreader.getColumnCount());
            propertyset.put(TrackProperty.URN, Urn.forTrack(cursorreader.getLong("_id")));
            propertyset.put(TrackProperty.TITLE, cursorreader.getString("title"));
            propertyset.put(TrackProperty.CREATOR_NAME, cursorreader.getString("sound_user_username"));
            propertyset.put(TrackProperty.DURATION, Long.valueOf(cursorreader.getLong("duration")));
            propertyset.put(TrackProperty.LIKES_COUNT, Integer.valueOf(cursorreader.getInt("favoritings_count")));
            propertyset.put(TrackProperty.PLAY_COUNT, Integer.valueOf(cursorreader.getInt("playback_count")));
            propertyset.put(TrackProperty.IS_PRIVATE, Boolean.valueOf(Sharing.PRIVATE.name().equalsIgnoreCase(cursorreader.getString("sharing"))));
            propertyset.put(PlayableProperty.IS_LIKED, Boolean.valueOf(true));
            propertyset.put(LikeProperty.CREATED_AT, cursorreader.getDateFromTimestamp("created_at"));
            return propertyset;
        }

        public volatile Object map(CursorReader cursorreader)
        {
            return map(cursorreader);
        }

        private LikedTrackMapper()
        {
        }

        LikedTrackMapper(_cls1 _pcls1)
        {
            this();
        }
    }

    private static class LikesMapper extends RxResultMapper
    {

        private LikedTrackMapper likedTrackMapper;
        private LikedPlaylistMapper playlistMapper;

        public PropertySet map(CursorReader cursorreader)
        {
            if (cursorreader.getInt("_type") == 0)
            {
                return likedTrackMapper.map(cursorreader);
            } else
            {
                return playlistMapper.map(cursorreader);
            }
        }

        public volatile Object map(CursorReader cursorreader)
        {
            return map(cursorreader);
        }

        private LikesMapper()
        {
            playlistMapper = new LikedPlaylistMapper(null);
            likedTrackMapper = new LikedTrackMapper(null);
        }

        LikesMapper(_cls1 _pcls1)
        {
            this();
        }
    }


    private final PropellerRx propellerRx;

    public LikesStorage(PropellerRx propellerrx)
    {
        propellerRx = propellerrx;
    }

    private Query buildLikesQuery(int i, long l)
    {
        return ((Query)((Query)Query.from(new Table[] {
            com.soundcloud.android.storage.Table.Likes
        }).select(new Object[] {
            Field.field(com.soundcloud.android.storage.Table.SoundView.field("_type")).as("_type"), Field.field(com.soundcloud.android.storage.Table.SoundView.field("_id")).as("_id"), Field.field(com.soundcloud.android.storage.Table.SoundView.field("title")).as("title"), Field.field(com.soundcloud.android.storage.Table.SoundView.field("sound_user_username")).as("sound_user_username"), Field.field(com.soundcloud.android.storage.Table.SoundView.field("track_count")).as("track_count"), Field.field(com.soundcloud.android.storage.Table.SoundView.field("favoritings_count")).as("favoritings_count"), Field.field(com.soundcloud.android.storage.Table.SoundView.field("playback_count")).as("playback_count"), Field.field(com.soundcloud.android.storage.Table.SoundView.field("sharing")).as("sharing"), Field.field(com.soundcloud.android.storage.Table.SoundView.field("duration")).as("duration"), Field.field(com.soundcloud.android.storage.Table.Likes.field("created_at")).as("created_at"), 
            ColumnFunctions.count("playlist_id").as("local_track_count")
        }).innerJoin(com.soundcloud.android.storage.Table.SoundView.name(), Query.on(com.soundcloud.android.storage.Table.SoundView.field("_id"), com.soundcloud.android.storage.Table.Likes.field("_id")).whereEq(com.soundcloud.android.storage.Table.SoundView.field("_type"), com.soundcloud.android.storage.Table.Likes.field("_type"))).leftJoin(com.soundcloud.android.storage.Table.PlaylistTracks.name(), playlistTracksFilter()).whereLt(com.soundcloud.android.storage.Table.Likes.field("created_at"), Long.valueOf(l))).whereNull(com.soundcloud.android.storage.Table.Likes.field("removed_at"))).groupBy(new String[] {
            (new StringBuilder()).append(com.soundcloud.android.storage.Table.SoundView.field("_id")).append(",").append(com.soundcloud.android.storage.Table.SoundView.field("_type")).toString()
        }).order(com.soundcloud.android.storage.Table.Likes.field("created_at"), com.soundcloud.propeller.query.Query.Order.DESC).limit(i);
    }

    private Query buildQueryForPlayback()
    {
        return ((Query)((Query)Query.from(new Table[] {
            com.soundcloud.android.storage.Table.Likes
        }).select(new Object[] {
            Field.field(com.soundcloud.android.storage.Table.SoundView.field("_id")).as("_id")
        }).innerJoin(com.soundcloud.android.storage.Table.SoundView.name(), Query.on(com.soundcloud.android.storage.Table.SoundView.field("_id"), com.soundcloud.android.storage.Table.Likes.field("_id")).whereEq(com.soundcloud.android.storage.Table.SoundView.field("_type"), com.soundcloud.android.storage.Table.Likes.field("_type"))).whereEq(com.soundcloud.android.storage.Table.SoundView.field("_type"), Integer.valueOf(0))).whereNull(com.soundcloud.android.storage.Table.Likes.field("removed_at"))).order(com.soundcloud.android.storage.Table.Likes.field("created_at"), com.soundcloud.propeller.query.Query.Order.DESC);
    }

    private Where playlistTracksFilter()
    {
        return Filter.filter().whereEq(com.soundcloud.android.storage.Table.SoundView.field("_type"), Integer.valueOf(1)).whereEq(com.soundcloud.android.storage.Table.SoundView.field("_id"), "playlist_id");
    }

    b loadLikes(int i, long l)
    {
        return propellerRx.query(buildLikesQuery(i, l)).map(new LikesMapper(null)).toList();
    }

    b loadLikesForPlayback()
    {
        return propellerRx.query(buildQueryForPlayback()).map(new TrackUrnMapper()).toList();
    }
}
