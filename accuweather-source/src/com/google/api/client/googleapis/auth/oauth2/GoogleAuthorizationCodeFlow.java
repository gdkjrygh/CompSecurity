// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.googleapis.auth.oauth2;

import com.google.api.client.auth.oauth2.AuthorizationCodeFlow;
import com.google.api.client.auth.oauth2.AuthorizationCodeRequestUrl;
import com.google.api.client.auth.oauth2.AuthorizationCodeTokenRequest;
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
//            GoogleAuthorizationCodeRequestUrl, GoogleAuthorizationCodeTokenRequest, GoogleClientSecrets

public class GoogleAuthorizationCodeFlow extends AuthorizationCodeFlow
{
    public static class Builder extends com.google.api.client.auth.oauth2.AuthorizationCodeFlow.Builder
    {

        String accessType;
        String approvalPrompt;

        public volatile com.google.api.client.auth.oauth2.AuthorizationCodeFlow.Builder addRefreshListener(CredentialRefreshListener credentialrefreshlistener)
        {
            return addRefreshListener(credentialrefreshlistener);
        }

        public Builder addRefreshListener(CredentialRefreshListener credentialrefreshlistener)
        {
            return (Builder)super.addRefreshListener(credentialrefreshlistener);
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

        public Builder setAccessType(String s)
        {
            accessType = s;
            return this;
        }

        public Builder setApprovalPrompt(String s)
        {
            approvalPrompt = s;
            return this;
        }

        public volatile com.google.api.client.auth.oauth2.AuthorizationCodeFlow.Builder setAuthorizationServerEncodedUrl(String s)
        {
            return setAuthorizationServerEncodedUrl(s);
        }

        public Builder setAuthorizationServerEncodedUrl(String s)
        {
            return (Builder)super.setAuthorizationServerEncodedUrl(s);
        }

        public volatile com.google.api.client.auth.oauth2.AuthorizationCodeFlow.Builder setClientAuthentication(HttpExecuteInterceptor httpexecuteinterceptor)
        {
            return setClientAuthentication(httpexecuteinterceptor);
        }

        public Builder setClientAuthentication(HttpExecuteInterceptor httpexecuteinterceptor)
        {
            return (Builder)super.setClientAuthentication(httpexecuteinterceptor);
        }

        public volatile com.google.api.client.auth.oauth2.AuthorizationCodeFlow.Builder setClientId(String s)
        {
            return setClientId(s);
        }

        public Builder setClientId(String s)
        {
            return (Builder)super.setClientId(s);
        }

        public volatile com.google.api.client.auth.oauth2.AuthorizationCodeFlow.Builder setClock(Clock clock)
        {
            return setClock(clock);
        }

        public Builder setClock(Clock clock)
        {
            return (Builder)super.setClock(clock);
        }

        public volatile com.google.api.client.auth.oauth2.AuthorizationCodeFlow.Builder setCredentialCreatedListener(com.google.api.client.auth.oauth2.AuthorizationCodeFlow.CredentialCreatedListener credentialcreatedlistener)
        {
            return setCredentialCreatedListener(credentialcreatedlistener);
        }

        public Builder setCredentialCreatedListener(com.google.api.client.auth.oauth2.AuthorizationCodeFlow.CredentialCreatedListener credentialcreatedlistener)
        {
            return (Builder)super.setCredentialCreatedListener(credentialcreatedlistener);
        }

        public volatile com.google.api.client.auth.oauth2.AuthorizationCodeFlow.Builder setCredentialDataStore(DataStore datastore)
        {
            return setCredentialDataStore(datastore);
        }

        public Builder setCredentialDataStore(DataStore datastore)
        {
            return (Builder)super.setCredentialDataStore(datastore);
        }

        public volatile com.google.api.client.auth.oauth2.AuthorizationCodeFlow.Builder setCredentialStore(CredentialStore credentialstore)
        {
            return setCredentialStore(credentialstore);
        }

        public Builder setCredentialStore(CredentialStore credentialstore)
        {
            return (Builder)super.setCredentialStore(credentialstore);
        }

        public volatile com.google.api.client.auth.oauth2.AuthorizationCodeFlow.Builder setDataStoreFactory(DataStoreFactory datastorefactory)
            throws IOException
        {
            return setDataStoreFactory(datastorefactory);
        }

        public Builder setDataStoreFactory(DataStoreFactory datastorefactory)
            throws IOException
        {
            return (Builder)super.setDataStoreFactory(datastorefactory);
        }

        public volatile com.google.api.client.auth.oauth2.AuthorizationCodeFlow.Builder setJsonFactory(JsonFactory jsonfactory)
        {
            return setJsonFactory(jsonfactory);
        }

        public Builder setJsonFactory(JsonFactory jsonfactory)
        {
            return (Builder)super.setJsonFactory(jsonfactory);
        }

        public volatile com.google.api.client.auth.oauth2.AuthorizationCodeFlow.Builder setMethod(com.google.api.client.auth.oauth2.Credential.AccessMethod accessmethod)
        {
            return setMethod(accessmethod);
        }

        public Builder setMethod(com.google.api.client.auth.oauth2.Credential.AccessMethod accessmethod)
        {
            return (Builder)super.setMethod(accessmethod);
        }

        public volatile com.google.api.client.auth.oauth2.AuthorizationCodeFlow.Builder setRefreshListeners(Collection collection)
        {
            return setRefreshListeners(collection);
        }

        public Builder setRefreshListeners(Collection collection)
        {
            return (Builder)super.setRefreshListeners(collection);
        }

        public volatile com.google.api.client.auth.oauth2.AuthorizationCodeFlow.Builder setRequestInitializer(HttpRequestInitializer httprequestinitializer)
        {
            return setRequestInitializer(httprequestinitializer);
        }

        public Builder setRequestInitializer(HttpRequestInitializer httprequestinitializer)
        {
            return (Builder)super.setRequestInitializer(httprequestinitializer);
        }

        public volatile com.google.api.client.auth.oauth2.AuthorizationCodeFlow.Builder setScopes(Collection collection)
        {
            return setScopes(collection);
        }

        public Builder setScopes(Collection collection)
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
            return (Builder)super.setScopes(collection);
        }

