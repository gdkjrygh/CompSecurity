// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.ConditionVariable;
import android.os.Process;
import android.os.SystemClock;
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
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class ZV extends cD
    implements aax
{
    static final class a extends Enum
    {

        private static final int a[] = {
            1, 2, 3, 4, 5, 6, 7, 8, 9
        };

        public static int[] a()
        {
            return (int[])a.clone();
        }

    }


    private static ExecutorService c = Executors.newSingleThreadExecutor(new abm());
    private static ScheduledExecutorService d = Executors.newScheduledThreadPool(1, new abm());
    private static List o = new LinkedList();
    private static volatile long p = 0L;
    private static volatile long q = 0L;
    private static final int r[] = {
        32, 544, 32, 32, 32, 32, 32, 32, 32, 32, 
        32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 
        32, 8224
    };
    private static ZV s = null;
    private static ZW t = new ZW();
    int b;
    private String e;
    private long f;
    private int g;
    private long h;
    private long i;
    private long j;
    private Map k;
    private String l;
    private long m;
    private ScheduledFuture n;

    private ZV(ZQ zq, String s1)
    {
        int i1 = -1;
        super();
        f = -1L;
        g = -1;
        n = null;
        if (s1.length() > 255)
        {
            e = s1.substring(0, 255);
        } else
        {
            e = s1;
        }
        b = 1;
        k = new HashMap();
        a = zq;
        l = aaw.a.a();
        f = -1L;
        zq = t.d.optJSONObject(s1);
        if (zq != null)
        {
            i1 = zq.optInt("value", -1);
        }
        g = i1;
    }

    private ZV(ZV zv)
    {
        f = -1L;
        g = -1;
        n = null;
        e = zv.e;
        f = zv.f;
        g = zv.g;
        h = zv.h;
        i = zv.i;
        b = zv.b;
        k = zv.k;
        l = zv.l;
        j = zv.j;
        m = zv.m;
    }

    public ZV(JSONArray jsonarray)
    {
        f = -1L;
        g = -1;
        n = null;
        e = jsonarray.getString(0);
        b = a.a()[jsonarray.getInt(1)];
        f = (int)(jsonarray.getDouble(2) * 1000D);
        g = jsonarray.optInt(3, -1);
        k = new HashMap();
        JSONObject jsonobject = jsonarray.getJSONObject(4);
        String s1;
        for (Iterator iterator = jsonobject.keys(); iterator.hasNext(); k.put(s1, jsonobject.getString(s1)))
        {
            s1 = (String)iterator.next();
        }

        h = abp.a.a(jsonarray.getString(5));
        i = abp.a.a(jsonarray.getString(6));
        j = (long)(jsonarray.optDouble(7, 0.0D) * Math.pow(10D, 9D));
        l = aaw.a.a();
    }

    static int a(ZV zv)
    {
        return zv.b;
    }

    public static List a(ZQ zq, boolean flag)
    {
        LinkedList linkedlist;
        int i1;
        linkedlist = new LinkedList();
        long l1;
        long l2;
        synchronized (o)
        {
            linkedlist.addAll(o);
        }
        l1 = System.currentTimeMillis();
        l2 = System.nanoTime();
        i1 = linkedlist.size() - 1;
_L4:
        if (i1 < 0)
        {
            break MISSING_BLOCK_LABEL_150;
        }
        obj = (ZV)linkedlist.get(i1);
        obj;
        JVM INSTR monitorenter ;
        if (((ZV) (obj)).b != 2)
        {
            break MISSING_BLOCK_LABEL_133;
        }
        obj.i = l1;
        obj.b = 7;
        if (f())
        {
            obj.j = (l2 - Math.max(p, ((ZV) (obj)).m)) + ((ZV) (obj)).j;
        }
_L1:
        ((ZV) (obj)).i();
        i1--;
        continue; /* Loop/switch isn't completed */
        linkedlist.remove(i1);
          goto _L1
        zq;
        throw zq;
        FutureTask futuretask = new FutureTask(new aba(zq) {

            private ZQ a;

            public final void a()
            {
                a.l.a();
            }

            
            {
                a = zq;
                super();
            }
        }, null);
        ExecutorService executorservice = c;
        executorservice;
        JVM INSTR monitorenter ;
        c.execute(futuretask);
        if (flag)
        {
            break MISSING_BLOCK_LABEL_206;
        }
        c.shutdown();
_L2:
        executorservice;
        JVM INSTR monitorexit ;
        futuretask.get();
        return linkedlist;
        zq.A.clear();
          goto _L2
        zq;
        throw zq;
        zq;
        abk.a(zq);
        return linkedlist;
        zq;
        abk.a(zq);
        return linkedlist;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static void a()
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
                ZV zv = s;
                zv.j = zv.j + (p - s.m);
            }
        }
        obj1 = linkedlist.iterator();
