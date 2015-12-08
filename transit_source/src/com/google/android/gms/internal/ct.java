// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

// Referenced classes of package com.google.android.gms.internal:
//            cr, ci, cq, cn, 
//            x, co

public final class ct extends cr
{

    public ct(cq cq1, boolean flag)
    {
        super(cq1, flag);
    }

    private static WebResourceResponse b(Context context, String s, String s1)
        throws IOException
    {
        s1 = (HttpURLConnection)(new URL(s1)).openConnection();
        ci.a(context, s, true, s1);
        s1.connect();
        context = new WebResourceResponse("application/javascript", "UTF-8", new ByteArrayInputStream(ci.a(new InputStreamReader(s1.getInputStream())).getBytes("UTF-8")));
        s1.disconnect();
        return context;
        context;
        s1.disconnect();
        throw context;
    }

    public WebResourceResponse shouldInterceptRequest(WebView webview, String s)
    {
        Object obj;
        try
        {
            if (!"mraid.js".equalsIgnoreCase((new File(s)).getName()))
            {
                return super.shouldInterceptRequest(webview, s);
            }
            if (!(webview instanceof cq))
            {
                cn.q("Tried to intercept request from a WebView that wasn't an AdWebView.");
                return super.shouldInterceptRequest(webview, s);
            }
            obj = (cq)webview;
            ((cq) (obj)).aw().S();
            if (((cq) (obj)).av().ex)
            {
                cn.p("shouldInterceptRequest(http://media.admob.com/mraid/v1/mraid_app_interstitial.js)");
                return b(((cq) (obj)).getContext(), fG.ay().hP, "http://media.admob.com/mraid/v1/mraid_app_interstitial.js");
            }
            if (((cq) (obj)).az())
            {
                cn.p("shouldInterceptRequest(http://media.admob.com/mraid/v1/mraid_app_expanded_banner.js)");
                return b(((cq) (obj)).getContext(), fG.ay().hP, "http://media.admob.com/mraid/v1/mraid_app_expanded_banner.js");
            }
            cn.p("shouldInterceptRequest(http://media.admob.com/mraid/v1/mraid_app_banner.js)");
            obj = b(((cq) (obj)).getContext(), fG.ay().hP, "http://media.admob.com/mraid/v1/mraid_app_banner.js");
        }
        catch (IOException ioexception)
        {
            cn.q((new StringBuilder()).append("Could not fetching MRAID JS. ").append(ioexception.getMessage()).toString());
            return super.shouldInterceptRequest(webview, s);
        }
        return ((WebResourceResponse) (obj));
    }
}
