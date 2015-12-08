// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.googleapis.testing.services.json;

import com.google.api.client.googleapis.services.AbstractGoogleClient;
import com.google.api.client.googleapis.services.GoogleClientRequestInitializer;
import com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.json.JsonFactory;

public class MockGoogleJsonClient extends AbstractGoogleJsonClient
{
    public static class Builder extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient.Builder
    {

        public volatile AbstractGoogleClient build()
        {
            return build();
        }

        public volatile AbstractGoogleJsonClient build()
        {
            return build();
        }

        public MockGoogleJsonClient build()
        {
            return new MockGoogleJsonClient(this);
        }

        public volatile com.google.api.client.googleapis.services.AbstractGoogleClient.Builder setApplicationName(String s)
        {
            return setApplicationName(s);
        }

        public volatile com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient.Builder setApplicationName(String s)
        {
            return setApplicationName(s);
        }

        public Builder setApplicationName(String s)
        {
            return (Builder)super.setApplicationName(s);
        }

        public volatile com.google.api.client.googleapis.services.AbstractGoogleClient.Builder setGoogleClientRequestInitializer(GoogleClientRequestInitializer googleclientrequestinitializer)
        {
            return setGoogleClientRequestInitializer(googleclientrequestinitializer);
        }

        public volatile com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient.Builder setGoogleClientRequestInitializer(GoogleClientRequestInitializer googleclientrequestinitializer)
        {
            return setGoogleClientRequestInitializer(googleclientrequestinitializer);
        }

        public Builder setGoogleClientRequestInitializer(GoogleClientRequestInitializer googleclientrequestinitializer)
        {
            return (Builder)super.setGoogleClientRequestInitializer(googleclientrequestinitializer);
        }

        public volatile com.google.api.client.googleapis.services.AbstractGoogleClient.Builder setHttpRequestInitializer(HttpRequestInitializer httprequestinitializer)
        {
            return setHttpRequestInitializer(httprequestinitializer);
        }

        public volatile com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient.Builder setHttpRequestInitializer(HttpRequestInitializer httprequestinitializer)
        {
            return setHttpRequestInitializer(httprequestinitializer);
        }

        public Builder setHttpRequestInitializer(HttpRequestInitializer httprequestinitializer)
        {
            return (Builder)super.setHttpRequestInitializer(httprequestinitializer);
        }

        public volatile com.google.api.client.googleapis.services.AbstractGoogleClient.Builder setRootUrl(String s)
        {
            return setRootUrl(s);
        }

        public volatile com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient.Builder setRootUrl(String s)
        {
            return setRootUrl(s);
        }

        public Builder setRootUrl(String s)
        {
            return (Builder)super.setRootUrl(s);
        }

        public volatile com.google.api.client.googleapis.services.AbstractGoogleClient.Builder setServicePath(String s)
        {
            return setServicePath(s);
        }

        public volatile com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient.Builder setServicePath(String s)
        {
            return setServicePath(s);
        }

        public Builder setServicePath(String s)
        {
            return (Builder)super.setServicePath(s);
        }

        public volatile com.google.api.client.googleapis.services.AbstractGoogleClient.Builder setSuppressAllChecks(boolean flag)
        {
            return setSuppressAllChecks(flag);
        }

        public volatile com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient.Builder setSuppressAllChecks(boolean flag)
        {
            return setSuppressAllChecks(flag);
        }

        public Builder setSuppressAllChecks(boolean flag)
        {
            return (Builder)super.setSuppressAllChecks(flag);
        }

        public volatile com.google.api.client.googleapis.services.AbstractGoogleClient.Builder setSuppressPatternChecks(boolean flag)
        {
            return setSuppressPatternChecks(flag);
        }

        public volatile com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient.Builder setSuppressPatternChecks(boolean flag)
        {
            return setSuppressPatternChecks(flag);
        }

        public Builder setSuppressPatternChecks(boolean flag)
        {
            return (Builder)super.setSuppressPatternChecks(flag);
        }

        public volatile com.google.api.client.googleapis.services.AbstractGoogleClient.Builder setSuppressRequiredParameterChecks(boolean flag)
        {
            return setSuppressRequiredParameterChecks(flag);
        }

        public volatile com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient.Builder setSuppressRequiredParameterChecks(boolean flag)
        {
            return setSuppressRequiredParameterChecks(flag);
        }

        public Builder setSuppressRequiredParameterChecks(boolean flag)
        {
            return (Builder)super.setSuppressRequiredParameterChecks(flag);
        }

        public Builder(HttpTransport httptransport, JsonFactory jsonfactory, String s, String s1, HttpRequestInitializer httprequestinitializer, boolean flag)
        {
            super(httptransport, jsonfactory, s, s1, httprequestinitializer, flag);
        }
    }


    protected MockGoogleJsonClient(Builder builder)
    {
        super(builder);
    }

    public MockGoogleJsonClient(HttpTransport httptransport, JsonFactory jsonfactory, String s, String s1, HttpRequestInitializer httprequestinitializer, boolean flag)
    {
        this(new Builder(httptransport, jsonfactory, s, s1, httprequestinitializer, flag));
    }
}
