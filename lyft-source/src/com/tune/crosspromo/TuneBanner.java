// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tune.crosspromo;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Handler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ViewSwitcher;

// Referenced classes of package com.tune.crosspromo:
//            TuneAd, TuneAdSize, TuneBannerPosition, TuneAdActivity, 
//            TuneAdParams, TuneAdClient, TuneAdView, TuneAdListener

public class TuneBanner extends FrameLayout
    implements TuneAd
{

    private TuneAdParams a;
    private int b;
    private Context c;
    private Handler d;
    private TuneBannerPosition e;
    private TuneAdSize f;
    private TuneAdView g;
    private WebView h;
    private ViewSwitcher i;
    private TuneAdListener j;

    private void a()
    {
        Object obj;
        obj = getLayoutParams();
        if (obj != null)
        {
            obj.width = f.a(c);
            obj.height = f.b(c);
        }
        if (!(obj instanceof android.widget.FrameLayout.LayoutParams)) goto _L2; else goto _L1
_L1:
        obj = new android.widget.FrameLayout.LayoutParams(((android.view.ViewGroup.LayoutParams) (obj)).width, ((android.view.ViewGroup.LayoutParams) (obj)).height);
        class _cls7
        {

            static final int a[];

            static 
            {
                a = new int[TuneBannerPosition.values().length];
                try
                {
                    a[TuneBannerPosition.b.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[TuneBannerPosition.a.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls7.a[e.ordinal()];
        JVM INSTR tableswitch 1 1: default 92
    //                   1 104;
           goto _L3 _L4
_L3:
        obj.gravity = 81;
_L5:
        setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
        return;
_L4:
        obj.gravity = 49;
        if (true) goto _L5; else goto _L2
_L2:
        if (!(obj instanceof android.widget.RelativeLayout.LayoutParams)) goto _L5; else goto _L6
_L6:
        obj = new android.widget.RelativeLayout.LayoutParams(((android.view.ViewGroup.LayoutParams) (obj)).width, ((android.view.ViewGroup.LayoutParams) (obj)).height);
        switch (_cls7.a[e.ordinal()])
        {
        default:
            ((android.widget.RelativeLayout.LayoutParams) (obj)).addRule(12);
            ((android.widget.RelativeLayout.LayoutParams) (obj)).addRule(14);
            break;

        case 1: // '\001'
            ((android.widget.RelativeLayout.LayoutParams) (obj)).addRule(10);
            ((android.widget.RelativeLayout.LayoutParams) (obj)).addRule(14);
            break;
        }
        if (true) goto _L5; else goto _L7
_L7:
    }

    static void a(TuneBanner tunebanner)
    {
        tunebanner.b();
    }

    static void a(TuneBanner tunebanner, String s)
    {
        tunebanner.a(s);
    }

    private void a(String s)
    {
        Intent intent = new Intent(getContext(), com/tune/crosspromo/TuneAdActivity);
        intent.putExtra("INTERSTITIAL", false);
        intent.putExtra("REDIRECT_URI", s);
        ((Activity)getContext()).startActivity(intent);
        d();
        TuneAdClient.b(g, a.a());
    }

    static ViewSwitcher b(TuneBanner tunebanner)
    {
        return tunebanner.i;
    }

    private void b()
    {
        d.post(new Runnable() {

            final TuneBanner a;

            public void run()
            {
                if (TuneBanner.i(a) != null)
                {
                    TuneBanner.i(a).a(a);
                }
            }

            
            {
                a = TuneBanner.this;
                super();
            }
        });
    }

    static WebView c(TuneBanner tunebanner)
    {
        return tunebanner.h;
    }

    private void c()
    {
        d.post(new Runnable() {

            final TuneBanner a;

            public void run()
            {
                if (TuneBanner.i(a) != null)
                {
                    TuneBanner.i(a).b(a);
                }
            }

            
            {
                a = TuneBanner.this;
                super();
            }
        });
    }

    static Handler d(TuneBanner tunebanner)
    {
        return tunebanner.d;
    }

    private void d()
    {
        d.post(new Runnable() {

            final TuneBanner a;

            public void run()
            {
                if (TuneBanner.i(a) != null)
                {
                    TuneBanner.i(a).c(a);
                }
            }

            
            {
                a = TuneBanner.this;
                super();
            }
        });
    }

    static TuneAdView e(TuneBanner tunebanner)
    {
        return tunebanner.g;
    }

    static TuneAdParams f(TuneBanner tunebanner)
    {
        return tunebanner.a;
    }

    static void g(TuneBanner tunebanner)
    {
        tunebanner.a();
    }

    static void h(TuneBanner tunebanner)
    {
        tunebanner.c();
    }

    static TuneAdListener i(TuneBanner tunebanner)
    {
        return tunebanner.j;
    }

    public TuneAdView getCurrentAd()
    {
        return g;
    }

    public TuneAdParams getParams()
    {
        return a;
    }

    public TuneBannerPosition getPosition()
    {
        return e;
    }

    public TuneAdSize getSize()
    {
        return f;
    }

    protected void onMeasure(int k, int l)
    {
        super.onMeasure(k, l);
        k = getResources().getConfiguration().orientation;
        if (k != b)
        {
            b = k;
            l = f.a(c);
            k = f.b(c);
            l = android.view.View.MeasureSpec.makeMeasureSpec(l, 0x40000000);
            k = android.view.View.MeasureSpec.makeMeasureSpec(k, 0x40000000);
            super.onMeasure(l, k);
            measureChildren(l, k);
        }
    }

    public void setListener(TuneAdListener tuneadlistener)
    {
        j = tuneadlistener;
    }

    public void setPosition(TuneBannerPosition tunebannerposition)
    {
        e = tunebannerposition;
    }

    // Unreferenced inner class com/tune/crosspromo/TuneBanner$1

/* anonymous class */
    class _cls1 extends WebViewClient
    {

        final TuneBanner a;

        public void onPageFinished(WebView webview, String s)
        {
            TuneBanner.a(a);
            if (TuneBanner.b(a) != null)
            {
                TuneBanner.b(a).setVisibility(0);
                if (TuneBanner.b(a).getCurrentView() == TuneBanner.c(a))
                {
                    TuneBanner.d(a).postDelayed(new Runnable(this) {

                        final _cls1 a;

                        public void run()
                        {
    class _cls1 extends WebViewClient
    {
                            if (TuneBanner.b(a.a) != null)
                            {
                                TuneBanner.b(a.a).showNext();
                            }
                        }

            
            {
                a = _pcls1;
                super();
            }
                    }, 50L);
                } else
                {
                    TuneBanner.d(a).postDelayed(new Runnable(this) {

                        final _cls1 a;

                        public void run()
                        {
                            if (TuneBanner.b(a.a) != null)
                            {
                                TuneBanner.b(a.a).showPrevious();
                            }
                        }

            
            {
                a = _pcls1;
                super();
            }
                    }, 50L);
                }
                TuneAdClient.a(TuneBanner.e(a), TuneBanner.f(a).a());
                TuneBanner.g(a);
                TuneBanner.h(a);
            }
        }

        public boolean shouldOverrideUrlLoading(WebView webview, String s)
        {
            TuneBanner.a(a, s);
            return true;
        }

            
            {
                a = TuneBanner.this;
                super();
            }
    }

}
