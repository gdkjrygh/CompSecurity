// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.support.v4.app.ac;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.Toast;
import com.jcp.JCP;
import com.jcp.b.a;
import com.jcp.b.b;
import com.jcp.util.k;
import com.jcp.views.JCPWebView;

// Referenced classes of package com.jcp.fragments:
//            u, v

class aa extends WebViewClient
{

    final u a;
    private int b;

    private aa(u u1)
    {
        a = u1;
        super();
    }

    aa(u u1, v v)
    {
        this(u1);
    }

    private void a(String s)
    {
        s = new Intent("android.intent.action.DIAL", Uri.parse(s));
        try
        {
            a.a(s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            k.a(a.i(), 0x7f0701bb, 0x7f0700b2);
        }
    }

    public void onPageFinished(WebView webview, String s)
    {
        super.onPageFinished(webview, s);
        u.e(a).setEnabled(true);
        if (s.contains("index.html?") && s.endsWith("#/") || s.endsWith("index.html#/") || s.contains("shippingSuspended=true"))
        {
            u.c(a);
        } else
        {
            int i;
            if (webview != null)
            {
                webview.loadUrl("javascript:$('#ui_m_header').remove();$('#contentWrapper').css('margin-top', '-45px');$('#pageHeader').remove();$('footer').children().remove();$('header').remove();$('main').css('top','25px');$('table').css('border','0');$('td').css('background-color', 'white');");
            } else
            {
                Toast.makeText(a.i(), a.a(0x7f07005d), 0).show();
            }
            if (s.contains("orderConfirmation.jsp") || s.contains("checkout-confirmation"))
            {
                u.c(a, true);
                JCP.i();
            } else
            {
                u.c(a, false);
            }
            if (u.h(a) != null && u.h(a).getLayoutParams().height != u.i(a))
            {
                u.h(a).getLayoutParams().height = u.i(a);
                u.h(a).setVisibility(0);
            }
            i = b - 1;
            b = i;
            if (i <= 0)
            {
                com.jcp.b.a.i();
                return;
            }
        }
    }

    public void onPageStarted(WebView webview, String s, Bitmap bitmap)
    {
        super.onPageStarted(webview, s, bitmap);
        b = Math.max(b, 1);
        u.e(a).setEnabled(false);
        if (a.i() != null && !a.i().isFinishing())
        {
            com.jcp.b.a.a(a.i(), 0x7f070276);
        }
    }

    public void onReceivedError(WebView webview, int i, String s, String s1)
    {
        super.onReceivedError(webview, i, s, s1);
        com.jcp.b.a.i();
    }

    public boolean shouldOverrideUrlLoading(WebView webview, String s)
    {
        if (!u.f(a) && (s.contains("sessionExpired=true") || s.contains("sessiontimeout")))
        {
            u.g(a);
            com.jcp.fragments.u.b(a, true);
            return true;
        }
        if (com.jcp.fragments.u.b(a) || s.endsWith((new StringBuilder()).append(b.b).append("/").toString()))
        {
            com.jcp.fragments.u.a(a, false);
            return true;
        }
        if (s.contains("/cart/viewShoppingBag.jsp") || s.contains("/jcp/checkout.jsp"))
        {
            u.c(a);
            return true;
        }
        if (s.contains("/jcp/department.jsp"))
        {
            com.jcp.fragments.u.a(a, true);
            return true;
        }
        if (s.contains("/index.jsp"))
        {
            com.jcp.fragments.u.a(a, false);
            return true;
        }
        if (s.startsWith("tel:"))
        {
            a(s);
            return true;
        } else
        {
            b = b + 1;
            webview.loadUrl(s);
            return false;
        }
    }
}
