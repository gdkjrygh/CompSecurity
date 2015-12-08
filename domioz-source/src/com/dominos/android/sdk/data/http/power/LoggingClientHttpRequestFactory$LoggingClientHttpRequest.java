// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.data.http.power;

import android.util.Log;
import com.google.a.a.aa;
import com.google.a.a.w;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.c.c.a.b;
import org.c.c.f;
import org.c.c.i;
import org.c.d.g;

// Referenced classes of package com.dominos.android.sdk.data.http.power:
//            LoggingClientHttpRequestFactory

class connection extends b
{

    private ByteArrayOutputStream bufferedOutput;
    private HttpURLConnection connection;
    final LoggingClientHttpRequestFactory this$0;

    private org.c.c.a.i executeInternal(f f1, byte abyte0[])
    {
        for (f1 = f1.entrySet().iterator(); f1.hasNext();)
        {
            Object obj = (java.util.tory)f1.next();
            String s = (String)((java.util.tory) (obj)).tory();
            obj = ((List)((java.util.tory) (obj)).tory()).iterator();
            while (((Iterator) (obj)).hasNext()) 
            {
                String s1 = (String)((Iterator) (obj)).next();
                connection.addRequestProperty(s, s1);
            }
        }

        if (connection.getDoOutput())
        {
            connection.setFixedLengthStreamingMode(abyte0.length);
        }
        connection.connect();
        if (connection.getDoOutput())
        {
            g.copy(abyte0, connection.getOutputStream());
        }
        return new (LoggingClientHttpRequestFactory.this, connection);
    }

    protected org.c.c.a.i executeInternal(f f1)
    {
        byte abyte0[] = bufferedOutput.toByteArray();
        if (f1.getContentLength() == -1L)
        {
            f1.setContentLength(abyte0.length);
        }
        Log.v("LoggingClientHttpRequestFactory", String.format(">>RQST [%s]\nheaders=[%s]\nbody=[%s]", new Object[] {
            connection.getURL().toExternalForm(), w.a(":").c("=").a(f1), new String(abyte0)
        }));
        f1 = executeInternal(f1, abyte0);
        bufferedOutput = null;
        return f1;
    }

    protected OutputStream getBodyInternal(f f1)
    {
        return bufferedOutput;
    }

    public i getMethod()
    {
        return i.valueOf(connection.getRequestMethod());
    }

    public URI getURI()
    {
        URI uri;
        try
        {
            uri = connection.getURL().toURI();
        }
        catch (URISyntaxException urisyntaxexception)
        {
            throw new IllegalStateException((new StringBuilder("Could not get HttpURLConnection URI: ")).append(urisyntaxexception.getMessage()).toString(), urisyntaxexception);
        }
        return uri;
    }

    public (HttpURLConnection httpurlconnection)
    {
        this$0 = LoggingClientHttpRequestFactory.this;
        super();
        bufferedOutput = new ByteArrayOutputStream();
        connection = httpurlconnection;
    }
}
