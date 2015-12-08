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
import android.support.v4.content.LocalBroadcastManager;
import android.util.Log;
import com.paypal.android.sdk.aY;
import com.paypal.android.sdk.aq;
import com.paypal.android.sdk.ar;
import com.paypal.android.sdk.au;
import com.paypal.android.sdk.av;
import com.paypal.android.sdk.az;
import com.paypal.android.sdk.b;
import com.paypal.android.sdk.bE;
import com.paypal.android.sdk.bG;
import com.paypal.android.sdk.bH;
import com.paypal.android.sdk.bK;
import com.paypal.android.sdk.bM;
import com.paypal.android.sdk.bX;
import com.paypal.android.sdk.bc;
import com.paypal.android.sdk.be;
import com.paypal.android.sdk.bg;
import com.paypal.android.sdk.bl;
import com.paypal.android.sdk.bn;
import com.paypal.android.sdk.bo;
import com.paypal.android.sdk.bp;
import com.paypal.android.sdk.bq;
import com.paypal.android.sdk.bu;
import com.paypal.android.sdk.bx;
import com.paypal.android.sdk.bz;
import com.paypal.android.sdk.c;
import com.paypal.android.sdk.cB;
import com.paypal.android.sdk.ca;
import com.paypal.android.sdk.cb;
import com.paypal.android.sdk.cc;
import com.paypal.android.sdk.cd;
import com.paypal.android.sdk.ce;
import com.paypal.android.sdk.ci;
import com.paypal.android.sdk.cj;
import com.paypal.android.sdk.cl;
import com.paypal.android.sdk.cp;
import com.paypal.android.sdk.cq;
import com.paypal.android.sdk.d;
import com.paypal.android.sdk.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.paypal.android.sdk.payments:
//            a, d, aw, az, 
//            PayPalConfiguration, aC, k, aA, 
//            aB, ax, l, aD, 
//            ay

public final class PayPalService extends Service
{

    public static final String EXTRA_PAYPAL_CONFIGURATION = "com.paypal.android.sdk.paypalConfiguration";
    private static final String b = com/paypal/android/sdk/payments/PayPalService.getSimpleName();
    private static Intent s;
    bu a;
    private c c;
    private bn d;
    private PayPalConfiguration e;
    private boolean f;
    private a g;
    private a h;
    private k i;
    private String j;
    private ar k;
    private aA l;
    private b m;
    private h n;
    private bp o;
    private List p;
    private boolean q;
    private boolean r;
    private final BroadcastReceiver t = new aw(this);
    private final IBinder u = new com.paypal.android.sdk.payments.az(this);

    public PayPalService()
    {
        g = new a();
        h = new a();
        i = new com.paypal.android.sdk.payments.d(this);
        p = new ArrayList();
        q = true;
        r = true;
    }

    private void A()
    {
        a(new bq());
    }

    private static aq a(String s1, String s2)
    {
        aq aq1 = new aq();
        aq1.a(s1);
        aq1.b(s2);
        aq1.a(new HashMap());
        if (s2 != null)
        {
            if (!s2.startsWith("https://"))
            {
                throw new RuntimeException((new StringBuilder()).append(s2).append(" does not start with 'https://', ignoring ").append(s1).toString());
            }
            s1 = s2;
            if (!s2.endsWith("/"))
            {
                Log.w(b, (new StringBuilder()).append(s2).append(" does not end with a slash, adding one.").toString());
                s1 = (new StringBuilder()).append(s2).append("/").toString();
            }
            be be1;
            for (s2 = bl.d().iterator(); s2.hasNext(); aq1.c().put(be1.a(), (new StringBuilder()).append(s1).append(be1.c()).toString()))
            {
                be1 = (be)s2.next();
            }

        }
        return aq1;
    }

    static PayPalConfiguration a(PayPalService paypalservice)
    {
        return paypalservice.e;
    }

    static aA a(PayPalService paypalservice, aA aa)
    {
        paypalservice.l = null;
        return null;
    }

