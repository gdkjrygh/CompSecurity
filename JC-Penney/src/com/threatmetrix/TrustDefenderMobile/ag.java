// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.threatmetrix.TrustDefenderMobile;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.http.AndroidHttpClient;
import android.util.Log;
import android.util.TimingLogger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

// Referenced classes of package com.threatmetrix.TrustDefenderMobile:
//            al, af, c, ak, 
//            s, l, ah, ai, 
//            ab, g, aj, y, 
//            t, v, j, h, 
//            ac, m, x, u

public class ag
{

    private static final String w = com/threatmetrix/TrustDefenderMobile/ag.getSimpleName();
    private static final Executor x = Executors.newFixedThreadPool(6);
    final al a = new al();
    AndroidHttpClient b;
    private final ArrayList c = new ArrayList();
    private final ReadWriteLock d = new ReentrantReadWriteLock();
    private final Lock e;
    private final Lock f;
    private final ReentrantLock g = new ReentrantLock();
    private u h;
    private Thread i;
    private volatile boolean j;
    private volatile AtomicBoolean k;
    private int l;
    private int m;
    private int n;
    private boolean o;
    private boolean p;
    private AtomicBoolean q;
    private CountDownLatch r;
    private final af s = new af();
    private final c t = new c();
    private Context u;
    private TimingLogger v;

    public ag()
    {
        e = d.readLock();
        f = d.writeLock();
        h = null;
        i = null;
        j = false;
        k = new AtomicBoolean(false);
        l = 0;
        m = 10000;
        n = 0;
        o = false;
        p = false;
        q = new AtomicBoolean(false);
        r = new CountDownLatch(1);
        b = null;
        u = null;
        v = null;
    }

    private ak a(boolean flag)
    {
        Object obj = ak.a;
        Iterator iterator;
        e.lockInterruptibly();
        iterator = c.iterator();
_L7:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        Object obj3 = (s)iterator.next();
        if (!k.get() && !Thread.currentThread().isInterrupted()) goto _L4; else goto _L3
_L3:
        obj = ak.h;
_L2:
        if (v != null)
        {
            v.addSplit("wait for network threads");
        }
        e.unlock();
        Object obj1 = obj;
        if (obj == ak.a)
        {
            obj1 = ak.b;
        }
        return ((ak) (obj1));
_L4:
        Object obj2 = obj;
        ((s) (obj3)).join(m);
        obj2 = obj;
        if (((s) (obj3)).getState() == Thread.State.TERMINATED) goto _L6; else goto _L5
_L5:
        obj2 = obj;
        obj = ak.c;
        if (flag)
        {
            break MISSING_BLOCK_LABEL_152;
        }
        obj2 = obj;
        b(true);
          goto _L2
        obj2 = obj;
        a(((Thread) (obj3)));
          goto _L7
        obj;
_L10:
        if (obj2 != ak.a)
        {
            break MISSING_BLOCK_LABEL_389;
        }
        obj = ak.c;
_L13:
        b(true);
        obj2 = w;
          goto _L2
_L6:
        obj2 = obj;
        l l1 = ((s) (obj3)).a();
        if (l1 == null) goto _L7; else goto _L8
_L8:
        obj2 = obj;
        obj3 = ((s) (obj3)).a().a();
        obj2 = obj;
        if (obj3 != ak.b)
        {
            break MISSING_BLOCK_LABEL_297;
        }
        obj2 = obj;
        if (l1.b() == 200)
        {
            break MISSING_BLOCK_LABEL_297;
        }
        obj2 = obj;
        obj3 = w;
        obj2 = obj;
        (new StringBuilder("Connection returned http status code:")).append(l1.b());
        obj2 = obj;
        obj3 = ak.c;
        obj = obj3;
        if (flag) goto _L7; else goto _L9
_L9:
        obj = obj3;
        b(true);
        obj = obj3;
          goto _L2
        obj2;
        obj2 = obj;
          goto _L10
        obj2 = obj;
        if (obj3 == ak.b) goto _L7; else goto _L11
_L11:
        obj2 = obj;
        String s1 = w;
        obj2 = obj;
        (new StringBuilder("Connection returned status :")).append(l1.a().a());
        obj = obj3;
        if (flag) goto _L7; else goto _L12
_L12:
        obj = obj3;
        b(true);
        obj = obj3;
          goto _L2
        Exception exception;
        exception;
        if (v != null)
        {
            v.addSplit("wait for network threads");
        }
        e.unlock();
        throw exception;
        exception = ((Exception) (obj2));
          goto _L13
    }

