// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.arsenal.auth;

import com.spotify.mobile.android.cosmos.JacksonModel;

public final class TokenResponse
    implements JacksonModel
{

    private final String mRefreshToken;

    public TokenResponse(String s)
    {
        mRefreshToken = s;
    }

    public final String getRefreshToken()
    {
        return mRefreshToken;
    }
}
