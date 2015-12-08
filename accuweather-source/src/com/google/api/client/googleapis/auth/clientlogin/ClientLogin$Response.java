// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.googleapis.auth.clientlogin;

import com.google.api.client.http.HttpExecuteInterceptor;
import com.google.api.client.http.HttpHeaders;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestInitializer;

// Referenced classes of package com.google.api.client.googleapis.auth.clientlogin:
//            ClientLogin

public static final class 
    implements HttpExecuteInterceptor, HttpRequestInitializer
{

    public String auth;

    public String getAuthorizationHeaderValue()
    {
        return ClientLogin.getAuthorizationHeaderValue(auth);
    }

    public void initialize(HttpRequest httprequest)
    {
        httprequest.setInterceptor(this);
    }

    public void intercept(HttpRequest httprequest)
    {
        httprequest.getHeaders().setAuthorization(getAuthorizationHeaderValue());
    }

    public ()
    {
    }
}
