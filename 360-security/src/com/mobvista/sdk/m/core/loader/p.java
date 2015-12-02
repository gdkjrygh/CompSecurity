// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mobvista.sdk.m.core.loader;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.util.Log;
import android.webkit.SslErrorHandler;
import android.webkit.URLUtil;
import android.webkit.WebView;
import android.webkit.WebViewClient;

// Referenced classes of package com.mobvista.sdk.m.core.loader:
//            n, t

final class p extends WebViewClient
{

    final n a;

    p(n n1)
    {
        a = n1;
        super();
    }

    private boolean a()
    {
        return a.a || a.b;
    }

    public final void onPageStarted(WebView webview, String s, Bitmap bitmap)
    {
        if (n.b(a))
        {
            n.c(a);
            return;
        }
        a.b = false;
        if (webview.getTag() == null)
        {
            webview.setTag("has_first_started");
        } else
        {
            a.a = true;
        }
        bitmap = n.a();
        bitmap;
        JVM INSTR monitorenter ;
        webview = "\u52A0\u8F7D\u9875\u9762-\u5F00\u59CB\uFF1A";
        if (a())
        {
            webview = (new StringBuilder()).append("\u52A0\u8F7D\u9875\u9762-\u5F00\u59CB\uFF1A").append("\uFF08\u91CD\u5B9A\u5411\uFF09").toString();
        }
        if (!URLUtil.isHttpsUrl(s)) goto _L2; else goto _L1
_L1:
        Log.e(n.a(), (new StringBuilder()).append(webview).append(s).toString());
_L3:
        n.a(a, s);
        if (n.d(a) == null || !n.d(a).a(s))
        {
            break MISSING_BLOCK_LABEL_206;
        }
        n.a(a, true);
        n.c(a);
_L4:
        bitmap;
        JVM INSTR monitorexit ;
        return;
        webview;
        bitmap;
        JVM INSTR monitorexit ;
        throw webview;
_L2:
        Log.i(n.a(), (new StringBuilder()).append(webview).append(s).toString());
          goto _L3
        n.e(a);
          goto _L4
    }

    public final void onReceivedError(WebView webview, int i, String s, String s1)
    {
        Log.e(n.a(), (new StringBuilder("onReceivedError: errno = ")).append(i).append(", url: ").append(webview.getUrl()).append(",\n onReceivedError\uFF1A, description: ").append(s).append(", failingUrl: ").append(s1).toString());
        synchronized (n.a())
        {
            n.a(a, true);
            n.i(a);
            n.c(a);
        }
    }

    public final void onReceivedSslError(WebView webview, SslErrorHandler sslerrorhandler, SslError sslerror)
    {
        if (sslerrorhandler != null)
        {
            sslerrorhandler.proceed();
        }
    }

    public final boolean shouldOverrideUrlLoading(WebView webview, String s)
    {
label0:
        {
            synchronized (n.a())
            {
                Log.d(n.a(), (new StringBuilder("override js\u8DF3\u8F6C\uFF1A")).append(s).toString());
                a.b = true;
                n.f(a);
                if (!n.b(a))
                {
                    break label0;
                }
                n.g(a);
                n.c(a);
            }
            return true;
        }
        n.a(a, s);
        if (n.d(a) == null || !n.d(a).b(s))
        {
            break MISSING_BLOCK_LABEL_139;
        }
        n.a(a, true);
        n.g(a);
        n.c(a);
        webview;
        JVM INSTR monitorexit ;
        return true;
        s;
        throw s;
        webview;
        JVM INSTR monitorexit ;
        n.h(a).loadUrl(s);
        return true;
    }
}
