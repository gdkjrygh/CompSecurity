// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.profile;

import com.soundcloud.android.accounts.AccountOperations;
import com.soundcloud.android.api.model.Sharing;
import com.soundcloud.android.model.PlayableProperty;
import com.soundcloud.android.model.PostProperty;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.playlists.OfflinePlaylistMapper;
import com.soundcloud.android.playlists.PlaylistProperty;
import com.soundcloud.android.storage.Table;
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
import rx.b;
import rx.b.g;

public class PostsStorage
{
    private static class PostedPlaylistMapper extends OfflinePlaylistMapper
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
            propertyset.put(PlayableProperty.IS_LIKED, Boolean.valueOf(cursorreader.isNotNull("liked_id")));
            propertyset.put(PlayableProperty.IS_REPOSTED, Boolean.valueOf("repost".equals(cursorreader.getString("type"))));
            propertyset.put(PostProperty.CREATED_AT, cursorreader.getDateFromTimestamp("created_at"));
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

        private PostedPlaylistMapper()
        {
        }

        PostedPlaylistMapper(_cls1 _pcls1)
        {
            this();
        }
    }

    private static class PostedTracksMapper extends OfflinePlaylistMapper
    {

        public PropertySet map(CursorReader cursorreader)
        {
            PropertySet propertyset = PropertySet.create(cursorreader.getColumnCount());
            propertyset.put(TrackProperty.URN, Urn.forTrack(cursorreader.getLong("_id")));
            propertyset.put(TrackProperty.TITLE, cursorreader.getString("title"));
            propertyset.put(TrackProperty.CREATOR_NAME, cursorreader.getString("sound_user_username"));
            propertyset.put(TrackProperty.DURATION, Long.valueOf(cursorreader.getLong("duration")));
            propertyset.put(TrackProperty.PLAY_COUNT, Integer.valueOf(cursorreader.getInt("playback_count")));
            propertyset.put(TrackProperty.LIKES_COUNT, Integer.valueOf(cursorreader.getInt("favoritings_count")));
            propertyset.put(TrackProperty.IS_PRIVATE, Boolean.valueOf(Sharing.PRIVATE.name().equalsIgnoreCase(cursorreader.getString("sharing"))));
            propertyset.put(PlayableProperty.IS_LIKED, Boolean.valueOf(cursorreader.isNotNull("liked_id")));
            propertyset.put(PlayableProperty.IS_REPOSTED, Boolean.valueOf("repost".equals(cursorreader.getString("type"))));
            propertyset.put(PostProperty.CREATED_AT, cursorreader.getDateFromTimestamp("created_at"));
            return propertyset;
        }

        public volatile Object map(CursorReader cursorreader)
        {
            return map(cursorreader);
        }

        private PostedTracksMapper()
        {
        }

        PostedTracksMapper(_cls1 _pcls1)
        {
            this();
        }
    }

    private class PostsForPlaybackMapper extends RxResultMapper
    {

        final PostsStorage this$0;

        public PropertySet map(CursorReader cursorreader)
        {
            PropertySet propertyset = PropertySet.create(cursorreader.getColumnCount());
            if (cursorreader.getInt("_type") == 0)
            {
                propertyset.put(TrackProperty.URN, Urn.forTrack(cursorreader.getLong("_id")));
            } else
            {
                propertyset.put(PlaylistProperty.URN, Urn.forPlaylist(cursorreader.getLong("_id")));
            }
            if ("repost".equals(cursorreader.getString("type")))
            {
                propertyset.put(PostProperty.REPOSTER_URN, accountOperations.getLoggedInUserUrn());
            }
            return propertyset;
        }

        public volatile Object map(CursorReader cursorreader)
        {
            return map(cursorreader);
        }

        private PostsForPlaybackMapper()
        {
            this$0 = PostsStorage.this;
            super();
        }

        PostsForPlaybackMapper(_cls1 _pcls1)
        {
            this();
        }
    }

    private static class PostsMapper extends RxResultMapper
    {

        private PostedPlaylistMapper playlistMapper;
        private PostedTracksMapper postedTracksMapper;

        public PropertySet map(CursorReader cursorreader)
        {
            if (cursorreader.getInt("_type") == 0)
            {
                return postedTracksMapper.map(cursorreader);
            } else
            {
                return playlistMapper.map(cursorreader);
            }
        }

        public volatile Object map(CursorReader cursorreader)
        {
            return map(cursorreader);
        }

        private PostsMapper()
        {
            playlistMapper = new PostedPlaylistMapper(null);
            postedTracksMapper = new PostedTracksMapper(null);
        }

        PostsMapper(_cls1 _pcls1)
        {
            this();
        }
    }


    private static final g COMBINE_REPOSTER = new _cls1();
    private static final String LIKED_ID = "liked_id";
    private final AccountOperations accountOperations;
    private final PropellerRx propellerRx;

    public PostsStorage(PropellerRx propellerrx, AccountOperations accountoperations)
    {
        propellerRx = propellerrx;
        accountOperations = accountoperations;
    }

    private Query buildPostsQuery(int i, long l)
    {
        return ((Query)Query.from(new String[] {
            Table.Posts.name()
        }).select(new Object[] {
            Field.field(Table.SoundView.field("_type")).as("_type"), Field.field(Table.SoundView.field("_id")).as("_id"), Field.field(Table.SoundView.field("title")).as("title"), Field.field(Table.SoundView.field("sound_user_username")).as("sound_user_username"), Field.field(Table.SoundView.field("track_count")).as("track_count"), Field.field(Table.SoundView.field("favoritings_count")).as("favoritings_count"), Field.field(Table.SoundView.field("sharing")).as("sharing"), Field.field(Table.SoundView.field("duration")).as("duration"), Field.field(Table.SoundView.field("playback_count")).as("playback_count"), Field.field(Table.Posts.field("type")).as("type"), 
            Field.field(Table.Posts.field("created_at")).as("created_at"), Field.field(Table.Likes.field("_id")).as("liked_id"), ColumnFunctions.count("playlist_id").as("local_track_count")
        }).innerJoin(Table.SoundView.name(), Query.on(Table.SoundView.field("_id"), Table.Posts.field("target_id")).whereEq(Table.SoundView.field("_type"), Table.Posts.field("target_type"))).leftJoin(Table.PlaylistTracks.name(), playlistTracksFilter()).leftJoin(Table.Likes.name(), Query.on(Table.SoundView.field("_id"), Table.Likes.field("_id")).whereEq(Table.SoundView.field("_type"), Table.Likes.field("_type"))).whereLt(Table.Posts.field("created_at"), Long.valueOf(l))).groupBy(new String[] {
            (new StringBuilder()).append(Table.SoundView.field("_id")).append(",").append(Table.SoundView.field("_type")).toString()
        }).order(Table.Posts.field("created_at"), com.soundcloud.propeller.query.Query.Order.DESC).limit(i);
    }

    private Query buildQueryForPlayback()
    {
        return ((Query)Query.from(new String[] {
            Table.Posts.name()
        }).select(new Object[] {
            Field.field(Table.SoundView.field("_type")).as("_type"), Field.field(Table.SoundView.field("_id")).as("_id"), Field.field(Table.Posts.field("type")).as("type")
        }).innerJoin(Table.SoundView.name(), Query.on(Table.SoundView.field("_id"), Table.Posts.field("target_id")).whereEq(Table.SoundView.field("_type"), Table.Posts.field("target_type"))).whereEq(Table.SoundView.field("_type"), Integer.valueOf(0))).groupBy(new String[] {
            (new StringBuilder()).append(Table.SoundView.field("_id")).append(",").append(Table.SoundView.field("_type")).toString()
        }).order(Table.Posts.field("created_at"), com.soundcloud.propeller.query.Query.Order.DESC);
    }

    private Query buildUserQuery()
    {
        return (Query)Query.from(new String[] {
            Table.Users.name()
        }).select(new Object[] {
            Field.field(Table.Users.field("username"))
        }).whereEq(Table.Users.field("_id"), Long.valueOf(accountOperations.getLoggedInUserUrn().getNumericId()));
    }

    private Where playlistTracksFilter()
    {
        return Filter.filter().whereEq(Table.SoundView.field("_type"), Integer.valueOf(1)).whereEq(Table.SoundView.field("_id"), "playlist_id");
    }

    b loadPosts(int i, long l)
    {
        return b.zip(propellerRx.query(buildPostsQuery(i, l)).map(new PostsMapper(null)).toList(), propellerRx.query(buildUserQuery()).map(RxResultMapper.scalar(java/lang/String)).firstOrDefault(""), COMBINE_REPOSTER);
    }

    b loadPostsForPlayback()
    {
        return propellerRx.query(buildQueryForPlayback()).map(new PostsForPlaybackMapper(null)).toList();
    }



    private class _cls1
        implements g
    {

        public final volatile Object call(Object obj, Object obj1)
        {
            return call((List)obj, (String)obj1);
        }

        public final List call(List list, String s)
        {
            Iterator iterator = list.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                PropertySet propertyset = (PropertySet)iterator.next();
                if (((Boolean)propertyset.getOrElse(PlayableProperty.IS_REPOSTED, Boolean.valueOf(false))).booleanValue())
                {
                    propertyset.put(PostProperty.REPOSTER, s);
                }
            } while (true);
            return list;
        }

        _cls1()
        {
        }
    }

}
