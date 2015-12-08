// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk.payments;

import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import com.paypal.android.sdk.ah;
import com.paypal.android.sdk.al;
import com.paypal.android.sdk.ap;
import com.paypal.android.sdk.bB;
import com.paypal.android.sdk.bF;
import com.paypal.android.sdk.bI;
import com.paypal.android.sdk.bK;
import com.paypal.android.sdk.bY;
import com.paypal.android.sdk.bn;
import com.paypal.android.sdk.ca;
import com.paypal.android.sdk.ce;
import com.paypal.android.sdk.cj;
import com.paypal.android.sdk.ck;
import com.paypal.android.sdk.cl;
import com.paypal.android.sdk.cn;
import com.paypal.android.sdk.co;
import com.paypal.android.sdk.cq;
import com.paypal.android.sdk.cy;
import com.paypal.android.sdk.db;
import com.paypal.android.sdk.dc;
import com.paypal.android.sdk.df;
import com.paypal.android.sdk.dm;
import com.paypal.android.sdk.dp;
import com.paypal.android.sdk.du;
import com.paypal.android.sdk.dw;
import com.paypal.android.sdk.ea;
import com.paypal.android.sdk.eb;
import com.paypal.android.sdk.ed;
import com.paypal.android.sdk.ee;
import com.paypal.android.sdk.ef;
import com.paypal.android.sdk.ei;
import com.paypal.android.sdk.ej;
import com.paypal.android.sdk.ek;
import com.paypal.android.sdk.fl;
import com.paypal.android.sdk.fn;
import com.paypal.android.sdk.fo;
import com.paypal.android.sdk.fp;
import com.paypal.android.sdk.fq;
import com.paypal.android.sdk.fr;
import com.paypal.android.sdk.fs;
import com.paypal.android.sdk.ft;
import com.paypal.android.sdk.fu;
import com.paypal.android.sdk.fw;
import com.paypal.android.sdk.fz;
import com.paypal.android.sdk.ga;
import com.paypal.android.sdk.gc;
import com.paypal.android.sdk.gr;
import com.paypal.android.sdk.hp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;

// Referenced classes of package com.paypal.android.sdk.payments:
//            ac, di, af, ai, 
//            ag, aB, PayPalConfiguration, am, 
//            dp, ak, PayPalItem, al, 
//            dq, e, an, ah

public final class PayPalService extends Service
{

    static final ExecutorService a = dm.a();
    private static final String c = com/paypal/android/sdk/payments/PayPalService.getSimpleName();
    private static Intent t;
    bF b;
    private ef d;
    private ed e;
    private PayPalConfiguration f;
    private boolean g;
    private ac h;
    private ac i;
    private com.paypal.android.sdk.payments.dp j;
    private String k;
    private cl l;
    private ak m;
    private String n;
    private cn o;
    private co p;
    private List q;
    private boolean r;
    private boolean s;
    private final BroadcastReceiver u = new af(this);
    private final IBinder v = new ai(this);

    public PayPalService()
    {
        h = new ac();
        i = new ac();
        j = new di(this);
        q = new ArrayList();
        r = true;
        s = true;
    }

    private boolean A()
    {
        return f != null && e != null;
    }

    private static ed B()
    {
        return new ed();
    }

    private void C()
    {
        a(new ag(this), false);
    }

    static PayPalConfiguration a(PayPalService paypalservice)
    {
        return paypalservice.f;
    }

    static ak a(PayPalService paypalservice, ak ak1)
    {
        paypalservice.m = null;
        return null;
    }

    public static void a(Context context)
    {
        Log.w("paypal.sdk", "clearing user data");
        a.submit(new aB(context));
    }

