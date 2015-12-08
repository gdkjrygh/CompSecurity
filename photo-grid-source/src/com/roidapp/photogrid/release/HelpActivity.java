// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.roidapp.photogrid.cloud.w;
import com.roidapp.photogrid.common.an;
import com.roidapp.photogrid.common.cc;
import java.util.Locale;

// Referenced classes of package com.roidapp.photogrid.release:
//            ParentActivity

public class HelpActivity extends ParentActivity
    implements android.view.View.OnClickListener
{

    private WebView a;
    private View b;
    private View c;
    private String d;
    private String e;

    public HelpActivity()
    {
    }

    static View a(HelpActivity helpactivity)
    {
        return helpactivity.b;
    }

    static String a(HelpActivity helpactivity, String s)
    {
        helpactivity.e = s;
        return s;
    }

    public static void a(Context context, String s)
    {
        Intent intent = new Intent(context, com/roidapp/photogrid/release/HelpActivity);
        String s1 = w.a(an.a(context));
        if ("en".equals(s1))
        {
            s1 = "";
        } else
        if ("zh".equals(s1))
        {
            StringBuilder stringbuilder = (new StringBuilder()).append(s1);
            if (Locale.getDefault().getCountry().equalsIgnoreCase("CN"))
            {
                s1 = "-rCN";
            } else
            {
                s1 = "-rTW";
            }
            s1 = stringbuilder.append(s1).append("/").toString();
        } else
        {
            s1 = (new StringBuilder()).append(s1).append("/").toString();
        }
        intent.putExtra("url", (new StringBuilder("http://dl.pg.ksmobile.com/help/")).append(s1).append(s).append(".html").toString());
        context.startActivity(intent);
    }

    static View b(HelpActivity helpactivity)
    {
        return helpactivity.c;
    }

    public void onClick(View view)
    {
label0:
        {
            if (!isFinishing())
            {
                if (a == null || e == null || c == null)
                {
                    break label0;
                }
                c.setVisibility(8);
                if (b != null)
                {
                    b.setVisibility(0);
                }
                a.loadUrl(e);
            }
            return;
        }
        finish();
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        try
        {
            setContentView(0x7f0300d0);
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
            a = (WebView)findViewById(0x7f0d01e9);
            b = findViewById(0x7f0d019e);
            c = findViewById(0x7f0d036d);
            c.setOnClickListener(this);
            bundle = getIntent().getStringExtra("url");
            d = bundle;
            e = bundle;
            bundle = a.getSettings();
            if (bundle != null)
            {
                bundle.setJavaScriptEnabled(true);
            }
            if (a != null)
            {
                a.setWebViewClient(new MyWebViewClient());
            }
            if (d != null && a != null)
            {
                if (b != null)
                {
                    b.setVisibility(0);
                }
                a.loadUrl(d);
            }
        }
    }

    public void onDestroy()
    {
        if (a != null)
        {
            a.stopLoading();
        }
        super.onDestroy();
    }

    public boolean onKeyDown(int i, KeyEvent keyevent)
    {
        if (c != null && i == 4 && c.getVisibility() != 0 && !TextUtils.equals(d, e) && a != null)
        {
            a.loadUrl(d);
            return true;
        } else
        {
            return super.onKeyDown(i, keyevent);
        }
    }

    protected void onPause()
    {
        super.onPause();
    }

    protected void onResume()
    {
        super.onResume();
        if (!v && d == null)
        {
            finish();
        }
    }

    protected void onStart()
    {
        super.onStart();
    }

    public final void x()
    {
    }

    private class MyWebViewClient extends WebViewClient
    {

        private final WeakReference a;

        private void openBrowser(Context context, String s)
        {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(s));
            try
            {
                context.startActivity(intent);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                return;
            }
        }

        public void onPageFinished(WebView webview, String s)
        {
            webview = (HelpActivity)a.get();
            if (webview != null && !webview.isFinishing() && HelpActivity.a(webview) != null && HelpActivity.a(webview).getVisibility() == 0)
            {
                HelpActivity.a(webview).setVisibility(8);
            }
        }

        public void onPageStarted(WebView webview, String s, Bitmap bitmap)
        {
            HelpActivity helpactivity = (HelpActivity)a.get();
            if (helpactivity != null && !helpactivity.isFinishing() && s != null && s.startsWith("http"))
            {
                HelpActivity.a(helpactivity, s);
            }
            super.onPageStarted(webview, s, bitmap);
        }

        public void onReceivedError(WebView webview, int i, String s, String s1)
        {
            s = (HelpActivity)a.get();
            if (s != null && !s.isFinishing())
            {
                if (webview != null)
                {
                    webview.loadData("", "text/plain", "UTF-8");
                }
                if (HelpActivity.a(s) != null && HelpActivity.a(s).getVisibility() == 0)
                {
                    HelpActivity.a(s).setVisibility(8);
                }
                if (HelpActivity.b(s) != null && HelpActivity.b(s).getVisibility() != 0)
                {
                    HelpActivity.b(s).setVisibility(0);
                }
            }
        }

        public boolean shouldOverrideUrlLoading(WebView webview, String s)
        {
            Activity activity;
label0:
            {
label1:
                {
                    activity = (Activity)a.get();
                    if (activity != null && !activity.isFinishing())
                    {
                        if (s == null)
                        {
                            break label0;
                        }
                        if (!s.startsWith("http://dl.pg.ksmobile.com/help/"))
                        {
                            break label1;
                        }
                        webview.loadUrl(s);
                    }
                    return true;
                }
                if (s.startsWith("mailto:"))
                {
                    (new o(activity)).b();
                    return true;
                }
            }
            openBrowser(activity, s);
            return true;
        }

        public MyWebViewClient()
        {
            a = new WeakReference(HelpActivity.this);
        }
    }

}
