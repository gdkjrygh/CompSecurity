// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.http.b;

import android.os.Looper;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.protocol.HttpContext;

final class p
    implements HttpRequestInterceptor
{

    p()
    {
    }

    public void process(HttpRequest httprequest, HttpContext httpcontext)
    {
        if (Looper.myLooper() != null && Looper.myLooper() == Looper.getMainLooper())
        {
            throw new RuntimeException("This thread forbids HTTP requests");
        } else
        {
            return;
        }
    }
}
