// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.sdk;

import android.content.Intent;
import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.pinterest.ui.progress.LoadingView;

// Referenced classes of package com.pinterest.sdk:
//            PinterestOauthActivity

class a extends WebViewClient
{

    final PinterestOauthActivity a;

    public void onPageFinished(WebView webview, String s)
    {
        super.onPageFinished(webview, s);
        if (PinterestOauthActivity.b(a) != null)
        {
            PinterestOauthActivity.b(a).setVisibility(8);
        }
    }

    public boolean shouldOverrideUrlLoading(WebView webview, String s)
    {
        if (s != null && s.startsWith("pdk://"))
        {
            webview = Uri.parse(s);
            Intent intent = new Intent();
            if (webview != null && PinterestOauthActivity.a(a).equalsIgnoreCase(webview.getQueryParameter("state")))
            {
                intent.putExtra("PDKCLIENT_EXTRA_RESULT", s);
            }
            a.setResult(-1, intent);
            a.finish();
            return true;
        } else
        {
            return false;
        }
    }

    (PinterestOauthActivity pinterestoauthactivity)
    {
        a = pinterestoauthactivity;
        super();
    }
}
