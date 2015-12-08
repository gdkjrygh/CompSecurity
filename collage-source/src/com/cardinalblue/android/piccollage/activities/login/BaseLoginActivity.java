// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.activities.login;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.database.sqlite.SQLiteDiskIOException;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.cardinalblue.android.b.k;
import com.cardinalblue.android.piccollage.a.b;
import com.cardinalblue.android.piccollage.activities.BaseFragmentActivity;
import com.cardinalblue.android.piccollage.view.fragments.e;

public abstract class BaseLoginActivity extends BaseFragmentActivity
{
    public class a extends WebViewClient
    {

        final BaseLoginActivity a;

        public void onPageFinished(WebView webview, String s)
        {
            super.onPageFinished(webview, s);
            a.f();
        }

        public void onPageStarted(WebView webview, String s, Bitmap bitmap)
        {
            super.onPageStarted(webview, s, bitmap);
            a.e();
        }

        public a()
        {
            a = BaseLoginActivity.this;
            super();
        }
    }


    protected WebView a;
    protected ProgressDialog b;

    public BaseLoginActivity()
    {
    }

    private void h()
    {
        a = (WebView)findViewById(0x7f1000d5);
        a.setWebViewClient(d());
        a.getSettings().setSavePassword(false);
        a.getSettings().setAppCacheEnabled(false);
        a.getSettings().setJavaScriptEnabled(true);
        try
        {
            a.clearCache(true);
        }
        catch (SQLiteDiskIOException sqlitediskioexception) { }
        a.clearFormData();
        a.setWebChromeClient(new WebChromeClient() {

            final BaseLoginActivity a;

            public void onProgressChanged(WebView webview, int j)
            {
                a.setProgress(j * 100);
            }

            
            {
                a = BaseLoginActivity.this;
                super();
            }
        });
    }

    private void i()
    {
        b = new ProgressDialog(this);
        b.requestWindowFeature(1);
        b.setMessage(getString(0x7f0701fa));
        b.setCancelable(true);
        b.setCanceledOnTouchOutside(false);
        b.setOnCancelListener(new android.content.DialogInterface.OnCancelListener() {

            final BaseLoginActivity a;

            public void onCancel(DialogInterface dialoginterface)
            {
                a.setResult(0);
                com.cardinalblue.android.piccollage.a.b.aZ();
                a.finish();
            }

            
            {
                a = BaseLoginActivity.this;
                super();
            }
        });
    }

    protected abstract void a();

    protected void b()
    {
        a();
        a.clearCache(true);
        a.clearFormData();
    }

    protected abstract void c();

    protected WebViewClient d()
    {
        return new a();
    }

    protected void e()
    {
        if (b != null && k.a(this))
        {
            k.b(this, b);
        }
    }

    protected void f()
    {
        if (b != null && k.a(this))
        {
            k.a(this, b);
        }
    }

    protected abstract void g();

    protected void onCreate(Bundle bundle)
    {
        supportRequestWindowFeature(2);
        super.onCreate(bundle);
        setContentView(0x7f030035);
        setSupportActionBar((Toolbar)findViewById(0x7f1000c5));
        getSupportActionBar().setDisplayShowHomeEnabled(false);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        h();
        i();
    }

    protected void onDestroy()
    {
        super.onDestroy();
        c();
        b();
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        switch (menuitem.getItemId())
        {
        default:
            return super.onOptionsItemSelected(menuitem);

        case 16908332: 
            setResult(0);
            break;
        }
        com.cardinalblue.android.piccollage.a.b.aZ();
        finish();
        return true;
    }

    protected void onPause()
    {
        super.onPause();
        f();
    }

    protected void onResume()
    {
        super.onResume();
        if (!k.b(this))
        {
            e e1 = com.cardinalblue.android.piccollage.view.fragments.e.a(getString(0x7f0700f9), getString(0x7f07021d), getString(0x104000a), new android.content.DialogInterface.OnClickListener() {

                final BaseLoginActivity a;

                public void onClick(DialogInterface dialoginterface, int j)
                {
                    a.finish();
                }

            
            {
                a = BaseLoginActivity.this;
                super();
            }
            });
            e1.setCancelable(false);
            k.a(this, e1, "error_no_network");
            setResult(0);
            return;
        } else
        {
            g();
            return;
        }
    }
}
