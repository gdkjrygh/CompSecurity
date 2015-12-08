// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cards.browser;

import android.webkit.WebChromeClient;
import android.webkit.WebView;

// Referenced classes of package com.kik.cards.browser:
//            CaptchaWindowFragment

private final class <init> extends WebChromeClient
{

    final CaptchaWindowFragment a;

    public final void onReceivedTitle(WebView webview, String s)
    {
        super.onReceivedTitle(webview, s);
    }

    private (CaptchaWindowFragment captchawindowfragment)
    {
        a = captchawindowfragment;
        super();
    }

    a(CaptchaWindowFragment captchawindowfragment, byte byte0)
    {
        this(captchawindowfragment);
    }
}
