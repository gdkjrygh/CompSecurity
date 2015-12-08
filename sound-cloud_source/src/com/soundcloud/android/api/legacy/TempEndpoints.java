// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.api.legacy;


public interface TempEndpoints
{
    public static interface e1
    {

        public static final String MY_ACTIVITIES = "/e1/me/activities";
        public static final String MY_PLAYLIST_LIKE = "/e1/me/playlist_likes/%d";
        public static final String MY_PLAYLIST_REPOST = "/e1/me/playlist_reposts/%d";
        public static final String MY_SOUNDS_MINI = "/e1/me/sounds/mini";
        public static final String MY_STREAM = "/e1/me/stream";
        public static final String MY_TRACK_LIKE = "/e1/me/track_likes/%d";
        public static final String MY_TRACK_REPOST = "/e1/me/track_reposts/%d";
        public static final String PLAYLIST_LIKERS = "/e1/playlists/%d/likers";
        public static final String PLAYLIST_REPOSTERS = "/e1/playlists/%d/reposters";
        public static final String TRACK_REPOSTERS = "/e1/tracks/%d/reposters";
        public static final String USER_LIKES = "/e1/users/%d/likes";
        public static final String USER_REPOSTS = "/e1/users/%d/reposts";
        public static final String USER_SOUNDS = "/e1/users/%d/sounds";
    }

    public static interface i1
    {

        public static final String MY_SHORTCUTS = "/i1/me/shortcuts";
    }


    public static final String MY_PLAYLISTS = "/me/playlists";
    public static final String PLAYLISTS = "/playlists";
    public static final String PLAYLIST_DETAILS = "/playlists/%d";
    public static final String PLAYLIST_TRACKS = "/playlists/%d/tracks";
    public static final String USER_PLAYLISTS = "/users/%d/playlists";
}
