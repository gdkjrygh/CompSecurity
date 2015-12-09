// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.activities;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.webkit.CookieManager;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import com.cardinalblue.android.b.k;

// Referenced classes of package com.cardinalblue.android.piccollage.activities:
//            BaseFragmentActivity

public class BaseWebActivity extends BaseFragmentActivity
{

    protected ProgressBar a;
    protected WebView b;

    public BaseWebActivity()
    {
    }

    protected void a()
    {
        CookieManager.getInstance().removeAllCookie();
        b.clearCache(true);
        b.clearFormData();
    }

    protected void a(WebViewClient webviewclient)
    {
        b.setWebViewClient(webviewclient);
    }

    protected void onCreate(Bundle bundle)
    {
        supportRequestWindowFeature(2);
        super.onCreate(bundle);
        setContentView(0x7f030041);
        setSupportActionBar((Toolbar)findViewById(0x7f1000c5));
        getSupportActionBar().setDisplayShowHomeEnabled(false);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        a = (ProgressBar)findViewById(0x7f100105);
        b = (WebView)findViewById(0x7f1000d5);
        b.getSettings().setAppCacheEnabled(false);
        b.getSettings().setJavaScriptEnabled(true);
        b.setWebChromeClient(new WebChromeClient() {

            final BaseWebActivity a;

            public void onProgressChanged(WebView webview, int i)
            {
                a.setProgress(i * 100);
                if (i == 100)
                {
                    a.a.setVisibility(8);
                }
            }

            
            {
                a = BaseWebActivity.this;
                super();
            }
        });
    }

    protected void onDestroy()
    {
        super.onDestroy();
        a();
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        switch (menuitem.getItemId())
        {
        default:
            return super.onOptionsItemSelected(menuitem);

        case 16908332: 
            finish();
            break;
        }
        return true;
    }

    protected void onResume()
    {
        super.onResume();
        if (!k.b(this))
        {
            k.a(this, 0x7f07021d, 1);
            finish();
        }
    }

    protected void onStart()
    {
        super.onStart();
        a();
    }
}
