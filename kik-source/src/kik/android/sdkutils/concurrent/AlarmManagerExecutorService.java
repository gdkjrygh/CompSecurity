// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.sdkutils.concurrent;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.PowerManager;
import android.os.SystemClock;
import com.kik.sdkutils.KikServiceBase;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Delayed;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.c.b;
import org.c.c;

// Referenced classes of package kik.android.sdkutils.concurrent:
//            a, b

public class AlarmManagerExecutorService extends KikServiceBase
{
    private final class a extends ThreadPoolExecutor
        implements kik.android.sdkutils.concurrent.a
    {

        final AlarmManagerExecutorService a;

        static ScheduledFuture a(a a1, c c1, long l)
        {
            return a1.a(c1, l);
        }

        private ScheduledFuture a(c c1, long l)
        {
            long l1 = SystemClock.elapsedRealtime();
            AlarmManagerExecutorService.a(a).put(c1.b(), c1);
            kik.android.sdkutils.concurrent.AlarmManagerExecutorService.b(a).set(2, l1 + l, c1.c());
            return c1;
        }

        public final ScheduledFuture schedule(Runnable runnable, long l, TimeUnit timeunit)
        {
            runnable = a. new b(new kik.android.sdkutils.concurrent.b(runnable), l, timeunit);
            AlarmManagerExecutorService.a(a).put(kik.android.sdkutils.concurrent.b.b(runnable), runnable);
            l = SystemClock.elapsedRealtime();
            long l1 = kik.android.sdkutils.concurrent.b.c(runnable);
            kik.android.sdkutils.concurrent.AlarmManagerExecutorService.b(a).set(2, l + l1, b.d(runnable));
            return runnable;
        }

        public final ScheduledFuture schedule(Callable callable, long l, TimeUnit timeunit)
        {
            (new StringBuilder("Scheduling with delay ")).append(l).append(" ").append(timeunit);
            callable = a. new b(callable, l, timeunit);
            l = SystemClock.elapsedRealtime();
            long l1 = kik.android.sdkutils.concurrent.b.c(callable);
            AlarmManagerExecutorService.a(a).put(kik.android.sdkutils.concurrent.b.b(callable), callable);
            kik.android.sdkutils.concurrent.AlarmManagerExecutorService.b(a).set(2, l + l1, b.d(callable));
            return callable;
        }

        public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long l, long l1, TimeUnit timeunit)
        {
            runnable = a. new b(new kik.android.sdkutils.concurrent.b(runnable), l, l1, timeunit, (byte)0);
            l = SystemClock.elapsedRealtime();
            l1 = kik.android.sdkutils.concurrent.b.c(runnable);
            AlarmManagerExecutorService.a(a).put(kik.android.sdkutils.concurrent.b.b(runnable), runnable);
            kik.android.sdkutils.concurrent.AlarmManagerExecutorService.b(a).setRepeating(2, l1 + l, b.e(runnable), b.d(runnable));
            return runnable;
        }

