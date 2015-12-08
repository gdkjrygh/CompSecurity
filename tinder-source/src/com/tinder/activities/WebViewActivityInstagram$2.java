// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.activities;

import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.ProgressBar;

// Referenced classes of package com.tinder.activities:
//            WebViewActivityInstagram

final class a extends WebChromeClient
{

    final WebViewActivityInstagram a;

    public final void onProgressChanged(WebView webview, int i)
    {
        if (i < 100 && WebViewActivityInstagram.a(a).getVisibility() == 8)
        {
            WebViewActivityInstagram.a(a).setVisibility(0);
        }
        if (i == 100)
        {
            WebViewActivityInstagram.a(a).setVisibility(8);
        }
    }

    (WebViewActivityInstagram webviewactivityinstagram)
    {
        a = webviewactivityinstagram;
        super();
    }
}
