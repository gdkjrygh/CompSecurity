// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

final class jzu
    implements jyn
{

    final Lock a = new ReentrantLock();
    final Condition b;
    final kby c;
    final Context d;
    final Looper e;
    final Queue f = new LinkedList();
    volatile boolean g;
    long h;
    long i;
    final jzz j;
    final jxz k;
    BroadcastReceiver l;
    final Map m = new HashMap();
    final Map n = new HashMap();
    Set o;
    final kax p;
    final Map q = new HashMap();
    final jyi r;
    volatile kae s;
    final Set t = Collections.newSetFromMap(new ConcurrentHashMap(16, 0.75F, 2));
    private ConnectionResult u;
    private final Set v = Collections.newSetFromMap(new WeakHashMap());
    private final kac w = new jzv(this);
    private final jyq x = new jzw(this);
    private final kbz y = new jzx(this);

    public jzu(Context context, Looper looper, kax kax1, jxz jxz, jyi jyi1, Map map, ArrayList arraylist, 
            ArrayList arraylist1, int i1, int j1)
    {
        h = 0x1d4c0L;
        i = 5000L;
        o = new HashSet();
        u = null;
        d = context;
        c = new kby(looper, y);
        e = looper;
        j = new jzz(this, looper);
        k = jxz;
        b = a.newCondition();
        s = new jzt(this);
        for (jxz = arraylist.iterator(); jxz.hasNext(); c.a(arraylist))
        {
            arraylist = (jyq)jxz.next();
        }

        for (jxz = arraylist1.iterator(); jxz.hasNext(); c.a(arraylist))
        {
            arraylist = (jys)jxz.next();
        }

        jxz = kax1.d;
        arraylist = map.keySet().iterator();
        while (arraylist.hasNext()) 
        {
            arraylist1 = (jyh)arraylist.next();
            Object obj = map.get(arraylist1);
            if (jxz.get(arraylist1) != null)
            {
                jxz.get(arraylist1);
                i1 = 2;
            } else
            {
                i1 = 0;
            }
            q.put(arraylist1, Integer.valueOf(i1));
            obj = arraylist1.a().a(context, looper, kax1, obj, x, a(arraylist1, i1));
            m.put(arraylist1.b(), obj);
        }
        p = kax1;
        r = jyi1;
    }

    private final jys a(jyh jyh1, int i1)
    {
        return new jzy(this, jyh1, i1);
    }

    static void a(jzu jzu1)
    {
        jzu1.a.lock();
        if (jzu1.g)
        {
            jzu1.b();
        }
        jzu1.a.unlock();
        return;
        Exception exception;
        exception;
        jzu1.a.unlock();
        throw exception;
    }

    public final Looper a()
    {
        return e;
    }

    public final ConnectionResult a(long l1, TimeUnit timeunit)
    {
        long l2;
        boolean flag;
        if (Looper.myLooper() != Looper.getMainLooper())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b.a(flag, "blockingConnect must not be called on the UI thread");
        a.lock();
        b();
        l1 = timeunit.toNanos(l1);
_L2:
        flag = s instanceof jzf;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_132;
        }
        l2 = b.awaitNanos(l1);
        l1 = l2;
        if (l2 > 0L) goto _L2; else goto _L1
_L1:
        timeunit = new ConnectionResult(14, null);
        a.unlock();
        return timeunit;
        timeunit;
        Thread.currentThread().interrupt();
        timeunit = new ConnectionResult(15, null);
        a.unlock();
        return timeunit;
        if (!(s instanceof jzd))
        {
            break MISSING_BLOCK_LABEL_157;
        }
        timeunit = ConnectionResult.a;
        a.unlock();
        return timeunit;
        if (u == null)
        {
            break MISSING_BLOCK_LABEL_180;
        }
        timeunit = u;
        a.unlock();
        return timeunit;
        timeunit = new ConnectionResult(13, null);
        a.unlock();
        return timeunit;
        timeunit;
        a.unlock();
        throw timeunit;
    }

    public final jyl a(jym jym)
    {
        jym = (jyl)m.get(jym);
        b.f(jym, "Appropriate Api was not requested.");
        return jym;
    }

    public final jzb a(jzb jzb1)
    {
        boolean flag;
        if (jzb1.f != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b.b(flag, "This task can not be enqueued (it's probably a Batch or malformed)");
        b.b(m.containsKey(jzb1.f), "GoogleApiClient is not configured to use the API required for this call.");
        a.lock();
        jzb1 = s.a(jzb1);
        a.unlock();
        return jzb1;
        jzb1;
        a.unlock();
        throw jzb1;
    }

    final void a(ConnectionResult connectionresult)
    {
        a.lock();
        u = connectionresult;
        s = new jzt(this);
        s.a();
        b.signalAll();
        a.unlock();
        return;
        connectionresult;
        a.unlock();
        throw connectionresult;
    }

    public final void a(String s1, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
    {
        printwriter.append(s1).append("mState=").append(s.d());
        printwriter.append(" mResuming=").print(g);
        printwriter.append(" mWorkQueue.size()=").print(f.size());
        printwriter.append(" mUnconsumedRunners.size()=").println(t.size());
        filedescriptor = (new StringBuilder()).append(s1).append("  ").toString();
        jyh jyh1;
        for (as = q.keySet().iterator(); as.hasNext(); ((jyl)m.get(jyh1.b())).a(filedescriptor, printwriter))
        {
            jyh1 = (jyh)as.next();
            printwriter.append(s1).append(jyh1.a).println(":");
        }

    }

    public final void a(jyq jyq1)
    {
        c.a(jyq1);
    }

    public final void a(jys jys1)
    {
        c.a(jys1);
    }

    final void a(kaa kaa)
    {
        kaa = j.obtainMessage(3, kaa);
        j.sendMessage(kaa);
    }

    final void a(kad kad1)
    {
        t.add(kad1);
        kad1.a(w);
    }

    public final jzb b(jzb jzb1)
    {
        kad kad1;
        boolean flag;
        if (jzb1.f != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b.b(flag, "This task can not be executed (it's probably a Batch or malformed)");
        a.lock();
        if (!g)
        {
            break MISSING_BLOCK_LABEL_113;
        }
        f.add(jzb1);
        for (; !f.isEmpty(); kad1.c(Status.c))
        {
            kad1 = (kad)f.remove();
            a(kad1);
        }

        break MISSING_BLOCK_LABEL_102;
        jzb1;
        a.unlock();
        throw jzb1;
        a.unlock();
        return jzb1;
        jzb1 = s.b(jzb1);
        a.unlock();
        return jzb1;
    }

    public final void b()
    {
        a.lock();
        s.c();
        a.unlock();
        return;
        Exception exception;
        exception;
        a.unlock();
        throw exception;
    }

    public final boolean b(jyq jyq1)
    {
        return c.b(jyq1);
    }

    public final boolean b(jys jys1)
    {
        return c.b(jys1);
    }

    public final ConnectionResult c()
    {
        InterruptedException interruptedexception;
        ConnectionResult connectionresult;
        boolean flag;
        if (Looper.myLooper() != Looper.getMainLooper())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b.a(flag, "blockingConnect must not be called on the UI thread");
        a.lock();
        b();
_L1:
        flag = s instanceof jzf;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_89;
        }
        b.await();
          goto _L1
        interruptedexception;
        Thread.currentThread().interrupt();
        connectionresult = new ConnectionResult(15, null);
        a.unlock();
        return connectionresult;
        ConnectionResult connectionresult1;
        if (!(s instanceof jzd))
        {
            break MISSING_BLOCK_LABEL_114;
        }
        connectionresult1 = ConnectionResult.a;
        a.unlock();
        return connectionresult1;
        if (u == null)
        {
            break MISSING_BLOCK_LABEL_137;
        }
        connectionresult1 = u;
        a.unlock();
        return connectionresult1;
        connectionresult1 = new ConnectionResult(13, null);
        a.unlock();
        return connectionresult1;
        Exception exception;
        exception;
        a.unlock();
        throw exception;
    }

    public final void c(jyq jyq1)
    {
        kby kby1;
        kby1 = c;
        b.d(jyq1);
        Object obj = kby1.i;
        obj;
        JVM INSTR monitorenter ;
        if (kby1.b.remove(jyq1)) goto _L2; else goto _L1
_L1:
        Log.w("GmsClientEvents", (new StringBuilder("unregisterConnectionCallbacks(): listener ")).append(jyq1).append(" not found").toString());
_L4:
        return;
_L2:
        if (kby1.g)
        {
            kby1.c.add(jyq1);
        }
        if (true) goto _L4; else goto _L3
_L3:
        jyq1;
        obj;
        JVM INSTR monitorexit ;
        throw jyq1;
    }

    public final void c(jys jys1)
    {
        kby kby1 = c;
        b.d(jys1);
        synchronized (kby1.i)
        {
            if (!kby1.d.remove(jys1))
            {
                Log.w("GmsClientEvents", (new StringBuilder("unregisterConnectionFailedListener(): listener ")).append(jys1).append(" not found").toString());
            }
        }
        return;
        jys1;
        obj;
        JVM INSTR monitorexit ;
        throw jys1;
    }

    public final void d()
    {
        a.lock();
        h();
        s.b();
        a.unlock();
        return;
        Exception exception;
        exception;
        a.unlock();
        throw exception;
    }

    public final boolean e()
    {
        return s instanceof jzd;
    }

    public final boolean f()
    {
        return s instanceof jzf;
    }

    final void g()
    {
        kad kad1;
        for (Iterator iterator = t.iterator(); iterator.hasNext(); kad1.b())
        {
            kad1 = (kad)iterator.next();
            kad1.a(null);
        }

        t.clear();
        for (Iterator iterator1 = v.iterator(); iterator1.hasNext(); ((im)iterator1.next()).m()) { }
        v.clear();
    }

    final boolean h()
    {
        if (!g)
        {
            return false;
        }
        g = false;
        j.removeMessages(2);
        j.removeMessages(1);
        if (l != null)
        {
            d.getApplicationContext().unregisterReceiver(l);
            l = null;
        }
        return true;
    }
}
