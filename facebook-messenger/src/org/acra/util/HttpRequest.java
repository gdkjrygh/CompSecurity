// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.acra.util;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

// Referenced classes of package org.acra.util:
//            HttpConnectionProvider, ACRAResponse

public class HttpRequest
{

    public static final String POST_CONTENT_TYPE_FORM_URLENCODED = "application/x-www-form-urlencoded";
    public static final String POST_CONTENT_TYPE_JSON = "application/json";
    private HttpConnectionProvider mConnectionProvider;

    public HttpRequest(HttpConnectionProvider httpconnectionprovider)
    {
        mConnectionProvider = httpconnectionprovider;
    }

    public void sendPost(URL url, String s, ACRAResponse acraresponse)
    {
        sendPost(url, s, acraresponse, "application/x-www-form-urlencoded");
    }

    public void sendPost(URL url, String s, ACRAResponse acraresponse, String s1)
    {
        url = mConnectionProvider.getConnection(url);
        url.setRequestMethod("POST");
        url.setRequestProperty("User-Agent", "Android");
        url.setRequestProperty("Content-Type", s1);
        url.setDoOutput(true);
        url.setFixedLengthStreamingMode(s.length());
        s1 = url.getOutputStream();
        s1.write(s.getBytes());
        s1.close();
        acraresponse.setStatusCode(url.getResponseCode());
        url.getInputStream().close();
        url.disconnect();
        return;
        s;
        url.disconnect();
        throw s;
    }
}
