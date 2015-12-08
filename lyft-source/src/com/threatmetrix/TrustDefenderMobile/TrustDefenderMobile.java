// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.threatmetrix.TrustDefenderMobile;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import android.util.TimingLogger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

// Referenced classes of package com.threatmetrix.TrustDefenderMobile:
//            StringUtils, TrustDefenderMobileCore, ProfileState, TDLocationManager, 
//            NetworkThread, HttpRunner, THMStatusCode, ProfilingOptions, 
//            CompleteProfile, NativeGatherer, Config, TDConfiguration, 
//            TDDefaults, ProfilingResult, TDHttpClient, BrowserInfoGatherer, 
//            SingletonWebView, HttpConfigRunner, DNSLookup, PutXML, 
//            EndNotifierBase, OkHttpClientImpl, AndroidHttpClientImpl, EndNotifier

public class TrustDefenderMobile
{

    private static final String w = StringUtils.a(com/threatmetrix/TrustDefenderMobile/TrustDefenderMobile);
    private static final Executor x = Executors.newFixedThreadPool(6);
    private static final boolean y;
    private TDDefaults A;
    final TrustDefenderMobileCore a = new TrustDefenderMobileCore("");
    final ProfileState b = new ProfileState();
    TDHttpClient c;
    private final ArrayList d = new ArrayList();
    private final ReadWriteLock e = new ReentrantReadWriteLock();
    private final Lock f;
    private final Lock g;
    private EndNotifierBase h;
    private Thread i;
    private int j;
    private long k;
    private boolean l;
    private int m;
    private int n;
    private int o;
    private int p;
    private boolean q;
    private String r;
    private final TDLocationManager s = new TDLocationManager();
    private BrowserInfoGatherer t;
    private Context u;
    private TimingLogger v;
    private final boolean z = true;

    public TrustDefenderMobile(String s1)
    {
        f = e.readLock();
        g = e.writeLock();
        h = null;
        i = null;
        j = 10000;
        k = 0L;
        l = false;
        m = 30000;
        n = 0;
        o = 10000;
        p = 0;
        q = true;
        r = null;
        t = null;
        c = null;
        u = null;
        v = null;
        A = null;
        if (!a.d(s1))
        {
            throw new IllegalArgumentException("Invalid Ord ID");
        } else
        {
            return;
        }
    }

    static long a(TrustDefenderMobile trustdefendermobile, long l1)
    {
        trustdefendermobile.k = l1;
        return l1;
    }

    static BrowserInfoGatherer a(TrustDefenderMobile trustdefendermobile, BrowserInfoGatherer browserinfogatherer)
    {
        trustdefendermobile.t = browserinfogatherer;
        return browserinfogatherer;
    }

    private NetworkThread a(Runnable runnable)
    {
        while (runnable == null || b.a()) 
        {
            return null;
        }
        NetworkThread networkthread;
        networkthread = new NetworkThread(runnable);
        if (!(runnable instanceof HttpRunner))
        {
            break MISSING_BLOCK_LABEL_105;
        }
        runnable = (HttpRunner)runnable;
        Log.d(w, (new StringBuilder()).append("Adding thread ID: ").append(networkthread.getId()).append(" for: ").append(((HttpRunner) (runnable)).c).toString());
        g.lock();
        d.add(networkthread);
        g.unlock();
        networkthread.start();
        return networkthread;
        runnable;
        try
        {
            g.unlock();
            throw runnable;
        }
        // Misplaced declaration of an exception variable
        catch (Runnable runnable)
        {
            Log.v(w, "Failed to create network request", runnable);
        }
        return null;
    }

    static TDDefaults a(TrustDefenderMobile trustdefendermobile)
    {
        return trustdefendermobile.A;
    }

