// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.view.ViewTreeObserver;
import bo.app.ac;
import bo.app.ap;
import bo.app.aq;
import bo.app.ar;
import bo.app.as;
import bo.app.at;
import bo.app.au;
import bo.app.av;
import bo.app.aw;
import bo.app.az;
import bo.app.ba;
import bo.app.bb;
import bo.app.be;
import bo.app.bf;
import bo.app.bg;
import bo.app.bi;
import bo.app.bn;
import bo.app.bo;
import bo.app.br;
import bo.app.bs;
import bo.app.bw;
import bo.app.bz;
import bo.app.cc;
import bo.app.cd;
import bo.app.cm;
import bo.app.cr;
import bo.app.cs;
import bo.app.ct;
import bo.app.dl;
import bo.app.ea;
import bo.app.ec;
import bo.app.ee;
import bo.app.eg;
import bo.app.el;
import bo.app.eq;
import bo.app.er;
import bo.app.es;
import bo.app.ev;
import bo.app.gr;
import bo.app.h;
import bo.app.ic;
import bo.app.id;
import bo.app.ie;
import bo.app.ig;
import bo.app.ih;
import bo.app.ij;
import bo.app.ik;
import bo.app.il;
import bo.app.ip;
import bo.app.iq;
import bo.app.ir;
import bo.app.is;
import bo.app.jm;
import bo.app.jn;
import bo.app.jy;
import bo.app.kf;
import bo.app.ku;
import bo.app.kv;
import bo.app.m;
import bo.app.o;
import bo.app.z;
import com.amazon.device.messaging.ADM;
import com.appboy.a.b;
import com.appboy.f.d;
import com.appboy.f.e;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.appboy:
//            e, d, f, c, 
//            h, g

