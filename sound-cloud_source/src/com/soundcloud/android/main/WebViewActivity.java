// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.main;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

// Referenced classes of package com.soundcloud.android.main:
//            TrackedActivity

public class WebViewActivity extends TrackedActivity
{

    public WebViewActivity()
    {
    }

    public void onCreate(Bundle bundle)
    {
        Uri uri;
        if (getIntent() != null)
        {
            uri = getIntent().getData();
        } else
        {
            uri = null;
        }
        if (uri != null)
        {
            super.onCreate(bundle);
            bundle = (WebView)findViewById(0x7f0f02a7);
            bundle.getSettings().setJavaScriptEnabled(true);
            bundle.getSettings().setDomStorageEnabled(true);
            bundle.getSettings().setBlockNetworkImage(false);
            bundle.getSettings().setLoadsImagesAutomatically(true);
            bundle.setWebViewClient(new _cls1());
            bundle.loadUrl(uri.toString());
            return;
        } else
        {
            finish();
            return;
        }
    }

    protected void setActivityContentView()
    {
        setContentView(0x7f0300dd);
    }

    private class _cls1 extends WebViewClient
    {

        final WebViewActivity this$0;

        public boolean shouldOverrideUrlLoading(WebView webview, String s)
        {
            return false;
        }

        _cls1()
        {
            this$0 = WebViewActivity.this;
            super();
        }
    }

}
