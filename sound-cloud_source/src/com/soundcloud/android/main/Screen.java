// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.main;

import android.content.Intent;
import android.os.Bundle;
import java.util.Locale;

public final class Screen extends Enum
{

    private static final Screen $VALUES[];
    public static final Screen ACTIVITIES;
    public static final Screen AUTH_FORGOT_PASSWORD;
    public static final Screen AUTH_LOG_IN;
    public static final Screen AUTH_SIGN_UP;
    public static final Screen AUTH_TERMS;
    public static final Screen AUTH_USER_DETAILS;
    public static final Screen COLLECTIONS;
    public static final Screen DEEPLINK;
    public static final Screen EXPLORE_AUDIO_GENRE;
    public static final Screen EXPLORE_GENRES;
    public static final Screen EXPLORE_MUSIC_GENRE;
    public static final Screen EXPLORE_TRENDING_AUDIO;
    public static final Screen EXPLORE_TRENDING_MUSIC;
    public static final Screen LIKES;
    public static final Screen NOTIFICATION;
    public static final Screen ONBOARDING_FACEBOOK;
    public static final Screen ONBOARDING_GENRE;
    public static final Screen ONBOARDING_MAIN;
    private static final String ORDINAL_EXTRA = "ScreenOrdinal";
    public static final Screen PLAYER_COMMENTS;
    public static final Screen PLAYER_INFO;
    public static final Screen PLAYER_LIKES;
    public static final Screen PLAYER_MAIN;
    public static final Screen PLAYER_REPOSTS;
    public static final Screen PLAYLISTS;
    public static final Screen PLAYLIST_DETAILS;
    public static final Screen PLAYLIST_LIKES;
    public static final Screen PLAYLIST_REPOSTS;
    public static final Screen RECOMMENDATIONS_MAIN;
    public static final Screen RECOMMENDATIONS_MORE;
    public static final Screen RECORD_EDIT;
    public static final Screen RECORD_MAIN;
    public static final Screen RECORD_PROGRESS;
    public static final Screen RECORD_UPLOAD;
    public static final Screen SEARCH_EVERYTHING;
    public static final Screen SEARCH_MAIN;
    public static final Screen SEARCH_PLAYLISTS;
    public static final Screen SEARCH_PLAYLIST_DISCO;
    public static final Screen SEARCH_SUGGESTIONS;
    public static final Screen SEARCH_TRACKS;
    public static final Screen SEARCH_USERS;
    public static final Screen SETTINGS_ACCOUNT;
    public static final Screen SETTINGS_MAIN;
    public static final Screen SETTINGS_NOTIFICATIONS;
    public static final Screen SETTINGS_OFFLINE;
    public static final Screen SIDE_MENU_DRAWER;
    public static final Screen STATIONS_HOME;
    public static final Screen STATIONS_RECENT;
    public static final Screen STATIONS_SHOW_ALL;
    public static final Screen STREAM;
    public static final Screen SUBSCRIBE;
    public static final Screen SUBSCRIBE_SUCCESS;
    public static final Screen SUGGESTED_USERS;
    public static final Screen TOUR;
    public static final Screen UNKNOWN;
    public static final Screen USER_FOLLOWERS;
    public static final Screen USER_FOLLOWINGS;
    public static final Screen USER_HEADER;
    public static final Screen USER_INFO;
    public static final Screen USER_LIKES;
    public static final Screen USER_PLAYLISTS;
    public static final Screen USER_POSTS;
    public static final Screen VOICE_COMMAND;
    public static final Screen WIDGET;
    public static final Screen YOU;
    public static final Screen YOUR_FOLLOWERS;
    public static final Screen YOUR_FOLLOWINGS;
    public static final Screen YOUR_INFO;
    public static final Screen YOUR_LIKES;
    public static final Screen YOUR_PLAYLISTS;
    public static final Screen YOUR_POSTS;
    private final String trackingTag;

    private Screen(String s, int i, String s1)
    {
        super(s, i);
        trackingTag = s1;
    }

    public static Screen fromBundle(Bundle bundle)
    {
        return values()[bundle.getInt("ScreenOrdinal", -1)];
    }

    public static Screen fromIntent(Intent intent)
    {
        return values()[intent.getIntExtra("ScreenOrdinal", 0)];
    }

    public static boolean hasScreen(Intent intent)
    {
        return intent.hasExtra("ScreenOrdinal");
    }

    public static Screen valueOf(String s)
    {
        return (Screen)Enum.valueOf(com/soundcloud/android/main/Screen, s);
    }

    public static Screen[] values()
    {
        return (Screen[])$VALUES.clone();
    }

    public final void addToBundle(Bundle bundle)
    {
        bundle.putInt("ScreenOrdinal", ordinal());
    }

    public final void addToIntent(Intent intent)
    {
        intent.putExtra("ScreenOrdinal", ordinal());
    }

