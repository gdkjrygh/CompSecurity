// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.googleapis.auth.oauth2;

import com.google.api.client.http.HttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.util.Clock;
import com.google.api.client.util.Preconditions;

// Referenced classes of package com.google.api.client.googleapis.auth.oauth2:
//            GooglePublicKeysManager

public static class jsonFactory
{

    Clock clock;
    final JsonFactory jsonFactory;
    String publicCertsEncodedUrl;
    final HttpTransport transport;

    public GooglePublicKeysManager build()
    {
        return new GooglePublicKeysManager(this);
    }

    public final Clock getClock()
    {
        return clock;
    }

    public final JsonFactory getJsonFactory()
    {
        return jsonFactory;
    }

    public final String getPublicCertsEncodedUrl()
    {
        return publicCertsEncodedUrl;
    }

    public final HttpTransport getTransport()
    {
        return transport;
    }

    public transport setClock(Clock clock1)
    {
        clock = (Clock)Preconditions.checkNotNull(clock1);
        return this;
    }

    public clock setPublicCertsEncodedUrl(String s)
    {
        publicCertsEncodedUrl = (String)Preconditions.checkNotNull(s);
        return this;
    }

    public (HttpTransport httptransport, JsonFactory jsonfactory)
    {
        clock = Clock.SYSTEM;
        publicCertsEncodedUrl = "https://www.googleapis.com/oauth2/v1/certs";
        transport = (HttpTransport)Preconditions.checkNotNull(httptransport);
        jsonFactory = (JsonFactory)Preconditions.checkNotNull(jsonfactory);
    }
}
