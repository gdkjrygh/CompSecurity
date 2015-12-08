// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cards.browser;

import android.webkit.WebView;
import com.kik.g.r;

// Referenced classes of package com.kik.cards.browser:
//            CaptchaWindowFragment

final class c extends r
{

    final WebView a;
    final CaptchaWindowFragment.b b;

    c(CaptchaWindowFragment.b b1, WebView webview)
    {
        b = b1;
        a = webview;
        super();
    }

    public final void a(Throwable throwable)
    {
        if (a != null && CaptchaWindowFragment.b.a(a.getUrl()))
        {
            CaptchaWindowFragment.b.a(b);
        } else
        {
            CaptchaWindowFragment.c(b.c);
        }
        super.a(throwable);
    }
}
