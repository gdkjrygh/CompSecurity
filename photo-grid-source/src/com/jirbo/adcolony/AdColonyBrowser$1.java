// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jirbo.adcolony;

import android.webkit.WebChromeClient;
import android.webkit.WebView;

// Referenced classes of package com.jirbo.adcolony:
//            AdColonyBrowser

class  extends WebChromeClient
{

    final AdColonyBrowser a;

    public void onGeolocationPermissionsShowPrompt(String s, android.webkit.ions.Callback callback)
    {
        callback.invoke(s, true, false);
    }

    public void onProgressChanged(WebView webview, int i)
    {
        a.setProgress(i * 1000);
    }

    .Callback(AdColonyBrowser adcolonybrowser)
    {
        a = adcolonybrowser;
        super();
    }
}
