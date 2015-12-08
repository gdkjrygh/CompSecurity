// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.activity.ui;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.content.LocalBroadcastManager;
import com.fitbit.data.bl.ag;
import com.fitbit.e.a;
import com.fitbit.util.service.b;
import java.util.UUID;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class f
{
    public static interface a
    {

        public abstract void f();

        public abstract void g();

        public abstract void h();
    }


    private static final String a = "GraphDataDownloader";
    private static final long b = 0x2bf20L;
    private static final ExecutorService t;
    private Runnable c;
    private a d;
    private volatile boolean e;
    private volatile boolean f;
    private boolean g;
    private Handler h;
    private Runnable i;
    private Callable j;
    private Object k;
    private boolean l;
    private boolean m;
    private final Context n;
    private final Object o = new Object();
    private UUID p;
    private BroadcastReceiver q;
    private Runnable r;
    private BroadcastReceiver s;

    public f(a a1, Application application)
    {
        c = null;
        e = false;
        h = new Handler(Looper.getMainLooper());
        q = new BroadcastReceiver() {

            final f a;

            public void onReceive(Context context, Intent intent)
            {
                if ("com.fitbit.util.service.DispatcherService.SERVICE_FINISHED_TASK".equals(intent.getAction()))
                {
                    context = (UUID)intent.getSerializableExtra("com.fitbit.util.service.DispatcherService.GUID");
                    com.fitbit.activity.ui.f.a(a, context);
                }
            }

            
            {
                a = f.this;
                super();
            }
        };
        r = new Runnable() {

            final f a;

            public void run()
            {
                if (a.h() || a.g())
                {
                    com.fitbit.activity.ui.f.a(a);
                }
            }

            
            {
                a = f.this;
                super();
            }
        };
        s = new BroadcastReceiver() {

            final f a;

            public void onReceive(Context context, Intent intent)
            {
                if ((a.h() || a.g()) && com.fitbit.activity.ui.f.b(a) != null)
                {
                    f.d(a).removeCallbacks(f.c(a));
                    f.d(a).postDelayed(f.c(a), 1000L);
                }
            }

            
            {
                a = f.this;
                super();
            }
        };
        d = a1;
        n = application;
    }

    static void a(f f1)
    {
        f1.i();
    }

    static void a(f f1, UUID uuid)
    {
        f1.a(uuid);
    }

    private void a(UUID uuid)
    {
        if (p != null && uuid.equals(p))
        {
            p = null;
            synchronized (o)
            {
                o.notifyAll();
            }
            m();
        }
        return;
        exception;
        uuid;
        JVM INSTR monitorexit ;
        throw exception;
    }

    static boolean a(f f1, boolean flag)
    {
        f1.l = flag;
        return flag;
    }

    static a b(f f1)
    {
        return f1.d;
    }

    static UUID b(f f1, UUID uuid)
    {
        f1.p = uuid;
        return uuid;
    }

    static Runnable c(f f1)
    {
        return f1.r;
    }

    static Handler d(f f1)
    {
        return f1.h;
    }

    static void e(f f1)
    {
        f1.j();
    }

    static void f(f f1)
    {
        f1.m();
    }

    static void g(f f1)
    {
        f1.o();
    }

    static void h(f f1)
    {
        f1.n();
    }

    private void i()
    {
        e = false;
        if (b())
        {
            c = new Runnable() {

                final f a;

                public void run()
                {
                    boolean flag = a.h();
                    if (flag)
                    {
                        if (a.h())
                        {
                            com.fitbit.e.a.a("GraphDataDownloader", "Task successfully canceled", new Object[0]);
                        }
                        f.f(a);
                        com.fitbit.activity.ui.f.a(a, true);
                        return;
                    }
                    f.e(a);
                    if (a.h())
                    {
                        com.fitbit.e.a.a("GraphDataDownloader", "Task successfully canceled", new Object[0]);
                    }
                    f.f(a);
                    com.fitbit.activity.ui.f.a(a, true);
                    return;
                    Exception exception;
                    exception;
                    if (a.h())
                    {
                        com.fitbit.e.a.a("GraphDataDownloader", "Task successfully canceled", new Object[0]);
                    }
                    f.f(a);
                    com.fitbit.activity.ui.f.a(a, true);
                    throw exception;
                }

            
            {
                a = f.this;
                super();
            }
            };
            t.execute(c);
            com.fitbit.e.a.a("GraphDataDownloader", "Execute new task. Queue size: [%s]", new Object[] {
                Integer.valueOf(((ThreadPoolExecutor)t).getQueue().size())
            });
        }
    }

    static void i(f f1)
    {
        f1.k();
    }

    private void j()
    {
        if (i != null)
        {
            i.run();
        } else
        if (j != null)
        {
            try
            {
                FutureTask futuretask = new FutureTask(j);
                futuretask.run();
                k = futuretask.get(0x2bf20L, TimeUnit.MILLISECONDS);
                return;
            }
            catch (Exception exception)
            {
                com.fitbit.e.a.a("GraphDataDownloader", "Unable complete future task", exception, new Object[0]);
            }
            return;
        }
    }

    static void j(f f1)
    {
        f1.l();
    }

    static Context k(f f1)
    {
        return f1.n;
    }

    private void k()
    {
        if (!f)
        {
            IntentFilter intentfilter = new IntentFilter();
            intentfilter.addAction("com.fitbit.util.service.DispatcherService.SERVICE_FINISHED_TASK");
            LocalBroadcastManager.getInstance(n).registerReceiver(q, intentfilter);
            f = true;
        }
    }

    static Object l(f f1)
    {
        return f1.o;
    }

    private void l()
    {
        if (f)
        {
            try
            {
                LocalBroadcastManager.getInstance(n).unregisterReceiver(q);
            }
            catch (IllegalArgumentException illegalargumentexception)
            {
                com.fitbit.e.a.a("GraphDataDownloader", "Trying to unregister not registered recevier", new Object[0]);
            }
            f = false;
        }
    }

    private void m()
    {
        h.post(new Runnable() {

            final f a;

            public void run()
            {
                if (com.fitbit.activity.ui.f.b(a) != null)
                {
                    com.fitbit.activity.ui.f.b(a).h();
                }
            }

            
            {
                a = f.this;
                super();
            }
        });
    }

    private void n()
    {
        h.post(new Runnable() {

            final f a;

            public void run()
            {
                if (com.fitbit.activity.ui.f.b(a) != null)
                {
                    com.fitbit.activity.ui.f.b(a).g();
                }
            }

            
            {
                a = f.this;
                super();
            }
        });
    }

    private void o()
    {
        h.post(new Runnable() {

            final f a;

            public void run()
            {
                if (com.fitbit.activity.ui.f.b(a) != null)
                {
                    com.fitbit.activity.ui.f.b(a).f();
                }
            }

            
            {
                a = f.this;
                super();
            }
        });
    }

    public void a()
    {
        d = null;
    }

    public void a(Intent intent, UUID uuid)
    {
        e = false;
        if (b())
        {
            c = new Runnable(intent, uuid) {

                final Intent a;
                final UUID b;
                final f c;

                public void run()
                {
                    boolean flag = c.h();
                    if (flag)
                    {
                        if (c.h())
                        {
                            com.fitbit.e.a.a("GraphDataDownloader", "Task successfully canceled", new Object[0]);
                        }
                        f.f(c);
                        com.fitbit.activity.ui.f.a(c, true);
                        return;
                    }
                    f.g(c);
                    flag = c.h();
                    if (flag)
                    {
                        if (c.h())
                        {
                            com.fitbit.e.a.a("GraphDataDownloader", "Task successfully canceled", new Object[0]);
                        }
                        f.f(c);
                        com.fitbit.activity.ui.f.a(c, true);
                        return;
                    }
                    f.e(c);
                    flag = c.h();
                    if (flag)
                    {
                        if (c.h())
                        {
                            com.fitbit.e.a.a("GraphDataDownloader", "Task successfully canceled", new Object[0]);
                        }
                        f.f(c);
                        com.fitbit.activity.ui.f.a(c, true);
                        return;
                    }
                    f.h(c);
                    if (a == null)
                    {
                        break MISSING_BLOCK_LABEL_551;
                    }
                    flag = c.h();
                    if (flag)
                    {
                        if (c.h())
                        {
                            com.fitbit.e.a.a("GraphDataDownloader", "Task successfully canceled", new Object[0]);
                        }
                        f.f(c);
                        com.fitbit.activity.ui.f.a(c, true);
                        return;
                    }
                    com.fitbit.activity.ui.f.b(c, b);
                    f.i(c);
                    a.putExtra("com.fitbit.util.service.DispatcherService.GUID", b);
                    if (com.fitbit.activity.ui.f.b(c) != null)
                    {
                        break MISSING_BLOCK_LABEL_316;
                    }
                    f.j(c);
                    if (c.h())
                    {
                        com.fitbit.e.a.a("GraphDataDownloader", "Task successfully canceled", new Object[0]);
                    }
                    f.f(c);
                    com.fitbit.activity.ui.f.a(c, true);
                    return;
                    f.k(c).startService(a);
                    Object obj = f.l(c);
                    obj;
                    JVM INSTR monitorenter ;
                    flag = c.h();
                    if (!flag)
                    {
                        break MISSING_BLOCK_LABEL_400;
                    }
                    f.j(c);
                    obj;
                    JVM INSTR monitorexit ;
                    if (c.h())
                    {
                        com.fitbit.e.a.a("GraphDataDownloader", "Task successfully canceled", new Object[0]);
                    }
                    f.f(c);
                    com.fitbit.activity.ui.f.a(c, true);
                    return;
                    f.l(c).wait(0x2bf20L);
                    f.j(c);
_L1:
                    obj;
                    JVM INSTR monitorexit ;
                    flag = c.h();
                    if (flag)
                    {
                        if (c.h())
                        {
                            com.fitbit.e.a.a("GraphDataDownloader", "Task successfully canceled", new Object[0]);
                        }
                        f.f(c);
                        com.fitbit.activity.ui.f.a(c, true);
                        return;
                    }
                    break MISSING_BLOCK_LABEL_544;
                    Object obj1;
                    obj1;
                    com.fitbit.e.a.a("GraphDataDownloader", ((Throwable) (obj1)));
                    f.j(c);
                      goto _L1
                    obj1;
                    obj;
                    JVM INSTR monitorexit ;
                    throw obj1;
                    Exception exception;
                    exception;
                    if (c.h())
                    {
                        com.fitbit.e.a.a("GraphDataDownloader", "Task successfully canceled", new Object[0]);
                    }
                    f.f(c);
                    com.fitbit.activity.ui.f.a(c, true);
                    throw exception;
                    obj1;
                    f.j(c);
                    throw obj1;
                    f.e(c);
                    flag = c.h();
                    if (flag)
                    {
                        if (c.h())
                        {
                            com.fitbit.e.a.a("GraphDataDownloader", "Task successfully canceled", new Object[0]);
                        }
                        f.f(c);
                        com.fitbit.activity.ui.f.a(c, true);
                        return;
                    }
                    if (c.h())
                    {
                        com.fitbit.e.a.a("GraphDataDownloader", "Task successfully canceled", new Object[0]);
                    }
                    f.f(c);
                    com.fitbit.activity.ui.f.a(c, true);
                    return;
                }

            
            {
                c = f.this;
                a = intent;
                b = uuid;
                super();
            }
            };
            t.execute(c);
            com.fitbit.e.a.a("GraphDataDownloader", "Execute new task. Queue size: [%s]", new Object[] {
                Integer.valueOf(((ThreadPoolExecutor)t).getQueue().size())
            });
        }
    }

    public void a(a a1)
    {
        d = a1;
    }

    public void a(Runnable runnable)
    {
        if (runnable != null)
        {
            g = true;
        }
        i = runnable;
    }

    public void a(Callable callable)
    {
        if (callable != null)
        {
            g = true;
        }
        j = callable;
    }

    public boolean b()
    {
        return g;
    }

    public Object c()
    {
        return k;
    }

    public void d()
    {
        if (!m && n != null)
        {
            IntentFilter intentfilter = new IntentFilter();
            intentfilter.addAction("com.fibit.data.bl.BROADCAST_CHART_UPDATE");
            LocalBroadcastManager.getInstance(n).registerReceiver(s, intentfilter);
            m = true;
        }
    }

    public void e()
    {
        if (m && n != null)
        {
            LocalBroadcastManager.getInstance(n).unregisterReceiver(s);
            m = false;
        }
    }

    public void f()
    {
        com.fitbit.e.a.a("GraphDataDownloader", "Request to cancel load task", new Object[0]);
        if (e)
        {
            com.fitbit.e.a.a("GraphDataDownloader", "Task already canceled", new Object[0]);
            return;
        }
        if (l)
        {
            com.fitbit.e.a.a("GraphDataDownloader", "Task already completed", new Object[0]);
            return;
        }
        e = true;
        if (c != null && ((ThreadPoolExecutor)t).getQueue().remove(c))
        {
            com.fitbit.e.a.a("GraphDataDownloader", "Task not started yet. Removed from queue.", new Object[0]);
            return;
        }
        if (p != null && n != null)
        {
            com.fitbit.e.a.a("GraphDataDownloader", "Started intent for cancel load request.", new Object[0]);
            n.startService(com.fitbit.util.service.b.a(n, p));
        }
        synchronized (o)
        {
            o.notifyAll();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean g()
    {
        return l;
    }

    public boolean h()
    {
        return e;
    }

    static 
    {
        t = ag.b();
        ((ThreadPoolExecutor)t).setRejectedExecutionHandler(new RejectedExecutionHandler() {

            public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadpoolexecutor)
            {
                com.fitbit.e.a.a("GraphDataDownloader", "Rejected task. Poll old task and push new.", new Object[0]);
                threadpoolexecutor.getQueue().poll();
                threadpoolexecutor.execute(runnable);
            }

        });
    }
}
