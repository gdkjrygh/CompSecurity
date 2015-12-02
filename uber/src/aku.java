// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public final class aku extends akl
{

    public aku(akk akk1, boolean flag)
    {
        super(akk1, flag);
    }

    private static WebResourceResponse a(Context context, String s, String s1)
    {
        s1 = (HttpURLConnection)(new URL(s1)).openConnection();
        ot.e().a(context, s, true, s1, true);
        s1.addRequestProperty("Cache-Control", "max-stale=3600");
        ot.e();
        context = new WebResourceResponse("application/javascript", "UTF-8", new ByteArrayInputStream(ajc.a(new InputStreamReader(s1.getInputStream())).getBytes("UTF-8")));
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
            if (!(webview instanceof akk))
            {
                of.e("Tried to intercept request from a WebView that wasn't an AdWebView.");
                return super.shouldInterceptRequest(webview, s);
            }
            akk akk1 = (akk)webview;
            akk1.i().f();
            if (akk1.h().e)
            {
                s1 = (String)abn.v.c();
            } else
            {
                if (!akk1.m())
                {
                    break label0;
                }
                s1 = (String)abn.u.c();
            }
        }
_L1:
        of.d((new StringBuilder("shouldInterceptRequest(")).append(s1).append(")").toString());
        return a(akk1.getContext(), a.l().b, s1);
        try
        {
            s1 = (String)abn.t.c();
        }
        catch (IOException ioexception)
        {
            of.e((new StringBuilder("Could not fetch MRAID JS. ")).append(ioexception.getMessage()).toString());
            return super.shouldInterceptRequest(webview, s);
        }
          goto _L1
    }
}
