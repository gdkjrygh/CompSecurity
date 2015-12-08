// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.browse.model;

import com.spotify.mobile.android.cosmos.JacksonModel;

public class CollectionFavorite
    implements JacksonModel
{

    public static final String TYPE_ALBUM = "ALBUM";
    public static final String TYPE_ARTIST = "ARTIST";
    public static final String TYPE_PLAYLIST = "PLAYLIST";
    public static final String TYPE_TRACK = "TRACK";
    final String mImage;
    final String mTitle;
    final String mType;
    final String mUri;

    public CollectionFavorite(String s, String s1, String s2, String s3)
    {
        mType = s;
        mUri = s1;
        mTitle = s2;
        mImage = s3;
    }

    public String getImage()
    {
        return mImage;
    }

    public String getTitle()
    {
        return mTitle;
    }

    public String getType()
    {
        return mType;
    }

    public String getUri()
    {
        return mUri;
    }
}
