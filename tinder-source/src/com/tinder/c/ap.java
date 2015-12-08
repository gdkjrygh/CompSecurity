// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.c;

import android.app.Dialog;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.Window;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;
import com.tinder.a.f;
import com.tinder.utils.ad;

public final class ap extends Dialog
    implements android.view.View.OnClickListener
{

    private WebView a;
    private String b;

    public ap(Context context, String s, String s1)
    {
        super(context, 0x1030010);
        int i = ad.a(context);
        int j = ad.b(context);
        getWindow().setLayout(i, j);
        getWindow().setWindowAnimations(0x7f0b01df);
        setContentView(0x7f0300bb);
        findViewById(0x7f0e008a).setOnClickListener(this);
        context = (TextView)findViewById(0x7f0e01ab);
        context.setText(s1);
        context.setOnClickListener(this);
        a = (WebView)findViewById(0x7f0e037a);
        if (!ad.a())
        {
            a.setLayerType(1, null);
        }
        a.setScrollBarStyle(0x2000000);
        context = a.getSettings();
        context.setLoadWithOverviewMode(true);
        context.setJavaScriptEnabled(true);
        context.setBuiltInZoomControls(true);
        context.setUserAgentString(f.a);
        a.setWebViewClient(new WebViewClient() {

            final ap a;

            public final boolean shouldOverrideUrlLoading(WebView webview, String s2)
            {
                webview = Uri.parse(s2).getHost();
                return !ap.a(a).equals(webview);
            }

            
            {
                a = ap.this;
                super();
            }
        });
        a.loadUrl(s);
        b = Uri.parse(s).getHost();
    }

    static String a(ap ap1)
    {
        return ap1.b;
    }

    public final void onClick(View view)
    {
        switch (view.getId())
        {
        default:
            return;

        case 2131624363: 
            dismiss();
            return;

        case 2131624074: 
            dismiss();
            return;
        }
    }
}
