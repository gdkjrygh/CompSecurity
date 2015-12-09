// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.EnterpriseMobileBanking.Plugins;

import com.EnterpriseMobileBanking.AppHelper;
import com.EnterpriseMobileBanking.Plugins.Components.TransiteWebView;
import com.EnterpriseMobileBanking.Plugins.Components.WebViewClient;

// Referenced classes of package com.EnterpriseMobileBanking.Plugins:
//            WebViewLinker

class val.me
    implements Runnable
{

    final WebViewLinker this$0;
    final WebViewLinker val$me;

    public void run()
    {
        synchronized (val$me)
        {
            WebViewLinker.access$102(WebViewLinker.this, AppHelper.getTransiteView());
            WebViewClient webviewclient = new WebViewClient(val$me);
            WebViewLinker.access$100(WebViewLinker.this).setWebViewClient(webviewclient);
            WebViewLinker.access$100(WebViewLinker.this).setTag(Boolean.valueOf(true));
            WebViewLinker.access$100(WebViewLinker.this).addJavascriptInterface(new vaScriptInterface(WebViewLinker.this), "webview");
            val$me.notify();
        }
        return;
        exception;
        webviewlinker;
        JVM INSTR monitorexit ;
        throw exception;
    }

    vaScriptInterface()
    {
        this$0 = final_webviewlinker;
        val$me = WebViewLinker.this;
        super();
    }
}
