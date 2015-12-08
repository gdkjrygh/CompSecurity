// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.framework.view.activity;

import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

// Referenced classes of package com.kohls.mcommerce.opal.framework.view.activity:
//            WebViewActivity

public class this._cls0 extends WebChromeClient
{

    final WebViewActivity this$0;

    public boolean onJsAlert(WebView webview, String s, String s1, JsResult jsresult)
    {
        return super.onJsAlert(webview, s, s1, jsresult);
    }

    public boolean onJsPrompt(WebView webview, String s, String s1, String s2, JsPromptResult jspromptresult)
    {
        return super.onJsPrompt(webview, s, s1, s2, jspromptresult);
    }

    public void onProgressChanged(WebView webview, int i)
    {
        super.onProgressChanged(webview, i);
    }

    public Y()
    {
        this$0 = WebViewActivity.this;
        super();
    }
}
