// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.Window;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import com.roidapp.baselib.c.n;
import com.roidapp.photogrid.common.b;
import com.roidapp.photogrid.common.cc;

// Referenced classes of package com.roidapp.photogrid.release:
//            ParentActivity, lk

public class More extends ParentActivity
{

    private static boolean c = false;
    private WebView a;
    private ProgressBar b;
    private boolean d;

    public More()
    {
        d = false;
    }

    static ProgressBar a(More more)
    {
        return more.b;
    }

    private void a()
    {
        PreferenceManager.getDefaultSharedPreferences(this).edit().putBoolean("more_app_new", true).apply();
    }

    static boolean b(More more)
    {
        return more.d;
    }

    static WebView c(More more)
    {
        return more.a;
    }

    private void c(String s)
    {
        if (s.contains("cleanmaster") && d)
        {
            if (a != null)
            {
                a.loadUrl("javascript:hide()");
            }
            a();
        }
        s = Uri.parse(s);
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setFlags(0x10000000);
        intent.setData(s);
        startActivity(intent);
    }

    public final void a(String s)
    {
        com.roidapp.photogrid.common.b.a((new StringBuilder("MoreApp/")).append(s).append("/Click/Http").toString());
        try
        {
            Intent intent = new Intent("android.intent.action.VIEW");
            Uri uri = Uri.parse(s);
            intent.setFlags(0x10000000);
            intent.setData(uri);
            intent.setClassName("com.android.browser", "com.android.browser.BrowserActivity");
            startActivity(intent);
            return;
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
            try
            {
                Intent intent1 = new Intent("android.intent.action.VIEW");
                Uri uri1 = Uri.parse(s);
                intent1.setFlags(0x10000000);
                intent1.setData(uri1);
                intent1.setPackage("com.android.browser");
                startActivity(intent1);
                return;
            }
            catch (Exception exception1)
            {
                exception.printStackTrace();
            }
            c(s);
            return;
        }
    }

    public final void b(String s)
    {
        com.roidapp.photogrid.common.b.a((new StringBuilder("MoreApp/")).append(s).append("/Click/GooglePlay").toString());
        try
        {
            Uri uri = Uri.parse(s);
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setFlags(0x10000000);
            intent.setClassName("com.android.vending", "com.google.android.finsky.activities.MainActivity");
            intent.setData(uri);
            startActivity(intent);
            return;
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
        }
        try
        {
            Uri uri1 = Uri.parse(s);
            Intent intent1 = new Intent("android.intent.action.VIEW");
            intent1.setPackage("com.android.vending");
            intent1.setFlags(0x10000000);
            intent1.setData(uri1);
            startActivity(intent1);
            return;
        }
        catch (Exception exception1)
        {
            a(s);
            exception1.printStackTrace();
            return;
        }
    }

