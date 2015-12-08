// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.acra.util;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.zip.GZIPOutputStream;

// Referenced classes of package com.facebook.acra.util:
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

    public void sendPost(URL url, PostEntity postentity, ACRAResponse acraresponse, String s, String s1)
    {
        url = mConnectionProvider.getConnection(url);
        url.setRequestMethod("POST");
        url.setRequestProperty("User-Agent", s1);
        url.setRequestProperty("Content-Type", s);
        url.setRequestProperty("Content-Encoding", "gzip");
        url.setDoOutput(true);
        s = new GZIPOutputStream(url.getOutputStream());
        postentity.writeTo(s);
        s.close();
        acraresponse.setStatusCode(url.getResponseCode());
        url.getInputStream().close();
        url.disconnect();
        return;
        postentity;
        url.disconnect();
        throw postentity;
    }

    private class PostEntity
    {

        public abstract void writeTo(OutputStream outputstream);
    }

}
