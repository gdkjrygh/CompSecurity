// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.common;

import android.webkit.WebChromeClient;
import android.webkit.WebView;

// Referenced classes of package com.mopub.common:
//            MoPubBrowser

final class k extends WebChromeClient
{

    final MoPubBrowser a;

    k(MoPubBrowser mopubbrowser)
    {
        a = mopubbrowser;
        super();
    }

    public final void onProgressChanged(WebView webview, int i)
    {
        try
        {
            a.setTitle("Loading...");
            a.setProgress(i * 100);
        }
        // Misplaced declaration of an exception variable
        catch (WebView webview)
        {
            return;
        }
        if (i != 100)
        {
            break MISSING_BLOCK_LABEL_37;
        }
        a.setTitle(webview.getUrl());
    }
}
