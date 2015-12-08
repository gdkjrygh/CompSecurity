// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.iap;

import android.app.Activity;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.support.v4.content.j;
import com.amazon.device.iap.model.FulfillmentResult;
import com.amazon.device.iap.model.ProductType;
import com.pandora.android.activity.ForegroundMonitorService;
import com.pandora.android.activity.PandoraIntent;
import com.pandora.android.coachmark.CoachmarkBuilder;
import com.pandora.android.coachmark.e;
import com.pandora.android.countdown.b;
import com.pandora.android.data.l;
import com.pandora.android.util.s;
import com.pandora.radio.data.af;
import com.pandora.radio.data.ag;
import com.pandora.radio.data.o;
import com.pandora.radio.util.i;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import p.bz.d;
import p.cm.v;
import p.cm.y;
import p.cx.p;
import p.dc.c;
import p.dd.an;
import p.dd.bo;
import p.di.r;

// Referenced classes of package com.pandora.android.iap:
//            d, b, c, InAppPurchaseReceiver

public class com.pandora.android.iap.a
{
    private final class a
        implements b.b
    {

        final com.pandora.android.iap.a a;
        private String b;

        public void a(String s1, String s2, String s3, ProductType producttype)
        {
            s1 = new p.cc.e(s1, s2, null, s3, null);
            (new v(com.pandora.android.iap.a.e(a).b().e(), new p.cm.v.a(this, s2) {

                final String a;
                final a b;

                public void a(p.dc.a a1, List list)
                {
                    if (a1 != null)
                    {
                        com.pandora.android.iap.d.d.a().e().a(a, FulfillmentResult.FULFILLED);
                        p.df.a.c("ALaCarteSubscriptionManager", "AmazonPurchase aLaCarte was successful");
                        list = new PandoraIntent("iap_complete");
                        com.pandora.android.provider.b.a.C().a(list);
                        com.pandora.android.iap.a.a(b.a, a1);
                        b.a.a(a1);
                        b.a.c();
                        return;
                    } else
                    {
                        p.df.a.c("ALaCarteSubscriptionManager", "AmazonPurchase AlaCarte failed");
                        b.a.a(new PandoraIntent("iap_error"));
                        return;
                    }
                }

            
            {
                b = a1;
                a = s1;
                super();
            }
            })).execute(new p.cc.e[] {
                s1
            });
        }

        public a(String s1)
        {
            a = com.pandora.android.iap.a.this;
            super();
            b = s1;
        }
    }

    private final class b extends c.a
    {

        final com.pandora.android.iap.a a;

        protected void a(p.cc.e e1)
        {
            (new y(com.pandora.android.iap.a.e(a).b().e(), new p.cm.y.a(this, e1) {

                final p.cc.e a;
                final b b;

                public void a(p.dc.a a1, List list)
                {
                    if (a1 != null && com.pandora.android.iap.d.d.a().d().a(a))
                    {
                        p.df.a.c("ALaCarteSubscriptionManager", "GoogleALaCarte AlaCarte was successful");
                        b.a.a(new PandoraIntent("iap_complete"));
                    } else
                    {
                        p.df.a.c("ALaCarteSubscriptionManager", "GoogleALaCarte AlaCarte failed");
                        b.a.a(new PandoraIntent("iap_error"));
                    }
                    com.pandora.android.iap.a.e(b.a).b().j().a(false);
                    com.pandora.android.iap.d.d.a().d().a(false);
                    com.pandora.android.iap.a.a(b.a, a1);
                    b.a.a(a1);
                    b.a.c();
                }

            
            {
                b = b1;
                a = e1;
                super();
            }
            })).execute(new p.cc.e[] {
                e1
            });
        }

        public b(Activity activity, String s1)
        {
            a = com.pandora.android.iap.a.this;
            super(activity, s1);
        }
    }

    private class c
    {

        final com.pandora.android.iap.a a;

