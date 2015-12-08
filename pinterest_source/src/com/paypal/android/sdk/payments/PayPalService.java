// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk.payments;

import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import com.paypal.android.sdk.aA;
import com.paypal.android.sdk.aB;
import com.paypal.android.sdk.aE;
import com.paypal.android.sdk.aF;
import com.paypal.android.sdk.aJ;
import com.paypal.android.sdk.az;
import com.paypal.android.sdk.b;
import com.paypal.android.sdk.bB;
import com.paypal.android.sdk.bC;
import com.paypal.android.sdk.bD;
import com.paypal.android.sdk.bI;
import com.paypal.android.sdk.bL;
import com.paypal.android.sdk.bN;
import com.paypal.android.sdk.bS;
import com.paypal.android.sdk.bU;
import com.paypal.android.sdk.bV;
import com.paypal.android.sdk.bY;
import com.paypal.android.sdk.bg;
import com.paypal.android.sdk.bk;
import com.paypal.android.sdk.bq;
import com.paypal.android.sdk.bs;
import com.paypal.android.sdk.bu;
import com.paypal.android.sdk.bz;
import com.paypal.android.sdk.c;
import com.paypal.android.sdk.cD;
import com.paypal.android.sdk.cE;
import com.paypal.android.sdk.cF;
import com.paypal.android.sdk.cQ;
import com.paypal.android.sdk.ca;
import com.paypal.android.sdk.cl;
import com.paypal.android.sdk.co;
import com.paypal.android.sdk.cp;
import com.paypal.android.sdk.cq;
import com.paypal.android.sdk.cr;
import com.paypal.android.sdk.cs;
import com.paypal.android.sdk.cw;
import com.paypal.android.sdk.cx;
import com.paypal.android.sdk.cz;
import com.paypal.android.sdk.e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;

// Referenced classes of package com.paypal.android.sdk.payments:
//            a, d, aC, aF, 
//            PayPalConfiguration, aI, aA, k, 
//            aG, aH, l, aD, 
//            D, aJ, aE

public final class PayPalService extends Service
{

    static final ExecutorService a = bg.a();
    private static final String c = com/paypal/android/sdk/payments/PayPalService.getSimpleName();
    private static Intent s;
    bI b;
    private c d;
    private bB e;
    private PayPalConfiguration f;
    private boolean g;
    private a h;
    private a i;
    private k j;
    private String k;
    private aB l;
    private aG m;
    private b n;
    private bD o;
    private List p;
    private boolean q;
    private boolean r;
    private final BroadcastReceiver t = new aC(this);
    private final IBinder u = new com.paypal.android.sdk.payments.aF(this);

    public PayPalService()
    {
        h = new a();
        i = new a();
        j = new d(this);
        p = new ArrayList();
        q = true;
        r = true;
    }

    static PayPalConfiguration a(PayPalService paypalservice)
    {
        return paypalservice.f;
    }

    static aH a(bu bu1)
    {
        return c(bu1);
    }