    private boolean a(Thread thread, boolean flag)
    {
        int i1;
        boolean flag2;
        flag2 = true;
        Log.d(w, (new StringBuilder()).append("waiting for thread to complete - ").append(thread.getId()).toString());
        i1 = j;
        if (!y) goto _L2; else goto _L1
_L1:
        int j1;
        j1 = j / 100;
        i1 = j1;
        if (j1 >= 100) goto _L2; else goto _L3
_L3:
        int k1;
        j1 = 0;
        k1 = 100;
        i1 = 0;
_L6:
        long l2 = k1;
        thread.join(l2);
        int l1 = i1;
_L4:
        j1 += k1;
        if (thread.isAlive() && j1 < j)
        {
            i1 = l1;
            if (l1 == 0)
            {
                continue; /* Loop/switch isn't completed */
            }
        }
        flag = flag2;
        if (thread.isAlive())
        {
            if (l1 == 0)
            {
                Exception exception = new Exception();
                exception.setStackTrace(thread.getStackTrace());
                Log.w(w, (new StringBuilder()).append("join() timeout expired, but thread is still alive (!). Stack trace of TID ").append(thread.getId()).toString(), exception);
            }
            flag = false;
        }
        return flag;
        InterruptedException interruptedexception;
        interruptedexception;
        if (flag)
        {
            Log.d(w, "thread join", interruptedexception);
        }
        l1 = 1;
        if (true) goto _L4; else goto _L2
_L2:
        j1 = 0;
        k1 = i1;
        boolean flag1 = false;
        i1 = j1;
        j1 = ((flag1) ? 1 : 0);
        if (true) goto _L6; else goto _L5
_L5:
    }

    static long b(TrustDefenderMobile trustdefendermobile)
    {
        return trustdefendermobile.k;
    }

    static Context c(TrustDefenderMobile trustdefendermobile)
    {
        return trustdefendermobile.u;
    }

    static BrowserInfoGatherer d(TrustDefenderMobile trustdefendermobile)
    {
        return trustdefendermobile.t;
    }

    static TimingLogger e(TrustDefenderMobile trustdefendermobile)
    {
        return trustdefendermobile.v;
    }

    static int f(TrustDefenderMobile trustdefendermobile)
    {
        return trustdefendermobile.j;
    }

    static int g(TrustDefenderMobile trustdefendermobile)
    {
        return trustdefendermobile.m;
    }

    static String h()
    {
        return w;
    }

    private void i()
    {
        g.lockInterruptibly();
        d.clear();
        g.unlock();
        return;
        Exception exception;
        exception;
        g.unlock();
        throw exception;
    }

    public THMStatusCode a(ProfilingOptions profilingoptions)
    {
        if (!b.c())
        {
            return THMStatusCode.f;
        }
        g.lockInterruptibly();
        Log.d(w, (new StringBuilder()).append("starting profile request using - 3.2-83 options ").append(k).append(" timeout ").append(j).append("ms").append(" fp ").append(a.f()).append(" java.vm.version ").append(System.getProperty("java.vm.version")).toString());
        if (b.i())
        {
            break MISSING_BLOCK_LABEL_127;
        }
        profilingoptions = THMStatusCode.a;
        g.unlock();
        return profilingoptions;
        g();
        a.a(b);
        a.a(THMStatusCode.a);
        if (d.size() > 0)
        {
            Log.d(w, "outstanding requests... interrupting");
            b(true);
        }
        d.clear();
        a.a(profilingoptions.b());
        if (profilingoptions.a() == null || profilingoptions.a().isEmpty())
        {
            break MISSING_BLOCK_LABEL_275;
        }
        a.b(profilingoptions.a());
_L1:
        s.a(profilingoptions.c());
        i = new Thread(new CompleteProfile(this));
        i.start();
        profilingoptions = THMStatusCode.b;
        g.unlock();
        return profilingoptions;
        a.b(StringUtils.a());
          goto _L1
        profilingoptions;
        if (i != null)
        {
            i.interrupt();
        }
        b.j();
        profilingoptions = THMStatusCode.h;
        g.unlock();
        return profilingoptions;
        profilingoptions;
        g.unlock();
        throw profilingoptions;
    }

