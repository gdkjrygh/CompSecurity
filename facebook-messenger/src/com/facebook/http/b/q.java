// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.http.b;

import java.util.Iterator;
import java.util.Set;
import org.apache.http.ConnectionReuseStrategy;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.protocol.BasicHttpProcessor;
import org.apache.http.protocol.HttpContext;

// Referenced classes of package com.facebook.http.b:
//            k, o, r, a, 
//            t

class q extends DefaultHttpClient
{

    final Set a;
    final o b;

    q(o o1, ClientConnectionManager clientconnectionmanager, HttpParams httpparams, Set set)
    {
        b = o1;
        a = set;
        super(clientconnectionmanager, httpparams);
    }

    protected ConnectionReuseStrategy createConnectionReuseStrategy()
    {
        return new k();
    }

    protected HttpContext createHttpContext()
    {
        BasicHttpContext basichttpcontext = new BasicHttpContext();
        basichttpcontext.setAttribute("http.authscheme-registry", getAuthSchemes());
        basichttpcontext.setAttribute("http.cookiespec-registry", getCookieSpecs());
        basichttpcontext.setAttribute("http.auth.credentials-provider", getCredentialsProvider());
        basichttpcontext.setAttribute("http.cookie-store", o.a(b));
        return basichttpcontext;
    }

    protected BasicHttpProcessor createHttpProcessor()
    {
        BasicHttpProcessor basichttpprocessor = super.createHttpProcessor();
        basichttpprocessor.addRequestInterceptor(o.b());
        basichttpprocessor.addRequestInterceptor(new r(b, null));
        basichttpprocessor.addRequestInterceptor(com.facebook.http.b.a.a());
        basichttpprocessor.addResponseInterceptor(com.facebook.http.b.a.b());
        for (Iterator iterator = a.iterator(); iterator.hasNext(); ((t)iterator.next()).a(basichttpprocessor, basichttpprocessor)) { }
        return basichttpprocessor;
    }
}