        public volatile com.google.api.client.auth.oauth2.AuthorizationCodeFlow.Builder setTokenServerUrl(GenericUrl genericurl)
        {
            return setTokenServerUrl(genericurl);
        }

        public Builder setTokenServerUrl(GenericUrl genericurl)
        {
            return (Builder)super.setTokenServerUrl(genericurl);
        }

        public volatile com.google.api.client.auth.oauth2.AuthorizationCodeFlow.Builder setTransport(HttpTransport httptransport)
        {
            return setTransport(httptransport);
        }

        public Builder setTransport(HttpTransport httptransport)
        {
            return (Builder)super.setTransport(httptransport);
        }

        public Builder(HttpTransport httptransport, JsonFactory jsonfactory, GoogleClientSecrets googleclientsecrets, Collection collection)
        {
            super(BearerToken.authorizationHeaderAccessMethod(), httptransport, jsonfactory, new GenericUrl("https://accounts.google.com/o/oauth2/token"), new ClientParametersAuthentication(googleclientsecrets.getDetails().getClientId(), googleclientsecrets.getDetails().getClientSecret()), googleclientsecrets.getDetails().getClientId(), "https://accounts.google.com/o/oauth2/auth");
            setScopes(collection);
        }

        public Builder(HttpTransport httptransport, JsonFactory jsonfactory, String s, String s1, Collection collection)
        {
            super(BearerToken.authorizationHeaderAccessMethod(), httptransport, jsonfactory, new GenericUrl("https://accounts.google.com/o/oauth2/token"), new ClientParametersAuthentication(s, s1), s, "https://accounts.google.com/o/oauth2/auth");
            setScopes(collection);
        }
    }


    private final String accessType;
    private final String approvalPrompt;

    protected GoogleAuthorizationCodeFlow(Builder builder)
    {
        super(builder);
        accessType = builder.accessType;
        approvalPrompt = builder.approvalPrompt;
    }

    public GoogleAuthorizationCodeFlow(HttpTransport httptransport, JsonFactory jsonfactory, String s, String s1, Collection collection)
    {
        this(new Builder(httptransport, jsonfactory, s, s1, collection));
    }

    public final String getAccessType()
    {
        return accessType;
    }

    public final String getApprovalPrompt()
    {
        return approvalPrompt;
    }

    public volatile AuthorizationCodeRequestUrl newAuthorizationUrl()
    {
        return newAuthorizationUrl();
    }

    public GoogleAuthorizationCodeRequestUrl newAuthorizationUrl()
    {
        return (new GoogleAuthorizationCodeRequestUrl(getAuthorizationServerEncodedUrl(), getClientId(), "", getScopes())).setAccessType(accessType).setApprovalPrompt(approvalPrompt);
    }

    public volatile AuthorizationCodeTokenRequest newTokenRequest(String s)
    {
        return newTokenRequest(s);
    }

    public GoogleAuthorizationCodeTokenRequest newTokenRequest(String s)
    {
        return (new GoogleAuthorizationCodeTokenRequest(getTransport(), getJsonFactory(), getTokenServerEncodedUrl(), "", "", s, "")).setClientAuthentication(getClientAuthentication()).setRequestInitializer(getRequestInitializer()).setScopes(getScopes());
    }
}
