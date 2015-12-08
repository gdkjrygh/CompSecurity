// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jirbo.adcolony;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;

// Referenced classes of package com.jirbo.adcolony:
//            a, l, ae, ADCVideo, 
//            m

class a extends WebViewClient
{

    String a;
    final ae b;

    public void onLoadResource(WebView webview, String s)
    {
        l.a.a("DEC onLoad: ").b(s);
        if (s.equals(a))
        {
            l.a.b("DEC disabling mouse events");
            b.a("if (typeof(CN) != 'undefined' && CN.div) {\n  if (typeof(cn_dispatch_on_touch_begin) != 'undefined') CN.div.removeEventListener('mousedown',  cn_dispatch_on_touch_begin, true);\n  if (typeof(cn_dispatch_on_touch_end) != 'undefined')   CN.div.removeEventListener('mouseup',  cn_dispatch_on_touch_end, true);\n  if (typeof(cn_dispatch_on_touch_move) != 'undefined')  CN.div.removeEventListener('mousemove',  cn_dispatch_on_touch_move, true);\n}\n");
        }
    }

    public void onPageFinished(WebView webview, String s)
    {
        if (s.equals(a) || a.T.startsWith("<"))
        {
            b.D = false;
            b.d.l = true;
            b.w = System.currentTimeMillis();
            b.d.p = (double)(b.w - b.v) / 1000D;
        }
        b.d.N.removeView(b.c);
    }

    public void onPageStarted(WebView webview, String s, Bitmap bitmap)
    {
        if (s.equals(a))
        {
            b.d.k = true;
            b.v = System.currentTimeMillis();
        }
    }

    public boolean shouldOverrideUrlLoading(WebView webview, String s)
    {
        l.a.a("DEC request: ").b(s);
        if (s.contains("mraid:"))
        {
            b.aw.a(s);
        } else
        {
            if (s.contains("youtube"))
            {
                webview = new Intent("android.intent.action.VIEW", Uri.parse((new StringBuilder("vnd.youtube:")).append(s).toString()));
                webview.putExtra("VIDEO_ID", s);
                b.d.startActivity(webview);
                return true;
            }
            if (!s.contains("mraid.js"))
            {
                return false;
            }
        }
        return true;
    }

    ut(ae ae1)
    {
        b = ae1;
        super();
        a = a.T;
    }
}