        public void onApplicationFocusChanged(d d1)
        {
            if (d1.b != p.bz.d.a.b) goto _L2; else goto _L1
_L1:
            return;
_L2:
            p.df.a.a("ALaCarteSubscriptionManager", (new StringBuilder()).append("SubscriberWrapper: onApplicationFocusChanged: foreground = true; activity = ").append(d1.a).toString());
            d1 = com.pandora.android.iap.a.e(a).b().k().W();
            if (d1 == null) goto _L1; else goto _L3
_L3:
            com.pandora.android.iap.a.e(a).b().k().a(null);
            try
            {
                d1 = new p.dc.a(d1);
            }
            // Misplaced declaration of an exception variable
            catch (d d1)
            {
                p.df.a.b("ALaCarteSubscriptionManager", "onEnteredForeground", d1);
                return;
            }
            if (d1 == null) goto _L1; else goto _L4
_L4:
            if (!com.pandora.android.iap.a.a(a, d1.l())) goto _L1; else goto _L5
_L5:
            com.pandora.android.iap.a.i(a).postDelayed(new Runnable(this, d1) {

                final p.dc.a a;
                final c b;

                public void run()
                {
                    ((NotificationManager)com.pandora.android.iap.a.f(b.a).getSystemService("notification")).cancel(12002);
                    com.pandora.android.coachmark.e.e e1;
                    if (a.e())
                    {
                        e1 = com.pandora.android.coachmark.e.e.v;
                    } else
                    {
                        e1 = com.pandora.android.coachmark.e.e.u;
                    }
                    b.a.a(e1, a.s(), a.o(), com.pandora.android.coachmark.e.b.a);
                }

            
            {
                b = c1;
                a = a1;
                super();
            }
            }, 1000L);
            return;
        }

        public void onSignInState(an an1)
        {
            p.df.a.a("ALaCarteSubscriptionManager", (new StringBuilder()).append("SubscriberWrapper: onSignInState: ").append(an1.a).toString());
            com.pandora.android.iap.a.a(a, an1.b, an1.a);
        }

        public void onUserData(bo bo1)
        {
            p.df.a.a("ALaCarteSubscriptionManager", (new StringBuilder()).append("SubscriberWrapper: onUserData: ").append(bo1.a).toString());
            com.pandora.android.iap.a.a(a, bo1.a);
        }

        private c()
        {
            a = com.pandora.android.iap.a.this;
            super();
        }

    }


    private static final String b[] = {
        "first", "second", "third", "fourth", "fifth", "sixth", "seventh", "eighth", "ninth", "tenth"
    };
    private final Object a = new Object();
    private Context c;
    private com.pandora.android.provider.b d;
    private Handler e;
    private String f;
    private c g;
    private af h;
    private p.dc.a i;
    private List j;
    private com.pandora.android.countdown.a k;
    private int l;
    private Runnable m;
    private Runnable n;

