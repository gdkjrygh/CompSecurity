// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

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

// Referenced classes of package b.a:
//            cz, ex, ap, eu, 
//            ao, cy, fc, ai, 
//            q, al, n, be, 
//            bc, cn, ah, am, 
//            aj, ak

public final class ag extends Transaction
    implements cz
{

    private static ExecutorService b = Executors.newSingleThreadExecutor(new ex());
    private static ScheduledExecutorService c = Executors.newScheduledThreadPool(1, new ex());
    private static List o = new LinkedList();
    private static volatile long p = 0L;
    private static volatile long q = 0L;
    private static volatile boolean r = false;
    private static final int s[] = {
        32, 544, 32, 32, 32, 32, 32, 32, 32, 32, 
        32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 
        32, 8224
    };
    private static ag t = null;
    private static ap u = new ap();
    private String d;
    private long e;
    private int f;
    private long g;
    private long h;
    private long i;
    private ao j;
    private Map k;
    private String l;
    private long m;
    private ScheduledFuture n;

    private ag(ag ag1)
    {
        e = -1L;
        f = -1;
        n = null;
        d = ag1.d;
        e = ag1.e;
        f = ag1.f;
        g = ag1.g;
        h = ag1.h;
        j = ag1.j;
        k = ag1.k;
        l = ag1.l;
        i = ag1.i;
        m = ag1.m;
    }

    public ag(q q1, String s1)
    {
        int i1 = -1;
        super();
        e = -1L;
        f = -1;
        n = null;
        if (s1.length() > 255)
        {
            eu.c("Transaction name exceeds 255 characters! Truncating to first 255 characters.");
            d = s1.substring(0, 255);
        } else
        {
            d = s1;
        }
        j = ao.a;
        k = new HashMap();
        a = q1;
        l = cy.a.a();
        e = -1L;
        q1 = u.d.optJSONObject(s1);
        if (q1 != null)
        {
            i1 = q1.optInt("value", -1);
        }
        f = i1;
    }

    public ag(JSONArray jsonarray)
    {
        e = -1L;
        f = -1;
        n = null;
        d = jsonarray.getString(0);
        j = ao.values()[jsonarray.getInt(1)];
        e = (int)(jsonarray.getDouble(2) * 1000D);
        f = jsonarray.optInt(3, -1);
        k = new HashMap();
        JSONObject jsonobject = jsonarray.getJSONObject(4);
        String s1;
        for (Iterator iterator = jsonobject.keys(); iterator.hasNext(); k.put(s1, jsonobject.getString(s1)))
        {
            s1 = (String)iterator.next();
        }

        g = fc.a.a(jsonarray.getString(5));
        h = fc.a.a(jsonarray.getString(6));
        i = (long)(jsonarray.optDouble(7, 0.0D) * Math.pow(10D, 9D));
        l = cy.a.a();
    }

    static ao a(ag ag1)
    {
        return ag1.j;
    }

    public static List a(q q1, boolean flag)
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
            break MISSING_BLOCK_LABEL_153;
        }
        obj = (ag)linkedlist.get(i1);
        obj;
        JVM INSTR monitorenter ;
        if (((ag) (obj)).j != ao.b)
        {
            break MISSING_BLOCK_LABEL_136;
        }
        obj.h = l1;
        obj.j = ao.g;
        if (n())
        {
            obj.i = (l2 - Math.max(p, ((ag) (obj)).m)) + ((ag) (obj)).i;
        }
_L1:
        ((ag) (obj)).t();
        i1--;
        continue; /* Loop/switch isn't completed */
        linkedlist.remove(i1);
          goto _L1
        q1;
        throw q1;
        FutureTask futuretask = new FutureTask(new ai(q1), null);
        ExecutorService executorservice = b;
        executorservice;
        JVM INSTR monitorenter ;
        b.execute(futuretask);
        if (flag)
        {
            break MISSING_BLOCK_LABEL_209;
        }
        b.shutdown();
