// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.http;

import com.jcp.JCP;
import com.jcp.util.ae;
import com.squareup.okhttp.Interceptor;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import java.util.List;

public class d
    implements Interceptor
{

    private static final String a = com/jcp/http/d.getName();

    public d()
    {
    }

    private void a(Request request)
    {
        try
        {
            ae.d(a, (new StringBuilder()).append("Sending request: ").append(request.urlString()).toString());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Request request)
        {
            ae.a(a, "Exception logging request", request);
        }
    }

    private void a(Response response, Request request, long l)
    {
        try
        {
            ae.d(a, (new StringBuilder()).append("Response received for: ").append(request.urlString()).toString());
            ae.d(a, (new StringBuilder()).append("Response timing: ").append(l).append("ms").toString());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Response response)
        {
            ae.a(a, "Exception logging response", response);
        }
    }

    public Response intercept(com.squareup.okhttp.Interceptor.Chain chain)
    {
        Object obj = new StringBuilder("JCPenney-Android/");
        ((StringBuilder) (obj)).append(JCP.p());
        ((StringBuilder) (obj)).append("/");
        ((StringBuilder) (obj)).append(android.os.Build.VERSION.RELEASE);
        Request request = chain.request();
        List list = request.headers("User-Agent");
        if (list != null && !list.isEmpty())
        {
            ((StringBuilder) (obj)).append(";");
            ((StringBuilder) (obj)).append((String)list.get(0));
        }
        ((StringBuilder) (obj)).append(JCP.l());
        obj = request.newBuilder().removeHeader("User-Agent").addHeader("User-Agent", ((StringBuilder) (obj)).toString()).build();
        a(((Request) (obj)));
        long l = System.currentTimeMillis();
        chain = chain.proceed(((Request) (obj)));
        a(chain, ((Request) (obj)), System.currentTimeMillis() - l);
        return chain;
    }

}