    THMStatusCode a(boolean flag)
    {
        Object obj = THMStatusCode.a;
        Iterator iterator;
        f.lockInterruptibly();
        iterator = d.iterator();
_L7:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        Object obj3 = (NetworkThread)iterator.next();
        if (!b.a() && !Thread.currentThread().isInterrupted()) goto _L4; else goto _L3
_L3:
        obj = THMStatusCode.h;
_L2:
        if (v != null)
        {
            v.addSplit("wait for network threads");
        }
        f.unlock();
        Object obj1 = obj;
        if (obj == THMStatusCode.a)
        {
            obj1 = THMStatusCode.b;
        }
        return ((THMStatusCode) (obj1));
_L4:
        Object obj2 = obj;
        ((NetworkThread) (obj3)).join(j);
        obj2 = obj;
        if (((NetworkThread) (obj3)).getState() == Thread.State.TERMINATED) goto _L6; else goto _L5
_L5:
        obj2 = obj;
        Log.e(w, "Connection hasn't completed before the timeout expired, aborting");
        obj2 = obj;
        obj = THMStatusCode.c;
        if (flag)
        {
            break MISSING_BLOCK_LABEL_165;
        }
        obj2 = obj;
        b(true);
          goto _L2
        obj2 = obj;
        a(((Thread) (obj3)));
          goto _L7
        obj3;
_L11:
        obj = obj2;
        if (b.a()) goto _L2; else goto _L8
_L8:
        obj = obj2;
        if (obj2 == THMStatusCode.a)
        {
            obj = THMStatusCode.c;
        }
        b(true);
        obj2 = Thread.currentThread();
        Log.d(w, (new StringBuilder()).append("thread join: this thread = TID ").append(((Thread) (obj2)).getId()).toString(), ((Throwable) (obj3)));
          goto _L2
        obj;
        if (v != null)
        {
            v.addSplit("wait for network threads");
        }
        f.unlock();
        throw obj;
_L6:
        obj2 = obj;
        HttpRunner httprunner = ((NetworkThread) (obj3)).a();
        if (httprunner == null) goto _L7; else goto _L9
_L9:
        obj2 = obj;
        obj3 = ((NetworkThread) (obj3)).a().a();
        obj2 = obj;
        if (obj3 != THMStatusCode.b)
        {
            break MISSING_BLOCK_LABEL_391;
        }
        obj2 = obj;
        if (httprunner.b() == 200)
        {
            break MISSING_BLOCK_LABEL_391;
        }
        obj2 = obj;
        Log.d(w, (new StringBuilder()).append("Connection returned http status code:").append(httprunner.b()).toString());
        obj2 = obj;
        obj3 = THMStatusCode.c;
        obj = obj3;
        if (flag) goto _L7; else goto _L10
_L10:
        obj2 = obj3;
        b(true);
        obj = obj3;
          goto _L2
        obj3;
          goto _L11
        obj2 = obj;
        if (obj3 == THMStatusCode.b) goto _L7; else goto _L12
_L12:
        obj2 = obj;
        Log.d(w, (new StringBuilder()).append("Connection returned status :").append(httprunner.a().a()).toString());
        obj = obj3;
        if (flag) goto _L7; else goto _L13
_L13:
        obj2 = obj3;
        b(true);
        obj = obj3;
          goto _L2
    }

    public void a()
    {
        this;
        JVM INSTR monitorenter ;
        Log.d(w, "cancel()");
        if (b.k()) goto _L2; else goto _L1
_L1:
        Log.w(w, "Cancel already happened");
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (b.m())
        {
            Log.d(w, "Cancelling package scan");
        }
        if (!b.h())
        {
            break MISSING_BLOCK_LABEL_261;
        }
        Log.d(w, "cancelling any outstanding JNI calls");
        NativeGatherer.a().c();
        Log.d(w, "cancelling active profiling request");
        b(false);
        if (i != null)
        {
            Log.d(w, (new StringBuilder()).append("sending interrupt to profile thread TID: ").append(i.getId()).toString());
            i.interrupt();
        }
        Log.d(w, "acquiring request lock");
        f.lock();
        for (Iterator iterator = d.iterator(); iterator.hasNext(); a(((Thread) ((NetworkThread)iterator.next())), true)) { }
        break MISSING_BLOCK_LABEL_215;
        Exception exception;
        exception;
        f.unlock();
        throw exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        f.unlock();
        if (i != null && i.isAlive())
        {
            Log.d(w, "waiting for profile thread to complete");
            a(i, false);
        }
        g.lock();
        d.clear();
        g.unlock();
        Log.d(w, "Waiting for any outstanding JNI calls");
        NativeGatherer.a().d();
        if (!b.a(j))
        {
            Log.e(w, "Timed out waiting for init thread");
        }
        b.o();
        b.l();
        Log.d(w, "Cancelled");
        if (true) goto _L4; else goto _L3
_L3:
        exception;
        g.unlock();
        throw exception;
    }

