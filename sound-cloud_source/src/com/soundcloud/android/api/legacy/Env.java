// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.api.legacy;

import java.net.URI;
import java.net.URISyntaxException;
import org.apache.http.HttpHost;

public final class Env extends Enum
{

    private static final Env $VALUES[];
    public static final Env LIVE;
    private final HttpHost sslAuthResourceHost;
    private final HttpHost sslResourceHost;

    private Env(String s, int i, String s1, String s2)
    {
        super(s, i);
        sslResourceHost = new HttpHost(s1, 443, "https");
        sslAuthResourceHost = new HttpHost(s2, 443, "https");
    }

    private static URI hostToUri(HttpHost httphost)
    {
        try
        {
            httphost = new URI(httphost.getSchemeName(), httphost.getHostName(), null, null);
        }
        // Misplaced declaration of an exception variable
        catch (HttpHost httphost)
        {
            throw new IllegalArgumentException(httphost);
        }
        return httphost;
    }

    public static Env valueOf(String s)
    {
        return (Env)Enum.valueOf(com/soundcloud/android/api/legacy/Env, s);
    }

    public static Env[] values()
    {
        return (Env[])$VALUES.clone();
    }

    final HttpHost getSecureAuthResourceHost()
    {
        return sslAuthResourceHost;
    }

    final URI getSecureAuthResourceURI()
    {
        return hostToUri(getSecureAuthResourceHost());
    }

    public final HttpHost getSecureResourceHost()
    {
        return sslResourceHost;
    }

    public final boolean isApiHost(HttpHost httphost)
    {
        return ("http".equals(httphost.getSchemeName()) || "https".equals(httphost.getSchemeName())) && sslResourceHost.getHostName().equals(httphost.getHostName());
    }

    static 
    {
        LIVE = new Env("LIVE", 0, "api.soundcloud.com", "soundcloud.com");
        $VALUES = (new Env[] {
            LIVE
        });
    }
}
