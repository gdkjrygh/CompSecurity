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
import com.google.api.client.util.Joiner;
import com.google.api.client.util.Lists;
import com.google.api.client.util.Preconditions;
import com.google.api.client.util.store.DataStore;
import com.google.api.client.util.store.DataStoreFactory;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;

// Referenced classes of package com.google.api.client.auth.oauth2:
//            DataStoreCredentialRefreshListener, CredentialStoreRefreshListener, Credential, CredentialStore, 
//            StoredCredential, AuthorizationCodeRequestUrl, AuthorizationCodeTokenRequest, TokenResponse, 
//            CredentialRefreshListener

public class AuthorizationCodeFlow
{
    public static class Builder
    {

        String authorizationServerEncodedUrl;
        HttpExecuteInterceptor clientAuthentication;
        String clientId;
        Clock clock;
        CredentialCreatedListener credentialCreatedListener;
        DataStore credentialDataStore;
        CredentialStore credentialStore;
        JsonFactory jsonFactory;
        Credential.AccessMethod method;
        Collection refreshListeners;
        HttpRequestInitializer requestInitializer;
        Collection scopes;
        GenericUrl tokenServerUrl;
        HttpTransport transport;

        public Builder addRefreshListener(CredentialRefreshListener credentialrefreshlistener)
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

        public final CredentialCreatedListener getCredentialCreatedListener()
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

        public final Credential.AccessMethod getMethod()
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

        public Builder setAuthorizationServerEncodedUrl(String s)
        {
            authorizationServerEncodedUrl = (String)Preconditions.checkNotNull(s);
            return this;
        }

        public Builder setClientAuthentication(HttpExecuteInterceptor httpexecuteinterceptor)
        {
            clientAuthentication = httpexecuteinterceptor;
            return this;
        }

        public Builder setClientId(String s)
        {
            clientId = (String)Preconditions.checkNotNull(s);
            return this;
        }

        public Builder setClock(Clock clock1)
        {
            clock = (Clock)Preconditions.checkNotNull(clock1);
            return this;
        }

        public Builder setCredentialCreatedListener(CredentialCreatedListener credentialcreatedlistener)
        {
            credentialCreatedListener = credentialcreatedlistener;
            return this;
        }

        public Builder setCredentialDataStore(DataStore datastore)
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

        public Builder setCredentialStore(CredentialStore credentialstore)
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

        public Builder setDataStoreFactory(DataStoreFactory datastorefactory)
            throws IOException
        {
            return setCredentialDataStore(StoredCredential.getDefaultDataStore(datastorefactory));
        }

        public Builder setJsonFactory(JsonFactory jsonfactory)
        {
            jsonFactory = (JsonFactory)Preconditions.checkNotNull(jsonfactory);
            return this;
        }

        public Builder setMethod(Credential.AccessMethod accessmethod)
        {
            method = (Credential.AccessMethod)Preconditions.checkNotNull(accessmethod);
            return this;
        }

        public Builder setRefreshListeners(Collection collection)
        {
            refreshListeners = (Collection)Preconditions.checkNotNull(collection);
            return this;
        }

        public Builder setRequestInitializer(HttpRequestInitializer httprequestinitializer)
        {
            requestInitializer = httprequestinitializer;
            return this;
        }

        public Builder setScopes(Collection collection)
        {
            scopes = (Collection)Preconditions.checkNotNull(collection);
            return this;
        }

        public Builder setTokenServerUrl(GenericUrl genericurl)
        {
            tokenServerUrl = (GenericUrl)Preconditions.checkNotNull(genericurl);
            return this;
        }

        public Builder setTransport(HttpTransport httptransport)
        {
            transport = (HttpTransport)Preconditions.checkNotNull(httptransport);
            return this;
        }

        public Builder(Credential.AccessMethod accessmethod, HttpTransport httptransport, JsonFactory jsonfactory, GenericUrl genericurl, HttpExecuteInterceptor httpexecuteinterceptor, String s, String s1)
        {
            scopes = Lists.newArrayList();
            clock = Clock.SYSTEM;
            refreshListeners = Lists.newArrayList();
            setMethod(accessmethod);
            setTransport(httptransport);
            setJsonFactory(jsonfactory);
            setTokenServerUrl(genericurl);
            setClientAuthentication(httpexecuteinterceptor);
            setClientId(s);
            setAuthorizationServerEncodedUrl(s1);
        }
    }

    public static interface CredentialCreatedListener
    {

        public abstract void onCredentialCreated(Credential credential, TokenResponse tokenresponse)
            throws IOException;
    }


