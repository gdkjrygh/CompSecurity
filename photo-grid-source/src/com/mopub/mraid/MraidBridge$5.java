// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.mraid;

import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.mopub.common.logging.MoPubLog;

// Referenced classes of package com.mopub.mraid:
//            MraidBridge

class init> extends WebViewClient
{

    final MraidBridge a;

    public void onPageFinished(WebView webview, String s)
    {
        MraidBridge.c(a);
    }

    public void onReceivedError(WebView webview, int i, String s, String s1)
    {
        MoPubLog.d((new StringBuilder("Error: ")).append(s).toString());
        super.onReceivedError(webview, i, s, s1);
    }

    public boolean shouldOverrideUrlLoading(WebView webview, String s)
    {
        return a.b(s);
    }

    Log(MraidBridge mraidbridge)
    {
        a = mraidbridge;
        super();
    }
}
