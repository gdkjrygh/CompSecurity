// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.c;

import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import rx.Y;
import rx.b.a;
import rx.e.d;
import rx.exceptions.Exceptions;
import rx.h.f;
import rx.internal.util.e;
import rx.internal.util.j;

// Referenced classes of package rx.internal.c:
//            c, d

public class b extends rx.R.a
    implements Y
{

    public static final int c = Integer.getInteger("rx.scheduler.jdk6.purge-frequency-millis", 1000).intValue();
    private static final boolean e;
    private static final ConcurrentHashMap f = new ConcurrentHashMap();
    private static final AtomicReference g = new AtomicReference();
    private static volatile Object h;
    private static final Object i = new Object();
    final ScheduledExecutorService a;
    volatile boolean b;
    private final rx.e.f d = rx.e.d.a().d();

    public b(ThreadFactory threadfactory)
    {
        threadfactory = Executors.newScheduledThreadPool(1, threadfactory);
        if (!a(threadfactory) && (threadfactory instanceof ScheduledThreadPoolExecutor))
        {
            a((ScheduledThreadPoolExecutor)threadfactory);
        }
        a = threadfactory;
    }

    static void a()
    {
_L1:
        Object obj;
label0:
        {
            try
            {
                ScheduledThreadPoolExecutor scheduledthreadpoolexecutor;
                for (obj = f.keySet().iterator(); ((Iterator) (obj)).hasNext(); scheduledthreadpoolexecutor.purge())
                {
                    scheduledthreadpoolexecutor = (ScheduledThreadPoolExecutor)((Iterator) (obj)).next();
                    if (scheduledthreadpoolexecutor.isShutdown())
                    {
                        break label0;
                    }
                }

            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                Exceptions.throwIfFatal(((Throwable) (obj)));
                rx.e.d.a().b();
            }
            return;
        }
        ((Iterator) (obj)).remove();
          goto _L1
    }

    public static void a(ScheduledThreadPoolExecutor scheduledthreadpoolexecutor)
    {
        do
        {
            if ((ScheduledExecutorService)g.get() != null)
            {
                break;
            }
            ScheduledExecutorService scheduledexecutorservice = Executors.newScheduledThreadPool(1, new j("RxSchedulerPurge-"));
            if (!g.compareAndSet(null, scheduledexecutorservice))
            {
                continue;
            }
            scheduledexecutorservice.scheduleAtFixedRate(new c(), c, c, TimeUnit.MILLISECONDS);
            break;
        } while (true);
        f.putIfAbsent(scheduledthreadpoolexecutor, scheduledthreadpoolexecutor);
    }

    public static boolean a(ScheduledExecutorService scheduledexecutorservice)
    {
        if (!e)
        {
            break MISSING_BLOCK_LABEL_99;
        }
        Object obj;
        if (scheduledexecutorservice instanceof ScheduledThreadPoolExecutor)
        {
            obj = h;
            if (obj == i)
            {
                return false;
            }
            if (obj == null)
            {
                obj = b(scheduledexecutorservice);
                Object obj1;
                if (obj != null)
                {
                    obj1 = obj;
                } else
                {
                    obj1 = i;
                }
                h = obj1;
            } else
            {
                obj = (Method)obj;
            }
        } else
        {
            obj = b(scheduledexecutorservice);
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_99;
        }
        ((Method) (obj)).invoke(scheduledexecutorservice, new Object[] {
            Boolean.valueOf(true)
        });
        return true;
        scheduledexecutorservice;
        rx.e.d.a().b();
        return false;
    }

    private static Method b(ScheduledExecutorService scheduledexecutorservice)
    {
        scheduledexecutorservice = scheduledexecutorservice.getClass().getMethods();
        int l = scheduledexecutorservice.length;
        for (int k = 0; k < l; k++)
        {
            Method method = scheduledexecutorservice[k];
            if (!method.getName().equals("setRemoveOnCancelPolicy"))
            {
                continue;
            }
            Class aclass[] = method.getParameterTypes();
            if (aclass.length == 1 && aclass[0] == Boolean.TYPE)
            {
                return method;
            }
        }

        return null;
    }

    public final Y a(a a1)
    {
        return a(a1, 0L, null);
    }

    public final Y a(a a1, long l, TimeUnit timeunit)
    {
        if (b)
        {
            return rx.h.f.b();
        } else
        {
            return b(a1, l, timeunit);
        }
    }

    public final rx.internal.c.d b(a a1, long l, TimeUnit timeunit)
    {
        rx.internal.c.d d1 = new rx.internal.c.d(rx.e.f.a(a1));
        if (l <= 0L)
        {
            a1 = a.submit(d1);
        } else
        {
            a1 = a.schedule(d1, l, timeunit);
        }
        d1.a(a1);
        return d1;
    }

    public boolean isUnsubscribed()
    {
        return b;
    }

    public void unsubscribe()
    {
        b = true;
        a.shutdownNow();
        ScheduledExecutorService scheduledexecutorservice = a;
        f.remove(scheduledexecutorservice);
    }

    static 
    {
        boolean flag = Boolean.getBoolean("rx.scheduler.jdk6.purge-force");
        int k = rx.internal.util.e.b();
        if (!flag && (k == 0 || k >= 21))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        e = flag;
    }
}
