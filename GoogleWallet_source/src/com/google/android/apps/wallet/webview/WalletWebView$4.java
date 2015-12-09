// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.webview;

import android.webkit.ConsoleMessage;
import com.google.android.apps.wallet.logging.WLog;

// Referenced classes of package com.google.android.apps.wallet.webview:
//            HybridWebChromeClient, WalletWebView, HybridWebView

final class lient extends HybridWebChromeClient
{

    final WalletWebView this$0;

    public final boolean onConsoleMessage(ConsoleMessage consolemessage)
    {
        String s = WalletWebView.access$500();
        int i = consolemessage.lineNumber();
        String s1 = String.valueOf(consolemessage.message());
        WLog.d(s, (new StringBuilder(String.valueOf(s1).length() + 23)).append("JSConsole ").append(i).append(": ").append(s1).toString());
        return super.onConsoleMessage(consolemessage);
    }

    lient(HybridWebView hybridwebview)
    {
        this$0 = WalletWebView.this;
        super(hybridwebview);
    }
}
