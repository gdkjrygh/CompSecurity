// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.facebook.k;
import com.facebook.n;
import com.facebook.v;

// Referenced classes of package com.facebook.internal:
//            bd, aw

final class bj extends WebViewClient
{

    final bd a;

    private bj(bd bd1)
    {
        a = bd1;
        super();
    }

    bj(bd bd1, byte byte0)
    {
        this(bd1);
    }

    public final void onPageFinished(WebView webview, String s)
    {
        super.onPageFinished(webview, s);
        if (!bd.b(a))
        {
            bd.c(a).dismiss();
        }
        bd.d(a).setBackgroundColor(0);
        bd.e(a).setVisibility(0);
        bd.f(a).setVisibility(0);
        bd.g(a);
    }

    public final void onPageStarted(WebView webview, String s, Bitmap bitmap)
    {
        aw.b("FacebookSDK.WebDialog", (new StringBuilder("Webview loading URL: ")).append(s).toString());
        super.onPageStarted(webview, s, bitmap);
        if (!bd.b(a))
        {
            bd.c(a).show();
        }
    }

    public final void onReceivedError(WebView webview, int i, String s, String s1)
    {
        super.onReceivedError(webview, i, s, s1);
        a.a(new k(s, i, s1));
    }

    public final void onReceivedSslError(WebView webview, SslErrorHandler sslerrorhandler, SslError sslerror)
    {
        super.onReceivedSslError(webview, sslerrorhandler, sslerror);
        sslerrorhandler.cancel();
        a.a(new k(null, -11, null));
    }

    public final boolean shouldOverrideUrlLoading(WebView webview, String s)
    {
        aw.b("FacebookSDK.WebDialog", (new StringBuilder("Redirect URL: ")).append(s).toString());
        if (s.startsWith(bd.a(a)))
        {
            Bundle bundle = a.a(s);
            webview = bundle.getString("error");
            s = webview;
            if (webview == null)
            {
                s = bundle.getString("error_type");
            }
            Object obj = bundle.getString("error_msg");
            webview = ((WebView) (obj));
            if (obj == null)
            {
                webview = bundle.getString("error_message");
            }
            obj = webview;
            if (webview == null)
            {
                obj = bundle.getString("error_description");
            }
            webview = bundle.getString("error_code");
            int i;
            if (!aw.a(webview))
            {
                try
                {
                    i = Integer.parseInt(webview);
                }
                // Misplaced declaration of an exception variable
                catch (WebView webview)
                {
                    i = -1;
                }
            } else
            {
                i = -1;
            }
            if (aw.a(s) && aw.a(((String) (obj))) && i == -1)
            {
                a.a(bundle);
            } else
            if (s != null && (s.equals("access_denied") || s.equals("OAuthAccessDeniedException")))
            {
                a.cancel();
            } else
            if (i == 4201)
            {
                a.cancel();
            } else
            {
                webview = new n(i, s, ((String) (obj)));
                a.a(new v(webview, ((String) (obj))));
            }
            return true;
        }
        if (s.startsWith("fbconnect://cancel"))
        {
            a.cancel();
            return true;
        }
        if (s.contains("touch"))
        {
            return false;
        } else
        {
            a.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(s)));
            return true;
        }
    }
}
