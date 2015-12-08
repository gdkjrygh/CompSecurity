// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.settings;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.WebView;
import android.webkit.WebViewClient;

// Referenced classes of package com.snapchat.android.fragments.settings:
//            WebFragment

final class a extends WebViewClient
{

    private WebFragment a;

    public final boolean shouldOverrideUrlLoading(WebView webview, String s)
    {
        webview = Uri.parse(s);
        s = webview.getScheme();
        String s1 = webview.getHost();
        if (TextUtils.equals(s, "https") && (TextUtils.equals(s1, "support.snapchat.com") || TextUtils.equals(s1, "accounts.snapchat.com") || TextUtils.equals(s1, "accounts-dot-devsnapchat.appspot.com") || TextUtils.equals(s1, "www.snapchat.com")))
        {
            return false;
        } else
        {
            webview = new Intent("android.intent.action.VIEW", webview);
            a.startActivity(webview);
            return true;
        }
    }

    (WebFragment webfragment)
    {
        a = webfragment;
        super();
    }
}