    static c a(ag ag1)
    {
        return ag1.t;
    }

    private s a(Runnable runnable)
    {
        while (runnable == null || k.get()) 
        {
            return null;
        }
        s s1;
        s1 = new s(runnable);
        if (!(runnable instanceof l))
        {
            break MISSING_BLOCK_LABEL_59;
        }
        f.lock();
        c.add(s1);
        f.unlock();
        s1.start();
        return s1;
        runnable;
        try
        {
            f.unlock();
            throw runnable;
        }
        // Misplaced declaration of an exception variable
        catch (Runnable runnable)
        {
            runnable = w;
        }
        return null;
    }

    private void a(Context context, boolean flag)
    {
        if (!q.compareAndSet(false, true))
        {
            context = w;
            return;
        } else
        {
            (new Thread(new ah(this, this, null, context, flag))).start();
            return;
        }
    }

    private void a(Thread thread)
    {
        x.execute(new ai(this, thread));
    }

    static TimingLogger b(ag ag1)
    {
        return ag1.v;
    }

    private void b(boolean flag)
    {
        if (flag)
        {
            break MISSING_BLOCK_LABEL_13;
        }
        e.lock();
        for (Iterator iterator = c.iterator(); iterator.hasNext(); a((s)iterator.next())) { }
        break MISSING_BLOCK_LABEL_62;
        Exception exception;
        exception;
        if (!flag)
        {
            e.unlock();
        }
        throw exception;
        if (!flag)
        {
            e.unlock();
        }
        return;
    }

    static Context c(ag ag1)
    {
        return ag1.u;
    }

    static int d(ag ag1)
    {
        return ag1.m;
    }

    static String d()
    {
        return w;
    }

    static CountDownLatch e(ag ag1)
    {
        return ag1.r;
    }

    private boolean e()
    {
        if (q.get()) goto _L2; else goto _L1
_L1:
        boolean flag1 = true;
_L4:
        return flag1;
_L2:
        String s1 = w;
        boolean flag = r.await(m, TimeUnit.MILLISECONDS);
        flag1 = flag;
        if (flag) goto _L4; else goto _L3
_L3:
        Log.e(w, "Timed out waiting for init to complete");
        return flag;
        InterruptedException interruptedexception;
        interruptedexception;
_L6:
        Log.e(w, "Waiting for init to complete interrupted", interruptedexception);
        return flag;
        interruptedexception;
        flag = false;
        if (true) goto _L6; else goto _L5
_L5:
    }

    private void f()
    {
        f.lockInterruptibly();
        c.clear();
        f.unlock();
        return;
        Exception exception;
        exception;
        f.unlock();
        throw exception;
    }

    public ak a(Context context, String s1, String s2)
    {
        return a(context, s1, s2, null, 3327);
    }

