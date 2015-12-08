// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.applications.telemetry.http;

import org.apache.http.client.HttpClient;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.params.BasicHttpParams;

// Referenced classes of package com.microsoft.applications.telemetry.http:
//            ConnectionConfig, WrappedHttpRequest

public class HttpStack
{

    private static final String LOG_TAG = com/microsoft/applications/telemetry/http/HttpStack.getSimpleName();
    protected final ConnectionConfig connConfig;
    protected final HttpClient httpClient;

    public HttpStack()
    {
        this(null);
    }

    public HttpStack(ConnectionConfig connectionconfig)
    {
        ConnectionConfig connectionconfig1 = connectionconfig;
        if (connectionconfig == null)
        {
            connectionconfig1 = new ConnectionConfig(30000, 60000, 0);
        }
        connConfig = connectionconfig1;
        String.format("Constructing HttpStack with connection config: connTimeout:%d|reqTimeout:%d|maxRedirects:%d", new Object[] {
            Integer.valueOf(connConfig.connectionTimeout), Integer.valueOf(connConfig.requestTimeout), Integer.valueOf(connConfig.maxRedirects)
        });
        httpClient = GetHttpClientFromConfig(connConfig);
    }

    protected static final HttpClient GetHttpClientFromConfig(ConnectionConfig connectionconfig)
    {
        BasicHttpParams basichttpparams = new BasicHttpParams();
        basichttpparams.setParameter("http.connection.timeout", Integer.valueOf(connectionconfig.connectionTimeout));
        basichttpparams.setParameter("http.socket.timeout", Integer.valueOf(connectionconfig.requestTimeout));
        basichttpparams.setParameter("http.protocol.max-redirects", Integer.valueOf(connectionconfig.maxRedirects));
        connectionconfig = new SchemeRegistry();
        connectionconfig.register(new Scheme("http", PlainSocketFactory.getSocketFactory(), 80));
        connectionconfig.register(new Scheme("https", SSLSocketFactory.getSocketFactory(), 443));
        return new DefaultHttpClient(new ThreadSafeClientConnManager(basichttpparams, connectionconfig), basichttpparams);
    }

    protected final WrappedHttpRequest createHttpRequest(long l)
    {
        return new WrappedHttpRequest(this, l);
    }

    public void finalize()
        throws Throwable
    {
        httpClient.getConnectionManager().shutdown();
        super.finalize();
    }

}
