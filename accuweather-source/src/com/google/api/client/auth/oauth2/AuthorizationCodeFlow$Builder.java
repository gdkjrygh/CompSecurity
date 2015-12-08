// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.auth.oauth2;

import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpExecuteInterceptor;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.util.Clock;
import com.google.api.client.util.Lists;
import com.google.api.client.util.Preconditions;
import com.google.api.client.util.store.DataStore;
import com.google.api.client.util.store.DataStoreFactory;
import java.io.IOException;
import java.util.Collection;

// Referenced classes of package com.google.api.client.auth.oauth2:
//            AuthorizationCodeFlow, StoredCredential, CredentialStore, CredentialRefreshListener

public static class setAuthorizationServerEncodedUrl
{

    String authorizationServerEncodedUrl;
    HttpExecuteInterceptor clientAuthentication;
    String clientId;
    Clock clock;
    alCreatedListener credentialCreatedListener;
    DataStore credentialDataStore;
    CredentialStore credentialStore;
    JsonFactory jsonFactory;
    alCreatedListener method;
    Collection refreshListeners;
    HttpRequestInitializer requestInitializer;
    Collection scopes;
    GenericUrl tokenServerUrl;
    HttpTransport transport;

    public setAuthorizationServerEncodedUrl addRefreshListener(CredentialRefreshListener credentialrefreshlistener)
    {
        refreshListeners.add(Preconditions.checkNotNull(credentialrefreshlistener));
        return this;
    }

    public AuthorizationCodeFlow build()
    {
        return new AuthorizationCodeFlow(this);
    }

    public final String getAuthorizationServerEncodedUrl()
    {
        return authorizationServerEncodedUrl;
    }

    public final HttpExecuteInterceptor getClientAuthentication()
    {
        return clientAuthentication;
    }

    public final String getClientId()
    {
        return clientId;
    }

    public final Clock getClock()
    {
        return clock;
    }

    public final alCreatedListener getCredentialCreatedListener()
    {
        return credentialCreatedListener;
    }

    public final DataStore getCredentialDataStore()
    {
        return credentialDataStore;
    }

    public final CredentialStore getCredentialStore()
    {
        return credentialStore;
    }

    public final JsonFactory getJsonFactory()
    {
        return jsonFactory;
    }

    public final jsonFactory getMethod()
    {
        return method;
    }

    public final Collection getRefreshListeners()
    {
        return refreshListeners;
    }

    public final HttpRequestInitializer getRequestInitializer()
    {
        return requestInitializer;
    }

    public final Collection getScopes()
    {
        return scopes;
    }

    public final GenericUrl getTokenServerUrl()
    {
        return tokenServerUrl;
    }

    public final HttpTransport getTransport()
    {
        return transport;
    }

    public transport setAuthorizationServerEncodedUrl(String s)
    {
        authorizationServerEncodedUrl = (String)Preconditions.checkNotNull(s);
        return this;
    }

    public authorizationServerEncodedUrl setClientAuthentication(HttpExecuteInterceptor httpexecuteinterceptor)
    {
        clientAuthentication = httpexecuteinterceptor;
        return this;
    }

    public clientAuthentication setClientId(String s)
    {
        clientId = (String)Preconditions.checkNotNull(s);
        return this;
    }

    public clientId setClock(Clock clock1)
    {
        clock = (Clock)Preconditions.checkNotNull(clock1);
        return this;
    }

    public alCreatedListener setCredentialCreatedListener(alCreatedListener alcreatedlistener)
    {
        credentialCreatedListener = alcreatedlistener;
        return this;
    }

    public credentialCreatedListener setCredentialDataStore(DataStore datastore)
    {
        boolean flag;
        if (credentialStore == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        credentialDataStore = datastore;
        return this;
    }

    public credentialDataStore setCredentialStore(CredentialStore credentialstore)
    {
        boolean flag;
        if (credentialDataStore == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        credentialStore = credentialstore;
        return this;
    }

    public credentialStore setDataStoreFactory(DataStoreFactory datastorefactory)
        throws IOException
    {
        return setCredentialDataStore(StoredCredential.getDefaultDataStore(datastorefactory));
    }

    public aStore setJsonFactory(JsonFactory jsonfactory)
    {
        jsonFactory = (JsonFactory)Preconditions.checkNotNull(jsonfactory);
        return this;
    }

    public jsonFactory setMethod(jsonFactory jsonfactory)
    {
        method = (method)Preconditions.checkNotNull(jsonfactory);
        return this;
    }

    public method setRefreshListeners(Collection collection)
    {
        refreshListeners = (Collection)Preconditions.checkNotNull(collection);
        return this;
    }

    public refreshListeners setRequestInitializer(HttpRequestInitializer httprequestinitializer)
    {
        requestInitializer = httprequestinitializer;
        return this;
    }

    public requestInitializer setScopes(Collection collection)
    {
        scopes = (Collection)Preconditions.checkNotNull(collection);
        return this;
    }

    public scopes setTokenServerUrl(GenericUrl genericurl)
    {
        tokenServerUrl = (GenericUrl)Preconditions.checkNotNull(genericurl);
        return this;
    }

    public tokenServerUrl setTransport(HttpTransport httptransport)
    {
        transport = (HttpTransport)Preconditions.checkNotNull(httptransport);
        return this;
    }

    public alCreatedListener(alCreatedListener alcreatedlistener, HttpTransport httptransport, JsonFactory jsonfactory, GenericUrl genericurl, HttpExecuteInterceptor httpexecuteinterceptor, String s, String s1)
    {
        scopes = Lists.newArrayList();
        clock = Clock.SYSTEM;
        refreshListeners = Lists.newArrayList();
        setMethod(alcreatedlistener);
        setTransport(httptransport);
        setJsonFactory(jsonfactory);
        setTokenServerUrl(genericurl);
        setClientAuthentication(httpexecuteinterceptor);
        setClientId(s);
        setAuthorizationServerEncodedUrl(s1);
    }
}