    private void a(Intent intent)
    {
        t = intent;
        (new StringBuilder("init:")).append(b(intent));
        if (f == null)
        {
            f = (PayPalConfiguration)intent.getParcelableExtra("com.paypal.android.sdk.paypalConfiguration");
            if (f == null)
            {
                throw new RuntimeException("Missing EXTRA_PAYPAL_CONFIGURATION. To avoid this error, set EXTRA_PAYPAL_CONFIGURATION in both PayPalService, and the initializing activity.");
            }
        }
        if (!f.o())
        {
            throw new RuntimeException("Service extras invalid.  Please check the docs.");
        }
        Object obj1 = f.b();
        Object obj;
        if (cj.c(((String) (obj1))))
        {
            obj = "https://api-m.paypal.com/v1/";
        } else
        if (cj.b(((String) (obj1))))
        {
            obj = "https://api-m.sandbox.paypal.com/v1/";
        } else
        if (cj.a(((String) (obj1))))
        {
            obj = null;
        } else
        if (z() && intent.hasExtra("com.paypal.android.sdk.baseEnvironmentUrl"))
        {
            obj = intent.getStringExtra("com.paypal.android.sdk.baseEnvironmentUrl");
        } else
        {
            throw new RuntimeException((new StringBuilder("Invalid environment selected:")).append(((String) (obj1))).toString());
        }
        p = new co(o, f.b());
        obj = b(((String) (obj1)), ((String) (obj)));
        if (l == null)
        {
            int i1;
            int j1;
            boolean flag;
            boolean flag1;
            if (z() && intent.hasExtra("com.paypal.android.sdk.mockNetworkDelay"))
            {
                i1 = intent.getIntExtra("com.paypal.android.sdk.mockNetworkDelay", 500);
            } else
            {
                i1 = 500;
            }
            if (z() && intent.hasExtra("com.paypal.android.sdk.mockEnable2fa"))
            {
                flag = intent.getBooleanExtra("com.paypal.android.sdk.mockEnable2fa", false);
            } else
            {
                flag = false;
            }
            if (z() && intent.hasExtra("com.paypal.android.sdk.mock2faPhoneNumberCount"))
            {
                j1 = intent.getIntExtra("com.paypal.android.sdk.mock2faPhoneNumberCount", 1);
            } else
            {
                j1 = 1;
            }
            r = true;
            if (z() && intent.hasExtra("com.paypal.android.sdk.enableAuthenticator"))
            {
                r = intent.getBooleanExtra("com.paypal.android.sdk.enableAuthenticator", true);
            }
            if (z() && intent.hasExtra("com.paypal.android.sdk.enableAuthenticatorSecurity"))
            {
                s = intent.getBooleanExtra("com.paypal.android.sdk.enableAuthenticatorSecurity", true);
            }
            if (z() && intent.hasExtra("com.paypal.android.sdk.enableStageSsl"))
            {
                flag1 = intent.getBooleanExtra("com.paypal.android.sdk.enableStageSsl", true);
            } else
            {
                flag1 = true;
            }
            l = new cl(o, ((ck) (obj)), a());
            l.a(new db(new am(this, (byte)0)));
            obj = new gc(l, i1, flag, j1);
            obj1 = new dp(o, f.b(), a(), l, 0x15f90, a().b(), al.a(a()), flag1);
            obj = new bn(f.b(), l, ((com.paypal.android.sdk.do) (obj)), ((dp) (obj1)));
            l.a(((bn) (obj)));
        }
        ek.b(f.a());
        if (e == null)
        {
            e = B();
        }
        if (!f.j())
        {
            a(o.f());
        }
        k = intent.getComponent().getPackageName();
        a(ej.a);
        C();
    }

    private void a(dw dw1)
    {
        l.b(dw1);
    }

    private void a(ej ej1, boolean flag, String s1, String s2, String s3)
    {
        j.a(ej1, flag, s1, s2, s3);
    }

    static void a(PayPalService paypalservice, dw dw1)
    {
        paypalservice.e.c = null;
        (new StringBuilder()).append(dw1.o()).append(" request error");
        String s1 = dw1.q().b();
        Log.e("paypal.sdk", s1);
        paypalservice.b(ej.b, s1, dw1.k());
        if (paypalservice.m != null)
        {
            paypalservice.m.a(paypalservice.b(dw1));
            paypalservice.m = null;
        }
        paypalservice.g = false;
    }

    static void a(PayPalService paypalservice, ej ej1, boolean flag, String s1, String s2, String s3)
    {
        paypalservice.a(ej1, flag, s1, s2, null);
    }

