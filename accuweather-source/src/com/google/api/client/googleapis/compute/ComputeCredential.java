// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.googleapis.compute;

import com.google.api.client.auth.oauth2.BearerToken;
import com.google.api.client.auth.oauth2.Credential;
import com.google.api.client.auth.oauth2.CredentialRefreshListener;
import com.google.api.client.auth.oauth2.TokenResponse;
import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpExecuteInterceptor;
import com.google.api.client.http.HttpHeaders;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestFactory;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.http.HttpResponse;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.JsonObjectParser;
import com.google.api.client.util.Clock;
import com.google.api.client.util.Preconditions;
import java.io.IOException;
import java.util.Collection;

public class ComputeCredential extends Credential
{
    public static class Builder extends com.google.api.client.auth.oauth2.Credential.Builder
    {

        public volatile com.google.api.client.auth.oauth2.Credential.Builder addRefreshListener(CredentialRefreshListener credentialrefreshlistener)
        {
            return addRefreshListener(credentialrefreshlistener);
        }

        public Builder addRefreshListener(CredentialRefreshListener credentialrefreshlistener)
        {
            return (Builder)super.addRefreshListener(credentialrefreshlistener);
        }

        public volatile Credential build()
        {
            return build();
        }

        public ComputeCredential build()
        {
            return new ComputeCredential(this);
        }

        public volatile com.google.api.client.auth.oauth2.Credential.Builder setClientAuthentication(HttpExecuteInterceptor httpexecuteinterceptor)
        {
            return setClientAuthentication(httpexecuteinterceptor);
        }

        public Builder setClientAuthentication(HttpExecuteInterceptor httpexecuteinterceptor)
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

        public volatile com.google.api.client.auth.oauth2.Credential.Builder setClock(Clock clock)
        {
            return setClock(clock);
        }

        public Builder setClock(Clock clock)
        {
            return (Builder)super.setClock(clock);
        }

        public volatile com.google.api.client.auth.oauth2.Credential.Builder setJsonFactory(JsonFactory jsonfactory)
        {
            return setJsonFactory(jsonfactory);
        }

        public Builder setJsonFactory(JsonFactory jsonfactory)
        {
            return (Builder)super.setJsonFactory((JsonFactory)Preconditions.checkNotNull(jsonfactory));
        }

        public volatile com.google.api.client.auth.oauth2.Credential.Builder setRefreshListeners(Collection collection)
        {
            return setRefreshListeners(collection);
        }

        public Builder setRefreshListeners(Collection collection)
        {
            return (Builder)super.setRefreshListeners(collection);
        }

        public volatile com.google.api.client.auth.oauth2.Credential.Builder setRequestInitializer(HttpRequestInitializer httprequestinitializer)
        {
            return setRequestInitializer(httprequestinitializer);
        }

        public Builder setRequestInitializer(HttpRequestInitializer httprequestinitializer)
        {
            return (Builder)super.setRequestInitializer(httprequestinitializer);
        }

        public volatile com.google.api.client.auth.oauth2.Credential.Builder setTokenServerEncodedUrl(String s)
        {
            return setTokenServerEncodedUrl(s);
        }

        public Builder setTokenServerEncodedUrl(String s)
        {
            return (Builder)super.setTokenServerEncodedUrl((String)Preconditions.checkNotNull(s));
        }

        public volatile com.google.api.client.auth.oauth2.Credential.Builder setTokenServerUrl(GenericUrl genericurl)
        {
            return setTokenServerUrl(genericurl);
        }

        public Builder setTokenServerUrl(GenericUrl genericurl)
        {
            return (Builder)super.setTokenServerUrl((GenericUrl)Preconditions.checkNotNull(genericurl));
        }

        public volatile com.google.api.client.auth.oauth2.Credential.Builder setTransport(HttpTransport httptransport)
        {
            return setTransport(httptransport);
        }

        public Builder setTransport(HttpTransport httptransport)
        {
            return (Builder)super.setTransport((HttpTransport)Preconditions.checkNotNull(httptransport));
        }

        public Builder(HttpTransport httptransport, JsonFactory jsonfactory)
        {
            super(BearerToken.authorizationHeaderAccessMethod());
            setTransport(httptransport);
            setJsonFactory(jsonfactory);
            setTokenServerEncodedUrl("http://metadata/computeMetadata/v1/instance/service-accounts/default/token");
        }
    }


    public static final String TOKEN_SERVER_ENCODED_URL = "http://metadata/computeMetadata/v1/instance/service-accounts/default/token";

    protected ComputeCredential(Builder builder)
    {
        super(builder);
    }

    public ComputeCredential(HttpTransport httptransport, JsonFactory jsonfactory)
    {
        this(new Builder(httptransport, jsonfactory));
    }

    protected TokenResponse executeRefreshToken()
        throws IOException
    {
        Object obj = new GenericUrl(getTokenServerEncodedUrl());
        obj = getTransport().createRequestFactory().buildGetRequest(((GenericUrl) (obj)));
        ((HttpRequest) (obj)).setParser(new JsonObjectParser(getJsonFactory()));
        ((HttpRequest) (obj)).getHeaders().set("X-Google-Metadata-Request", Boolean.valueOf(true));
        return (TokenResponse)((HttpRequest) (obj)).execute().parseAs(com/google/api/client/auth/oauth2/TokenResponse);
    }
}
