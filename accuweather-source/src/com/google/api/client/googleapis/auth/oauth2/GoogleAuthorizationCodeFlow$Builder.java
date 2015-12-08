// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.googleapis.auth.oauth2;

import com.google.api.client.auth.oauth2.AuthorizationCodeFlow;
import com.google.api.client.auth.oauth2.BearerToken;
import com.google.api.client.auth.oauth2.ClientParametersAuthentication;
import com.google.api.client.auth.oauth2.CredentialRefreshListener;
import com.google.api.client.auth.oauth2.CredentialStore;
import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpExecuteInterceptor;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.util.Clock;
import com.google.api.client.util.Preconditions;
import com.google.api.client.util.store.DataStore;
import com.google.api.client.util.store.DataStoreFactory;
import java.io.IOException;
import java.util.Collection;

// Referenced classes of package com.google.api.client.googleapis.auth.oauth2:
//            GoogleAuthorizationCodeFlow, GoogleClientSecrets

public static class setScopes extends com.google.api.client.auth.oauth2.ow.Builder
{

    String accessType;
    String approvalPrompt;

    public volatile com.google.api.client.auth.oauth2.ow.Builder addRefreshListener(CredentialRefreshListener credentialrefreshlistener)
    {
        return addRefreshListener(credentialrefreshlistener);
    }

    public addRefreshListener addRefreshListener(CredentialRefreshListener credentialrefreshlistener)
    {
        return (addRefreshListener)super.reshListener(credentialrefreshlistener);
    }

    public volatile AuthorizationCodeFlow build()
    {
        return build();
    }

    public GoogleAuthorizationCodeFlow build()
    {
        return new GoogleAuthorizationCodeFlow(this);
    }

    public final String getAccessType()
    {
        return accessType;
    }

    public final String getApprovalPrompt()
    {
        return approvalPrompt;
    }

    public approvalPrompt setAccessType(String s)
    {
        accessType = s;
        return this;
    }

    public accessType setApprovalPrompt(String s)
    {
        approvalPrompt = s;
        return this;
    }

    public volatile com.google.api.client.auth.oauth2.ow.Builder setAuthorizationServerEncodedUrl(String s)
    {
        return setAuthorizationServerEncodedUrl(s);
    }

    public setAuthorizationServerEncodedUrl setAuthorizationServerEncodedUrl(String s)
    {
        return (setAuthorizationServerEncodedUrl)super.horizationServerEncodedUrl(s);
    }

    public volatile com.google.api.client.auth.oauth2.ow.Builder setClientAuthentication(HttpExecuteInterceptor httpexecuteinterceptor)
    {
        return setClientAuthentication(httpexecuteinterceptor);
    }

    public setClientAuthentication setClientAuthentication(HttpExecuteInterceptor httpexecuteinterceptor)
    {
        return (setClientAuthentication)super.entAuthentication(httpexecuteinterceptor);
    }

    public volatile com.google.api.client.auth.oauth2.ow.Builder setClientId(String s)
    {
        return setClientId(s);
    }

    public setClientId setClientId(String s)
    {
        return (setClientId)super.entId(s);
    }

    public volatile com.google.api.client.auth.oauth2.ow.Builder setClock(Clock clock)
    {
        return setClock(clock);
    }

    public setClock setClock(Clock clock)
    {
        return (setClock)super.ck(clock);
    }

    public volatile com.google.api.client.auth.oauth2.tedListener setCredentialCreatedListener(com.google.api.client.auth.oauth2.tedListener tedlistener)
    {
        return setCredentialCreatedListener(tedlistener);
    }

    public  setCredentialCreatedListener(com.google.api.client.auth.oauth2.tedListener tedlistener)
    {
        return ()super.dentialCreatedListener(tedlistener);
    }

    public volatile com.google.api.client.auth.oauth2.ow.Builder setCredentialDataStore(DataStore datastore)
    {
        return setCredentialDataStore(datastore);
    }

    public setCredentialDataStore setCredentialDataStore(DataStore datastore)
    {
        return (setCredentialDataStore)super.dentialDataStore(datastore);
    }

