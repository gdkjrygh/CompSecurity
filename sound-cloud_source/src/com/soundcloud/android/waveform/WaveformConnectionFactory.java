// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.waveform;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

class WaveformConnectionFactory
{

    private static final int CONNECT_TIMEOUT = 3000;
    private static final int READ_TIMEOUT = 3000;

    WaveformConnectionFactory()
    {
    }

    HttpURLConnection configure(HttpURLConnection httpurlconnection)
    {
        httpurlconnection.setConnectTimeout(3000);
        httpurlconnection.setReadTimeout(3000);
        httpurlconnection.setUseCaches(true);
        return httpurlconnection;
    }

    HttpURLConnection create(String s)
        throws IOException
    {
        return configure((HttpURLConnection)(new URL(s)).openConnection());
    }
}
