// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.systrace.http;

import com.facebook.http.observer.AbstractFbHttpFlowObserver;
import com.facebook.http.observer.HttpFlowStatistics;
import com.facebook.http.observer.Stage;
import com.facebook.inject.InjectorLike;
import com.facebook.systrace.Systrace;
import java.io.IOException;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.RequestLine;
import org.apache.http.StatusLine;
import org.apache.http.protocol.HttpContext;

public class SystraceHttpFlowObserver extends AbstractFbHttpFlowObserver
{

    public SystraceHttpFlowObserver()
    {
    }

    public static SystraceHttpFlowObserver a(InjectorLike injectorlike)
    {
        return e();
    }

    private static SystraceHttpFlowObserver e()
    {
        return new SystraceHttpFlowObserver();
    }

    public final void a(Stage stage, HttpRequest httprequest, HttpResponse httpresponse, HttpContext httpcontext, IOException ioexception)
    {
        super.a(stage, httprequest, httpresponse, httpcontext, ioexception);
        httpcontext = httprequest.getRequestLine().getUri();
        int i = httprequest.hashCode();
        if (httpresponse != null)
        {
            int j = httpresponse.getStatusLine().getStatusCode();
            stage = (new StringBuilder()).append(httpcontext).append("(FAILED: ").append(j).append(")").toString();
        } else
        {
            stage = (new StringBuilder()).append(httpcontext).append("(FAILED)").toString();
        }
        Systrace.c(16L, httpcontext, i);
        Systrace.b(16L, httpcontext, stage, i);
    }

    public final void a(HttpRequest httprequest, HttpContext httpcontext, HttpFlowStatistics httpflowstatistics)
    {
        super.a(httprequest, httpcontext, httpflowstatistics);
        httpcontext = httprequest.getRequestLine().getUri();
        int i = httprequest.hashCode();
        Systrace.b(16L, httpcontext, i);
        Systrace.a(16L, httpcontext, i, "Latency");
    }

    public final void a(HttpResponse httpresponse, HttpContext httpcontext)
    {
        super.a(httpresponse, httpcontext);
        Systrace.a(16L, b().getRequestLine().getUri(), b().hashCode(), "Download");
    }

    public final void b(HttpResponse httpresponse, HttpContext httpcontext)
    {
        super.b(httpresponse, httpcontext);
        Systrace.c(16L, b().getRequestLine().getUri(), b().hashCode());
    }
}
