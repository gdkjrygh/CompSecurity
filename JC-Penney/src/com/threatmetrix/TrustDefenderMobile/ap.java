// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.threatmetrix.TrustDefenderMobile;

import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

// Referenced classes of package com.threatmetrix.TrustDefenderMobile:
//            r

class ap extends WebChromeClient
{

    private final r a;
    private final String b = com/threatmetrix/TrustDefenderMobile/ap.getName();

    public ap(r r1)
    {
        a = r1;
    }

    public boolean onJsAlert(WebView webview, String s, String s1, JsResult jsresult)
    {
        webview = b;
        (new StringBuilder("onJsAlert() -")).append(s1);
        a.a(s1);
        jsresult.confirm();
        return true;
    }
}
