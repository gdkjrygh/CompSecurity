// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui;

import android.webkit.WebChromeClient;
import android.webkit.WebView;

// Referenced classes of package com.appboy.ui:
//            AppboyWebViewActivity

class this._cls0 extends WebChromeClient
{

    final AppboyWebViewActivity this$0;

    public void onProgressChanged(WebView webview, int i)
    {
        if (i < 100)
        {
            setProgressBarVisibility(true);
            return;
        } else
        {
            setProgressBarVisibility(false);
            return;
        }
    }

    ()
    {
        this$0 = AppboyWebViewActivity.this;
        super();
    }
}
