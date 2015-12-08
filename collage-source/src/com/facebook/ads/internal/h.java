// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.internal;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import com.facebook.ads.AdError;
import com.facebook.ads.AdSettings;
import com.facebook.ads.AdSize;
import com.facebook.ads.internal.adapters.AdAdapter;
import com.facebook.ads.internal.adapters.BannerAdapter;
import com.facebook.ads.internal.adapters.BannerAdapterListener;
import com.facebook.ads.internal.adapters.InterstitialAdapter;
import com.facebook.ads.internal.adapters.InterstitialAdapterListener;
import com.facebook.ads.internal.adapters.f;
import com.facebook.ads.internal.adapters.p;
import com.facebook.ads.internal.adapters.q;
import com.facebook.ads.internal.dto.d;
import com.facebook.ads.internal.dto.e;
import com.facebook.ads.internal.server.AdPlacementType;
import com.facebook.ads.internal.server.a;
import com.facebook.ads.internal.util.b;
import com.facebook.ads.internal.util.c;
import com.facebook.ads.internal.util.g;
import com.facebook.ads.internal.util.s;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.facebook.ads.internal:
//            AdErrorType, a, b, e, 
//            c

public class h
    implements com.facebook.ads.internal.server.a.a
{
    private class a extends BroadcastReceiver
    {

        final h a;

        public void onReceive(Context context, Intent intent)
        {
            context = intent.getAction();
            if ("android.intent.action.SCREEN_OFF".equals(context))
            {
                h.h(a);
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

    }


    private static final String b = com/facebook/ads/internal/h.getSimpleName();
    protected com.facebook.ads.internal.a a;
    private final Context c;
    private final String d;
    private final com.facebook.ads.internal.server.a e = new com.facebook.ads.internal.server.a();
    private final Handler f = new Handler();
    private final Runnable g = new Runnable() {

        final h a;

        public void run()
        {
            com.facebook.ads.internal.h.a(a, false);
            com.facebook.ads.internal.h.a(a);
        }

            
            {
                a = h.this;
                super();
            }
    };
    private final Runnable h = new Runnable() {

        final h a;

        public void run()
        {
            com.facebook.ads.internal.h.b(a);
        }

            
            {
                a = h.this;
                super();
            }
    };
    private volatile boolean i;
    private boolean j;
    private volatile boolean k;
    private AdAdapter l;
    private View m;
    private com.facebook.ads.internal.dto.c n;
    private e o;
    private com.facebook.ads.internal.e p;
    private com.facebook.ads.internal.c q;
    private AdSize r;
    private int s;
    private final a t = new a();
    private boolean u;

    public h(Context context, String s1, com.facebook.ads.internal.e e1, AdSize adsize, com.facebook.ads.internal.c c1, int i1, boolean flag)
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

    static void h(h h1)
    {
        h1.p();
    }

    static e i(h h1)
    {
        return h1.o;
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

    private void m()
    {
        o = new e(c, d, r, p, q, s, AdSettings.isTestMode(c));
        e.a(c, o);
    }

    private void n()
    {
        Object obj3 = n;
        Object obj1 = ((com.facebook.ads.internal.dto.c) (obj3)).c();
        if (obj1 == null)
        {
            a.a(AdErrorType.NO_FILL.getAdErrorWrapper(""));
            o();
            return;
        }
        Object obj = ((com.facebook.ads.internal.dto.a) (obj1)).b;
        Object obj2 = com.facebook.ads.internal.adapters.f.a(((String) (obj)), ((com.facebook.ads.internal.dto.c) (obj3)).a().a());
        if (obj2 == null)
        {
            Log.e(b, (new StringBuilder()).append("Adapter does not exist: ").append(((String) (obj))).toString());
            n();
            return;
        }
        if (l() != ((AdAdapter) (obj2)).getPlacementType())
        {
            a.a(AdErrorType.INTERNAL_ERROR.getAdErrorWrapper(""));
            return;
        }
        obj = new HashMap();
        obj3 = ((com.facebook.ads.internal.dto.c) (obj3)).a();
        ((Map) (obj)).put("data", ((com.facebook.ads.internal.dto.a) (obj1)).c);
        ((Map) (obj)).put("definition", obj3);
        if (o == null)
        {
            a.a(AdErrorType.UNKNOWN_ERROR.getAdErrorWrapper("environment is empty"));
        }
        static class _cls9
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

        switch (com.facebook.ads.internal._cls9.a[((AdAdapter) (obj2)).getPlacementType().ordinal()])
        {
        default:
            Log.e(b, "attempt unexpected adapter type");
            return;

        case 2: // '\002'
            obj1 = (BannerAdapter)obj2;
            obj2 = new Runnable(((BannerAdapter) (obj1))) {

                final BannerAdapter a;
                final h b;

                public void run()
                {
                    com.facebook.ads.internal.h.a(b, a);
                    com.facebook.ads.internal.h.c(b);
                }

            
            {
                b = h.this;
                a = banneradapter;
                super();
            }
            };
            f.postDelayed(((Runnable) (obj2)), 10000L);
            ((BannerAdapter) (obj1)).loadBannerAd(c, r, new BannerAdapterListener(((Runnable) (obj2))) {

                final Runnable a;
                final h b;

                public void onBannerAdClicked(BannerAdapter banneradapter)
                {
                    com.facebook.ads.internal.h.d(b);
                    b.a.b();
                }

                public void onBannerAdExpanded(BannerAdapter banneradapter)
                {
                    com.facebook.ads.internal.h.d(b);
                    h.h(b);
                }

                public void onBannerAdLoaded(BannerAdapter banneradapter, View view)
                {
                    com.facebook.ads.internal.h.d(b);
                    com.facebook.ads.internal.h.e(b).removeCallbacks(a);
                    AdAdapter adadapter = com.facebook.ads.internal.h.f(b);
                    com.facebook.ads.internal.h.b(b, banneradapter);
                    com.facebook.ads.internal.h.a(b, view);
                    if (!com.facebook.ads.internal.h.g(b))
                    {
                        b.a.a();
                        return;
                    } else
                    {
                        b.a.a(view);
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
                    com.facebook.ads.internal.h.e(b).removeCallbacks(a);
                    com.facebook.ads.internal.h.a(b, banneradapter);
                    com.facebook.ads.internal.h.c(b);
                }

                public void onBannerLoggingImpression(BannerAdapter banneradapter)
                {
                    com.facebook.ads.internal.h.d(b);
                    b.a.c();
                }

            
            {
                b = h.this;
                a = runnable;
                super();
            }
            }, ((Map) (obj)));
            return;

        case 1: // '\001'
            obj1 = (InterstitialAdapter)obj2;
            obj2 = new Runnable(((InterstitialAdapter) (obj1))) {

                final InterstitialAdapter a;
                final h b;

                public void run()
                {
                    com.facebook.ads.internal.h.a(b, a);
                    com.facebook.ads.internal.h.c(b);
                }

            
            {
                b = h.this;
                a = interstitialadapter;
                super();
            }
            };
            f.postDelayed(((Runnable) (obj2)), 10000L);
            ((InterstitialAdapter) (obj1)).loadInterstitialAd(c, new InterstitialAdapterListener(((Runnable) (obj2))) {

                final Runnable a;
                final h b;

                public void onInterstitialAdClicked(InterstitialAdapter interstitialadapter, String s1, boolean flag)
                {
                    com.facebook.ads.internal.h.d(b);
                    b.a.b();
                    boolean flag1;
                    if (!com.facebook.ads.internal.util.s.a(s1))
                    {
                        flag1 = true;
                    } else
                    {
                        flag1 = false;
                    }
                    if (flag && flag1)
                    {
                        interstitialadapter = new Intent("android.intent.action.VIEW");
                        if (!(h.i(b).d instanceof Activity))
                        {
                            interstitialadapter.addFlags(0x10000000);
                        }
                        interstitialadapter.setData(Uri.parse(s1));
                        h.i(b).d.startActivity(interstitialadapter);
                    }
                }

                public void onInterstitialAdDismissed(InterstitialAdapter interstitialadapter)
                {
                    com.facebook.ads.internal.h.d(b);
                    b.a.e();
                }

                public void onInterstitialAdDisplayed(InterstitialAdapter interstitialadapter)
                {
                    com.facebook.ads.internal.h.d(b);
                    b.a.d();
                }

                public void onInterstitialAdLoaded(InterstitialAdapter interstitialadapter)
                {
                    com.facebook.ads.internal.h.d(b);
                    com.facebook.ads.internal.h.e(b).removeCallbacks(a);
                    com.facebook.ads.internal.h.b(b, interstitialadapter);
                    b.a.a();
                    com.facebook.ads.internal.h.b(b);
                }

                public void onInterstitialError(InterstitialAdapter interstitialadapter, AdError aderror)
                {
                    com.facebook.ads.internal.h.d(b);
                    com.facebook.ads.internal.h.e(b).removeCallbacks(a);
                    com.facebook.ads.internal.h.a(b, interstitialadapter);
                    com.facebook.ads.internal.h.c(b);
                }

                public void onInterstitialLoggingImpression(InterstitialAdapter interstitialadapter)
                {
                    com.facebook.ads.internal.h.d(b);
                    b.a.c();
                }

            
            {
                b = h.this;
                a = runnable;
                super();
            }
            }, ((Map) (obj)));
            return;

        case 3: // '\003'
            obj1 = (p)obj2;
            break;
        }
        obj2 = new Runnable(((p) (obj1))) {

            final p a;
            final h b;

            public void run()
            {
                com.facebook.ads.internal.h.a(b, a);
                com.facebook.ads.internal.h.c(b);
            }

            
            {
                b = h.this;
                a = p1;
                super();
            }
        };
        f.postDelayed(((Runnable) (obj2)), 10000L);
        ((p) (obj1)).a(c, new q(((Runnable) (obj2))) {

            final Runnable a;
            final h b;

            public void a(p p1)
            {
                com.facebook.ads.internal.h.d(b);
                com.facebook.ads.internal.h.e(b).removeCallbacks(a);
                com.facebook.ads.internal.h.b(b, p1);
                b.a.a();
            }

            public void a(p p1, AdError aderror)
            {
                com.facebook.ads.internal.h.d(b);
                com.facebook.ads.internal.h.e(b).removeCallbacks(a);
                com.facebook.ads.internal.h.a(b, p1);
                com.facebook.ads.internal.h.c(b);
            }

            
            {
                b = h.this;
                a = runnable;
                super();
            }
        }, ((Map) (obj)));
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

    public d a()
    {
        if (n == null)
        {
            return null;
        } else
        {
            return n.a();
        }
    }

    public void a(com.facebook.ads.internal.a a1)
    {
        a = a1;
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
        if (!p1.w())
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

}
