// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.analytics;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.facebook.analytics.g.e;
import com.facebook.common.w.n;
import com.facebook.http.b.ar;
import com.facebook.http.b.av;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import java.io.IOException;
import java.net.URI;
import java.util.Iterator;
import java.util.List;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.RequestLine;
import org.apache.http.protocol.HttpContext;

// Referenced classes of package com.facebook.analytics:
//            cb, av

public class au
    implements com.facebook.http.b.au
{

    private final com.facebook.analytics.av a;
    private final ar b;
    private final ConnectivityManager c;
    private final e d;

    public au(com.facebook.analytics.av av1, ar ar1, ConnectivityManager connectivitymanager, e e)
    {
        a = av1;
        b = ar1;
        c = connectivitymanager;
        d = e;
    }

    private void a(cb cb1, String s, StringBuilder stringbuilder)
    {
        cb1 = cb1.i(s);
        if (!n.a(cb1))
        {
            stringbuilder.append('_').append(cb1);
        }
    }

    public void a(av av1, IOException ioexception, HttpRequest httprequest, HttpContext httpcontext)
    {
        cb cb1;
        cb1 = new cb("http_error");
        cb1.b("stage", av1.toString());
        if (ioexception != null)
        {
            av1 = ioexception.getClass().getSimpleName();
        } else
        {
            av1 = "none";
        }
        cb1.b("error", av1);
        av1 = c.getActiveNetworkInfo();
        if (av1 != null)
        {
            cb1.b("network", av1.getTypeName());
            cb1.b("network_state", av1.getDetailedState().toString());
        } else
        {
            cb1.b("network", "none");
        }
        av1 = b.b(httprequest, httpcontext);
        cb1.b("uri", av1.toString());
        ioexception = (String)httpcontext.getAttribute("fb_http_data_category");
        if (ioexception != null)
        {
            cb1.b("category", ioexception);
        }
        if (httprequest == null)
        {
            httprequest = (HttpRequest)httpcontext.getAttribute("http.request");
        }
        if (httprequest != null)
        {
            cb1.b("method", httprequest.getRequestLine().getMethod());
        }
        ioexception = (HttpHost)httpcontext.getAttribute("http.proxy_host");
        if (ioexception == null) goto _L2; else goto _L1
_L1:
        cb1.b("proxy", ioexception.toString());
_L4:
        ioexception = new StringBuilder();
        ioexception.append(av1.getScheme()).append('_').append(av1.getHost());
        a(cb1, "stage", ((StringBuilder) (ioexception)));
        a(cb1, "error", ((StringBuilder) (ioexception)));
        a(cb1, "network", ((StringBuilder) (ioexception)));
        a(cb1, "network_state", ((StringBuilder) (ioexception)));
        a(cb1, "category", ((StringBuilder) (ioexception)));
        a(cb1, "method", ((StringBuilder) (ioexception)));
        a(cb1, "proxy", ((StringBuilder) (ioexception)));
        cb1.a("throttle_key", ioexception.toString());
        cb1.a("throttle_duration", String.valueOf(0x36ee80L));
        a.a(cb1, d);
        return;
_L2:
        ioexception = (List)httpcontext.getAttribute("fb_http_retried_exceptions");
        if (ioexception != null)
        {
            httprequest = new ArrayNode(JsonNodeFactory.instance);
            for (httpcontext = ioexception.iterator(); httpcontext.hasNext(); httprequest.add((String)httpcontext.next())) { }
            cb1.a("retried_exceptions", httprequest);
            cb1.a("retry_count", ioexception.size());
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}