    public ak a(Context context, String s1, String s2, String s3, int i1)
    {
        if (context == null)
        {
            return ak.f;
        }
        f.lockInterruptibly();
        String s4 = w;
        (new StringBuilder("starting profile request using - 2.5-16 with options ")).append(i1);
        if (!j)
        {
            break MISSING_BLOCK_LABEL_60;
        }
        context = ak.a;
        f.unlock();
        return context;
        if (a.a(i1))
        {
            break MISSING_BLOCK_LABEL_87;
        }
        context = ak.f;
        f.unlock();
        return context;
        n = i1;
        a.a();
        s.a();
        a.a(k);
        k.set(false);
        a.a(ak.a.b());
        if (c.size() > 0)
        {
            String s5 = w;
            b(true);
        }
        c.clear();
        if (a.b(s2))
        {
            break MISSING_BLOCK_LABEL_192;
        }
        context = ak.j;
        f.unlock();
        return context;
        if (a.c(s1))
        {
            break MISSING_BLOCK_LABEL_232;
        }
        if (v != null)
        {
            v.dumpToLog();
        }
        context = ak.i;
        f.unlock();
        return context;
        j = true;
        if (o || a.b() == null)
        {
            a.a(ab.a());
        }
        if (p && o)
        {
            Log.w(w, "Previous profile used manually specified session ID, but generated session ID used this time. This is likely a bug, make sure setSessionID() is called before every profile");
        }
        o = true;
        u = context.getApplicationContext();
        a.a(u);
        context = u.getPackageName();
        a.a(s3, context);
        context = (new StringBuilder()).append(context).append("TDM").toString();
        l = 0;
        context = u.getSharedPreferences(context, 0);
        l = context.getInt("options", 0);
_L1:
        if (k.get())
        {
            throw new InterruptedException();
        }
        break MISSING_BLOCK_LABEL_442;
        context;
        if (i != null)
        {
            i.interrupt();
        }
        j = false;
        context = ak.h;
        f.unlock();
        return context;
        context;
        context = w;
          goto _L1
        context = w;
        (new StringBuilder("applying inverted saved options - ")).append(l).append(" with options, resulting in  ").append(n);
        n = n ^ l & 0x26 | l & 0x300;
        if ((n & 1) != 0)
        {
            break MISSING_BLOCK_LABEL_537;
        }
        c();
        context = ak.a(a.c());
        f.unlock();
        return context;
        i = new Thread(new g(this, null));
        i.start();
        context = ak.b;
        f.unlock();
        return context;
        context;
        f.unlock();
        throw context;
    }

    public void a()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj = w;
        if (k.compareAndSet(false, true)) goto _L2; else goto _L1
_L1:
        Log.w(w, "Cancel already happened");
_L5:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (!j)
        {
            break MISSING_BLOCK_LABEL_190;
        }
        obj = w;
        b(false);
        if (i != null)
        {
            obj = w;
            (new StringBuilder("sending interrupt to profile thread TID: ")).append(i.getId());
            i.interrupt();
        }
        obj = w;
        e.lock();
        obj = c.iterator();
_L3:
        Object obj1;
        if (!((Iterator) (obj)).hasNext())
        {
            break MISSING_BLOCK_LABEL_145;
        }
        obj1 = (s)((Iterator) (obj)).next();
        String s1 = w;
        ((s) (obj1)).join();
          goto _L3
        InterruptedException interruptedexception1;
        interruptedexception1;
        interruptedexception1 = w;
          goto _L3
        boolean flag;
        e.unlock();
        if (i == null)
        {
            break MISSING_BLOCK_LABEL_186;
        }
        flag = i.isAlive();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_186;
        }
        Exception exception;
        try
        {
            obj = w;
            i.join();
        }
        catch (InterruptedException interruptedexception) { }
        obj = w;
        f.lock();
        c.clear();
        f.unlock();
        if (true) goto _L5; else goto _L4
