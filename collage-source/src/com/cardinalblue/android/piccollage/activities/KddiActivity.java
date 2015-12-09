// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.activities;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.cardinalblue.android.b.k;
import com.cardinalblue.android.piccollage.controller.a.c;
import com.cardinalblue.android.piccollage.controller.a.e;
import com.cardinalblue.android.piccollage.model.j;

// Referenced classes of package com.cardinalblue.android.piccollage.activities:
//            BaseActivity

public abstract class KddiActivity extends BaseActivity
{
    private class a extends WebViewClient
    {

        final KddiActivity a;

        public void onPageStarted(WebView webview, String s, Bitmap bitmap)
        {
            super.onPageStarted(webview, s, bitmap);
            if (!s.startsWith("https://pic-collage.com")) goto _L2; else goto _L1
_L1:
            bitmap = Uri.parse(s);
            s = bitmap.getQueryParameter("code");
            if (TextUtils.isEmpty(s)) goto _L4; else goto _L3
_L3:
            webview = j.a(a);
            (new e(a, webview)).a(new String[] {
                s
            });
_L2:
            return;
_L4:
            s = bitmap.getQueryParameter("error_description");
            if (TextUtils.isEmpty(s)) goto _L2; else goto _L5
_L5:
            webview.setVisibility(8);
            if (!s.equalsIgnoreCase("HNY31004")) goto _L7; else goto _L6
_L6:
            webview = a.getString(0x7f0701f2);
_L9:
            a.a(webview);
            return;
_L7:
            if (s.equalsIgnoreCase("HNY30001"))
            {
                webview = a.getString(0x7f0701f3);
            } else
            {
                webview = s;
                if (s.equalsIgnoreCase("HNY90000"))
                {
                    webview = a.getString(0x7f0701f1);
                }
            }
            if (true) goto _L9; else goto _L8
_L8:
        }

        private a()
        {
            a = KddiActivity.this;
            super();
        }

    }


    public KddiActivity()
    {
    }

    public abstract void a();

    public void a(String s)
    {
        k.a(this, s, 1);
        finish();
    }

    public void b()
    {
        setContentView(0x7f030033);
        setSupportActionBar((Toolbar)findViewById(0x7f1000c5));
        WebView webview = (WebView)findViewById(0x7f1000d5);
        webview.getSettings().setJavaScriptEnabled(true);
        k.e(this);
        webview.setWebViewClient(new a());
        webview.setWebChromeClient(new WebChromeClient() {

            final KddiActivity a;

            public void onProgressChanged(WebView webview1, int i)
            {
                if (i == 100)
                {
                    a.getSupportActionBar().setTitle(a.getString(0x7f070100));
                    return;
                } else
                {
                    a.getSupportActionBar().setTitle((new StringBuilder()).append(a.getString(0x7f0701fa)).append(" ").append(i).append("%").toString());
                    return;
                }
            }

            
            {
                a = KddiActivity.this;
                super();
            }
        });
        webview.requestFocus(130);
        webview.setOnTouchListener(new android.view.View.OnTouchListener() {

            final KddiActivity a;

            public boolean onTouch(View view, MotionEvent motionevent)
            {
                motionevent.getAction();
                JVM INSTR tableswitch 0 1: default 28
            //                           0 30
            //                           1 30;
                   goto _L1 _L2 _L2
_L1:
                return false;
_L2:
                if (!view.hasFocus())
                {
                    view.requestFocus();
                }
                if (true) goto _L1; else goto _L3
_L3:
            }

            
            {
                a = KddiActivity.this;
                super();
            }
        });
        webview.loadUrl(j.a(this).f());
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (!k.b(this))
        {
            a(getString(0x7f07021d));
            return;
        } else
        {
            (new c(this, j.a(this))).execute(new Void[0]);
            return;
        }
    }
}
