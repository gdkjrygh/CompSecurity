// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;

import android.graphics.Bitmap;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.jcp.b.a;

// Referenced classes of package com.jcp.fragments:
//            fa, fb

class fc extends WebViewClient
{

    final fa a;

    private fc(fa fa1)
    {
        a = fa1;
        super();
    }

    fc(fa fa1, fb fb)
    {
        this(fa1);
    }

    public void onPageFinished(WebView webview, String s)
    {
        super.onPageFinished(webview, s);
        if (com.jcp.fragments.fa.a(a) != -1)
        {
            webview.loadUrl("javascript:$('#pageHeader').remove();$('footer').children().remove();$('header').remove();$('main').css('top','25px');$('table').css('border','0');$('td').css('background-color', 'white');");
        }
        com.jcp.b.a.i();
        webview.setVisibility(0);
    }

    public void onPageStarted(WebView webview, String s, Bitmap bitmap)
    {
        super.onPageStarted(webview, s, bitmap);
        if (a.i() != null)
        {
            com.jcp.fragments.fa.a(a, 8);
            com.jcp.b.a.a(a.i(), 0x7f070276);
        }
    }

    public void onReceivedError(WebView webview, int i, String s, String s1)
    {
        super.onReceivedError(webview, i, s, s1);
        com.jcp.b.a.i();
    }
}