_L7:
        if (!((Iterator) (obj1)).hasNext())
        {
            break MISSING_BLOCK_LABEL_192;
        }
        obj = (ZV)((Iterator) (obj1)).next();
        obj;
        JVM INSTR monitorenter ;
        if (((ZV) (obj)).b != 2) goto _L2; else goto _L1
_L1:
        if (((ZV) (obj)).n == null || !((ZV) (obj)).n.isCancelled()) goto _L4; else goto _L3
_L3:
        ((ZV) (obj)).a(((ZV) (obj)).f - TimeUnit.MILLISECONDS.convert(((ZV) (obj)).j, TimeUnit.NANOSECONDS));
_L2:
        continue; /* Loop/switch isn't completed */
        obj1;
        throw obj1;
_L4:
        if (((ZV) (obj)).n == null)
        {
            ((ZV) (obj)).a(((ZV) (obj)).f);
        }
        if (true) goto _L2; else goto _L5
_L5:
        return;
        if (true) goto _L7; else goto _L6
_L6:
    }

    private void a(int i1)
    {
        b = i1;
        i = System.currentTimeMillis();
        long l1 = System.nanoTime();
        if (f())
        {
            j = (l1 - Math.max(p, m)) + j;
        }
        aba aba;
        synchronized (o)
        {
            o.remove(this);
        }
        aba = new aba(new ZV(this)) {

            private ZV a;
            private ZV b;

            public final void a()
            {
                if (ZV.a(a) != 3)
                {
                    Object obj1 = new Runnable() {

                        public final void run()
                        {
                        }

                    };
                    ExecutorService executorservice = b.a.r;
                    obj1 = new FutureTask(((Runnable) (obj1)), null);
                    executorservice.execute(((Runnable) (obj1)));
                    try
                    {
                        ((FutureTask) (obj1)).get();
                    }
                    catch (InterruptedException interruptedexception)
                    {
                        abk.a(interruptedexception);
                    }
                    catch (ExecutionException executionexception)
                    {
                        abk.a(executionexception);
                    }
                }
                b.a.o.b.block();
                b.a.l.a(ZV.c(b));
                b.a.m.a(a);
            }

            
            {
                b = ZV.this;
                a = zv1;
                super();
            }
        };
        synchronized (c)
        {
            c.execute(aba);
        }
    }

    private void a(long l1)
    {
        if (f())
        {
            n = d.schedule(new aba() {

                private ZV a;

                public final void a()
                {
                    ZV.b(a);
                }

            
            {
                a = ZV.this;
                super();
            }
            }, l1, TimeUnit.MILLISECONDS);
        }
    }

    public static void a(ZN zn)
    {
        aai aai1;
        Object obj;
        long l1;
        aai1 = zn.w();
        obj = aai1.c();
        l1 = System.currentTimeMillis();
        obj = ((List) (obj)).iterator();
_L1:
        Object obj1;
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break MISSING_BLOCK_LABEL_116;
            }
            obj1 = (JSONArray)((aap)(aag)((Iterator) (obj)).next()).a();
        } while (obj1 == null);
        obj1 = new ZV(((JSONArray) (obj1)));
        obj1.i = l1;
        obj1.b = 8;
        zn.x().a(((aax) (obj1)));
          goto _L1
        Object obj2;
        obj2;
        try
        {
            abk.a(((Throwable) (obj2)));
        }
        // Misplaced declaration of an exception variable
        catch (ZN zn)
        {
            throw zn;
        }
        // Misplaced declaration of an exception variable
        catch (ZN zn)
        {
            abk.a(zn);
            return;
        }
          goto _L1
        obj2;
        abk.a(((Throwable) (obj2)));
          goto _L1
        aai1.a();
        return;
    }

    public static void a(ZQ zq)
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
            break MISSING_BLOCK_LABEL_145;
        }
        obj1 = (ZV)iterator.next();
        obj1;
        JVM INSTR monitorenter ;
        if (((ZV) (obj1)).b == 2)
        {
            if (((ZV) (obj1)).m < p)
            {
                break MISSING_BLOCK_LABEL_126;
            }
            if (((ZV) (obj1)).m <= q)
            {
                obj1.j = ((ZV) (obj1)).j + (q - ((ZV) (obj1)).m);
            }
        }
_L2:
        ((ZV) (obj1)).i();
        continue; /* Loop/switch isn't completed */
        zq;
        throw zq;
        obj1.j = ((ZV) (obj1)).j + (q - p);
        if (true) goto _L2; else goto _L1
