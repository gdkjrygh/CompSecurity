// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cleanmaster.ui.app.market;

import android.graphics.Bitmap;
import android.os.Handler;
import android.text.TextUtils;
import android.webkit.WebView;
import android.webkit.WebViewClient;

// Referenced classes of package com.cleanmaster.ui.app.market:
//            o, d

class q extends WebViewClient
{

    final o a;

    q(o o1)
    {
        a = o1;
        super();
    }

    public void onPageFinished(WebView webview, String s)
    {
        if (o.b(a))
        {
            return;
        } else
        {
            o.c(a).removeMessages(2);
            android.os.Message message = o.c(a).obtainMessage(1, s);
            o.c(a).sendMessageDelayed(message, 4000L);
            super.onPageFinished(webview, s);
            return;
        }
    }

    public void onPageStarted(WebView webview, String s, Bitmap bitmap)
    {
        if (!o.b(a))
        {
            break MISSING_BLOCK_LABEL_19;
        }
        if (webview == null)
        {
            break MISSING_BLOCK_LABEL_18;
        }
        webview.stopLoading();
        return;
        o.c(a).removeMessages(1);
        o.c(a).removeMessages(2);
        if (TextUtils.isEmpty(s))
        {
            if (webview != null)
            {
                webview.stopLoading();
            }
            o.a(a, true);
            webview = o.c(a).obtainMessage(1, s);
            o.c(a).sendMessage(webview);
            return;
        }
        if (d.a(s))
        {
            if (webview != null)
            {
                webview.stopLoading();
            }
            o.a(a, true);
            webview = o.c(a).obtainMessage(1, s);
            o.c(a).sendMessage(webview);
            return;
        } else
        {
            android.os.Message message = o.c(a).obtainMessage(2, s);
            o.c(a).sendMessageDelayed(message, 10000L);
            super.onPageStarted(webview, s, bitmap);
            return;
        }
        webview;
    }

    public void onReceivedError(WebView webview, int i, String s, String s1)
    {
        if (o.b(a))
        {
            return;
        } else
        {
            o.a(a, true);
            o.c(a).removeMessages(2);
            android.os.Message message = o.c(a).obtainMessage(1, s1);
            o.c(a).sendMessage(message);
            super.onReceivedError(webview, i, s, s1);
            return;
        }
    }

    public boolean shouldOverrideUrlLoading(WebView webview, String s)
    {
        if (webview != null)
        {
            webview.loadUrl(s);
            return true;
        } else
        {
            return super.shouldOverrideUrlLoading(webview, s);
        }
    }
}