    private void a(Intent intent)
    {
        s = intent;
        (new StringBuilder("init:")).append(b(intent));
        if (e == null)
        {
            e = (PayPalConfiguration)intent.getParcelableExtra("com.paypal.android.sdk.paypalConfiguration");
            if (e == null)
            {
                throw new RuntimeException("Missing EXTRA_PAYPAL_CONFIGURATION. To avoid this error, set EXTRA_PAYPAL_CONFIGURATION in both PayPalService, and the initializing activity.");
            }
        }
        if (!e.n())
        {
            throw new RuntimeException("Service extras invalid.  Please check the docs.");
        }
        String s1 = e.b();
        Object obj;
        if (s1.equals("live"))
        {
            obj = "https://api-m.paypal.com/v1/";
        } else
        if (s1.startsWith("sandbox"))
        {
            obj = "https://api-m.sandbox.paypal.com/v1/";
        } else
        if (s1.equals("mock"))
        {
            obj = null;
        } else
        if (w() && intent.hasExtra("com.paypal.android.sdk.baseEnvironmentUrl"))
        {
            obj = intent.getStringExtra("com.paypal.android.sdk.baseEnvironmentUrl");
        } else
        {
            throw new RuntimeException((new StringBuilder("Invalid environment selected:")).append(s1).toString());
        }
        o = new bp(m, e.b(), n);
        obj = a(s1, ((String) (obj)));
        if (k == null)
        {
            int i1;
            int j1;
            boolean flag;
            boolean flag1;
            if (w() && intent.hasExtra("com.paypal.android.sdk.mockNetworkDelay"))
            {
                i1 = intent.getIntExtra("com.paypal.android.sdk.mockNetworkDelay", 500);
            } else
            {
                i1 = 500;
            }
            if (w() && intent.hasExtra("com.paypal.android.sdk.mockEnable2fa"))
            {
                flag = intent.getBooleanExtra("com.paypal.android.sdk.mockEnable2fa", false);
            } else
            {
                flag = false;
            }
            if (w() && intent.hasExtra("com.paypal.android.sdk.mock2faPhoneNumberCount"))
            {
                j1 = intent.getIntExtra("com.paypal.android.sdk.mock2faPhoneNumberCount", 1);
            } else
            {
                j1 = 1;
            }
            q = true;
            if (w() && intent.hasExtra("com.paypal.android.sdk.enableAuthenticator"))
            {
                q = intent.getBooleanExtra("com.paypal.android.sdk.enableAuthenticator", true);
            }
            if (w() && intent.hasExtra("com.paypal.android.sdk.enableAuthenticatorSecurity"))
            {
                r = intent.getBooleanExtra("com.paypal.android.sdk.enableAuthenticatorSecurity", true);
            }
            if (w() && intent.hasExtra("com.paypal.android.sdk.enableStageSsl"))
            {
                flag1 = intent.getBooleanExtra("com.paypal.android.sdk.enableStageSsl", true);
            } else
            {
                flag1 = true;
            }
            k = new ar(m, ((aq) (obj)), b());
            k.a(new bG(new aC(this, (byte)0)));
            intent = new cl(k, i1, flag, j1);
            obj = new aY(m, e.b(), b(), k, 0x15f90, b().b(), av.a(b()), flag1);
            intent = new bc(e.b(), k, intent, ((aY) (obj)));
            k.a(intent);
        }
        cq.b(e.a());
        if (d == null)
        {
            d = y();
        }
        if (!e.i())
        {
            clearAllUserData(m.f());
        }
        z();
    }

    private void a(bg bg1)
    {
        k.b(bg1);
    }

    private void a(bq bq1)
    {
        o.a(bq1);
    }

    private void a(cp cp1, boolean flag, String s1, String s2, String s3)
    {
        i.a(cp1, flag, s1, s2, s3);
    }

