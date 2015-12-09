// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ibm.eo.http;

import org.apache.http.HttpVersion;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpParams;

// Referenced classes of package com.ibm.eo.http:
//            TLHttpRequestInterceptor, TLHttpResponseInterceptor

public class TLDefaultHttpClient extends DefaultHttpClient
{

    public TLDefaultHttpClient()
    {
        init(null, Boolean.valueOf(false));
    }

    public TLDefaultHttpClient(ClientConnectionManager clientconnectionmanager, HttpParams httpparams)
    {
        super(clientconnectionmanager, httpparams);
        init(null, Boolean.valueOf(false));
    }

    public TLDefaultHttpClient(HttpParams httpparams)
    {
        super(httpparams);
        init(null, Boolean.valueOf(false));
    }

    public TLDefaultHttpClient(HttpParams httpparams, String s, Boolean boolean1)
    {
        super(httpparams);
        init(s, boolean1);
    }

    private void init(String s, Boolean boolean1)
    {
        s = new TLHttpRequestInterceptor(s, boolean1);
        addRequestInterceptor(s);
        addResponseInterceptor(new TLHttpResponseInterceptor(s));
        if (getParams() == null)
        {
            setParams(new BasicHttpParams());
        }
        getParams().setParameter("http.protocol.version", HttpVersion.HTTP_1_1);
    }
}