public final class a
    implements com.appboy.e
{

    private static volatile com.appboy.h A;
    private static volatile boolean B = false;
    private static final String j;
    private static final Set k = gr.a("AED", "AFN", "ALL", "AMD", "ANG", "AOA", new String[] {
        "ARS", "AUD", "AWG", "AZN", "BAM", "BBD", "BDT", "BGN", "BHD", "BIF", 
        "BMD", "BND", "BOB", "BRL", "BSD", "BTC", "BTN", "BWP", "BYR", "BZD", 
        "CAD", "CDF", "CHF", "CLF", "CLP", "CNY", "COP", "CRC", "CUC", "CUP", 
        "CVE", "CZK", "DJF", "DKK", "DOP", "DZD", "EEK", "EGP", "ERN", "ETB", 
        "EUR", "FJD", "FKP", "GBP", "GEL", "GGP", "GHS", "GIP", "GMD", "GNF", 
        "GTQ", "GYD", "HKD", "HNL", "HRK", "HTG", "HUF", "IDR", "ILS", "IMP", 
        "INR", "IQD", "IRR", "ISK", "JEP", "JMD", "JOD", "JPY", "KES", "KGS", 
        "KHR", "KMF", "KPW", "KRW", "KWD", "KYD", "KZT", "LAK", "LBP", "LKR", 
        "LRD", "LSL", "LTL", "LVL", "LYD", "MAD", "MDL", "MGA", "MKD", "MMK", 
        "MNT", "MOP", "MRO", "MTL", "MUR", "MVR", "MWK", "MXN", "MYR", "MZN", 
        "NAD", "NGN", "NIO", "NOK", "NPR", "NZD", "OMR", "PAB", "PEN", "PGK", 
        "PHP", "PKR", "PLN", "PYG", "QAR", "RON", "RSD", "RUB", "RWF", "SAR", 
        "SBD", "SCR", "SDG", "SEK", "SGD", "SHP", "SLL", "SOS", "SRD", "STD", 
        "SVC", "SYP", "SZL", "THB", "TJS", "TMT", "TND", "TOP", "TRY", "TTD", 
        "TWD", "TZS", "UAH", "UGX", "USD", "UYU", "UZS", "VEF", "VND", "VUV", 
        "WST", "XAF", "XAG", "XAU", "XCD", "XDR", "XOF", "XPD", "XPF", "XPT", 
        "YER", "ZAR", "ZMK", "ZMW", "ZWL"
    });
    private static final Set l = gr.a("android.permission.ACCESS_NETWORK_STATE", "android.permission.INTERNET");
    private static volatile a m = null;
    private static final Object y = new Object();
    private static volatile f z;
    public final aw a;
    public volatile ThreadPoolExecutor b;
    volatile er c;
    public volatile ec d;
    volatile eg e;
    public volatile br f;
    final b g;
    public final Object h;
    public g i;
    private final Context n;
    private final iq o;
    private volatile c p;
    private volatile h q;
    private volatile az r;
    private final m s;
    private cc t;
    private final bo u;
    private final bw v;
    private final bn w = null;
    private final Object x;

    private a(Context context)
    {
        x = new Object();
        h = new Object();
        long l1 = System.nanoTime();
        n = context.getApplicationContext();
        s = new m(n);
        g = new b(n);
        u = new bo(n);
        ThreadPoolExecutor threadpoolexecutor = new ThreadPoolExecutor(4, 8, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue(10));
        a = new aw(threadpoolexecutor);
        int i1 = Math.min((int)Runtime.getRuntime().maxMemory() / 32, 0x100000);
        String.format("Setting maximum in-memory image cache size to %d bytes.", new Object[] {
            Integer.valueOf(i1)
        });
        Object obj = new is(n);
        if (((is) (obj)).c != null || ((is) (obj)).d != null)
        {
            ku.c("threadPoolSize(), threadPriority() and tasksProcessingOrder() calls can overlap taskExecutor() and taskExecutorForCachedImages() calls.", new Object[0]);
        }
        obj.h = 3;
        obj.i = true;
        context = new ih();
        if (((is) (obj)).o != null)
        {
            ku.c("discCache() and discCacheFileNameGenerator() calls overlap each other", new Object[0]);
        }
        obj.p = context;
        if (((is) (obj)).o != null || ((is) (obj)).l > 0)
        {
            ku.c("discCache(), discCacheSize() and discCacheFileCount calls overlap each other", new Object[0]);
        }
        obj.l = 0;
        obj.m = 50;
        if (i1 <= 0)
        {
            throw new IllegalArgumentException("memoryCacheSize must be a positive number");
        }
        if (((is) (obj)).n != null)
        {
            ku.c("memoryCache() and memoryCacheSize() calls overlap each other", new Object[0]);
        }
        obj.k = i1;
        i1 = jn.b;
        if (((is) (obj)).c != null || ((is) (obj)).d != null)
        {
            ku.c("threadPoolSize(), threadPriority() and tasksProcessingOrder() calls can overlap taskExecutor() and taskExecutorForCachedImages() calls.", new Object[0]);
        }
        obj.j = i1;
        context = new ip();
        context.h = true;
        context.i = true;
        obj.s = context.a();
        if (((is) (obj)).c == null)
        {
            obj.c = il.a(((is) (obj)).g, ((is) (obj)).h, ((is) (obj)).j);
        } else
        {
            obj.e = true;
        }
        if (((is) (obj)).d == null)
        {
            obj.d = il.a(((is) (obj)).g, ((is) (obj)).h, ((is) (obj)).j);
        } else
        {
            obj.f = true;
        }
        if (((is) (obj)).o == null)
        {
            if (((is) (obj)).p == null)
            {
                obj.p = new ig();
            }
            context = ((is) (obj)).b;
            bo.app.if if1 = ((is) (obj)).p;
            int j1 = ((is) (obj)).l;
            int k1 = ((is) (obj)).m;
            long l2;
            if (j1 > 0)
            {
                context = new id(kv.a(context), if1, j1);
            } else
            if (k1 > 0)
            {
                context = new ic(kv.a(context), if1, k1);
            } else
            {
                context = new ie(kv.a(context, true), if1);
            }
            obj.o = context;
        }
        if (((is) (obj)).n == null)
        {
            k1 = ((is) (obj)).k;
            j1 = k1;
            if (k1 == 0)
            {
                j1 = (int)(Runtime.getRuntime().maxMemory() / 8L);
            }
            obj.n = new ik(j1);
        }
        if (((is) (obj)).i)
        {
            obj.n = new ij(((is) (obj)).n, new jm());
        }
        if (((is) (obj)).q == null)
        {
            obj.q = new kf(((is) (obj)).b);
        }
        if (((is) (obj)).r == null)
        {
            obj.r = new jy(((is) (obj)).t);
        }
        if (((is) (obj)).s == null)
        {
            obj.s = (new ip()).a();
        }
        context = new ir(((is) (obj)), (byte)0);
        o = iq.a();
        o.a(context);
        t = new cd(n, g);
        if (bw.a(n, g))
        {
            v = new bw(n, t);
            obj = g.l();
            if (g.c() && obj != null)
            {
                context = v;
                if (((bw) (context)).c.a() != null)
                {
                    context = bw.a;
                } else
                {
                    Object obj1 = bw.a;
                    obj = ev.a().b().a(Arrays.asList(new String[] {
                        obj
                    }));
                    obj1 = new Intent("com.google.android.c2dm.intent.REGISTER");
                    ((Intent) (obj1)).setPackage("com.google.android.gsf");
                    ((Intent) (obj1)).putExtra("app", PendingIntent.getBroadcast(((bw) (context)).b, 0, new Intent(), 0));
                    ((Intent) (obj1)).putExtra("sender", ((String) (obj)));
                    ((bw) (context)).b.startService(((Intent) (obj1)));
                }
            }
        } else
        {
            v = null;
        }
        if (!bn.a(n) || bw.a(n, g)) goto _L2; else goto _L1
_L1:
        w = new bn(n, t);
        context = w;
        if (((bn) (context)).b.a() == null) goto _L4; else goto _L3
_L3:
        obj = bn.c;
        obj = bn.c;
        (new StringBuilder("ADM registration id: ")).append(((bn) (context)).b.a());
        ((bn) (context)).b.a(((bn) (context)).b.a());
_L6:
        e = new eg(n, g.b().toString());
        context = new er(n, s, g, a, u, t, e, B);
        a(context);
        a(((er) (context)).i, ((er) (context)).d);
        threadpoolexecutor.execute(new bo.app.a(this));
        l2 = System.nanoTime();
        String.format("Appboy loaded in %d ms.", new Object[] {
            Long.valueOf(TimeUnit.MILLISECONDS.convert(l2 - l1, TimeUnit.NANOSECONDS))
        });
        return;
_L4:
        context = new ADM(((bn) (context)).a);
        if (context.isSupported())
        {
            String s1 = bn.c;
            context.startRegister();
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (true) goto _L6; else goto _L5
_L5:
    }

    public static Uri a(Uri uri)
    {
        Object obj = y;
        obj;
        JVM INSTR monitorenter ;
        Object obj1 = z;
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_32;
        }
        obj1 = z.getApiEndpoint(uri);
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_32;
        }
        return ((Uri) (obj1));
_L2:
        obj;
        JVM INSTR monitorexit ;
        return uri;
        uri;
        throw uri;
        Exception exception;
        exception;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static a a(Context context)
    {
        if (m != null) goto _L2; else goto _L1
_L1:
        com/appboy/a;
        JVM INSTR monitorenter ;
        if (m == null)
        {
            m = new a(context);
        }
        com/appboy/a;
        JVM INSTR monitorexit ;
_L2:
        return m;
        context;
        throw context;
    }

    public static void a(ViewTreeObserver viewtreeobserver, android.view.ViewTreeObserver.OnGlobalLayoutListener ongloballayoutlistener)
    {
        if (android.os.Build.VERSION.SDK_INT < 16)
        {
            viewtreeobserver.removeGlobalOnLayoutListener(ongloballayoutlistener);
            return;
        } else
        {
            viewtreeobserver.removeOnGlobalLayoutListener(ongloballayoutlistener);
            return;
        }
    }

    private void a(ee ee, o o1)
    {
        b.execute(new bo.app.b(this, ee, o1));
    }

    private void a(er er1)
    {
        Object obj = x;
        obj;
        JVM INSTR monitorenter ;
        Object obj1 = h;
        obj1;
        JVM INSTR monitorenter ;
        Object obj3;
        c = er1;
        q = er1.j;
        f = er1.e;
        p = new c(er1.a, er1.e, s.a(), er1.k, e);
        bo.app.ao ao = er1.g;
        obj3 = er1.c;
        ((aw) (obj3)).a(new aq(ao), bo/app/ba);
        ((aw) (obj3)).a(new ar(ao), bo/app/bg);
        ((aw) (obj3)).a(new as(ao), bo/app/bf);
        ((aw) (obj3)).a(new at(ao), bo/app/be);
        ((aw) (obj3)).a(new au(ao), java/lang/Throwable);
        ((aw) (obj3)).a(new av(ao), bo/app/bi);
        ((aw) (obj3)).a(new ap(ao), bo/app/bb);
        obj3 = er1.d;
        Object obj2 = ((o) (obj3)).e;
        obj2;
        JVM INSTR monitorenter ;
        if (!((o) (obj3)).f) goto _L2; else goto _L1
_L1:
        obj3 = o.a;
_L3:
        r = er1.c;
        b = er1.h;
        d = er1.f;
        obj1;
        JVM INSTR monitorexit ;
        obj;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (((o) (obj3)).g != null)
        {
            ((o) (obj3)).g.start();
        }
        obj3.f = true;
        obj2;
        JVM INSTR monitorexit ;
          goto _L3
        er1;
        obj2;
        JVM INSTR monitorexit ;
        throw er1;
        er1;
        obj1;
        JVM INSTR monitorexit ;
        throw er1;
        er1;
        obj;
        JVM INSTR monitorexit ;
        throw er1;
    }

    public static void a(a a1)
    {
        Iterator iterator = l.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            String s1 = (String)iterator.next();
            if (!com.appboy.f.d.a(a1.n, s1))
            {
                String.format("The Appboy SDK requires the permission %s. Check your app manifest.", new Object[] {
                    s1
                });
            }
        } while (true);
        a1.g.b().toString().equals("");
    }

    public static void a(f f1)
    {
        synchronized (y)
        {
            z = f1;
        }
    }

    public static Uri b(Uri uri)
    {
        Object obj = y;
        obj;
        JVM INSTR monitorenter ;
        Object obj1 = z;
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_32;
        }
        obj1 = z.getResourceEndpoint(uri);
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_32;
        }
        return ((Uri) (obj1));