        public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long l, long l1, TimeUnit timeunit)
        {
            runnable = a. new c(new kik.android.sdkutils.concurrent.b(runnable), l, l1, timeunit);
            return a(runnable, runnable.d());
        }

        public a()
        {
            a = AlarmManagerExecutorService.this;
            super(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue());
        }
    }

    private class b extends FutureTask
        implements ScheduledFuture
    {

        android.os.PowerManager.WakeLock a;
        final AlarmManagerExecutorService b;
        private long c;
        private long d;
        private final long e;
        private final long f;
        private final String g;
        private final PendingIntent h;

        static void a(b b1)
        {
            b1.g();
        }

        static String b(b b1)
        {
            return b1.g;
        }

        static long c(b b1)
        {
            return b1.e;
        }

        static PendingIntent d(b b1)
        {
            return b1.h;
        }

        static long e(b b1)
        {
            return b1.f;
        }

        private static long f()
        {
            return TimeUnit.MILLISECONDS.convert(System.nanoTime(), TimeUnit.NANOSECONDS);
        }

        private void g()
        {
            this;
            JVM INSTR monitorenter ;
            h();
            (new StringBuilder("Acquiring wake lock for task: ")).append(g);
            a = kik.android.sdkutils.concurrent.AlarmManagerExecutorService.c(b).newWakeLock(1, "KikExecutor");
            a.acquire();
            AlarmManagerExecutorService.d(b);
            this;
            JVM INSTR monitorexit ;
            return;
            Exception exception;
            exception;
            throw exception;
        }

        private void h()
        {
            this;
            JVM INSTR monitorenter ;
            if (a != null && a.isHeld())
            {
                (new StringBuilder("Releasing wake lock for task: ")).append(g);
                a.release();
                a = null;
                AlarmManagerExecutorService.e(b);
            }
            this;
            JVM INSTR monitorexit ;
            return;
            Exception exception;
            exception;
            throw exception;
        }

        public final boolean a()
        {
            return f > 0L;
        }

        public final String b()
        {
            return g;
        }

        public final PendingIntent c()
        {
            return h;
        }

        public boolean cancel(boolean flag)
        {
            (new StringBuilder("Cancelling execution for tag ")).append(g);
            flag = super.cancel(flag);
            a a1 = AlarmManagerExecutorService.f(b);
            AlarmManagerExecutorService.a(a1.a).remove(g);
            a1.remove(this);
            kik.android.sdkutils.concurrent.AlarmManagerExecutorService.b(a1.a).cancel(h);
            h();
            return flag;
        }

        public int compareTo(Object obj)
        {
            obj = (Delayed)obj;
            return Long.valueOf(getDelay(TimeUnit.NANOSECONDS)).compareTo(Long.valueOf(((Delayed) (obj)).getDelay(TimeUnit.NANOSECONDS)));
        }

        public final long d()
        {
            return e;
        }

        public final long e()
        {
            return f;
        }

        public long getDelay(TimeUnit timeunit)
        {
            long l = f();
            if (d <= 0L)
            {
                return (c + e) - l;
            }
            if (a())
            {
                return (d + f) - l;
            } else
            {
                return d - l;
            }
        }

        public void run()
        {
            if (a())
            {
                runAndReset();
                return;
            } else
            {
                d = f();
                super.run();
                h();
                return;
            }
        }

        protected boolean runAndReset()
        {
            d = f();
            boolean flag = super.runAndReset();
            h();
            return flag;
        }

        private b(Callable callable, long l, long l1, TimeUnit timeunit)
        {
            long l2 = -1L;
            b = AlarmManagerExecutorService.this;
            super(callable);
            d = 0L;
            c = f();
            e = TimeUnit.MILLISECONDS.convert(l, timeunit);
            if (l1 == -1L)
            {
                l = l2;
            } else
            {
                l = TimeUnit.MILLISECONDS.convert(l1, timeunit);
            }
            f = l;
            g = (new StringBuilder("com.kik-")).append(UUID.randomUUID()).toString();
            h = AlarmManagerExecutorService.a(AlarmManagerExecutorService.this, g);
        }

        b(Callable callable, long l, long l1, TimeUnit timeunit, 
                byte byte0)
        {
            this(callable, l, l1, timeunit);
        }

        public b(Callable callable, long l, TimeUnit timeunit)
        {
            this(callable, l, -1L, timeunit);
        }
    }

    private final class c extends b
    {

        final AlarmManagerExecutorService c;

        protected final boolean runAndReset()
        {
            boolean flag = super.runAndReset();
            if (!isCancelled())
            {
                a.a(AlarmManagerExecutorService.f(c), this, e());
            }
            return flag;
        }

        public c(Callable callable, long l, long l1, TimeUnit timeunit)
        {
            c = AlarmManagerExecutorService.this;
            super(callable, l, l1, timeunit, (byte)0);
        }
    }


    private static final org.c.b a = org.c.c.a("KikExecutor");
    private a b;
    private ConcurrentHashMap c;
    private AlarmManager d;
    private PowerManager e;
    private int f;

    public AlarmManagerExecutorService()
    {
        b = new a();
        c = new ConcurrentHashMap();
        f = 0;
    }

    private PendingIntent a(String s)
    {
        Intent intent = new Intent(getApplicationContext(), kik/android/sdkutils/concurrent/AlarmManagerExecutorService);
        intent.putExtra("TAG", s);
        intent.setAction(s);
        return PendingIntent.getService(getApplicationContext(), 0, intent, 0x8000000);
    }

    static PendingIntent a(AlarmManagerExecutorService alarmmanagerexecutorservice, String s)
    {
        return alarmmanagerexecutorservice.a(s);
    }

    static ConcurrentHashMap a(AlarmManagerExecutorService alarmmanagerexecutorservice)
    {
        return alarmmanagerexecutorservice.c;
    }

    static AlarmManager b(AlarmManagerExecutorService alarmmanagerexecutorservice)
    {
        return alarmmanagerexecutorservice.d;
    }

    static PowerManager c(AlarmManagerExecutorService alarmmanagerexecutorservice)
    {
        return alarmmanagerexecutorservice.e;
    }

    static int d(AlarmManagerExecutorService alarmmanagerexecutorservice)
    {
        int i = alarmmanagerexecutorservice.f;
        alarmmanagerexecutorservice.f = i + 1;
        return i;
    }

    static int e(AlarmManagerExecutorService alarmmanagerexecutorservice)
    {
        int i = alarmmanagerexecutorservice.f;
        alarmmanagerexecutorservice.f = i - 1;
        return i;
    }

    static a f(AlarmManagerExecutorService alarmmanagerexecutorservice)
    {
        return alarmmanagerexecutorservice.b;
    }

    protected final void a(Intent intent)
    {
        b b1;
label0:
        {
            if (d == null)
            {
                e = (PowerManager)getSystemService("power");
            }
            if (d == null)
            {
                d = (AlarmManager)getSystemService("alarm");
            }
            if (intent != null)
            {
                intent = intent.getAction();
                if (intent != null && intent.startsWith("com.kik-"))
                {
                    b1 = (b)c.get(intent);
                    if (b1 != null)
                    {
                        break label0;
                    }
                    d.cancel(a(((String) (intent))));
                }
            }
            return;
        }
        b.a(b1);
        if (!b1.a())
        {
            c.remove(kik.android.sdkutils.concurrent.b.b(b1));
        }
        b.submit(b1);
    }

    public void onDestroy()
    {
        Iterator iterator = b.shutdownNow().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Runnable runnable = (Runnable)iterator.next();
            if (runnable instanceof b)
            {
                ((b)runnable).cancel(true);
            }
        } while (true);
        super.onDestroy();
    }

}
