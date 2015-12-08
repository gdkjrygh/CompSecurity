// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hmobile.biblekjv;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class TwitterClass extends Activity
    implements android.view.View.OnClickListener
{

    String url;
    WebView webview;

    public TwitterClass()
    {
    }

    public void onClick(View view)
    {
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f030035);
        bundle = getIntent().getExtras();
        if (bundle != null)
        {
            url = bundle.getString("url");
        }
        new ProgressDialog(this);
        webview = (WebView)findViewById(0x7f0e0135);
        webview.getSettings().setJavaScriptEnabled(true);
        webview.loadUrl(url);
    }
}
