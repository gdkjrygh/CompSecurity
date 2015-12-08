// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.internal;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import com.facebook.ads.AdSettings;
import com.facebook.ads.AdSize;
import com.facebook.ads.internal.adapters.AdAdapter;
import com.facebook.ads.internal.adapters.BannerAdapter;
import com.facebook.ads.internal.adapters.InterstitialAdapter;
import com.facebook.ads.internal.adapters.f;
import com.facebook.ads.internal.adapters.p;
import com.facebook.ads.internal.controllers.a;
import com.facebook.ads.internal.dto.d;
import com.facebook.ads.internal.server.AdPlacementType;
import com.facebook.ads.internal.util.b;
import com.facebook.ads.internal.util.c;
import com.facebook.ads.internal.util.g;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.facebook.ads.internal:
//            AdErrorType, a, b, e, 
//            c

public class h extends a
    implements com.facebook.ads.internal.server.a.a
{

    private static final String b = com/facebook/ads/internal/h.getSimpleName();
    private final Context c;
    private final String d;
    private final com.facebook.ads.internal.server.a e = new com.facebook.ads.internal.server.a();
    private final Handler f = new Handler();
    private final Runnable g = new _cls1();
    private final Runnable h = new _cls2();
    private volatile boolean i;
    private boolean j;
    private volatile boolean k;
    private AdAdapter l;
    private View m;
    private com.facebook.ads.internal.dto.b n;
    private d o;
    private e p;
    private com.facebook.ads.internal.c q;
    private AdSize r;
    private int s;
    private final a t = new a(null);
    private boolean u;

    public h(Context context, String s1, e e1, AdSize adsize, com.facebook.ads.internal.c c1, int i1, boolean flag)
    {
        c = context;
        d = s1;
        p = e1;
        r = adsize;
        q = c1;
        s = i1;
        e.a(this);
        j = flag;
        i();
    }

    static View a(h h1, View view)
    {
        h1.m = view;
        return view;
    }

    private void a(AdAdapter adadapter)
    {
        if (adadapter != null)
        {
            adadapter.onDestroy();
        }
    }

    static void a(h h1)
    {
        h1.m();
    }

    static void a(h h1, AdAdapter adadapter)
    {
        h1.a(adadapter);
    }

    static boolean a(h h1, boolean flag)
    {
        h1.i = flag;
        return flag;
    }

    static AdAdapter b(h h1, AdAdapter adadapter)
    {
        h1.l = adadapter;
        return adadapter;
    }

    static void b(h h1)
    {
        h1.o();
    }

    static void c(h h1)
    {
        h1.n();
    }

    static void d(h h1)
    {
        h1.k();
    }

    static Handler e(h h1)
    {
        return h1.f;
    }

    static AdAdapter f(h h1)
    {
        return h1.l;
    }

    static boolean g(h h1)
    {
        return h1.k;
    }

    static com.facebook.ads.internal.a h(h h1)
    {
        return h1.a;
    }

    static com.facebook.ads.internal.a i(h h1)
    {
        return h1.a;
    }

    private void i()
    {
        if (j)
        {
            return;
        } else
        {
            IntentFilter intentfilter = new IntentFilter("android.intent.action.SCREEN_ON");
            intentfilter.addAction("android.intent.action.SCREEN_OFF");
            c.registerReceiver(t, intentfilter);
            u = true;
            return;
        }
    }

    static com.facebook.ads.internal.a j(h h1)
    {
        return h1.a;
    }

    private void j()
    {
        if (!u)
        {
            break MISSING_BLOCK_LABEL_23;
        }
        c.unregisterReceiver(t);
        u = false;
        return;
        Exception exception;
        exception;
        com.facebook.ads.internal.util.c.a(com.facebook.ads.internal.util.b.a(exception, "Error unregistering screen state receiever"));
        return;
    }

    static com.facebook.ads.internal.a k(h h1)
    {
        return h1.a;
    }

    private void k()
    {
        if (Looper.myLooper() != Looper.getMainLooper())
        {
            throw new IllegalStateException("Adapter listener must be called on the main thread.");
        } else
        {
            return;
        }
    }

    private AdPlacementType l()
    {
        if (r == null)
        {
            return AdPlacementType.NATIVE;
        }
        if (r == AdSize.INTERSTITIAL)
        {
            return AdPlacementType.INTERSTITIAL;
        } else
        {
            return AdPlacementType.BANNER;
        }
    }

    static void l(h h1)
    {
        h1.p();
    }

    static com.facebook.ads.internal.a m(h h1)
    {
        return h1.a;
    }

    private void m()
    {
        o = new d(c, d, r, p, q, s, AdSettings.isTestMode(c));
        e.a(c, o);
    }

    static com.facebook.ads.internal.a n(h h1)
    {
        return h1.a;
    }

    private void n()
    {
        Object obj;
        Object obj1;
        Object obj2;
        do
        {
            obj2 = n;
            obj = ((com.facebook.ads.internal.dto.b) (obj2)).c();
            if (obj == null)
            {
                a.a(AdErrorType.NO_FILL.getAdErrorWrapper(""));
                o();
                return;
            }
            String s1 = ((com.facebook.ads.internal.dto.a) (obj)).b;
            obj1 = com.facebook.ads.internal.adapters.f.a(s1, ((com.facebook.ads.internal.dto.b) (obj2)).a().a());
            if (obj1 != null)
            {
                break;
            }
            Log.e(b, (new StringBuilder("Adapter does not exist: ")).append(s1).toString());
        } while (true);
        if (l() != ((AdAdapter) (obj1)).getPlacementType())
        {
            a.a(AdErrorType.INTERNAL_ERROR.getAdErrorWrapper(""));
            return;
        }
        HashMap hashmap = new HashMap();
        obj2 = ((com.facebook.ads.internal.dto.b) (obj2)).a();
        hashmap.put("data", ((com.facebook.ads.internal.dto.a) (obj)).c);
        hashmap.put("definition", obj2);
        if (o == null)
        {
            a.a(AdErrorType.UNKNOWN_ERROR.getAdErrorWrapper("environment is empty"));
        }
        switch (com.facebook.ads.internal._cls9.a[((AdAdapter) (obj1)).getPlacementType().ordinal()])
        {
        default:
            Log.e(b, "attempt unexpected adapter type");
            return;

        case 2: // '\002'
            obj = (BannerAdapter)obj1;
            obj1 = new _cls3(((BannerAdapter) (obj)));
            f.postDelayed(((Runnable) (obj1)), 10000L);
            ((BannerAdapter) (obj)).loadBannerAd(c, r, new _cls4(((Runnable) (obj1))), hashmap);
            return;

        case 1: // '\001'
            obj = (InterstitialAdapter)obj1;
            obj1 = new _cls5(((InterstitialAdapter) (obj)));
            f.postDelayed(((Runnable) (obj1)), 10000L);
            ((InterstitialAdapter) (obj)).loadInterstitialAd(c, new _cls6(((Runnable) (obj1))), hashmap);
            return;

        case 3: // '\003'
            obj = (p)obj1;
            break;
        }
        obj1 = new _cls7(((p) (obj)));
        f.postDelayed(((Runnable) (obj1)), 10000L);
        ((p) (obj)).a(c, new _cls8(((Runnable) (obj1))), hashmap);
    }

    static com.facebook.ads.internal.a o(h h1)
    {
        return h1.a;
    }

    private void o()
    {
        if (!j && !i) goto _L2; else goto _L1
_L1:
        return;
_L2:
        com.facebook.ads.internal._cls9.a[l().ordinal()];
        JVM INSTR tableswitch 1 2: default 48
    //                   1 49
    //                   2 110;
           goto _L3 _L4 _L5
_L3:
        return;
_L4:
        if (!com.facebook.ads.internal.util.g.a(c))
        {
            f.postDelayed(h, 1000L);
        }
_L6:
        int i1;
        long l1;
        if (n == null)
        {
            l1 = 30000L;
        } else
        {
            l1 = n.a().b();
        }
        if (l1 > 0L)
        {
            f.postDelayed(g, l1);
            i = true;
            return;
        }
        if (true) goto _L1; else goto _L5
_L5:
        if (n == null)
        {
            i1 = 1;
        } else
        {
            i1 = n.a().e();
        }
        if (m != null && !com.facebook.ads.internal.util.g.a(c, m, i1))
        {
            f.postDelayed(h, 1000L);
            return;
        }
          goto _L6
    }

    static d p(h h1)
    {
        return h1.o;
    }

    private void p()
    {
        if (!i)
        {
            return;
        } else
        {
            f.removeCallbacks(g);
            i = false;
            return;
        }
    }

    static com.facebook.ads.internal.a q(h h1)
    {
        return h1.a;
    }

    static com.facebook.ads.internal.a r(h h1)
    {
        return h1.a;
    }

    static com.facebook.ads.internal.a s(h h1)
    {
        return h1.a;
    }

    public com.facebook.ads.internal.dto.c a()
    {
        if (n == null)
        {
            return null;
        } else
        {
            return n.a();
        }
    }

    public void a(com.facebook.ads.internal.b b1)
    {
        a.a(b1);
        int i1 = b1.a().getErrorCode();
        if (!i && (i1 == 1002 || i1 == 1000) && l() == AdPlacementType.BANNER)
        {
            f.postDelayed(g, 30000L);
            i = true;
        }
    }

    public void a(com.facebook.ads.internal.server.d d1)
    {
        d1 = d1.b();
        if (d1 == null || d1.a() == null)
        {
            throw new IllegalStateException("invalid placement in response");
        } else
        {
            n = d1;
            n();
            return;
        }
    }

    public void b()
    {
        m();
    }

    public void c()
    {
        AdPlacementType adplacementtype;
        if (l == null)
        {
            throw new IllegalStateException("no adapter ready to start");
        }
        if (k)
        {
            throw new IllegalStateException("ad already started");
        }
        k = true;
        adplacementtype = l.getPlacementType();
        com.facebook.ads.internal._cls9.a[adplacementtype.ordinal()];
        JVM INSTR tableswitch 1 3: default 84
    //                   1 95
    //                   2 107
    //                   3 130;
           goto _L1 _L2 _L3 _L4
_L1:
        Log.e(b, "start unexpected adapter type");
_L6:
        return;
_L2:
        ((InterstitialAdapter)l).show();
        return;
_L3:
        if (m == null) goto _L6; else goto _L5
_L5:
        a.a(m);
        o();
        return;
_L4:
        p p1 = (p)l;
        if (!p1.t())
        {
            throw new IllegalStateException("ad is not ready or already displayed");
        } else
        {
            a.a(p1);
            return;
        }
    }

    public void d()
    {
        j();
        if (!k)
        {
            return;
        } else
        {
            p();
            a(l);
            m = null;
            k = false;
            return;
        }
    }

    public void e()
    {
        if (!k)
        {
            return;
        } else
        {
            p();
            return;
        }
    }

    public void f()
    {
        if (!k)
        {
            return;
        } else
        {
            o();
            return;
        }
    }

    public void g()
    {
        p();
        m();
    }

    public void h()
    {
        j = true;
        p();
    }


    private class a extends BroadcastReceiver
    {

        final h a;

        public void onReceive(Context context, Intent intent)
        {
            context = intent.getAction();
            if ("android.intent.action.SCREEN_OFF".equals(context))
            {
                h.l(a);
            } else
            if ("android.intent.action.SCREEN_ON".equals(context))
            {
                com.facebook.ads.internal.h.b(a);
                return;
            }
        }

        private a()
        {
            a = h.this;
            super();
        }

        a(_cls1 _pcls1)
        {
            this();
        }
    }


    private class _cls1
        implements Runnable
    {

        final h a;

        public void run()
        {
            com.facebook.ads.internal.h.a(a, false);
            com.facebook.ads.internal.h.a(a);
        }

        _cls1()
        {
            a = h.this;
            super();
        }
    }


    private class _cls2
        implements Runnable
    {

        final h a;

        public void run()
        {
            com.facebook.ads.internal.h.b(a);
        }

        _cls2()
        {
            a = h.this;
            super();
        }
    }


    private class _cls9
    {

        static final int a[];

        static 
        {
            a = new int[AdPlacementType.values().length];
            try
            {
                a[AdPlacementType.INTERSTITIAL.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror2) { }
            try
            {
                a[AdPlacementType.BANNER.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                a[AdPlacementType.NATIVE.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }


    private class _cls3
        implements Runnable
    {

        final BannerAdapter a;
        final h b;

        public void run()
        {
            com.facebook.ads.internal.h.a(b, a);
            com.facebook.ads.internal.h.c(b);
        }

        _cls3(BannerAdapter banneradapter)
        {
            b = h.this;
            a = banneradapter;
            super();
        }
    }


    private class _cls4
        implements BannerAdapterListener
    {

        final Runnable a;
        final h b;

        public void onBannerAdClicked(BannerAdapter banneradapter)
        {
            com.facebook.ads.internal.h.d(b);
            h.k(b).b();
        }

        public void onBannerAdExpanded(BannerAdapter banneradapter)
        {
            com.facebook.ads.internal.h.d(b);
            h.l(b);
        }

        public void onBannerAdLoaded(BannerAdapter banneradapter, View view)
        {
            com.facebook.ads.internal.h.d(b);
            h.e(b).removeCallbacks(a);
            AdAdapter adadapter = com.facebook.ads.internal.h.f(b);
            com.facebook.ads.internal.h.b(b, banneradapter);
            com.facebook.ads.internal.h.a(b, view);
            if (!com.facebook.ads.internal.h.g(b))
            {
                h.h(b).a();
                return;
            } else
            {
                h.i(b).a(view);
                com.facebook.ads.internal.h.a(b, adadapter);
                com.facebook.ads.internal.h.b(b);
                return;
            }
        }

        public void onBannerAdMinimized(BannerAdapter banneradapter)
        {
            com.facebook.ads.internal.h.d(b);
            com.facebook.ads.internal.h.b(b);
        }

        public void onBannerError(BannerAdapter banneradapter, AdError aderror)
        {
            com.facebook.ads.internal.h.d(b);
            h.e(b).removeCallbacks(a);
            com.facebook.ads.internal.h.a(b, banneradapter);
            com.facebook.ads.internal.h.c(b);
        }

        public void onBannerLoggingImpression(BannerAdapter banneradapter)
        {
            com.facebook.ads.internal.h.d(b);
            h.j(b).c();
        }

        _cls4(Runnable runnable)
        {
            b = h.this;
            a = runnable;
            super();
        }
    }


    private class _cls5
        implements Runnable
    {

        final InterstitialAdapter a;
        final h b;

        public void run()
        {
            com.facebook.ads.internal.h.a(b, a);
            com.facebook.ads.internal.h.c(b);
        }

        _cls5(InterstitialAdapter interstitialadapter)
        {
            b = h.this;
            a = interstitialadapter;
            super();
        }
    }


    private class _cls6
        implements InterstitialAdapterListener
    {

        final Runnable a;
        final h b;

        public void onInterstitialAdClicked(InterstitialAdapter interstitialadapter, String s1, boolean flag)
        {
            com.facebook.ads.internal.h.d(b);
            h.o(b).b();
            StringBuilder stringbuilder;
            boolean flag1;
            if (!com.facebook.ads.internal.util.s.a(s1))
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            stringbuilder = (new StringBuilder("Clickthrough event with playerHandles=")).append(flag).append(" and url ");
            if (flag1)
            {
                interstitialadapter = "defined";
            } else
            {
                interstitialadapter = "not defined";
            }
            Debug.d(stringbuilder.append(interstitialadapter).toString());
            if (!flag)
            {
                Debug.v("Adapter handles click, ignoring click url.");
            } else
            if (flag1)
            {
                Debug.d((new StringBuilder("Intent url=")).append(s1).toString());
                interstitialadapter = new Intent("android.intent.action.VIEW");
                if (!(com.facebook.ads.internal.h.p(b).d instanceof Activity))
                {
                    Debug.d("Context is not instance of Activity");
                    interstitialadapter.addFlags(0x10000000);
                }
                interstitialadapter.setData(Uri.parse(s1));
                com.facebook.ads.internal.h.p(b).d.startActivity(interstitialadapter);
                return;
            }
        }

        public void onInterstitialAdDismissed(InterstitialAdapter interstitialadapter)
        {
            com.facebook.ads.internal.h.d(b);
            h.r(b).e();
        }

        public void onInterstitialAdDisplayed(InterstitialAdapter interstitialadapter)
        {
            com.facebook.ads.internal.h.d(b);
            com.facebook.ads.internal.h.q(b).d();
        }

        public void onInterstitialAdLoaded(InterstitialAdapter interstitialadapter)
        {
            com.facebook.ads.internal.h.d(b);
            h.e(b).removeCallbacks(a);
            com.facebook.ads.internal.h.b(b, interstitialadapter);
            h.m(b).a();
            com.facebook.ads.internal.h.b(b);
        }

        public void onInterstitialError(InterstitialAdapter interstitialadapter, AdError aderror)
        {
            com.facebook.ads.internal.h.d(b);
            h.e(b).removeCallbacks(a);
            com.facebook.ads.internal.h.a(b, interstitialadapter);
            com.facebook.ads.internal.h.c(b);
        }

        public void onInterstitialLoggingImpression(InterstitialAdapter interstitialadapter)
        {
            com.facebook.ads.internal.h.d(b);
            h.n(b).c();
        }

        _cls6(Runnable runnable)
        {
            b = h.this;
            a = runnable;
            super();
        }
    }


    private class _cls7
        implements Runnable
    {

        final p a;
        final h b;

        public void run()
        {
            com.facebook.ads.internal.h.a(b, a);
            com.facebook.ads.internal.h.c(b);
        }

        _cls7(p p1)
        {
            b = h.this;
            a = p1;
            super();
        }
    }


    private class _cls8
        implements q
    {

        final Runnable a;
        final h b;

        public void a(p p1)
        {
            com.facebook.ads.internal.h.d(b);
            h.e(b).removeCallbacks(a);
            com.facebook.ads.internal.h.b(b, p1);
            com.facebook.ads.internal.h.s(b).a();
        }

        public void a(p p1, AdError aderror)
        {
            com.facebook.ads.internal.h.d(b);
            h.e(b).removeCallbacks(a);
            com.facebook.ads.internal.h.a(b, p1);
            com.facebook.ads.internal.h.c(b);
        }

        _cls8(Runnable runnable)
        {
            b = h.this;
            a = runnable;
            super();
        }
    }

}
