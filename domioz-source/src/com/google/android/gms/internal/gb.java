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
//            fm, a, es, fl, 
//            fj, zzba, ar, ak, 
//            zzhy

public final class gb extends fm
{

    public gb(fl fl1, boolean flag)
    {
        super(fl1, flag);
    }

    private static WebResourceResponse a(Context context, String s, String s1)
    {
        s1 = (HttpURLConnection)(new URL(s1)).openConnection();
        com.google.android.gms.internal.a.c().a(context, s, s1, true);
        s1.addRequestProperty("Cache-Control", "max-stale=3600");
        s1.connect();
        com.google.android.gms.internal.a.c();
        context = new WebResourceResponse("application/javascript", "UTF-8", new ByteArrayInputStream(es.a(new InputStreamReader(s1.getInputStream())).getBytes("UTF-8")));
        s1.disconnect();
        return context;
        context;
        s1.disconnect();
        throw context;
    }

    public final WebResourceResponse shouldInterceptRequest(WebView webview, String s)
    {
        String s1;
label0:
        {
            if (!"mraid.js".equalsIgnoreCase((new File(s)).getName()))
            {
                return super.shouldInterceptRequest(webview, s);
            }
            if (!(webview instanceof fl))
            {
                fj.e("Tried to intercept request from a WebView that wasn't an AdWebView.");
                return super.shouldInterceptRequest(webview, s);
            }
            fl fl1 = (fl)webview;
            fl1.g().f();
            if (fl1.f().e)
            {
                s1 = (String)ar.n.c();
            } else
            {
                if (!fl1.k())
                {
                    break label0;
                }
                s1 = (String)ar.m.c();
            }
        }
_L1:
        fj.d((new StringBuilder("shouldInterceptRequest(")).append(s1).append(")").toString());
        return a(fl1.getContext(), a.j().b, s1);
        try
        {
            s1 = (String)ar.l.c();
        }
        catch (IOException ioexception)
        {
            fj.e((new StringBuilder("Could not fetch MRAID JS. ")).append(ioexception.getMessage()).toString());
            return super.shouldInterceptRequest(webview, s);
        }
          goto _L1
    }
}
