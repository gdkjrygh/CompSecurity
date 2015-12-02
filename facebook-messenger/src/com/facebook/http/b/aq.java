// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.http.b;

import com.facebook.debug.log.b;
import com.facebook.f.n;
import com.facebook.prefs.shared.ae;
import com.facebook.prefs.shared.d;
import com.google.common.a.hq;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ConnectException;
import java.net.UnknownHostException;
import java.util.List;
import javax.net.ssl.SSLHandshakeException;
import org.apache.http.NoHttpResponseException;
import org.apache.http.client.HttpRequestRetryHandler;
import org.apache.http.protocol.HttpContext;

public class aq
    implements HttpRequestRetryHandler
{

    private static final Class a = com/facebook/http/b/aq;
    private static final ae b = n.a("fbandroid_http_aggressive_retry");
    private final d c;

    public aq(d d1)
    {
        c = d1;
    }

    private void a(String s, int i, boolean flag)
    {
        Class class1 = a;
        StringBuilder stringbuilder = (new StringBuilder()).append("[").append(s);
        if (flag)
        {
            s = "] Retrying(";
        } else
        {
            s = "] Not Retrying(";
        }
        com.facebook.debug.log.b.b(class1, stringbuilder.append(s).append(i).append(")").toString());
    }

    private boolean a(IOException ioexception, int i, HttpContext httpcontext)
    {
        boolean flag1 = false;
        if (ioexception == null)
        {
            throw new IllegalArgumentException("Exception parameter may not be null");
        }
        if (httpcontext == null)
        {
            throw new IllegalArgumentException("HTTP context may not be null");
        }
        com.facebook.debug.log.b.a(a, "Exception", ioexception);
        if (i > 3)
        {
            com.facebook.debug.log.b.b(a, "Hit retry limit");
            return false;
        }
        if (ioexception instanceof NoHttpResponseException)
        {
            a("NoHttpResponseException", i, true);
            return true;
        }
        if (ioexception instanceof SSLHandshakeException)
        {
            a("SSLHandshakeException", i, false);
            return false;
        }
        boolean flag = flag1;
        if (c.a())
        {
            flag = flag1;
            if (c.a(b, false))
            {
                flag = true;
            }
        }
        if (ioexception instanceof InterruptedIOException)
        {
            a("InterruptedIOException", i, flag);
            return flag;
        }
        if (ioexception instanceof UnknownHostException)
        {
            a("UnknownHostException", i, flag);
            return flag;
        }
        if (ioexception instanceof ConnectException)
        {
            a("ConnectException", i, flag);
            return flag;
        } else
        {
            a("Default", i, true);
            return true;
        }
    }

    public boolean retryRequest(IOException ioexception, int i, HttpContext httpcontext)
    {
        boolean flag = a(ioexception, i, httpcontext);
        if (flag)
        {
            List list = (List)httpcontext.getAttribute("fb_http_retried_exceptions");
            Object obj = list;
            if (list == null)
            {
                obj = hq.c(3);
                httpcontext.setAttribute("fb_http_retried_exceptions", obj);
            }
            ((List) (obj)).add(ioexception.getClass().getSimpleName());
        }
        return flag;
    }

}