    public void a(Config config)
    {
        if (config.l() == null)
        {
            throw new IllegalArgumentException("Invalid Context");
        }
        Log.d(w, "Starting init()");
        if (!b.e())
        {
            Log.d(w, "Already init'd");
            return;
        }
        u = config.l().getApplicationContext();
        a.a(u);
        k = config.k();
        a.a(k);
        j = config.d() * 1000;
        a.a(config.e());
        h = config.f();
        if (!a.c(config.r()))
        {
            b.f();
            throw new IllegalArgumentException("Invalid Profile Server");
        }
        if (config.g())
        {
            s.a(u, config.h(), config.i(), config.j());
        }
        p = config.m();
        o = config.n();
        m = config.p();
        n = config.o();
        l = config.q();
        String s1;
        boolean flag;
        if (!config.b())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        q = flag;
        s1 = u.getPackageName();
        a(s1, a.g());
        a.e(s1);
        (new Thread(new CompleteProfile(this, config) {

            final Config a;
            final TrustDefenderMobile b;

            public void run()
            {
                boolean flag1 = true;
                Log.d(TrustDefenderMobile.h(), "Doing slow init stuff");
                if (TrustDefenderMobile.a(b) != null)
                {
                    Log.d(TrustDefenderMobile.h(), (new StringBuilder()).append("applying saved options (").append(TrustDefenderMobile.a(b).a()).append(" / ").append(TrustDefenderMobile.a(b).b()).append(") to ").append(TrustDefenderMobile.b(b)).toString());
                    TrustDefenderMobile.a(b, TrustDefenderMobile.b(b) ^ TrustDefenderMobile.a(b).b() & 38L | TrustDefenderMobile.a(b).a() & 768L);
                }
                b.a.b(TrustDefenderMobile.b(b));
                Object obj;
                String s2;
                StringBuilder stringbuilder;
                if ((TrustDefenderMobile.b(b) & 38L) == 0L)
                {
                    flag1 = false;
                }
                TrustDefenderMobile.a(b, new BrowserInfoGatherer());
                TrustDefenderMobile.d(b).a(TrustDefenderMobile.c(b), flag1, TrustDefenderMobile.b(b));
                if (TrustDefenderMobile.e(b) != null)
                {
                    TrustDefenderMobile.e(b).addSplit("init - initJSExecutor");
                }
                obj = TrustDefenderMobile.d(b).d();
                if (TrustDefenderMobile.e(b) != null)
                {
                    TrustDefenderMobile.e(b).addSplit("getUserAgent");
                }
                Log.d(TrustDefenderMobile.h(), "Creating HTTP Client");
                if (!a.a())
                {
                    break MISSING_BLOCK_LABEL_492;
                }
                b.c = new OkHttpClientImpl();
_L1:
                b.c.a(TrustDefenderMobile.c(b), TrustDefenderMobile.f(b), ((String) (obj)), true);
                if (TrustDefenderMobile.e(b) != null)
                {
                    TrustDefenderMobile.e(b).addSplit("create AndroidHttpClient");
                }
                Log.d(TrustDefenderMobile.h(), "HTTP Client created and user agent set");
                try
                {
                    StringUtils.b(null);
                }
                catch (InterruptedException interruptedexception) { }
                NativeGatherer.a().a(TrustDefenderMobile.c(b));
                s2 = TrustDefenderMobile.h();
                stringbuilder = (new StringBuilder()).append("Native libs: ");
                if (NativeGatherer.a().b())
                {
                    obj = "available";
                } else
                {
                    obj = "unavailable";
                }
                Log.d(s2, stringbuilder.append(((String) (obj))).toString());
                b.b();
                if (!a.c())
                {
                    b.a(TrustDefenderMobile.g(b), false, false, PackageScanCallSource.c);
                }
                b.b.o();
                b.b.f();
                Log.d(TrustDefenderMobile.h(), "init completed");
                return;
                b.c = new AndroidHttpClientImpl();
                  goto _L1
                obj;
                b.b.o();
                b.b.f();
                Log.d(TrustDefenderMobile.h(), "init completed");
                throw obj;
            }

            
            {
                b = TrustDefenderMobile.this;
                a = config;
                super(trustdefendermobile1);
            }

            private class PackageScanCallSource extends Enum
            {

                public static final PackageScanCallSource a;
                public static final PackageScanCallSource b;
                public static final PackageScanCallSource c;
                private static final PackageScanCallSource d[];

                public static PackageScanCallSource valueOf(String s1)
                {
                    return (PackageScanCallSource)Enum.valueOf(com/threatmetrix/TrustDefenderMobile/TrustDefenderMobile$PackageScanCallSource, s1);
                }

                public static PackageScanCallSource[] values()
                {
                    return (PackageScanCallSource[])d.clone();
                }

                static 
                {
                    a = new PackageScanCallSource("doProfileRequest", 0);
                    b = new PackageScanCallSource("doPackageScan", 1);
                    c = new PackageScanCallSource("init", 2);
                    d = (new PackageScanCallSource[] {
                        a, b, c
                    });
                }

                private PackageScanCallSource(String s1, int i1)
                {
                    super(s1, i1);
                }
            }

        })).start();
    }

