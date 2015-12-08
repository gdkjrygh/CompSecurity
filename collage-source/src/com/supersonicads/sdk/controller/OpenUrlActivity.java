// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.supersonicads.sdk.controller;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.supersonicads.sdk.agent.b;
import com.supersonicads.sdk.b.c;
import com.supersonicads.sdk.b.e;
import com.supersonicads.sdk.b.f;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.supersonicads.sdk.controller:
//            SupersonicWebView

public class OpenUrlActivity extends Activity
{
    private class a extends WebViewClient
    {

        final OpenUrlActivity a;

        public void onPageFinished(WebView webview, String s)
        {
            super.onPageFinished(webview, s);
            OpenUrlActivity.a(a).setVisibility(4);
        }

        public void onPageStarted(WebView webview, String s, Bitmap bitmap)
        {
            super.onPageStarted(webview, s, bitmap);
            OpenUrlActivity.a(a).setVisibility(0);
        }

        public void onReceivedError(WebView webview, int i, String s, String s1)
        {
            super.onReceivedError(webview, i, s, s1);
        }

        public boolean shouldOverrideUrlLoading(WebView webview, String s)
        {
label0:
            {
                Object obj = com.supersonicads.sdk.b.f.a().d();
                if (obj == null || ((List) (obj)).isEmpty())
                {
                    break label0;
                }
                obj = ((List) (obj)).iterator();
                do
                {
                    if (!((Iterator) (obj)).hasNext())
                    {
                        break label0;
                    }
                } while (!s.contains((String)((Iterator) (obj)).next()));
                webview = new Intent("android.intent.action.VIEW", Uri.parse(s));
                a.startActivity(webview);
                com.supersonicads.sdk.controller.OpenUrlActivity.b(a).i();
                a.finish();
                return true;
            }
            return super.shouldOverrideUrlLoading(webview, s);
        }

        private a()
        {
            a = OpenUrlActivity.this;
            super();
        }

    }


    boolean a;
    private WebView b;
    private SupersonicWebView c;
    private ProgressBar d;
    private RelativeLayout e;
    private String f;

    public OpenUrlActivity()
    {
        b = null;
    }

    static ProgressBar a(OpenUrlActivity openurlactivity)
    {
        return openurlactivity.d;
    }

    private void a()
    {
        android.widget.RelativeLayout.LayoutParams layoutparams = new android.widget.RelativeLayout.LayoutParams(-1, -1);
        b = new WebView(this);
        b.setId(1);
        b.setWebViewClient(new WebViewClient());
        b.getSettings().setJavaScriptEnabled(true);
        b.setWebViewClient(new a());
        e.addView(b, layoutparams);
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            d = new ProgressBar(new ContextThemeWrapper(this, 0x1030073));
        } else
        {
            d = new ProgressBar(this);
        }
        layoutparams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        layoutparams.addRule(13);
        d.setLayoutParams(layoutparams);
        d.setVisibility(4);
        e.addView(d);
        a(f);
        if (c != null)
        {
            c.a(true, "secondary");
        }
    }

    static SupersonicWebView b(OpenUrlActivity openurlactivity)
    {
        return openurlactivity.c;
    }

    private void b()
    {
        requestWindowFeature(1);
    }

    private void c()
    {
        getWindow().setFlags(1024, 1024);
    }

    public void a(String s)
    {
        b.stopLoading();
        b.clearHistory();
        try
        {
            b.loadUrl(s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            com.supersonicads.sdk.b.c.b("OpenUrlActivity", (new StringBuilder()).append("OpenUrlActivity:: loadUrl: ").append(s.toString()).toString());
        }
        (new e()).execute(new String[] {
            (new StringBuilder()).append("https://www.supersonicads.com/mobile/sdk5/log?method=").append(s.getStackTrace()[0].getMethodName()).toString()
        });
    }

    public void finish()
    {
        if (a)
        {
            c.b("secondaryClose");
        }
        super.finish();
    }

    public void onBackPressed()
    {
        if (b.canGoBack())
        {
            b.goBack();
            return;
        } else
        {
            super.onBackPressed();
            return;
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        com.supersonicads.sdk.b.c.a("OpenUrlActivity", "onCreate()");
        c = com.supersonicads.sdk.agent.b.d(this).d();
        b();
        c();
        bundle = getIntent().getExtras();
        f = bundle.getString(com.supersonicads.sdk.controller.SupersonicWebView.f);
        a = bundle.getBoolean(SupersonicWebView.g);
        e = new RelativeLayout(this);
        setContentView(e, new android.view.ViewGroup.LayoutParams(-1, -1));
    }

    protected void onDestroy()
    {
        super.onDestroy();
    }

    protected void onPause()
    {
        super.onPause();
        if (c != null)
        {
            c.a(false, "secondary");
            if (e != null)
            {
                ViewGroup viewgroup = (ViewGroup)b.getParent();
                if (viewgroup.findViewById(1) != null)
                {
                    viewgroup.removeView(b);
                    b.destroy();
                }
            }
        }
    }

    protected void onResume()
    {
        super.onResume();
        a();
    }
}
