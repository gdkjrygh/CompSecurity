// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;

import android.graphics.Bitmap;
import android.support.v4.app.ac;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import com.jcp.b.a;
import com.jcp.views.JCPWebView;

// Referenced classes of package com.jcp.fragments:
//            gw, gx

class hb extends WebViewClient
{

    final gw a;
    private int b;

    private hb(gw gw1)
    {
        a = gw1;
        super();
    }

    hb(gw gw1, gx gx)
    {
        this(gw1);
    }

    public void onPageFinished(WebView webview, String s)
    {
        super.onPageFinished(webview, s);
        gw.c(a).setEnabled(true);
        webview.loadUrl("javascript:$('header').hide();$('.off-canvas-wrap').css('top' , '-3.1875rem');$('[ui-view=\"footer\"]').hide();");
        if (gw.f(a).getLayoutParams().height != gw.g(a))
        {
            gw.f(a).getLayoutParams().height = gw.g(a);
            gw.f(a).setVisibility(0);
            gw.f(a).requestFocus();
            gw.f(a).requestFocusFromTouch();
        }
        int i = b - 1;
        b = i;
        if (i <= 0)
        {
            com.jcp.b.a.i();
        }
    }

    public void onPageStarted(WebView webview, String s, Bitmap bitmap)
    {
        super.onPageStarted(webview, s, bitmap);
        b = Math.max(b, 1);
        gw.c(a).setEnabled(false);
        if (a.i() != null && !a.i().isFinishing())
        {
            com.jcp.b.a.a(a.i(), 0x7f070276);
        }
    }

    public void onReceivedError(WebView webview, int i, String s, String s1)
    {
        super.onReceivedError(webview, i, s, s1);
        com.jcp.b.a.i();
    }

    public boolean shouldOverrideUrlLoading(WebView webview, String s)
    {
        if (!gw.d(a) && s.contains("sessionExpired=true"))
        {
            gw.e(a);
            com.jcp.fragments.gw.a(a, true);
            return true;
        } else
        {
            b = b + 1;
            webview.loadUrl(s);
            return false;
        }
    }
}
