// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.googleapis.compute;

import com.google.api.client.auth.oauth2.BearerToken;
import com.google.api.client.auth.oauth2.Credential;
import com.google.api.client.auth.oauth2.CredentialRefreshListener;
import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpExecuteInterceptor;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.util.Clock;
import com.google.api.client.util.Preconditions;
import java.util.Collection;

// Referenced classes of package com.google.api.client.googleapis.compute:
//            ComputeCredential

public static class setTokenServerEncodedUrl extends com.google.api.client.auth.oauth2.uilder
{

    public volatile com.google.api.client.auth.oauth2.uilder addRefreshListener(CredentialRefreshListener credentialrefreshlistener)
    {
        return addRefreshListener(credentialrefreshlistener);
    }

    public addRefreshListener addRefreshListener(CredentialRefreshListener credentialrefreshlistener)
    {
        return (addRefreshListener)super.eshListener(credentialrefreshlistener);
    }

    public volatile Credential build()
    {
        return build();
    }

    public ComputeCredential build()
    {
        return new ComputeCredential(this);
    }

    public volatile com.google.api.client.auth.oauth2.uilder setClientAuthentication(HttpExecuteInterceptor httpexecuteinterceptor)
    {
        return setClientAuthentication(httpexecuteinterceptor);
    }

    public setClientAuthentication setClientAuthentication(HttpExecuteInterceptor httpexecuteinterceptor)
    {
        boolean flag;
        if (httpexecuteinterceptor == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        return this;
    }

    public volatile com.google.api.client.auth.oauth2.uilder setClock(Clock clock)
    {
        return setClock(clock);
    }

    public setClock setClock(Clock clock)
    {
        return (setClock)super.k(clock);
    }

    public volatile com.google.api.client.auth.oauth2.uilder setJsonFactory(JsonFactory jsonfactory)
    {
        return setJsonFactory(jsonfactory);
    }

    public setJsonFactory setJsonFactory(JsonFactory jsonfactory)
    {
        return (setJsonFactory)super.Factory((JsonFactory)Preconditions.checkNotNull(jsonfactory));
    }

    public volatile com.google.api.client.auth.oauth2.uilder setRefreshListeners(Collection collection)
    {
        return setRefreshListeners(collection);
    }

    public setRefreshListeners setRefreshListeners(Collection collection)
    {
        return (setRefreshListeners)super.eshListeners(collection);
    }

    public volatile com.google.api.client.auth.oauth2.uilder setRequestInitializer(HttpRequestInitializer httprequestinitializer)
    {
        return setRequestInitializer(httprequestinitializer);
    }

    public setRequestInitializer setRequestInitializer(HttpRequestInitializer httprequestinitializer)
    {
        return (setRequestInitializer)super.estInitializer(httprequestinitializer);
    }

    public volatile com.google.api.client.auth.oauth2.uilder setTokenServerEncodedUrl(String s)
    {
        return setTokenServerEncodedUrl(s);
    }

    public setTokenServerEncodedUrl setTokenServerEncodedUrl(String s)
    {
        return (setTokenServerEncodedUrl)super.nServerEncodedUrl((String)Preconditions.checkNotNull(s));
    }

    public volatile com.google.api.client.auth.oauth2.uilder setTokenServerUrl(GenericUrl genericurl)
    {
        return setTokenServerUrl(genericurl);
    }

    public setTokenServerUrl setTokenServerUrl(GenericUrl genericurl)
    {
        return (setTokenServerUrl)super.nServerUrl((GenericUrl)Preconditions.checkNotNull(genericurl));
    }

    public volatile com.google.api.client.auth.oauth2.uilder setTransport(HttpTransport httptransport)
    {
        return setTransport(httptransport);
    }

    public setTransport setTransport(HttpTransport httptransport)
    {
        return (setTransport)super.sport((HttpTransport)Preconditions.checkNotNull(httptransport));
    }

    public (HttpTransport httptransport, JsonFactory jsonfactory)
    {
        super(BearerToken.authorizationHeaderAccessMethod());
        setTransport(httptransport);
        setJsonFactory(jsonfactory);
        setTokenServerEncodedUrl("http://metadata/computeMetadata/v1/instance/service-accounts/default/token");
    }
}