    static void a(PayPalService paypalservice, bg bg1)
    {
        paypalservice.d.c = null;
        (new StringBuilder()).append(bg1.o()).append(" request error");
        String s1 = bg1.q().b();
        Log.e("paypal.sdk", s1);
        paypalservice.b(cp.b, s1, bg1.k());
        if (paypalservice.l != null)
        {
            paypalservice.l.a(paypalservice.b(bg1));
            paypalservice.l = null;
        }
        paypalservice.f = false;
    }

    static void a(PayPalService paypalservice, cp cp1, boolean flag, String s1, String s2, String s3)
    {
        paypalservice.a(cp1, flag, s1, s2, null);
    }

    static boolean a(PayPalService paypalservice, boolean flag)
    {
        paypalservice.f = false;
        return false;
    }

    static aA b(PayPalService paypalservice)
    {
        return paypalservice.l;
    }

    private aB b(bg bg1)
    {
        return new aB(this, bg1.q().b(), bg1.s(), bg1.q().a());
    }

    static aB b(PayPalService paypalservice, bg bg1)
    {
        return paypalservice.b(bg1);
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

    private void b(cp cp1, String s1, String s2)
    {
        a(cp1, false, s1, s2, null);
    }

    static a c(PayPalService paypalservice)
    {
        return paypalservice.g;
    }

    static void c(PayPalService paypalservice, bg bg1)
    {
        String s1 = bg1.q().b();
        Log.e("paypal.sdk", s1);
        paypalservice.b(cp.c, s1, bg1.k());
        paypalservice.h.a(paypalservice.b(bg1));
    }

    public static void clearAllUserData(Context context)
    {
        Intent intent = new Intent("com.paypal.android.sdk.clearAllUserData");
        try
        {
            LocalBroadcastManager.a(context).a(intent);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            (new StringBuilder("ignoring:")).append(context.getMessage());
        }
    }

    static void d(PayPalService paypalservice)
    {
        paypalservice.A();
    }

    static a e(PayPalService paypalservice)
    {
        return paypalservice.h;
    }

    static h f(PayPalService paypalservice)
    {
        return paypalservice.n;
    }

    static bp g(PayPalService paypalservice)
    {
        return paypalservice.o;
    }

    static String v()
    {
        return b;
    }

    private static boolean w()
    {
        return true;
    }

    private boolean x()
    {
        return e != null && d != null;
    }

    private static bn y()
    {
        return new bn();
    }

    private void z()
    {
        a(new ax(this), false);
    }

    protected final String a()
    {
        return k.e();
    }

    final void a(int i1)
    {
        k.b(new cd(k, b(), k.c(), e.j(), d.j, (String)(new ArrayList(d.g.a.keySet())).get(i1)));
    }

    final void a(bM bm, String s1, boolean flag, String s2, boolean flag1, String s3)
    {
        k.b(new ce(k, b(), k.c(), e.j(), bm, s1, d.j, flag, s2, flag1, s3));
    }

    final void a(bM bm, boolean flag, String s1, boolean flag1, String s2)
    {
        k.b(new ce(k, b(), k.c(), e.j(), bm, flag, s1, flag1, s2));
    }

    final void a(cp cp1)
    {
        a(cp1, false, null, ((String) (null)), null);
    }

    final void a(cp cp1, Boolean boolean1)
    {
        a(cp1, boolean1.booleanValue(), null, ((String) (null)), null);
    }

    final void a(cp cp1, Boolean boolean1, String s1)
    {
        a(cp1, boolean1.booleanValue(), null, s1, null);
    }

    final void a(cp cp1, String s1)
    {
        a(cp1, false, null, s1, null);
    }

    final void a(cp cp1, String s1, String s2)
    {
        a(cp1, false, null, s1, s2);
    }

    final void a(aA aa, boolean flag)
    {
        if (flag)
        {
            d.c = null;
        }
        for (l = aa; f || d.a();)
        {
            return;
        }

        f = true;
        a(cp.b);
        k.b(new ci(e.b(), k, b(), e.j()));
    }

    final void a(ay ay)
    {
        g.a(ay);
    }

    final void a(List list)
    {
        k.b(new bX(k, b(), k.c(), e.j(), d.f.b(), d.j, list));
    }

    protected final boolean a(aD ad)
    {
        if (x())
        {
            return true;
        } else
        {
            p.add(ad);
            return false;
        }
    }

    final c b()
    {
        if (c == null)
        {
            c = new l();
        }
        return c;
    }

    final void b(ay ay)
    {
        h.a(ay);
    }

    protected final ar c()
    {
        return k;
    }

    protected final bn d()
    {
        return d;
    }

    public final void doDeleteTokenizedCreditCard(String s1, String s2)
    {
        a(new ca(k, b(), s1, s2));
    }

    public final void doTrackingRequest(au au1, String s1)
    {
        if (au1.e)
        {
            a(new cj(k, b(), au1));
            return;
        } else
        {
            a(new cb(k, b(), au1, s1));
            return;
        }
    }

    final PayPalConfiguration e()
    {
        return e;
    }

    protected final String f()
    {
        return e.b();
    }

    protected final String g()
    {
        return e.j();
    }

    final void h()
    {
        q();
        i();
        A();
    }

    final void i()
    {
        d.h = null;
        bo.a(e.b());
        d.e = null;
        d.d = null;
    }

    final boolean j()
    {
        return d.a();
    }

    final boolean k()
    {
        bn bn1 = d;
        return bn1.h != null && bn1.h.b();
    }

    final boolean l()
    {
        return d.f != null;
    }

    final void m()
    {
        h.b();
    }

    final void n()
    {
        g.b();
    }

    final void o()
    {
        l = null;
    }

    public final IBinder onBind(Intent intent)
    {
        (new StringBuilder("onBind(")).append(b(intent)).append(")");
        if (!x())
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
        Log.w("paypal.sdk", (new StringBuilder()).append(com/paypal/android/sdk/payments/PayPalService.getSimpleName()).append(" created. ").append(b().b()).toString());
        new l();
        m = new b(this, "AndroidBasePrefs");
        bH.a(m);
        bK.a(m);
        n = new h((new StringBuilder()).append(bK.b(m)).append(bH.b()).toString());
        com.paypal.android.sdk.d.a(this, m, "2.9.0");
        IntentFilter intentfilter = new IntentFilter();
        intentfilter.addAction("com.paypal.android.sdk.clearAllUserData");
        try
        {
            LocalBroadcastManager.a(this).a(t, intentfilter);
            return;
        }
        catch (Throwable throwable)
        {
            (new StringBuilder("ignoring:")).append(throwable.getMessage());
        }
    }

    public final void onDestroy()
    {
        if (k != null)
        {
            k.a();
            k.b();
            k = null;
        }
        try
        {
            LocalBroadcastManager.a(this).a(t);
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
        (new cB(this)).a();
        if (intent == null || intent.getExtras() == null)
        {
            throw new RuntimeException("Service extras required. Please see the docs.");
        }
        if (!x())
        {
            a(intent);
        }
        j = intent.getComponent().getPackageName();
        a(cp.a);
        if (p.size() > 0)
        {
            for (intent = p.iterator(); intent.hasNext(); ((aD)intent.next()).a()) { }
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
        k.b(new cc(k, b(), k.c(), d.c.a(), e.j()));
    }

    final void q()
    {
        a = o.a(e.j());
        o.a(new bu(), null);
        if (a != null && d.c != null)
        {
            doDeleteTokenizedCreditCard(d.c.a(), a.e());
            a = null;
        }
    }

    final void r()
    {
        if (e != null && e.n())
        {
            d = y();
            z();
        }
    }

    protected final String s()
    {
        return j;
    }

    final boolean t()
    {
        return q;
    }

    final boolean u()
    {
        return r;
    }

}