    private static boolean a(bI bi)
    {
        return bi != null && bi.c();
    }

    static boolean a(PayPalService paypalservice, boolean flag)
    {
        paypalservice.g = false;
        return false;
    }

    private fw[] a(PayPalItem apaypalitem[])
    {
        if (apaypalitem == null)
        {
            return null;
        }
        fw afw[] = new fw[apaypalitem.length];
        int k1 = apaypalitem.length;
        int j1 = 0;
        for (int i1 = 0; j1 < k1; i1++)
        {
            PayPalItem paypalitem = apaypalitem[j1];
            afw[i1] = new fw(paypalitem.a(), paypalitem.b(), paypalitem.c(), paypalitem.d(), paypalitem.e());
            j1++;
        }

        return afw;
    }

    private static ck b(String s1, String s2)
    {
        ck ck1 = new ck();
        ck1.a(s1);
        ck1.a(new HashMap());
        if (s2 != null)
        {
            if (!s2.startsWith("https://"))
            {
                throw new RuntimeException((new StringBuilder()).append(s2).append(" does not start with 'https://', ignoring ").append(s1).toString());
            }
            s1 = s2;
            if (!s2.endsWith("/"))
            {
                (new StringBuilder()).append(s2).append(" does not end with a slash, adding one.");
                s1 = (new StringBuilder()).append(s2).append("/").toString();
            }
            du du1;
            for (s2 = eb.d().iterator(); s2.hasNext(); ck1.b().put(du1.a(), (new StringBuilder()).append(s1).append(du1.c()).toString()))
            {
                du1 = (du)s2.next();
            }

        }
        return ck1;
    }

    static ak b(PayPalService paypalservice)
    {
        return paypalservice.m;
    }

    private com.paypal.android.sdk.payments.al b(dw dw1)
    {
        return new com.paypal.android.sdk.payments.al(this, dw1.q().b(), dw1.s(), dw1.q().a());
    }

    static com.paypal.android.sdk.payments.al b(PayPalService paypalservice, dw dw1)
    {
        return paypalservice.b(dw1);
    }

    private static String b(Intent intent)
    {
        if (intent == null)
        {
            return "Intent = null";
        }
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("Intent{");
        stringbuilder.append((new StringBuilder("action:")).append(intent.getAction()).toString());
        stringbuilder.append((new StringBuilder(", cmp:")).append(intent.getComponent()).append(", ").toString());
        if (intent.getExtras() == null)
        {
            stringbuilder.append("null extras");
        } else
        {
            stringbuilder.append("extras:");
            Iterator iterator = intent.getExtras().keySet().iterator();
            while (iterator.hasNext()) 
            {
                String s1 = (String)iterator.next();
                stringbuilder.append((new StringBuilder("(")).append(s1).append(":").append(intent.getExtras().get(s1)).append(")").toString());
            }
        }
        stringbuilder.append("}");
        return stringbuilder.toString();
    }

    private void b(ej ej1, String s1, String s2)
    {
        a(ej1, false, s1, s2, null);
    }

    static ac c(PayPalService paypalservice)
    {
        return paypalservice.h;
    }

    static void c(PayPalService paypalservice, dw dw1)
    {
        String s1 = dw1.q().b();
        Log.e("paypal.sdk", s1);
        paypalservice.b(ej.h, s1, dw1.k());
        paypalservice.i.a(paypalservice.b(dw1));
    }

    static co d(PayPalService paypalservice)
    {
        return paypalservice.p;
    }

    static ac e(PayPalService paypalservice)
    {
        return paypalservice.i;
    }

    static cn f(PayPalService paypalservice)
    {
        return paypalservice.o;
    }

    static String y()
    {
        return c;
    }

    private static boolean z()
    {
        return "partner".equals("general");
    }

    final ef a()
    {
        if (d == null)
        {
            d = new dq();
        }
        return d;
    }

    final String a(String s1)
    {
        return o.c(s1);
    }

    final void a(int i1)
    {
        l.b(new ft(l, a(), l.c(), f.k(), e.j, (String)(new ArrayList(e.g.a.keySet())).get(i1)));
    }

