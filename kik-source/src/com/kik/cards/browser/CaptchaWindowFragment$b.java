// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cards.browser;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.view.View;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.kik.g.aq;
import com.kik.g.s;
import com.kik.sdkutils.d;
import kik.android.chat.fragment.ProgressDialogFragment;
import kik.android.util.cv;

// Referenced classes of package com.kik.cards.browser:
//            CaptchaWindowFragment, c, d

private final class <init> extends WebViewClient
{

    boolean a;
    boolean b;
    final CaptchaWindowFragment c;

    static void a(<init> <init>1)
    {
        if (CaptchaWindowFragment.b(<init>1.c) != null)
        {
            CaptchaWindowFragment.b(<init>1.c).a();
        }
        if (<init>1.a && !<init>1.b)
        {
            <init>1.c.a.dismissAllowingStateLoss();
            return;
        } else
        {
            <init>1.b = false;
            return;
        }
    }

    static boolean a(String s1)
    {
        return s1 != null && s1.endsWith("#success");
    }

    public final void onPageFinished(WebView webview, String s1)
    {
        cv.e(new View[] {
            CaptchaWindowFragment.a(c)
        });
        if (!b)
        {
            a = true;
        }
        if (CaptchaWindowFragment.b(c) != null) goto _L2; else goto _L1
_L1:
        CaptchaWindowFragment.a(c, new aq());
        CaptchaWindowFragment.b(c).a(d.a(webview, new c(this, webview)));
        webview.loadUrl("javascript:(function(metas){for(var i=metas.length;i--;)if(metas[i].name==='kik-captcha'){window.location.hash='#success';break}})(document.getElementsByTagName('meta'))");
        s.a(CaptchaWindowFragment.b(c), 1000L);
_L4:
        super.onPageFinished(webview, s1);
        return;
_L2:
        if (webview != null)
        {
            webview.postDelayed(new com.kik.cards.browser.d(this, webview), 100L);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void onPageStarted(WebView webview, String s1, Bitmap bitmap)
    {
        a = false;
        if (!CaptchaWindowFragment.a(c, s1))
        {
            super.onPageStarted(webview, s1, bitmap);
            return;
        } else
        {
            webview.stopLoading();
            return;
        }
    }

    public final void onReceivedError(WebView webview, int i, String s1, String s2)
    {
        CaptchaWindowFragment.c(c);
        super.onReceivedError(webview, i, s1, s2);
    }

    public final void onReceivedSslError(WebView webview, SslErrorHandler sslerrorhandler, SslError sslerror)
    {
        sslerrorhandler.cancel();
        webview.stopLoading();
    }

    public final boolean shouldOverrideUrlLoading(WebView webview, String s1)
    {
        if (s1 == null)
        {
            return true;
        }
        if (!CaptchaWindowFragment.a(c, s1))
        {
            c.a(s1);
            return true;
        }
        if (!a)
        {
            b = true;
        }
        a = false;
        return true;
    }

    private nt(CaptchaWindowFragment captchawindowfragment)
    {
        c = captchawindowfragment;
        super();
        a = true;
        b = false;
    }

    b(CaptchaWindowFragment captchawindowfragment, byte byte0)
    {
        this(captchawindowfragment);
    }
}