    void a(TDConfiguration tdconfiguration)
    {
        if (A == null || A.a(tdconfiguration.a, tdconfiguration.b, "3.2-83"))
        {
            Log.d(w, (new StringBuilder()).append("dynamic enableOptions / disableOptions (").append(tdconfiguration.a).append(" / ").append(tdconfiguration.b).append(") != saved: ").toString());
            if (NativeGatherer.a().b())
            {
                NativeGatherer.a().a("enableOptions", String.valueOf(tdconfiguration.a));
                NativeGatherer.a().a("disableOptions", String.valueOf(tdconfiguration.b));
                NativeGatherer.a().a("sdkVersion", "3.2-83");
            } else
            {
                android.content.SharedPreferences.Editor editor = u.getSharedPreferences(r, 0).edit();
                editor.putLong("enableOptions", tdconfiguration.a);
                editor.putLong("disableOptions", tdconfiguration.b);
                editor.putString("sdkVersion", "3.2-83");
                editor.apply();
                if (v != null)
                {
                    v.addSplit("Processed stored options");
                    return;
                }
            }
        }
    }

    void a(THMStatusCode thmstatuscode)
    {
        a.a(thmstatuscode);
    }

    void a(String s1, String s2)
    {
        if (r == null)
        {
            r = (new StringBuilder()).append(s1).append("TDM").append(s2).toString();
        }
    }

    void a(Thread thread)
    {
        final class _cls1InterruptRunnable
            implements Runnable
        {

            final Thread a;
            final TrustDefenderMobile b;

            public void run()
            {
                Log.d(TrustDefenderMobile.h(), (new StringBuilder()).append("sending interrupt to TID: ").append(a.getId()).toString());
                a.interrupt();
            }

            _cls1InterruptRunnable(Thread thread)
            {
                b = TrustDefenderMobile.this;
                super();
                a = thread;
            }
        }

        x.execute(new _cls1InterruptRunnable(thread));
    }

    public boolean a(int i1)
    {
        return a(i1, true, true, PackageScanCallSource.b);
    }

    boolean a(int i1, boolean flag, boolean flag1, PackageScanCallSource packagescancallsource)
    {
        Log.d(w, (new StringBuilder()).append("doPackageScan(").append(packagescancallsource).append("): marking scan as started").toString());
        if (flag1 && !b.d() || !flag1 && !b.c())
        {
            Log.e(w, (new StringBuilder()).append("doPackageScan(").append(packagescancallsource).append("): aborted! not inited").toString());
            return false;
        }
        int j1;
        long l1;
        if (packagescancallsource == PackageScanCallSource.a || packagescancallsource == PackageScanCallSource.c)
        {
            l1 = 16384L & k;
            String s1;
            StringBuilder stringbuilder;
            if (packagescancallsource == PackageScanCallSource.c)
            {
                j1 = n;
            } else
            {
                j1 = p;
            }
        } else
        {
            l1 = k;
            j1 = 0;
        }
        if ((28672L & l1) != 0L)
        {
            if (!b.a(flag))
            {
                s1 = w;
                stringbuilder = (new StringBuilder()).append("Scan ");
                if (flag)
                {
                    packagescancallsource = "or profile";
                } else
                {
                    packagescancallsource = "";
                }
                Log.w(s1, stringbuilder.append(packagescancallsource).append(" already in progress or cancel requested, aborting").toString());
                return false;
            }
            (new Thread(new CompleteProfile(this, l1, j1, i1, packagescancallsource) {

                final long a;
                final int b;
                final int c;
                final PackageScanCallSource d;
                final TrustDefenderMobile e;

                public void run()
                {
                    byte byte0 = 0;
                    if ((a & 12288L) != 0L)
                    {
                        byte0 = 2;
                    }
                    if ((a & 16384L) != 0L) goto _L2; else goto _L1
_L1:
                    int k1 = byte0;
                    if ((a & 8192L) == 0L) goto _L3; else goto _L2
_L3:
                    Exception exception;
                    try
                    {
                        NativeGatherer.a().a(TrustDefenderMobile.c(e), k1, b, c);
                    }
                    catch (InterruptedException interruptedexception)
                    {
                        Log.d(TrustDefenderMobile.h(), (new StringBuilder()).append("doPackageScan(").append(d).append("): complete").toString());
                        e.b.n();
                        return;
                    }
                    finally
                    {
                        Log.d(TrustDefenderMobile.h(), (new StringBuilder()).append("doPackageScan(").append(d).append("): complete").toString());
                    }
                    Log.d(TrustDefenderMobile.h(), (new StringBuilder()).append("doPackageScan(").append(d).append("): complete").toString());
                    e.b.n();
                    return;
                    e.b.n();
                    throw exception;
_L2:
                    k1 = byte0 | 1;
                    if (true) goto _L3; else goto _L4
_L4:
                }

            
            {
                e = TrustDefenderMobile.this;
                a = l1;
                b = i1;
                c = j1;
                d = packagescancallsource;
                super(trustdefendermobile1);
            }
            })).start();
        }
        return true;
    }

