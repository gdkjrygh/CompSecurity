// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy;

import a.a.aa;
import a.a.ab;
import a.a.ac;
import a.a.ag;
import a.a.ah;
import a.a.ai;
import a.a.ak;
import a.a.ap;
import a.a.aq;
import a.a.at;
import a.a.au;
import a.a.ax;
import a.a.ay;
import a.a.ba;
import a.a.bd;
import a.a.be;
import a.a.bn;
import a.a.bs;
import a.a.bt;
import a.a.bu;
import a.a.cj;
import a.a.cy;
import a.a.db;
import a.a.dd;
import a.a.df;
import a.a.dj;
import a.a.dm;
import a.a.dn;
import a.a.do;
import a.a.dp;
import a.a.e;
import a.a.fm;
import a.a.ga;
import a.a.gy;
import a.a.gz;
import a.a.h;
import a.a.ha;
import a.a.hd;
import a.a.he;
import a.a.hg;
import a.a.hh;
import a.a.hi;
import a.a.hm;
import a.a.hn;
import a.a.ho;
import a.a.hp;
import a.a.ij;
import a.a.ik;
import a.a.iv;
import a.a.j;
import a.a.jd;
import a.a.js;
import a.a.jt;
import a.a.kg;
import a.a.ki;
import a.a.p;
import a.a.q;
import a.a.r;
import a.a.s;
import a.a.t;
import a.a.u;
import a.a.v;
import a.a.w;
import a.a.x;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.view.ViewTreeObserver;
import com.amazon.device.messaging.ADM;
import com.appboy.a.b;
import com.appboy.c.c;
import com.appboy.f.d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

// Referenced classes of package com.appboy:
//            f, g, e, i, 
//            h

public final class a
{

