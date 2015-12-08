// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package crittercism.android;

import android.os.ConditionVariable;
import android.os.Process;
import android.os.SystemClock;
import com.crittercism.app.Transaction;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.ParseException;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package crittercism.android:
//            cg, dz, bh, dx, 
//            cf, ed, aw, br, 
//            bp, by, az, di, 
//            ea, dg

public final class bg extends Transaction
    implements cg
{
    static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        public static final a c;
        public static final a d;
        public static final a e;
        public static final a f;
        public static final a g;
        public static final a h;
        public static final a i;
        private static final a j[];

        public static a valueOf(String s1)
        {
            return (a)Enum.valueOf(crittercism/android/bg$a, s1);
        }

        public static a[] values()
        {
            return (a[])j.clone();
        }

        static 
        {
            a = new a("CREATED", 0);
            b = new a("STARTED", 1);
            c = new a("SUCCESS", 2);
            d = new a("SLOW", 3);
            e = new a("FAILED", 4);
            f = new a("TIMEOUT", 5);
            g = new a("CRASHED", 6);
            h = new a("ABORTED", 7);
            i = new a("INTERRUPTED", 8);
            j = (new a[] {
                a, b, c, d, e, f, g, h, i
            });
        }

        private a(String s1, int i1)
        {
            super(s1, i1);
        }
    }


    private static ExecutorService b = Executors.newSingleThreadExecutor(new dz());
    private static ScheduledExecutorService c = Executors.newScheduledThreadPool(1, new dz());
    private static List o = new LinkedList();
    private static volatile long p = 0L;
    private static volatile long q = 0L;
    private static final int r[] = {
        32, 544, 32, 32, 32, 32, 32, 32, 32, 32, 
        32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 
        32, 8224
    };
    private static bg s = null;
    private static bh t = new bh();
    private String d;
    private long e;
    private int f;
    private long g;
    private long h;
    private long i;
    private a j;
    private Map k;
    private String l;
    private long m;
    private ScheduledFuture n;

    public bg(az az, String s1)
    {
        int i1 = -1;
        super();
        e = -1L;
        f = -1;
        n = null;
        if (s1.length() > 255)
        {
            dx.c("Crittercism", "Transaction name exceeds 255 characters! Truncating to first 255 characters.");
            d = s1.substring(0, 255);
        } else
        {
            d = s1;
        }
        j = a.a;
        k = new HashMap();
        a = az;
        l = cf.a.a();
        e = -1L;
        az = t.d.optJSONObject(s1);
        if (az != null)
        {
            i1 = az.optInt("value", -1);
        }
        f = i1;
    }

    private bg(bg bg1)
    {
        e = -1L;
        f = -1;
        n = null;
        d = bg1.d;
        e = bg1.e;
        f = bg1.f;
        g = bg1.g;
        h = bg1.h;
        j = bg1.j;
        k = bg1.k;
        l = bg1.l;
        i = bg1.i;
        m = bg1.m;
    }

    public bg(JSONArray jsonarray)
    {
        e = -1L;
        f = -1;
        n = null;
        d = jsonarray.getString(0);
        j = a.values()[jsonarray.getInt(1)];
        e = (int)(jsonarray.getDouble(2) * 1000D);
        f = jsonarray.optInt(3, -1);
        k = new HashMap();
        JSONObject jsonobject = jsonarray.getJSONObject(4);
        String s1;
        for (Iterator iterator = jsonobject.keys(); iterator.hasNext(); k.put(s1, jsonobject.getString(s1)))
        {
            s1 = (String)iterator.next();
        }

        g = ed.a.a(jsonarray.getString(5));
        h = ed.a.a(jsonarray.getString(6));
        i = (long)(jsonarray.optDouble(7, 0.0D) * Math.pow(10D, 9D));
        l = cf.a.a();
    }

    static a a(bg bg1)
    {
        return bg1.j;
    }

    private void a(long l1)
    {
        if (l())
        {
            n = c.schedule(new di() {

                final bg a;

                public final void a()
                {
                    bg.b(a);
                }

            
            {
                a = bg.this;
                super();
            }
            }, l1, TimeUnit.MILLISECONDS);
        }
    }

    public static void a(aw aw1)
    {
        br br1;
        Object obj;
        long l1;
        br1 = aw1.w();
        obj = br1.c();
        l1 = System.currentTimeMillis();
        obj = ((List) (obj)).iterator();
_L1:
        Object obj1;
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break MISSING_BLOCK_LABEL_117;
            }
            obj1 = (JSONArray)((by)(bp)((Iterator) (obj)).next()).a();
        } while (obj1 == null);
        obj1 = new bg(((JSONArray) (obj1)));
        obj1.h = l1;
        obj1.j = a.h;
        aw1.x().a(((cg) (obj1)));
          goto _L1
        Object obj2;
        obj2;
        try
        {
            dx.a(((Throwable) (obj2)));
        }
        // Misplaced declaration of an exception variable
        catch (aw aw1)
        {
            throw aw1;
        }
        // Misplaced declaration of an exception variable
        catch (aw aw1)
        {
            dx.a(aw1);
            return;
        }
          goto _L1
        obj2;
        dx.a(((Throwable) (obj2)));
          goto _L1
        br1.a();
        return;
    }

    public static void a(az az)
    {
        Object obj;
        q = System.nanoTime();
        obj = new LinkedList();
        Iterator iterator;
        synchronized (o)
        {
            ((List) (obj)).addAll(o);
        }
        iterator = ((List) (obj)).iterator();
_L4:
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_147;
        }
        obj1 = (bg)iterator.next();
        obj1;
        JVM INSTR monitorenter ;
        if (((bg) (obj1)).j == a.b)
        {
            if (((bg) (obj1)).m < p)
            {
                break MISSING_BLOCK_LABEL_128;
            }
            if (((bg) (obj1)).m <= q)
            {
                obj1.i = ((bg) (obj1)).i + (q - ((bg) (obj1)).m);
            }
        }
