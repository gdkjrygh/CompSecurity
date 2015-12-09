// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.http;

import com.spotify.mobile.android.cosmos.JacksonModel;

public class TokenResponse
    implements JacksonModel
{

    public String accessToken;
    public long expiresIn;
    public String tokenType;

    public TokenResponse(String s, long l, String s1)
    {
        accessToken = s;
        expiresIn = l;
        tokenType = s1;
    }
}