    com.pandora.android.iap.a(Context context, Handler handler, com.pandora.android.provider.b b1)
    {
        f = null;
        h = null;
        i = null;
        j = null;
        k = null;
        l = 0;
        m = new Runnable() {

            final com.pandora.android.iap.a a;

            public void run()
            {
                if (com.pandora.android.iap.a.d(a) != null)
                {
                    com.pandora.android.countdown.b b2 = new com.pandora.android.countdown.b(com.pandora.android.countdown.a.c, com.pandora.android.iap.a.d(a));
                    com.pandora.android.iap.a.e(a).e().a(b2);
                }
                a.a(new PandoraIntent("iap_benefit_expired"));
                if (com.pandora.android.iap.a.g(a) != null && com.pandora.android.iap.a.g(a).s() != null)
                {
                    if (!ForegroundMonitorService.a())
                    {
                        android.support.v4.app.u.d d1;
                        Intent intent;
                        Intent intent1;
                        try
                        {
                            com.pandora.android.iap.a.e(a).b().k().a(com.pandora.android.iap.a.g(a).m());
                        }
                        catch (JSONException jsonexception)
                        {
                            p.df.a.b("ALaCarteSubscriptionManager", "alaCarteExpiredTimer", jsonexception);
                        }
                        d1 = (new android.support.v4.app.u.d(com.pandora.android.iap.a.f(a))).a(com.pandora.android.iap.a.f(a).getText(0x7f080081)).a(0x7f02022b).b(true);
                        d1.b(com.pandora.android.iap.a.f(a).getText(0x7f080080));
                        intent = new Intent(com.pandora.android.iap.a.f(a), com/pandora/android/iap/InAppPurchaseReceiver);
                        intent.setAction("com.pandora.android.iap.InAppPurchaseReceiver.ACTION_CLICKED");
                        intent.putExtra("EXTRA_ALA_CARTE_SKU", com.pandora.android.iap.a.g(a).o());
                        d1.a(PendingIntent.getBroadcast(com.pandora.android.iap.a.f(a), 0, intent, 0x8000000));
                        intent1 = new Intent(com.pandora.android.iap.a.f(a), com/pandora/android/iap/InAppPurchaseReceiver);
                        intent1.setAction("com.pandora.android.iap.InAppPurchaseReceiver.ACTION_REMOVED");
                        intent.putExtra("EXTRA_ALA_CARTE_SKU", com.pandora.android.iap.a.g(a).o());
                        d1.b(PendingIntent.getBroadcast(com.pandora.android.iap.a.f(a), 0, intent1, 0x8000000));
                        ((NotificationManager)com.pandora.android.iap.a.f(a).getSystemService("notification")).notify(12002, d1.a());
                    } else
                    {
                        com.pandora.android.coachmark.e.e e1;
                        if (com.pandora.android.iap.a.g(a).e())
                        {
                            e1 = com.pandora.android.coachmark.e.e.v;
                        } else
                        {
                            e1 = com.pandora.android.coachmark.e.e.u;
                        }
                        a.a(e1, com.pandora.android.iap.a.g(a).s(), com.pandora.android.iap.a.g(a).o(), com.pandora.android.coachmark.e.b.a);
                    }
                }
                com.pandora.android.iap.a.e(a).b().z().a();
                a.c();
            }

            
            {
                a = com.pandora.android.iap.a.this;
                super();
            }
        };
        n = new Runnable() {

            final com.pandora.android.iap.a a;

            public void run()
            {
                Object obj = com.pandora.android.iap.a.b(a, com.pandora.android.iap.a.g(a));
                if (com.pandora.android.iap.a.g(a).i() && ((com.pandora.android.countdown.a) (obj)).h())
                {
                    com.pandora.android.iap.a.a(a, ((com.pandora.android.countdown.a) (obj)));
                    obj = new com.pandora.android.countdown.b(com.pandora.android.countdown.a.b, com.pandora.android.iap.a.d(a));
                    com.pandora.android.iap.a.e(a).e().a(obj);
                    return;
                } else
                {
                    com.pandora.android.iap.a.a(a, null);
                    return;
                }
            }

            
            {
                a = com.pandora.android.iap.a.this;
                super();
            }
        };
        c = context;
        d = b1;
        e = handler;
    }

    static com.pandora.android.countdown.a a(com.pandora.android.iap.a a1, com.pandora.android.countdown.a a2)
    {
        a1.k = a2;
        return a2;
    }

    static Object a(com.pandora.android.iap.a a1)
    {
        return a1.a;
    }

    static String a(com.pandora.android.iap.a a1, String s1)
    {
        a1.f = s1;
        return s1;
    }

    static List a(com.pandora.android.iap.a a1, List list)
    {
        a1.j = list;
        return list;
    }

    static p.dc.a a(com.pandora.android.iap.a a1, p.dc.a a2)
    {
        a1.i = a2;
        return a2;
    }

    static void a(com.pandora.android.iap.a a1, af af1)
    {
        a1.a(af1);
    }

    static void a(com.pandora.android.iap.a a1, p.cx.e.a a2, af af1)
    {
        a1.a(a2, af1);
    }

    private void a(af af1)
    {
        if (af1 == null)
        {
            return;
        }
        h = af1;
        p.dc.a a1;
        if (af1.D() == null || af1.D().isEmpty())
        {
            a1 = null;
        } else
        {
            a1 = (p.dc.a)af1.D().get(0);
        }
        b(a1);
        c(af1.C());
    }

