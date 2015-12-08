// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.advertising.android;

import android.webkit.WebView;
import android.webkit.WebViewClient;

// Referenced classes of package com.microsoft.advertising.android:
//            AdWebView

final class b extends WebViewClient
{

    final AdWebView a;
    private final AdWebView b;

    public final void onReceivedError(WebView webview, int i, String s, String s1)
    {
        AdWebView.a(a, b);
    }

    public final boolean shouldOverrideUrlLoading(WebView webview, String s)
    {
        return false;
    }

    (AdWebView adwebview, AdWebView adwebview1)
    {
        a = adwebview;
        b = adwebview1;
        super();
    }
}
