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
//            eo, ea, em, ek, 
//            ab, db

public final class fd extends eo
{

    public fd(em em1, boolean flag)
    {
        super(em1, flag);
    }

    private static WebResourceResponse a(Context context, String s, String s1)
    {
        s1 = (HttpURLConnection)(new URL(s1)).openConnection();
        ea.a(context, s, true, s1);
        s1.connect();
        context = new WebResourceResponse("application/javascript", "UTF-8", new ByteArrayInputStream(ea.a(new InputStreamReader(s1.getInputStream())).getBytes("UTF-8")));
        s1.disconnect();
        return context;
        context;
        s1.disconnect();
        throw context;
    }

    public final WebResourceResponse shouldInterceptRequest(WebView webview, String s)
    {
        Object obj;
        try
        {
            if (!"mraid.js".equalsIgnoreCase((new File(s)).getName()))
            {
                return super.shouldInterceptRequest(webview, s);
            }
            if (!(webview instanceof em))
            {
                ek.d("Tried to intercept request from a WebView that wasn't an AdWebView.");
                return super.shouldInterceptRequest(webview, s);
            }
            obj = (em)webview;
            ((em) (obj)).e().d();
            if (((em) (obj)).d().f)
            {
                ek.c("shouldInterceptRequest(http://media.admob.com/mraid/v1/mraid_app_interstitial.js)");
                return a(((em) (obj)).getContext(), a.g().c, "http://media.admob.com/mraid/v1/mraid_app_interstitial.js");
            }
            if (((em) (obj)).h())
            {
                ek.c("shouldInterceptRequest(http://media.admob.com/mraid/v1/mraid_app_expanded_banner.js)");
                return a(((em) (obj)).getContext(), a.g().c, "http://media.admob.com/mraid/v1/mraid_app_expanded_banner.js");
            }
            ek.c("shouldInterceptRequest(http://media.admob.com/mraid/v1/mraid_app_banner.js)");
            obj = a(((em) (obj)).getContext(), a.g().c, "http://media.admob.com/mraid/v1/mraid_app_banner.js");
        }
        catch (IOException ioexception)
        {
            ek.d((new StringBuilder("Could not fetching MRAID JS. ")).append(ioexception.getMessage()).toString());
            return super.shouldInterceptRequest(webview, s);
        }
        return ((WebResourceResponse) (obj));
    }
}
