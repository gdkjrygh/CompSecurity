// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.common;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageButton;
import com.mopub.common.logging.MoPubLog;
import com.mopub.common.util.Drawables;
import com.mopub.common.util.Intents;

// Referenced classes of package com.mopub.common:
//            MoPubBrowser

class it> extends WebViewClient
{

    final MoPubBrowser a;

    public void onPageFinished(WebView webview, String s)
    {
        super.onPageFinished(webview, s);
        if (webview.canGoBack())
        {
            s = Drawables.LEFT_ARROW.createDrawable(a);
        } else
        {
            s = Drawables.UNLEFT_ARROW.createDrawable(a);
        }
        MoPubBrowser.b(a).setImageDrawable(s);
        if (webview.canGoForward())
        {
            webview = Drawables.RIGHT_ARROW.createDrawable(a);
        } else
        {
            webview = Drawables.UNRIGHT_ARROW.createDrawable(a);
        }
        MoPubBrowser.a(a).setImageDrawable(webview);
    }

    public void onPageStarted(WebView webview, String s, Bitmap bitmap)
    {
        super.onPageStarted(webview, s, bitmap);
        MoPubBrowser.a(a).setImageDrawable(Drawables.UNRIGHT_ARROW.createDrawable(a));
    }

    public void onReceivedError(WebView webview, int i, String s, String s1)
    {
        MoPubLog.d((new StringBuilder("MoPubBrowser error: ")).append(s).toString());
    }

    public boolean shouldOverrideUrlLoading(WebView webview, String s)
    {
        if (s != null)
        {
            webview = new Intent("android.intent.action.VIEW", Uri.parse(s));
            if (Intents.isDeepLink(s) && Intents.deviceCanHandleIntent(a, webview))
            {
                a.startActivity(webview);
                a.finish();
                return true;
            }
        }
        return false;
    }

    g(MoPubBrowser mopubbrowser)
    {
        a = mopubbrowser;
        super();
    }
}
