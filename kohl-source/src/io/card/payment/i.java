// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.card.payment;

import android.os.SystemClock;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.HashSet;
import javax.net.ssl.SSLHandshakeException;
import org.apache.http.NoHttpResponseException;
import org.apache.http.client.HttpRequestRetryHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.protocol.HttpContext;

final class i
    implements HttpRequestRetryHandler
{

    private static HashSet a;
    private static HashSet b;
    private final int c = 2;

    public i(int j)
    {
    }

    public final boolean retryRequest(IOException ioexception, int j, HttpContext httpcontext)
    {
        boolean flag;
        boolean flag1;
        boolean flag2;
        flag2 = true;
        Boolean boolean1 = (Boolean)httpcontext.getAttribute("http.request_sent");
        if (boolean1 != null && boolean1.booleanValue())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (j > c || b.contains(ioexception.getClass())) goto _L2; else goto _L1
_L1:
        if (!a.contains(ioexception.getClass())) goto _L4; else goto _L3
_L3:
        flag1 = flag2;
_L6:
        if (flag1)
        {
            SystemClock.sleep(1500L);
            return flag1;
        } else
        {
            ioexception.printStackTrace();
            return flag1;
        }
_L4:
        flag1 = flag2;
        if (!flag) goto _L6; else goto _L5
_L5:
        flag1 = flag2;
        if (!((HttpUriRequest)httpcontext.getAttribute("http.request")).getMethod().equals("POST")) goto _L6; else goto _L2
_L2:
        flag1 = false;
          goto _L6
    }

    static 
    {
        a = new HashSet();
        b = new HashSet();
        a.add(org/apache/http/NoHttpResponseException);
        a.add(java/net/UnknownHostException);
        a.add(java/net/SocketException);
        b.add(java/io/InterruptedIOException);
        b.add(javax/net/ssl/SSLHandshakeException);
    }
}