    private static volatile boolean A = false;
    private static final String e;
    private static final Set f = fm.a("AED", "AFN", "ALL", "AMD", "ANG", "AOA", new String[] {
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
    private static final Set g = fm.a("android.permission.ACCESS_NETWORK_STATE", "android.permission.INTERNET");
    private static volatile a h = null;
    private static final Object x = new Object();
    private static volatile g y;
    private static volatile i z;
    private com.appboy.h B;
    volatile dn a;
    public volatile db b;
    volatile df c;
    final b d;
    private final Context i;
    private final hn j;
    private final w k;
    private volatile com.appboy.e l;
    private volatile ga m;
    private volatile aa n;
    private volatile ThreadPoolExecutor o;
    private volatile at p;
    private final kg q;
    private bd r;
    private final aq s;
    private final ax t;
    private final ap u = null;
    private final Object v;
    private final Object w;

    private a(Context context)
    {
        v = new Object();
        w = new Object();
        long l1 = System.nanoTime();
        i = context.getApplicationContext();
        q = new kg(i);
        d = new b(i);
        s = new aq(i);
        ThreadPoolExecutor threadpoolexecutor = new ThreadPoolExecutor(4, 8, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue(10));
        k = new w(threadpoolexecutor);
        int i1 = Math.min((int)Runtime.getRuntime().maxMemory() / 32, 0x100000);
        String.format("Setting maximum in-memory image cache size to %d bytes.", new Object[] {
            Integer.valueOf(i1)
        });
        Object obj = new hp(i);
        if (((hp) (obj)).c != null || ((hp) (obj)).d != null)
        {
            js.c("threadPoolSize(), threadPriority() and tasksProcessingOrder() calls can overlap taskExecutor() and taskExecutorForCachedImages() calls.", new Object[0]);
        }
        obj.h = 3;
        obj.i = true;
        context = new he();
        if (((hp) (obj)).o != null)
        {
            js.c("discCache() and discCacheFileNameGenerator() calls overlap each other", new Object[0]);
        }
        obj.p = context;
        if (((hp) (obj)).o != null || ((hp) (obj)).l > 0)
        {
            js.c("discCache(), discCacheSize() and discCacheFileCount calls overlap each other", new Object[0]);
        }
        obj.l = 0;
        obj.m = 50;
        if (i1 <= 0)
        {
            throw new IllegalArgumentException("memoryCacheSize must be a positive number");
        }
        if (((hp) (obj)).n != null)
        {
            js.c("memoryCache() and memoryCacheSize() calls overlap each other", new Object[0]);
        }
        obj.k = i1;
        i1 = ik.b;
        if (((hp) (obj)).c != null || ((hp) (obj)).d != null)
        {
            js.c("threadPoolSize(), threadPriority() and tasksProcessingOrder() calls can overlap taskExecutor() and taskExecutorForCachedImages() calls.", new Object[0]);
        }
        obj.j = i1;
        context = new hm();
        context.h = true;
        context.i = true;
        obj.s = context.a();
        if (((hp) (obj)).c == null)
        {
            obj.c = hi.a(((hp) (obj)).g, ((hp) (obj)).h, ((hp) (obj)).j);
        } else
        {
            obj.e = true;
        }
        if (((hp) (obj)).d == null)
        {
            obj.d = hi.a(((hp) (obj)).g, ((hp) (obj)).h, ((hp) (obj)).j);
        } else
        {
            obj.f = true;
        }
        if (((hp) (obj)).o == null)
        {
            if (((hp) (obj)).p == null)
            {
                obj.p = new hd();
            }
            context = ((hp) (obj)).b;
            a.a.hc hc = ((hp) (obj)).p;
            int j1 = ((hp) (obj)).l;
            int k1 = ((hp) (obj)).m;
            long l2;
            if (j1 > 0)
            {
                context = new gz(jt.a(context), hc, j1);
            } else
            if (k1 > 0)
            {
                context = new gy(jt.a(context), hc, k1);
            } else
            {
                context = new ha(jt.a(context, true), hc);
            }
            obj.o = context;
        }
        if (((hp) (obj)).n == null)
        {
            k1 = ((hp) (obj)).k;
            j1 = k1;
            if (k1 == 0)
            {
                j1 = (int)(Runtime.getRuntime().maxMemory() / 8L);
            }
            obj.n = new hh(j1);
        }
        if (((hp) (obj)).i)
        {
            obj.n = new hg(((hp) (obj)).n, new ij());
        }
        if (((hp) (obj)).q == null)
        {
            obj.q = new jd(((hp) (obj)).b);
        }
        if (((hp) (obj)).r == null)
        {
            obj.r = new iv(((hp) (obj)).t);
        }
        if (((hp) (obj)).s == null)
        {
            obj.s = (new hm()).a();
        }
        context = new ho(((hp) (obj)), (byte)0);
        j = hn.a();
        j.a(context);
        r = new be(i, d);
        if (ax.a(i, d))
        {
            com.appboy.f.a.b(e, "Google Cloud Messaging found.  Setting up Google Cloud Messaging");
            t = new ax(i, r);
            obj = d.l();
            if (d.c() && obj != null)
            {
                context = t;
                if (((ax) (context)).c.a() != null)
                {
                    com.appboy.f.a.c(ax.a, "The device is already registered with the GCM server and is eligible to receive GCM messages.");
                } else
                {
                    Object obj1 = ax.a;
                    obj = dp.a().b().a(Arrays.asList(new String[] {
                        obj
                    }));
                    obj1 = new Intent("com.google.android.c2dm.intent.REGISTER");
                    ((Intent) (obj1)).setPackage("com.google.android.gsf");
                    ((Intent) (obj1)).putExtra("app", PendingIntent.getBroadcast(((ax) (context)).b, 0, new Intent(), 0));
                    ((Intent) (obj1)).putExtra("sender", ((String) (obj)));
                    ((ax) (context)).b.startService(((Intent) (obj1)));
                }
            }
        } else
        {
            t = null;
        }
        if (!ap.a(i) || ax.a(i, d)) goto _L2; else goto _L1
_L1:
        com.appboy.f.a.b(e, "Amazon Device Messaging found.  Setting up Amazon Device Messaging");
        u = new ap(i, r);
        context = u;
        if (((ap) (context)).b.a() == null) goto _L4; else goto _L3
_L3:
        com.appboy.f.a.b(ap.c, "The device is already registered with the ADM server and is eligible to receive ADM messages.");
        com.appboy.f.a.b(ap.c, (new StringBuilder("ADM registration id: ")).append(((ap) (context)).b.a()).toString());
        ((ap) (context)).b.a(((ap) (context)).b.a());
_L6:
        if (t == null && u == null)
        {
            com.appboy.f.a.d(e, "Did not find support for Google Cloud Messaging or Amazon Device Messaging");
        }
        c = new df(i, d.b().toString());
        context = new dn(i, q, d, k, s, r, c, A);
        a(context);
        a(((dn) (context)).i, ((dn) (context)).d);
        threadpoolexecutor.execute(new a.a.a(this));
        l2 = System.nanoTime();
        String.format("Appboy loaded in %d ms.", new Object[] {
            Long.valueOf(TimeUnit.MILLISECONDS.convert(l2 - l1, TimeUnit.NANOSECONDS))
        });
        return;
_L4:
        context = new ADM(((ap) (context)).a);
        if (context.isSupported())
        {
            com.appboy.f.a.b(ap.c, "Registering with ADM server...");
            context.startRegister();
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (true) goto _L6; else goto _L5
_L5:
    }

    public static Uri a(Uri uri)
    {
        Object obj = x;
        obj;
        JVM INSTR monitorenter ;
        Object obj1 = y;
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_42;
        }
        obj1 = y.a();
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_42;
        }
        return ((Uri) (obj1));
        Exception exception;
        exception;
        com.appboy.f.a.d(e, "Caught exception trying to get an Appboy API endpoint from the AppboyEndpointProvider.  Using the original URI");
        obj;
        JVM INSTR monitorexit ;
        return uri;
        uri;
        throw uri;
    }

    public static a a(Context context)
    {
        if (h != null) goto _L2; else goto _L1
_L1:
        com/appboy/a;
        JVM INSTR monitorenter ;
        if (h == null)
        {
            h = new a(context);
        }
        com/appboy/a;
        JVM INSTR monitorexit ;
_L2:
        return h;
        context;
        throw context;
    }

    private void a(dd dd, ki ki1)
    {
        o.execute(new x(this, dd, ki1));
    }

    private void a(dn dn1)
    {
        Object obj = v;
        obj;
        JVM INSTR monitorenter ;
        Object obj1 = w;
        obj1;
        JVM INSTR monitorenter ;
        Object obj3;
        a = dn1;
        m = dn1.j;
        p = dn1.e;
        l = new com.appboy.e(dn1.a, dn1.e, q.a(), dn1.k, c);
        a.a.o o1 = dn1.g;
        obj3 = dn1.c;
        ((w) (obj3)).a(new q(o1), a/a/ab);
        ((w) (obj3)).a(new r(o1), a/a/ai);
        ((w) (obj3)).a(new s(o1), a/a/ah);
        ((w) (obj3)).a(new t(o1), a/a/ag);
        ((w) (obj3)).a(new u(o1), java/lang/Throwable);
        ((w) (obj3)).a(new v(o1), a/a/ak);
        ((w) (obj3)).a(new p(o1), a/a/ac);
        obj3 = dn1.d;
        Object obj2 = ((ki) (obj3)).d;
        obj2;
        JVM INSTR monitorenter ;
        if (!((ki) (obj3)).f) goto _L2; else goto _L1
_L1:
        obj3 = ki.a;
_L3:
        n = dn1.c;
        o = dn1.h;
        b = dn1.f;
        obj1;
        JVM INSTR monitorexit ;
        obj;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (((ki) (obj3)).g != null)
        {
            ((ki) (obj3)).g.start();
        }
        obj3.f = true;
        obj2;
        JVM INSTR monitorexit ;
          goto _L3
        dn1;
        obj2;
        JVM INSTR monitorexit ;
        throw dn1;
        dn1;
        obj1;
        JVM INSTR monitorexit ;
        throw dn1;
        dn1;
        obj;
        JVM INSTR monitorexit ;
        throw dn1;
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

    public static void a(a a1)
    {
        boolean flag1 = false;
        Iterator iterator = g.iterator();
        boolean flag = true;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            String s1 = (String)iterator.next();
            if (a1.i.checkCallingOrSelfPermission(s1) == -1)
            {
                com.appboy.f.a.d(e, String.format("The Appboy SDK requires the permission %s. Check your app manifest.", new Object[] {
                    s1
                }));
                flag = false;
            }
        } while (true);
        if (a1.d.b().toString().equals(""))
        {
            com.appboy.f.a.d(e, "The Appboy SDK requires a non-empty API key. Check your appboy.xml.");
            flag = flag1;
        }
        if (!flag)
        {
            com.appboy.f.a.d(e, "The Appboy SDK is not integrated correctly. Please visit http://documentation.appboy.com/SDK_Integration/Android");
        }
    }

    private void a(Throwable throwable)
    {
        try
        {
            n.a(throwable, java/lang/Throwable);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Throwable throwable)
        {
            com.appboy.f.a.c(e, "Failed to log throwable.", throwable);
        }
    }

    public static w b(a a1)
    {
        return a1.k;
    }

    public static Uri b(Uri uri)
    {
        Object obj = x;
        obj;
        JVM INSTR monitorenter ;
        Object obj1 = y;
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_42;
        }
        obj1 = y.b();
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_42;
        }
        return ((Uri) (obj1));
        Exception exception;
        exception;
        com.appboy.f.a.d(e, "Caught exception trying to get an Appboy resource endpoint from the AppboyEndpointProvider.  Using the original URI");
        obj;
        JVM INSTR monitorexit ;
        return uri;
        uri;
        throw uri;
    }

    public static hn c(a a1)
    {
        return a1.j;
    }

    public static i h()
    {
        return z;
    }

    public static String i()
    {
        return e;
    }

    public final void a(com.appboy.c.b b1)
    {
        try
        {
            k.a(b1, com/appboy/c/c);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.appboy.c.b b1)
        {
            com.appboy.f.a.b(e, "Failed to add subscriber to new in-app messages.", b1);
        }
        a(((Throwable) (b1)));
    }

    public final void a(com.appboy.c.b b1, Class class1)
    {
        try
        {
            k.b(b1, class1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.appboy.c.b b1)
        {
            com.appboy.f.a.b(e, (new StringBuilder("Failed to remove ")).append(class1.getName()).append(" subscriber.").toString(), b1);
        }
        a(((Throwable) (b1)));
    }

    public final boolean a()
    {
        try
        {
            p.a(bu.e());
        }
        catch (Exception exception)
        {
            com.appboy.f.a.b(e, "Failed to log that the feed was displayed.", exception);
            a(((Throwable) (exception)));
            return false;
        }
        return true;
    }

    public final boolean a(Activity activity)
    {
        boolean flag = false;
        Object obj = w;
        obj;
        JVM INSTR monitorenter ;
        boolean flag1;
        bs bs1 = p.b.c();
        at at1 = p;
        bn bn1 = at1.a();
        at1.f = activity.getClass();
        flag1 = bn1.d.equals(bs1);
        if (!flag1)
        {
            flag = true;
        }
        obj;
        JVM INSTR monitorexit ;
        return flag;
        activity;
        com.appboy.f.a.b(e, "Failed to open session.", activity);
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
        synchronized (w)
        {
            flag = a(s1, ((com.appboy.d.b.a) (null)));
        }
        return flag;
    }

    public final boolean a(String s1, com.appboy.d.b.a a1)
    {
        Object obj = w;
        obj;
        JVM INSTR monitorenter ;
        String s2 = s1;
        if (!dm.c(s1))
        {
            break MISSING_BLOCK_LABEL_35;
        }
        s2 = s1;
        com.appboy.f.a.c(e, "The custom event name cannot be null or contain only whitespaces. Ignoring custom event.");
        obj;
        JVM INSTR monitorexit ;
        return false;
        s2 = s1;
        if (!c.f().contains(s1))
        {
            break MISSING_BLOCK_LABEL_87;
        }
        s2 = s1;
        com.appboy.f.a.c(e, String.format("The custom event is a blacklisted custom event: %s. Ignoring custom event.", new Object[] {
            s1
        }));
        obj;
        JVM INSTR monitorexit ;
        return false;
        s1;
        throw s1;
        s2 = s1;
        s1 = com.appboy.f.d.b(s1);
        s2 = s1;
        at at1 = p;
        s2 = s1;
        JSONObject jsonobject = new JSONObject();
        s2 = s1;
        jsonobject.put("n", dm.a(s1));
        if (a1 == null)
        {
            break MISSING_BLOCK_LABEL_156;
        }
        s2 = s1;
        if (a1.b() <= 0)
        {
            break MISSING_BLOCK_LABEL_156;
        }
        s2 = s1;
        jsonobject.put("p", a1.c());
        s2 = s1;
        boolean flag = at1.a(new bu(j.b, jsonobject));
        obj;
        JVM INSTR monitorexit ;
        return flag;
        s1;
        com.appboy.f.a.b(e, (new StringBuilder("Failed to log custom event: ")).append(s2).toString(), s1);
        a(((Throwable) (s1)));
        obj;
        JVM INSTR monitorexit ;
        return false;
    }

    public final boolean a(String s1, String s2, boolean flag)
    {
        Object obj = w;
        obj;
        JVM INSTR monitorenter ;
        at at1 = p;
        if (s1 == null) goto _L2; else goto _L1
_L1:
        if (com.appboy.f.d.a(s1)) goto _L3; else goto _L2
_L2:
        throw new IllegalArgumentException("Reply to email address is invalid");
_L5:
        com.appboy.f.a.b(e, (new StringBuilder("Failed to submit feedback: ")).append(s2).toString(), s1);
        a(((Throwable) (s1)));
        obj;
        JVM INSTR monitorexit ;
        return false;
_L3:
        try
        {
            if (dm.c(s2))
            {
                throw new IllegalArgumentException("Feedback message cannot be null or blank");
            }
            break MISSING_BLOCK_LABEL_97;
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
        s1 = new com.appboy.d.b.c(s2, s1, flag, at1.d.c(), at1.d.a());
        at1.c.a(new cj(at1.e.a(), s1));
        obj;
        JVM INSTR monitorexit ;
        return true;
    }

    public final void b(com.appboy.c.b b1)
    {
        try
        {
            k.a(b1, com/appboy/c/a);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.appboy.c.b b1)
        {
            com.appboy.f.a.b(e, "Failed to add subscriber for feed updates.", b1);
        }
        a(b1);
    }

    public final boolean b()
    {
        try
        {
            p.a(bu.f());
        }
        catch (Exception exception)
        {
            com.appboy.f.a.b(e, "Failed to log that feedback was displayed.", exception);
            a(exception);
            return false;
        }
        return true;
    }

    public final boolean b(Activity activity)
    {
        Object obj = w;
        obj;
        JVM INSTR monitorenter ;
        at at1 = p;
        if (at1.f == null || activity.getClass().equals(at1.f)) goto _L2; else goto _L1
_L1:
        activity = at.a;
        activity = null;
_L4:
        if (activity == null)
        {
            break; /* Loop/switch isn't completed */
        }
        com.appboy.f.a.b(e, (new StringBuilder("Closed session with ID: ")).append(((bn) (activity)).d).toString());
        obj;
        JVM INSTR monitorexit ;
        return true;
_L2:
        activity = at1.b.b();
        if (true) goto _L4; else goto _L3
_L3:
        obj;
        JVM INSTR monitorexit ;
        return false;
        activity;
        com.appboy.f.a.b(e, "Failed to close session.", activity);
        a(activity);
        obj;
        JVM INSTR monitorexit ;
        return false;
        activity;
        throw activity;
    }

    public final boolean b(String s1)
    {
        if (!dm.c(s1))
        {
            break MISSING_BLOCK_LABEL_19;
        }
        com.appboy.f.a.c(e, "Campaign ID cannot be null or blank");
        return false;
        try
        {
            at at1 = p;
            JSONObject jsonobject = new JSONObject();
            jsonobject.put("cid", s1);
            at1.a(new bu(j.d, jsonobject));
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            com.appboy.f.a.b(e, "Failed to log opened push.", s1);
            a(s1);
            return false;
        }
        return true;
    }

    public final com.appboy.e c(String s1)
    {
        obj;
        JVM INSTR monitorenter ;
label0:
        {
            com.appboy.e e1;
            synchronized (v)
            {
                if (!dm.b(s1))
                {
                    break label0;
                }
                com.appboy.f.a.d(e, "ArgumentException: userId passed to changeUser was null or empty.  The current user will remain the active user.");
                e1 = l;
            }
            return e1;
        }
        Object obj1 = l.a();
        if (!((String) (obj1)).equals(s1)) goto _L2; else goto _L1
_L1:
        com.appboy.f.a.b(e, String.format("Received request to change current user %s to the same user id. Doing nothing.", new Object[] {
            s1
        }));
_L5:
        obj;
        JVM INSTR monitorexit ;
        return l;
_L2:
        boolean flag = ((String) (obj1)).equals("");
        if (!flag) goto _L4; else goto _L3
_L3:
        com.appboy.e e2;
        com.appboy.f.a.b(e, String.format("Changing anonymous user to %s.", new Object[] {
            s1
        }));
        Object obj2 = q;
        dm.a(s1);
        obj2 = ((kg) (obj2)).a.edit();
        ((android.content.SharedPreferences.Editor) (obj2)).putString("default_user", s1);
        ((android.content.SharedPreferences.Editor) (obj2)).putString("last_user", s1);
        ((android.content.SharedPreferences.Editor) (obj2)).commit();
        e2 = l;
        Object obj3 = e2.a;
        obj3;
        JVM INSTR monitorenter ;
        if (!e2.b.equals("") && !e2.b.equals(s1))
        {
            throw new IllegalArgumentException(String.format("setExternalId can not be used to change the external ID of a UserCache from a non-empty value to a new value. Was: [%s], tried to change to: [%s]", new Object[] {
                e2.b, s1
            }));
        }
        break MISSING_BLOCK_LABEL_284;
        obj1;
        obj3;
        JVM INSTR monitorexit ;
        throw obj1;
        obj1;
        com.appboy.f.a.b(e, (new StringBuilder("Failed to set external id to: ")).append(s1).toString(), ((Throwable) (obj1)));
        a(((Throwable) (obj1)));
          goto _L5
        s1;
        throw s1;
        e2.b = s1;
        obj3;
        JVM INSTR monitorexit ;
        m.a = s1;
_L6:
        obj3 = p;
        obj3.f = null;
        ((at) (obj3)).b.d();
        obj3 = q;
        dm.a(s1);
        obj3 = ((kg) (obj3)).a.edit();
        ((android.content.SharedPreferences.Editor) (obj3)).putString("last_user", s1);
        ((android.content.SharedPreferences.Editor) (obj3)).commit();
        obj3 = a;
        dn dn1 = new dn(i, q, d, k, s, r, c, A);
        a(dn1);
        a(dn1.i, dn1.d);
        a.b.c();
        p.a();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_585;
        }
        obj1 = p;
        JSONObject jsonobject = new JSONObject();
        jsonobject.put("new", s1);
        ((at) (obj1)).a(new bu(j.j, jsonobject));
_L7:
        p.a(h.a);
        ((dn) (obj3)).h.execute(new do(((dn) (obj3))));
          goto _L5
_L4:
        com.appboy.f.a.b(e, String.format("Changing current user %s to new user %s.", new Object[] {
            obj1, s1
        }));
        com.appboy.c.a a1 = new com.appboy.c.a(new ArrayList(), s1, false, dj.a());
        k.a(a1, com/appboy/c/a);
          goto _L6
        at at1 = p;
        JSONObject jsonobject1 = new JSONObject();
        jsonobject1.put("old", obj1);
        jsonobject1.put("new", s1);
        at1.a(new bu(j.j, jsonobject1));
          goto _L7
    }

    public final void c()
    {
        o.execute(new ay(this));
    }

    public final void d()
    {
        Object obj = w;
        obj;
        JVM INSTR monitorenter ;
        p.a(h.a);
_L1:
        return;
        Object obj1;
        obj1;
        com.appboy.f.a.b(e, "Failed to request refresh of feed.", ((Throwable) (obj1)));
        a(((Throwable) (obj1)));
          goto _L1
        obj1;
        throw obj1;
    }

    public final void d(String s1)
    {
        try
        {
            r.a(s1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            com.appboy.f.a.b(e, "Failed to set the registration ID.", s1);
        }
        a(s1);
    }

    public final void e()
    {
        Object obj = w;
        obj;
        JVM INSTR monitorenter ;
        p.a(h.b);
_L1:
        return;
        Object obj1;
        obj1;
        com.appboy.f.a.b(e, "Failed to request in-app message refresh.", ((Throwable) (obj1)));
        a(((Throwable) (obj1)));
          goto _L1
        obj1;
        throw obj1;
    }

    public final void f()
    {
        try
        {
            r.b();
            return;
        }
        catch (Exception exception)
        {
            com.appboy.f.a.b(e, "Failed to unset the registration ID.", exception);
            a(exception);
            return;
        }
    }

    public final com.appboy.h g()
    {
        return B;
    }

    static 
    {
        e = String.format("%s.%s", new Object[] {
            f.a, com/appboy/a.getName()
        });
    }
}
