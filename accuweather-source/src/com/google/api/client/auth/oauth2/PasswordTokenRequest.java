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

public class PasswordTokenRequest extends TokenRequest
{

    private String password;
    private String username;

    public PasswordTokenRequest(HttpTransport httptransport, JsonFactory jsonfactory, GenericUrl genericurl, String s, String s1)
    {
        super(httptransport, jsonfactory, genericurl, "password");
        setUsername(s);
        setPassword(s1);
    }

    public final String getPassword()
    {
        return password;
    }

    public final String getUsername()
    {
        return username;
    }

    public PasswordTokenRequest set(String s, Object obj)
    {
        return (PasswordTokenRequest)super.set(s, obj);
    }

    public volatile TokenRequest set(String s, Object obj)
    {
        return set(s, obj);
    }

    public volatile GenericData set(String s, Object obj)
    {
        return set(s, obj);
    }

    public PasswordTokenRequest setClientAuthentication(HttpExecuteInterceptor httpexecuteinterceptor)
    {
        return (PasswordTokenRequest)super.setClientAuthentication(httpexecuteinterceptor);
    }

    public volatile TokenRequest setClientAuthentication(HttpExecuteInterceptor httpexecuteinterceptor)
    {
        return setClientAuthentication(httpexecuteinterceptor);
    }

    public PasswordTokenRequest setGrantType(String s)
    {
        return (PasswordTokenRequest)super.setGrantType(s);
    }

    public volatile TokenRequest setGrantType(String s)
    {
        return setGrantType(s);
    }

    public PasswordTokenRequest setPassword(String s)
    {
        password = (String)Preconditions.checkNotNull(s);
        return this;
    }

    public PasswordTokenRequest setRequestInitializer(HttpRequestInitializer httprequestinitializer)
    {
        return (PasswordTokenRequest)super.setRequestInitializer(httprequestinitializer);
    }

    public volatile TokenRequest setRequestInitializer(HttpRequestInitializer httprequestinitializer)
    {
        return setRequestInitializer(httprequestinitializer);
    }

    public PasswordTokenRequest setScopes(Collection collection)
    {
        return (PasswordTokenRequest)super.setScopes(collection);
    }

    public volatile TokenRequest setScopes(Collection collection)
    {
        return setScopes(collection);
    }

    public PasswordTokenRequest setTokenServerUrl(GenericUrl genericurl)
    {
        return (PasswordTokenRequest)super.setTokenServerUrl(genericurl);
    }

    public volatile TokenRequest setTokenServerUrl(GenericUrl genericurl)
    {
        return setTokenServerUrl(genericurl);
    }

    public PasswordTokenRequest setUsername(String s)
    {
        username = (String)Preconditions.checkNotNull(s);
        return this;
    }
}
