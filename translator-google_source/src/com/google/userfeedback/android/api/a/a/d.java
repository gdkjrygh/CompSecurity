// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.userfeedback.android.api.a.a;

import android.util.Log;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.protocol.HttpContext;

// Referenced classes of package com.google.userfeedback.android.api.a.a:
//            a, e

final class d
    implements HttpRequestInterceptor
{

    final a a;

    d(a a1)
    {
        a = a1;
        super();
    }

    public final void process(HttpRequest httprequest, HttpContext httpcontext)
    {
        httpcontext = com.google.userfeedback.android.api.a.a.a.a(a);
        if (httpcontext != null && Log.isLoggable(((e) (httpcontext)).a, ((e) (httpcontext)).b) && (httprequest instanceof HttpUriRequest))
        {
            com.google.userfeedback.android.api.a.a.a.a((HttpUriRequest)httprequest);
        }
    }
}