    public final void a(ah ah1)
    {
        if (ah1.e)
        {
            a(((dw) (new ga(l, a(), ah1))));
            return;
        } else
        {
            a(((dw) (new fr(l, a(), ei.a(ah1)))));
            return;
        }
    }

    final void a(bY by, String s1, boolean flag, String s2, boolean flag1, String s3)
    {
        l.b(new fu(l, a(), l.c(), f.k(), by, s1, e.j, flag, s2, flag1, s3));
    }

    final void a(bY by, boolean flag, String s1, boolean flag1, String s2)
    {
        l.b(new fu(l, a(), l.c(), f.k(), by, flag, s1, flag1, s2));
    }

    final void a(ca ca, Map map, PayPalItem apaypalitem[], String s1, boolean flag, String s2, String s3, 
            boolean flag1, String s4, String s5, String s6)
    {
        l.b((new fo(l, a(), e.h.b(), e.b(), null, ca, map, a(apaypalitem), s1, flag, s2, n, s3, flag1)).d(s4).e(s5).f(s6));
    }

    final void a(ej ej1)
    {
        a(ej1, false, null, ((String) (null)), null);
    }

    final void a(ej ej1, Boolean boolean1)
    {
        a(ej1, boolean1.booleanValue(), null, ((String) (null)), null);
    }

    final void a(ej ej1, Boolean boolean1, String s1)
    {
        a(ej1, boolean1.booleanValue(), null, s1, null);
    }

    final void a(ej ej1, String s1)
    {
        a(ej1, false, null, s1, null);
    }

    final void a(ej ej1, String s1, String s2)
    {
        a(ej1, false, null, s1, s2);
    }

    final void a(com.paypal.android.sdk.payments.ah ah1)
    {
        h.a(ah1);
    }

    final void a(ak ak1, boolean flag)
    {
        if (flag)
        {
            e.c = null;
        }
        for (m = ak1; g || e.c();)
        {
            return;
        }

        g = true;
        a(ej.b);
        l.b(new fz(f.b(), l, a(), f.k()));
    }

    public final void a(String s1, String s2)
    {
        a(((dw) (new fq(l, a(), s1, s2))));
    }

    final void a(String s1, String s2, ca ca, Map map, PayPalItem apaypalitem[], String s3, boolean flag, 
            String s4, String s5, String s6, String s7, String s8, String s9)
    {
        l.b((new fp(l, a(), e.c.b(), s1, s2, s4, ca, map, a(apaypalitem), s3, flag, s5, n, s6)).d(s7).e(s8).f(s9));
    }

    final void a(String s1, String s2, String s3, String s4, int i1, int j1, ca ca, 
            Map map, PayPalItem apaypalitem[], String s5, boolean flag, String s6, String s7, String s8, 
            String s9, String s10)
    {
        if (s3.equalsIgnoreCase("4111111111111111") && cj.b(f.b()))
        {
            s3 = "4444333322221111";
        }
        l.b((new fp(l, a(), e.c.b(), s1, s2, s3, s4, i1, j1, null, ca, map, a(apaypalitem), s5, flag, s6, n, s7)).d(s8).e(s9).f(s10));
    }

    final void a(List list)
    {
        l.b(new fn(l, a(), l.c(), f.k(), e.f.b(), e.j, list));
    }

    final void a(boolean flag, String s1, String s2, JSONObject jsonobject, JSONObject jsonobject1, String s3)
    {
        l.b(new fl(l, a(), e.h.b(), e.b(), flag, s3, n, s1, s2, jsonobject, jsonobject1));
    }

    protected final boolean a(an an1)
    {
        if (A())
        {
            return true;
        } else
        {
            q.add(an1);
            return false;
        }
    }

    protected final cl b()
    {
        return l;
    }

    final void b(com.paypal.android.sdk.payments.ah ah1)
    {
        i.a(ah1);
    }

    protected final ed c()
    {
        return e;
    }

    final PayPalConfiguration d()
    {
        return f;
    }

    protected final String e()
    {
        return f.b();
    }

