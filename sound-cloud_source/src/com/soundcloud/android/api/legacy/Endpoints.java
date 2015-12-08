// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.api.legacy;


public interface Endpoints
{

    public static final String MY_DETAILS = "/me";
    public static final String MY_FOLLOWERS = "/me/followers";
    public static final String MY_FOLLOWING = "/me/followings/%d";
    public static final String MY_FOLLOWINGS = "/me/followings";
    public static final String PLAYLISTS = "/playlists";
    public static final String RESOLVE = "/resolve";
    public static final String SEND_PASSWORD = "/passwords/reset-instructions";
    public static final String SUGGESTED_USERS = "/users/suggested";
    public static final String TOKEN = "/oauth2/token";
    public static final String TRACKS = "/tracks";
    public static final String TRACK_DETAILS = "/tracks/%d";
    public static final String TRACK_FAVORITERS = "/tracks/%d/favoriters";
    public static final String USERS = "/users";
    public static final String USER_DETAILS = "/users/%d";
    public static final String USER_FOLLOWERS = "/users/%d/followers";
    public static final String USER_FOLLOWINGS = "/users/%d/followings";
}
