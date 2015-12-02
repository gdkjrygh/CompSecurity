// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.result.view;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.PowerManager;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.qihoo.security.dialog.AbsDialogActivity;
import com.qihoo.security.dialog.DialogView;
import com.qihoo.security.support.a;
import com.qihoo.security.support.b;
import com.qihoo.security.ui.result.AdvData;
import com.qihoo.security.widget.CommonWebView;
import com.qihoo.security.widget.ProgressCircleView;
import java.lang.ref.WeakReference;

public class AdvLoadingActivity extends AbsDialogActivity
{
    static class a extends Handler
    {

        final WeakReference a;

        public void handleMessage(Message message)
        {
            Object obj;
            AdvLoadingActivity advloadingactivity;
            int i;
            advloadingactivity = (AdvLoadingActivity)a.get();
            if (advloadingactivity == null)
            {
                return;
            }
            i = -1;
            obj = null;
            message.what;
            JVM INSTR tableswitch 0 1: default 48
        //                       0 95
        //                       1 104;
               goto _L1 _L2 _L3
_L1:
            message = obj;
_L5:
            b.a(25011, advloadingactivity.c.adid, String.valueOf(i), message);
            com.qihoo.security.support.a.b(advloadingactivity.getApplicationContext(), advloadingactivity.c.pkg, advloadingactivity.c.openUrl);
            advloadingactivity.finish();
            return;
_L2:
            i = 0;
            message = "30s timeout";
            continue; /* Loop/switch isn't completed */
_L3:
            i = message.arg1;
            message = (String)message.obj;
            if (true) goto _L5; else goto _L4
_L4:
        }

        a(AdvLoadingActivity advloadingactivity)
        {
            a = new WeakReference(advloadingactivity);
        }
    }


    protected AdvData c;
    private final long d = 30000L;
    private CommonWebView e;
    private android.os.PowerManager.WakeLock f;
    private a g;
    private final WebViewClient h = new WebViewClient() {

        final AdvLoadingActivity a;

        public void onPageFinished(WebView webview, String s)
        {
            super.onPageFinished(webview, s);
        }

        public void onPageStarted(WebView webview, String s, Bitmap bitmap)
        {
            super.onPageStarted(webview, s, bitmap);
        }

        public void onReceivedError(WebView webview, int i, String s, String s1)
        {
            super.onReceivedError(webview, i, s, s1);
            webview = com.qihoo.security.ui.result.view.AdvLoadingActivity.a(a).obtainMessage();
            webview.what = 1;
            webview.arg1 = i;
            webview.obj = s;
            com.qihoo.security.ui.result.view.AdvLoadingActivity.a(a).sendMessage(webview);
        }

        public boolean shouldOverrideUrlLoading(WebView webview, String s)
        {
label0:
            {
                if (!TextUtils.isEmpty(s))
                {
                    if (!com.qihoo.security.ui.result.a.a().a(s))
                    {
                        break label0;
                    }
                    com.qihoo.security.ui.result.view.AdvLoadingActivity.a(a, s);
                }
                return true;
            }
            webview.loadUrl(s);
            return true;
        }

            
            {
                a = AdvLoadingActivity.this;
                super();
            }
    };

    public AdvLoadingActivity()
    {
        g = new a(this);
    }

    static a a(AdvLoadingActivity advloadingactivity)
    {
        return advloadingactivity.g;
    }

    static void a(AdvLoadingActivity advloadingactivity, String s)
    {
        advloadingactivity.a(s);
    }

    private void a(String s)
    {
        g.removeMessages(0);
        g.removeMessages(1);
        com.qihoo.security.support.a.a(getApplicationContext(), c.pkg, s);
        finish();
    }

    private void c()
    {
        e = new CommonWebView(this);
        e.setWebViewClient(h);
        Object obj = e.getSettings();
        ((WebSettings) (obj)).setJavaScriptEnabled(true);
        ((WebSettings) (obj)).setDomStorageEnabled(true);
        b().a();
        obj = b().getContentView();
        android.widget.LinearLayout.LayoutParams layoutparams = (android.widget.LinearLayout.LayoutParams)((View) (obj)).getLayoutParams();
        layoutparams.topMargin = 0;
        ((View) (obj)).setLayoutParams(layoutparams);
        ((ProgressCircleView)((View) (obj)).findViewById(0x7f0b0079)).setProgressBackground(0x7f02003d);
    }

    private void d()
    {
        if (c != null && c.openUrl != null)
        {
            e();
            e.loadUrl(c.openUrl);
            g.sendEmptyMessageDelayed(0, 30000L);
            return;
        } else
        {
            finish();
            return;
        }
    }

    private void e()
    {
        f();
        f.acquire();
    }

    private void f()
    {
        f.setReferenceCounted(false);
        f.release();
    }

    protected View a()
    {
        return LayoutInflater.from(this).inflate(0x7f030020, null);
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        c = (AdvData)getIntent().getSerializableExtra("adv_data");
        if (c == null)
        {
            finish();
            return;
        }
        if (c.openUrl == null)
        {
            if (c.pkg != null)
            {
                com.qihoo.security.support.a.b(this, c.pkg, null);
            }
            finish();
            return;
        }
        if (com.qihoo.security.ui.result.a.a().a(c.openUrl))
        {
            a(c.openUrl);
            return;
        } else
        {
            f = ((PowerManager)getSystemService("power")).newWakeLock(0x2000000a, "AdvLoadingActivity");
            c();
            d();
            return;
        }
    }

    protected void onDestroy()
    {
        super.onDestroy();
        g.removeMessages(0);
        g.removeMessages(1);
        if (e != null)
        {
            e.removeAllViews();
            e.destroy();
            e = null;
        }
    }

    protected void onStop()
    {
        super.onStop();
        f();
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        if (motionevent.getAction() == 0)
        {
            return true;
        } else
        {
            return super.onTouchEvent(motionevent);
        }
    }
}
