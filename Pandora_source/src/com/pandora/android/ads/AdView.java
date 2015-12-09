// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.ads;

import android.app.Activity;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.Html;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.admarvel.android.ads.AdMarvelView;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.doubleclick.CustomRenderedAd;
import com.google.android.gms.ads.doubleclick.PublisherAdView;
import com.pandora.android.PandoraService;
import com.pandora.android.activity.BaseAdFragmentActivity;
import com.pandora.android.data.p;
import com.pandora.android.provider.b;
import com.pandora.android.util.af;
import com.pandora.android.util.s;
import com.pandora.radio.data.a;
import com.pandora.radio.data.aa;
import com.pandora.radio.data.ad;
import com.pandora.radio.data.ag;
import com.pandora.radio.data.y;
import com.pandora.radio.util.h;
import com.pandora.radio.util.k;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.security.InvalidParameterException;
import java.util.HashMap;
import java.util.Locale;
import org.json.JSONObject;
import p.cp.d;
import p.cw.c;
import p.dd.at;
import p.dd.bh;
import p.l.g;
import p.l.j;

// Referenced classes of package com.pandora.android.ads:
//            h, c, g, j, 
//            VideoAdManager, m, k

public class AdView extends LinearLayout
    implements com.pandora.android.ads.h
{
    private static class a extends Handler
    {

        WeakReference a;

        public void a()
        {
            sendMessage(obtainMessage(1002));
        }

        public void a(h.b b1, com.pandora.radio.data.a a1, String s1, boolean flag, Runnable runnable)
        {
            Message message = obtainMessage(1000);
            message.obj = ((Object) (new Object[] {
                a1, b1, s1, Boolean.valueOf(flag), runnable
            }));
            sendMessage(message);
        }

        public void a(com.pandora.radio.util.k.a a1)
        {
            Message message = obtainMessage(1001);
            if (a1 != null)
            {
                message.getData().putSerializable("ad_close_extra", a1);
            }
            if (Looper.myLooper() == Looper.getMainLooper())
            {
                handleMessage(message);
                return;
            } else
            {
                sendMessage(message);
                return;
            }
        }

        public void handleMessage(Message message)
        {
            AdView adview;
label0:
            {
label1:
                {
label2:
                    {
                        adview = (AdView)a.get();
                        if (adview != null && com.pandora.android.ads.AdView.b(adview) != null)
                        {
                            switch (message.what)
                            {
                            default:
                                super.handleMessage(message);
                                break;

                            case 1000: 
                                break label2;

                            case 1001: 
                                break label1;

                            case 1002: 
                                break label0;
                            }
                        }
                        return;
                    }
                    message = ((Message) ((Object[])(Object[])message.obj));
                    com.pandora.android.ads.AdView.a(adview, (com.pandora.radio.data.a)message[0], (h.b)message[1], (String)message[2], ((Boolean)message[3]).booleanValue(), (Runnable)message[4]);
                    return;
                }
                Bundle bundle = message.peekData();
                message = null;
                if (bundle != null)
                {
                    message = (com.pandora.radio.util.k.a)bundle.getSerializable("ad_close_extra");
                }
                com.pandora.android.ads.AdView.a(adview, message);
                return;
            }
            AdView.m(adview);
        }

        a(AdView adview)
        {
            a = new WeakReference(adview);
        }
    }

    public static interface b
    {

        public abstract int C();

        public abstract BaseAdFragmentActivity D();

        public abstract boolean E();

        public abstract boolean F();

        public abstract boolean G();

        public abstract void a(h.b b1);

        public abstract void a(h.b b1, int i1, int j1, boolean flag, boolean flag1);

        public abstract void s();

        public abstract boolean t();

        public abstract Point u();
    }

    class c extends p.cp.d
    {

        final AdView a;

        protected HashMap a(com.pandora.android.data.j j1, p.cq.b b1)
        {
            super.a(j1, b1);
            AdView.i(a);
            a.c = new com.pandora.android.ads.j((RelativeLayout)a.findViewById(0x7f1001f4), j1, t());
            a.c.a();
            a.a(a.b, a.b.getLayoutParams());
            return j;
        }

        public void a(int i1)
        {
            if (a.d == null)
            {
                return;
            } else
            {
                a.d.a(i1);
                a.d.b(false);
                com.pandora.android.ads.AdView.a(a, 1);
                com.pandora.android.ads.AdView.a(a, a.d.N(), a.d.M(), a.d.ah());
                return;
            }
        }

        public void a(String s1, com.pandora.android.iap.d.b b1)
        {
            Activity activity = (Activity)m();
            com.pandora.android.iap.d.d.a().a(activity, s1, b1);
        }

        protected void a(JSONObject jsonobject)
        {
            super.a(jsonobject);
            if (a.d != null)
            {
                a.d.a(t());
            }
        }

        protected transient void a(p ap[])
        {
            if (!com.pandora.android.ads.AdView.j(a))
            {
                com.pandora.android.ads.AdView.c(a, true);
                ap = new com.pandora.android.ads.k(com.pandora.android.ads.AdView.c(a).o(), ap);
                (new p.di.a()).execute(new ad[] {
                    ap
                });
            }
        }

        public boolean a(boolean flag)
        {
            com.pandora.android.ads.AdView.a(a, Boolean.valueOf(flag));
            com.pandora.android.ads.AdView.a(a, a.d);
            return true;
        }

        protected void c()
        {
            com.pandora.android.ads.AdView.a(a, com.pandora.radio.util.k.a.b);
        }

        public void d()
        {
            b b1 = com.pandora.android.ads.AdView.b(a);
            if (b1 != null)
            {
                b1.s();
            }
        }

        public void e()
        {
            Point point;
            if (a.d != null)
            {
                if ((point = com.pandora.android.ads.AdView.b(a).u()) != null)
                {
                    int i1 = point.x;
                    int j1 = point.y;
                    a.d.a(com.pandora.android.util.s.b(i1), com.pandora.android.util.s.b(j1));
                    a.d.b(true);
                    com.pandora.android.ads.AdView.a(a, 1);
                    com.pandora.android.ads.AdView.a(a, a.d.N(), a.d.M(), a.d.ah());
                    return;
                }
            }
        }

        public void f()
        {
            com.pandora.android.ads.AdView.a(a, com.pandora.radio.util.k.a.b);
        }

        public void onLoadResource(WebView webview, String s1)
        {
            super.onLoadResource(webview, s1);
            a(webview);
        }

        public void onPageFinished(WebView webview, String s1)
        {
            super.onPageFinished(webview, s1);
            try
            {
                if (com.pandora.android.ads.AdView.d(a))
                {
                    com.pandora.android.ads.AdView.b("FAILED to load AD.");
                    com.pandora.android.ads.AdView.b(a, false);
                    com.pandora.android.ads.AdView.a(a, com.pandora.radio.util.k.a.k);
                    return;
                }
            }
            // Misplaced declaration of an exception variable
            catch (WebView webview)
            {
                p.df.a.e("AdView", "error on ad view finished:", webview);
                com.pandora.android.ads.AdView.a(a, 0, 0, com.pandora.radio.data.a.a.a);
                return;
            }
            com.pandora.android.ads.AdView.b(a, false);
            if (!com.pandora.android.provider.b.a.a(AdView.e(a)))
            {
                p.df.a.a("AdView", (new StringBuilder()).append("onPageFinished but cannot show ad for zone ").append(AdView.e(a)).toString());
                throw new Exception();
            }
            if (com.pandora.android.ads.AdView.b(a) == null)
            {
                p.df.a.a("AdView", "onPageFinished but no adViewHolder");
                return;
            }
            if (!com.pandora.android.ads.AdView.c(a).e())
            {
                p.df.a.a("AdView", "onPageFinished but it's an audio track");
                return;
            }
            if (!AdView.f(a) || com.pandora.android.ads.AdView.g(a) == 1)
            {
                break MISSING_BLOCK_LABEL_255;
            }
            com.pandora.android.ads.AdView.a(a, 1);
            com.pandora.android.ads.AdView.a(a, a.d.N(), a.d.M(), a.d.ah());
            webview = com.pandora.android.ads.AdView.h(a);
            if (webview == null)
            {
                break MISSING_BLOCK_LABEL_255;
            }
            webview.recordImpression();
            if (aa.a(a.g))
            {
                com.pandora.android.ads.AdView.a(a, null);
                a.a(a.g, a.f);
            }
            return;
        }

        public void onReceivedError(WebView webview, int i1, String s1, String s2)
        {
            com.pandora.android.ads.AdView.b((new StringBuilder()).append("error rending ad view: errorCode:").append(i1).append(" descr:").append(s1).append(" failingUrl:").append(s2).toString());
            com.pandora.android.ads.AdView.b(a, true);
            try
            {
                webview.stopLoading();
            }
            // Misplaced declaration of an exception variable
            catch (String s1) { }
            try
            {
                webview.clearView();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (WebView webview)
            {
                return;
            }
        }

        public c(Activity activity, boolean flag, WebView webview)
        {
            a = AdView.this;
            super(activity, webview);
            d(flag);
        }
    }

    class d
    {

        final AdView a;

        public void a()
        {
            com.pandora.android.provider.b.a.e().c(this);
            com.pandora.android.provider.b.a.b().b(this);
        }

        public void b()
        {
            com.pandora.android.provider.b.a.e().b(this);
            com.pandora.android.provider.b.a.b().c(this);
        }

        public void onCoachmarkVisibility(p.bz.g g1)
        {
            AdView adview = a;
            boolean flag;
            if (g1.a == p.bz.g.a.a)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            adview.h = flag;
            if (!a.h && a.getVisibility() == 4 && a.b != null && a.b.getVisibility() == 0 && a.d != null && !a.d.K())
            {
                a.setVisibility(0);
                a.a(true);
            }
        }

        public void onStationData(at at1)
        {
            a.f = at1.a;
        }

        public void onTrackState(bh bh1)
        {
            a.g = bh1.b;
        }

        d()
        {
            a = AdView.this;
            super();
        }
    }


    private KeyguardManager A;
    private int B;
    private boolean C;
    private String D;
    private boolean E;
    private String F;
    private android.view.View.OnClickListener G = new android.view.View.OnClickListener() {

        final AdView a;

        public void onClick(View view)
        {
            com.pandora.android.ads.AdView.a(a, com.pandora.radio.util.k.a.c, null);
            com.pandora.android.activity.a.a(com.pandora.android.ads.AdView.b(a).D());
        }

            
            {
                a = AdView.this;
                super();
            }
    };
    private final com.admarvel.android.ads.AdMarvelView.AdMarvelViewListener H;
    private a I;
    protected WebView a;
    protected ViewGroup b;
    protected com.pandora.android.ads.j c;
    protected com.pandora.radio.data.a d;
    d e;
    y f;
    aa g;
    public boolean h;
    private DisplayMetrics i;
    private RelativeLayout j;
    private AdMarvelView k;
    private PublisherAdView l;
    private ViewGroup m;
    private View n;
    private TextView o;
    private View p;
    private p.cp.d q;
    private ImageButton r;
    private View s;
    private Boolean t;
    private b u;
    private com.pandora.android.ads.g v;
    private boolean w;
    private int x;
    private boolean y;
    private boolean z;

    public AdView(Context context)
    {
        super(context);
        B = -1;
        C = false;
        f = null;
        g = null;
        E = false;
        H = new com.admarvel.android.ads.AdMarvelView.AdMarvelViewListener() {

            final AdView a;

            public void onClickAd(AdMarvelView admarvelview, String s1)
            {
                com.pandora.android.ads.AdView.b("admarvel onClickAd");
            }

            public void onClose()
            {
                com.pandora.android.ads.AdView.b("admarvel onClose");
            }

            public void onExpand()
            {
                com.pandora.android.ads.AdView.b("admarvel onExpand");
            }

            public void onFailedToReceiveAd(AdMarvelView admarvelview, int i1, com.admarvel.android.ads.AdMarvelUtils.ErrorReason errorreason)
            {
                com.pandora.android.ads.AdView.b(String.format(Locale.US, "admarvel onFailedToReceiveAd, code = %d, reason = %s", new Object[] {
                    Integer.valueOf(i1), errorreason.toString()
                }));
                admarvelview = a.d;
                if (admarvelview != null && !admarvelview.K() && !com.pandora.android.util.s.a(admarvelview.L()) && admarvelview.ah() == com.pandora.radio.data.a.a.b)
                {
                    admarvelview = (new com.pandora.radio.data.a.b(admarvelview)).a(com.pandora.radio.data.a.a.a).a(0).a();
                    a.a(com.pandora.android.ads.h.b.b, admarvelview, "Retry failed admarvel ad", false, null);
                }
            }

            public void onReceiveAd(AdMarvelView admarvelview)
            {
                com.pandora.android.ads.AdView.b("admarvel:  onReceiveAd");
                com.pandora.android.ads.AdView.k(a);
            }

            public void onRequestAd(AdMarvelView admarvelview)
            {
                com.pandora.android.ads.AdView.b("admarvel onRequestAd");
            }

            
            {
                a = AdView.this;
                super();
            }
        };
        I = new a(this);
    }

    public AdView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        B = -1;
        C = false;
        f = null;
        g = null;
        E = false;
        H = new _cls5();
        I = new a(this);
    }

    private boolean A()
    {
        return j() && !G();
    }

    private boolean B()
    {
        boolean flag = false;
        if (PandoraService.e())
        {
            d("Force ADM Server Side Ad ");
            String s1 = c(com.pandora.android.ads.c.b().j());
            if (s1 != null)
            {
                d = (new com.pandora.radio.data.a.b(d)).a(com.pandora.radio.data.a.a.a).c(s1).a();
            }
            H.onFailedToReceiveAd(null, 0, com.admarvel.android.ads.AdMarvelUtils.ErrorReason.NO_BANNER_FOUND);
            flag = true;
        }
        return flag;
    }

    private void C()
    {
        if (l != null)
        {
            int i1 = (int)(getResources().getDimension(0x7f090051) / getResources().getDisplayMetrics().density);
            d.a(d.N() + i1 * 2, i1 * 2 + d.M());
            a(d.N(), d.M(), d.ah());
        }
    }

    private void D()
    {
        if (a != null && k != null)
        {
            a(d.N(), d.M(), d.ah());
        }
    }

    private void E()
    {
        if (n.getVisibility() == 0)
        {
            int k1 = n.getLayoutParams().height;
            int i1 = k1;
            if (p.getVisibility() == 0)
            {
                i1 = k1 + p.getLayoutParams().height;
            }
            u.a(com.pandora.android.ads.h.b.a, i1, n.getLayoutParams().width, false, false);
        } else
        if (p.getVisibility() == 0)
        {
            int j1 = p.getLayoutParams().height;
            u.a(com.pandora.android.ads.h.b.c, j1, p.getLayoutParams().width, false, false);
            return;
        }
    }

    private void F()
    {
        s.setVisibility(8);
        b.setVisibility(8);
        a.setVisibility(8);
        k.setVisibility(8);
        j.setVisibility(8);
        if (l != null)
        {
            l.setVisibility(8);
        }
        m.setVisibility(8);
        if (c != null)
        {
            c.b();
        }
        n.setVisibility(8);
        p.setVisibility(8);
    }

    private boolean G()
    {
        return A.inKeyguardRestrictedInputMode();
    }

    private String H()
    {
        Object obj1 = getVisibleAdViewType();
        if (obj1 == com.pandora.android.ads.h.b.b)
        {
            boolean flag = g();
            Object obj = a(((h.b) (obj1)));
            String s1;
            if (d == null)
            {
                s1 = "~";
            } else
            {
                s1 = Integer.toString(d.M());
            }
            if (com.pandora.android.util.s.u() || !flag)
            {
                s1 = (new StringBuilder()).append(s1).append("(not closeable)").toString();
            } else
            {
                s1 = (new StringBuilder()).append(s1).append("(closeable)").toString();
            }
            obj1 = ((h.b) (obj1)).toString();
            if (obj != null)
            {
                obj = ((com.pandora.radio.data.a.a) (obj)).toString();
            } else
            {
                obj = "~";
            }
            return String.format("%s,%s,%s", new Object[] {
                obj1, obj, s1
            });
        }
        if (obj1 != null)
        {
            return ((h.b) (obj1)).toString();
        } else
        {
            return "NONE";
        }
    }

    static int a(AdView adview, int i1)
    {
        adview.B = i1;
        return i1;
    }

    private View a(com.pandora.radio.data.a a1)
    {
        if (a1 == null)
        {
            return a;
        }
        static class _cls7
        {

            static final int a[];
            static final int b[];

            static 
            {
                b = new int[com.pandora.android.ads.h.b.values().length];
                try
                {
                    b[com.pandora.android.ads.h.b.c.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    b[com.pandora.android.ads.h.b.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    b[com.pandora.android.ads.h.b.a.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                a = new int[com.pandora.radio.data.a.a.values().length];
                try
                {
                    a[com.pandora.radio.data.a.a.b.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[com.pandora.radio.data.a.a.d.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[com.pandora.radio.data.a.a.a.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[com.pandora.radio.data.a.a.c.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (com.pandora.android.ads._cls7.a[a1.ah().ordinal()])
        {
        default:
            throw new InvalidParameterException((new StringBuilder()).append("getActiveAdView() called with unknown AdType: ").append(a1.ah()).toString());

        case 1: // '\001'
            return k;

        case 2: // '\002'
            if (l != null)
            {
                return l;
            }
            // fall through

        case 3: // '\003'
        case 4: // '\004'
            return a;
        }
    }

    private com.pandora.radio.data.a.a a(h.b b1)
    {
        Object obj = null;
        com.pandora.radio.data.a.a a1 = obj;
        if (b1 == com.pandora.android.ads.h.b.b)
        {
            if (a != null && a.getVisibility() == 0)
            {
                a1 = com.pandora.radio.data.a.a.a;
            } else
            {
                if (k != null && k.getVisibility() == 0)
                {
                    return com.pandora.radio.data.a.a.b;
                }
                a1 = obj;
                if (l != null)
                {
                    a1 = obj;
                    if (l.getVisibility() == 0)
                    {
                        return com.pandora.radio.data.a.a.d;
                    }
                }
            }
        }
        return a1;
    }

    static Boolean a(AdView adview, Boolean boolean1)
    {
        adview.t = boolean1;
        return boolean1;
    }

    static String a(AdView adview, String s1)
    {
        adview.F = s1;
        return s1;
    }

    private void a(int i1, int j1, com.pandora.radio.data.a.a a1)
    {
        if (j1 <= 0)
        {
            a(((h.b) (null)), ((com.pandora.radio.data.a.a) (null)), 8);
            u.a(com.pandora.android.ads.h.b.b, 0, 0, false, false);
            return;
        }
        boolean flag = f(d);
        int l1 = i1;
        int k1 = j1;
        Object obj;
        android.view.ViewGroup.LayoutParams layoutparams;
        if (a1 == com.pandora.radio.data.a.a.b)
        {
            if (flag)
            {
                j.setBackgroundDrawable(getResources().getDrawable(0x7f020064));
                l1 = i1 + 20;
                k1 = j1 + 20;
            } else
            {
                j.setBackgroundDrawable(null);
                l1 = i1;
                k1 = j1;
            }
        }
        layoutparams = b.getLayoutParams();
        if (l1 > 0)
        {
            layoutparams.width = com.pandora.android.util.s.a(l1);
        }
        layoutparams.height = com.pandora.android.util.s.a(k1);
        b.setLayoutParams(layoutparams);
        if (a1 == com.pandora.radio.data.a.a.d)
        {
            obj = l;
        } else
        {
            obj = a;
        }
        a(((View) (obj)), layoutparams);
        a(com.pandora.android.ads.h.b.b, a1, 0);
        u.a(com.pandora.android.ads.h.b.b, layoutparams.height, layoutparams.width, flag, d.Q());
    }

    private void a(Activity activity)
    {
        if (activity == null)
        {
            throw new InvalidParameterException("activity cannot be null");
        }
        if (w)
        {
            throw new UnsupportedOperationException("Can't initialize (call setAdHolder) AdView twice.");
        }
        w = true;
        i = com.pandora.android.util.s.t();
        A = (KeyguardManager)activity.getSystemService("keyguard");
        if (getChildCount() == 0)
        {
            ((LayoutInflater)activity.getSystemService("layout_inflater")).inflate(0x7f04001e, this);
        }
        if (e == null)
        {
            e = new d();
        }
        e.a();
        v = com.pandora.android.ads.c.b();
        b = (ViewGroup)findViewById(0x7f1000a4);
        m = (ViewGroup)b.findViewById(0x7f1000a8);
        n = findViewById(0x7f1000ae);
        o = (TextView)findViewById(0x7f1000b0);
        String s1 = com.pandora.android.provider.b.a.b().k().G();
        if (s1 != null)
        {
            o.setText(Html.fromHtml(s1));
        }
        p = findViewById(0x7f1000ab);
        a = (WebView)findViewById(0x7f1000a5);
        j = (RelativeLayout)findViewById(0x7f1000a6);
        k = (AdMarvelView)findViewById(0x7f1000a7);
        if (!isInEditMode())
        {
            WebSettings websettings = a.getSettings();
            if (!isInEditMode())
            {
                websettings.setCacheMode(2);
                websettings.setSupportZoom(false);
                websettings.setBuiltInZoomControls(false);
                setOverscrollIfAvailable(a);
                a.setBackgroundColor(0);
                a.requestFocus(130);
                a.setOnFocusChangeListener(new android.view.View.OnFocusChangeListener() {

                    final AdView a;

                    public void onFocusChange(View view, boolean flag)
                    {
                        if (!flag)
                        {
                            com.pandora.android.util.s.a(a.getContext(), a.a);
                        }
                    }

            
            {
                a = AdView.this;
                super();
            }
                });
            }
            q = a(activity, false, a);
            if (d != null && d.c() != null)
            {
                q.a(d.c());
            }
            a.setWebChromeClient(new p.cp.a());
        }
        k.setDisableAnimation(true);
        k.setEnableClickRedirect(true);
        k.setListener(H);
        r = (ImageButton)findViewById(0x7f1000aa);
        s = findViewById(0x7f1000a9);
        activity = new android.view.View.OnClickListener() {

            final AdView a;

            public void onClick(View view)
            {
                if (com.pandora.android.ads.AdView.a(a))
                {
                    return;
                }
                com.pandora.android.ads.AdView.a(a, true);
                if (a.d != null)
                {
                    a.d.T();
                }
                com.pandora.android.ads.AdView.a(a, com.pandora.radio.util.k.a.a);
                com.pandora.android.ads.AdView.c(a).b(com.pandora.android.ads.AdView.b(a).C(), "adClose_onClickHandler", false);
            }

            
            {
                a = AdView.this;
                super();
            }
        };
        r.setOnClickListener(activity);
        s.setOnClickListener(activity);
        o.setOnClickListener(G);
        findViewById(0x7f1000ad).setOnClickListener(new android.view.View.OnClickListener() {

            final AdView a;

            public void onClick(View view)
            {
                com.pandora.android.activity.a.a(com.pandora.android.ads.AdView.b(a).D(), a.g);
            }

            
            {
                a = AdView.this;
                super();
            }
        });
        com.pandora.android.util.s.a(this, false);
        a(((h.b) (null)), ((com.pandora.radio.data.a.a) (null)), 8);
        setFocusable(true);
    }

    private void a(ImageView imageview)
    {
        if (imageview != null)
        {
            imageview = imageview.getDrawable();
            if (imageview != null)
            {
                imageview.setCallback(null);
            }
        }
    }

    static void a(AdView adview, int i1, int j1, com.pandora.radio.data.a.a a1)
    {
        adview.a(i1, j1, a1);
    }

    static void a(AdView adview, com.pandora.radio.data.a a1)
    {
        adview.setupCloseButton(a1);
    }

    static void a(AdView adview, com.pandora.radio.data.a a1, h.b b1, String s1, boolean flag, Runnable runnable)
    {
        adview.a(a1, b1, s1, flag, runnable);
    }

    static void a(AdView adview, com.pandora.radio.util.k.a a1)
    {
        adview.c(a1);
    }

    static void a(AdView adview, com.pandora.radio.util.k.a a1, String s1)
    {
        adview.a(a1, s1);
    }

    private void a(h.b b1, com.pandora.radio.data.a.a a1, int i1)
    {
        boolean flag3 = true;
        byte byte0 = 8;
        this;
        JVM INSTR monitorenter ;
        if (u == null) goto _L2; else goto _L1
_L1:
        boolean flag4 = u.D().isFinishing();
        if (!flag4) goto _L3; else goto _L2
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
_L3:
        String s4 = H();
        if (b1 == null) goto _L5; else goto _L4
_L4:
        String s1 = b1.toString();
_L13:
        if (a1 == null) goto _L7; else goto _L6
_L6:
        String s2 = a1.toString();
_L35:
        if (d == null || i1 != 0) goto _L9; else goto _L8
_L8:
        Object obj = Integer.valueOf(d.M());
          goto _L10
_L34:
        String s3;
        d(String.format("updateVisibility: hide(%s) show(%s,%s,%s,%s)", new Object[] {
            s4, s1, s2, obj, s3
        }));
        if (i1 != 8 && i1 != 4) goto _L12; else goto _L11
_L11:
        F();
        setVisibility(8);
        z = false;
          goto _L2
        b1;
        throw b1;
_L5:
        s1 = "NONE";
          goto _L13
_L12:
        if (b1 != null)
        {
            break MISSING_BLOCK_LABEL_185;
        }
        throw new IllegalArgumentException("missing required adViewType parameter!");
        boolean flag;
        boolean flag1;
        boolean flag2;
        boolean flag5;
        boolean flag6;
        if (b1 == com.pandora.android.ads.h.b.b)
        {
            flag4 = true;
        } else
        {
            flag4 = false;
        }
        if (!flag4) goto _L15; else goto _L14
_L14:
        if (a1 != com.pandora.radio.data.a.a.a) goto _L15; else goto _L16
_L16:
        i1 = 1;
_L36:
        if (!flag4) goto _L18; else goto _L17
_L17:
        if (a1 != com.pandora.radio.data.a.a.b) goto _L18; else goto _L19
_L19:
        flag = true;
_L37:
        if (!flag4) goto _L21; else goto _L20
_L20:
        if (a1 != com.pandora.radio.data.a.a.d) goto _L21; else goto _L22
_L22:
        flag1 = true;
_L38:
        if (b1 == com.pandora.android.ads.h.b.a)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        if (b1 != com.pandora.android.ads.h.b.c)
        {
            flag3 = false;
        }
        flag5 = f(d);
        flag6 = g();
        if (getVisibleAdViewType() != com.pandora.android.ads.h.b.b) goto _L24; else goto _L23
_L23:
        if (i1 == 0 && !flag && !flag1) goto _L26; else goto _L25
_L24:
        setVisibility(0);
        if (!flag2) goto _L28; else goto _L27
_L27:
        b1 = o;
        if (v.m())
        {
            i1 = byte0;
        } else
        {
            i1 = 0;
        }
        b1.setVisibility(i1);
        b1 = n;
        if (C)
        {
            i1 = 0x7f0b00d2;
        } else
        {
            i1 = 0x7f0202af;
        }
        b1.setBackgroundResource(i1);
        n.setVisibility(0);
        x();
_L29:
        a(flag4);
          goto _L2
_L39:
        F();
        z = false;
        break; /* Loop/switch isn't completed */
_L41:
        F();
        break; /* Loop/switch isn't completed */
_L28:
        if (!flag3)
        {
            break MISSING_BLOCK_LABEL_416;
        }
        n.setVisibility(8);
        x();
          goto _L29
        n.setVisibility(8);
        p.setVisibility(8);
        if (h)
        {
            break MISSING_BLOCK_LABEL_534;
        }
        setVisibility(0);
_L30:
        if (!flag5)
        {
            break MISSING_BLOCK_LABEL_459;
        }
        setupCloseButton(d);
        b.setVisibility(0);
        a.setVisibility(8);
        k.setVisibility(8);
        j.setVisibility(8);
        if (l != null)
        {
            l.setVisibility(8);
        }
        m.setVisibility(8);
        if (i1 == 0)
        {
            break MISSING_BLOCK_LABEL_548;
        }
        a.setVisibility(0);
          goto _L29
        d("coachmark showing, ignoring updateVisibility() on root AdView, setting INVISIBLE instead");
        setVisibility(4);
          goto _L30
        if (!flag) goto _L32; else goto _L31
_L31:
        k.setVisibility(0);
        j.setVisibility(0);
          goto _L29
_L32:
        if (!flag1) goto _L29; else goto _L33
_L33:
        l.setVisibility(0);
        m.setVisibility(0);
          goto _L29
_L10:
        if (i1 == 0)
        {
            s3 = "VISIBLE";
        } else
        {
            s3 = "GONE";
        }
          goto _L34
_L7:
        s2 = "~";
          goto _L35
_L9:
        obj = "~";
          goto _L10
_L15:
        i1 = 0;
          goto _L36
_L18:
        flag = false;
          goto _L37
_L21:
        flag1 = false;
          goto _L38
_L25:
        if (flag6 && flag5 || !flag6 && !flag5) goto _L40; else goto _L39
_L40:
        break; /* Loop/switch isn't completed */
_L26:
        if (!flag2 && !flag3) goto _L24; else goto _L41
    }

    private void a(com.pandora.radio.data.a a1, h.b b1, String s1, boolean flag, Runnable runnable)
    {
        b b2 = u;
        if (a1 != null && !a1.U() && b2 != null && !b2.E())
        {
            return;
        }
        if (b2 != null)
        {
            b2.a(b1);
        }
        q.c(false);
        switch (com.pandora.android.ads._cls7.b[b1.ordinal()])
        {
        default:
            throw new UnsupportedOperationException("Unknown case for AdType");

        case 1: // '\001'
            x();
            return;

        case 2: // '\002'
            a(a1, flag, s1, runnable);
            return;

        case 3: // '\003'
            z();
            break;
        }
    }

    private void a(com.pandora.radio.util.k.a a1, String s1)
    {
        if (e == null)
        {
            a("Stats", "subscriber is null");
            return;
        }
        if (a1 == null)
        {
            a("Stats", "action is null");
            return;
        }
        h.a a2 = com.pandora.android.ads.h.a.a(af.a().b());
        if (a2 == null)
        {
            a("Stats", "location is null");
            return;
        } else
        {
            com.pandora.android.provider.b.a.b().o().a(a1, a2.name(), s1, q.t());
            return;
        }
    }

    private static void a(String s1, String s2)
    {
        a(s1, s2, ((Exception) (null)));
    }

    private static void a(String s1, String s2, Exception exception)
    {
        p.df.a.c("AdView", String.format("ADVIEW [interaction=%s] - %s", new Object[] {
            s1, s2
        }), exception);
    }

    static boolean a(AdView adview)
    {
        return adview.z;
    }

    static boolean a(AdView adview, boolean flag)
    {
        adview.z = flag;
        return flag;
    }

    private boolean a(com.pandora.radio.data.a a1, boolean flag, String s1, Runnable runnable)
    {
        if (com.pandora.android.ads.VideoAdManager.c.a().l())
        {
            a(s1, "handleAdData - not rotating ads because we are going to play a video ad");
            return false;
        }
        if (h)
        {
            a(s1, "handleAdData - not rotating ads because coachmark is showing");
            return false;
        }
        b b1 = u;
        if (b1 == null)
        {
            a(s1, "handleAdData - not rotating ads because the AdViewHolder is unavailable");
            return false;
        }
        if (b1.D() == null)
        {
            a(s1, "handleAdData - not rotating ads because the activity is unavailable");
            return false;
        }
        if (!b1.t())
        {
            a(s1, "handleAdData - not rotating ads because the activity currently cannot show ads");
            return false;
        }
        if (!v.e())
        {
            a(s1, "handleAdData - not rotating ads because the current track doesn't support banner ads");
            return false;
        }
        if (a1 == null)
        {
            a(s1, "handleAdData - YIKES! AdData is null");
            return false;
        }
        d = a1;
        if (a1.K())
        {
            return true;
        }
        p();
        t = null;
        boolean flag1 = a1.U();
        v.b(b1.C(), s1, flag1);
        com.pandora.android.provider.b.a.b(false);
        b(a1);
        q.a(a1.c());
        if (a1.ah() != com.pandora.radio.data.a.a.b) goto _L2; else goto _L1
_L1:
        if (B())
        {
            return true;
        }
        d("INSERTING NEW ADM AD");
        com.pandora.android.util.b.a().a(k);
_L4:
        if (android.os.Build.VERSION.SDK_INT >= 19)
        {
            a.zoomOut();
        }
        return true;
_L2:
        if (a1.ah() == com.pandora.radio.data.a.a.d)
        {
            C();
        } else
        if (flag)
        {
            t();
        } else
        {
            q.a(new com.pandora.radio.data.b());
            s1 = "";
            if (a1.V())
            {
                s1 = (new StringBuilder()).append("").append(" (audio follow on) ").toString();
            }
            String s2 = s1;
            if (a1.W())
            {
                s2 = (new StringBuilder()).append(s1).append(" (video follow on) ").toString();
            }
            e(a1);
            d((new StringBuilder()).append("INSERTING NEW DART AD").append(s2).toString());
            a1 = (new StringBuilder()).append(q.a(p.cp.d.b.b)).append(a1.L()).toString();
            a.requestFocus(130);
            a.loadDataWithBaseURL(null, a1, "text/html", "utf-8", null);
            B = 0;
            a1 = getRawHtmlAd();
            if (a1 != null)
            {
                a1.onAdRendered(a);
            }
            if (runnable != null)
            {
                runnable.run();
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    static b b(AdView adview)
    {
        return adview.u;
    }

    private void b(com.pandora.radio.data.a a1)
    {
        if (a1 != null && (a1.W() || a1.V()))
        {
            if (!a1.ac())
            {
                c(a1);
                return;
            }
            if (!a1.af() && A())
            {
                d(a1);
                return;
            }
        }
    }

    static void b(String s1)
    {
        d(s1);
    }

    static boolean b(AdView adview, boolean flag)
    {
        adview.y = flag;
        return flag;
    }

    static com.pandora.android.ads.g c(AdView adview)
    {
        return adview.v;
    }

    private String c(String s1)
    {
        if (s1 == null)
        {
            return null;
        }
        BufferedReader bufferedreader;
        String s2;
        try
        {
            bufferedreader = new BufferedReader(new FileReader(new File((new StringBuilder()).append(Environment.getExternalStorageDirectory()).append("/").append(s1).toString())));
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            return null;
        }
        s1 = new StringBuilder();
_L1:
        s2 = bufferedreader.readLine();
        if (s2 == null)
        {
            break MISSING_BLOCK_LABEL_98;
        }
        s1.append(s2);
        s1.append("\n");
          goto _L1
        s1;
        bufferedreader.close();
        throw s1;
        if (s1.length() <= 0) goto _L3; else goto _L2
_L2:
        s1 = s1.toString();
_L5:
        bufferedreader.close();
        return s1;
_L3:
        s1 = null;
        if (true) goto _L5; else goto _L4
_L4:
    }

    private void c(com.pandora.radio.data.a a1)
    {
        a1.ad();
        if (a1.V())
        {
            Object obj = a1.Z();
            if (!com.pandora.android.util.s.a(((String) (obj))))
            {
                obj = new com.pandora.radio.data.s(((String) (obj)), System.currentTimeMillis(), 0xdbba0L, com.pandora.radio.data.s.a);
                com.pandora.android.provider.b.a.b().g().a(((com.pandora.radio.data.s) (obj)));
            }
        } else
        if (a1.W())
        {
            m m1 = (m)a1;
            com.pandora.android.provider.b.a.b().o().a(com.pandora.radio.util.k.p.q, m1.c(), m1.a(), m1.b(), m1.d(), 0, 0L, "BANNER RENDER");
        } else
        {
            throw new RuntimeException("Unknown follow-on banner type");
        }
        a1.ae();
        if (!A())
        {
            if (a1.V())
            {
                a1 = a1.aa();
                if (!com.pandora.android.util.s.a(a1))
                {
                    a1 = new com.pandora.radio.data.s(a1, System.currentTimeMillis(), 0xdbba0L, com.pandora.radio.data.s.a);
                    com.pandora.android.provider.b.a.b().g().a(a1);
                }
                return;
            }
            if (a1.W())
            {
                a1 = (m)a1;
                com.pandora.android.provider.b.a.b().o().a(com.pandora.radio.util.k.p.r, a1.c(), a1.a(), a1.b(), a1.d(), 0, 0L, "BANNER RENDER");
                return;
            } else
            {
                throw new RuntimeException("Unknown follow-on banner type");
            }
        } else
        {
            a1.ag();
            return;
        }
    }

    private void c(com.pandora.radio.util.k.a a1)
    {
        if (a1 != null)
        {
            String s1;
            if (d != null)
            {
                s1 = d.P();
            } else
            {
                s1 = null;
            }
            a(a1, s1);
            p();
        }
        a(((h.b) (null)), ((com.pandora.radio.data.a.a) (null)), 8);
        a(a1);
    }

    static boolean c(AdView adview, boolean flag)
    {
        adview.E = flag;
        return flag;
    }

    private void d(com.pandora.radio.data.a a1)
    {
        a1.ag();
        if (a1.V())
        {
            a1 = a1.ab();
            if (!com.pandora.android.util.s.a(a1))
            {
                a1 = new com.pandora.radio.data.s(a1, System.currentTimeMillis(), 0xdbba0L, com.pandora.radio.data.s.a);
                com.pandora.android.provider.b.a.b().g().a(a1);
            }
            return;
        }
        if (a1.W())
        {
            a1 = (m)a1;
            com.pandora.android.provider.b.a.b().o().a(com.pandora.radio.util.k.p.s, a1.c(), a1.a(), a1.b(), a1.d(), 0, 0L, "BANNER RENDER");
            return;
        } else
        {
            throw new RuntimeException("Unknown follow-on banner type");
        }
    }

    private static void d(String s1)
    {
        p.df.a.c("AdView", String.format("ADVIEW %s", new Object[] {
            s1
        }));
    }

    static boolean d(AdView adview)
    {
        return adview.y;
    }

    static int e(AdView adview)
    {
        return adview.x;
    }

    private boolean e(com.pandora.radio.data.a a1)
    {
        if (PandoraService.f())
        {
            a1 = c(com.pandora.android.ads.c.b().j());
            if (a1 != null)
            {
                p.df.a.a("AdView", "FORCING Test Ad HTML");
                d = (new com.pandora.radio.data.a.b(d)).a(com.pandora.radio.data.a.a.a).c(a1).a();
                return true;
            }
        }
        return false;
    }

    static boolean f(AdView adview)
    {
        return adview.w();
    }

    private boolean f(com.pandora.radio.data.a a1)
    {
        return a1 != null && !a1.Q() && a1.M() > 50 && u.F();
    }

    static int g(AdView adview)
    {
        return adview.B;
    }

    private CustomRenderedAd getRawHtmlAd()
    {
        if (d != null)
        {
            Object obj = d.ai();
            if (obj != null)
            {
                if (obj instanceof CustomRenderedAd)
                {
                    return (CustomRenderedAd)obj;
                } else
                {
                    throw new IllegalStateException("Cannot cast AdData.rawHtmlAd to a type other than CustomRenderedAd!");
                }
            }
        }
        return null;
    }

    private h.b getVisibleAdViewType()
    {
        if (b.getVisibility() == 0)
        {
            return com.pandora.android.ads.h.b.b;
        }
        if (n.getVisibility() == 0)
        {
            return com.pandora.android.ads.h.b.a;
        } else
        {
            return null;
        }
    }

    static CustomRenderedAd h(AdView adview)
    {
        return adview.getRawHtmlAd();
    }

    static void i(AdView adview)
    {
        adview.p();
    }

    static boolean j(AdView adview)
    {
        return adview.E;
    }

    static void k(AdView adview)
    {
        adview.D();
    }

    static void l(AdView adview)
    {
        adview.t();
    }

    static void m(AdView adview)
    {
        adview.y();
    }

    private void p()
    {
        if (c != null)
        {
            c.c();
            a(b);
            c = null;
        }
    }

    private void q()
    {
        if (l == null)
        {
            break MISSING_BLOCK_LABEL_40;
        }
        l.setAdListener(null);
        l.setOnCustomRenderedAdLoadedListener(null);
        l.destroy();
        l = null;
        D = null;
        return;
        Object obj;
        obj;
        com.crashlytics.android.d.a(new IllegalStateException("NOT FATAL. Exception destroying PublisherAdView", ((Throwable) (obj))));
        l = null;
        D = null;
        return;
        obj;
        l = null;
        D = null;
        throw obj;
    }

    private void r()
    {
        l = new PublisherAdView(getContext().getApplicationContext());
        l.setId(0x7f10000d);
        android.widget.RelativeLayout.LayoutParams layoutparams;
        if (com.pandora.android.util.s.u())
        {
            l.setAdSizes(new AdSize[] {
                AdSize.MEDIUM_RECTANGLE
            });
        } else
        {
            l.setAdSizes(new AdSize[] {
                AdSize.BANNER, AdSize.MEDIUM_RECTANGLE
            });
        }
        layoutparams = new android.widget.RelativeLayout.LayoutParams(-1, -1);
        m.addView(l, layoutparams);
    }

    private void s()
    {
        if (d != null && !d.K())
        {
            a(d.N(), d.M(), d.ah());
        }
    }

    private static void setOverscrollIfAvailable(WebView webview)
    {
        webview.setOverScrollMode(2);
    }

    private void setupCloseButton(com.pandora.radio.data.a a1)
    {
        if (a1 != null && !a1.K())
        {
            int i1;
            boolean flag;
            if (t != null)
            {
                flag = t.booleanValue();
            } else
            {
                flag = f(a1);
            }
            if (flag && u.F())
            {
                i1 = 0;
            } else
            {
                i1 = 8;
            }
            s.setVisibility(i1);
        }
    }

    private void t()
    {
        if (w() && !u())
        {
            s();
        }
    }

    private boolean u()
    {
        while (b == null || b.getVisibility() != 0 || a(d).getVisibility() != 0) 
        {
            return false;
        }
        return true;
    }

    private boolean v()
    {
        while (p == null || p.getVisibility() != 0) 
        {
            return false;
        }
        return true;
    }

    private boolean w()
    {
        boolean flag;
        for (flag = true; !k() || !com.pandora.android.provider.b.a.a(x) || d == null || d.K() || !v.e();)
        {
            return false;
        }

        if (d.M() < 1)
        {
            flag = false;
        }
        return flag;
    }

    private void x()
    {
        while (!k() || x != 1 && x != 5 || g == null) 
        {
            return;
        }
        if (g.M())
        {
            ImageView imageview = (ImageView)findViewById(0x7f1000ad);
            p.l.g.b(getContext()).a(g.v()).a(0x7f020062).a(imageview);
        }
        TextView textview = (TextView)p.findViewById(0x7f1000ac);
        if (f != null && f.A())
        {
            textview.setText(0x7f0801e0);
        } else
        {
            textview.setText(0x7f0801df);
        }
        p.setVisibility(0);
    }

    private void y()
    {
        if (n != null && n.getVisibility() == 0)
        {
            a(((h.b) (null)), ((com.pandora.radio.data.a.a) (null)), 8);
        }
    }

    private void z()
    {
        if (!k() || !l())
        {
            return;
        } else
        {
            a(com.pandora.android.ads.h.b.a, ((com.pandora.radio.data.a.a) (null)), 0);
            E();
            return;
        }
    }

    public PublisherAdView a(String s1)
    {
        if (!w)
        {
            return null;
        }
        boolean flag;
        if (s1 != null && !s1.equals(D))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            e();
        }
        if (l == null)
        {
            r();
        }
        if (flag)
        {
            d(String.format("getGoogleAdView - adUnitIdChanged to = %s", new Object[] {
                s1
            }));
            l.setAdUnitId(s1);
            D = s1;
        }
        return l;
    }

    protected p.cp.d a(Activity activity, boolean flag, WebView webview)
    {
        return new c(activity, flag, webview);
    }

    public void a()
    {
        post(new Runnable() {

            final AdView a;

            public void run()
            {
                if (a.d != null && a.d.Q())
                {
                    Point point = com.pandora.android.ads.AdView.b(a).u();
                    int i1 = point.x;
                    int j1 = point.y;
                    a.d.a(com.pandora.android.util.s.b(i1), com.pandora.android.util.s.b(j1));
                }
                if (a.c != null && a.c.d())
                {
                    a.c.a();
                }
                AdView.l(a);
            }

            
            {
                a = AdView.this;
                super();
            }
        });
    }

    protected void a(View view)
    {
    }

    protected void a(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
    }

    public void a(b b1, int i1)
    {
        u = b1;
        x = i1;
        if (u != null)
        {
            d(String.format("setAdHolder for [%s]", new Object[] {
                u.D().getClass().getSimpleName()
            }));
            a(((Activity) (b1.D())));
            return;
        }
        a(((ImageView) (r)));
        if (a != null)
        {
            a.setWebViewClient(null);
            a.destroy();
        }
        if (k != null)
        {
            k.setListener(null);
            k = null;
        }
        j = null;
        q();
        p();
        a = null;
        b = null;
        m = null;
        n = null;
        p = null;
        if (r != null)
        {
            r.setOnClickListener(null);
            r = null;
        }
        if (s != null)
        {
            s.setOnClickListener(null);
            s = null;
        }
        t = null;
        d = null;
        u = null;
        v = null;
        c();
        e = null;
        q = null;
        w = false;
    }

    public void a(h.b b1, com.pandora.radio.data.a a1, String s1, boolean flag, Runnable runnable)
    {
        d = a1;
        E = false;
        I.a(b1, a1, s1, flag, runnable);
    }

    public void a(aa aa1, y y1)
    {
        while (aa1 == null || q == null || !com.pandora.android.util.s.a(F) && F.equals(aa1.w())) 
        {
            return;
        }
        F = aa1.w();
        q.a(a, aa1, y1);
    }

    protected void a(com.pandora.radio.util.k.a a1)
    {
    }

    protected void a(boolean flag)
    {
        android.view.ViewGroup.LayoutParams layoutparams = getLayoutParams();
        if (layoutparams != null)
        {
            if (flag)
            {
                layoutparams.height = getBannerAdHeight();
                layoutparams.width = getBannerAdWidth();
            } else
            {
                layoutparams.width = -1;
                layoutparams.height = -1;
            }
            setLayoutParams(layoutparams);
        }
    }

    public void b()
    {
    }

    public void b(com.pandora.radio.util.k.a a1)
    {
        if (u() || v())
        {
            I.a(a1);
        }
    }

    public void c()
    {
        if (e != null)
        {
            e.b();
        }
    }

    public void clearFocus()
    {
        a.clearFocus();
        k.clearFocus();
        if (l != null)
        {
            l.clearFocus();
        }
        super.clearFocus();
    }

    public void d()
    {
        w = false;
        if (e == null)
        {
            e = new d();
            e.a();
        }
    }

    public void e()
    {
        if (l != null)
        {
            if (Looper.myLooper() != Looper.getMainLooper())
            {
                throw new IllegalThreadStateException("removeGoogleAdView *must* be called on the UI thread!");
            }
            l.setAdListener(null);
            l.setOnCustomRenderedAdLoadedListener(null);
            m.removeView(l);
            q();
        }
    }

    public void f()
    {
        b b1 = u;
        if (b1 != null && b1.D() != null)
        {
            b1.D().A();
        }
    }

    public boolean g()
    {
        return s.getVisibility() == 0;
    }

    public com.pandora.radio.data.b getAdId()
    {
        return q.t();
    }

    public int getBannerAdHeight()
    {
        int j1 = 0;
        if (getVisibility() == 0) goto _L2; else goto _L1
_L1:
        int i1 = j1;
_L4:
        return i1;
_L2:
        if (n.getVisibility() != 0)
        {
            break; /* Loop/switch isn't completed */
        }
        j1 = n.getLayoutParams().height;
        i1 = j1;
        if (p.getVisibility() == 0)
        {
            return j1 + p.getLayoutParams().height;
        }
        if (true) goto _L4; else goto _L3
_L3:
        i1 = j1;
        if (d != null)
        {
            i1 = j1;
            if (!d.K())
            {
                return com.pandora.android.util.s.a(d.M());
            }
        }
        if (true) goto _L4; else goto _L5
_L5:
    }

    public int getBannerAdWidth()
    {
        com.pandora.radio.data.a a1;
        if (getVisibility() == 0)
        {
            if ((a1 = d) != null && !a1.K())
            {
                return com.pandora.android.util.s.a(a1.N());
            }
        }
        return 0;
    }

    public void h()
    {
        clearFocus();
    }

    public void i()
    {
        I.a();
    }

    public boolean j()
    {
        b b1 = u;
        return b1 != null && b1.E();
    }

    public boolean k()
    {
        b b1 = u;
        return b1 != null && b1.t();
    }

    public boolean l()
    {
        b b1 = u;
        return b1 != null && b1.G();
    }

    public void m()
    {
        if (a(com.pandora.android.ads.h.b.b) != com.pandora.radio.data.a.a.d)
        {
            break MISSING_BLOCK_LABEL_20;
        }
        l.pause();
        return;
        Exception exception;
        exception;
        q();
        com.crashlytics.android.d.a(new IllegalStateException("NOT FATAL. Exception pausing PublisherAdView", exception));
        return;
    }

    public void n()
    {
        if (a(com.pandora.android.ads.h.b.b) == com.pandora.radio.data.a.a.d)
        {
            l.resume();
        }
    }

    public void o()
    {
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        if (d != null)
        {
            configuration = getVisibleAdViewType();
            if (configuration != null)
            {
                if (com.pandora.android.ads.h.b.b == configuration)
                {
                    a(d.N(), d.M(), d.ah());
                    return;
                }
                if (com.pandora.android.ads.h.b.a == configuration)
                {
                    E();
                    return;
                }
            }
        }
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        a(r);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        motionevent.getActionMasked();
        JVM INSTR tableswitch 1 1: default 24
    //                   1 26;
           goto _L1 _L2
_L1:
        return false;
_L2:
        float f1 = motionevent.getX() / i.density;
        float f2 = motionevent.getY() / i.density;
        float f3 = (float)getWidth() / i.density;
        float f4 = (float)getHeight() / i.density;
        com.pandora.radio.data.b b1 = getAdId();
        if (f == null)
        {
            motionevent = "";
        } else
        {
            motionevent = f.h();
        }
        com.pandora.android.provider.b.a.b().o().a(f1, f2, f3, f4, b1, motionevent);
        if (true) goto _L1; else goto _L3
_L3:
    }

    public void setNoBackgroundForWhyAds(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        C = flag;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void setZone(int i1)
    {
        x = i1;
    }
}
