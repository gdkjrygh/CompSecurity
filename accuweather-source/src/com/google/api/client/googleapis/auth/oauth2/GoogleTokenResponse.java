// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.googleapis.auth.oauth2;

import com.google.api.client.auth.oauth2.TokenResponse;
import com.google.api.client.json.GenericJson;
import com.google.api.client.util.GenericData;
import com.google.api.client.util.Preconditions;
import java.io.IOException;

// Referenced classes of package com.google.api.client.googleapis.auth.oauth2:
//            GoogleIdToken

public class GoogleTokenResponse extends TokenResponse
{

    private String idToken;

    public GoogleTokenResponse()
    {
    }

    public volatile TokenResponse clone()
    {
        return clone();
    }

    public GoogleTokenResponse clone()
    {
        return (GoogleTokenResponse)super.clone();
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

    public final String getIdToken()
    {
        return idToken;
    }

    public GoogleIdToken parseIdToken()
        throws IOException
    {
        return GoogleIdToken.parse(getFactory(), getIdToken());
    }

    public volatile TokenResponse set(String s, Object obj)
    {
        return set(s, obj);
    }

    public GoogleTokenResponse set(String s, Object obj)
    {
        return (GoogleTokenResponse)super.set(s, obj);
    }

    public volatile GenericJson set(String s, Object obj)
    {
        return set(s, obj);
    }

    public volatile GenericData set(String s, Object obj)
    {
        return set(s, obj);
    }

    public volatile TokenResponse setAccessToken(String s)
    {
        return setAccessToken(s);
    }

    public GoogleTokenResponse setAccessToken(String s)
    {
        return (GoogleTokenResponse)super.setAccessToken(s);
    }

    public volatile TokenResponse setExpiresInSeconds(Long long1)
    {
        return setExpiresInSeconds(long1);
    }

    public GoogleTokenResponse setExpiresInSeconds(Long long1)
    {
        return (GoogleTokenResponse)super.setExpiresInSeconds(long1);
    }

    public GoogleTokenResponse setIdToken(String s)
    {
        idToken = (String)Preconditions.checkNotNull(s);
        return this;
    }

    public volatile TokenResponse setRefreshToken(String s)
    {
        return setRefreshToken(s);
    }

    public GoogleTokenResponse setRefreshToken(String s)
    {
        return (GoogleTokenResponse)super.setRefreshToken(s);
    }

    public volatile TokenResponse setScope(String s)
    {
        return setScope(s);
    }

    public GoogleTokenResponse setScope(String s)
    {
        return (GoogleTokenResponse)super.setScope(s);
    }

    public volatile TokenResponse setTokenType(String s)
    {
        return setTokenType(s);
    }

    public GoogleTokenResponse setTokenType(String s)
    {
        return (GoogleTokenResponse)super.setTokenType(s);
    }
}
