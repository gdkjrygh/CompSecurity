// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.data.http.power;

import android.util.Log;
import com.dominos.android.sdk.common.StringHelper;
import com.google.a.a.aa;
import com.google.a.a.w;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import org.c.c.a.d;
import org.c.c.f;
import org.c.c.l;
import org.c.d.g;

// Referenced classes of package com.dominos.android.sdk.data.http.power:
//            LoggingClientHttpRequestFactory

class connection extends d
{

    private static final String AUTH_ERROR = "Received authentication challenge is null";
    private static final String AUTH_ERROR_JELLY_BEAN = "No authentication challenges found";
    private static final String PROXY_AUTH_ERROR = "Received HTTP_PROXY_AUTH (407) code while not using proxy";
    private HttpURLConnection connection;
    private f headers;
    final LoggingClientHttpRequestFactory this$0;

    private int handleIOException(IOException ioexception)
    {
        if ("Received authentication challenge is null".equals(ioexception.getMessage()) || "No authentication challenges found".equals(ioexception.getMessage()))
        {
            return l.UNAUTHORIZED.value();
        }
        if ("Received HTTP_PROXY_AUTH (407) code while not using proxy".equals(ioexception.getMessage()))
        {
            return l.PROXY_AUTHENTICATION_REQUIRED.value();
        } else
        {
            throw ioexception;
        }
    }

    protected void closeInternal()
    {
        connection.disconnect();
    }

    protected InputStream getBodyInternal()
    {
        Object obj = connection.getErrorStream();
        ByteArrayOutputStream bytearrayoutputstream;
        if (obj == null)
        {
            obj = connection.getInputStream();
        }
        bytearrayoutputstream = new ByteArrayOutputStream();
        g.copy(((InputStream) (obj)), bytearrayoutputstream);
        obj = bytearrayoutputstream.toByteArray();
        Log.v("LoggingClientHttpRequestFactory", String.format("<<RESP [%s]\nheaders=[%s]\nbody=[%s]", new Object[] {
            connection.getURL().toExternalForm(), w.a(":").c("=").a(headers), new String(((byte []) (obj)))
        }));
        return new ByteArrayInputStream(((byte []) (obj)));
    }

    public f getHeaders()
    {
        if (headers == null)
        {
            headers = new f();
            String s = connection.getHeaderFieldKey(0);
            if (StringHelper.isNotEmpty(s))
            {
                headers.add(s, connection.getHeaderField(0));
            }
            int i = 1;
            do
            {
                String s1 = connection.getHeaderFieldKey(i);
                if (!StringHelper.isNotEmpty(s1))
                {
                    break;
                }
                headers.add(s1, connection.getHeaderField(i));
                i++;
            } while (true);
        }
        return headers;
    }

    public int getRawStatusCode()
    {
        int i;
        try
        {
            i = connection.getResponseCode();
        }
        catch (IOException ioexception)
        {
            return handleIOException(ioexception);
        }
        return i;
    }

    public String getStatusText()
    {
        String s;
        try
        {
            s = connection.getResponseMessage();
        }
        catch (IOException ioexception)
        {
            return l.valueOf(handleIOException(ioexception)).getReasonPhrase();
        }
        return s;
    }

    public (HttpURLConnection httpurlconnection)
    {
        this$0 = LoggingClientHttpRequestFactory.this;
        super();
        connection = httpurlconnection;
    }
}