    private void a(Intent intent)
    {
        s = intent;
        (new StringBuilder("init:")).append(b(intent));
        if (f == null)
        {
            f = (PayPalConfiguration)intent.getParcelableExtra("com.paypal.android.sdk.paypalConfiguration");
            if (f == null)
            {
                throw new RuntimeException("Missing EXTRA_PAYPAL_CONFIGURATION. To avoid this error, set EXTRA_PAYPAL_CONFIGURATION in both PayPalService, and the initializing activity.");
            }
        }
        if (!f.n())
        {
            throw new RuntimeException("Service extras invalid.  Please check the docs.");
        }
        Object obj1 = f.b();
        Object obj;
        if (az.c(((String) (obj1))))
        {
            obj = "https://api-m.paypal.com/v1/";
        } else
        if (az.b(((String) (obj1))))
        {
            obj = "https://api-m.sandbox.paypal.com/v1/";
        } else
        if (az.a(((String) (obj1))))
        {
            obj = null;
        } else
        if (intent.hasExtra("com.paypal.android.sdk.baseEnvironmentUrl"))
        {
            obj = intent.getStringExtra("com.paypal.android.sdk.baseEnvironmentUrl");
        } else
        {
            throw new RuntimeException((new StringBuilder("Invalid environment selected:")).append(((String) (obj1))).toString());
        }
        o = new bD(n, f.b());
        obj = b(((String) (obj1)), ((String) (obj)));
        if (l == null)
        {
            int i1;
            int j1;
            boolean flag;
            boolean flag1;
            if (intent.hasExtra("com.paypal.android.sdk.mockNetworkDelay"))
            {
                i1 = intent.getIntExtra("com.paypal.android.sdk.mockNetworkDelay", 500);
            } else
            {
                i1 = 500;
            }
            if (intent.hasExtra("com.paypal.android.sdk.mockEnable2fa"))
            {
                flag = intent.getBooleanExtra("com.paypal.android.sdk.mockEnable2fa", false);
            } else
            {
                flag = false;
            }
            if (intent.hasExtra("com.paypal.android.sdk.mock2faPhoneNumberCount"))
            {
                j1 = intent.getIntExtra("com.paypal.android.sdk.mock2faPhoneNumberCount", 1);
            } else
            {
                j1 = 1;
            }
            q = true;
            if (intent.hasExtra("com.paypal.android.sdk.enableAuthenticator"))
            {
                q = intent.getBooleanExtra("com.paypal.android.sdk.enableAuthenticator", true);
            }
            if (intent.hasExtra("com.paypal.android.sdk.enableAuthenticatorSecurity"))
            {
                r = intent.getBooleanExtra("com.paypal.android.sdk.enableAuthenticatorSecurity", true);
            }
            if (intent.hasExtra("com.paypal.android.sdk.enableStageSsl"))
            {
                flag1 = intent.getBooleanExtra("com.paypal.android.sdk.enableStageSsl", true);
            } else
            {
                flag1 = true;
            }
            obj1 = n;
            v();
            l = new aB(((b) (obj1)), ((aA) (obj)));
            l.a(new bU(new aI(this, (byte)0)));
            obj = new cz(l, i1, flag, j1);
            obj1 = new bk(n, f.b(), v(), l, v().b(), aF.a(v()), flag1);
            obj = new bq(f.b(), l, ((com.paypal.android.sdk.bi) (obj)), ((bk) (obj1)));
            l.a(((bq) (obj)));
        }
        cF.b(f.a());
        if (e == null)
        {
            e = new bB();
        }
        if (!f.i())
        {
            obj = n.f();
            Log.w("paypal.sdk", "clearing user data");
            a.submit(new com.paypal.android.sdk.payments.aA(((android.content.Context) (obj))));
        }
        k = intent.getComponent().getPackageName();
        a(cE.a);
        x();
    }

    private void a(cE ce, boolean flag, String s1, String s2, String s3)
    {
        j.a(ce, flag, s1, s2, s3);
    }

    static void a(PayPalService paypalservice, bu bu1)
    {
        paypalservice.e.c = null;
        (new StringBuilder()).append(bu1.o()).append(" request error");
        String s1 = bu1.q().a();
        Log.e("paypal.sdk", s1);
        paypalservice.b(cE.b, s1, bu1.k());
        if (paypalservice.m != null)
        {
            paypalservice.m.a(c(bu1));
            paypalservice.m = null;
        }
        paypalservice.g = false;
    }

    static void a(PayPalService paypalservice, cE ce, boolean flag, String s1, String s2)
    {
        paypalservice.a(ce, flag, s1, s2, null);
    }

    private static aA b(String s1, String s2)
    {
        aA aa = new aA();
        aa.a(s1);
        aa.b(s2);
        aa.a(new HashMap());
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
            bs bs1;
            for (s2 = bz.d().iterator(); s2.hasNext(); aa.c().put(bs1.a(), (new StringBuilder()).append(s1).append(bs1.c()).toString()))
            {
                bs1 = (bs)s2.next();
            }

        }
        return aa;
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

    private void b(bu bu1)
    {
        l.b(bu1);
    }

    private void b(cE ce, String s1, String s2)
    {
        a(ce, false, s1, s2, null);
    }

    static void b(PayPalService paypalservice, bu bu1)
    {
        String s1 = bu1.q().a();
        Log.e("paypal.sdk", s1);
        paypalservice.b(cE.c, s1, bu1.k());
        paypalservice.i.a(c(bu1));
    }

    static boolean b(PayPalService paypalservice)
    {
        paypalservice.g = false;
        return false;
    }

    static aG c(PayPalService paypalservice)
    {
        return paypalservice.m;
    }

    private static aH c(bu bu1)
    {
        String s1 = bu1.q().a();
        Integer integer = bu1.s();
        bu1.q();
        return new aH(s1, integer);
    }

    static aG d(PayPalService paypalservice)
    {
        paypalservice.m = null;
        return null;
    }

    static a e(PayPalService paypalservice)
    {
        return paypalservice.h;
    }

    static bD f(PayPalService paypalservice)
    {
        return paypalservice.o;
    }

    static a g(PayPalService paypalservice)
    {
        return paypalservice.i;
    }

    static b h(PayPalService paypalservice)
    {
        return paypalservice.n;
    }

    static String u()
    {
        return c;
    }

    private c v()
    {
        if (d == null)
        {
            d = new l();
        }
        return d;
    }

    private boolean w()
    {
        return f != null && e != null;
    }

    private void x()
    {
        a(new aD(this), false);
    }

    protected final String a()
    {
        return l.e();
    }

