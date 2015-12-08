// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

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
import com.facebook.FacebookDialogException;
import com.facebook.FacebookRequestError;
import com.facebook.FacebookServiceException;

final class ask extends WebViewClient
{

    private ash a;

    private ask(ash ash1)
    {
        a = ash1;
        super();
    }

    ask(ash ash1, byte byte0)
    {
        this(ash1);
    }

    public final void onPageFinished(WebView webview, String s)
    {
        super.onPageFinished(webview, s);
        if (!ash.b(a))
        {
            ash.c(a).dismiss();
        }
        ash.d(a).setBackgroundColor(0);
        ash.e(a).setVisibility(0);
        ash.f(a).setVisibility(0);
    }

    public final void onPageStarted(WebView webview, String s, Bitmap bitmap)
    {
        arp.b("FacebookSDK.WebDialog", (new StringBuilder("Webview loading URL: ")).append(s).toString());
        super.onPageStarted(webview, s, bitmap);
        if (!ash.b(a))
        {
            ash.c(a).show();
        }
    }

    public final void onReceivedError(WebView webview, int i, String s, String s1)
    {
        super.onReceivedError(webview, i, s, s1);
        a.a(new FacebookDialogException(s, i, s1));
    }

    public final void onReceivedSslError(WebView webview, SslErrorHandler sslerrorhandler, SslError sslerror)
    {
        super.onReceivedSslError(webview, sslerrorhandler, sslerror);
        sslerrorhandler.cancel();
        a.a(new FacebookDialogException(null, -11, null));
    }

    public final boolean shouldOverrideUrlLoading(WebView webview, String s)
    {
        arp.b("FacebookSDK.WebDialog", (new StringBuilder("Redirect URL: ")).append(s).toString());
        if (s.startsWith(ash.a(a)))
        {
            Bundle bundle = a.a(s);
            s = bundle.getString("error");
            webview = s;
            if (s == null)
            {
                webview = bundle.getString("error_type");
            }
            String s1 = bundle.getString("error_msg");
            s = s1;
            if (s1 == null)
            {
                s = bundle.getString("error_description");
            }
            s1 = bundle.getString("error_code");
            int i;
            if (!arp.a(s1))
            {
                try
                {
                    i = Integer.parseInt(s1);
                }
                catch (NumberFormatException numberformatexception)
                {
                    i = -1;
                }
            } else
            {
                i = -1;
            }
            if (arp.a(webview) && arp.a(s) && i == -1)
            {
                webview = a;
                if (((ash) (webview)).b != null && !((ash) (webview)).d)
                {
                    webview.d = true;
                    ((ash) (webview)).b.a(bundle, null);
                    webview.dismiss();
                }
            } else
            if (webview != null && (webview.equals("access_denied") || webview.equals("OAuthAccessDeniedException")))
            {
                a.a();
            } else
            if (i == 4201)
            {
                a.a();
            } else
            {
                webview = new FacebookRequestError(i, webview, s);
                a.a(new FacebookServiceException(webview, s));
            }
            return true;
        }
        if (s.startsWith("fbconnect://cancel"))
        {
            a.a();
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
