// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.auth.oauth2;

import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpExecuteInterceptor;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.util.GenericData;
import com.google.api.client.util.Preconditions;
import java.util.Collection;

// Referenced classes of package com.google.api.client.auth.oauth2:
//            TokenRequest

public class RefreshTokenRequest extends TokenRequest
{

    private String refreshToken;

    public RefreshTokenRequest(HttpTransport httptransport, JsonFactory jsonfactory, GenericUrl genericurl, String s)
    {
        super(httptransport, jsonfactory, genericurl, "refresh_token");
        setRefreshToken(s);
    }

    public final String getRefreshToken()
    {
        return refreshToken;
    }

    public RefreshTokenRequest set(String s, Object obj)
    {
        return (RefreshTokenRequest)super.set(s, obj);
    }

    public volatile TokenRequest set(String s, Object obj)
    {
        return set(s, obj);
    }

    public volatile GenericData set(String s, Object obj)
    {
        return set(s, obj);
    }

    public RefreshTokenRequest setClientAuthentication(HttpExecuteInterceptor httpexecuteinterceptor)
    {
        return (RefreshTokenRequest)super.setClientAuthentication(httpexecuteinterceptor);
    }

    public volatile TokenRequest setClientAuthentication(HttpExecuteInterceptor httpexecuteinterceptor)
    {
        return setClientAuthentication(httpexecuteinterceptor);
    }

    public RefreshTokenRequest setGrantType(String s)
    {
        return (RefreshTokenRequest)super.setGrantType(s);
    }

    public volatile TokenRequest setGrantType(String s)
    {
        return setGrantType(s);
    }

    public RefreshTokenRequest setRefreshToken(String s)
    {
        refreshToken = (String)Preconditions.checkNotNull(s);
        return this;
    }

    public RefreshTokenRequest setRequestInitializer(HttpRequestInitializer httprequestinitializer)
    {
        return (RefreshTokenRequest)super.setRequestInitializer(httprequestinitializer);
    }

    public volatile TokenRequest setRequestInitializer(HttpRequestInitializer httprequestinitializer)
    {
        return setRequestInitializer(httprequestinitializer);
    }

    public RefreshTokenRequest setScopes(Collection collection)
    {
        return (RefreshTokenRequest)super.setScopes(collection);
    }

    public volatile TokenRequest setScopes(Collection collection)
    {
        return setScopes(collection);
    }

    public RefreshTokenRequest setTokenServerUrl(GenericUrl genericurl)
    {
        return (RefreshTokenRequest)super.setTokenServerUrl(genericurl);
    }

    public volatile TokenRequest setTokenServerUrl(GenericUrl genericurl)
    {
        return setTokenServerUrl(genericurl);
    }
}