    protected final String f()
    {
        return f.k();
    }

    final void g()
    {
        t();
        h();
        p.b();
        u();
    }

    final void h()
    {
        e.h = null;
        ee.b(f.b());
        e.e = null;
        e.d = null;
    }

    final boolean i()
    {
        return e.c();
    }

    final boolean j()
    {
        ed ed1 = e;
        return ed1.h != null && ed1.h.c();
    }

    final boolean k()
    {
        return e.f != null && e.j != null;
    }

    final void l()
    {
        Object obj = p.a();
        if (obj == null)
        {
            h();
            return;
        }
        Object obj1 = e.h;
        bI bi = ee.a(f.b());
        if (!a(((bI) (obj1))) && a(bi))
        {
            e.h = bi;
        }
        obj1 = e;
        if (((bB) (obj)).d())
        {
            if (((bB) (obj)).c().equals(cq.a))
            {
                obj = ((bB) (obj)).b();
            } else
            {
                obj = ((bB) (obj)).a().a(ea.a());
            }
        } else
        {
            obj = null;
        }
        obj1.d = ((String) (obj));
    }

    final void m()
    {
        i.b();
    }

    final void n()
    {
        h.b();
    }

    final void o()
    {
        m = null;
    }

    public final IBinder onBind(Intent intent)
    {
        (new StringBuilder("onBind(")).append(b(intent)).append(")");
        if (!A())
        {
            if (t == null)
            {
                a(intent);
            } else
            {
                a(t);
            }
        }
        return v;
    }

    public final void onCreate()
    {
        Log.w("paypal.sdk", (new StringBuilder()).append(com/paypal/android/sdk/payments/PayPalService.getSimpleName()).append(" created. ").append(a().b()).toString());
        new dq();
        o = new cn(this, "AndroidBasePrefs");
        dc.a(o);
        df.a(o);
        n = hp.a(a, this, o, "2.9.10");
        IntentFilter intentfilter = new IntentFilter();
        intentfilter.addAction("com.paypal.android.sdk.clearAllUserData");
        com.paypal.android.sdk.payments.e.a(this).a(u, intentfilter);
    }

    public final void onDestroy()
    {
        if (l != null)
        {
            l.a();
            l.b();
            l = null;
        }
        try
        {
            com.paypal.android.sdk.payments.e.a(this).a(u);
        }
        catch (Throwable throwable)
        {
            (new StringBuilder("ignoring:")).append(throwable.getMessage());
        }
        (new StringBuilder("service destroyed: ")).append(this);
    }

    public final void onRebind(Intent intent)
    {
        super.onRebind(intent);
        (new StringBuilder("onRebind(")).append(b(intent)).append(")");
    }

    public final int onStartCommand(Intent intent, int i1, int j1)
    {
        (new StringBuilder("onStartCommand(")).append(b(intent)).append(", ").append(i1).append(", ").append(j1).append(")");
        if (!A())
        {
            (new gr(this)).a();
            if (intent == null || intent.getExtras() == null)
            {
                throw new RuntimeException("Service extras required. Please see the docs.");
            }
            a(intent);
        }
        if (q.size() > 0)
        {
            for (intent = q.iterator(); intent.hasNext(); ((an)intent.next()).a()) { }
            q.clear();
        }
        return 3;
    }

    public final boolean onUnbind(Intent intent)
    {
        (new StringBuilder("onUnbind(")).append(b(intent)).append(")");
        return true;
    }

    final void p()
    {
        l.b(new fs(l, a(), l.c(), e.c.b(), f.k()));
    }

    final bB q()
    {
        return p.a();
    }

    final String r()
    {
        return e.d;
    }

    final bF s()
    {
        return p.a(f.k());
    }

    final void t()
    {
        b = s();
        p.c();
        if (b != null && e.c != null)
        {
            a(e.c.b(), b.e());
            b = null;
        }
    }

    final void u()
    {
        if (f != null && f.o())
        {
            e = B();
            C();
        }
    }

    protected final String v()
    {
        return k;
    }

    final boolean w()
    {
        return r;
    }

    final boolean x()
    {
        return s;
    }

}
