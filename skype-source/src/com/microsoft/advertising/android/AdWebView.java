// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.advertising.android;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.ConsoleMessage;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.microsoft.advertising.android.a.e;
import java.net.URI;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;

// Referenced classes of package com.microsoft.advertising.android:
//            bz, an, af, bf, 
//            ab, bx, AdControl, g, 
//            av, ba, bg, bc, 
//            by, Dimensions, bu, aw, 
//            c, OrmmaPlayer, ai, j, 
//            r, ac, ax, q, 
//            p, be, bb, OrientationChangeEventManager, 
//            d, b, l, ag, 
//            h, az

public class AdWebView extends bz
{
    public static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        private static final a c[];

        public static a valueOf(String s1)
        {
            return (a)Enum.valueOf(com/microsoft/advertising/android/AdWebView$a, s1);
        }

        public static a[] values()
        {
            a aa[] = c;
            int i1 = aa.length;
            a aa1[] = new a[i1];
            System.arraycopy(aa, 0, aa1, 0, i1);
            return aa1;
        }

        static 
        {
            a = new a("PLAY_AUDIO", 0);
            b = new a("PLAY_VIDEO", 1);
            c = (new a[] {
                a, b
            });
        }

        private a(String s1, int i1)
        {
            super(s1, i1);
        }
    }

    public static interface b
    {

        public abstract void a(com.microsoft.advertising.android.a.b.a a1);

        public abstract void a(String s1);

        public abstract void a(String s1, int i1);

        public abstract ai d();

        public abstract b.b o();

        public abstract com.microsoft.advertising.android.d p();

        public abstract com.microsoft.advertising.android.c q();
    }

    private final class c extends WebChromeClient
    {

        final AdWebView a;

        static AdWebView a(c c1)
        {
            return c1.a;
        }

        public final void onConsoleMessage(String s1, int i1, String s2)
        {
            String.format("Console. Line: %d : Message: %s", new Object[] {
                Integer.valueOf(i1), s1
            });
            av.a("AdWebView.WebChromeClient");
        }

        public final boolean onConsoleMessage(ConsoleMessage consolemessage)
        {
            onConsoleMessage(consolemessage.message(), consolemessage.lineNumber(), consolemessage.sourceId());
            return true;
        }

        public final void onHideCustomView()
        {
            super.onHideCustomView();
        }

        public final boolean onJsAlert(WebView webview, String s1, String s2, JsResult jsresult)
        {
            return super.onJsAlert(webview, s1, s2, jsresult);
        }

        public final boolean onJsPrompt(WebView webview, String s1, String s2, String s3, JsPromptResult jspromptresult)
        {
            g.a(AdWebView.p(a), s2);
            jspromptresult.confirm("");
            return true;
        }

        public final void onShowCustomView(View view, android.webkit.WebChromeClient.CustomViewCallback customviewcallback)
        {
            super.onShowCustomView(view, customviewcallback);
            if (view instanceof FrameLayout)
            {
                int i1 = ((Activity)a.getContext()).getWindow().findViewById(0x1020002).getTop();
                RelativeLayout relativelayout = new RelativeLayout(a.getContext());
                relativelayout.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(-1, -1));
                relativelayout.setPadding(0, i1, 0, 0);
                relativelayout.setBackgroundColor(-1);
                relativelayout.addView(view, new android.widget.FrameLayout.LayoutParams(-1, -1, 17));
                view = by.b(a.getContext(), a.j());
                view.setOnClickListener(new android.view.View.OnClickListener(this, relativelayout, customviewcallback) {

                    final c a;
                    private final RelativeLayout b;
                    private final android.webkit.WebChromeClient.CustomViewCallback c;

                    public final void onClick(View view)
                    {
                        view = new Runnable(this, b, c) {

                            final c._cls1 a;
                            private final RelativeLayout b;
                            private final android.webkit.WebChromeClient.CustomViewCallback c;

                            public final void run()
                            {
                                b.setVisibility(8);
                                c.onCustomViewHidden();
                            }

            
            {
                a = _pcls1;
                b = relativelayout;
                c = customviewcallback;
                super();
            }
                        };
                        if (Looper.myLooper() != Looper.getMainLooper())
                        {
                            com.microsoft.advertising.android.AdWebView.e(c.a(a)).post(view);
                            return;
                        } else
                        {
                            view.run();
                            return;
                        }
                    }

            
            {
                a = c1;
                b = relativelayout;
                c = customviewcallback;
                super();
            }
                });
                relativelayout.addView(by.a(a.getContext(), view));
                ((ViewGroup)((Activity)a.getContext()).getWindow().getDecorView()).addView(relativelayout, new android.widget.FrameLayout.LayoutParams(-1, -1, 17));
            }
        }

        public c()
        {
            a = AdWebView.this;
            super();
        }
    }

    private final class d extends WebViewClient
    {

        final AdWebView a;

        public final void onPageFinished(WebView webview, String s1)
        {
            if (webview.getId() == -1)
            {
                ((AdWebView)webview).n();
            }
        }

        public final void onPageStarted(WebView webview, String s1, Bitmap bitmap)
        {
            super.onPageStarted(webview, s1, bitmap);
        }

        public final void onReceivedError(WebView webview, int i1, String s1, String s2)
        {
            super.onReceivedError(webview, i1, s1, s2);
        }

        public final WebResourceResponse shouldInterceptRequest(WebView webview, String s1)
        {
            if (android.os.Build.VERSION.SDK_INT < 11)
            {
                return null;
            }
            l l2 = new l();
            l l1 = l2;
            if (AdWebView.o(a) != null)
            {
                l1 = l2;
                if (AdWebView.o(a).p() != null)
                {
                    l1 = AdWebView.o(a).p().c();
                }
            }
            try
            {
                av.a("WebResourceUrl", s1);
                ag.a().a(null);
                l1.b(s1);
            }
            catch (Exception exception)
            {
                av.a("AdWebView", "exception loading resource inside web view", exception);
            }
            return super.shouldInterceptRequest(webview, s1);
        }

        public final boolean shouldOverrideUrlLoading(WebView webview, String s1)
        {
            a.j().c("OverrideUrlLoading", s1);
            av.a("AdWebView");
            AdWebView.a(a, s1);
            return true;
        }

        private d()
        {
            a = AdWebView.this;
            super();
        }

        d(byte byte0)
        {
            this();
        }
    }

    private static final class e
    {

        public int a;
        private int b;
        private int c;
        private int d;

        static int a(e e1)
        {
            return e1.b;
        }

        static void a(e e1, int i1)
        {
            e1.c = i1;
        }

        static int b(e e1)
        {
            return e1.c;
        }

        static void b(e e1, int i1)
        {
            e1.d = i1;
        }

        static int c(e e1)
        {
            return e1.d;
        }

        static void c(e e1, int i1)
        {
            e1.b = i1;
        }

        public final void a()
        {
            int i1 = c;
            c = d;
            d = i1;
        }

        public final boolean a(Dimensions dimensions)
        {
            return Math.abs(c - dimensions.c) + Math.abs(d - dimensions.d) < 3;
        }

        private e()
        {
            a = -1;
            c = -1;
            d = -1;
        }

        e(byte byte0)
        {
            this();
        }
    }

    private final class f extends Thread
    {

        final AdWebView a;
        private AdWebView b;
        private Context c;
        private String d;

        public final void run()
        {
            AdWebView.a(b, c, d);
        }

        public f(Context context, AdWebView adwebview1, String s1)
        {
            a = AdWebView.this;
            super();
            b = adwebview1;
            c = context;
            d = s1;
        }
    }

    private final class g
    {

        Map a;
        final AdWebView b;
        private AdWebView c;

        private static Map a(String s1)
        {
            HashMap hashmap = new HashMap();
            if (TextUtils.isEmpty(s1)) goto _L2; else goto _L1
_L1:
            String as[];
            int j1;
            as = s1.split("\\&");
            j1 = as.length;
            int i1 = 0;
              goto _L3
_L7:
            s1 = as[i1].split("\\=");
            if (s1.length <= 0) goto _L5; else goto _L4
_L4:
            Object obj = s1[0];
            String s2;
            try
            {
                if (s1.length <= 1 || s1[1].equalsIgnoreCase("undefined"))
                {
                    break MISSING_BLOCK_LABEL_122;
                }
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                av.c("AdWebView", (new StringBuilder("There was an error parsing the querystring: ")).append(s1.toString()).toString());
                return hashmap;
            }
            s2 = s1[1];
            s1 = s2;
            if (s2.toLowerCase().contains("skype"))
            {
                s1 = s2.replace("+", "%2B");
            }
            s1 = URLDecoder.decode(s1, "UTF-8");
_L6:
            hashmap.put(obj, s1);
_L5:
            i1++;
            continue; /* Loop/switch isn't completed */
            s1 = null;
              goto _L6
_L3:
            if (i1 < j1) goto _L7; else goto _L2
_L2:
            return hashmap;
        }

        static void a(g g1, String s1)
        {
            av.a("ormmaDispatch", (new StringBuilder("ormma operation: ")).append(s1).toString());
            String s2;
            az az1;
            Map map;
            try
            {
                s1 = new URI(s1);
                if (!"ormma".equalsIgnoreCase(s1.getScheme()))
                {
                    break MISSING_BLOCK_LABEL_547;
                }
                if (AdWebView.k(g1.b) != null)
                {
                    AdWebView.k(g1.b).e_();
                    AdWebView.l(g1.b);
                }
                s2 = s1.getHost();
                if (TextUtils.isEmpty(s2))
                {
                    break MISSING_BLOCK_LABEL_547;
                }
                if (AdWebView.m(g1.b) != null && s2.equalsIgnoreCase("adAnchorReady"))
                {
                    AdWebView.m(g1.b).d_();
                    AdWebView.n(g1.b);
                }
                map = a(s1.getRawQuery());
                if (s2.equalsIgnoreCase("service"))
                {
                    s2 = (String)map.get("name");
                }
                if (ab.a().b("webContainerEvents") && ("open".equalsIgnoreCase(s2) || "request".equals(s2)))
                {
                    s1 = new com.microsoft.advertising.android.h(g1.b.a, com.microsoft.advertising.android.a.a.a.k);
                    s1.a("webContainerMethod", s2);
                    s1.a("webContainerMethodParams", new TreeMap(map));
                    g1.b.j().b(s1);
                }
                az1 = (az)g1.a.get(s2);
            }
            // Misplaced declaration of an exception variable
            catch (g g1)
            {
                av.c("AdWebView", (new StringBuilder("There was an error dispatching the operation: ")).append(g1.toString()).toString());
                return;
            }
            s1 = az1;
            if (az1 != null) goto _L2; else goto _L1
_L1:
            if (!s2.equalsIgnoreCase("setShakeProperties") && !s2.equalsIgnoreCase("tiltChange") && !s2.equalsIgnoreCase("shake") && !s2.equalsIgnoreCase("headingChange")) goto _L4; else goto _L3
_L3:
            AdWebView.a(g1.b, new be(g1.c));
            g1.a.put("setShakeProperties", AdWebView.i(g1.b));
            g1.a.put("tiltChange", AdWebView.i(g1.b));
            g1.a.put("shake", AdWebView.i(g1.b));
            g1.a.put("headingChange", AdWebView.i(g1.b));
            s1 = AdWebView.i(g1.b);
_L2:
            if (s1 == null)
            {
                break MISSING_BLOCK_LABEL_433;
            }
            av.b("Flow", String.format("ExecuteOrmmaOperation: %s : %s", new Object[] {
                s2, map.toString()
            }));
            s1.a(s2, map);
            g1.c.k().a(String.format("window.ormmaview.nativeCallComplete('%s');", new Object[] {
                s2
            }));
            return;
_L4:
            s1 = az1;
            if (s2.equalsIgnoreCase("locationChange"))
            {
                AdWebView.a(g1.b, new bb(g1.c));
                g1.a.put("locationChange", AdWebView.j(g1.b));
                s1 = AdWebView.j(g1.b);
            }
            if (true) goto _L2; else goto _L5
_L5:
        }

        public g(AdWebView adwebview1)
        {
            b = AdWebView.this;
            super();
            c = adwebview1;
            a = new HashMap();
            a.put("close", AdWebView.f(AdWebView.this));
            a.put("expand", AdWebView.f(AdWebView.this));
            a.put("open", AdWebView.f(AdWebView.this));
            a.put("playAudio", AdWebView.f(AdWebView.this));
            a.put("playVideo", AdWebView.f(AdWebView.this));
            a.put("resize", AdWebView.f(AdWebView.this));
            a.put("show", AdWebView.f(AdWebView.this));
            a.put("useCustomClose", AdWebView.f(AdWebView.this));
            a.put("locationChange", null);
            a.put("request", AdWebView.g(AdWebView.this));
            a.put("setShakeProperties", null);
            a.put("tiltChange", null);
            a.put("shake", null);
            a.put("headingChange", null);
            a.put("adError", AdWebView.h(AdWebView.this));
            a.put("ormmaLog", AdWebView.h(AdWebView.this));
            a.put("publisherMessage", AdWebView.h(AdWebView.this));
            a.put("setuserengaged", AdWebView.h(AdWebView.this));
            a.put("addEventListener", AdWebView.h(AdWebView.this));
            a.put("removeEventListener", AdWebView.h(AdWebView.this));
        }
    }

    public static interface h
    {

        public abstract void d_();

        public abstract void e_();
    }

    public static interface i
    {

        public abstract void e();
    }


    private static OrmmaPlayer l;
    private static ViewGroup q = null;
    private static ax s;
    private Rect A;
    private boolean B;
    private boolean C;
    private StringBuilder D;
    private aw E;
    private final an F = new an(this);
    private final com.microsoft.advertising.android.g G;
    private b H;
    private final q I;
    private final e J = new e((byte)0);
    private int K;
    private h L;
    private h M;
    private i N;
    private android.view.View.OnClickListener O;
    private by.b P;
    public final AdControl a;
    int b;
    int c;
    private final boolean d = ab.a().b("HIDE_STATUS_BAR");
    private Handler e;
    private ba f;
    private bg g;
    private bb h;
    private bc i;
    private be j;
    private g k;
    private bf m;
    private boolean n;
    private int o;
    private int p;
    private Button r;
    private boolean t;
    private f u;
    private ViewGroup v;
    private int w;
    private int x;
    private Point y[] = {
        new Point(), new Point()
    };
    private Point z[] = {
        new Point(), new Point()
    };

    public AdWebView(Context context, AdControl adcontrol, com.microsoft.advertising.android.g g1, q q1)
    {
        super(context);
        e = new Handler(Looper.getMainLooper());
        n = false;
        t = false;
        A = new Rect();
        B = false;
        C = false;
        D = new StringBuilder();
        H = null;
        b = 0;
        c = 0;
        K = 0;
        L = null;
        M = null;
        N = null;
        O = new android.view.View.OnClickListener() {

            final AdWebView a;

            public final void onClick(View view)
            {
                if (view == AdWebView.a(a))
                {
                    AdWebView.b(a).a();
                    AdWebView.a(a).setVisibility(4);
                }
            }

            
            {
                a = AdWebView.this;
                super();
            }
        };
        P = new by.b() {

            final AdWebView a;

            static AdWebView a(_cls2 _pcls2)
            {
                return _pcls2.a;
            }

            public final void onClick(View view)
            {
                run();
            }

            public final void run()
            {
                Runnable runnable = new Runnable(this) {

                    final _cls2 a;

                    public final void run()
                    {
                        AdWebView.c(_cls2.a(a));
                        if (AdWebView.u() != null)
                        {
                            AdWebView.u().b();
                            ((ViewGroup)((Activity)_cls2.a(a).getContext()).getWindow().getDecorView()).removeView(AdWebView.u());
                            AdWebView.v();
                            if (!_cls2.a(a).o())
                            {
                                AdWebView.d(_cls2.a(a));
                            }
                            _cls2.a(a).requestLayout();
                        }
                    }

            
            {
                a = _pcls2;
                super();
            }
                };
                if (Looper.myLooper() != Looper.getMainLooper())
                {
                    com.microsoft.advertising.android.AdWebView.e(a).post(runnable);
                    return;
                } else
                {
                    runnable.run();
                    return;
                }
            }

            
            {
                a = AdWebView.this;
                super();
            }
        };
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            K = getLayerType();
        }
        af.a(new Object[] {
            g1
        });
        a = adcontrol;
        G = g1;
        m = new bf(g1, this);
        setContentDescription("AdView");
        I = q1;
        int i1 = adcontrol.u();
        g1 = g1.d();
        av.b("Flow", "AdWebView; initialize");
        f = new ba(this, adcontrol);
        g = new bg(this);
        i = new bc(this, g1);
        h = null;
        j = null;
        k = new g(this);
        setWebViewClient(new d((byte)0));
        setWebChromeClient(new c());
        setBackgroundColor(i1);
        r = by.b(getContext(), j());
        r.setVisibility(4);
        r.setOnClickListener(O);
        addView(by.b(context, r));
    }

    private void A()
    {
        if (J.a != -1)
        {
            if ((J.a & 0x400) == 0)
            {
                ((Activity)getContext()).getWindow().clearFlags(1024);
            }
            if ((J.a & 0x800) != 0)
            {
                ((Activity)getContext()).getWindow().addFlags(2048);
            }
        }
        J.a = -1;
    }

    static Button a(AdWebView adwebview)
    {
        return adwebview.r;
    }

    private Dimensions a(int i1, int j1)
    {
        Dimensions dimensions = new Dimensions();
        com.microsoft.advertising.android.c c1 = H.q();
        aw aw1;
        Activity activity;
        int k1;
        if (E != null)
        {
            aw1 = E.a(x().c());
        } else
        {
            aw1 = aw.a;
        }
        activity = af.a(getContext());
        if (activity != null)
        {
            k1 = activity.getWindow().getAttributes().flags;
        } else
        {
            k1 = -1;
        }
        c1.a(dimensions, aw1, k1, i1, j1);
        return dimensions;
    }

    private OrmmaPlayer a(Bundle bundle, boolean flag)
    {
        if (l != null)
        {
            l.c();
        }
        OrmmaPlayer ormmaplayer = new OrmmaPlayer(getContext(), flag);
        l = ormmaplayer;
        ormmaplayer.setPlayData(bundle);
        return l;
    }

    static void a(AdWebView adwebview, Context context, String s1)
    {
        try
        {
            context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(s1)));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context = String.format("url=%s; error=%s", new Object[] {
                s1, context.getMessage()
            });
        }
        adwebview.j().c(context, com.microsoft.advertising.android.a.e.a);
    }

    static void a(AdWebView adwebview, AdWebView adwebview1)
    {
        adwebview1.loadUrl("about:blank");
        adwebview.f();
        adwebview.a.w().i().a(adwebview1);
    }

    static void a(AdWebView adwebview, bb bb1)
    {
        adwebview.h = bb1;
    }

    static void a(AdWebView adwebview, be be1)
    {
        adwebview.j = be1;
    }

    static void a(AdWebView adwebview, String s1)
    {
        if (ac.a(s1, adwebview.j()))
        {
            if (!adwebview.m.h() && !adwebview.g.b() && af.a(new Object[] {
    adwebview.H
}))
            {
                adwebview.H.a(com.microsoft.advertising.android.a.b.a.c);
            }
            if (adwebview.u == null || adwebview.u.getState().equals(Thread.State.TERMINATED))
            {
                adwebview.u = adwebview. new f(adwebview.getContext(), adwebview, by.c(s1));
                adwebview.u.start();
            } else
            if (adwebview.u.getState().equals(Thread.State.NEW))
            {
                adwebview.u.start();
                return;
            }
        }
    }

    private void a(OrmmaPlayer ormmaplayer)
    {
        if (t)
        {
            return;
        }
        try
        {
            if (s != null)
            {
                ((ViewGroup)((Activity)getContext()).getWindow().getDecorView()).removeView(s);
            }
            Object obj = getContext();
            ((Activity)getContext()).getWindow();
            s = new ax(((Context) (obj)));
            ormmaplayer.setOnCompletionRunnable(P);
            ormmaplayer.setOnErrorRunnable(P);
            obj = by.b(getContext(), j());
            ((Button) (obj)).setOnClickListener(P);
            s.a(ormmaplayer, ((Button) (obj)));
            if (J.a == -1)
            {
                J.a = ((Activity)getContext()).getWindow().getAttributes().flags;
                ((Activity)getContext()).getWindow().addFlags(1024);
                ((Activity)getContext()).getWindow().clearFlags(2048);
            }
            ((ViewGroup)((Activity)getContext()).getWindow().getDecorView()).addView(s, ax.a());
            t = true;
            requestFocus();
            ormmaplayer.a();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (OrmmaPlayer ormmaplayer)
        {
            j().a(ormmaplayer, com.microsoft.advertising.android.a.e.a);
        }
        return;
    }

    static an b(AdWebView adwebview)
    {
        return adwebview.F;
    }

    private void b(boolean flag)
    {
        if (flag)
        {
            r.setVisibility(0);
            return;
        } else
        {
            r.setVisibility(8);
            return;
        }
    }

    static void c(AdWebView adwebview)
    {
        adwebview.t = false;
    }

    static void d(AdWebView adwebview)
    {
        adwebview.A();
    }

    static Handler e(AdWebView adwebview)
    {
        return adwebview.e;
    }

    static ba f(AdWebView adwebview)
    {
        return adwebview.f;
    }

    static bc g(AdWebView adwebview)
    {
        return adwebview.i;
    }

    static bg h(AdWebView adwebview)
    {
        return adwebview.g;
    }

    static be i(AdWebView adwebview)
    {
        return adwebview.j;
    }

    static bb j(AdWebView adwebview)
    {
        return adwebview.h;
    }

    static h k(AdWebView adwebview)
    {
        return adwebview.L;
    }

    static void l(AdWebView adwebview)
    {
        adwebview.L = null;
    }

    static h m(AdWebView adwebview)
    {
        return adwebview.M;
    }

    static void n(AdWebView adwebview)
    {
        adwebview.M = null;
    }

    static b o(AdWebView adwebview)
    {
        return adwebview.H;
    }

    static g p(AdWebView adwebview)
    {
        return adwebview.k;
    }

    static ax u()
    {
        return s;
    }

    static void v()
    {
        s = null;
    }

    static ViewGroup w()
    {
        return q;
    }

    private bu x()
    {
        return I.a().m();
    }

    private void y()
    {
        i.d();
        if (j != null)
        {
            j.b();
        }
        if (h != null)
        {
            h.b();
        }
        ba ba1 = f;
        com.microsoft.advertising.android.p.a().l().b(ba1);
    }

    private void z()
    {
        i.e();
        if (j != null)
        {
            j.c();
        }
        if (h != null)
        {
            h.c();
        }
        f.g();
    }

    public final String a(com.microsoft.advertising.android.d d1)
    {
        i.e();
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("window.Ormma=window.ormma;");
        stringbuilder.append(an.b("{state: 'default'}"));
        com.microsoft.advertising.android.c c1;
        int i1;
        int j1;
        if (f.a(d1))
        {
            d1 = "true";
        } else
        {
            d1 = "false";
        }
        stringbuilder.append(an.b(String.format("{viewable: %s}", new Object[] {
            d1
        })));
        stringbuilder.append(an.b(String.format("{network: '%s'}", new Object[] {
            i.b()
        })));
        b = a.t().e().intValue();
        c = a.t().f().intValue();
        stringbuilder.append(an.b(String.format("{size: %s}", new Object[] {
            f.d()
        })));
        if (f != null)
        {
            f.f();
        }
        stringbuilder.append(an.b(String.format("{defaultPosition: %s }", new Object[] {
            f.e()
        })));
        stringbuilder.append(an.c(f.b()));
        stringbuilder.append(an.b(String.format("{orientation: %s}", new Object[] {
            Integer.valueOf(f.c())
        })));
        d1 = F;
        c1 = I.b();
        i1 = c1.a();
        j1 = c1.b();
        stringbuilder.append(an.b(String.format("{screenSize: %s}", new Object[] {
            String.format(Locale.ENGLISH, "{width: %d, height: %d }", new Object[] {
                Integer.valueOf(d1.a(i1)), Integer.valueOf(d1.a(j1))
            })
        })));
        stringbuilder.append(F.a(a(-1, -1)));
        stringbuilder.append(String.format("Ormma.setSdkVersion('%s','%s','%s','%d','%s');", new Object[] {
            "4.4.40715.7", "Android Phone", "Android", Integer.valueOf(android.os.Build.VERSION.SDK_INT), android.os.Build.VERSION.RELEASE
        }));
        stringbuilder.append(String.format("Ormma.setLocale('%s');", new Object[] {
            bg.c()
        }));
        stringbuilder.append(an.b(bg.a()));
        return stringbuilder.toString();
    }

    final void a()
    {
        B = true;
    }

    public final void a(Bundle bundle)
    {
        if (m.d())
        {
            int i1 = o;
            int j1 = p;
            a.w().b(false);
            android.view.ViewGroup.LayoutParams layoutparams = a.getLayoutParams();
            x = layoutparams.height;
            w = layoutparams.width;
            b(true);
            a("resize", String.format("mOldWidth=%s;OldHeight=%s;width=%s;height=%s", new Object[] {
                String.valueOf(w), String.valueOf(x), String.valueOf(layoutparams.width), String.valueOf(layoutparams.height)
            }));
            layoutparams.height = bundle.getInt("resize_height", layoutparams.height);
            layoutparams.width = bundle.getInt("resize_width", layoutparams.width);
            a.a(layoutparams, true);
            o = i1;
            p = j1;
            F.a(bf.b.b);
            b(an.c(f.b()));
        }
    }

    final void a(h h1)
    {
        L = h1;
    }

    final void a(i i1)
    {
        N = i1;
    }

    final void a(aw aw1)
    {
        E = aw1;
    }

    public final void a(String s1)
    {
        if (H.o() == b.b.b)
        {
            H.a(s1);
            return;
        } else
        {
            H.a(s1, 3);
            return;
        }
    }

    public final void a(String s1, String s2)
    {
        av.a("ormmaEvent", String.format("Ormma Event name=%s params=%s", new Object[] {
            s1, s2
        }));
        m.a(s2);
    }

    public final void a(Map map)
    {
        boolean flag1 = true;
        if (m.e())
        {
            int i1 = ab.a().a("DEFAULT_INVISIBLE_TIME_WHILE_EXPANDING_MS");
            if (g != null)
            {
                g.a(true, true);
            }
            a.w().b(false);
            Object obj = a.getLayoutParams();
            x = ((android.view.ViewGroup.LayoutParams) (obj)).height;
            w = ((android.view.ViewGroup.LayoutParams) (obj)).width;
            e.a(J, x().b(Integer.parseInt((String)map.get("width"))));
            e.b(J, x().b(Integer.parseInt((String)map.get("height"))));
            if (J.a(a(-1, -1)))
            {
                e.a(J, -1);
                e.b(J, -1);
            }
            Object obj2 = a(e.b(J), e.c(J));
            obj = new android.widget.FrameLayout.LayoutParams(0, 0);
            ((Dimensions) (obj2)).a(((android.view.ViewGroup.MarginLayoutParams) (obj)));
            if (q != null)
            {
                ((ViewGroup)((Activity)getContext()).getWindow().getDecorView()).removeView(q);
            }
            obj2 = new FrameLayout(getContext());
            q = ((ViewGroup) (obj2));
            ((ViewGroup) (obj2)).setVisibility(4);
            J.a = ((Activity)getContext()).getWindow().getAttributes().flags;
            if (d)
            {
                ((Activity)getContext()).getWindow().addFlags(1024);
            }
            if (d)
            {
                ((Activity)getContext()).getWindow().clearFlags(2048);
            }
            e.c(J, ((Activity)getContext()).getRequestedOrientation());
            obj2 = (String)map.get("url");
            boolean flag;
            boolean flag2;
            if (((String)map.get("useCustomClose")).equalsIgnoreCase("true"))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                flag2 = false;
            } else
            {
                flag2 = true;
            }
            b(flag2);
            if (TextUtils.isEmpty(((CharSequence) (obj2))) || ((String) (obj2)).equals("undefined"))
            {
                v = (ViewGroup)getParent();
                v.removeView(this);
                q.addView(this, ((android.view.ViewGroup.LayoutParams) (obj)));
                if (((String)map.get("lockOrientation")).equalsIgnoreCase("true"))
                {
                    flag = flag1;
                } else
                {
                    flag = false;
                }
                if (flag)
                {
                    ((Activity)getContext()).setRequestedOrientation(5);
                }
                requestFocus();
            } else
            {
                map = a.w().i().a();
                map.setWebViewClient(new WebViewClient(map) {

                    final AdWebView a;
                    private final AdWebView b;

                    public final void onReceivedError(WebView webview, int j1, String s1, String s2)
                    {
                        AdWebView.a(a, b);
                    }

                    public final boolean shouldOverrideUrlLoading(WebView webview, String s1)
                    {
                        return false;
                    }

            
            {
                a = AdWebView.this;
                b = adwebview1;
                super();
            }
                });
                q.addView(map, ((android.view.ViewGroup.LayoutParams) (obj)));
                map.loadUrl(((String) (obj2)));
                if (!flag)
                {
                    Object obj1 = by.b(getContext(), j());
                    ((Button) (obj1)).setOnClickListener(new android.view.View.OnClickListener(map) {

                        final AdWebView a;
                        private final AdWebView b;

                        public final void onClick(View view)
                        {
                            AdWebView.a(a, b);
                        }

            
            {
                a = AdWebView.this;
                b = adwebview1;
                super();
            }
                    });
                    obj1 = by.b(getContext(), ((Button) (obj1)));
                    q.addView(((View) (obj1)));
                }
                map.setOnKeyListener(new android.view.View.OnKeyListener(map) {

                    final AdWebView a;
                    private final AdWebView b;

                    public final boolean onKey(View view, int j1, KeyEvent keyevent)
                    {
                        if (j1 == 4)
                        {
                            AdWebView.a(a, b);
                            return true;
                        } else
                        {
                            return false;
                        }
                    }

            
            {
                a = AdWebView.this;
                b = adwebview1;
                super();
            }
                });
                map.requestFocus();
            }
            map = new android.view.WindowManager.LayoutParams(-1, -1);
            ((ViewGroup)((Activity)getContext()).getWindow().getDecorView()).addView(q, map);
            F.a(bf.b.c);
            b(an.c(f.b()));
            e.postDelayed(new Runnable() {

                final AdWebView a;

                public final void run()
                {
                    if (AdWebView.w() != null)
                    {
                        AdWebView.w().setVisibility(0);
                    }
                }

            
            {
                a = AdWebView.this;
                super();
            }
            }, i1);
        }
    }

    public final void a(boolean flag)
    {
        y();
        P.run();
        F.a("window.ormmaview.suspendAV();");
        m.a(flag);
    }

    public final boolean a(bf.b b1)
    {
        return b1 == m.i();
    }

    public final q b()
    {
        return I;
    }

    public final void b(Bundle bundle)
    {
        a("playaudio", "");
        a(a(bundle, false));
    }

    final void b(h h1)
    {
        M = h1;
    }

    public final void b(String s1)
    {
        av.a("Flow");
        if (!C) goto _L2; else goto _L1
_L1:
        String s2;
        s2 = s1;
        if (D != null)
        {
            s2 = s1;
            if (D.length() > 0)
            {
                D.append(s1);
                s2 = D.toString();
                D = null;
            }
        }
        s1 = j();
        if (s2 == null) goto _L4; else goto _L3
_L3:
        s1 = new bz._cls1(this, s2, s1);
        if (Looper.myLooper() == Looper.getMainLooper()) goto _L6; else goto _L5
_L5:
        post(s1);
_L4:
        return;
_L6:
        s1.run();
        return;
_L2:
        if (s1 != null && !B)
        {
            if (D == null)
            {
                D = new StringBuilder();
            }
            af.a(new Object[] {
                D
            });
            D.append(s1);
            if (af.a() && !s1.contains("nativeCallComplete"))
            {
                av.c("AdWebView", (new StringBuilder("javascript called too early: ")).append(s1).toString());
                return;
            }
        }
        if (true) goto _L4; else goto _L7
_L7:
    }

    public final void b(String s1, String s2)
    {
        j().a(s1, s2);
    }

    public final void b(Map map)
    {
        if (m.b())
        {
            boolean flag;
            boolean flag1;
            if (((String)map.get("useCustomClose")).equalsIgnoreCase("true"))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                flag1 = false;
            } else
            {
                flag1 = true;
            }
            b(flag1);
        }
    }

    public final void c()
    {
        H = null;
        e.removeCallbacksAndMessages(null);
        i.c();
        if (j != null)
        {
            j.a();
        }
        if (h != null)
        {
            h.a();
        }
        ba ba1 = f;
        com.microsoft.advertising.android.p.a().l().b(ba1);
        A();
        m = new bf(G, this);
        e();
        setId(0);
        D = null;
        C = false;
        B = false;
        loadUrl("about:blank");
        clearHistory();
        clearFormData();
        clearMatches();
        j = null;
        h = null;
        N = null;
        L = null;
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            av.b("Flow", (new StringBuilder("Clearing the web view's layer type to ")).append(K).toString());
            setLayerType(K, null);
        }
    }

    public final void c(Bundle bundle)
    {
        a("playvideo", "");
        a(a(bundle, true));
    }

    public final volatile void c(String s1)
    {
        super.c(s1);
    }

    public final void c(String s1, String s2)
    {
        String s3 = String.format("window.ormmaview.fireErrorEvent('%s', '%s');", new Object[] {
            s1, s2
        });
        a("error", String.format("msg=%s;action=%s", new Object[] {
            s2, s1
        }));
        b(s3);
    }

    protected final boolean d()
    {
        if (s != null)
        {
            P.run();
            return true;
        }
        if (m.b())
        {
            F.a();
            return true;
        } else
        {
            return false;
        }
    }

    final void e()
    {
        getLayoutParams().width = o;
        getLayoutParams().height = p;
        requestLayout();
    }

    public final void f()
    {
        m.f();
        F.a(bf.b.a);
        b(an.c(f.b()));
    }

    public final void g()
    {
        m.c();
        F.a(m.i());
        b(an.c(f.b()));
    }

    public final void h()
    {
        av.a("AdWebView");
        ((Activity)getContext()).setRequestedOrientation(e.a(J));
        if (v != null)
        {
            q.removeAllViews();
            setBackgroundColor(a.u());
            v.addView(this, new android.widget.LinearLayout.LayoutParams(-1, -1));
            v = null;
        }
        if (q != null)
        {
            a("close", "viewState=default");
            q.removeAllViews();
            ViewGroup viewgroup = q;
            ((ViewGroup)((Activity)getContext()).getWindow().getDecorView()).removeView(viewgroup);
            q = null;
        }
        if (g != null)
        {
            g.a(false, true);
        }
        P.run();
        android.view.ViewGroup.LayoutParams layoutparams = a.getLayoutParams();
        layoutparams.height = x;
        layoutparams.width = w;
        a.a(layoutparams, true);
        requestLayout();
        if (!m.a())
        {
            a.w().b(true);
        }
        b(false);
        A();
        requestFocus();
    }

    public final void i()
    {
        android.view.ViewGroup.LayoutParams layoutparams = a.getLayoutParams();
        layoutparams.height = x;
        layoutparams.width = w;
        a.a(layoutparams, true);
        requestLayout();
        if (!m.a())
        {
            a.w().b(true);
        }
        b(false);
        A();
        requestFocus();
    }

    public final ai j()
    {
        if (H != null)
        {
            return H.d();
        } else
        {
            return ai.a.a();
        }
    }

    public final an k()
    {
        return F;
    }

    public final void l()
    {
        J.a();
        F.a(an.b(String.format("{orientation: %s}", new Object[] {
            Integer.valueOf(OrientationChangeEventManager.a(getContext().getResources()))
        })));
        Dimensions dimensions = a(-1, -1);
        an an1 = F;
        an1.a(an.b(String.format("{screenSize: { width: %s, height: %s}}", new Object[] {
            Integer.valueOf(an1.a(dimensions.c)), Integer.valueOf(an1.a(dimensions.d))
        })));
        b(F.a(a(-1, -1)));
        if (q == null || !m.h())
        {
            return;
        } else
        {
            Dimensions dimensions1 = a(e.b(J), e.c(J));
            android.view.ViewGroup.MarginLayoutParams marginlayoutparams = (android.view.ViewGroup.MarginLayoutParams)getLayoutParams();
            dimensions1.a(marginlayoutparams);
            setLayoutParams(marginlayoutparams);
            return;
        }
    }

    public final Dimensions m()
    {
        return a(-1, -1);
    }

    protected final void n()
    {
        av.a("AdWebView", "onPageFinished() initializing ormma");
        C = true;
        setId(0);
        if (N != null)
        {
            N.e();
            N = null;
        }
        b("window.ormma.signalReady();");
    }

    public final boolean o()
    {
        return m.h();
    }

    public void onAttachedToWindow()
    {
        if (!B)
        {
            z();
        }
        requestFocus();
        super.onAttachedToWindow();
    }

    protected void onDetachedFromWindow()
    {
        y();
        super.onDetachedFromWindow();
    }

    public volatile boolean onKeyDown(int i1, KeyEvent keyevent)
    {
        return super.onKeyDown(i1, keyevent);
    }

    public void onMeasure(int i1, int j1)
    {
        super.onMeasure(i1, j1);
    }

    protected void onSizeChanged(int i1, int j1, int k1, int l1)
    {
        super.onSizeChanged(i1, j1, k1, l1);
        if (i1 != b || j1 != c)
        {
            b = i1;
            c = j1;
            F.a(an.b(String.format("{size: { width: %s, height: %s}}", new Object[] {
                Integer.valueOf(x().a(i1, true)), Integer.valueOf(x().a(j1, true))
            })));
        }
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        if (motionevent.getAction() == 0)
        {
            if (B)
            {
                return false;
            }
            if (!m.a())
            {
                requestFocus();
                super.onTouchEvent(motionevent);
            }
            return true;
        } else
        {
            return super.onTouchEvent(motionevent);
        }
    }

    protected void onVisibilityChanged(View view, int i1)
    {
        if (!m.a()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (i1 != 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (n) goto _L1; else goto _L3
_L3:
        n = true;
        F.a(true);
        return;
        if (i1 != 4 && i1 != 8 || !n) goto _L1; else goto _L4
_L4:
        n = false;
        F.a(false);
        return;
    }

    public final void p()
    {
        z();
        if (l != null)
        {
            l.resume();
        }
        F.a("window.ormmaview.resumeAV();");
        m.g();
        F.d(i.b());
    }

    public final void q()
    {
        b b1 = H;
        com.microsoft.advertising.android.a.b.a a1;
        if (g.b())
        {
            a1 = com.microsoft.advertising.android.a.b.a.b;
        } else
        {
            a1 = com.microsoft.advertising.android.a.b.a.a;
        }
        b1.a(a1);
    }

    public final boolean r()
    {
        return g.b();
    }

    public final void s()
    {
        AdControl adcontrol = a;
        Point apoint[] = y;
        Point apoint1[] = z;
        Rect rect = A;
        com.microsoft.advertising.android.d d1;
        boolean flag;
        if (H != null)
        {
            d1 = H.p();
        } else
        {
            d1 = null;
        }
        flag = by.a(adcontrol, apoint, apoint1, rect, d1);
        av.a("ormma", (new StringBuilder("checkViewableChangeState() visible=")).append(flag).toString());
        if (n != flag)
        {
            n = flag;
            F.a(flag);
        }
    }

    public volatile void setBackgroundColor(int i1)
    {
        super.setBackgroundColor(i1);
    }

    public void setLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        o = layoutparams.width;
        p = layoutparams.height;
        super.setLayoutParams(layoutparams);
    }

    public void setParentContainer(com.microsoft.advertising.android.b b1)
    {
        H = b1;
    }

    public void setWebViewLayerType(int i1)
    {
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            av.b("Flow", (new StringBuilder("Setting the web view's layer type to ")).append(i1).toString());
            setLayerType(i1, null);
        }
    }

    public final void t()
    {
        b((new StringBuilder(String.valueOf(String.format("(function(){var c=%d;var b=%d;", new Object[] {
            Integer.valueOf(x().a(I.d())), Integer.valueOf(x().a(I.c()))
        })))).append("if(c<=0||b<=0){return}var a=document.getElementsByTagName(\"img\");var d=a.length;for(var e=0;e<a.length;e++){var f=a[e];if(f.width==1||f.height==1||f.style.width==1||f.style.height==1){d--}}if(d>1){return}for(var e=0;e<a.length;e++){var f=a[e];if(f.width==1||f.height==1||f.style.width==1||f.style.height==1){continue}f.width=b;f.height=c;f.style.width=b;f.style.height=c}})();").toString());
    }

}
