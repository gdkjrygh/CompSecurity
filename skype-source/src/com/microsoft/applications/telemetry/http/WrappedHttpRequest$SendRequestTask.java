// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.applications.telemetry.http;

import android.util.Log;
import java.io.IOException;
import java.net.URI;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.message.BasicHttpEntityEnclosingRequest;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.util.EntityUtils;

// Referenced classes of package com.microsoft.applications.telemetry.http:
//            WrappedHttpRequest

private class request
    implements Runnable
{

    private long contentLength;
    private byte data[];
    private String headerNames[];
    private String headerValues[];
    private Header headers[];
    final BasicHttpEntityEnclosingRequest request;
    private HttpResponse response;
    private int statusCode;
    final WrappedHttpRequest this$0;

    public void run()
    {
        HttpHost httphost;
        WrappedHttpRequest.access$000();
        response = null;
        WrappedHttpRequest.access$102(WrappedHttpRequest.this, new BasicHttpContext());
        String s;
        int i;
        int k;
        if (WrappedHttpRequest.access$200(WrappedHttpRequest.this).getScheme() == null)
        {
            s = "http";
        } else
        {
            s = WrappedHttpRequest.access$200(WrappedHttpRequest.this).getScheme();
        }
        k = WrappedHttpRequest.access$200(WrappedHttpRequest.this).getPort();
        i = k;
        if (k < 0)
        {
            i = WrappedHttpRequest.access$300(WrappedHttpRequest.this).getConnectionManager().getSchemeRegistry().getScheme(s).getDefaultPort();
        }
        httphost = new HttpHost(WrappedHttpRequest.access$200(WrappedHttpRequest.this).getHost(), i, WrappedHttpRequest.access$200(WrappedHttpRequest.this).getScheme());
        WrappedHttpRequest.access$000();
        String.format("Send url:%s|port:%d|scheme:%s", new Object[] {
            WrappedHttpRequest.access$200(WrappedHttpRequest.this).toASCIIString(), Integer.valueOf(i), s
        });
        if (!Thread.interrupted()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        UnsatisfiedLinkError unsatisfiedlinkerror;
        try
        {
            response = WrappedHttpRequest.access$300(WrappedHttpRequest.this).execute(httphost, request, WrappedHttpRequest.access$100(WrappedHttpRequest.this));
        }
        catch (ClientProtocolException clientprotocolexception)
        {
            Log.e(WrappedHttpRequest.access$000(), (new StringBuilder("Exception while sending http request ")).append(clientprotocolexception.getMessage()).toString());
        }
        catch (IOException ioexception)
        {
            Log.e(WrappedHttpRequest.access$000(), (new StringBuilder("Exception while sending http request ")).append(ioexception.getMessage()).toString());
        }
        if (Thread.interrupted())
        {
            continue; /* Loop/switch isn't completed */
        }
        WrappedHttpRequest.access$000();
        if (response != null)
        {
            break; /* Loop/switch isn't completed */
        }
        Log.e(WrappedHttpRequest.access$000(), String.format("Could not connect to url: %s", new Object[] {
            WrappedHttpRequest.access$200(WrappedHttpRequest.this).toASCIIString()
        }));
_L4:
        if (!Thread.interrupted())
        {
            try
            {
                WrappedHttpRequest.access$000();
                String.format("Native response callback with mCallback:0x%x|contentLength:%d|statusCode:%d", new Object[] {
                    Long.valueOf(WrappedHttpRequest.access$400(WrappedHttpRequest.this)), Long.valueOf(contentLength), Integer.valueOf(statusCode)
                });
                WrappedHttpRequest.access$500(WrappedHttpRequest.this, WrappedHttpRequest.access$400(WrappedHttpRequest.this), contentLength, statusCode, data, headerNames, headerValues);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (UnsatisfiedLinkError unsatisfiedlinkerror)
            {
                Log.e(WrappedHttpRequest.access$000(), (new StringBuilder("Could not locate native method: ")).append(unsatisfiedlinkerror.getMessage()).toString());
            }
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        Object obj;
        obj = response.getStatusLine();
        headers = response.getAllHeaders();
        headerNames = new String[headers.length];
        headerValues = new String[headers.length];
        for (int j = 0; j < headers.length; j++)
        {
            headerNames[j] = headers[j].getName();
            headerValues[j] = headers[j].getValue();
        }

        statusCode = response.getStatusLine().getStatusCode();
        WrappedHttpRequest.access$000();
        String.format("status:%d|reason:%s", new Object[] {
            Integer.valueOf(statusCode), ((StatusLine) (obj)).getReasonPhrase()
        });
        obj = response.getEntity();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_642;
        }
        data = EntityUtils.toByteArray(((HttpEntity) (obj)));
        contentLength = data.length;
        WrappedHttpRequest.access$000();
        String.format("ResponseEntity|contentLength:%d|data length:%d", new Object[] {
            Long.valueOf(((HttpEntity) (obj)).getContentLength()), Integer.valueOf(data.length)
        });
        if (obj != null)
        {
            try
            {
                ((HttpEntity) (obj)).consumeContent();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                Log.w(WrappedHttpRequest.access$000(), "Failed closing response input stream");
            }
        }
          goto _L4
        Object obj1;
        obj1;
        Log.e(WrappedHttpRequest.access$000(), String.format("Error reading content from response|contentLength:%d|statusCode:%d", new Object[] {
            Long.valueOf(((HttpEntity) (obj)).getContentLength()), Integer.valueOf(statusCode)
        }));
        if (obj != null)
        {
            try
            {
                ((HttpEntity) (obj)).consumeContent();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                Log.w(WrappedHttpRequest.access$000(), "Failed closing response input stream");
            }
        }
          goto _L4
        obj1;
        if (obj != null)
        {
            try
            {
                ((HttpEntity) (obj)).consumeContent();
            }
            catch (IOException ioexception1)
            {
                Log.w(WrappedHttpRequest.access$000(), "Failed closing response input stream");
            }
        }
        throw obj1;
    }

    public (BasicHttpEntityEnclosingRequest basichttpentityenclosingrequest)
    {
        this$0 = WrappedHttpRequest.this;
        super();
        headers = null;
        headerNames = null;
        headerValues = null;
        data = null;
        contentLength = 0L;
        statusCode = statusCode.ue();
        request = basichttpentityenclosingrequest;
    }
}