_L2:
        ((bg) (obj1)).r();
        continue; /* Loop/switch isn't completed */
        az;
        throw az;
        obj1.i = ((bg) (obj1)).i + (q - p);
        if (true) goto _L2; else goto _L1
_L1:
        obj = new FutureTask(new di(((List) (obj)), az) {

            final List a;
            final az b;

            public final void a()
            {
                for (Iterator iterator1 = a.iterator(); iterator1.hasNext();)
                {
                    synchronized ((bg)iterator1.next())
                    {
                        if (bg.a(bg1) == a.b)
                        {
                            b.o.b(bg1);
                        }
                    }
                }

            }

            
            {
                a = list;
                b = az1;
                super();
            }
        }, null);
        synchronized (b)
        {
            b.execute(((Runnable) (obj)));
        }
        try
        {
            ((FutureTask) (obj)).get();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (az az)
        {
            dx.a(az);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (az az)
        {
            dx.a(az);
        }
        return;
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void a(a a1)
    {
        a a2;
        if (a1 != a.c && a1 != a.e)
        {
            a2 = a.i;
        }
        if (j == a.b)
        {
            r();
            b(a1);
        } else
        if (j != a.f)
        {
            dx.b("Crittercism", (new StringBuilder("Transaction ")).append(d).append(" is not running. Either it has not been started or it has been stopped.").toString(), new IllegalStateException("Transaction is not running"));
            return;
        }
    }

    public static void a(bh bh1)
    {
        t = bh1;
    }

    public static List b(az az)
    {
        int i1;
        obj = new LinkedList();
        long l1;
        long l2;
        synchronized (o)
        {
            ((List) (obj)).addAll(o);
        }
        l1 = System.currentTimeMillis();
        l2 = System.nanoTime();
        i1 = ((List) (obj)).size() - 1;
_L3:
        if (i1 < 0)
        {
            break MISSING_BLOCK_LABEL_147;
        }
        obj1 = (bg)((List) (obj)).get(i1);
        obj1;
        JVM INSTR monitorenter ;
        if (((bg) (obj1)).j != a.b)
        {
            break MISSING_BLOCK_LABEL_131;
        }
        obj1.h = l1;
        obj1.j = a.g;
        if (l())
        {
            obj1.i = (l2 - Math.max(p, ((bg) (obj1)).m)) + ((bg) (obj1)).i;
        }
_L1:
        ((bg) (obj1)).r();
        i1--;
        continue; /* Loop/switch isn't completed */
        ((List) (obj)).remove(i1);
          goto _L1
        az;
        throw az;
        FutureTask futuretask = new FutureTask(new di(az) {

            final az a;

            public final void a()
            {
                ea ea1 = ea.k;
                a.o.a();
            }

            
            {
                a = az1;
                super();
            }
        }, null);
        synchronized (b)
        {
            b.execute(futuretask);
            b.shutdown();
        }
        futuretask.get();
        return ((List) (obj));
        az;
        dx.a(az);
        return ((List) (obj));
        az;
        dx.a(az);
        return ((List) (obj));
        if (true) goto _L3; else goto _L2
_L2:
    }

    private void b(int i1)
    {
        this;
        JVM INSTR monitorenter ;
        if (i1 >= 0) goto _L2; else goto _L1
_L1:
        dx.c("Crittercism", "Ignoring Transaction.setValue(int) call. Negative parameter provided.");
_L3:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (j != a.a)
        {
            break MISSING_BLOCK_LABEL_40;
        }
        f = i1;
          goto _L3
        Exception exception;
        exception;
        throw exception;
        di di;
        if (j != a.b)
        {
            break MISSING_BLOCK_LABEL_97;
        }
        f = i1;
        di = new di(new bg(this)) {

            final bg a;
            final bg b;

            public final void a()
            {
                b.a.r.a.block();
                b.a.o.a(a);
            }

            
            {
                b = bg.this;
                a = bg2;
                super();
            }
        };
        synchronized (b)
        {
            b.execute(di);
        }
          goto _L3
        exception1;
        executorservice;
        JVM INSTR monitorexit ;
        throw exception1;
        dx.b("Crittercism", (new StringBuilder("Transaction ")).append(d).append(" no longer in progress. Ignoring setValue(int) call.").toString(), new IllegalStateException("Transaction no longer in progress"));
          goto _L3
    }

    private void b(a a1)
    {
        j = a1;
        h = System.currentTimeMillis();
        long l1 = System.nanoTime();
        if (l())
        {
            i = (l1 - Math.max(p, m)) + i;
        }
        di di;
        synchronized (o)
        {
            o.remove(this);
        }
        di = new di(new bg(this)) {

            final bg a;
            final bg b;

            public final void a()
            {
                b.a.r.a.block();
                b.a.o.a(bg.c(b));
                b.a.p.a(a);
            }

            
            {
                b = bg.this;
                a = bg2;
                super();
            }
        };
        synchronized (b)
        {
            b.execute(di);
        }
    }

    static void b(bg bg1)
    {
        bg1.s();
    }

    static String c(bg bg1)
    {
        return bg1.l;
    }

    public static void c(az az)
    {
        bg bg1 = new bg(az, "App Load");
        s = bg1;
        bg1;
        JVM INSTR monitorenter ;
        long l1 = m();
        if (l1 == -1L)
        {
            break MISSING_BLOCK_LABEL_187;
        }
        s.j = a.b;
        bg bg2 = s;
        long l2 = SystemClock.uptimeMillis();
        bg2.g = System.currentTimeMillis() - (l2 - l1);
        bg2 = s;
        l1 = TimeUnit.NANOSECONDS.convert(l1, TimeUnit.MILLISECONDS);
        l2 = TimeUnit.NANOSECONDS.convert(SystemClock.uptimeMillis(), TimeUnit.MILLISECONDS);
        bg2.m = System.nanoTime() - (l2 - l1);
        s.e = t.a(s.d);
        synchronized (o)
        {
            o.add(s);
        }
        obj = new di(az, new bg(s)) {

            final az a;
            final bg b;

            public final void a()
            {
                a.r.a.block();
                a.o.a(b);
            }

            
            {
                a = az1;
                b = bg1;
                super();
            }
        };
        synchronized (b)
        {
            b.execute(((Runnable) (obj)));
            s.a(s.e);
        }
        bg1;
        JVM INSTR monitorexit ;
        return;
        az;
        obj;
        JVM INSTR monitorexit ;
        throw az;
        az;
        bg1;
        JVM INSTR monitorexit ;
        throw az;
        az;
        throw az;
        exception;
        az;
        JVM INSTR monitorexit ;
        throw exception;
        az;
        dx.a(az);
        return;
    }

    public static void f()
    {
        p = System.nanoTime();
        LinkedList linkedlist = new LinkedList();
        synchronized (o)
        {
            linkedlist.addAll(o);
        }
        if (s != null && q == 0L)
        {
            synchronized (s)
            {
                bg bg1 = s;
                bg1.i = bg1.i + (p - s.m);
            }
        }
        obj1 = linkedlist.iterator();
_L7:
        if (!((Iterator) (obj1)).hasNext())
        {
            break MISSING_BLOCK_LABEL_194;
        }
        obj = (bg)((Iterator) (obj1)).next();
        obj;
        JVM INSTR monitorenter ;
        if (((bg) (obj)).j != a.b) goto _L2; else goto _L1
_L1:
        if (((bg) (obj)).n == null || !((bg) (obj)).n.isCancelled()) goto _L4; else goto _L3
_L3:
        ((bg) (obj)).a(((bg) (obj)).e - TimeUnit.MILLISECONDS.convert(((bg) (obj)).i, TimeUnit.NANOSECONDS));
_L2:
        continue; /* Loop/switch isn't completed */
        obj1;
        throw obj1;
_L4:
        if (((bg) (obj)).n == null)
        {
            ((bg) (obj)).a(((bg) (obj)).e);
        }
        if (true) goto _L2; else goto _L5
_L5:
        return;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public static void g()
    {
        try
        {
            if (s != null)
            {
                s.b();
            }
            return;
        }
        catch (ThreadDeath threaddeath)
        {
            throw threaddeath;
        }
        catch (Throwable throwable)
        {
            dx.a(throwable);
        }
    }

    public static void i()
    {
        Object obj1 = new LinkedList();
        synchronized (o)
        {
            ((List) (obj1)).addAll(o);
        }
        for (obj1 = ((List) (obj1)).iterator(); ((Iterator) (obj1)).hasNext();)
        {
            synchronized ((bg)((Iterator) (obj1)).next())
            {
                if (((bg) (obj)).j == a.b)
                {
                    obj.e = t.a(((bg) (obj)).d);
                    ((bg) (obj)).r();
                    ((bg) (obj)).a(((bg) (obj)).e);
                }
            }
        }

    }

    private static boolean l()
    {
        return p > q;
    }

    private static long m()
    {
        Object obj = new long[1];
        int i1 = Process.myPid();
        String s1 = (new StringBuilder("/proc/")).append(i1).append("/stat").toString();
        boolean flag;
        try
        {
            flag = ((Boolean)android/os/Process.getDeclaredMethod("readProcFile", new Class[] {
                java/lang/String, [I, [Ljava/lang/String;, [J, [F
            }).invoke(null, new Object[] {
                s1, r, null, obj, null
            })).booleanValue();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            dx.a(((Throwable) (obj)));
            return -1L;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            dx.a(((Throwable) (obj)));
            return -1L;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            dx.a(((Throwable) (obj)));
            return -1L;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            dx.a(((Throwable) (obj)));
            return -1L;
        }
        if (!flag)
        {
            return -1L;
        } else
        {
            return obj[0] * 10L;
        }
    }

    private void n()
    {
        this;
        JVM INSTR monitorenter ;
        if (j != a.a)
        {
            break MISSING_BLOCK_LABEL_125;
        }
        j = a.b;
        g = System.currentTimeMillis();
        m = System.nanoTime();
        e = t.a(d);
        synchronized (o)
        {
            o.add(this);
        }
        di di = new di(new bg(this)) {

            final bg a;
            final bg b;

            public final void a()
            {
                b.a.r.a.block();
                b.a.o.a(a);
            }

            
            {
                b = bg.this;
                a = bg2;
                super();
            }
        };
        synchronized (b)
        {
            b.execute(di);
            a(e);
        }
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        exception1;
        obj;
        JVM INSTR monitorexit ;
        throw exception1;
        dx.b("Crittercism", (new StringBuilder("Transaction ")).append(d).append(" has already been started.").toString(), new IllegalStateException("Transaction has already started"));
          goto _L1
    }

    private void o()
    {
        this;
        JVM INSTR monitorenter ;
        a(a.c);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    private void p()
    {
        this;
        JVM INSTR monitorenter ;
        a(a.e);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    private void q()
    {
        this;
        JVM INSTR monitorenter ;
        a(a.i);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    private void r()
    {
        this;
        JVM INSTR monitorenter ;
        if (n != null)
        {
            n.cancel(false);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    private void s()
    {
        this;
        JVM INSTR monitorenter ;
        if (j == a.b)
        {
            b(a.f);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    private int t()
    {
        this;
        JVM INSTR monitorenter ;
        int i1 = f;
        this;
        JVM INSTR monitorexit ;
        return i1;
        Exception exception;
        exception;
        throw exception;
    }

    public final void a()
    {
        try
        {
            n();
            return;
        }
        catch (ThreadDeath threaddeath)
        {
            throw threaddeath;
        }
        catch (Throwable throwable)
        {
            dx.a(throwable);
        }
    }

    public final void a(int i1)
    {
        try
        {
            b(i1);
            return;
        }
        catch (ThreadDeath threaddeath)
        {
            throw threaddeath;
        }
        catch (Throwable throwable)
        {
            dx.a(throwable);
        }
    }

    public final void a(OutputStream outputstream)
    {
        JSONArray jsonarray = null;
        JSONArray jsonarray1 = j();
        jsonarray = jsonarray1;
_L2:
        if (jsonarray != null)
        {
            outputstream.write(jsonarray.toString().getBytes());
        }
        return;
        JSONException jsonexception;
        jsonexception;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final void b()
    {
        try
        {
            o();
            return;
        }
        catch (ThreadDeath threaddeath)
        {
            throw threaddeath;
        }
        catch (Throwable throwable)
        {
            dx.a(throwable);
        }
    }

    public final void c()
    {
        try
        {
            p();
            return;
        }
        catch (ThreadDeath threaddeath)
        {
            throw threaddeath;
        }
        catch (Throwable throwable)
        {
            dx.a(throwable);
        }
    }

    public final int d()
    {
        int i1;
        try
        {
            i1 = t();
        }
        catch (ThreadDeath threaddeath)
        {
            throw threaddeath;
        }
        catch (Throwable throwable)
        {
            dx.a(throwable);
            return -1;
        }
        return i1;
    }

    public final String e()
    {
        return l;
    }

    public final void h()
    {
        try
        {
            q();
            return;
        }
        catch (ThreadDeath threaddeath)
        {
            throw threaddeath;
        }
        catch (Throwable throwable)
        {
            dx.a(throwable);
        }
    }

    public final JSONArray j()
    {
        JSONArray jsonarray = (new JSONArray()).put(d).put(j.ordinal()).put((double)e / 1000D);
        Object obj;
        if (f == -1)
        {
            obj = JSONObject.NULL;
        } else
        {
            obj = Integer.valueOf(f);
        }
        obj = jsonarray.put(obj).put(new JSONObject(k)).put(ed.a.a(new Date(g))).put(ed.a.a(new Date(h)));
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            ((JSONArray) (obj)).put((double)Math.round(((double)i / Math.pow(10D, 9D)) * 1000D) / 1000D);
            return ((JSONArray) (obj));
        } else
        {
            ((JSONArray) (obj)).put(JSONObject.NULL);
            return ((JSONArray) (obj));
        }
    }

    public final a k()
    {
        return j;
    }

}
