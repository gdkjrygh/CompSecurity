// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.webview;


// Referenced classes of package com.google.android.apps.wallet.webview:
//            HybridWebView, ServiceAuthInfo

final class val.authInfo
    implements Runnable
{

    final HybridWebView this$0;
    final ServiceAuthInfo val$authInfo;

    public final void run()
    {
        HybridWebView.access$300(HybridWebView.this, val$authInfo);
    }

    ()
    {
        this$0 = final_hybridwebview;
        val$authInfo = ServiceAuthInfo.this;
        super();
    }
}