    final void a(int i1)
    {
        l.b(new cr(l, v(), l.c(), f.j(), e.j, (String)(new ArrayList(e.g.a.keySet())).get(i1)));
    }

    public final void a(aE ae)
    {
        if (ae.e)
        {
            b(new cx(l, v(), ae));
            return;
        } else
        {
            b(new cp(l, v(), cD.a(ae)));
            return;
        }
    }

    final void a(cE ce)
    {
        a(ce, false, ((String) (null)), ((String) (null)), null);
    }

    final void a(cE ce, Boolean boolean1)
    {
        a(ce, boolean1.booleanValue(), ((String) (null)), ((String) (null)), null);
    }

    final void a(cE ce, Boolean boolean1, String s1)
    {
        a(ce, boolean1.booleanValue(), ((String) (null)), s1, null);
    }

    final void a(cE ce, String s1)
    {
        a(ce, false, ((String) (null)), s1, null);
    }

    final void a(cE ce, String s1, String s2)
    {
        a(ce, false, ((String) (null)), s1, s2);
    }

    final void a(ca ca, String s1, boolean flag, String s2, boolean flag1, String s3)
    {
        l.b(new cs(l, v(), l.c(), f.j(), ca, s1, e.j, flag, s2, flag1, s3));
    }

    final void a(ca ca, boolean flag, String s1, boolean flag1, String s2)
    {
        l.b(new cs(l, v(), l.c(), f.j(), ca, flag, s1, flag1, s2));
    }

    final void a(com.paypal.android.sdk.payments.aE ae)
    {
        h.a(ae);
    }

    final void a(aG ag, boolean flag)
    {
        if (flag)
        {
            e.c = null;
        }
        for (m = ag; g || e.a();)
        {
            return;
        }

        g = true;
        a(cE.b);
        l.b(new cw(f.b(), l, v(), f.j()));
    }

    public final void a(String s1, String s2)
    {
        b(new co(l, v(), s1, s2));
    }

    final void a(List list)
    {
        l.b(new cl(l, v(), l.c(), f.j(), e.f.b(), e.j, list));
    }

    protected final boolean a(com.paypal.android.sdk.payments.aJ aj)
    {
        if (w())
        {
            return true;
        } else
        {
            p.add(aj);
            return false;
        }
    }

    protected final aB b()
    {
        return l;
    }

    final void b(com.paypal.android.sdk.payments.aE ae)
    {
        i.a(ae);
    }

    protected final bB c()
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
        return f.j();
    }

    final void g()
    {
        p();
        h();
        o.a();
        q();
    }

    final void h()
    {
        e.h = null;
        bC.a(f.b());
        e.e = null;
        e.d = null;
    }

    final boolean i()
    {
        return e.a();
    }

    final boolean j()
    {
        bB bb = e;
        return bb.h != null && bb.h.b();
    }

    final boolean k()
    {
        return e.f != null && e.j != null;
    }

    final void l()
    {
        i.b();
    }

    final void m()
    {
        h.b();
    }

    final void n()
    {
        m = null;
    }

    final void o()
    {
        l.b(new cq(l, v(), l.c(), e.c.a(), f.j()));
    }

    public final IBinder onBind(Intent intent)
    {
        (new StringBuilder("onBind(")).append(b(intent)).append(")");
        if (!w())
        {
            if (s == null)
            {
                a(intent);
            } else
            {
                a(s);
            }
        }
        return u;
    }

    public final void onCreate()
    {
        Log.w("paypal.sdk", (new StringBuilder()).append(com/paypal/android/sdk/payments/PayPalService.getSimpleName()).append(" created. ").append(v().b()).toString());
        new l();
        n = new b(this, "AndroidBasePrefs");
        bV.a(n);
        bY.a(n);
        com.paypal.android.sdk.e.a(a, this, n, "2.10.0");
        IntentFilter intentfilter = new IntentFilter();
        intentfilter.addAction("com.paypal.android.sdk.clearAllUserData");
        D.a(this).a(t, intentfilter);
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
            D.a(this).a(t);
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
        if (!w())
        {
            (new cQ(this)).a();
            if (intent == null || intent.getExtras() == null)
            {
                throw new RuntimeException("Service extras required. Please see the docs.");
            }
            a(intent);
        }
        if (p.size() > 0)
        {
            for (intent = p.iterator(); intent.hasNext(); ((com.paypal.android.sdk.payments.aJ)intent.next()).a()) { }
            p.clear();
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
        b = o.a(f.j());
        o.b();
        if (b != null && e.c != null)
        {
            a(e.c.a(), b.e());
            b = null;
        }
    }

    final void q()
    {
        if (f != null && f.n())
        {
            e = new bB();
            x();
        }
    }

    protected final String r()
    {
        return k;
    }

    final boolean s()
    {
        return q;
    }

    final boolean t()
    {
        return r;
    }

}
