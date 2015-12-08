// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.richmedia;

import android.webkit.WebView;
import android.webkit.WebViewClient;

// Referenced classes of package com.tremorvideo.sdk.android.richmedia:
//            ScriptInterpreter, n

private class <init> extends WebViewClient
{

    final ScriptInterpreter a;

    public void onPageFinished(WebView webview, String s)
    {
        a.scriptLoaded = true;
        a.b.m();
    }

    private (ScriptInterpreter scriptinterpreter)
    {
        a = scriptinterpreter;
        super();
    }

    a(ScriptInterpreter scriptinterpreter, a a1)
    {
        this(scriptinterpreter);
    }
}
