// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.http.b;

import com.facebook.http.annotations.UserAgentString;
import com.facebook.http.c.e;
import com.facebook.inject.d;
import org.apache.http.client.params.HttpClientParams;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.apache.http.params.HttpProtocolParams;

// Referenced classes of package com.facebook.http.b:
//            w, x

class aj extends d
{

    final w a;

    private aj(w w)
    {
        a = w;
        super();
    }

    aj(w w, x x)
    {
        this(w);
    }

    public HttpParams a()
    {
        BasicHttpParams basichttpparams = new BasicHttpParams();
        HttpConnectionParams.setStaleCheckingEnabled(basichttpparams, false);
        HttpConnectionParams.setConnectionTimeout(basichttpparams, 60000);
        HttpConnectionParams.setSoTimeout(basichttpparams, 60000);
        HttpConnectionParams.setSocketBufferSize(basichttpparams, 8192);
        HttpClientParams.setRedirecting(basichttpparams, false);
        HttpProtocolParams.setUserAgent(basichttpparams, (String)a(java/lang/String, com/facebook/http/annotations/UserAgentString));
        org.apache.http.HttpHost httphost = ((e)a(com/facebook/http/c/e)).a();
        if (httphost != null)
        {
            basichttpparams.setParameter("http.route.default-proxy", httphost);
        }
        return basichttpparams;
    }

    public Object b()
    {
        return a();
    }
}
