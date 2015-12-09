// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.serverinteraction;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import oauth.signpost.basic.DefaultOAuthProvider;
import oauth.signpost.basic.a;

public class SharedHttpUrlConnectionFactoryOauthProvider extends DefaultOAuthProvider
{

    private final g.b client;

    public SharedHttpUrlConnectionFactoryOauthProvider(g.b b, String s, String s1, String s2)
    {
        super(s, s1, s2);
        client = b;
    }

    protected oauth.signpost.http.a a(String s)
        throws MalformedURLException, IOException
    {
        s = client.a(s);
        s.setRequestMethod("POST");
        s.setAllowUserInteraction(false);
        s.setRequestProperty("Content-Length", "0");
        return new a(s);
    }
}
