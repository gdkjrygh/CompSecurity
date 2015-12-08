// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.googleapis.auth.oauth2;

import com.google.api.client.auth.oauth2.AuthorizationCodeTokenRequest;
import com.google.api.client.auth.oauth2.ClientParametersAuthentication;
import com.google.api.client.auth.oauth2.TokenRequest;
import com.google.api.client.auth.oauth2.TokenResponse;
import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpExecuteInterceptor;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.http.HttpResponse;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.util.GenericData;
import com.google.api.client.util.Preconditions;
import java.io.IOException;
import java.util.Collection;

// Referenced classes of package com.google.api.client.googleapis.auth.oauth2:
//            GoogleTokenResponse

public class GoogleAuthorizationCodeTokenRequest extends AuthorizationCodeTokenRequest
{

    public GoogleAuthorizationCodeTokenRequest(HttpTransport httptransport, JsonFactory jsonfactory, String s, String s1, String s2, String s3)
    {
        this(httptransport, jsonfactory, "https://accounts.google.com/o/oauth2/token", s, s1, s2, s3);
    }

    public GoogleAuthorizationCodeTokenRequest(HttpTransport httptransport, JsonFactory jsonfactory, String s, String s1, String s2, String s3, String s4)
    {
        super(httptransport, jsonfactory, new GenericUrl(s), s3);
        setClientAuthentication(new ClientParametersAuthentication(s1, s2));
        setRedirectUri(s4);
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

    public volatile AuthorizationCodeTokenRequest set(String s, Object obj)
    {
        return set(s, obj);
    }

    public volatile TokenRequest set(String s, Object obj)
    {
        return set(s, obj);
    }

    public GoogleAuthorizationCodeTokenRequest set(String s, Object obj)
    {
        return (GoogleAuthorizationCodeTokenRequest)super.set(s, obj);
    }

    public volatile GenericData set(String s, Object obj)
    {
        return set(s, obj);
    }

    public volatile AuthorizationCodeTokenRequest setClientAuthentication(HttpExecuteInterceptor httpexecuteinterceptor)
    {
        return setClientAuthentication(httpexecuteinterceptor);
    }

    public volatile TokenRequest setClientAuthentication(HttpExecuteInterceptor httpexecuteinterceptor)
    {
        return setClientAuthentication(httpexecuteinterceptor);
    }

    public GoogleAuthorizationCodeTokenRequest setClientAuthentication(HttpExecuteInterceptor httpexecuteinterceptor)
    {
        Preconditions.checkNotNull(httpexecuteinterceptor);
        return (GoogleAuthorizationCodeTokenRequest)super.setClientAuthentication(httpexecuteinterceptor);
    }

    public volatile AuthorizationCodeTokenRequest setCode(String s)
    {
        return setCode(s);
    }

    public GoogleAuthorizationCodeTokenRequest setCode(String s)
    {
        return (GoogleAuthorizationCodeTokenRequest)super.setCode(s);
    }

    public volatile AuthorizationCodeTokenRequest setGrantType(String s)
    {
        return setGrantType(s);
    }

    public volatile TokenRequest setGrantType(String s)
    {
        return setGrantType(s);
    }

    public GoogleAuthorizationCodeTokenRequest setGrantType(String s)
    {
        return (GoogleAuthorizationCodeTokenRequest)super.setGrantType(s);
    }

    public volatile AuthorizationCodeTokenRequest setRedirectUri(String s)
    {
        return setRedirectUri(s);
    }

    public GoogleAuthorizationCodeTokenRequest setRedirectUri(String s)
    {
        Preconditions.checkNotNull(s);
        return (GoogleAuthorizationCodeTokenRequest)super.setRedirectUri(s);
    }

    public volatile AuthorizationCodeTokenRequest setRequestInitializer(HttpRequestInitializer httprequestinitializer)
    {
        return setRequestInitializer(httprequestinitializer);
    }

    public volatile TokenRequest setRequestInitializer(HttpRequestInitializer httprequestinitializer)
    {
        return setRequestInitializer(httprequestinitializer);
    }

    public GoogleAuthorizationCodeTokenRequest setRequestInitializer(HttpRequestInitializer httprequestinitializer)
    {
        return (GoogleAuthorizationCodeTokenRequest)super.setRequestInitializer(httprequestinitializer);
    }

    public volatile AuthorizationCodeTokenRequest setScopes(Collection collection)
    {
        return setScopes(collection);
    }

    public volatile TokenRequest setScopes(Collection collection)
    {
        return setScopes(collection);
    }

    public GoogleAuthorizationCodeTokenRequest setScopes(Collection collection)
    {
        return (GoogleAuthorizationCodeTokenRequest)super.setScopes(collection);
    }

    public volatile AuthorizationCodeTokenRequest setTokenServerUrl(GenericUrl genericurl)
    {
        return setTokenServerUrl(genericurl);
    }

    public volatile TokenRequest setTokenServerUrl(GenericUrl genericurl)
    {
        return setTokenServerUrl(genericurl);
    }

    public GoogleAuthorizationCodeTokenRequest setTokenServerUrl(GenericUrl genericurl)
    {
        return (GoogleAuthorizationCodeTokenRequest)super.setTokenServerUrl(genericurl);
    }
}
