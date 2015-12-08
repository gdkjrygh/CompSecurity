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
import java.util.Collection;

// Referenced classes of package com.google.api.client.auth.oauth2:
//            TokenRequest

public class ClientCredentialsTokenRequest extends TokenRequest
{

    public ClientCredentialsTokenRequest(HttpTransport httptransport, JsonFactory jsonfactory, GenericUrl genericurl)
    {
        super(httptransport, jsonfactory, genericurl, "client_credentials");
    }

    public ClientCredentialsTokenRequest set(String s, Object obj)
    {
        return (ClientCredentialsTokenRequest)super.set(s, obj);
    }

    public volatile TokenRequest set(String s, Object obj)
    {
        return set(s, obj);
    }

    public volatile GenericData set(String s, Object obj)
    {
        return set(s, obj);
    }

    public ClientCredentialsTokenRequest setClientAuthentication(HttpExecuteInterceptor httpexecuteinterceptor)
    {
        return (ClientCredentialsTokenRequest)super.setClientAuthentication(httpexecuteinterceptor);
    }

    public volatile TokenRequest setClientAuthentication(HttpExecuteInterceptor httpexecuteinterceptor)
    {
        return setClientAuthentication(httpexecuteinterceptor);
    }

    public ClientCredentialsTokenRequest setGrantType(String s)
    {
        return (ClientCredentialsTokenRequest)super.setGrantType(s);
    }

    public volatile TokenRequest setGrantType(String s)
    {
        return setGrantType(s);
    }

    public ClientCredentialsTokenRequest setRequestInitializer(HttpRequestInitializer httprequestinitializer)
    {
        return (ClientCredentialsTokenRequest)super.setRequestInitializer(httprequestinitializer);
    }

    public volatile TokenRequest setRequestInitializer(HttpRequestInitializer httprequestinitializer)
    {
        return setRequestInitializer(httprequestinitializer);
    }

    public ClientCredentialsTokenRequest setScopes(Collection collection)
    {
        return (ClientCredentialsTokenRequest)super.setScopes(collection);
    }

    public volatile TokenRequest setScopes(Collection collection)
    {
        return setScopes(collection);
    }

    public ClientCredentialsTokenRequest setTokenServerUrl(GenericUrl genericurl)
    {
        return (ClientCredentialsTokenRequest)super.setTokenServerUrl(genericurl);
    }

    public volatile TokenRequest setTokenServerUrl(GenericUrl genericurl)
    {
        return setTokenServerUrl(genericurl);
    }
}