_L2:
        obj;
        JVM INSTR monitorexit ;
        return uri;
        uri;
        throw uri;
        Exception exception;
        exception;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static aw b(a a1)
    {
        return a1.a;
    }

    private boolean b(String s1, String s2, BigDecimal bigdecimal, com.appboy.d.b.a a1)
    {
        Object obj = h;
        obj;
        JVM INSTR monitorenter ;
        boolean flag = eq.c(s1);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_25;
        }
        obj;
        JVM INSTR monitorexit ;
        return false;
        if (!e.h().contains(s1))
        {
            break MISSING_BLOCK_LABEL_67;
        }
        String.format("The productId is a blacklisted productId: %s, not logging in-app purchase to Appboy.", new Object[] {
            s1
        });
        obj;
        JVM INSTR monitorexit ;
        return false;
        s1;
        throw s1;
        if (s2 != null)
        {
            break MISSING_BLOCK_LABEL_93;
        }
        String.format("The currencyCode is null. Expected one of %s. Not logging in-app purchase to Appboy.", new Object[] {
            k
        });
        obj;
        JVM INSTR monitorexit ;
        return false;
        s2 = s2.trim().toUpperCase(Locale.US);
        if (k.contains(s2))
        {
            break MISSING_BLOCK_LABEL_138;
        }
        String.format("The currencyCode is invalid. Expected one of %s. Not logging in-app purchase to Appboy.", new Object[] {
            k
        });
        return false;
        if (bigdecimal != null)
        {
            break MISSING_BLOCK_LABEL_147;
        }
        obj;
        JVM INSTR monitorexit ;
        return false;
        int i1 = bigdecimal.compareTo(BigDecimal.ZERO);
        if (i1 != -1)
        {
            break MISSING_BLOCK_LABEL_167;
        }
        obj;
        JVM INSTR monitorexit ;
        return false;
        s1 = com.appboy.f.e.e(s1);
        flag = f.a(ct.a(s1, s2, bigdecimal, 1, a1));
        obj;
        JVM INSTR monitorexit ;
        return flag;
        s1;
        a(s1);
        obj;
        JVM INSTR monitorexit ;
        return false;
    }

    public static iq c(a a1)
    {
        return a1.o;
    }

    public static com.appboy.h g()
    {
        return A;
    }

    public static String h()
    {
        return j;
    }

    public final void a(com.appboy.c.b b1, Class class1)
    {
        try
        {
            a.b(b1, class1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.appboy.c.b b1)
        {
            (new StringBuilder("Failed to remove ")).append(class1.getName()).append(" subscriber.");
        }
        a(((Throwable) (b1)));
    }

    public final void a(Throwable throwable)
    {
        try
        {
            r.a(throwable, java/lang/Throwable);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Throwable throwable)
        {
            return;
        }
    }

    public final boolean a()
    {
        boolean flag;
        try
        {
            flag = f.a(ct.e());
        }
        catch (Exception exception)
        {
            a(((Throwable) (exception)));
            return false;
        }
        return flag;
    }

    public final boolean a(Activity activity)
    {
        boolean flag = false;
        Object obj = h;
        obj;
        JVM INSTR monitorenter ;
        boolean flag1;
        cr cr1 = f.b.c();
        br br1 = f;
        cm cm1 = br1.a();
        br1.f = activity.getClass();
        flag1 = cm1.d.equals(cr1);
        if (!flag1)
        {
            flag = true;
        }
        obj;
        JVM INSTR monitorexit ;
        return flag;
        activity;
        a(((Throwable) (activity)));
        obj;
        JVM INSTR monitorexit ;
        return false;
        activity;
        throw activity;
    }

    public final boolean a(String s1)
    {
        boolean flag;
        synchronized (h)
        {
            flag = a(s1, ((com.appboy.d.b.a) (null)));
        }
        return flag;
    }

    public final boolean a(String s1, com.appboy.d.b.a a1)
    {
        Object obj = h;
        obj;
        JVM INSTR monitorenter ;
        boolean flag = eq.c(s1);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_22;
        }
        obj;
        JVM INSTR monitorexit ;
        return false;
        if (!e.f().contains(s1))
        {
            break MISSING_BLOCK_LABEL_62;
        }
        String.format("The custom event is a blacklisted custom event: %s. Ignoring custom event.", new Object[] {
            s1
        });
        obj;
        JVM INSTR monitorexit ;
        return false;
        s1;
        throw s1;
        s1 = com.appboy.f.e.e(s1);
        flag = f.a(ct.a(s1, a1));
        obj;
        JVM INSTR monitorexit ;
        return flag;
        s1;
        a(((Throwable) (s1)));
        obj;
        JVM INSTR monitorexit ;
        return false;
    }

    public final boolean a(String s1, String s2)
    {
        if (eq.c(s1))
        {
            return false;
        }
        boolean flag;
        if (eq.c(s2))
        {
            break MISSING_BLOCK_LABEL_37;
        }
        flag = f.a(ct.b(s1, s2));
        return flag;
        s1;
        a(((Throwable) (s1)));
        return false;
    }

    public final boolean a(String s1, String s2, BigDecimal bigdecimal)
    {
        return b(s1, s2, bigdecimal, null);
    }

    public final boolean a(String s1, String s2, BigDecimal bigdecimal, com.appboy.d.b.a a1)
    {
        return b(s1, s2, bigdecimal, a1);
    }

    public final boolean a(String s1, String s2, boolean flag)
    {
        Object obj = h;
        obj;
        JVM INSTR monitorenter ;
        br br1 = f;
        if (s1 == null) goto _L2; else goto _L1
_L1:
        if (com.appboy.f.e.a(s1)) goto _L3; else goto _L2
_L2:
        throw new IllegalArgumentException("Reply to email address is invalid");
_L5:
        a(((Throwable) (s1)));
        obj;
        JVM INSTR monitorexit ;
        return false;
_L3:
        try
        {
            if (eq.c(s2))
            {
                throw new IllegalArgumentException("Feedback message cannot be null or blank");
            }
            break MISSING_BLOCK_LABEL_72;
        }
        // Misplaced declaration of an exception variable
        catch (String s1) { }
        finally
        {
            obj;
        }
        if (true) goto _L5; else goto _L4
_L4:
        JVM INSTR monitorexit ;
        throw s1;
        s1 = new com.appboy.d.b.e(s2, s1, flag, br1.d.c(), br1.d.a());
        br1.c.a(new dl(br1.e.a(), s1));
        obj;
        JVM INSTR monitorexit ;
        return true;
    }

    public final boolean b()
    {
        boolean flag;
        try
        {
            flag = f.a(ct.f());
        }
        catch (Exception exception)
        {
            a(exception);
            return false;
        }
        return flag;
    }

    public final boolean b(Activity activity)
    {
        Object obj = h;
        obj;
        JVM INSTR monitorenter ;
        br br1 = f;
        if (br1.f == null || activity.getClass().equals(br1.f)) goto _L2; else goto _L1
_L1:
        activity = br.a;
        activity = null;
_L4:
        if (activity == null)
        {
            break; /* Loop/switch isn't completed */
        }
        (new StringBuilder("Closed session with ID: ")).append(((cm) (activity)).d);
        obj;
        JVM INSTR monitorexit ;
        return true;
_L2:
        activity = br1.b.b();
        if (true) goto _L4; else goto _L3
_L3:
        obj;
        JVM INSTR monitorexit ;
        return false;
        activity;
        a(activity);
        obj;
        JVM INSTR monitorexit ;
        return false;
        activity;
        throw activity;
    }

    public final boolean b(String s1)
    {
        if (eq.c(s1))
        {
            return false;
        }
        boolean flag;
        try
        {
            flag = f.a(ct.b(s1));
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            a(s1);
            return false;
        }
        return flag;
    }

    public final c c(String s1)
    {
        obj;
        JVM INSTR monitorenter ;
label0:
        {
            synchronized (x)
            {
                if (!eq.b(s1))
                {
                    break label0;
                }
                s1 = p;
            }
            return s1;
        }
        String s2 = p.a();
        if (!s2.equals(s1)) goto _L2; else goto _L1
_L1:
        String.format("Received request to change current user %s to the same user id. Doing nothing.", new Object[] {
            s1
        });
_L5:
        obj;
        JVM INSTR monitorexit ;
        return p;
_L2:
        boolean flag = s2.equals("");
        if (!flag) goto _L4; else goto _L3
_L3:
        c c1;
        String.format("Changing anonymous user to %s.", new Object[] {
            s1
        });
        Object obj1 = s;
        eq.a(s1);
        obj1 = ((m) (obj1)).a.edit();
        ((android.content.SharedPreferences.Editor) (obj1)).putString("default_user", s1);
        ((android.content.SharedPreferences.Editor) (obj1)).putString("last_user", s1);
        ((android.content.SharedPreferences.Editor) (obj1)).commit();
        c1 = p;
        Object obj2 = c1.a;
        obj2;
        JVM INSTR monitorenter ;
        if (!c1.c.equals("") && !c1.c.equals(s1))
        {
            throw new IllegalArgumentException(String.format("setExternalId can not be used to change the external ID of a UserCache from a non-empty value to a new value. Was: [%s], tried to change to: [%s]", new Object[] {
                c1.c, s1
            }));
        }
        break MISSING_BLOCK_LABEL_237;
        s1;
        obj2;
        JVM INSTR monitorexit ;
        throw s1;
        s1;
        a(s1);
          goto _L5
        s1;
        throw s1;
        c1.c = s1;
        obj2;
        JVM INSTR monitorexit ;
        q.a = s1;
_L6:
        obj2 = f;
        obj2.f = null;
        ((br) (obj2)).b.e();
        obj2 = s;
        eq.a(s1);
        obj2 = ((m) (obj2)).a.edit();
        ((android.content.SharedPreferences.Editor) (obj2)).putString("last_user", s1);
        ((android.content.SharedPreferences.Editor) (obj2)).commit();
        obj2 = c;
        er er1 = new er(n, s, g, a, u, t, e, B);
        a(er1);
        a(er1.i, er1.d);
        c.b.c();
        f.a();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_503;
        }
        f.a(ct.a(s1));
