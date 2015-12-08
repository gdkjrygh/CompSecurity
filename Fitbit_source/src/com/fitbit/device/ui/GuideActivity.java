// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.device.ui;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.webkit.HttpAuthHandler;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.fitbit.data.domain.device.GuideInfo;
import com.fitbit.e.a;
import com.fitbit.ui.FitbitActivity;

// Referenced classes of package com.fitbit.device.ui:
//            GuideActivity_

public class GuideActivity extends FitbitActivity
{

    private static final String d = "GuideActivity";
    protected GuideInfo a;
    protected WebView b;
    protected View c;
    private Handler e;
    private Runnable f;

    public GuideActivity()
    {
        e = new Handler(Looper.getMainLooper());
        f = new Runnable() {

            final GuideActivity a;

            public void run()
            {
                a.c.setVisibility(0);
                a.c.setAnimation(AnimationUtils.loadAnimation(a, 0x7f050009));
            }

            
            {
                a = GuideActivity.this;
                super();
            }
        };
    }

    static Runnable a(GuideActivity guideactivity)
    {
        return guideactivity.f;
    }

    public static void a(Context context, GuideInfo guideinfo)
    {
        com.fitbit.device.ui.GuideActivity_.a(context).a(guideinfo).b();
    }

    static Handler b(GuideActivity guideactivity)
    {
        return guideactivity.e;
    }

    static void c(GuideActivity guideactivity)
    {
        guideactivity.f();
    }

    private void f()
    {
        c.setVisibility(8);
        if (b.getVisibility() != 0)
        {
            b.setAnimation(AnimationUtils.loadAnimation(this, 0x7f050009));
            b.setVisibility(0);
        }
    }

    protected void c()
    {
        b.getSettings().setUseWideViewPort(true);
        b.getSettings().setJavaScriptEnabled(true);
        b.setWebViewClient(new WebViewClient() {

            final GuideActivity a;

            public void onPageFinished(WebView webview1, String s1)
            {
                com.fitbit.e.a.a("GuideActivity", "on page finished", new Object[0]);
                GuideActivity.b(a).removeCallbacks(com.fitbit.device.ui.GuideActivity.a(a));
                GuideActivity.c(a);
                super.onPageFinished(webview1, s1);
            }

            public void onReceivedError(WebView webview1, int i, String s1, String s2)
            {
                com.fitbit.e.a.a("GuideActivity", s1, new Object[0]);
                GuideActivity.b(a).removeCallbacks(com.fitbit.device.ui.GuideActivity.a(a));
                GuideActivity.c(a);
            }

            public void onReceivedHttpAuthRequest(WebView webview1, HttpAuthHandler httpauthhandler, String s1, String s2)
            {
                com.fitbit.e.a.a("GuideActivity", "on received Http Auth Request", new Object[0]);
                httpauthhandler.proceed(a.a.b(), a.a.c());
            }

            public boolean shouldOverrideUrlLoading(WebView webview1, String s1)
            {
                webview1.loadUrl(s1);
                return true;
            }

            
            {
                a = GuideActivity.this;
                super();
            }
        });
        String s = a.a();
        WebView webview = b;
        if (s == null)
        {
            s = "http://www.google.com";
        }
        webview.loadUrl(s);
        e.postDelayed(f, 500L);
    }

    public void onCreate(Bundle bundle)
    {
        if (a == null)
        {
            a = new GuideInfo(null, 0, 0);
        }
        super.onCreate(bundle);
    }

    protected void onDestroy()
    {
        super.onDestroy();
        e.removeCallbacks(f);
    }
}