_L2:
        executorservice;
        JVM INSTR monitorexit ;
        futuretask.get();
        return linkedlist;
        q1.E.clear();
          goto _L2
        q1;
        throw q1;
        q1;
        eu.a(q1);
        return linkedlist;
        q1;
        eu.a(q1);
        return linkedlist;
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void a(long l1)
    {
        if (n())
        {
            n = c.schedule(new al(this), l1, TimeUnit.MILLISECONDS);
        }
    }

    private void a(ao ao1)
    {
        ao ao2;
        if (ao1 != ao.c && ao1 != ao.e)
        {
            ao2 = ao.i;
        }
        if (j == ao.b)
        {
            t();
            b(ao1);
        } else
        if (j != ao.f)
        {
            eu.b((new StringBuilder("Transaction ")).append(d).append(" is not running. Either it has not been started or it has been stopped.").toString(), new IllegalStateException("Transaction is not running"));
            return;
        }
    }

    public static void a(ap ap1)
    {
        u = ap1;
    }

    public static void a(n n1)
    {
        be be1;
        Object obj;
        long l1;
        be1 = n1.w();
        obj = be1.c();
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
            obj1 = (JSONArray)((cn)(bc)((Iterator) (obj)).next()).a();
        } while (obj1 == null);
        obj1 = new ag(((JSONArray) (obj1)));
        obj1.h = l1;
        obj1.j = ao.h;
        n1.x().a(((cz) (obj1)));
          goto _L1
        Object obj2;
        obj2;
        try
        {
            eu.a(((Throwable) (obj2)));
        }
        // Misplaced declaration of an exception variable
        catch (n n1)
        {
            throw n1;
        }
        // Misplaced declaration of an exception variable
        catch (n n1)
        {
            eu.a(n1);
            return;
        }
          goto _L1
        obj2;
        eu.a(((Throwable) (obj2)));
          goto _L1
        be1.a();
        return;
    }

    public static void a(q q1)
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
        obj1 = (ag)iterator.next();
        obj1;
        JVM INSTR monitorenter ;
        if (((ag) (obj1)).j == ao.b)
        {
            if (((ag) (obj1)).m < p)
            {
                break MISSING_BLOCK_LABEL_128;
            }
            if (((ag) (obj1)).m <= q)
            {
                obj1.i = ((ag) (obj1)).i + (q - ((ag) (obj1)).m);
            }
        }
_L2:
        ((ag) (obj1)).t();
        continue; /* Loop/switch isn't completed */
        q1;
        throw q1;
        obj1.i = ((ag) (obj1)).i + (q - p);
        if (true) goto _L2; else goto _L1