_L4:
        exception;
        throw exception;
        exception;
        e.unlock();
        throw exception;
        exception;
        f.unlock();
        throw exception;
    }

    final void a(ak ak1)
    {
        a.a(ak1.b());
    }

    public void a(u u1)
    {
        g.lockInterruptibly();
        h = u1;
        if (g.isHeldByCurrentThread())
        {
            g.unlock();
        }
        return;
        u1;
        if (g.isHeldByCurrentThread())
        {
            g.unlock();
        }
        throw u1;
    }

    public void a(String s1)
    {
        if (a.b() != s1)
        {
            a.a(s1);
        }
        if (a.b() != null && !a.b().isEmpty())
        {
            o = false;
            p = true;
            return;
        } else
        {
            p = false;
            return;
        }
    }

    public void b()
    {
        String s1 = w;
        a();
        s.a();
        e();
        if (b != null)
        {
            if (b.getConnectionManager() != null)
            {
                x.execute(new aj(this, b));
            }
            b = null;
        }
        t.b();
        y.b();
        q.set(false);
        r = new CountDownLatch(1);
    }

    final void c()
    {
        boolean flag1 = true;
        Object obj2;
        String s1 = w;
        obj2 = new StringBuilder("continuing profile request ");
        Object obj;
        if (q.get())
        {
            obj = "inited already";
        } else
        {
            obj = " needs init";
        }
        ((StringBuilder) (obj2)).append(((String) (obj)));
        if (v != null)
        {
            v.addSplit("after startup and thread split");
        }
        if (k.get() || Thread.currentThread().isInterrupted())
        {
            throw new InterruptedException();
        }
          goto _L1
        obj;
        obj = w;
        a.a(ak.f.b());
        if (k.get())
        {
            a.a(ak.h.b());
            Thread.interrupted();
        }
        g.lockInterruptibly();
        if (h == null) goto _L3; else goto _L2
_L2:
        if (!(h instanceof t)) goto _L5; else goto _L4
_L4:
        ((t)h).a();
_L3:
        if (g.isHeldByCurrentThread())
        {
            g.unlock();
        }
_L45:
        j = false;
        return;
_L1:
        if (q.get())
        {
            break MISSING_BLOCK_LABEL_232;
        }
        obj = w;
        obj = u;
        boolean flag;
        if ((n & 0x26) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a(((Context) (obj)), flag);
        if (e())
        {
            break MISSING_BLOCK_LABEL_441;
        }
        Log.e(w, "Timed out waiting for init thread, aborting");
        a.a(ak.f.b());
        if (k.get())
        {
            a.a(ak.h.b());
            Thread.interrupted();
        }
        g.lockInterruptibly();
        if (h == null) goto _L7; else goto _L6
_L6:
        if (!(h instanceof t)) goto _L9; else goto _L8
_L8:
        ((t)h).a();
_L7:
        if (g.isHeldByCurrentThread())
        {
            g.unlock();
        }
_L11:
        j = false;
        return;
_L9:
        if (!(h instanceof v)) goto _L7; else goto _L10
_L10:
        ((v)h).a(ak.a(a.c()));
          goto _L7
        Object obj1;
        obj1;
        Log.e(w, "profileNotify callback interrupted", ((Throwable) (obj1)));
        if (g.isHeldByCurrentThread())
        {
            g.unlock();
        }
          goto _L11
        obj1;
        if (g.isHeldByCurrentThread())
        {
            g.unlock();
        }
        throw obj1;
        obj1 = t;
        obj2 = u;
        if ((n & 0x26) != 0)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        ((c) (obj1)).a(((Context) (obj2)), flag, n);
        if (v != null)
        {
            v.addSplit("initJSExecutor");
        }
        if (k.get() || Thread.currentThread().isInterrupted())
        {
            throw new InterruptedException();
        }
          goto _L12
        obj1;
        a.a(ak.f.b());
        obj1 = w;
        if (k.get())
        {
            a.a(ak.h.b());
            Thread.interrupted();
        }
        g.lockInterruptibly();
        if (h == null) goto _L14; else goto _L13
_L13:
        if (!(h instanceof t)) goto _L16; else goto _L15
_L15:
        ((t)h).a();
_L14:
        if (g.isHeldByCurrentThread())
        {
            g.unlock();
        }
_L47:
        j = false;
        return;
_L12:
        obj1 = a.g();
        obj2 = a.h();
        obj1 = new j(b, ((String) (obj1)), ((k) (obj2)), a.j(), this);
        if (a(((Runnable) (obj1))) == null)
        {
            obj1 = null;
        }
        if (v != null)
        {
            v.addSplit("get Config");
        }
        if (obj1 != null)
        {
            break MISSING_BLOCK_LABEL_899;
        }
        Log.e(w, "Failed to connect to server, aborting");
        a.a(ak.f.b());
        if (k.get())
        {
            a.a(ak.h.b());
            Thread.interrupted();
        }
        g.lockInterruptibly();
        if (h == null) goto _L18; else goto _L17
_L17:
        if (!(h instanceof t)) goto _L20; else goto _L19
_L19:
        ((t)h).a();
_L18:
        if (g.isHeldByCurrentThread())
        {
            g.unlock();
        }
_L22:
        j = false;
        return;
_L20:
        if (!(h instanceof v)) goto _L18; else goto _L21
_L21:
        ((v)h).a(ak.a(a.c()));
          goto _L18
        obj1;
        Log.e(w, "profileNotify callback interrupted", ((Throwable) (obj1)));
        if (g.isHeldByCurrentThread())
        {
            g.unlock();
        }
          goto _L22
        obj1;
        if (g.isHeldByCurrentThread())
        {
            g.unlock();
        }
        throw obj1;
        if (k.get() || Thread.currentThread().isInterrupted())
        {
            throw new InterruptedException();
        }
          goto _L23
        obj1;
        if (k.get())
        {
            a.a(ak.h.b());
            Thread.interrupted();
        }
        g.lockInterruptibly();
        if (h == null) goto _L25; else goto _L24
_L24:
        if (!(h instanceof t)) goto _L27; else goto _L26
_L26:
        ((t)h).a();
_L25:
        if (g.isHeldByCurrentThread())
        {
            g.unlock();
        }
_L49:
        j = false;
        throw obj1;
_L23:
        flag = t.c();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_1052;
        }
        t.d();
        if (v != null)
        {
            v.addSplit("get browser info");
        }
        a.i();
        if (k.get() || Thread.currentThread().isInterrupted())
        {
            throw new InterruptedException();
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_1109;
        }
        t.b();
        a.a(t);
        if (v != null)
        {
            v.addSplit("wait for browser info");
        }
        if ((n & 0x400) == 0) goto _L29; else goto _L28
_L28:
        String s2 = (new StringBuilder()).append(a.f()).append("-").append(ab.c(a.b())).append("-mob").toString();
        if (s2.length() < 64) goto _L31; else goto _L30
_L30:
        Log.w(w, "combined session id and org id too long for host name fragment");
_L36:
        if (v != null)
        {
            v.addSplit("Started DNS request");
        }
_L29:
        obj2 = a(false);
        if (v != null)
        {
            v.addSplit("wait for config network request");
        }
        f();
        if (obj2 == ak.b)
        {
            break MISSING_BLOCK_LABEL_1537;
        }
        Log.e(w, (new StringBuilder("Failed to retrieve config, aborting: ")).append(((ak) (obj2)).toString()).toString());
        a.a(((ak) (obj2)).b());
        if (k.get())
        {
            a.a(ak.h.b());
            Thread.interrupted();
        }
        g.lockInterruptibly();
        if (h == null) goto _L33; else goto _L32
_L32:
        if (!(h instanceof t)) goto _L35; else goto _L34
_L34:
        ((t)h).a();
_L33:
        if (g.isHeldByCurrentThread())
        {
            g.unlock();
        }
_L38:
        j = false;
        return;
_L31:
        obj2 = w;
        obj2 = "d";
        if (a.e().equals("qa2-h.online-metrix.net"))
        {
            obj2 = "q";
        }
        a(new h((new StringBuilder()).append(s2).append(".").append(((String) (obj2))).append(".aa.online-metrix.net").toString()));
          goto _L36
_L35:
        if (!(h instanceof v)) goto _L33; else goto _L37
_L37:
        ((v)h).a(ak.a(a.c()));
          goto _L33
        obj1;
        Log.e(w, "profileNotify callback interrupted", ((Throwable) (obj1)));
        if (g.isHeldByCurrentThread())
        {
            g.unlock();
        }
          goto _L38
        obj1;
        if (g.isHeldByCurrentThread())
        {
            g.unlock();
        }
        throw obj1;
        a.a(((j) (obj1)).a);
        if (a.d().a != l)
        {
            obj1 = w;
            (new StringBuilder("dynamic options (")).append(a.d().a).append(") != saved: ").append(l);
            obj1 = (new StringBuilder()).append(u.getPackageName()).append("TDM").toString();
            obj1 = u.getSharedPreferences(((String) (obj1)), 0).edit();
            ((android.content.SharedPreferences.Editor) (obj1)).putInt("options", a.d().a);
            ((android.content.SharedPreferences.Editor) (obj1)).apply();
            if (v != null)
            {
                v.addSplit("Processed stored options");
            }
        }
        a.a(s.b());
        obj1 = a.l();
        java.util.Map map = a.k();
        a(new l(b, m.d, (new StringBuilder("https://")).append(a.e()).append("/fp/clear.png").toString(), ((k) (obj1)), map, this));
        if ((n & 0x40) != 0)
        {
            a(new x(a.e(), a.f(), a.b(), a.d().b, m));
        }
        if (v != null)
        {
            v.addSplit("build network threads");
        }
        obj1 = a(true);
        a.a(((ak) (obj1)).b());
        if (obj1 != ak.b)
        {
            Log.w(w, (new StringBuilder("Received ")).append(((ak) (obj1)).a()).append(" error, profiling will be incomplete").toString());
            a.a(ak.k.b());
        }
        f();
        obj1 = w;
        if (v != null)
        {
            v.dumpToLog();
        }
        if (k.get())
        {
            a.a(ak.h.b());
            Thread.interrupted();
        }
        g.lockInterruptibly();
        if (h == null) goto _L40; else goto _L39
_L39:
        if (!(h instanceof t)) goto _L42; else goto _L41
_L41:
        ((t)h).a();
_L40:
        if (g.isHeldByCurrentThread())
        {
            g.unlock();
        }
_L44:
        j = false;
        return;
_L42:
        if (!(h instanceof v)) goto _L40; else goto _L43
_L43:
        ((v)h).a(ak.a(a.c()));
          goto _L40
        obj1;
        Log.e(w, "profileNotify callback interrupted", ((Throwable) (obj1)));
        if (g.isHeldByCurrentThread())
        {
            g.unlock();
        }
          goto _L44
        obj1;
        if (g.isHeldByCurrentThread())
        {
            g.unlock();
        }
        throw obj1;
_L5:
        if (h instanceof v)
        {
            ((v)h).a(ak.a(a.c()));
        }
        continue; /* Loop/switch isn't completed */
        obj1;
        Log.e(w, "profileNotify callback interrupted", ((Throwable) (obj1)));
        if (g.isHeldByCurrentThread())
        {
            g.unlock();
        }
          goto _L45
        obj1;
        if (g.isHeldByCurrentThread())
        {
            g.unlock();
        }
        throw obj1;
_L16:
        if (!(h instanceof v)) goto _L14; else goto _L46
_L46:
        ((v)h).a(ak.a(a.c()));
          goto _L14
        obj1;
        Log.e(w, "profileNotify callback interrupted", ((Throwable) (obj1)));
        if (g.isHeldByCurrentThread())
        {
            g.unlock();
        }
          goto _L47
        obj1;
        if (g.isHeldByCurrentThread())
        {
            g.unlock();
        }
        throw obj1;
_L27:
        if (!(h instanceof v)) goto _L25; else goto _L48
_L48:
        ((v)h).a(ak.a(a.c()));
          goto _L25
        InterruptedException interruptedexception;
        interruptedexception;
        Log.e(w, "profileNotify callback interrupted", interruptedexception);
        if (g.isHeldByCurrentThread())
        {
            g.unlock();
        }
          goto _L49
        obj1;
        if (g.isHeldByCurrentThread())
        {
            g.unlock();
        }
        throw obj1;
        if (true) goto _L3; else goto _L50
_L50:
    }

}
