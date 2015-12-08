// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cards.web;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;
import com.kik.g.k;
import kik.android.util.au;
import org.c.b;

// Referenced classes of package com.kik.cards.web:
//            aq, bf

private final class <init> extends WebViewClient
{

    final aq a;

    public final void onPageFinished(WebView webview, String s)
    {
        if (a.a(s))
        {
            return;
        }
        if (com.kik.cards.web.aq.k(a))
        {
            aq.l(a);
            webview.clearHistory();
        }
        if (aq.h(a) == null || !aq.h(a).equals(s))
        {
            aq.o();
            aq.m(a).a(s);
            aq.n(a).a(null);
            aq.a(a, true);
        }
        super.onPageFinished(webview, s);
    }

    public final void onPageStarted(WebView webview, String s, Bitmap bitmap)
    {
        if (a.a(s))
        {
            return;
        }
        com.kik.cards.web.aq.b(a, s);
        if (aq.h(a) == null || !aq.h(a).equals(s))
        {
            aq.i(a);
        }
        aq.j(a).a(s);
        super.onPageStarted(webview, s, bitmap);
    }

    public final void onReceivedError(WebView webview, int i, String s, String s1)
    {
        aq.a.c("Error in {} : {}", s1, s);
        webview = a.getContext();
        if (i != -10) goto _L2; else goto _L1
_L1:
        try
        {
            webview.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(s1)));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Toast.makeText(webview, 0x7f0900dd, 0).show();
        }
_L4:
        aq.g(a).a(Integer.valueOf(i));
        return;
_L2:
        if (i < 0)
        {
            aq.e(a);
            aq.a(a, s1);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void onReceivedSslError(WebView webview, SslErrorHandler sslerrorhandler, SslError sslerror)
    {
        super.onReceivedSslError(webview, sslerrorhandler, sslerror);
        aq.a.c("SslError error", sslerror);
        aq.e(a);
        aq.a(a, aq.f(a));
        webview = aq.g(a);
        int i;
        if (sslerror == null)
        {
            i = -11;
        } else
        {
            i = sslerror.getPrimaryError();
        }
        webview.a(Integer.valueOf(i));
    }

    public final boolean shouldOverrideUrlLoading(WebView webview, String s)
    {
        if (a.a(s))
        {
            return false;
        }
        if (s == null) goto _L2; else goto _L1
_L1:
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(s));
        if (bf.f(s)) goto _L4; else goto _L3
_L3:
        boolean flag = true;
_L6:
        boolean flag1;
        if (com.kik.cards.util.b.d(s))
        {
            webview = com.kik.cards.util.b.c(s);
            flag1 = com.kik.cards.util.b.a(a.j(), webview);
            if (flag1)
            {
                s = webview;
            }
            a.loadUrl(com.kik.cards.util.b.c(s));
            flag = false;
        } else
        {
            flag1 = false;
        }
        if (flag)
        {
            aq.o(a).a(s);
        } else
        {
            aq.m(a).a(s);
        }
        if (!flag)
        {
            com.kik.cards.web.aq.b(a, s);
        }
        if (flag || flag1)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (!flag1)
        {
            aq.p(a).a(s);
        }
        if (!flag1)
        {
            aq.a(a, false);
        }
        return flag1;
_L4:
        if (webview != null && au.a(intent, webview.getContext()))
        {
            flag = true;
            continue; /* Loop/switch isn't completed */
        }
        webview = com.kik.cards.util.b.e(s.toLowerCase());
        if (webview != null && webview.endsWith(".pdf"))
        {
            flag = true;
            continue; /* Loop/switch isn't completed */
        }
_L2:
        flag = false;
        if (true) goto _L6; else goto _L5
_L5:
    }

    private or(aq aq1)
    {
        a = aq1;
        super();
    }

    lient(aq aq1, byte byte0)
    {
        this(aq1);
    }
}