    void b()
    {
        if (!NativeGatherer.a().b())
        {
            break MISSING_BLOCK_LABEL_100;
        }
        A = new TDDefaults();
        Object obj = NativeGatherer.a().c("enableOptions");
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_49;
        }
        A.a(Long.getLong(((String) (obj)), 0L).longValue());
        obj = NativeGatherer.a().c("disableOptions");
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_78;
        }
        A.b(Long.getLong(((String) (obj)), 0L).longValue());
        obj = NativeGatherer.a().c("sdkVersion");
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_228;
        }
        try
        {
            A.a(((String) (obj)));
        }
        catch (InterruptedException interruptedexception)
        {
            Log.d(w, "Interrupted", interruptedexception);
            A = null;
        }
        if (A == null || !A.c().equals("3.2-83"))
        {
            obj = u.getSharedPreferences(r, 0);
            try
            {
                A = new TDDefaults();
                A.a(((SharedPreferences) (obj)).getLong("enableOptions", 0L));
                A.b(((SharedPreferences) (obj)).getLong("disableOptions", 0L));
                A.a(((SharedPreferences) (obj)).getString("sdkVersion", ""));
            }
            catch (ClassCastException classcastexception)
            {
                Log.d(w, "Found preference of different type", classcastexception);
                A = null;
            }
        }
        if (A != null && !A.c().equals("3.2-83"))
        {
            A = null;
        }
        return;
        A = null;
        break MISSING_BLOCK_LABEL_100;
    }

    void b(boolean flag)
    {
        if (flag)
        {
            break MISSING_BLOCK_LABEL_13;
        }
        f.lock();
        for (Iterator iterator = d.iterator(); iterator.hasNext(); a((NetworkThread)iterator.next())) { }
        break MISSING_BLOCK_LABEL_62;
        Exception exception;
        exception;
        if (!flag)
        {
            f.unlock();
        }
        throw exception;
        if (!flag)
        {
            f.unlock();
        }
        return;
    }

    public ProfilingResult c()
    {
        return new ProfilingResult(a.c(), a.d());
    }

    public void d()
    {
        Log.d(w, "tidyUp()");
        a();
        s.b();
        b.a(j);
        if (c != null)
        {
            c.a(x);
            c = null;
        }
        if (t != null)
        {
            t.a(false);
        }
        SingletonWebView.b();
        b.b();
    }

    HttpConfigRunner e()
    {
        Object obj = a.h();
        HttpParameterMap httpparametermap = a.i();
        obj = new HttpConfigRunner(c, ((String) (obj)), httpparametermap, a.k(), this, b);
        if (a(((Runnable) (obj))) != null)
        {
            return ((HttpConfigRunner) (obj));
        } else
        {
            return null;
        }
    }

    void f()
    {
        boolean flag;
        boolean flag1;
        flag = true;
        flag1 = false;
        Object obj3;
        StringBuilder stringbuilder;
        a.b();
        obj3 = w;
        stringbuilder = (new StringBuilder()).append("continuing profile request ");
        final class _cls1EndNotifierRunnable
            implements Runnable
        {

            final ProfilingResult a;
            final EndNotifierBase b;
            final TrustDefenderMobile c;

            public void run()
            {
                if (b != null && (b instanceof EndNotifier))
                {
                    ((EndNotifier)b).complete(a);
                }
            }

            _cls1EndNotifierRunnable(ProfilingResult profilingresult, EndNotifierBase endnotifierbase)
            {
                c = TrustDefenderMobile.this;
                super();
                a = profilingresult;
                b = endnotifierbase;
            }
        }

        Object obj;
        if (b.c())
        {
            obj = "inited already";
        } else
        {
            obj = " needs init";
        }
        Log.d(((String) (obj3)), stringbuilder.append(((String) (obj))).toString());
        if (v != null)
        {
            v.addSplit("after startup and thread split");
        }
        if (b.a() || Thread.currentThread().isInterrupted())
        {
            throw new InterruptedException();
        }
          goto _L1
        obj;
        if (b.a())
        {
            break MISSING_BLOCK_LABEL_1624;
        }
        Log.d(w, "profile request interrupted", ((Throwable) (obj)));
_L10:
        a.a(THMStatusCode.f);
        if (b.a())
        {
            a.a(THMStatusCode.h);
            Thread.interrupted();
        }
        obj = c();
        obj3 = h;
        b.j();
        x.execute(new _cls1EndNotifierRunnable(((ProfilingResult) (obj)), ((EndNotifierBase) (obj3))));
        return;
_L1:
        if (!b.c())
        {
            Log.d(w, "Not inited");
            throw new IllegalArgumentException("Not inited");
        }
        break MISSING_BLOCK_LABEL_314;
        Object obj1;
        obj1;
        a.a(THMStatusCode.f);
        Log.d(w, "profile request failed", ((Throwable) (obj1)));
        if (b.a())
        {
            a.a(THMStatusCode.h);
            Thread.interrupted();
        }
        obj1 = c();
        obj3 = h;
        b.j();
        x.execute(new _cls1EndNotifierRunnable(((ProfilingResult) (obj1)), ((EndNotifierBase) (obj3))));
        return;
        boolean flag2;
        boolean flag3;
        flag2 = b.g();
        flag3 = b.p();
        if (!flag2 && !flag3)
        {
            break MISSING_BLOCK_LABEL_614;
        }
        if (!l)
        {
            break MISSING_BLOCK_LABEL_428;
        }
        obj3 = w;
        stringbuilder = (new StringBuilder()).append("Setting flag to for interrupting ");
        if (flag2)
        {
            obj1 = "init";
        } else
        {
            obj1 = "package";
        }
        Log.d(((String) (obj3)), stringbuilder.append(((String) (obj1))).append(" scan").toString());
        b.m();
        NativeGatherer.a().c();
        b.o();
        NativeGatherer.a().d();
        flag = false;
        if (b.a(j))
        {
            break MISSING_BLOCK_LABEL_617;
        }
        if (b.a()) goto _L3; else goto _L2
_L2:
        Log.e(w, "Timed out waiting for init thread, aborting");
        a.a(THMStatusCode.f);
_L5:
        if (b.a())
        {
            a.a(THMStatusCode.h);
            Thread.interrupted();
        }
        obj1 = c();
        EndNotifierBase endnotifierbase = h;
        b.j();
        x.execute(new _cls1EndNotifierRunnable(((ProfilingResult) (obj1)), endnotifierbase));
        return;
_L3:
        Log.e(w, "Thread interrupted, returning");
        if (true) goto _L5; else goto _L4
_L4:
        obj1;
        if (b.a())
        {
            a.a(THMStatusCode.h);
            Thread.interrupted();
        }
        ProfilingResult profilingresult1 = c();
        EndNotifierBase endnotifierbase5 = h;
        b.j();
        x.execute(new _cls1EndNotifierRunnable(profilingresult1, endnotifierbase5));
        throw obj1;
        flag = false;
        if (flag)
        {
            break MISSING_BLOCK_LABEL_643;
        }
        if (q)
        {
            a(o, false, true, PackageScanCallSource.a);
        }
        if (b.a() || Thread.currentThread().isInterrupted())
        {
            throw new InterruptedException();
        }
        obj1 = e();
        if (v != null)
        {
            v.addSplit("get Config");
        }
        if (obj1 != null)
        {
            break MISSING_BLOCK_LABEL_776;
        }
        Log.e(w, "Failed to connect to server, aborting");
        a.a(THMStatusCode.f);
        if (b.a())
        {
            a.a(THMStatusCode.h);
            Thread.interrupted();
        }
        obj1 = c();
        EndNotifierBase endnotifierbase1 = h;
        b.j();
        x.execute(new _cls1EndNotifierRunnable(((ProfilingResult) (obj1)), endnotifierbase1));
        return;
        if (b.a() || Thread.currentThread().isInterrupted())
        {
            throw new InterruptedException();
        }
        if (t == null)
        {
            break MISSING_BLOCK_LABEL_860;
        }
        flag2 = t.h();
        flag1 = flag2;
        if (!flag2)
        {
            break MISSING_BLOCK_LABEL_860;
        }
        t.i();
        flag1 = flag2;
        if (v == null)
        {
            break MISSING_BLOCK_LABEL_860;
        }
        v.addSplit("get browser info");
        flag1 = flag2;
        b.o();
        a.j();
        if (b.a() || Thread.currentThread().isInterrupted())
        {
            throw new InterruptedException();
        }
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_926;
        }
        t.a(true);
        a.a(t);
        if (v != null)
        {
            v.addSplit("wait for browser info");
        }
        THMStatusCode thmstatuscode = a(false);
        if (v != null)
        {
            v.addSplit("wait for config network request");
        }
        i();
        if (thmstatuscode == THMStatusCode.b)
        {
            break MISSING_BLOCK_LABEL_1089;
        }
        Log.e(w, (new StringBuilder()).append("Failed to retrieve config, aborting: ").append(thmstatuscode.toString()).toString());
        a.a(thmstatuscode);
        NativeGatherer.a().c();
        NativeGatherer.a().d();
        if (b.a())
        {
            a.a(THMStatusCode.h);
            Thread.interrupted();
        }
        obj1 = c();
        EndNotifierBase endnotifierbase2 = h;
        b.j();
        x.execute(new _cls1EndNotifierRunnable(((ProfilingResult) (obj1)), endnotifierbase2));
        return;
        a.a(((HttpConfigRunner) (obj1)).a);
        obj1 = a.e();
        if (obj1 == null) goto _L7; else goto _L6
