// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.googleapis.auth.oauth2;

import com.google.api.client.auth.oauth2.ClientParametersAuthentication;
import com.google.api.client.auth.oauth2.RefreshTokenRequest;
import com.google.api.client.auth.oauth2.TokenRequest;
import com.google.api.client.auth.oauth2.TokenResponse;
import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpExecuteInterceptor;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.http.HttpResponse;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.util.GenericData;
import java.io.IOException;
import java.util.Collection;

// Referenced classes of package com.google.api.client.googleapis.auth.oauth2:
//            GoogleTokenResponse

public class GoogleRefreshTokenRequest extends RefreshTokenRequest
{

    public GoogleRefreshTokenRequest(HttpTransport httptransport, JsonFactory jsonfactory, String s, String s1, String s2)
    {
        super(httptransport, jsonfactory, new GenericUrl("https://accounts.google.com/o/oauth2/token"), s);
        setClientAuthentication(new ClientParametersAuthentication(s1, s2));
    }

    public volatile TokenResponse execute()
        throws IOException
    {
        return execute();
    }

    public GoogleTokenResponse execute()
        throws IOException
    {
        return (GoogleTokenResponse)executeUnparsed().parseAs(com/google/api/client/googleapis/auth/oauth2/GoogleTokenResponse);
    }

    public volatile RefreshTokenRequest set(String s, Object obj)
    {
        return set(s, obj);
    }

    public volatile TokenRequest set(String s, Object obj)
    {
        return set(s, obj);
    }

    public GoogleRefreshTokenRequest set(String s, Object obj)
    {
        return (GoogleRefreshTokenRequest)super.set(s, obj);
    }

    public volatile GenericData set(String s, Object obj)
    {
        return set(s, obj);
    }

    public volatile RefreshTokenRequest setClientAuthentication(HttpExecuteInterceptor httpexecuteinterceptor)
    {
        return setClientAuthentication(httpexecuteinterceptor);
    }

    public volatile TokenRequest setClientAuthentication(HttpExecuteInterceptor httpexecuteinterceptor)
    {
        return setClientAuthentication(httpexecuteinterceptor);
    }

    public GoogleRefreshTokenRequest setClientAuthentication(HttpExecuteInterceptor httpexecuteinterceptor)
    {
        return (GoogleRefreshTokenRequest)super.setClientAuthentication(httpexecuteinterceptor);
    }

    public volatile RefreshTokenRequest setGrantType(String s)
    {
        return setGrantType(s);
    }

    public volatile TokenRequest setGrantType(String s)
    {
        return setGrantType(s);
    }

    public GoogleRefreshTokenRequest setGrantType(String s)
    {
        return (GoogleRefreshTokenRequest)super.setGrantType(s);
    }

    public volatile RefreshTokenRequest setRefreshToken(String s)
    {
        return setRefreshToken(s);
    }

    public GoogleRefreshTokenRequest setRefreshToken(String s)
    {
        return (GoogleRefreshTokenRequest)super.setRefreshToken(s);
    }

    public volatile RefreshTokenRequest setRequestInitializer(HttpRequestInitializer httprequestinitializer)
    {
        return setRequestInitializer(httprequestinitializer);
    }

    public volatile TokenRequest setRequestInitializer(HttpRequestInitializer httprequestinitializer)
    {
        return setRequestInitializer(httprequestinitializer);
    }

    public GoogleRefreshTokenRequest setRequestInitializer(HttpRequestInitializer httprequestinitializer)
    {
        return (GoogleRefreshTokenRequest)super.setRequestInitializer(httprequestinitializer);
    }

    public volatile RefreshTokenRequest setScopes(Collection collection)
    {
        return setScopes(collection);
    }

    public volatile TokenRequest setScopes(Collection collection)
    {
        return setScopes(collection);
    }

    public GoogleRefreshTokenRequest setScopes(Collection collection)
    {
        return (GoogleRefreshTokenRequest)super.setScopes(collection);
    }

    public volatile RefreshTokenRequest setTokenServerUrl(GenericUrl genericurl)
    {
        return setTokenServerUrl(genericurl);
    }

    public volatile TokenRequest setTokenServerUrl(GenericUrl genericurl)
    {
        return setTokenServerUrl(genericurl);
    }

    public GoogleRefreshTokenRequest setTokenServerUrl(GenericUrl genericurl)
    {
        return (GoogleRefreshTokenRequest)super.setTokenServerUrl(genericurl);
    }
}
