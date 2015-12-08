// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.activities;

import android.graphics.Bitmap;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.jcp.b.a;
import com.jcp.views.JCPWebView;

// Referenced classes of package com.jcp.activities:
//            JCPWebViewActivity, u

class v extends WebViewClient
{

    final JCPWebViewActivity a;

    private v(JCPWebViewActivity jcpwebviewactivity)
    {
        a = jcpwebviewactivity;
        super();
    }

    v(JCPWebViewActivity jcpwebviewactivity, u u)
    {
        this(jcpwebviewactivity);
    }

    public void onPageFinished(WebView webview, String s)
    {
        super.onPageFinished(webview, s);
        webview.loadUrl("javascript:$('#pageHeader').remove();$('footer').children().remove();$('header').remove();$('main').css('top','-100px');$('table').css('border','0');$('td').css('background-color', 'white');$('table').css('width','100%');");
        com.jcp.b.a.i();
        com.jcp.activities.JCPWebViewActivity.a(a).setVisibility(0);
    }

    public void onPageStarted(WebView webview, String s, Bitmap bitmap)
    {
        super.onPageStarted(webview, s, bitmap);
        com.jcp.b.a.a(a, 0x7f070276);
    }

    public void onReceivedError(WebView webview, int i, String s, String s1)
    {
        super.onReceivedError(webview, i, s, s1);
        com.jcp.b.a.i();
    }
}