    public void go(String s)
    {
        Object obj = s.substring(s.indexOf("com."), s.indexOf("http://"));
        if (n.a(this, "com.android.vending"))
        {
            String s1 = s.substring(0, s.indexOf("http://"));
            com.roidapp.photogrid.common.b.a((new StringBuilder("MoreApp/")).append(((String) (obj))).append("/Click/GooglePlay").toString());
            if (s1.contains("cleanmaster"))
            {
                if (d)
                {
                    if (a != null)
                    {
                        a.loadUrl("javascript:hide()");
                    }
                    a();
                }
                s = "&referrer=utm_source%3D200019%26utm_campaign%3Dphotogrid";
            } else
            if (s1.contains("batterydoctor"))
            {
                s = "&referrer=utm_source%3D10030006%26utm_campaign%3Dphotogrid1";
            } else
            {
                s = "&referrer=utm_source%3Dphotogrid";
            }
            try
            {
                obj = Uri.parse((new StringBuilder()).append(s1).append(s).toString());
                Intent intent2 = new Intent("android.intent.action.VIEW");
                intent2.setFlags(0x10000000);
                intent2.setClassName("com.android.vending", "com.google.android.finsky.activities.MainActivity");
                intent2.setData(((Uri) (obj)));
                startActivity(intent2);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                ((Exception) (obj)).printStackTrace();
            }
            try
            {
                s = Uri.parse((new StringBuilder()).append(s1).append(s).toString());
                obj = new Intent("android.intent.action.VIEW");
                ((Intent) (obj)).setPackage("com.android.vending");
                ((Intent) (obj)).setFlags(0x10000000);
                ((Intent) (obj)).setData(s);
                startActivity(((Intent) (obj)));
                return;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                a(s1);
            }
            s.printStackTrace();
            return;
        }
        com.roidapp.photogrid.common.b.a((new StringBuilder("MoreApp/")).append(((String) (obj))).append("/Click/Http").toString());
        s = s.substring(s.indexOf("http://"));
        if (s.contains("cleanmaster") && d)
        {
            if (a != null)
            {
                a.loadUrl("javascript:hide()");
            }
            a();
        }
        try
        {
            Intent intent = new Intent("android.intent.action.VIEW");
            Uri uri = Uri.parse(s);
            intent.setFlags(0x10000000);
            intent.setData(uri);
            intent.setClassName("com.android.browser", "com.android.browser.BrowserActivity");
            startActivity(intent);
            return;
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
            try
            {
                Intent intent1 = new Intent("android.intent.action.VIEW");
                Uri uri1 = Uri.parse(s);
                intent1.setFlags(0x10000000);
                intent1.setData(uri1);
                intent1.setPackage("com.android.browser");
                startActivity(intent1);
                return;
            }
            catch (Exception exception1)
            {
                exception.printStackTrace();
            }
            c(s);
            return;
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        getWindow().setFlags(1024, 1024);
        requestWindowFeature(1);
        requestWindowFeature(2);
        try
        {
            setContentView(0x7f0300e7);
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            bundle.printStackTrace();
            v = true;
            (new cc(this)).a();
        }
        if (!v)
        {
            boolean flag;
            if (!PreferenceManager.getDefaultSharedPreferences(this).getBoolean("more_app_new", false))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            d = flag;
            b = (ProgressBar)findViewById(0x7f0d03ad);
            a = (WebView)findViewById(0x7f0d03ac);
            a.setWebChromeClient(new lk(this));
            a.setWebViewClient(new _cls2());
            bundle = a.getSettings();
            bundle.setSavePassword(false);
            bundle.setSaveFormData(false);
            bundle.setJavaScriptEnabled(true);
            bundle.setSupportZoom(true);
            bundle.setBuiltInZoomControls(true);
            a.loadUrl("http://dl.cm.ksmobile.com/photogrid/PhotoGrid_More/MoreApp.html");
            if (c)
            {
                c("http://dl.cm.ksmobile.com/photogrid/PhotoGrid_More/MoreApp.html");
                c = false;
            }
        }
    }

    public void onDestroy()
    {
        if (u != null)
        {
            u.removeAllViews();
        }
        com.roidapp.photogrid.common.b.a("MoreApp/onDestroy1");
        if (a != null)
        {
            com.roidapp.photogrid.common.b.a("MoreApp/onDestroy2");
            a.clearCache(true);
        }
        com.roidapp.photogrid.common.b.a("MoreApp/onDestroy3");
        super.onDestroy();
    }

    public final void x()
    {
        t = "more";
    }


    private class _cls2 extends WebViewClient
    {

        final More a;

        public boolean shouldOverrideUrlLoading(WebView webview, String s)
        {
            if (s.startsWith("market://"))
            {
                s.substring(s.indexOf("?id=") + 4, s.lastIndexOf("http://"));
                a.go(s);
            } else
            if (n.a(a, "com.android.vending") && s.contains("play.google"))
            {
                a.b(s);
            } else
            {
                a.a(s);
            }
            return true;
        }

        _cls2()
        {
            a = More.this;
            super();
        }
    }

}