    public volatile com.google.api.client.auth.oauth2.ow.Builder setCredentialStore(CredentialStore credentialstore)
    {
        return setCredentialStore(credentialstore);
    }

    public setCredentialStore setCredentialStore(CredentialStore credentialstore)
    {
        return (setCredentialStore)super.dentialStore(credentialstore);
    }

    public volatile com.google.api.client.auth.oauth2.ow.Builder setDataStoreFactory(DataStoreFactory datastorefactory)
        throws IOException
    {
        return setDataStoreFactory(datastorefactory);
    }

    public setDataStoreFactory setDataStoreFactory(DataStoreFactory datastorefactory)
        throws IOException
    {
        return (setDataStoreFactory)super.aStoreFactory(datastorefactory);
    }

    public volatile com.google.api.client.auth.oauth2.ow.Builder setJsonFactory(JsonFactory jsonfactory)
    {
        return setJsonFactory(jsonfactory);
    }

    public setJsonFactory setJsonFactory(JsonFactory jsonfactory)
    {
        return (setJsonFactory)super.nFactory(jsonfactory);
    }

    public volatile com.google.api.client.auth.oauth2.ow.Builder setMethod(com.google.api.client.auth.oauth2.ow.Builder builder)
    {
        return setMethod(builder);
    }

    public setMethod setMethod(com.google.api.client.auth.oauth2.ow.Builder builder)
    {
        return (setMethod)super.hod(builder);
    }

    public volatile com.google.api.client.auth.oauth2.ow.Builder setRefreshListeners(Collection collection)
    {
        return setRefreshListeners(collection);
    }

    public setRefreshListeners setRefreshListeners(Collection collection)
    {
        return (setRefreshListeners)super.reshListeners(collection);
    }

    public volatile com.google.api.client.auth.oauth2.ow.Builder setRequestInitializer(HttpRequestInitializer httprequestinitializer)
    {
        return setRequestInitializer(httprequestinitializer);
    }

    public setRequestInitializer setRequestInitializer(HttpRequestInitializer httprequestinitializer)
    {
        return (setRequestInitializer)super.uestInitializer(httprequestinitializer);
    }

    public volatile com.google.api.client.auth.oauth2.ow.Builder setScopes(Collection collection)
    {
        return setScopes(collection);
    }

    public setScopes setScopes(Collection collection)
    {
        boolean flag;
        if (!collection.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag);
        return (setScopes)super.pes(collection);
    }

    public volatile com.google.api.client.auth.oauth2.ow.Builder setTokenServerUrl(GenericUrl genericurl)
    {
        return setTokenServerUrl(genericurl);
    }

    public setTokenServerUrl setTokenServerUrl(GenericUrl genericurl)
    {
        return (setTokenServerUrl)super.enServerUrl(genericurl);
    }

    public volatile com.google.api.client.auth.oauth2.ow.Builder setTransport(HttpTransport httptransport)
    {
        return setTransport(httptransport);
    }

    public setTransport setTransport(HttpTransport httptransport)
    {
        return (setTransport)super.nsport(httptransport);
    }

    public (HttpTransport httptransport, JsonFactory jsonfactory, GoogleClientSecrets googleclientsecrets, Collection collection)
    {
        super(BearerToken.authorizationHeaderAccessMethod(), httptransport, jsonfactory, new GenericUrl("https://accounts.google.com/o/oauth2/token"), new ClientParametersAuthentication(googleclientsecrets.getDetails().tId(), googleclientsecrets.getDetails().tSecret()), googleclientsecrets.getDetails().tId(), "https://accounts.google.com/o/oauth2/auth");
        setScopes(collection);
    }

    public setScopes(HttpTransport httptransport, JsonFactory jsonfactory, String s, String s1, Collection collection)
    {
        super(BearerToken.authorizationHeaderAccessMethod(), httptransport, jsonfactory, new GenericUrl("https://accounts.google.com/o/oauth2/token"), new ClientParametersAuthentication(s, s1), s, "https://accounts.google.com/o/oauth2/auth");
        setScopes(collection);
    }
}
