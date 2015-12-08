// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.auth.openidconnect;

import com.google.api.client.auth.oauth2.TokenRequest;
import com.google.api.client.auth.oauth2.TokenResponse;
import com.google.api.client.http.HttpResponse;
import com.google.api.client.json.GenericJson;
import com.google.api.client.util.GenericData;
import com.google.api.client.util.Preconditions;
import java.io.IOException;

// Referenced classes of package com.google.api.client.auth.openidconnect:
//            IdToken

public class IdTokenResponse extends TokenResponse
{

    private String idToken;

    public IdTokenResponse()
    {
    }

    public static IdTokenResponse execute(TokenRequest tokenrequest)
        throws IOException
    {
        return (IdTokenResponse)tokenrequest.executeUnparsed().parseAs(com/google/api/client/auth/openidconnect/IdTokenResponse);
    }

    public volatile TokenResponse clone()
    {
        return clone();
    }

    public IdTokenResponse clone()
    {
        return (IdTokenResponse)super.clone();
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

    public IdToken parseIdToken()
        throws IOException
    {
        return IdToken.parse(getFactory(), idToken);
    }

    public volatile TokenResponse set(String s, Object obj)
    {
        return set(s, obj);
    }

    public IdTokenResponse set(String s, Object obj)
    {
        return (IdTokenResponse)super.set(s, obj);
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

    public IdTokenResponse setAccessToken(String s)
    {
        super.setAccessToken(s);
        return this;
    }

    public volatile TokenResponse setExpiresInSeconds(Long long1)
    {
        return setExpiresInSeconds(long1);
    }

    public IdTokenResponse setExpiresInSeconds(Long long1)
    {
        super.setExpiresInSeconds(long1);
        return this;
    }

    public IdTokenResponse setIdToken(String s)
    {
        idToken = (String)Preconditions.checkNotNull(s);
        return this;
    }

    public volatile TokenResponse setRefreshToken(String s)
    {
        return setRefreshToken(s);
    }

    public IdTokenResponse setRefreshToken(String s)
    {
        super.setRefreshToken(s);
        return this;
    }

    public volatile TokenResponse setScope(String s)
    {
        return setScope(s);
    }

    public IdTokenResponse setScope(String s)
    {
        super.setScope(s);
        return this;
    }

    public volatile TokenResponse setTokenType(String s)
    {
        return setTokenType(s);
    }

    public IdTokenResponse setTokenType(String s)
    {
        super.setTokenType(s);
        return this;
    }
}
