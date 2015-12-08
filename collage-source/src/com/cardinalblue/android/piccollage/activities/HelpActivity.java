// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.activities;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.cardinalblue.android.b.k;
import com.cardinalblue.android.piccollage.a.i;

// Referenced classes of package com.cardinalblue.android.piccollage.activities:
//            BaseActivity

public class HelpActivity extends BaseActivity
{

    private static int a = 5;
    private int b;
    private WebView c;

    public HelpActivity()
    {
    }

    static int a()
    {
        return a;
    }

    static int a(HelpActivity helpactivity)
    {
        return helpactivity.b;
    }

    static int b(HelpActivity helpactivity)
    {
        int j = helpactivity.b;
        helpactivity.b = j + 1;
        return j;
    }

    static WebView c(HelpActivity helpactivity)
    {
        return helpactivity.c;
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f03002d);
        setSupportActionBar((Toolbar)findViewById(0x7f1000c5));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("");
        c = (WebView)findViewById(0x7f1000d2);
        c.getSettings().setJavaScriptEnabled(true);
        c.getSettings().setCacheMode(2);
        c.setWebViewClient(new WebViewClient() {

            final HelpActivity a;

            public void onReceivedError(WebView webview, WebResourceRequest webresourcerequest, WebResourceError webresourceerror)
            {
                if (HelpActivity.a(a) < HelpActivity.a())
                {
                    HelpActivity.b(a);
                    HelpActivity.c(a).stopLoading();
                    HelpActivity.c(a).reload();
                    return;
                } else
                {
                    HelpActivity.c(a).loadUrl("about:blank");
                    k.a(a, 0x7f0700f8, 0);
                    return;
                }
            }

            public boolean shouldOverrideUrlLoading(WebView webview, String s)
            {
                if (s.equals("piccollage://close"))
                {
                    webview.stopLoading();
                    a.finish();
                    return true;
                } else
                {
                    return super.shouldOverrideUrlLoading(webview, s);
                }
            }

            
            {
                a = HelpActivity.this;
                super();
            }
        });
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(0x7f110011, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        switch (menuitem.getItemId())
        {
        default:
            return super.onOptionsItemSelected(menuitem);

        case 16908332: 
            finish();
            return true;

        case 2131755762: 
            i.b(this);
            break;
        }
        return true;
    }

    protected void onStart()
    {
        super.onStart();
        b = 0;
        c.loadUrl((new StringBuilder()).append("file:///android_asset/HelpPage.bundle/").append(getString(0x7f0701cd)).toString());
    }

    protected void onStop()
    {
        super.onStop();
        c.clearCache(true);
        c.clearHistory();
        c.loadUrl("about:blank");
    }

}
