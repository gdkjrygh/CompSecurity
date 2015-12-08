// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.mobileads.util;

import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.mopub.common.logging.MoPubLog;

final class b extends WebChromeClient
{

    b()
    {
    }

    public final boolean onJsAlert(WebView webview, String s, String s1, JsResult jsresult)
    {
        MoPubLog.d(s1);
        jsresult.confirm();
        return true;
    }

    public final boolean onJsBeforeUnload(WebView webview, String s, String s1, JsResult jsresult)
    {
        MoPubLog.d(s1);
        jsresult.confirm();
        return true;
    }

    public final boolean onJsConfirm(WebView webview, String s, String s1, JsResult jsresult)
    {
        MoPubLog.d(s1);
        jsresult.confirm();
        return true;
    }

    public final boolean onJsPrompt(WebView webview, String s, String s1, String s2, JsPromptResult jspromptresult)
    {
        MoPubLog.d(s1);
        jspromptresult.confirm();
        return true;
    }
}
