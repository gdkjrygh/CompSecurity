// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.videoad;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.VideoView;

// Referenced classes of package com.tremorvideo.sdk.android.videoad:
//            dp, ct, ds, dt

public class dr extends dp
{
    private class a extends WebChromeClient
    {

        final dr a;

        public void onHideCustomView()
        {
            dr.e(a);
        }

        public void onProgressChanged(WebView webview, int k)
        {
            super.onProgressChanged(webview, k);
            if (k == 100 && a.b != null)
            {
                a.b.a();
            }
        }

        public void onShowCustomView(View view, android.webkit.WebChromeClient.CustomViewCallback customviewcallback)
        {
            if (dr.a(a) != null)
            {
                customviewcallback.onCustomViewHidden();
                return;
            }
            VideoView videoview = dr.a(a, view);
            if (videoview != null)
            {
                dr.a(a, videoview);
            }
            dr.b(a).setVisibility(8);
            dr.c(a).addView(view, new android.widget.FrameLayout.LayoutParams(-1, -1));
            dr.b(a, view);
            dr.a(a, customviewcallback);
            dr.c(a).setVisibility(0);
            dr.d(a);
        }

        private a()
        {
            a = dr.this;
            super();
        }

        a(ds ds1)
        {
            this();
        }
    }


    private int c;
    private View d;
    private FrameLayout e;
    private android.webkit.WebChromeClient.CustomViewCallback f;
    private WebView g;
    private VideoView h;

    dr(Context context)
    {
        super(context);
        c = 43981;
        g = new WebView(context);
        g.setVerticalScrollBarEnabled(false);
        g.setHorizontalScrollBarEnabled(false);
        g.setWebViewClient(g());
        g.getSettings().setJavaScriptEnabled(true);
        g.getSettings().setSaveFormData(false);
        g.getSettings().setSavePassword(false);
        g.getSettings().setPluginsEnabled(true);
        ct.d(g.getSettings().getUserAgentString());
        g.getSettings().setDatabaseEnabled(true);
        g.setWebChromeClient(new a(null));
        g.getSettings().setDomStorageEnabled(true);
        g.getSettings().setBuiltInZoomControls(true);
        e = new FrameLayout(context);
        e.setVisibility(8);
        f();
        System.gc();
        addView(g, new android.widget.RelativeLayout.LayoutParams(-1, -1));
        addView(e, new android.widget.RelativeLayout.LayoutParams(-1, -1));
    }

    static View a(dr dr1)
    {
        return dr1.d;
    }

    static android.webkit.WebChromeClient.CustomViewCallback a(dr dr1, android.webkit.WebChromeClient.CustomViewCallback customviewcallback)
    {
        dr1.f = customviewcallback;
        return customviewcallback;
    }

    private VideoView a(View view)
    {
        if (view instanceof VideoView)
        {
            return (VideoView)view;
        }
        if (view instanceof ViewGroup)
        {
            view = (ViewGroup)view;
            int l = view.getChildCount();
            for (int k = 0; k < l; k++)
            {
                View view1 = view.getChildAt(k);
                if (view1 instanceof VideoView)
                {
                    return (VideoView)view1;
                }
            }

        }
        return null;
    }

    static VideoView a(dr dr1, View view)
    {
        return dr1.a(view);
    }

    private void a(VideoView videoview)
    {
        h = videoview;
        videoview.setOnPreparedListener(new ds(this));
        videoview.setOnCompletionListener(new dt(this));
    }

    static void a(dr dr1, VideoView videoview)
    {
        dr1.a(videoview);
    }

    static View b(dr dr1, View view)
    {
        dr1.d = view;
        return view;
    }

    static WebView b(dr dr1)
    {
        return dr1.g;
    }

    static FrameLayout c(dr dr1)
    {
        return dr1.e;
    }

    static void d(dr dr1)
    {
        dr1.h();
    }

    static void e(dr dr1)
    {
        dr1.i();
    }

    static void f(dr dr1)
    {
        dr1.j();
    }

    private void h()
    {
        if (h != null && !h.isPlaying() && e.findViewById(c) == null)
        {
            ProgressBar progressbar = new ProgressBar(h.getContext());
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
        h = null;
        e.removeView(d);
        d = null;
        e.setVisibility(8);
        f.onCustomViewHidden();
        g.setVisibility(0);
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

    public void a(dp.d d1)
    {
        a = d1;
    }

    public void a(String s)
    {
        f();
        g.loadUrl(s);
    }

    public boolean a()
    {
        return h != null;
    }

    public void b()
    {
        if (h != null)
        {
            if (g != null && a != null)
            {
                g.loadUrl("javascript:onVideoExit();");
            }
            ct.d("WebView - skipping video");
            i();
        }
    }

    public void c()
    {
        if (h != null)
        {
            h.stopPlayback();
        }
        i();
        removeView(g);
        if (g != null)
        {
            f();
            g.destroy();
            g = null;
        }
    }

    public void d()
    {
        if (h == null)
        {
            if (g != null && a != null)
            {
                g.loadUrl("javascript:onResume();");
            }
        } else
        {
            h.start();
        }
        h();
    }

    public void e()
    {
        if (h == null)
        {
            if (g != null && a != null)
            {
                g.loadUrl("javascript:onPause();");
            }
            return;
        } else
        {
            h.pause();
            return;
        }
    }

    public void f()
    {
        if (g != null)
        {
            g.clearCache(false);
            g.destroyDrawingCache();
        }
    }

    public void setBackgroundColor(int k)
    {
        super.setBackgroundColor(k);
        g.setBackgroundColor(k);
    }
}
