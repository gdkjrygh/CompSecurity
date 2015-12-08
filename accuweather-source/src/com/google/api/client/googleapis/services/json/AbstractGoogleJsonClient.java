// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.googleapis.services.json;

import com.google.api.client.googleapis.services.AbstractGoogleClient;
import com.google.api.client.googleapis.services.GoogleClientRequestInitializer;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.JsonObjectParser;
import com.google.api.client.util.ObjectParser;
import java.util.Arrays;
import java.util.Collections;

public abstract class AbstractGoogleJsonClient extends AbstractGoogleClient
{
    public static abstract class Builder extends com.google.api.client.googleapis.services.AbstractGoogleClient.Builder
    {

        public volatile AbstractGoogleClient build()
        {
            return build();
        }

        public abstract AbstractGoogleJsonClient build();

        public final JsonFactory getJsonFactory()
        {
            return getObjectParser().getJsonFactory();
        }

        public final JsonObjectParser getObjectParser()
        {
            return (JsonObjectParser)super.getObjectParser();
        }

        public volatile ObjectParser getObjectParser()
        {
            return getObjectParser();
        }

        public volatile com.google.api.client.googleapis.services.AbstractGoogleClient.Builder setApplicationName(String s)
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

        public Builder setGoogleClientRequestInitializer(GoogleClientRequestInitializer googleclientrequestinitializer)
        {
            return (Builder)super.setGoogleClientRequestInitializer(googleclientrequestinitializer);
        }

        public volatile com.google.api.client.googleapis.services.AbstractGoogleClient.Builder setHttpRequestInitializer(HttpRequestInitializer httprequestinitializer)
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

        public Builder setRootUrl(String s)
        {
            return (Builder)super.setRootUrl(s);
        }

        public volatile com.google.api.client.googleapis.services.AbstractGoogleClient.Builder setServicePath(String s)
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

        public Builder setSuppressAllChecks(boolean flag)
        {
            return (Builder)super.setSuppressAllChecks(flag);
        }

        public volatile com.google.api.client.googleapis.services.AbstractGoogleClient.Builder setSuppressPatternChecks(boolean flag)
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

        public Builder setSuppressRequiredParameterChecks(boolean flag)
        {
            return (Builder)super.setSuppressRequiredParameterChecks(flag);
        }

        protected Builder(HttpTransport httptransport, JsonFactory jsonfactory, String s, String s1, HttpRequestInitializer httprequestinitializer, boolean flag)
        {
            com.google.api.client.json.JsonObjectParser.Builder builder = new com.google.api.client.json.JsonObjectParser.Builder(jsonfactory);
            if (flag)
            {
                jsonfactory = Arrays.asList(new String[] {
                    "data", "error"
                });
            } else
            {
                jsonfactory = Collections.emptySet();
            }
            super(httptransport, s, s1, builder.setWrapperKeys(jsonfactory).build(), httprequestinitializer);
        }
    }


    protected AbstractGoogleJsonClient(Builder builder)
    {
        super(builder);
    }

    public final JsonFactory getJsonFactory()
    {
        return getObjectParser().getJsonFactory();
    }

    public JsonObjectParser getObjectParser()
    {
        return (JsonObjectParser)super.getObjectParser();
    }

    public volatile ObjectParser getObjectParser()
    {
        return getObjectParser();
    }
}
