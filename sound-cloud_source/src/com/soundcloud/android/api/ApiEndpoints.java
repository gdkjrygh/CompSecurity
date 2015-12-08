// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.api;

import com.soundcloud.java.collections.Lists;
import com.soundcloud.java.functions.Function;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public final class ApiEndpoints extends Enum
{

    private static final ApiEndpoints $VALUES[];
    public static final ApiEndpoints ACTIVITIES;
    public static final ApiEndpoints ADS;
    public static final ApiEndpoints AUDIO_AD;
    public static final ApiEndpoints BULK_FOLLOW_USERS;
    public static final ApiEndpoints CHECKOUT;
    public static final ApiEndpoints CHECKOUT_URN;
    public static final ApiEndpoints CONFIGURATION;
    public static final ApiEndpoints CREATE_PLAYLIST_LIKES;
    public static final ApiEndpoints CREATE_TRACK_LIKES;
    public static final ApiEndpoints CURRENT_USER;
    public static final ApiEndpoints DELETE_PLAYLIST_LIKES;
    public static final ApiEndpoints DELETE_TRACK_LIKES;
    public static final ApiEndpoints EXPLORE_TRACKS_CATEGORIES;
    public static final ApiEndpoints EXPLORE_TRACKS_POPULAR_AUDIO;
    public static final ApiEndpoints EXPLORE_TRACKS_POPULAR_MUSIC;
    public static final ApiEndpoints HLS_STREAM;
    public static final ApiEndpoints HTTPS_STREAM;
    public static final ApiEndpoints HTTP_STREAM;
    public static final ApiEndpoints IMAGES;
    public static final ApiEndpoints LEGACY_TRACK;
    public static final ApiEndpoints LEGACY_TRACKS;
    public static final ApiEndpoints LEGACY_USER;
    public static final ApiEndpoints LEGACY_USERS;
    public static final ApiEndpoints LEGACY_USER_FOLLOWERS;
    public static final ApiEndpoints LEGACY_USER_FOLLOWINGS;
    public static final ApiEndpoints LEGACY_USER_LIKES;
    public static final ApiEndpoints LEGACY_USER_PLAYLISTS;
    public static final ApiEndpoints LEGACY_USER_SOUNDS;
    public static final ApiEndpoints LIKED_PLAYLISTS;
    public static final ApiEndpoints LIKED_TRACKS;
    public static final ApiEndpoints LOG_PLAY;
    public static final ApiEndpoints MY_DOB;
    public static final ApiEndpoints MY_PLAYLIST_POSTS;
    public static final ApiEndpoints MY_PLAYLIST_REPOSTS;
    public static final ApiEndpoints MY_TRACK_POSTS;
    public static final ApiEndpoints MY_TRACK_REPOSTS;
    public static final ApiEndpoints OAUTH2_TOKEN;
    public static final ApiEndpoints PLAYLISTS_CREATE;
    public static final ApiEndpoints PLAYLISTS_FETCH;
    public static final ApiEndpoints PLAYLIST_ADD_TRACK;
    public static final ApiEndpoints PLAYLIST_DISCOVERY;
    public static final ApiEndpoints PLAYLIST_DISCOVERY_TAGS;
    public static final ApiEndpoints PLAYLIST_REMOVE_TRACK;
    public static final ApiEndpoints PLAYLIST_WITH_TRACKS;
    public static final ApiEndpoints PLAY_PUBLISH;
    public static final ApiEndpoints POLICIES;
    public static final ApiEndpoints PRODUCTS;
    public static final ApiEndpoints RECOMMENDATIONS;
    public static final ApiEndpoints RELATED_TRACKS;
    public static final ApiEndpoints RESOLVE;
    public static final ApiEndpoints SEARCH_ALL;
    public static final ApiEndpoints SEARCH_PLAYLISTS;
    public static final ApiEndpoints SEARCH_TRACKS;
    public static final ApiEndpoints SEARCH_USERS;
    public static final ApiEndpoints STATION;
    public static final ApiEndpoints STATIONS;
    public static final ApiEndpoints STREAM;
    public static final ApiEndpoints SUBSCRIPTIONS;
    public static final ApiEndpoints SUGGESTED_USER_CATEGORIES;
    public static final ApiEndpoints SUGGESTED_USER_FACEBOOK_CATEGORIES;
    public static final ApiEndpoints TRACKS_FETCH;
    public static final ApiEndpoints TRACK_COMMENTS;
    public static final ApiEndpoints USER_LIKES;
    public static final ApiEndpoints USER_POSTED_PLAYLISTS;
    public static final ApiEndpoints USER_POSTS;
    private static final Function encodingFunction = new _cls1();
    private final String path;

    private ApiEndpoints(String s, int i, String s1)
    {
        super(s, i);
        path = s1;
    }

    public static ApiEndpoints valueOf(String s)
    {
        return (ApiEndpoints)Enum.valueOf(com/soundcloud/android/api/ApiEndpoints, s);
    }

    public static ApiEndpoints[] values()
    {
        return (ApiEndpoints[])$VALUES.clone();
    }

    public final String path()
    {
        return path;
    }

    public final transient String path(Object aobj[])
    {
        aobj = Lists.transform(Arrays.asList(aobj), encodingFunction);
        return String.format(Locale.US, path, ((List) (aobj)).toArray());
    }

    public final transient String unencodedPath(Object aobj[])
    {
        aobj = Arrays.asList(aobj);
        return String.format(Locale.US, path, ((List) (aobj)).toArray());
    }

    static 
    {
        SUGGESTED_USER_CATEGORIES = new ApiEndpoints("SUGGESTED_USER_CATEGORIES", 0, "/suggestions/users/categories");
        SUGGESTED_USER_FACEBOOK_CATEGORIES = new ApiEndpoints("SUGGESTED_USER_FACEBOOK_CATEGORIES", 1, "/suggestions/users/social/facebook");
        EXPLORE_TRACKS_POPULAR_MUSIC = new ApiEndpoints("EXPLORE_TRACKS_POPULAR_MUSIC", 2, "/suggestions/tracks/popular/music");
        EXPLORE_TRACKS_POPULAR_AUDIO = new ApiEndpoints("EXPLORE_TRACKS_POPULAR_AUDIO", 3, "/suggestions/tracks/popular/audio");
        EXPLORE_TRACKS_CATEGORIES = new ApiEndpoints("EXPLORE_TRACKS_CATEGORIES", 4, "/suggestions/tracks/categories");
        RELATED_TRACKS = new ApiEndpoints("RELATED_TRACKS", 5, "/tracks/%s/related");
        SEARCH_TRACKS = new ApiEndpoints("SEARCH_TRACKS", 6, "/search/tracks");
        SEARCH_USERS = new ApiEndpoints("SEARCH_USERS", 7, "/search/users");
        SEARCH_PLAYLISTS = new ApiEndpoints("SEARCH_PLAYLISTS", 8, "/search/playlists");
        SEARCH_ALL = new ApiEndpoints("SEARCH_ALL", 9, "/search/universal");
        PLAYLIST_DISCOVERY = new ApiEndpoints("PLAYLIST_DISCOVERY", 10, "/suggestions/playlists");
        PLAYLIST_DISCOVERY_TAGS = new ApiEndpoints("PLAYLIST_DISCOVERY_TAGS", 11, "/suggestions/playlists/tags");
        RECOMMENDATIONS = new ApiEndpoints("RECOMMENDATIONS", 12, "/you/personalized-tracks");
        ADS = new ApiEndpoints("ADS", 13, "/tracks/%s/ads");
        AUDIO_AD = new ApiEndpoints("AUDIO_AD", 14, "/tracks/%s/ads/audio");
        POLICIES = new ApiEndpoints("POLICIES", 15, "/policies/tracks");
        PRODUCTS = new ApiEndpoints("PRODUCTS", 16, "/products/google-play");
        CHECKOUT = new ApiEndpoints("CHECKOUT", 17, "/checkout");
        CHECKOUT_URN = new ApiEndpoints("CHECKOUT_URN", 18, "/checkout/%s");
        LIKED_TRACKS = new ApiEndpoints("LIKED_TRACKS", 19, "/likes/tracks");
        LIKED_PLAYLISTS = new ApiEndpoints("LIKED_PLAYLISTS", 20, "/likes/playlists");
        CREATE_TRACK_LIKES = new ApiEndpoints("CREATE_TRACK_LIKES", 21, "/likes/tracks/create");
        DELETE_TRACK_LIKES = new ApiEndpoints("DELETE_TRACK_LIKES", 22, "/likes/tracks/delete");
        CREATE_PLAYLIST_LIKES = new ApiEndpoints("CREATE_PLAYLIST_LIKES", 23, "/likes/playlists/create");
        DELETE_PLAYLIST_LIKES = new ApiEndpoints("DELETE_PLAYLIST_LIKES", 24, "/likes/playlists/delete");
        MY_TRACK_POSTS = new ApiEndpoints("MY_TRACK_POSTS", 25, "/you/posts_and_reposts/tracks");
        MY_PLAYLIST_POSTS = new ApiEndpoints("MY_PLAYLIST_POSTS", 26, "/you/posts_and_reposts/playlists");
        MY_DOB = new ApiEndpoints("MY_DOB", 27, "/you/profile/dob");
        USER_POSTS = new ApiEndpoints("USER_POSTS", 28, "/users/%s/posted_and_reposted_tracks_and_playlists");
        USER_POSTED_PLAYLISTS = new ApiEndpoints("USER_POSTED_PLAYLISTS", 29, "/users/%s/posted_playlists");
        USER_LIKES = new ApiEndpoints("USER_LIKES", 30, "/users/%s/liked_tracks_and_playlists");
        PLAYLISTS_CREATE = new ApiEndpoints("PLAYLISTS_CREATE", 31, "/playlists");
        PLAYLISTS_FETCH = new ApiEndpoints("PLAYLISTS_FETCH", 32, "/playlists/fetch");
        PLAYLIST_WITH_TRACKS = new ApiEndpoints("PLAYLIST_WITH_TRACKS", 33, "/playlists/%s/info");
        PLAYLIST_ADD_TRACK = new ApiEndpoints("PLAYLIST_ADD_TRACK", 34, "/playlists/%s/tracks");
        PLAYLIST_REMOVE_TRACK = new ApiEndpoints("PLAYLIST_REMOVE_TRACK", 35, "/playlists/%s/tracks/%s");
        STATION = new ApiEndpoints("STATION", 36, "/stations/%s/station_and_tracks");
        STATIONS = new ApiEndpoints("STATIONS", 37, "/stations");
        STREAM = new ApiEndpoints("STREAM", 38, "/stream");
        ACTIVITIES = new ApiEndpoints("ACTIVITIES", 39, "/activities");
        HLS_STREAM = new ApiEndpoints("HLS_STREAM", 40, "/tracks/%s/streams/hls");
        HTTP_STREAM = new ApiEndpoints("HTTP_STREAM", 41, "/tracks/%s/streams/http");
        HTTPS_STREAM = new ApiEndpoints("HTTPS_STREAM", 42, "/tracks/%s/streams/https");
        SUBSCRIPTIONS = new ApiEndpoints("SUBSCRIPTIONS", 43, "/subscriptions");
        LOG_PLAY = new ApiEndpoints("LOG_PLAY", 44, "/tracks/%s/plays");
        IMAGES = new ApiEndpoints("IMAGES", 45, "/images/%s/%s");
        TRACKS_FETCH = new ApiEndpoints("TRACKS_FETCH", 46, "/tracks/fetch");
        CONFIGURATION = new ApiEndpoints("CONFIGURATION", 47, "/configuration/android");
        PLAY_PUBLISH = new ApiEndpoints("PLAY_PUBLISH", 48, "/tpub");
        CURRENT_USER = new ApiEndpoints("CURRENT_USER", 49, "/me");
        RESOLVE = new ApiEndpoints("RESOLVE", 50, "/resolve");
        MY_TRACK_REPOSTS = new ApiEndpoints("MY_TRACK_REPOSTS", 51, "/e1/me/track_reposts/%s");
        MY_PLAYLIST_REPOSTS = new ApiEndpoints("MY_PLAYLIST_REPOSTS", 52, "/e1/me/playlist_reposts/%s");
        BULK_FOLLOW_USERS = new ApiEndpoints("BULK_FOLLOW_USERS", 53, "/me/suggested/users");
        LEGACY_TRACKS = new ApiEndpoints("LEGACY_TRACKS", 54, "/tracks");
        LEGACY_TRACK = new ApiEndpoints("LEGACY_TRACK", 55, "/tracks/%s");
        LEGACY_USERS = new ApiEndpoints("LEGACY_USERS", 56, "/users");
        LEGACY_USER = new ApiEndpoints("LEGACY_USER", 57, "/users/%s");
        TRACK_COMMENTS = new ApiEndpoints("TRACK_COMMENTS", 58, "/tracks/%s/comments");
        LEGACY_USER_SOUNDS = new ApiEndpoints("LEGACY_USER_SOUNDS", 59, "/e1/users/%s/sounds");
        LEGACY_USER_LIKES = new ApiEndpoints("LEGACY_USER_LIKES", 60, "/e1/users/%s/likes");
        LEGACY_USER_PLAYLISTS = new ApiEndpoints("LEGACY_USER_PLAYLISTS", 61, "/users/%s/playlists");
        LEGACY_USER_FOLLOWINGS = new ApiEndpoints("LEGACY_USER_FOLLOWINGS", 62, "/users/%s/followings");
        LEGACY_USER_FOLLOWERS = new ApiEndpoints("LEGACY_USER_FOLLOWERS", 63, "/users/%s/followers");
        OAUTH2_TOKEN = new ApiEndpoints("OAUTH2_TOKEN", 64, "/oauth2/token");
        $VALUES = (new ApiEndpoints[] {
            SUGGESTED_USER_CATEGORIES, SUGGESTED_USER_FACEBOOK_CATEGORIES, EXPLORE_TRACKS_POPULAR_MUSIC, EXPLORE_TRACKS_POPULAR_AUDIO, EXPLORE_TRACKS_CATEGORIES, RELATED_TRACKS, SEARCH_TRACKS, SEARCH_USERS, SEARCH_PLAYLISTS, SEARCH_ALL, 
            PLAYLIST_DISCOVERY, PLAYLIST_DISCOVERY_TAGS, RECOMMENDATIONS, ADS, AUDIO_AD, POLICIES, PRODUCTS, CHECKOUT, CHECKOUT_URN, LIKED_TRACKS, 
            LIKED_PLAYLISTS, CREATE_TRACK_LIKES, DELETE_TRACK_LIKES, CREATE_PLAYLIST_LIKES, DELETE_PLAYLIST_LIKES, MY_TRACK_POSTS, MY_PLAYLIST_POSTS, MY_DOB, USER_POSTS, USER_POSTED_PLAYLISTS, 
            USER_LIKES, PLAYLISTS_CREATE, PLAYLISTS_FETCH, PLAYLIST_WITH_TRACKS, PLAYLIST_ADD_TRACK, PLAYLIST_REMOVE_TRACK, STATION, STATIONS, STREAM, ACTIVITIES, 
            HLS_STREAM, HTTP_STREAM, HTTPS_STREAM, SUBSCRIPTIONS, LOG_PLAY, IMAGES, TRACKS_FETCH, CONFIGURATION, PLAY_PUBLISH, CURRENT_USER, 
            RESOLVE, MY_TRACK_REPOSTS, MY_PLAYLIST_REPOSTS, BULK_FOLLOW_USERS, LEGACY_TRACKS, LEGACY_TRACK, LEGACY_USERS, LEGACY_USER, TRACK_COMMENTS, LEGACY_USER_SOUNDS, 
            LEGACY_USER_LIKES, LEGACY_USER_PLAYLISTS, LEGACY_USER_FOLLOWINGS, LEGACY_USER_FOLLOWERS, OAUTH2_TOKEN
        });
    }

    private class _cls1
        implements Function
    {

        public final Object apply(Object obj)
        {
            return Uri.encode(String.valueOf(obj));
        }

        _cls1()
        {
        }
    }

}