    private void a(p.cx.e.a a1, af af1)
    {
        p.df.a.a("ALaCarteSubscriptionManager", (new StringBuilder()).append("handleSignInState ").append(a1).append("] mUserData: ").append(af1).toString());
        static class _cls7
        {

            static final int a[];

            static 
            {
                a = new int[p.cx.e.a.values().length];
                try
                {
                    a[p.cx.e.a.b.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[p.cx.e.a.d.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls7.a[a1.ordinal()];
        JVM INSTR tableswitch 1 2: default 64
    //                   1 65
    //                   2 75;
           goto _L1 _L2 _L3
_L1:
        return;
_L2:
        if (af1 != null)
        {
            a(af1);
            return;
        }
          goto _L1
_L3:
        l = 0;
        e.removeCallbacksAndMessages(null);
        h = null;
        i = null;
        f = null;
        j = null;
        return;
    }

    private boolean a(long l1)
    {
        long l2 = com.pandora.radio.util.i.g();
        return l1 != -1L && l2 <= l1;
    }

    static boolean a(com.pandora.android.iap.a a1, long l1)
    {
        return a1.a(l1);
    }

    static com.pandora.android.countdown.a b(com.pandora.android.iap.a a1, p.dc.a a2)
    {
        return a1.c(a2);
    }

    static List b(com.pandora.android.iap.a a1)
    {
        return a1.j;
    }

    private p.dc.c b(String s1)
    {
        if (!com.pandora.radio.util.i.a(s1) && j != null) goto _L2; else goto _L1
_L1:
        p.dc.c c1 = null;
_L4:
        return c1;
_L2:
        Iterator iterator = j.iterator();
label0:
        do
        {
label1:
            {
                if (!iterator.hasNext())
                {
                    break label1;
                }
                p.dc.c c2 = (p.dc.c)iterator.next();
                c1 = c2;
                if (c2.o().equalsIgnoreCase(s1))
                {
                    continue;
                }
                if (c2.n().equalsIgnoreCase(s1))
                {
                    return c2;
                }
            }
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
        return null;
    }

    private void b(p.dc.a a1)
    {
        p.df.a.a("ALaCarteSubscriptionManager", (new StringBuilder()).append("updateActiveBenefit purchaseBenefit: ").append(a1).toString());
        p.df.a.a("ALaCarteSubscriptionManager", (new StringBuilder()).append("updateActiveBenefit activeBenefit: ").append(i).toString());
        e.removeCallbacksAndMessages(null);
        if (i != null && a1 != null)
        {
            i.a(a1);
        } else
        if (i != null && a1 == null)
        {
            m.run();
            i = null;
        } else
        {
            i = a1;
        }
        if (i == null) goto _L2; else goto _L1
_L1:
        p.df.a.a("ALaCarteSubscriptionManager", (new StringBuilder()).append("updateActiveBenefit 2: ").append(i).toString());
        a(new PandoraIntent("hide_banner_ad"));
        a1 = c(i);
        if (i.i() && a1.h())
        {
            k = a1;
            a1 = new com.pandora.android.countdown.b(com.pandora.android.countdown.a.b, k);
            d.e().a(a1);
        } else
        if (!i.i() && k != null && k.h())
        {
            l();
        } else
        {
            k = null;
        }
        e.postDelayed(m, i.b() * 1000L);
_L4:
        k();
        return;
_L2:
        if (k != null)
        {
            a1 = new com.pandora.android.countdown.b(com.pandora.android.countdown.a.c, k);
            d.e().a(a1);
            l();
            i = null;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private com.pandora.android.countdown.a c(p.dc.a a1)
    {
        com.pandora.android.countdown.CountdownBarLayout.a a2 = new com.pandora.android.countdown.CountdownBarLayout.a() {

            final com.pandora.android.iap.a a;

            public void a()
            {
            }

            public void b()
            {
                com.pandora.android.iap.a.c(a);
            }

            public void c()
            {
                com.pandora.android.countdown.b b1 = new com.pandora.android.countdown.b(com.pandora.android.countdown.a.c, com.pandora.android.iap.a.d(a));
                com.pandora.android.iap.a.e(a).e().a(b1);
            }

            public void d()
            {
                PandoraIntent pandoraintent = new PandoraIntent("launch_pandora_browser");
                String s1 = p.cp.b.e();
                pandoraintent.putExtra("pandora.landing_page_data", new l(new com.pandora.radio.data.b(), s1, null, -1, com.pandora.android.data.l.a.e, null));
                a.a(pandoraintent);
            }

            
            {
                a = com.pandora.android.iap.a.this;
                super();
            }
        };
        com.pandora.android.countdown.c c1 = new com.pandora.android.countdown.c(new com.pandora.android.countdown.c.a() {

            final com.pandora.android.iap.a a;

            public String a(long l1, long l2)
            {
                int j1 = (int)l1 / 3600;
                if (j1 < 24)
                {
                    StringBuilder stringbuilder = new StringBuilder();
                    int j2 = (int)l1 - j1 * 3600;
                    int k1 = j2 / 60;
                    int i1 = k1;
                    if (j2 - k1 * 60 > 0)
                    {
                        i1 = k1 + 1;
                    }
                    if (i1 > 59)
                    {
                        i1 = j1 + 1;
                        j1 = 0;
                    } else
                    {
                        int i2 = i1;
                        i1 = j1;
                        j1 = i2;
                    }
                    if (i1 > 0)
                    {
                        stringbuilder.append(i1);
                        String s1;
                        if (j1 > 0)
                        {
                            s1 = "h ";
                        } else
                        {
                            s1 = "h";
                        }
                        stringbuilder.append(s1);
                    }
                    if (j1 > 0)
                    {
                        stringbuilder.append(j1);
                        stringbuilder.append("m");
                    }
                    return String.format(Locale.getDefault(), com.pandora.android.iap.a.f(a).getString(0x7f08007e), new Object[] {
                        stringbuilder.toString()
                    });
                } else
                {
                    i1 = (int)l2 / 0x15180;
                    j1 = (int)Math.ceil((double)j1 / 24D);
                    return String.format(Locale.getDefault(), com.pandora.android.iap.a.f(a).getString(0x7f08007f), new Object[] {
                        com.pandora.android.iap.a.j()[i1 - j1]
                    });
                }
            }

            
            {
                a = com.pandora.android.iap.a.this;
                super();
            }
        }, null, "Hide", true, false);
        c1.a(0x7f0d0116);
        a1 = new com.pandora.android.countdown.a(a1.o(), c1, null, a1.d(), a1.k(), a2);
        a1.a(1);
        return a1;
    }

    static void c(com.pandora.android.iap.a a1)
    {
        a1.l();
    }

    private void c(String s1)
    {
        this;
        JVM INSTR monitorenter ;
        p.df.a.a("ALaCarteSubscriptionManager", (new StringBuilder()).append("processAlaCarteChecksum [").append(f).append(" | ").append(s1).append("]").toString());
        if (f == null || !f.equals(s1))
        {
            s1 = new p.cm.c.a(s1) {

                final String a;
                final com.pandora.android.iap.a b;

                public void a(List list)
                {
                    synchronized (com.pandora.android.iap.a.a(b))
                    {
                        com.pandora.android.iap.a.a(b, list);
                        p.df.a.a("ALaCarteSubscriptionManager", (new StringBuilder()).append("AvailableALaCarteProductsTask: ").append(com.pandora.android.iap.a.b(b)).toString());
                        com.pandora.android.iap.a.a(b, a);
                    }
                    return;
                    list;
                    obj;
                    JVM INSTR monitorexit ;
                    throw list;
                }

                public void b(List list)
                {
                }

            
            {
                b = com.pandora.android.iap.a.this;
                a = s1;
                super();
            }
            };
            a(p.dc.b.a, s1);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        s1;
        throw s1;
    }

    static com.pandora.android.countdown.a d(com.pandora.android.iap.a a1)
    {
        return a1.k;
    }

    static com.pandora.android.provider.b e(com.pandora.android.iap.a a1)
    {
        return a1.d;
    }

    static Context f(com.pandora.android.iap.a a1)
    {
        return a1.c;
    }

    static p.dc.a g(com.pandora.android.iap.a a1)
    {
        return a1.i;
    }

    static void h(com.pandora.android.iap.a a1)
    {
        a1.k();
    }

    static Handler i(com.pandora.android.iap.a a1)
    {
        return a1.e;
    }

    static String[] j()
    {
        return b;
    }

    private void k()
    {
        JSONArray jsonarray = null;
        try
        {
            if (i != null)
            {
                jsonarray = new JSONArray();
                jsonarray.put(i.m());
            }
            d.b().k().a(jsonarray);
            return;
        }
        catch (JSONException jsonexception)
        {
            p.df.a.b("ALaCarteSubscriptionManager", "updateActiveBenefitStorage", jsonexception);
        }
    }

    private void l()
    {
        if (i != null && i.i())
        {
            e.removeCallbacks(n);
            i.h();
            k();
            e.postDelayed(n, i.j());
        }
        k = null;
    }

    private boolean m()
    {
        return d() && !com.pandora.android.coachmark.e.a(com.pandora.android.coachmark.e.e.s, com.pandora.android.coachmark.e.b.d);
    }

    final void a()
    {
        b();
    }

    public void a(Activity activity, String s1)
    {
        if (com.pandora.radio.util.i.a(s1))
        {
            throw new IllegalArgumentException("product type is required");
        }
        Object obj = b(s1);
        if (obj == null)
        {
            s.e(activity);
            return;
        }
        obj = ((p.dc.c) (obj)).n();
        if (i())
        {
            com.pandora.android.iap.d.d.a().e().a(activity, ((String) (obj)), new a(((String) (obj))));
            return;
        } else
        {
            com.pandora.android.iap.d.d.a().d().a(activity, ((String) (obj)), new b(activity, s1));
            return;
        }
    }

    protected void a(PandoraIntent pandoraintent)
    {
        if (pandoraintent != null)
        {
            d.C().a(pandoraintent);
        }
    }

    protected void a(p.dc.a a1)
    {
        if (a1 != null && a1.g() && a1.c())
        {
            e.post(new Runnable(a1) {

                final p.dc.a a;
                final com.pandora.android.iap.a b;

                public void run()
                {
                    p.df.a.a("ALaCarteSubscriptionManager", (new StringBuilder()).append("showBenefitConfirmationCoachMark : ").append(a.t()).toString());
                    if (b.a(com.pandora.android.coachmark.e.e.t, a.t(), a.o(), com.pandora.android.coachmark.e.b.a))
                    {
                        com.pandora.android.iap.a.g(b).a(true);
                        com.pandora.android.iap.a.h(b);
                    }
                }

            
            {
                b = com.pandora.android.iap.a.this;
                a = a2;
                super();
            }
            });
        }
    }

    protected void a(p.dc.b b1, p.cm.c.a a1)
    {
        (new p.cm.c(a1)).execute(new p.dc.b[] {
            b1
        });
    }

    protected boolean a(com.pandora.android.coachmark.e.e e1, p.dc.c.a a1, Serializable serializable, com.pandora.android.coachmark.e.b b1)
    {
        if (a1 != null)
        {
            e1 = (new CoachmarkBuilder()).a(e1).e(a1.e()).a(a1.b()).c(a1.c()).b(a1.a()).d(a1.d()).a(serializable).b(true).a(b1);
            a1 = new PandoraIntent("show_coachmark");
            a1.putExtra("intent_coachmark_builder", e1);
            a(((PandoraIntent) (a1)));
            return true;
        } else
        {
            return false;
        }
    }

    public boolean a(com.pandora.radio.util.k.a a1)
    {
        if (a1 != null && h != null && !h.i() && m() && (a1 == com.pandora.radio.util.k.a.a || a1 == com.pandora.radio.util.k.a.b))
        {
            l = l + 1;
            return h();
        } else
        {
            return false;
        }
    }

    protected boolean a(String s1)
    {
        if (com.pandora.radio.util.i.a(s1) || j == null)
        {
            return false;
        }
        for (Iterator iterator = j.iterator(); iterator.hasNext();)
        {
            p.dc.c c1 = (p.dc.c)iterator.next();
            if (c1.o().equalsIgnoreCase(s1) || c1.n().equalsIgnoreCase(s1))
            {
                return true;
            }
        }

        return false;
    }

    protected void b()
    {
        if (g == null)
        {
            g = new c();
        }
        d.b().b(g);
        d.e().c(g);
    }

    protected void c()
    {
        (new r()).execute(new Object[] {
            d.b()
        });
    }

    protected boolean d()
    {
        return j != null && !j.isEmpty();
    }

    public List e()
    {
        return j;
    }

    protected p.dc.c f()
    {
        if (j != null && !j.isEmpty())
        {
            return (p.dc.c)j.get(0);
        } else
        {
            return null;
        }
    }

    protected boolean g()
    {
        p.dc.c c1 = f();
        return l >= c1.q() && c1.r() != null;
    }

    protected boolean h()
    {
        boolean flag1 = false;
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        p.df.a.a("ALaCarteSubscriptionManager", (new StringBuilder()).append("showAlaCartePromotionCoachMark closeCount[ ").append(l).append(" | ").append(d()).append(" | ").append(g()).append("]").toString());
        boolean flag = flag1;
        if (!d())
        {
            break MISSING_BLOCK_LABEL_169;
        }
        flag = flag1;
        if (!g())
        {
            break MISSING_BLOCK_LABEL_169;
        }
        p.dc.c c1 = f();
        p.df.a.a("ALaCarteSubscriptionManager", (new StringBuilder()).append("showAlaCartePromotionCoachMark: ").append(c1).toString());
        flag1 = a(com.pandora.android.coachmark.e.e.s, c1.r(), c1.n(), com.pandora.android.coachmark.e.b.d);
        flag = flag1;
        if (d.F())
        {
            break MISSING_BLOCK_LABEL_169;
        }
        p.df.a.a("ALaCarteSubscriptionManager", "showAlaCartePromotionCoachMark resetting close count");
        l = 0;
        flag = flag1;
        obj;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected boolean i()
    {
        return s.m();
    }

}
