// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.b;

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
import com.facebook.l;
import com.facebook.o;
import com.facebook.x;

// Referenced classes of package com.facebook.b:
//            as, al, at

class ay extends WebViewClient
{

    final as a;

    private ay(as as1)
    {
        a = as1;
        super();
    }

    ay(as as1, at at)
    {
        this(as1);
    }

    public void onPageFinished(WebView webview, String s)
    {
        super.onPageFinished(webview, s);
        if (!as.b(a))
        {
            as.c(a).dismiss();
        }
        as.d(a).setBackgroundColor(0);
        as.e(a).setVisibility(0);
        as.f(a).setVisibility(0);
        as.a(a, true);
    }

    public void onPageStarted(WebView webview, String s, Bitmap bitmap)
    {
        al.a("FacebookSDK.WebDialog", (new StringBuilder()).append("Webview loading URL: ").append(s).toString());
        super.onPageStarted(webview, s, bitmap);
        if (!as.b(a))
        {
            as.c(a).show();
        }
    }

    public void onReceivedError(WebView webview, int i, String s, String s1)
    {
        super.onReceivedError(webview, i, s, s1);
        a.a(new l(s, i, s1));
    }

    public void onReceivedSslError(WebView webview, SslErrorHandler sslerrorhandler, SslError sslerror)
    {
        super.onReceivedSslError(webview, sslerrorhandler, sslerror);
        sslerrorhandler.cancel();
        a.a(new l(null, -11, null));
    }

    public boolean shouldOverrideUrlLoading(WebView webview, String s)
    {
        al.a("FacebookSDK.WebDialog", (new StringBuilder()).append("Redirect URL: ").append(s).toString());
        if (s.startsWith(as.a(a)))
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
            if (!al.a(webview))
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
            if (al.a(s) && al.a(((String) (obj))) && i == -1)
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
                webview = new o(i, s, ((String) (obj)));
                a.a(new x(webview, ((String) (obj))));
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
