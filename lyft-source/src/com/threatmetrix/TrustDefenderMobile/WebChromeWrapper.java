// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.threatmetrix.TrustDefenderMobile;

import android.util.Log;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

// Referenced classes of package com.threatmetrix.TrustDefenderMobile:
//            StringUtils, JavaScriptInterface

class WebChromeWrapper extends WebChromeClient
{

    private final JavaScriptInterface a;
    private final String b = StringUtils.a(com/threatmetrix/TrustDefenderMobile/WebChromeWrapper);

    public WebChromeWrapper(JavaScriptInterface javascriptinterface)
    {
        a = javascriptinterface;
    }

    public boolean onJsAlert(WebView webview, String s, String s1, JsResult jsresult)
    {
        Log.d(b, (new StringBuilder()).append("onJsAlert() -").append(s1).toString());
        a.a(s1);
        jsresult.confirm();
        return true;
    }
}
