// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.verification;

import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.snapchat.android.Timber;

// Referenced classes of package com.snapchat.android.fragments.verification:
//            URLVerificationFragment

final class <init> extends WebViewClient
{

    private URLVerificationFragment a;

    public final void onPageFinished(WebView webview, String s)
    {
        super.onPageFinished(webview, s);
        URLVerificationFragment.a(a, false);
    }

    public final boolean shouldOverrideUrlLoading(WebView webview, String s)
    {
        URLVerificationFragment.a(a, true);
        Timber.b(URLVerificationFragment.m(), "CASH-LOG: Loading the URL: %s", new Object[] {
            s
        });
        URLVerificationFragment.b(a, false);
        if (!s.equals("https://support.snapchat.com/success")) goto _L2; else goto _L1
_L1:
        URLVerificationFragment.b(a, true);
        URLVerificationFragment.c(a, true);
_L4:
        if (URLVerificationFragment.a(a))
        {
            URLVerificationFragment.b(a);
        }
        return URLVerificationFragment.a(a);
_L2:
        if (s.equals("https://support.snapchat.com/failure"))
        {
            URLVerificationFragment.b(a, true);
            URLVerificationFragment.c(a, false);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private (URLVerificationFragment urlverificationfragment)
    {
        a = urlverificationfragment;
        super();
    }

    a(URLVerificationFragment urlverificationfragment, byte byte0)
    {
        this(urlverificationfragment);
    }
}
