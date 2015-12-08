// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.ui;

import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.fitbit.config.BuildType;
import com.fitbit.config.b;
import java.io.File;

// Referenced classes of package com.fitbit.ui:
//            ProgressFragmentActivity

public class WebViewActivity extends ProgressFragmentActivity
{
    private class a extends WebViewClient
    {

        final WebViewActivity a;

        public void onPageFinished(WebView webview, String s)
        {
            if (com.fitbit.ui.WebViewActivity.b(a) != null && !s.contains("#"))
            {
                webview.loadUrl((new StringBuilder()).append(webview.getUrl()).append("#").append(com.fitbit.ui.WebViewActivity.b(a)).toString());
                WebViewActivity.a(a, null);
            }
            super.onPageFinished(webview, s);
        }

        public void onPageStarted(WebView webview, String s, Bitmap bitmap)
        {
            if (s.contains("#"))
            {
                int i1 = s.indexOf("#") + 1;
                WebViewActivity.a(a, s.substring(i1));
                s = s.substring(0, i1 - 1);
                webview.stopLoading();
                webview.loadUrl(s);
                return;
            } else
            {
                super.onPageStarted(webview, s, bitmap);
                return;
            }
        }

        public void onReceivedError(WebView webview, int i1, String s, String s1)
        {
            com.fitbit.e.a.a("WebView", s, new Object[0]);
            a.f = true;
            a.runOnUiThread(a.e);
        }

        public boolean shouldOverrideUrlLoading(WebView webview, String s)
        {
            if (!a.a(webview, s))
            {
                webview.loadUrl(s);
            }
            return true;
        }

        private a()
        {
            a = WebViewActivity.this;
            super();
        }

    }


    protected static final String a = "label";
    protected static final String b = "url";
    protected static final String c = "supportZoom";
    private static final String i = "WebViewActivity";
    private static final int k = 1;
    ProgressDialog d;
    Runnable e;
    boolean f;
    boolean g;
    protected boolean h;
    private WebView j;
    private boolean l;
    private String m;
    private String n;

    public WebViewActivity()
    {
        f = true;
        g = false;
        h = true;
        l = false;
        m = null;
    }

    static WebView a(WebViewActivity webviewactivity)
    {
        return webviewactivity.j;
    }

    static String a(WebViewActivity webviewactivity, String s)
    {
        webviewactivity.m = s;
        return s;
    }

    public static void a(Activity activity, String s, String s1)
    {
        a(activity, s, s1, false);
    }

    public static void a(Activity activity, String s, String s1, boolean flag)
    {
        Intent intent = new Intent(activity, com/fitbit/ui/WebViewActivity);
        intent.putExtra("label", s);
        intent.putExtra("url", s1);
        intent.putExtra("supportZoom", flag);
        activity.startActivity(intent);
    }

    static String b(WebViewActivity webviewactivity)
    {
        return webviewactivity.m;
    }

    private void i()
    {
        j.setScrollBarStyle(0);
        j.getSettings().setJavaScriptEnabled(true);
        if (l)
        {
            j.getSettings().setSupportZoom(true);
            j.getSettings().setBuiltInZoomControls(true);
            j.getSettings().setDisplayZoomControls(false);
        }
        j.getSettings().setDomStorageEnabled(true);
        j.getSettings().setAppCacheEnabled(true);
        j.getSettings().setDatabaseEnabled(true);
        String s = getApplicationContext().getDir("database", 0).getPath();
        j.getSettings().setDatabasePath(s);
        j.setWebViewClient(new a());
        j.setWebChromeClient(new WebChromeClient() {

            final WebViewActivity a;

            public void onConsoleMessage(String s1, int i1, String s2)
            {
                com.fitbit.e.a.a("WebViewActivity", "string:%s in %s message", new Object[] {
                    Integer.valueOf(i1), s2
                });
            }

            public void onExceededDatabaseQuota(String s1, String s2, long l1, long l2, long l3, android.webkit.WebStorage.QuotaUpdater quotaupdater)
            {
                quotaupdater.updateQuota(2L * l2);
            }

            public boolean onJsAlert(WebView webview, String s1, String s2, JsResult jsresult)
            {
                if (b.a.a())
                {
                    com.fitbit.e.a.a("Alert", ">> url :%s, msg: %s", new Object[] {
                        s1, s2
                    });
                }
                jsresult.confirm();
                return false;
            }

            public boolean onJsConfirm(WebView webview, String s1, String s2, JsResult jsresult)
            {
                return super.onJsConfirm(webview, s1, s2, jsresult);
            }

            public void onProgressChanged(WebView webview, int i1)
            {
                webview = a;
                boolean flag;
                if (i1 >= 100)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                webview.f = flag;
                a.runOnUiThread(a.e);
            }

            
            {
                a = WebViewActivity.this;
                super();
            }
        });
    }

    private Dialog j()
    {
        d = new ProgressDialog(this);
        d.setTitle("");
        d.setMessage(getString(0x7f080336));
        d.setIndeterminate(true);
        d.setCancelable(true);
        d.setOnCancelListener(new android.content.DialogInterface.OnCancelListener() {

            final WebViewActivity a;

            public void onCancel(DialogInterface dialoginterface)
            {
                a.g = false;
                WebViewActivity.a(a).stopLoading();
                if (WebViewActivity.a(a).canGoBack())
                {
                    WebViewActivity.a(a).goBack();
                    return;
                } else
                {
                    a.onBackPressed();
                    return;
                }
            }

            
            {
                a = WebViewActivity.this;
                super();
            }
        });
        return d;
    }

    protected boolean a(WebView webview, String s)
    {
        if (s.startsWith("tel:"))
        {
            startActivity(new Intent("android.intent.action.DIAL", Uri.parse(s)));
            return true;
        }
        if (s.startsWith("mailto:"))
        {
            webview = s.replaceFirst("mailto:", "").trim();
            s = new Intent("android.intent.action.SEND");
            s.setType("plain/text").putExtra("android.intent.extra.EMAIL", new String[] {
                webview
            });
            startActivity(s);
            return true;
        } else
        {
            return false;
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f040054);
        if (getIntent().getStringExtra("label") != null);
        n = getIntent().getStringExtra("url");
        if (n == null)
        {
            n = "http://www.google.com";
        }
        l = getIntent().getBooleanExtra("supportZoom", false);
        e = new Runnable() {

            final WebViewActivity a;

            public void run()
            {
                if (!a.g)
                {
                    return;
                }
                if (!a.f)
                {
                    a.f();
                    return;
                }
                try
                {
                    a.g();
                    return;
                }
                catch (Exception exception)
                {
                    exception.printStackTrace();
                }
            }

            
            {
                a = WebViewActivity.this;
                super();
            }
        };
        j = (WebView)findViewById(0x7f1101e3);
        if (bundle != null)
        {
            j.restoreState(bundle);
            i();
            return;
        } else
        {
            i();
            j.loadUrl(n);
            return;
        }
    }

    protected Dialog onCreateDialog(int i1)
    {
        switch (i1)
        {
        default:
            throw new IllegalArgumentException();

        case 1: // '\001'
            return j();
        }
    }

    public boolean onKeyDown(int i1, KeyEvent keyevent)
    {
        if (h && i1 == 4 && j.canGoBack() && !j.getUrl().equals(n))
        {
            j.goBack();
            return true;
        } else
        {
            return super.onKeyDown(i1, keyevent);
        }
    }

    protected void onPause()
    {
        g = false;
        super.onPause();
    }

    protected void onResume()
    {
        g = true;
        super.onResume();
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        j.saveState(bundle);
    }
}