_L1:
        obj = new FutureTask(new ah(((List) (obj)), q1), null);
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
        catch (q q1)
        {
            eu.a(q1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (q q1)
        {
            eu.a(q1);
        }
        return;
        if (true) goto _L4; else goto _L3
_L3:
    }

    static void b(ag ag1)
    {
        ag1.u();
    }

    private void b(ao ao1)
    {
        j = ao1;
        h = System.currentTimeMillis();
        long l1 = System.nanoTime();
        if (n())
        {
            i = (l1 - Math.max(p, m)) + i;
        }
        am am1;
        synchronized (o)
        {
            o.remove(this);
        }
        am1 = new am(this, new ag(this));
        synchronized (b)
        {
            b.execute(am1);
        }
    }

    public static void b(q q1)
    {
        ag ag1 = new ag(q1, "App Load");
        t = ag1;
        ag1;
        JVM INSTR monitorenter ;
        long l1 = o();
        if (l1 == -1L)
        {
            break MISSING_BLOCK_LABEL_187;
        }
        t.j = ao.b;
        ag ag2 = t;
        long l2 = SystemClock.elapsedRealtime();
        ag2.g = System.currentTimeMillis() - (l2 - l1);
        ag2 = t;
        l1 = TimeUnit.NANOSECONDS.convert(l1, TimeUnit.MILLISECONDS);
        l2 = TimeUnit.NANOSECONDS.convert(SystemClock.elapsedRealtime(), TimeUnit.MILLISECONDS);
        ag2.m = System.nanoTime() - (l2 - l1);
        t.e = u.a(t.d);
        synchronized (o)
        {
            o.add(t);
        }
        obj = new aj(q1, new ag(t));
        synchronized (b)
        {
            b.execute(((Runnable) (obj)));
            t.a(t.e);
        }
        ag1;
        JVM INSTR monitorexit ;
        return;
        q1;
        obj;
        JVM INSTR monitorexit ;
        throw q1;
        q1;
        ag1;
        JVM INSTR monitorexit ;
        throw q1;
        q1;
        throw q1;
        exception;
        q1;
        JVM INSTR monitorexit ;
        throw exception;
        q1;
        eu.a(q1);
        return;
    }

    static String c(ag ag1)
    {
        return ag1.l;
    }

    public static void d()
    {
        r = true;
    }

    public static void e()
    {
        p = System.nanoTime();
        LinkedList linkedlist = new LinkedList();
        synchronized (o)
        {
            linkedlist.addAll(o);
        }
        if (t != null && q == 0L)
        {
            synchronized (t)
            {
                ag ag1 = t;
                ag1.i = ag1.i + (p - t.m);
            }
        }
        obj1 = linkedlist.iterator();
_L7:
        if (!((Iterator) (obj1)).hasNext())
        {
            break MISSING_BLOCK_LABEL_194;
        }
        obj = (ag)((Iterator) (obj1)).next();
        obj;
        JVM INSTR monitorenter ;
        if (((ag) (obj)).j != ao.b) goto _L2; else goto _L1
_L1:
        if (((ag) (obj)).n == null || !((ag) (obj)).n.isCancelled()) goto _L4; else goto _L3
_L3:
        ((ag) (obj)).a(((ag) (obj)).e - TimeUnit.MILLISECONDS.convert(((ag) (obj)).i, TimeUnit.NANOSECONDS));
_L2:
        continue; /* Loop/switch isn't completed */
        obj1;
        throw obj1;
_L4:
        if (((ag) (obj)).n == null)
        {
            ((ag) (obj)).a(((ag) (obj)).e);
        }
        if (true) goto _L2; else goto _L5
_L5:
        return;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public static void f()
    {
        try
        {
            if (t != null)
            {
                t.b();
            }
            return;
        }
        catch (ThreadDeath threaddeath)
        {
            throw threaddeath;
        }
        catch (Throwable throwable)
        {
            eu.a(throwable);
        }
    }

    public static void h()
    {
        Object obj1 = new LinkedList();
        synchronized (o)
        {
            ((List) (obj1)).addAll(o);
        }
        for (obj1 = ((List) (obj1)).iterator(); ((Iterator) (obj1)).hasNext();)
        {
            synchronized ((ag)((Iterator) (obj1)).next())
            {
                if (((ag) (obj)).j == ao.b)
                {
                    obj.e = u.a(((ag) (obj)).d);
                    ((ag) (obj)).t();
                    ((ag) (obj)).a(((ag) (obj)).e);
                }
            }
        }

    }

    static boolean l()
    {
        return r;
    }

    static List m()
    {
        return o;
    }

    private static boolean n()
    {
        return p > q;
    }

    private static long o()
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
                s1, s, null, obj, null
            })).booleanValue();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            eu.a(((Throwable) (obj)));
            return -1L;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            eu.a(((Throwable) (obj)));
            return -1L;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            eu.a(((Throwable) (obj)));
            return -1L;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            eu.a(((Throwable) (obj)));
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

    private void p()
    {
        this;
        JVM INSTR monitorenter ;
        if (j != ao.a)
        {
            break MISSING_BLOCK_LABEL_125;
        }
        j = ao.b;
        g = System.currentTimeMillis();
        m = System.nanoTime();
        e = u.a(d);
        synchronized (o)
        {
            o.add(this);
        }
        ak ak1 = new ak(this, new ag(this));
        synchronized (b)
        {
            b.execute(ak1);
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
        eu.b((new StringBuilder("Transaction ")).append(d).append(" has already been started.").toString(), new IllegalStateException("Transaction has already started"));
          goto _L1
    }

    private void q()
    {
        this;
        JVM INSTR monitorenter ;
        a(ao.c);
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
        a(ao.e);
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
        a(ao.i);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    private void t()
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

    private void u()
    {
        this;
        JVM INSTR monitorenter ;
        if (j == ao.b)
        {
            b(ao.f);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final void a()
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
            eu.a(throwable);
        }
    }

    public final void a(OutputStream outputstream)
    {
        JSONArray jsonarray = null;
        JSONArray jsonarray1 = i();
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
            q();
            return;
        }
        catch (ThreadDeath threaddeath)
        {
            throw threaddeath;
        }
        catch (Throwable throwable)
        {
            eu.a(throwable);
        }
    }

    public final void c()
    {
        try
        {
            r();
            return;
        }
        catch (ThreadDeath threaddeath)
        {
            throw threaddeath;
        }
        catch (Throwable throwable)
        {
            eu.a(throwable);
        }
    }

    public final void g()
    {
        try
        {
            s();
            return;
        }
        catch (ThreadDeath threaddeath)
        {
            throw threaddeath;
        }
        catch (Throwable throwable)
        {
            eu.a(throwable);
        }
    }

    public final JSONArray i()
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
        obj = jsonarray.put(obj).put(new JSONObject(k)).put(fc.a.a(new Date(g))).put(fc.a.a(new Date(h)));
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

    public final String j()
    {
        return l;
    }

    public final ao k()
    {
        return j;
    }

}