_L6:
        a(((TDConfiguration) (obj1)));
_L9:
        if (b.a())
        {
            throw new InterruptedException();
        }
        break; /* Loop/switch isn't completed */
_L7:
        if (b.a())
        {
            Log.e(w, "Failed to retrieve config");
        }
        if (true) goto _L9; else goto _L8
_L8:
        if (a.e() != null)
        {
            break MISSING_BLOCK_LABEL_1238;
        }
        Log.e(w, "Failed to get config, bailing out");
        if (b.a())
        {
            a.a(THMStatusCode.h);
            Thread.interrupted();
        }
        obj1 = c();
        EndNotifierBase endnotifierbase3 = h;
        b.j();
        x.execute(new _cls1EndNotifierRunnable(((ProfilingResult) (obj1)), endnotifierbase3));
        return;
        if ((k & 1024L) == 0L)
        {
            break MISSING_BLOCK_LABEL_1293;
        }
        obj1 = a.l();
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_1276;
        }
        a(new DNSLookup(((String) (obj1))));
        if (v != null)
        {
            v.addSplit("Started DNS request");
        }
        if ((k & 64L) != 0L)
        {
            a(new PutXML(a.f(), a.g(), a.c(), a.e().c, j));
        }
        a.a(s.c(), s.d());
        Object obj2 = a.n();
        java.util.Map map = a.m();
        a(new HttpRunner(c, HttpRunner.HttpRunnerType.d, (new StringBuilder()).append("https://").append(a.f()).append("/fp/clear.png").toString(), ((HttpParameterMap) (obj2)), map, this, u, b));
        if (v != null)
        {
            v.addSplit("build network threads");
        }
        obj2 = a(true);
        a.a(((THMStatusCode) (obj2)));
        if (obj2 != THMStatusCode.b)
        {
            Log.w(w, (new StringBuilder()).append("Received ").append(((THMStatusCode) (obj2)).a()).append(" error, profiling will be incomplete").toString());
            a.a(THMStatusCode.k);
        }
        i();
        Log.d(w, "profile request complete");
        if (v != null)
        {
            v.dumpToLog();
        }
        if (b.a())
        {
            a.a(THMStatusCode.h);
            Thread.interrupted();
        }
        ProfilingResult profilingresult = c();
        EndNotifierBase endnotifierbase4 = h;
        b.j();
        x.execute(new _cls1EndNotifierRunnable(profilingresult, endnotifierbase4));
        return;
        Log.d(w, "profile request interrupted due to cancel");
          goto _L10
    }

    void g()
    {
        a.a();
        s.b();
    }

    static 
    {
        String s1 = System.getProperty("java.vm.version");
        boolean flag;
        if (s1 != null && s1.equals("2.0.0"))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        y = flag;
        if (y)
        {
            Log.d(w, "Broken join() detected, activating fallback routine");
        }
    }
}
