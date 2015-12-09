// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.webview;

import com.google.android.apps.wallet.ui.listener.OnActionListener;

// Referenced classes of package com.google.android.apps.wallet.webview:
//            WalletWebView

final class this._cls0
    implements Runnable
{

    final WalletWebView this$0;

    public final void run()
    {
        if (WalletWebView.access$300(WalletWebView.this) != null)
        {
            WalletWebView.access$300(WalletWebView.this).onAction(null);
        }
    }

    ener()
    {
        this$0 = WalletWebView.this;
        super();
    }
}
