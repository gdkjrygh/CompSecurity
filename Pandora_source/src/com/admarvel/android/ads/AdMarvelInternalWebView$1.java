// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.ads;

import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.admarvel.android.ads:
//            AdMarvelInternalWebView, FullScreenControls

class this._cls0 extends WebChromeClient
{

    final AdMarvelInternalWebView this$0;

    public void onProgressChanged(WebView webview, int i)
    {
        webview = null;
        if (getParent() instanceof RelativeLayout)
        {
            webview = (FullScreenControls)((RelativeLayout)getParent()).findViewWithTag((new StringBuilder(String.valueOf(GUID))).append("CONTROLS").toString());
        }
        if (webview != null && AdMarvelInternalWebView.access$6(AdMarvelInternalWebView.this).get())
        {
            ((ProgressBar)webview.findViewWithTag((new StringBuilder(String.valueOf(GUID))).append("PROGRESS_BAR").toString())).setProgress(i);
        }
    }

    ()
    {
        this$0 = AdMarvelInternalWebView.this;
        super();
    }
}
