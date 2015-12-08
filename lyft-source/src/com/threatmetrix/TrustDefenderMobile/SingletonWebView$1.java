// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.threatmetrix.TrustDefenderMobile;

import android.webkit.WebView;

// Referenced classes of package com.threatmetrix.TrustDefenderMobile:
//            SingletonWebView

final class a
    implements Runnable
{

    final WebView a;

    public void run()
    {
        a.removeAllViews();
        a.destroy();
    }

    (WebView webview)
    {
        a = webview;
        super();
    }
}
