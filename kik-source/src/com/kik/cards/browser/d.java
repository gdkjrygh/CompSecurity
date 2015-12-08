// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cards.browser;

import android.webkit.WebView;

// Referenced classes of package com.kik.cards.browser:
//            CaptchaWindowFragment

final class d
    implements Runnable
{

    final WebView a;
    final CaptchaWindowFragment.b b;

    d(CaptchaWindowFragment.b b1, WebView webview)
    {
        b = b1;
        a = webview;
        super();
    }

    public final void run()
    {
        if (CaptchaWindowFragment.b.a(a.getUrl()))
        {
            CaptchaWindowFragment.b.a(b);
            return;
        } else
        {
            CaptchaWindowFragment.c(b.c);
            return;
        }
    }
}
