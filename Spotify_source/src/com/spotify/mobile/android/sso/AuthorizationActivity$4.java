// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.sso;

import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.spotify.mobile.android.util.logging.Logger;
import flx;

// Referenced classes of package com.spotify.mobile.android.sso:
//            AuthorizationActivity, AuthorizationRequest

final class a extends WebViewClient
{

    private WebView a;
    private AuthorizationActivity b;

    public final void onPageFinished(WebView webview, String s)
    {
        super.onPageFinished(webview, s);
        a.setVisibility(0);
        if (AuthorizationActivity.c(b))
        {
            AuthorizationActivity.d(b).dismiss();
        }
    }

    public final void onPageStarted(WebView webview, String s, Bitmap bitmap)
    {
        super.onPageStarted(webview, s, bitmap);
        if (AuthorizationActivity.c(b))
        {
            AuthorizationActivity.d(b).show();
        }
    }

    public final void onReceivedError(WebView webview, int i, String s, String s1)
    {
        super.onReceivedError(webview, i, s, s1);
        Logger.c("%s, code: %s, failing url: %s", new Object[] {
            s, Integer.valueOf(i), s1
        });
        AuthorizationActivity.a(b, "AUTHENTICATION_SERVICE_UNAVAILABLE");
    }

    public final boolean shouldOverrideUrlLoading(WebView webview, String s)
    {
        webview = Uri.parse(s);
        if (s.startsWith(((AuthorizationRequest) (AuthorizationActivity.e(b))).a))
        {
            b.a(flx.a(webview));
            return true;
        }
        if (webview.getAuthority().matches("accounts.spotify.com"))
        {
            return false;
        } else
        {
            webview = new Intent("android.intent.action.VIEW", webview);
            b.startActivity(webview);
            return true;
        }
    }

    (AuthorizationActivity authorizationactivity, WebView webview)
    {
        b = authorizationactivity;
        a = webview;
        super();
    }
}
