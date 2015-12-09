// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.activities;

import android.graphics.Bitmap;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;
import com.jcp.b.a;
import com.jcp.views.JCPWebView;

// Referenced classes of package com.jcp.activities:
//            CaPrivacyPolicyActivity, c

class d extends WebViewClient
{

    final CaPrivacyPolicyActivity a;

    private d(CaPrivacyPolicyActivity caprivacypolicyactivity)
    {
        a = caprivacypolicyactivity;
        super();
    }

    d(CaPrivacyPolicyActivity caprivacypolicyactivity, c c)
    {
        this(caprivacypolicyactivity);
    }

    public void onPageFinished(WebView webview, String s)
    {
        super.onPageFinished(webview, s);
        webview.loadUrl("javascript:$('#pageHeader').remove();$('footer').children().remove();$('header').remove();$('main').css('top','-105px');$('table').css('border','0');$('td').css('background-color', 'white');$('table').css('width','100%');");
        if (!a.isFinishing())
        {
            com.jcp.b.a.i();
            com.jcp.activities.CaPrivacyPolicyActivity.a(a).setVisibility(0);
        }
    }

    public void onPageStarted(WebView webview, String s, Bitmap bitmap)
    {
        super.onPageStarted(webview, s, bitmap);
        if (!a.isFinishing())
        {
            com.jcp.b.a.a(a, 0x7f070276);
        }
    }

    public void onReceivedError(WebView webview, int i, String s, String s1)
    {
        Toast.makeText(a, a.getString(0x7f0702b7), 1).show();
        com.jcp.b.a.i();
        super.onReceivedError(webview, i, s, s1);
    }

    public boolean shouldOverrideUrlLoading(WebView webview, String s)
    {
        webview.loadUrl(s);
        return true;
    }
}