    public final String get()
    {
        return trackingTag;
    }

    public final String get(String s)
    {
        return (new StringBuilder()).append(trackingTag).append(":").append(s.toLowerCase(Locale.US).replaceAll(" ", "_")).toString();
    }

    static 
    {
        UNKNOWN = new Screen("UNKNOWN", 0, "unknown");
        TOUR = new Screen("TOUR", 1, "tour:main");
        AUTH_LOG_IN = new Screen("AUTH_LOG_IN", 2, "auth:log_in_prompt");
        AUTH_SIGN_UP = new Screen("AUTH_SIGN_UP", 3, "auth:sign_up_prompt");
        AUTH_TERMS = new Screen("AUTH_TERMS", 4, "auth:accept_terms");
        AUTH_USER_DETAILS = new Screen("AUTH_USER_DETAILS", 5, "auth:user_details");
        AUTH_FORGOT_PASSWORD = new Screen("AUTH_FORGOT_PASSWORD", 6, "auth:forgot_password");
        SIDE_MENU_DRAWER = new Screen("SIDE_MENU_DRAWER", 7, "drawer");
        STREAM = new Screen("STREAM", 8, "stream:main");
        COLLECTIONS = new Screen("COLLECTIONS", 9, "collection:overview");
        LIKES = new Screen("LIKES", 10, "collection:likes");
        PLAYLISTS = new Screen("PLAYLISTS", 11, "collection:playlists");
        ONBOARDING_MAIN = new Screen("ONBOARDING_MAIN", 12, "onboarding:main");
        ONBOARDING_GENRE = new Screen("ONBOARDING_GENRE", 13, "onboarding:genre");
        ONBOARDING_FACEBOOK = new Screen("ONBOARDING_FACEBOOK", 14, "onboarding:facebook");
        YOUR_POSTS = new Screen("YOUR_POSTS", 15, "you:posts");
        YOUR_INFO = new Screen("YOUR_INFO", 16, "you:info");
        YOUR_PLAYLISTS = new Screen("YOUR_PLAYLISTS", 17, "you:playlists");
        YOUR_LIKES = new Screen("YOUR_LIKES", 18, "you:likes");
        YOUR_FOLLOWINGS = new Screen("YOUR_FOLLOWINGS", 19, "you:followings");
        YOUR_FOLLOWERS = new Screen("YOUR_FOLLOWERS", 20, "you:followers");
        USER_HEADER = new Screen("USER_HEADER", 21, "users:header");
        USER_POSTS = new Screen("USER_POSTS", 22, "users:posts");
        USER_INFO = new Screen("USER_INFO", 23, "users:info");
        USER_PLAYLISTS = new Screen("USER_PLAYLISTS", 24, "users:playlists");
        USER_LIKES = new Screen("USER_LIKES", 25, "users:likes");
        USER_FOLLOWINGS = new Screen("USER_FOLLOWINGS", 26, "users:followings");
        USER_FOLLOWERS = new Screen("USER_FOLLOWERS", 27, "users:followers");
        PLAYER_MAIN = new Screen("PLAYER_MAIN", 28, "tracks:main");
        PLAYER_INFO = new Screen("PLAYER_INFO", 29, "tracks:info");
        PLAYER_LIKES = new Screen("PLAYER_LIKES", 30, "tracks:likes");
        PLAYER_REPOSTS = new Screen("PLAYER_REPOSTS", 31, "tracks:reposts");
        PLAYER_COMMENTS = new Screen("PLAYER_COMMENTS", 32, "tracks:comments");
        SEARCH_MAIN = new Screen("SEARCH_MAIN", 33, "search:main");
        SEARCH_EVERYTHING = new Screen("SEARCH_EVERYTHING", 34, "search:everything");
        SEARCH_TRACKS = new Screen("SEARCH_TRACKS", 35, "search:tracks");
        SEARCH_PLAYLISTS = new Screen("SEARCH_PLAYLISTS", 36, "search:playlists");
        SEARCH_USERS = new Screen("SEARCH_USERS", 37, "search:people");
        SEARCH_SUGGESTIONS = new Screen("SEARCH_SUGGESTIONS", 38, "search:suggestions");
        SEARCH_PLAYLIST_DISCO = new Screen("SEARCH_PLAYLIST_DISCO", 39, "search:tags");
        RECOMMENDATIONS_MAIN = new Screen("RECOMMENDATIONS_MAIN", 40, "personal-recommended:main");
        RECOMMENDATIONS_MORE = new Screen("RECOMMENDATIONS_MORE", 41, "personal-recommended:more");
        RECORD_MAIN = new Screen("RECORD_MAIN", 42, "record:main");
        RECORD_EDIT = new Screen("RECORD_EDIT", 43, "record:edit");
        RECORD_UPLOAD = new Screen("RECORD_UPLOAD", 44, "record:share");
        RECORD_PROGRESS = new Screen("RECORD_PROGRESS", 45, "record:progress");
        PLAYLIST_DETAILS = new Screen("PLAYLIST_DETAILS", 46, "playlists:main");
        PLAYLIST_LIKES = new Screen("PLAYLIST_LIKES", 47, "playlists:likes");
        PLAYLIST_REPOSTS = new Screen("PLAYLIST_REPOSTS", 48, "playlists:reposts");
        ACTIVITIES = new Screen("ACTIVITIES", 49, "activity:main");
        YOU = new Screen("YOU", 50, "you:main");
        EXPLORE_GENRES = new Screen("EXPLORE_GENRES", 51, "explore:genres");
        EXPLORE_TRENDING_MUSIC = new Screen("EXPLORE_TRENDING_MUSIC", 52, "explore:trending_music");
        EXPLORE_TRENDING_AUDIO = new Screen("EXPLORE_TRENDING_AUDIO", 53, "explore:trending_audio");
        EXPLORE_AUDIO_GENRE = new Screen("EXPLORE_AUDIO_GENRE", 54, "explore:audio");
        EXPLORE_MUSIC_GENRE = new Screen("EXPLORE_MUSIC_GENRE", 55, "explore:music");
        SETTINGS_MAIN = new Screen("SETTINGS_MAIN", 56, "settings:main");
        SETTINGS_NOTIFICATIONS = new Screen("SETTINGS_NOTIFICATIONS", 57, "settings:notification_settings");
        SETTINGS_ACCOUNT = new Screen("SETTINGS_ACCOUNT", 58, "settings:account_sync_settings");
        SETTINGS_OFFLINE = new Screen("SETTINGS_OFFLINE", 59, "settings:offline_sync_settings");
        WIDGET = new Screen("WIDGET", 60, "widget");
        SUBSCRIBE = new Screen("SUBSCRIBE", 61, "subscribe");
        SUBSCRIBE_SUCCESS = new Screen("SUBSCRIBE_SUCCESS", 62, "subscribe_success");
        SUGGESTED_USERS = new Screen("SUGGESTED_USERS", 63, "suggested_users");
        VOICE_COMMAND = new Screen("VOICE_COMMAND", 64, "voice:command");
        DEEPLINK = new Screen("DEEPLINK", 65, "deeplink");
        NOTIFICATION = new Screen("NOTIFICATION", 66, "notification");
        STATIONS_HOME = new Screen("STATIONS_HOME", 67, "stations:home");
        STATIONS_SHOW_ALL = new Screen("STATIONS_SHOW_ALL", 68, "stations:show_all");
        STATIONS_RECENT = new Screen("STATIONS_RECENT", 69, "stations:recent_stations");
        $VALUES = (new Screen[] {
            UNKNOWN, TOUR, AUTH_LOG_IN, AUTH_SIGN_UP, AUTH_TERMS, AUTH_USER_DETAILS, AUTH_FORGOT_PASSWORD, SIDE_MENU_DRAWER, STREAM, COLLECTIONS, 
            LIKES, PLAYLISTS, ONBOARDING_MAIN, ONBOARDING_GENRE, ONBOARDING_FACEBOOK, YOUR_POSTS, YOUR_INFO, YOUR_PLAYLISTS, YOUR_LIKES, YOUR_FOLLOWINGS, 
            YOUR_FOLLOWERS, USER_HEADER, USER_POSTS, USER_INFO, USER_PLAYLISTS, USER_LIKES, USER_FOLLOWINGS, USER_FOLLOWERS, PLAYER_MAIN, PLAYER_INFO, 
            PLAYER_LIKES, PLAYER_REPOSTS, PLAYER_COMMENTS, SEARCH_MAIN, SEARCH_EVERYTHING, SEARCH_TRACKS, SEARCH_PLAYLISTS, SEARCH_USERS, SEARCH_SUGGESTIONS, SEARCH_PLAYLIST_DISCO, 
            RECOMMENDATIONS_MAIN, RECOMMENDATIONS_MORE, RECORD_MAIN, RECORD_EDIT, RECORD_UPLOAD, RECORD_PROGRESS, PLAYLIST_DETAILS, PLAYLIST_LIKES, PLAYLIST_REPOSTS, ACTIVITIES, 
            YOU, EXPLORE_GENRES, EXPLORE_TRENDING_MUSIC, EXPLORE_TRENDING_AUDIO, EXPLORE_AUDIO_GENRE, EXPLORE_MUSIC_GENRE, SETTINGS_MAIN, SETTINGS_NOTIFICATIONS, SETTINGS_ACCOUNT, SETTINGS_OFFLINE, 
            WIDGET, SUBSCRIBE, SUBSCRIBE_SUCCESS, SUGGESTED_USERS, VOICE_COMMAND, DEEPLINK, NOTIFICATION, STATIONS_HOME, STATIONS_SHOW_ALL, STATIONS_RECENT
        });
    }
}
