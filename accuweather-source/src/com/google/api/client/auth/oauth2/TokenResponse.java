// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.auth.oauth2;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.GenericData;
import com.google.api.client.util.Preconditions;

public class TokenResponse extends GenericJson
{

    private String accessToken;
    private Long expiresInSeconds;
    private String refreshToken;
    private String scope;
    private String tokenType;

    public TokenResponse()
    {
    }

    public TokenResponse clone()
    {
        return (TokenResponse)super.clone();
    }

    public volatile GenericJson clone()
    {
        return clone();
    }

    public volatile GenericData clone()
    {
        return clone();
    }

    public volatile Object clone()
        throws CloneNotSupportedException
    {
        return clone();
    }

    public final String getAccessToken()
    {
        return accessToken;
    }

    public final Long getExpiresInSeconds()
    {
        return expiresInSeconds;
    }

    public final String getRefreshToken()
    {
        return refreshToken;
    }

    public final String getScope()
    {
        return scope;
    }

    public final String getTokenType()
    {
        return tokenType;
    }

    public TokenResponse set(String s, Object obj)
    {
        return (TokenResponse)super.set(s, obj);
    }

    public volatile GenericJson set(String s, Object obj)
    {
        return set(s, obj);
    }

    public volatile GenericData set(String s, Object obj)
    {
        return set(s, obj);
    }

    public TokenResponse setAccessToken(String s)
    {
        accessToken = (String)Preconditions.checkNotNull(s);
        return this;
    }

    public TokenResponse setExpiresInSeconds(Long long1)
    {
        expiresInSeconds = long1;
        return this;
    }

    public TokenResponse setRefreshToken(String s)
    {
        refreshToken = s;
        return this;
    }

    public TokenResponse setScope(String s)
    {
        scope = s;
        return this;
    }

    public TokenResponse setTokenType(String s)
    {
        tokenType = (String)Preconditions.checkNotNull(s);
        return this;
    }
}
