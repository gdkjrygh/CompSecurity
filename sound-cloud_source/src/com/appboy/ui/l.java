// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui;

import android.webkit.WebChromeClient;
import android.webkit.WebView;

// Referenced classes of package com.appboy.ui:
//            AppboyWebViewActivity

final class l extends WebChromeClient
{

    final AppboyWebViewActivity a;

    l(AppboyWebViewActivity appboywebviewactivity)
    {
        a = appboywebviewactivity;
        super();
    }

    public final void onProgressChanged(WebView webview, int i)
    {
        if (i < 100)
        {
            a.setProgressBarVisibility(true);
            return;
        } else
        {
            a.setProgressBarVisibility(false);
            return;
        }
    }
}
