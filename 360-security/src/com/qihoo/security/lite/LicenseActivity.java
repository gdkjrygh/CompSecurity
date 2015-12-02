// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.lite;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextPaint;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.CheckBox;
import com.qihoo.security.SecurityApplication;
import com.qihoo.security.app.BaseActivity;
import com.qihoo.security.locale.widget.LocaleTextView;
import com.qihoo360.mobilesafe.b.a;
import com.qihoo360.mobilesafe.share.SharedPref;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LicenseActivity extends BaseActivity
{

    private boolean A;
    private View B;
    private View C;
    private View D;
    private CheckBox E;
    private LocaleTextView F;
    private LocaleTextView G;
    private LocaleTextView H;
    private boolean I;
    private WebView J;
    private WebView K;
    private final Handler L = new Handler() {

        final LicenseActivity a;

        public void handleMessage(Message message)
        {
            super.handleMessage(message);
            switch (message.what)
            {
            default:
                return;

            case 0: // '\0'
                com.qihoo.security.lite.LicenseActivity.a(a, false);
                break;
            }
        }

            
            {
                a = LicenseActivity.this;
                super();
            }
    };
    private Context y;
    private Intent z;

    public LicenseActivity()
    {
        A = false;
        C = null;
        D = null;
        E = null;
        I = false;
    }

    static View a(LicenseActivity licenseactivity)
    {
        return licenseactivity.D;
    }

    static boolean a(LicenseActivity licenseactivity, boolean flag)
    {
        licenseactivity.I = flag;
        return flag;
    }

    static WebView b(LicenseActivity licenseactivity)
    {
        return licenseactivity.J;
    }

    static boolean b(LicenseActivity licenseactivity, boolean flag)
    {
        licenseactivity.A = flag;
        return flag;
    }

    static boolean c(LicenseActivity licenseactivity)
    {
        return licenseactivity.I;
    }

    static View d(LicenseActivity licenseactivity)
    {
        return licenseactivity.B;
    }

    static View e(LicenseActivity licenseactivity)
    {
        return licenseactivity.C;
    }

    static Handler f(LicenseActivity licenseactivity)
    {
        return licenseactivity.L;
    }

    static CheckBox g(LicenseActivity licenseactivity)
    {
        return licenseactivity.E;
    }

    static Context h(LicenseActivity licenseactivity)
    {
        return licenseactivity.y;
    }

    public void onBackPressed()
    {
        if (A)
        {
            A = false;
            B.setVisibility(0);
            C.setVisibility(8);
            return;
        } else
        {
            super.onBackPressed();
            return;
        }
    }

    protected void onCreate(Bundle bundle)
    {
        BufferedReader bufferedreader;
        super.onCreate(bundle);
        setContentView(0x7f03006f);
        y = getApplicationContext();
        z = getIntent();
        if (z == null)
        {
            z = new Intent();
            z.addFlags(0x20000);
        }
        D = findViewById(0x7f0b0108);
        E = (CheckBox)findViewById(0x7f0b0178);
        E.setChecked(SharedPref.b(SecurityApplication.a(), "user_ex", true));
        B = findViewById(0x7f0b0175);
        J = (WebView)findViewById(0x7f0b0177);
        bufferedreader = new BufferedReader(new InputStreamReader(getResources().openRawResource(0x7f060001)));
        bundle = new StringBuffer();
_L1:
        String s = bufferedreader.readLine();
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_168;
        }
        bundle.append(s);
          goto _L1
        IOException ioexception;
        ioexception;
        J.loadDataWithBaseURL("", bundle.toString(), "text/html", "utf-8", null);
        K = (WebView)findViewById(0x7f0b017c);
        K.setWebViewClient(new WebViewClient() {

            final LicenseActivity a;

            public void onPageFinished(WebView webview, String s1)
            {
                com.qihoo.security.lite.LicenseActivity.a(a).setVisibility(8);
                LicenseActivity.b(a).setVisibility(0);
                super.onPageFinished(webview, s1);
            }

            public void onPageStarted(WebView webview, String s1, Bitmap bitmap)
            {
                com.qihoo.security.lite.LicenseActivity.a(a).setVisibility(0);
                LicenseActivity.b(a).setVisibility(8);
                super.onPageStarted(webview, s1, bitmap);
            }

            public boolean shouldOverrideUrlLoading(WebView webview, String s1)
            {
                webview.loadUrl(s1);
                return true;
            }

            
            {
                a = LicenseActivity.this;
                super();
            }
        });
        C = findViewById(0x7f0b017b);
        F = (LocaleTextView)findViewById(0x7f0b0176);
        G = (LocaleTextView)findViewById(0x7f0b0179);
        H = (LocaleTextView)findViewById(0x7f0b017a);
        G.setOnClickListener(new android.view.View.OnClickListener() {

            final LicenseActivity a;

            public void onClick(View view)
            {
                if (!LicenseActivity.c(a))
                {
                    try
                    {
                        view = new Intent("android.intent.action.VIEW", Uri.parse("http://www.360safe.com/m/privacy.html#ceip"));
                        a.startActivity(view);
                    }
                    // Misplaced declaration of an exception variable
                    catch (View view)
                    {
                        LicenseActivity.b(a, true);
                        LicenseActivity.d(a).setVisibility(8);
                        LicenseActivity.e(a).setVisibility(0);
                        LicenseActivity.b(a).loadUrl("http://www.360safe.com/m/privacy.html#ceip");
                    }
                    com.qihoo.security.lite.LicenseActivity.a(a, true);
                    LicenseActivity.f(a).sendEmptyMessageDelayed(0, 1000L);
                }
            }

            
            {
                a = LicenseActivity.this;
                super();
            }
        });
        G.getPaint().setFlags(8);
        G.getPaint().setAntiAlias(true);
        H.setOnClickListener(new android.view.View.OnClickListener() {

            final LicenseActivity a;

            public void onClick(View view)
            {
                SharedPref.a(SecurityApplication.a(), "license", true);
                SharedPref.a(SecurityApplication.a(), "user_ex", LicenseActivity.g(a).isChecked());
                com.qihoo360.mobilesafe.b.a.f(LicenseActivity.h(a));
            }

            
            {
                a = LicenseActivity.this;
                super();
            }
        });
        return;
    }

    protected void onDestroy()
    {
        super.onDestroy();
        if (J != null)
        {
            J.stopLoading();
            J.destroy();
            J.removeAllViews();
            J = null;
        }
        if (K != null)
        {
            K.stopLoading();
            K.destroy();
            K.removeAllViews();
            K = null;
        }
    }

    protected void onResume()
    {
        super.onResume();
        F.setLocalText(0x7f0c0158);
        G.setLocalText(0x7f0c01d5);
        H.setLocalText(0x7f0c0159);
    }
}
