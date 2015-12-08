// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.c;

import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;

// Referenced classes of package com.tinder.c:
//            ap

final class ViewClient extends WebViewClient
{

    final ap a;

    public final boolean shouldOverrideUrlLoading(WebView webview, String s)
    {
        webview = Uri.parse(s).getHost();
        return !ap.a(a).equals(webview);
    }

    View(ap ap1)
    {
        a = ap1;
        super();
    }
}