_L7:
        f.a(ac.a);
        ((er) (obj2)).h.execute(new es(((er) (obj2))));
          goto _L5
_L4:
        String.format("Changing current user %s to new user %s.", new Object[] {
            s2, s1
        });
        com.appboy.c.a a1 = new com.appboy.c.a(new ArrayList(), s1, false, el.a());
        a.a(a1, com/appboy/c/a);
          goto _L6
        f.a(ct.a(s2, s1));
          goto _L7
    }

    public final void c()
    {
        Object obj = h;
        obj;
        JVM INSTR monitorenter ;
        f.a(ac.a);
_L1:
        return;
        Object obj1;
        obj1;
        a(((Throwable) (obj1)));
          goto _L1
        obj1;
        throw obj1;
    }

    public final void d()
    {
        Object obj = h;
        obj;
        JVM INSTR monitorenter ;
        f.a(ac.d);
_L1:
        return;
        Object obj1;
        obj1;
        a(((Throwable) (obj1)));
          goto _L1
        obj1;
        throw obj1;
    }

    public final void d(String s1)
    {
        if (eq.c(s1))
        {
            return;
        }
        try
        {
            t.a(s1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            a(s1);
        }
        return;
    }

    public final c e()
    {
        c c1;
        synchronized (x)
        {
            c1 = p;
        }
        return c1;
    }

    public final void f()
    {
        try
        {
            t.b();
            return;
        }
        catch (Exception exception)
        {
            a(exception);
        }
    }

    static 
    {
        j = String.format("%s.%s", new Object[] {
            d.a, com/appboy/a.getName()
        });
    }
}
