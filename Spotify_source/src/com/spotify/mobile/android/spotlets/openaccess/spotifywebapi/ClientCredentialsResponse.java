// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.openaccess.spotifywebapi;

import com.spotify.mobile.android.cosmos.JacksonModel;

public class ClientCredentialsResponse
    implements JacksonModel
{

    private final String mAccessToken;
    private final Long mExpiresIn;
    private final String mTokenType;

    private ClientCredentialsResponse(String s, String s1, Long long1)
    {
        mAccessToken = s;
        mTokenType = s1;
        mExpiresIn = long1;
    }

    public String getAccessToken()
    {
        return mAccessToken;
    }

    public Long getExpiresIn()
    {
        return mExpiresIn;
    }

    public String getTokenType()
    {
        return mTokenType;
    }
}
