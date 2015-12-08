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
//            ez, ep, ey, ev, 
//            am, ew

public class fb extends ez
{

    public fb(ey ey1, boolean flag)
    {
        super(ey1, flag);
    }

    protected WebResourceResponse c(Context context, String s, String s1)
        throws IOException
    {
        s1 = (HttpURLConnection)(new URL(s1)).openConnection();
        ep.a(context, s, true, s1);
        s1.connect();
        context = new WebResourceResponse("application/javascript", "UTF-8", new ByteArrayInputStream(ep.a(new InputStreamReader(s1.getInputStream())).getBytes("UTF-8")));
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
            if (!(webview instanceof ey))
            {
                ev.D("Tried to intercept request from a WebView that wasn't an AdWebView.");
                return super.shouldInterceptRequest(webview, s);
            }
            obj = (ey)webview;
            ((ey) (obj)).bW().aN();
            if (((ey) (obj)).Q().md)
            {
                ev.C("shouldInterceptRequest(http://media.admob.com/mraid/v1/mraid_app_interstitial.js)");
                return c(((ey) (obj)).getContext(), lL.bY().st, "http://media.admob.com/mraid/v1/mraid_app_interstitial.js");
            }
            if (((ey) (obj)).bZ())
            {
                ev.C("shouldInterceptRequest(http://media.admob.com/mraid/v1/mraid_app_expanded_banner.js)");
                return c(((ey) (obj)).getContext(), lL.bY().st, "http://media.admob.com/mraid/v1/mraid_app_expanded_banner.js");
            }
            ev.C("shouldInterceptRequest(http://media.admob.com/mraid/v1/mraid_app_banner.js)");
            obj = c(((ey) (obj)).getContext(), lL.bY().st, "http://media.admob.com/mraid/v1/mraid_app_banner.js");
        }
        catch (IOException ioexception)
        {
            ev.D((new StringBuilder()).append("Could not fetching MRAID JS. ").append(ioexception.getMessage()).toString());
            return super.shouldInterceptRequest(webview, s);
        }
        return ((WebResourceResponse) (obj));
    }
}
