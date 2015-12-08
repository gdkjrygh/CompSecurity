// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.offline;

import c.h;
import com.c.a.A;
import com.c.a.B;
import com.c.a.e;
import com.c.a.t;
import com.c.a.w;
import com.soundcloud.android.api.oauth.OAuth;
import com.soundcloud.android.utils.DeviceHelper;
import com.soundcloud.android.utils.IOUtils;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;

class StrictSSLHttpClient
{
    static class TrackFileResponse
        implements Closeable
    {

        private final A response;

        public void close()
        {
            IOUtils.close(response.g);
        }

        public InputStream getInputStream()
            throws IOException
        {
            return response.g.c().d();
        }

        public boolean isFailure()
        {
            return !response.a();
        }

        public boolean isSuccess()
        {
            return response.a();
        }

        public boolean isUnavailable()
        {
            return response.c >= 400 && response.c <= 499;
        }

        public TrackFileResponse(A a)
        {
            response = a;
        }
    }


    private final DeviceHelper deviceHelper;
    private final t httpClient;
    private final OAuth oAuth;

    public StrictSSLHttpClient(t t1, DeviceHelper devicehelper, OAuth oauth)
    {
        httpClient = t1;
        deviceHelper = devicehelper;
        oAuth = oauth;
    }

    private void logRequest(w w1)
    {
        (new StringBuilder("[OkHttp] ")).append(w1.b).append(" ").append(w1.a).append("; headers = ").append(w1.c);
    }

    private void logResponse(A a)
    {
        (new StringBuilder("[OkHttp] ")).append(a);
    }

    public TrackFileResponse getFileStream(String s)
        throws IOException
    {
        s = (new com.c.a.w.a()).a(s).b("User-Agent", deviceHelper.getUserAgent()).b("Authorization", oAuth.getAuthorizationHeaderValue()).a();
        logRequest(s);
        s = httpClient.a(s).a();
        logResponse(s);
        return new TrackFileResponse(s);
    }
}