    private final String authorizationServerEncodedUrl;
    private final HttpExecuteInterceptor clientAuthentication;
    private final String clientId;
    private final Clock clock;
    private final CredentialCreatedListener credentialCreatedListener;
    private final DataStore credentialDataStore;
    private final CredentialStore credentialStore;
    private final JsonFactory jsonFactory;
    private final Credential.AccessMethod method;
    private final Collection refreshListeners;
    private final HttpRequestInitializer requestInitializer;
    private final Collection scopes;
    private final String tokenServerEncodedUrl;
    private final HttpTransport transport;

    protected AuthorizationCodeFlow(Builder builder)
    {
        method = (Credential.AccessMethod)Preconditions.checkNotNull(builder.method);
        transport = (HttpTransport)Preconditions.checkNotNull(builder.transport);
        jsonFactory = (JsonFactory)Preconditions.checkNotNull(builder.jsonFactory);
        tokenServerEncodedUrl = ((GenericUrl)Preconditions.checkNotNull(builder.tokenServerUrl)).build();
        clientAuthentication = builder.clientAuthentication;
        clientId = (String)Preconditions.checkNotNull(builder.clientId);
        authorizationServerEncodedUrl = (String)Preconditions.checkNotNull(builder.authorizationServerEncodedUrl);
        requestInitializer = builder.requestInitializer;
        credentialStore = builder.credentialStore;
        credentialDataStore = builder.credentialDataStore;
        scopes = Collections.unmodifiableCollection(builder.scopes);
        clock = (Clock)Preconditions.checkNotNull(builder.clock);
        credentialCreatedListener = builder.credentialCreatedListener;
        refreshListeners = Collections.unmodifiableCollection(builder.refreshListeners);
    }

    public AuthorizationCodeFlow(Credential.AccessMethod accessmethod, HttpTransport httptransport, JsonFactory jsonfactory, GenericUrl genericurl, HttpExecuteInterceptor httpexecuteinterceptor, String s, String s1)
    {
        this(new Builder(accessmethod, httptransport, jsonfactory, genericurl, httpexecuteinterceptor, s, s1));
    }

    private Credential newCredential(String s)
    {
        Credential.Builder builder = (new Credential.Builder(method)).setTransport(transport).setJsonFactory(jsonFactory).setTokenServerEncodedUrl(tokenServerEncodedUrl).setClientAuthentication(clientAuthentication).setRequestInitializer(requestInitializer).setClock(clock);
        if (credentialDataStore == null) goto _L2; else goto _L1
_L1:
        builder.addRefreshListener(new DataStoreCredentialRefreshListener(s, credentialDataStore));
_L4:
        builder.getRefreshListeners().addAll(refreshListeners);
        return builder.build();
_L2:
        if (credentialStore != null)
        {
            builder.addRefreshListener(new CredentialStoreRefreshListener(s, credentialStore));
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public Credential createAndStoreCredential(TokenResponse tokenresponse, String s)
        throws IOException
    {
        Credential credential = newCredential(s).setFromTokenResponse(tokenresponse);
        if (credentialStore != null)
        {
            credentialStore.store(s, credential);
        }
        if (credentialDataStore != null)
        {
            credentialDataStore.set(s, new StoredCredential(credential));
        }
        if (credentialCreatedListener != null)
        {
            credentialCreatedListener.onCredentialCreated(credential, tokenresponse);
        }
        return credential;
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

    public final Credential.AccessMethod getMethod()
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

    public final String getScopesAsString()
    {
        return Joiner.on(' ').join(scopes);
    }

    public final String getTokenServerEncodedUrl()
    {
        return tokenServerEncodedUrl;
    }

    public final HttpTransport getTransport()
    {
        return transport;
    }

    public Credential loadCredential(String s)
        throws IOException
    {
        Credential credential;
        if (credentialDataStore == null && credentialStore == null)
        {
            credential = null;
        } else
        {
            Credential credential1 = newCredential(s);
            if (credentialDataStore != null)
            {
                s = (StoredCredential)credentialDataStore.get(s);
                if (s == null)
                {
                    return null;
                } else
                {
                    credential1.setAccessToken(s.getAccessToken());
                    credential1.setRefreshToken(s.getRefreshToken());
                    credential1.setExpirationTimeMilliseconds(s.getExpirationTimeMilliseconds());
                    return credential1;
                }
            }
            credential = credential1;
            if (!credentialStore.load(s, credential1))
            {
                return null;
            }
        }
        return credential;
    }

    public AuthorizationCodeRequestUrl newAuthorizationUrl()
    {
        return (new AuthorizationCodeRequestUrl(authorizationServerEncodedUrl, clientId)).setScopes(scopes);
    }

    public AuthorizationCodeTokenRequest newTokenRequest(String s)
    {
        return (new AuthorizationCodeTokenRequest(transport, jsonFactory, new GenericUrl(tokenServerEncodedUrl), s)).setClientAuthentication(clientAuthentication).setRequestInitializer(requestInitializer).setScopes(scopes);
    }
}
