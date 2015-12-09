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
//            ea, dq, dz, dw, 
//            ak, dx

public class ec extends ea
{

    public ec(dz dz1, boolean flag)
    {
        super(dz1, flag);
    }

    protected WebResourceResponse d(Context context, String s, String s1)
        throws IOException
    {
        s1 = (HttpURLConnection)(new URL(s1)).openConnection();
        dq.a(context, s, true, s1);
        s1.connect();
        context = new WebResourceResponse("application/javascript", "UTF-8", new ByteArrayInputStream(dq.a(new InputStreamReader(s1.getInputStream())).getBytes("UTF-8")));
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
            if (!(webview instanceof dz))
            {
                dw.z("Tried to intercept request from a WebView that wasn't an AdWebView.");
                return super.shouldInterceptRequest(webview, s);
            }
            obj = (dz)webview;
            ((dz) (obj)).bI().aM();
            if (((dz) (obj)).R().lT)
            {
                dw.y("shouldInterceptRequest(http://media.admob.com/mraid/v1/mraid_app_interstitial.js)");
                return d(((dz) (obj)).getContext(), lC.bK().rq, "http://media.admob.com/mraid/v1/mraid_app_interstitial.js");
            }
            if (((dz) (obj)).bL())
            {
                dw.y("shouldInterceptRequest(http://media.admob.com/mraid/v1/mraid_app_expanded_banner.js)");
                return d(((dz) (obj)).getContext(), lC.bK().rq, "http://media.admob.com/mraid/v1/mraid_app_expanded_banner.js");
            }
            dw.y("shouldInterceptRequest(http://media.admob.com/mraid/v1/mraid_app_banner.js)");
            obj = d(((dz) (obj)).getContext(), lC.bK().rq, "http://media.admob.com/mraid/v1/mraid_app_banner.js");
        }
        catch (IOException ioexception)
        {
            dw.z((new StringBuilder()).append("Could not fetching MRAID JS. ").append(ioexception.getMessage()).toString());
            return super.shouldInterceptRequest(webview, s);
        }
        return ((WebResourceResponse) (obj));
    }
}
