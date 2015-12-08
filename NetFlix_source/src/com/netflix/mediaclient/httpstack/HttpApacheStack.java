// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.httpstack;

import com.netflix.mediaclient.Log;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import org.apache.http.HttpResponse;
import org.apache.http.HttpVersion;
import org.apache.http.client.CookieStore;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpParams;

// Referenced classes of package com.netflix.mediaclient.httpstack:
//            HttpStack, HttpApacheStackConnection, HttpStackConnection

public class HttpApacheStack
    implements HttpStack
{

    private static final String TAG = "HttpApacheStack";

    public HttpApacheStack()
    {
    }

    public void disconnect(HttpStackConnection httpstackconnection)
    {
        if (!(httpstackconnection instanceof HttpApacheStackConnection))
        {
            Log.e("HttpApacheStack", "wrong HttpStackConnection object?");
        } else
        {
            httpstackconnection = ((HttpApacheStackConnection)httpstackconnection).getDefaultHttpClient();
            if (httpstackconnection != null)
            {
                httpstackconnection.getConnectionManager().shutdown();
                return;
            }
        }
    }

    public HttpStackConnection getConnection(String s)
        throws IOException
    {
        BasicHttpParams basichttpparams = new BasicHttpParams();
        basichttpparams.setParameter("http.protocol.version", HttpVersion.HTTP_1_1);
        basichttpparams.setParameter("http.connection.timeout", Integer.valueOf(15000));
        basichttpparams.setParameter("http.socket.timeout", Integer.valueOf(10000));
        return new HttpApacheStackConnection(basichttpparams, s);
    }

    public List getResponseCookies(HttpStackConnection httpstackconnection)
    {
        if (!(httpstackconnection instanceof HttpApacheStackConnection))
        {
            Log.e("HttpApacheStack", "wrong HttpStackConnection object?");
            return null;
        } else
        {
            return ((HttpApacheStackConnection)httpstackconnection).getDefaultHttpClient().getCookieStore().getCookies();
        }
    }

    public HttpResponse performGet(HttpStackConnection httpstackconnection)
        throws IOException
    {
        if (!(httpstackconnection instanceof HttpApacheStackConnection))
        {
            throw new IOException("defaultConnection null - wrong HttpStackConnection object?");
        }
        HttpApacheStackConnection httpapachestackconnection = (HttpApacheStackConnection)httpstackconnection;
        DefaultHttpClient defaulthttpclient = new DefaultHttpClient(httpapachestackconnection.getHttpParams());
        httpapachestackconnection.setDefaultHttpClient(defaulthttpclient);
        try
        {
            httpstackconnection = new URI(((HttpApacheStackConnection)httpstackconnection).getUriString());
        }
        // Misplaced declaration of an exception variable
        catch (HttpStackConnection httpstackconnection)
        {
            Log.e("HttpApacheStack", "Error in building uri");
            return null;
        }
        return defaulthttpclient.execute(new HttpGet(httpstackconnection), httpapachestackconnection.getLocalHttpContext());
    }
}
