// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j.internal.http;

import java.net.HttpURLConnection;
import java.util.Map;

// Referenced classes of package twitter4j.internal.http:
//            HttpResponse, StreamingGZIPInputStream, HttpClientConfiguration

public class HttpResponseImpl extends HttpResponse
{

    private HttpURLConnection con;

    HttpResponseImpl(String s)
    {
        responseAsString = s;
    }

    HttpResponseImpl(HttpURLConnection httpurlconnection, HttpClientConfiguration httpclientconfiguration)
    {
        super(httpclientconfiguration);
        con = httpurlconnection;
        statusCode = httpurlconnection.getResponseCode();
        httpclientconfiguration = httpurlconnection.getErrorStream();
        is = httpclientconfiguration;
        if (httpclientconfiguration == null)
        {
            is = httpurlconnection.getInputStream();
        }
        if (is != null && "gzip".equals(httpurlconnection.getContentEncoding()))
        {
            is = new StreamingGZIPInputStream(is);
        }
    }

    public void disconnect()
    {
        con.disconnect();
    }

    public String getResponseHeader(String s)
    {
        return con.getHeaderField(s);
    }

    public Map getResponseHeaderFields()
    {
        return con.getHeaderFields();
    }
}
