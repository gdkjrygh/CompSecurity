// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.web.fragment;

import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.pinterest.base.StopWatch;

// Referenced classes of package com.pinterest.activity.web.fragment:
//            WebViewFragment

class this._cls0 extends WebChromeClient
{

    final WebViewFragment this$0;

    public void onProgressChanged(WebView webview, int i)
    {
        if (webview != null)
        {
            webview = StopWatch.get();
            if (webview.getAuxData("webview_pageload", "100p_loaded") == null)
            {
                if (i >= 25 && i < 50)
                {
                    webview.logTimeStamp("webview_pageload", "25p_loaded");
                    return;
                }
                if (i >= 50 && i < 75)
                {
                    webview.logTimeStamp("webview_pageload", "50p_loaded");
                    return;
                }
                if (i >= 75 && i < 100)
                {
                    webview.logTimeStamp("webview_pageload", "75p_loaded");
                    return;
                }
            }
        }
    }

    ()
    {
        this$0 = WebViewFragment.this;
        super();
    }
}
