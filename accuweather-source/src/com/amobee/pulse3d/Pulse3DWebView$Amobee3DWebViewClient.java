// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.pulse3d;

import android.webkit.WebView;
import android.webkit.WebViewClient;

// Referenced classes of package com.amobee.pulse3d:
//            Pulse3DWebView, Log

private class <init> extends WebViewClient
{

    final Pulse3DWebView this$0;

    public void onPageFinished(WebView webview, String s)
    {
        super.onPageFinished(webview, s);
        while (s.equals("about:blank") || !isLoadingNewUrl) 
        {
            return;
        }
        isLoadingNewUrl = false;
        initEngine();
    }

    public void onReceivedError(WebView webview, int i, String s, String s1)
    {
        Log.d("Amobee3DWebView", (new StringBuilder()).append("error #").append(i).append(" ").append(s).append(", url: ").append(s1).toString());
        super.onReceivedError(webview, i, s, s1);
    }

    private ()
    {
        this$0 = Pulse3DWebView.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
