// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.http.javanet;

import com.google.api.client.http.LowLevelHttpRequest;
import com.google.api.client.http.LowLevelHttpResponse;
import com.google.api.client.util.Preconditions;
import com.google.api.client.util.StreamingContent;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;

// Referenced classes of package com.google.api.client.http.javanet:
//            NetHttpResponse

final class NetHttpRequest extends LowLevelHttpRequest
{

    private final HttpURLConnection connection;

    NetHttpRequest(HttpURLConnection httpurlconnection)
    {
        connection = httpurlconnection;
        httpurlconnection.setInstanceFollowRedirects(false);
    }

    public void addHeader(String s, String s1)
    {
        connection.addRequestProperty(s, s1);
    }

    public LowLevelHttpResponse execute()
        throws IOException
    {
        Object obj = connection;
        if (getStreamingContent() == null) goto _L2; else goto _L1
_L1:
        Object obj1;
        long l;
        obj1 = getContentType();
        if (obj1 != null)
        {
            addHeader("Content-Type", ((String) (obj1)));
        }
        obj1 = getContentEncoding();
        if (obj1 != null)
        {
            addHeader("Content-Encoding", ((String) (obj1)));
        }
        l = getContentLength();
        if (l >= 0L)
        {
            addHeader("Content-Length", Long.toString(l));
        }
        obj1 = ((HttpURLConnection) (obj)).getRequestMethod();
        if (!"POST".equals(obj1) && !"PUT".equals(obj1)) goto _L4; else goto _L3
_L3:
        ((HttpURLConnection) (obj)).setDoOutput(true);
        if (l >= 0L && l <= 0x7fffffffL)
        {
            ((HttpURLConnection) (obj)).setFixedLengthStreamingMode((int)l);
        } else
        {
            ((HttpURLConnection) (obj)).setChunkedStreamingMode(0);
        }
        obj1 = ((HttpURLConnection) (obj)).getOutputStream();
        getStreamingContent().writeTo(((OutputStream) (obj1)));
        ((OutputStream) (obj1)).close();
_L2:
        ((HttpURLConnection) (obj)).connect();
        obj1 = new NetHttpResponse(((HttpURLConnection) (obj)));
        if (false)
        {
            ((HttpURLConnection) (obj)).disconnect();
        }
        return ((LowLevelHttpResponse) (obj1));
        obj;
        ((OutputStream) (obj1)).close();
        throw obj;
_L4:
        boolean flag;
        if (l == 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "%s with non-zero content length is not supported", new Object[] {
            obj1
        });
        if (true) goto _L2; else goto _L5
_L5:
        Exception exception;
        exception;
        if (true)
        {
            ((HttpURLConnection) (obj)).disconnect();
        }
        throw exception;
    }

    public void setTimeout(int i, int j)
    {
        connection.setReadTimeout(j);
        connection.setConnectTimeout(i);
    }
}
