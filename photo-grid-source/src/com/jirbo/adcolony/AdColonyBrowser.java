// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jirbo.adcolony;

import android.app.Activity;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Window;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import java.util.ArrayList;

// Referenced classes of package com.jirbo.adcolony:
//            ADCImage, a, AdColony, l

public class AdColonyBrowser extends Activity
{

    static boolean A = false;
    static boolean B = false;
    static boolean C = false;
    static boolean a = true;
    public static String url;
    static boolean v = false;
    static boolean w = false;
    static boolean x = false;
    static boolean y = false;
    static boolean z = true;
    WebView b;
    ADCImage c;
    ADCImage d;
    ADCImage e;
    ADCImage f;
    ADCImage g;
    ADCImage h;
    ADCImage i;
    ADCImage j;
    ADCImage k;
    RelativeLayout l;
    RelativeLayout m;
    boolean n;
    boolean o;
    boolean p;
    boolean q;
    ProgressBar r;
    DisplayMetrics s;
    a t;
    c u;

    public AdColonyBrowser()
    {
        n = false;
        o = false;
        p = false;
        q = false;
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        configuration = new android.widget.RelativeLayout.LayoutParams(-2, s.heightPixels - (int)(1.5D * (double)g.g));
        configuration.addRule(3, l.getId());
        b.setLayoutParams(configuration);
        z = true;
        t.invalidate();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        B = true;
        c = new ADCImage(com.jirbo.adcolony.a.j("browser_back_image_normal"));
        d = new ADCImage(com.jirbo.adcolony.a.j("browser_stop_image_normal"));
        e = new ADCImage(com.jirbo.adcolony.a.j("browser_reload_image_normal"));
        f = new ADCImage(com.jirbo.adcolony.a.j("browser_forward_image_normal"));
        g = new ADCImage(com.jirbo.adcolony.a.j("browser_close_image_normal"));
        h = new ADCImage(com.jirbo.adcolony.a.j("browser_glow_button"));
        i = new ADCImage(com.jirbo.adcolony.a.j("browser_icon"));
        j = new ADCImage(com.jirbo.adcolony.a.j("browser_back_image_normal"), true);
        k = new ADCImage(com.jirbo.adcolony.a.j("browser_forward_image_normal"), true);
        s = AdColony.activity().getResources().getDisplayMetrics();
        float f1 = (float)s.widthPixels / s.xdpi;
        float f2 = (float)s.heightPixels / s.ydpi;
        double d1 = Math.sqrt(f1 * f1 + f2 * f2);
        double d2 = Math.sqrt(s.widthPixels * s.widthPixels + s.heightPixels * s.heightPixels) / d1 / 220D;
        d1 = d2;
        if (d2 > 1.8D)
        {
            d1 = 1.8D;
        }
        z = true;
        v = false;
        w = false;
        C = false;
        c.a(d1);
        d.a(d1);
        e.a(d1);
        f.a(d1);
        g.a(d1);
        h.a(d1);
        j.a(d1);
        k.a(d1);
        r = new ProgressBar(this);
        r.setVisibility(4);
        m = new RelativeLayout(this);
        l = new RelativeLayout(this);
        l.setBackgroundColor(0xffcccccc);
        int i1;
        if (!com.jirbo.adcolony.a.m)
        {
            l.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(-1, (int)((double)c.g * 1.5D)));
        } else
        {
            l.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(-1, (int)((double)c.g * 1.5D)));
        }
        requestWindowFeature(1);
        getWindow().setFlags(1024, 1024);
        getWindow().requestFeature(2);
        setVolumeControlStream(3);
        b = new WebView(this);
        b.getSettings().setJavaScriptEnabled(true);
        b.getSettings().setBuiltInZoomControls(true);
        b.getSettings().setUseWideViewPort(true);
        b.getSettings().setLoadWithOverviewMode(true);
        b.getSettings().setGeolocationEnabled(true);
        if (a)
        {
            if (!com.jirbo.adcolony.a.m)
            {
                if (android.os.Build.VERSION.SDK_INT >= 10)
                {
                    setRequestedOrientation(6);
                } else
                {
                    setRequestedOrientation(0);
                }
            } else
            {
                setRequestedOrientation(com.jirbo.adcolony.a.w);
            }
        }
        a = true;
        b.setWebChromeClient(new _cls1());
        b.setWebViewClient(new _cls2());
        t = new a(this);
        u = new c(this);
        m.setBackgroundColor(0xffffff);
        m.addView(l);
        l.setId(12345);
        bundle = new android.widget.RelativeLayout.LayoutParams(-2, s.heightPixels - (int)((double)g.g * 1.5D));
        bundle.addRule(3, l.getId());
        m.addView(b, bundle);
        bundle = new android.widget.RelativeLayout.LayoutParams(-2, 20);
        bundle.addRule(3, l.getId());
        bundle.setMargins(0, -10, 0, 0);
        m.addView(u, bundle);
        if (s.widthPixels > s.heightPixels)
        {
            i1 = s.widthPixels;
        } else
        {
            i1 = s.heightPixels;
        }
        m.addView(t, new android.widget.RelativeLayout.LayoutParams(i1 * 2, i1 * 2));
        bundle = new android.widget.RelativeLayout.LayoutParams(-2, s.heightPixels - (int)((double)g.g * 1.5D));
        bundle.addRule(3, l.getId());
        m.addView(new b(this), bundle);
        setContentView(m);
        b.loadUrl(url);
        l.c.a("Viewing ").b(url);
    }

    public void onDestroy()
    {
        if (!com.jirbo.adcolony.a.u && A)
        {
            for (int i1 = 0; i1 < com.jirbo.adcolony.a.ad.size(); i1++)
            {
                ((Bitmap)com.jirbo.adcolony.a.ad.get(i1)).recycle();
            }

            com.jirbo.adcolony.a.ad.clear();
        }
        A = false;
        B = false;
        super.onDestroy();
    }

    public void onPause()
    {
        super.onPause();
        t.b();
    }

    public void onResume()
    {
        super.onResume();
        z = true;
        t.invalidate();
    }

    public void onWindowFocusChanged(boolean flag)
    {
        super.onWindowFocusChanged(flag);
    }


    private class a extends View
    {

        Rect a;
        Paint b;
        final AdColonyBrowser c;

        public void a()
        {
            android.widget.RelativeLayout.LayoutParams layoutparams = new android.widget.RelativeLayout.LayoutParams(c.r.getWidth(), c.r.getHeight());
            layoutparams.topMargin = (c.l.getHeight() - c.d.g) / 2;
            layoutparams.leftMargin = c.l.getWidth() / 10 + c.d.c() + c.d.f;
            if (AdColonyBrowser.z && c.d.c() != 0)
            {
                c.m.removeView(c.r);
                c.m.addView(c.r, layoutparams);
                AdColonyBrowser.z = false;
            }
            if (c.r.getLayoutParams() == null)
            {
                return;
            } else
            {
                c.r.getLayoutParams().height = c.d.g;
                c.r.getLayoutParams().width = c.d.f;
                return;
            }
        }

        public boolean a(ADCImage adcimage, int i1, int j1)
        {
            return i1 < adcimage.c() + adcimage.f + 16 && i1 > adcimage.c() - 16 && j1 < adcimage.d() + adcimage.g + 16 && j1 > adcimage.d() - 16;
        }

        public void b()
        {
            c.n = false;
            c.o = false;
            c.p = false;
            c.q = false;
            invalidate();
        }

        public void onDraw(Canvas canvas)
        {
            getDrawingRect(a);
            int i1 = (c.l.getHeight() - c.c.g) / 2;
            if (!AdColonyBrowser.v)
            {
                c.c.a(canvas, c.c.f, i1);
            } else
            {
                c.j.a(canvas, c.c.f, i1);
            }
            if (!AdColonyBrowser.w)
            {
                c.f.a(canvas, c.c.c() + c.l.getWidth() / 10 + c.c.f, i1);
            } else
            {
                c.k.a(canvas, c.c.c() + c.l.getWidth() / 10 + c.c.f, i1);
            }
            if (AdColonyBrowser.x)
            {
                c.d.a(canvas, c.f.c() + c.f.f + c.l.getWidth() / 10, i1);
            } else
            {
                c.e.a(canvas, c.f.c() + c.f.f + c.l.getWidth() / 10, i1);
            }
            c.g.a(canvas, c.l.getWidth() - c.g.f * 2, i1);
            if (c.n)
            {
                c.h.c((c.c.c() - c.h.f / 2) + c.c.f / 2, (c.c.d() - c.h.g / 2) + c.c.g / 2);
                c.h.a(canvas);
            }
            if (c.o)
            {
                c.h.c((c.f.c() - c.h.f / 2) + c.f.f / 2, (c.f.d() - c.h.g / 2) + c.f.g / 2);
                c.h.a(canvas);
            }
            if (c.p)
            {
                c.h.c((c.e.c() - c.h.f / 2) + c.e.f / 2, (c.e.d() - c.h.g / 2) + c.e.g / 2);
                c.h.a(canvas);
            }
            if (c.q)
            {
                c.h.c((c.g.c() - c.h.f / 2) + c.g.f / 2, (c.g.d() - c.h.g / 2) + c.g.g / 2);
                c.h.a(canvas);
            }
            a();
        }

        public boolean onTouchEvent(MotionEvent motionevent)
        {
            int i1 = motionevent.getAction();
            int j1 = (int)motionevent.getX();
            int k1 = (int)motionevent.getY();
            if (i1 == 0)
            {
                if (a(c.c, j1, k1) && AdColonyBrowser.v)
                {
                    c.n = true;
                    invalidate();
                    return true;
                }
                if (a(c.f, j1, k1) && AdColonyBrowser.w)
                {
                    c.o = true;
                    invalidate();
                    return true;
                }
                if (a(c.e, j1, k1))
                {
                    c.p = true;
                    invalidate();
                    return true;
                }
                if (a(c.g, j1, k1))
                {
                    c.q = true;
                    invalidate();
                    return true;
                }
            }
            if (i1 == 1)
            {
                if (a(c.c, j1, k1) && AdColonyBrowser.v)
                {
                    c.b.goBack();
                    b();
                    return true;
                }
                if (a(c.f, j1, k1) && AdColonyBrowser.w)
                {
                    c.b.goForward();
                    b();
                    return true;
                }
                if (a(c.e, j1, k1) && AdColonyBrowser.x)
                {
                    c.b.stopLoading();
                    b();
                    return true;
                }
                if (a(c.e, j1, k1) && !AdColonyBrowser.x)
                {
                    c.b.reload();
                    b();
                    return true;
                }
                if (a(c.g, j1, k1))
                {
                    AdColonyBrowser.C = true;
                    c.b.loadData("", "text/html", "utf-8");
                    AdColonyBrowser.w = false;
                    AdColonyBrowser.v = false;
                    AdColonyBrowser.x = false;
                    b();
                    c.finish();
                    return true;
                }
                b();
            }
            return false;
        }

        public a(Activity activity)
        {
            c = AdColonyBrowser.this;
            super(activity);
            a = new Rect();
            b = new Paint();
        }
    }


    private class _cls1 extends WebChromeClient
    {

        final AdColonyBrowser a;

        public void onGeolocationPermissionsShowPrompt(String s1, android.webkit.GeolocationPermissions.Callback callback)
        {
            callback.invoke(s1, true, false);
        }

        public void onProgressChanged(WebView webview, int i1)
        {
            a.setProgress(i1 * 1000);
        }

        _cls1()
        {
            a = AdColonyBrowser.this;
            super();
        }
    }


    private class _cls2 extends WebViewClient
    {

        final AdColonyBrowser a;

        public void onPageFinished(WebView webview, String s1)
        {
            if (!AdColonyBrowser.C)
            {
                AdColonyBrowser.y = true;
                AdColonyBrowser.x = false;
                a.r.setVisibility(4);
                AdColonyBrowser.v = a.b.canGoBack();
                AdColonyBrowser.w = a.b.canGoForward();
            }
            a.t.invalidate();
        }

        public void onPageStarted(WebView webview, String s1, Bitmap bitmap)
        {
            if (!AdColonyBrowser.C)
            {
                AdColonyBrowser.x = true;
                AdColonyBrowser.y = false;
                a.r.setVisibility(0);
            }
            a.t.invalidate();
        }

        public void onReceivedError(WebView webview, int i1, String s1, String s2)
        {
            l.d.a("Error viewing URL: ").b(s1);
            a.finish();
        }

        public boolean shouldOverrideUrlLoading(WebView webview, String s1)
        {
            if (s1.startsWith("market://") || s1.startsWith("amzn://"))
            {
                webview = new Intent("android.intent.action.VIEW", Uri.parse(s1));
                if (com.jirbo.adcolony.a.K != null)
                {
                    com.jirbo.adcolony.a.K.startActivity(webview);
                }
                return true;
            } else
            {
                return false;
            }
        }

        _cls2()
        {
            a = AdColonyBrowser.this;
            super();
        }
    }


    private class c extends View
    {

        Paint a;
        ADCImage b;
        ADCImage c;
        final AdColonyBrowser d;

        public void onDraw(Canvas canvas)
        {
            canvas.drawRect(0.0F, 0.0F, d.l.getWidth(), 10F, a);
        }

        public c(Activity activity)
        {
            d = AdColonyBrowser.this;
            super(activity);
            a = new Paint();
            b = new ADCImage(com.jirbo.adcolony.a.j("close_image_normal"));
            c = new ADCImage(com.jirbo.adcolony.a.j("close_image_down"));
            try
            {
                getClass().getMethod("setLayerType", new Class[] {
                    Integer.TYPE, android/graphics/Paint
                }).invoke(this, new Object[] {
                    Integer.valueOf(1), null
                });
            }
            // Misplaced declaration of an exception variable
            catch (AdColonyBrowser adcolonybrowser) { }
            a.setColor(0xffcccccc);
            a.setStrokeWidth(10F);
            a.setStyle(android.graphics.Paint.Style.STROKE);
            a.setShadowLayer(3F, 0.0F, 1.0F, 0xff000000);
        }
    }


    private class b extends View
    {

        Rect a;
        final AdColonyBrowser b;

        public void onDraw(Canvas canvas)
        {
            if (!AdColonyBrowser.y)
            {
                canvas.drawARGB(255, 0, 0, 0);
                getDrawingRect(a);
                b.i.a(canvas, (a.width() - b.i.f) / 2, (a.height() - b.i.g) / 2);
                invalidate();
            }
        }

        public b(Activity activity)
        {
            b = AdColonyBrowser.this;
            super(activity);
            a = new Rect();
        }
    }

}
