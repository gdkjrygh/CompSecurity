// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.auth.oauth2;

import com.google.api.client.http.HttpExecuteInterceptor;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.http.UrlEncodedContent;
import com.google.api.client.util.Data;
import com.google.api.client.util.Preconditions;
import java.io.IOException;
import java.util.Map;

public class ClientParametersAuthentication
    implements HttpRequestInitializer, HttpExecuteInterceptor
{

    private final String clientId;
    private final String clientSecret;

    public ClientParametersAuthentication(String s, String s1)
    {
        clientId = (String)Preconditions.checkNotNull(s);
        clientSecret = s1;
    }

    public final String getClientId()
    {
        return clientId;
    }

    public final String getClientSecret()
    {
        return clientSecret;
    }

    public void initialize(HttpRequest httprequest)
        throws IOException
    {
        httprequest.setInterceptor(this);
    }

    public void intercept(HttpRequest httprequest)
        throws IOException
    {
        httprequest = Data.mapOf(UrlEncodedContent.getContent(httprequest).getData());
        httprequest.put("client_id", clientId);
        if (clientSecret != null)
        {
            httprequest.put("client_secret", clientSecret);
        }
    }
}