_L1:
        obj = new FutureTask(new aba(((List) (obj)), zq) {

            private List a;
            private ZQ b;

            public final void a()
            {
                for (Iterator iterator1 = a.iterator(); iterator1.hasNext();)
                {
                    synchronized ((ZV)iterator1.next())
                    {
                        if (ZV.a(zv) == 2)
                        {
                            b.l.b(zv);
                        }
                    }
                }

            }

            
            {
                a = list;
                b = zq;
                super();
            }
        }, null);
        synchronized (c)
        {
            c.execute(((Runnable) (obj)));
        }
        try
        {
            ((FutureTask) (obj)).get();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ZQ zq)
        {
            abk.a(zq);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ZQ zq)
        {
            abk.a(zq);
        }
        return;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static void a(ZW zw)
    {
        t = zw;
    }

    public static void b()
    {
        ZV zv;
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_14;
        }
        zv = s;
        zv.h();
        return;
        Object obj;
        obj;
        try
        {
            throw obj;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        catch (Throwable throwable)
        {
            abk.a(throwable);
        }
        break MISSING_BLOCK_LABEL_32;
        obj;
        abk.a(((Throwable) (obj)));
        return;
    }

    public static void b(ZQ zq)
    {
        ZV zv = new ZV(zq, "App Load");
        s = zv;
        zv;
        JVM INSTR monitorenter ;
        long l1 = g();
        if (l1 == -1L)
        {
            break MISSING_BLOCK_LABEL_185;
        }
        s.b = 2;
        ZV zv1 = s;
        long l2 = SystemClock.elapsedRealtime();
        zv1.h = System.currentTimeMillis() - (l2 - l1);
        zv1 = s;
        l1 = TimeUnit.NANOSECONDS.convert(l1, TimeUnit.MILLISECONDS);
        l2 = TimeUnit.NANOSECONDS.convert(SystemClock.elapsedRealtime(), TimeUnit.MILLISECONDS);
        zv1.m = System.nanoTime() - (l2 - l1);
        s.f = t.a(s.e);
        synchronized (o)
        {
            o.add(s);
        }
        obj = new aba(zq, new ZV(s)) {

            private ZQ a;
            private ZV b;

            public final void a()
            {
                a.o.b.block();
                a.l.a(b);
            }

            
            {
                a = zq;
                b = zv;
                super();
            }
        };
        synchronized (c)
        {
            c.execute(((Runnable) (obj)));
            s.a(s.f);
        }
        zv;
        JVM INSTR monitorexit ;
        return;
        zq;
        obj;
        JVM INSTR monitorexit ;
        throw zq;
        zq;
        zv;
        JVM INSTR monitorexit ;
        throw zq;
        zq;
        throw zq;
        exception;
        zq;
        JVM INSTR monitorexit ;
        throw exception;
        zq;
        abk.a(zq);
        return;
    }

    static void b(ZV zv)
    {
        zv.j();
    }

    static String c(ZV zv)
    {
        return zv.l;
    }

    public static void c()
    {
        Object obj1 = new LinkedList();
        synchronized (o)
        {
            ((List) (obj1)).addAll(o);
        }
        for (obj1 = ((List) (obj1)).iterator(); ((Iterator) (obj1)).hasNext();)
        {
            synchronized ((ZV)((Iterator) (obj1)).next())
            {
                if (((ZV) (obj)).b == 2)
                {
                    obj.f = t.a(((ZV) (obj)).e);
                    ((ZV) (obj)).i();
                    ((ZV) (obj)).a(((ZV) (obj)).f);
                }
            }
        }

    }

    private static boolean f()
    {
        return p > q;
    }

    private static long g()
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
            abk.a(((Throwable) (obj)));
            return -1L;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            abk.a(((Throwable) (obj)));
            return -1L;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            abk.a(((Throwable) (obj)));
            return -1L;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            abk.a(((Throwable) (obj)));
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

    private void h()
    {
        this;
        JVM INSTR monitorenter ;
        if (b != 2) goto _L2; else goto _L1
_L1:
        i();
        a(3);
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (b != 6)
        {
            (new StringBuilder("Transaction ")).append(e).append(" is not running. Either it has not been started or it has been stopped.");
            new IllegalStateException("Transaction is not running");
        }
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    private void i()
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

    private void j()
    {
        this;
        JVM INSTR monitorenter ;
        if (b == 2)
        {
            a(6);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final void a(OutputStream outputstream)
    {
        JSONArray jsonarray = null;
        JSONArray jsonarray1 = d();
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

    public final JSONArray d()
    {
        JSONArray jsonarray = (new JSONArray()).put(e).put(b - 1).put((double)f / 1000D);
        Object obj;
        if (g == -1)
        {
            obj = JSONObject.NULL;
        } else
        {
            obj = Integer.valueOf(g);
        }
        obj = jsonarray.put(obj).put(new JSONObject(k)).put(abp.a.a(new Date(h))).put(abp.a.a(new Date(i)));
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            ((JSONArray) (obj)).put((double)Math.round(((double)j / Math.pow(10D, 9D)) * 1000D) / 1000D);
            return ((JSONArray) (obj));
        } else
        {
            ((JSONArray) (obj)).put(JSONObject.NULL);
            return ((JSONArray) (obj));
        }
    }

    public final String e()
    {
        return l;
    }

}
