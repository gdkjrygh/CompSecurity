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

public class AuthorizationCodeTokenRequest extends TokenRequest
{

    private String code;
    private String redirectUri;

    public AuthorizationCodeTokenRequest(HttpTransport httptransport, JsonFactory jsonfactory, GenericUrl genericurl, String s)
    {
        super(httptransport, jsonfactory, genericurl, "authorization_code");
        setCode(s);
    }

    public final String getCode()
    {
        return code;
    }

    public final String getRedirectUri()
    {
        return redirectUri;
    }

    public AuthorizationCodeTokenRequest set(String s, Object obj)
    {
        return (AuthorizationCodeTokenRequest)super.set(s, obj);
    }

    public volatile TokenRequest set(String s, Object obj)
    {
        return set(s, obj);
    }

    public volatile GenericData set(String s, Object obj)
    {
        return set(s, obj);
    }

    public AuthorizationCodeTokenRequest setClientAuthentication(HttpExecuteInterceptor httpexecuteinterceptor)
    {
        return (AuthorizationCodeTokenRequest)super.setClientAuthentication(httpexecuteinterceptor);
    }

    public volatile TokenRequest setClientAuthentication(HttpExecuteInterceptor httpexecuteinterceptor)
    {
        return setClientAuthentication(httpexecuteinterceptor);
    }

    public AuthorizationCodeTokenRequest setCode(String s)
    {
        code = (String)Preconditions.checkNotNull(s);
        return this;
    }

    public AuthorizationCodeTokenRequest setGrantType(String s)
    {
        return (AuthorizationCodeTokenRequest)super.setGrantType(s);
    }

    public volatile TokenRequest setGrantType(String s)
    {
        return setGrantType(s);
    }

    public AuthorizationCodeTokenRequest setRedirectUri(String s)
    {
        redirectUri = s;
        return this;
    }

    public AuthorizationCodeTokenRequest setRequestInitializer(HttpRequestInitializer httprequestinitializer)
    {
        return (AuthorizationCodeTokenRequest)super.setRequestInitializer(httprequestinitializer);
    }

    public volatile TokenRequest setRequestInitializer(HttpRequestInitializer httprequestinitializer)
    {
        return setRequestInitializer(httprequestinitializer);
    }

    public AuthorizationCodeTokenRequest setScopes(Collection collection)
    {
        return (AuthorizationCodeTokenRequest)super.setScopes(collection);
    }

    public volatile TokenRequest setScopes(Collection collection)
    {
        return setScopes(collection);
    }

    public AuthorizationCodeTokenRequest setTokenServerUrl(GenericUrl genericurl)
    {
        return (AuthorizationCodeTokenRequest)super.setTokenServerUrl(genericurl);
    }

    public volatile TokenRequest setTokenServerUrl(GenericUrl genericurl)
    {
        return setTokenServerUrl(genericurl);
    }
}
