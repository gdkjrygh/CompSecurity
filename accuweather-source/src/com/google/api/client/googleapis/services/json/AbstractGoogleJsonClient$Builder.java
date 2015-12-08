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

// Referenced classes of package com.google.api.client.googleapis.services.json:
//            AbstractGoogleJsonClient

public static abstract class  extends com.google.api.client.googleapis.services.lder
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
        return (JsonObjectParser)super.bjectParser();
    }

    public volatile ObjectParser getObjectParser()
    {
        return getObjectParser();
    }

    public volatile com.google.api.client.googleapis.services.lder setApplicationName(String s)
    {
        return setApplicationName(s);
    }

    public setApplicationName setApplicationName(String s)
    {
        return (setApplicationName)super.pplicationName(s);
    }

    public volatile com.google.api.client.googleapis.services.lder setGoogleClientRequestInitializer(GoogleClientRequestInitializer googleclientrequestinitializer)
    {
        return setGoogleClientRequestInitializer(googleclientrequestinitializer);
    }

    public setGoogleClientRequestInitializer setGoogleClientRequestInitializer(GoogleClientRequestInitializer googleclientrequestinitializer)
    {
        return (setGoogleClientRequestInitializer)super.oogleClientRequestInitializer(googleclientrequestinitializer);
    }

    public volatile com.google.api.client.googleapis.services.lder setHttpRequestInitializer(HttpRequestInitializer httprequestinitializer)
    {
        return setHttpRequestInitializer(httprequestinitializer);
    }

    public setHttpRequestInitializer setHttpRequestInitializer(HttpRequestInitializer httprequestinitializer)
    {
        return (setHttpRequestInitializer)super.ttpRequestInitializer(httprequestinitializer);
    }

    public volatile com.google.api.client.googleapis.services.lder setRootUrl(String s)
    {
        return setRootUrl(s);
    }

    public setRootUrl setRootUrl(String s)
    {
        return (setRootUrl)super.ootUrl(s);
    }

    public volatile com.google.api.client.googleapis.services.lder setServicePath(String s)
    {
        return setServicePath(s);
    }

    public setServicePath setServicePath(String s)
    {
        return (setServicePath)super.ervicePath(s);
    }

    public volatile com.google.api.client.googleapis.services.lder setSuppressAllChecks(boolean flag)
    {
        return setSuppressAllChecks(flag);
    }

    public setSuppressAllChecks setSuppressAllChecks(boolean flag)
    {
        return (setSuppressAllChecks)super.uppressAllChecks(flag);
    }

    public volatile com.google.api.client.googleapis.services.lder setSuppressPatternChecks(boolean flag)
    {
        return setSuppressPatternChecks(flag);
    }

    public setSuppressPatternChecks setSuppressPatternChecks(boolean flag)
    {
        return (setSuppressPatternChecks)super.uppressPatternChecks(flag);
    }

    public volatile com.google.api.client.googleapis.services.lder setSuppressRequiredParameterChecks(boolean flag)
    {
        return setSuppressRequiredParameterChecks(flag);
    }

    public setSuppressRequiredParameterChecks setSuppressRequiredParameterChecks(boolean flag)
    {
        return (setSuppressRequiredParameterChecks)super.uppressRequiredParameterChecks(flag);
    }

    protected (HttpTransport httptransport, JsonFactory jsonfactory, String s, String s1, HttpRequestInitializer httprequestinitializer, boolean flag)
    {
        com.google.api.client.json.eJsonClient.Builder builder = new com.google.api.client.json.eJsonClient.Builder(jsonfactory);
        if (flag)
        {
            jsonfactory = Arrays.asList(new String[] {
                "data", "error"
            });
        } else
        {
            jsonfactory = Collections.emptySet();
        }
        super(httptransport, s, s1, builder.erKeys(jsonfactory).erKeys(), httprequestinitializer);
    }
}
