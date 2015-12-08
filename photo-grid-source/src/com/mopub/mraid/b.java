// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.mraid;

import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

// Referenced classes of package com.mopub.mraid:
//            MraidBridge

final class b extends WebChromeClient
{

    final MraidBridge a;

    b(MraidBridge mraidbridge)
    {
        a = mraidbridge;
        super();
    }

    public final boolean onConsoleMessage(ConsoleMessage consolemessage)
    {
        if (MraidBridge.a(a) != null)
        {
            return MraidBridge.a(a).onConsoleMessage(consolemessage);
        } else
        {
            return super.onConsoleMessage(consolemessage);
        }
    }

    public final boolean onJsAlert(WebView webview, String s, String s1, JsResult jsresult)
    {
        if (MraidBridge.a(a) != null)
        {
            return MraidBridge.a(a).onJsAlert(s1, jsresult);
        } else
        {
            return super.onJsAlert(webview, s, s1, jsresult);
        }
    }

    public final void onShowCustomView(View view, android.webkit.WebChromeClient.CustomViewCallback customviewcallback)
    {
        super.onShowCustomView(view, customviewcallback);
    }
}
