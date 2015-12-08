// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cards.browser;

import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.TextView;

// Referenced classes of package com.kik.cards.browser:
//            PopupWindowActivity

private final class <init> extends WebChromeClient
{

    final PopupWindowActivity a;

    public final void onReceivedTitle(WebView webview, String s)
    {
        super.onReceivedTitle(webview, s);
        PopupWindowActivity.a(a).setText(s);
    }

    private (PopupWindowActivity popupwindowactivity)
    {
        a = popupwindowactivity;
        super();
    }

    a(PopupWindowActivity popupwindowactivity, byte byte0)
    {
        this(popupwindowactivity);
    }
}
