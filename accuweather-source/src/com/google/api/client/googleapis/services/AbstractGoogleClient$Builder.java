// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.googleapis.services;

import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.util.ObjectParser;
import com.google.api.client.util.Preconditions;

// Referenced classes of package com.google.api.client.googleapis.services:
//            AbstractGoogleClient, GoogleClientRequestInitializer

public static abstract class httpRequestInitializer
{

    String applicationName;
    GoogleClientRequestInitializer googleClientRequestInitializer;
    HttpRequestInitializer httpRequestInitializer;
    final ObjectParser objectParser;
    String rootUrl;
    String servicePath;
    boolean suppressPatternChecks;
    boolean suppressRequiredParameterChecks;
    final HttpTransport transport;

    public abstract AbstractGoogleClient build();

    public final String getApplicationName()
    {
        return applicationName;
    }

    public final GoogleClientRequestInitializer getGoogleClientRequestInitializer()
    {
        return googleClientRequestInitializer;
    }

    public final HttpRequestInitializer getHttpRequestInitializer()
    {
        return httpRequestInitializer;
    }

    public ObjectParser getObjectParser()
    {
        return objectParser;
    }

    public final String getRootUrl()
    {
        return rootUrl;
    }

    public final String getServicePath()
    {
        return servicePath;
    }

    public final boolean getSuppressPatternChecks()
    {
        return suppressPatternChecks;
    }

    public final boolean getSuppressRequiredParameterChecks()
    {
        return suppressRequiredParameterChecks;
    }

    public final HttpTransport getTransport()
    {
        return transport;
    }

    public transport setApplicationName(String s)
    {
        applicationName = s;
        return this;
    }

    public r setGoogleClientRequestInitializer(GoogleClientRequestInitializer googleclientrequestinitializer)
    {
        googleClientRequestInitializer = googleclientrequestinitializer;
        return this;
    }

    public googleClientRequestInitializer setHttpRequestInitializer(HttpRequestInitializer httprequestinitializer)
    {
        httpRequestInitializer = httprequestinitializer;
        return this;
    }

    public httpRequestInitializer setRootUrl(String s)
    {
        rootUrl = AbstractGoogleClient.normalizeRootUrl(s);
        return this;
    }

    public eRootUrl setServicePath(String s)
    {
        servicePath = AbstractGoogleClient.normalizeServicePath(s);
        return this;
    }

    public eServicePath setSuppressAllChecks(boolean flag)
    {
        return setSuppressPatternChecks(true).setSuppressRequiredParameterChecks(true);
    }

    public setSuppressRequiredParameterChecks setSuppressPatternChecks(boolean flag)
    {
        suppressPatternChecks = flag;
        return this;
    }

    public suppressPatternChecks setSuppressRequiredParameterChecks(boolean flag)
    {
        suppressRequiredParameterChecks = flag;
        return this;
    }

    protected r(HttpTransport httptransport, String s, String s1, ObjectParser objectparser, HttpRequestInitializer httprequestinitializer)
    {
        transport = (HttpTransport)Preconditions.checkNotNull(httptransport);
        objectParser = objectparser;
        setRootUrl(s);
        setServicePath(s1);
        httpRequestInitializer = httprequestinitializer;
    }
}
