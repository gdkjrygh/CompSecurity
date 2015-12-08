// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.videoad;

import android.content.Context;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.VideoView;

// Referenced classes of package com.tremorvideo.sdk.android.videoad:
//            dp, ct

public class dq extends dp
{
    class a
    {

        final dq a;

        public a(WebSettings websettings)
        {
            a = dq.this;
            super();
            websettings.setDatabaseEnabled(true);
        }
    }

    private class b extends WebChromeClient
    {

        final dq a;

        public void onProgressChanged(WebView webview, int k)
        {
            super.onProgressChanged(webview, k);
            if (k == 100 && a.b != null)
            {
                a.b.a();
            }
        }

        private b()
        {
            a = dq.this;
            super();
        }

    }


    private int c;
    private View d;
    private FrameLayout e;
    private WebView f;
    private VideoView g;

    dq(Context context)
    {
        super(context);
        c = 43981;
        f = new WebView(context);
        f.setVerticalScrollBarEnabled(false);
        f.setHorizontalScrollBarEnabled(false);
        f.setWebViewClient(new dp.a(this));
        f.setWebChromeClient(new b());
        f.getSettings().setJavaScriptEnabled(true);
        f.getSettings().setSaveFormData(false);
        f.getSettings().setSavePassword(false);
        f.getSettings().setPluginsEnabled(true);
        if (Integer.parseInt(android.os.Build.VERSION.SDK) >= 5)
        {
            new a(f.getSettings());
        }
        e = new FrameLayout(context);
        e.setVisibility(8);
        f();
        System.gc();
        addView(f, new android.widget.RelativeLayout.LayoutParams(-1, -1));
        addView(e, new android.widget.RelativeLayout.LayoutParams(-1, -1));
    }

    private void h()
    {
        if (g != null && e.findViewById(c) == null)
        {
            ProgressBar progressbar = new ProgressBar(g.getContext());
            progressbar.setIndeterminate(true);
            progressbar.setId(c);
            android.widget.FrameLayout.LayoutParams layoutparams = new android.widget.FrameLayout.LayoutParams(-2, -2);
            layoutparams.gravity = 17;
            e.addView(progressbar, layoutparams);
        }
    }

    private void i()
    {
        this;
        JVM INSTR monitorenter ;
        View view = d;
        if (view != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        j();
        d.setVisibility(8);
        g = null;
        e.removeView(d);
        d = null;
        e.setVisibility(8);
        f.setVisibility(0);
        if (true) goto _L1; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    private void j()
    {
        do
        {
            View view = e.findViewById(c);
            if (view != null)
            {
                e.removeView(view);
            } else
            {
                return;
            }
        } while (true);
    }

    public void a(String s)
    {
        f();
        f.loadUrl(s);
    }

    public boolean a()
    {
        return g != null;
    }

    public void b()
    {
        if (g != null)
        {
            ct.d("WebView - skipping video");
            i();
        }
    }

    public void c()
    {
    }

    public void d()
    {
        h();
    }

    public void e()
    {
    }

    public void f()
    {
        if (f != null)
        {
            f.clearCache(false);
            f.destroyDrawingCache();
        }
    }

    public void setBackgroundColor(int k)
    {
        super.setBackgroundColor(k);
        f.setBackgroundColor(k);
    }
}
