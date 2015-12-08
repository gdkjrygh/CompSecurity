// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import java.io.PrintWriter;
import java.io.StringWriter;
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
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public final class cmk extends bqu
{

    final Lock a;
    final Condition b;
    final bsm c;
    final Context d;
    final Looper e;
    final Queue f;
    volatile boolean g;
    long h;
    long i;
    final cml j;
    cmn k;
    final Map l;
    final Map m;
    Set n;
    final bry o;
    final Map p;
    final bqq q;
    volatile cmq r;
    final Set s;
    private final Set t;
    private final cmo u;
    private final bqw v;
    private final bsn w;

    public cmk(Context context, Looper looper, bry bry1, bqi bqi, bqq bqq1, Map map, ArrayList arraylist, 
            ArrayList arraylist1)
    {
        a = new ReentrantLock();
        f = new LinkedList();
        h = 0x1d4c0L;
        i = 5000L;
        l = new HashMap();
        m = new HashMap();
        n = new HashSet();
        t = Collections.newSetFromMap(new WeakHashMap());
        s = Collections.newSetFromMap(new ConcurrentHashMap(16, 0.75F, 2));
        u = new cmo() {

            private cmk a;

            public final void a(cmp cmp1)
            {
                a.s.remove(cmp1);
                cmp1.c();
            }

            
            {
                a = cmk.this;
                super();
            }
        };
        v = new bqw() {

            private cmk a;

            public final void a(int j1)
            {
                a.a.lock();
                a.r.a(j1);
                a.a.unlock();
                return;
                Exception exception;
                exception;
                a.a.unlock();
                throw exception;
            }

            public final void a(Bundle bundle)
            {
                a.a.lock();
                a.r.a(bundle);
                a.a.unlock();
                return;
                bundle;
                a.a.unlock();
                throw bundle;
            }

            
            {
                a = cmk.this;
                super();
            }
        };
        w = new bsn() {

            private cmk a;

            public final boolean k()
            {
                return a.r instanceof cly;
            }

            public final Bundle l_()
            {
                return null;
            }

            
            {
                a = cmk.this;
                super();
            }
        };
        d = context;
        c = new bsm(looper, w);
        e = looper;
        j = new cml(this, looper);
        p = new HashMap();
        b = a.newCondition();
        r = new cmj(this);
        arraylist = arraylist.iterator();
_L4:
        bqw bqw1;
        bsm bsm1;
        if (!arraylist.hasNext())
        {
            break MISSING_BLOCK_LABEL_368;
        }
        bqw1 = (bqw)arraylist.next();
        bsm1 = c;
        btl.a(bqw1);
        bqi = ((bqi) (bsm1.i));
        bqi;
        JVM INSTR monitorenter ;
        if (!bsm1.b.contains(bqw1))
        {
            break MISSING_BLOCK_LABEL_348;
        }
        Log.w("GmsClientEvents", (new StringBuilder("registerConnectionCallbacks(): listener ")).append(bqw1).append(" is already registered").toString());
_L2:
        if (bsm1.a.k())
        {
            bsm1.h.sendMessage(bsm1.h.obtainMessage(1, bqw1));
        }
        continue; /* Loop/switch isn't completed */
        bsm1.b.add(bqw1);
        if (true) goto _L2; else goto _L1
_L1:
        context;
        bqi;
        JVM INSTR monitorexit ;
        throw context;
        for (bqi = arraylist1.iterator(); bqi.hasNext(); c.a(arraylist))
        {
            arraylist = (bqx)bqi.next();
        }

        bqi = bry1.c;
        arraylist = map.keySet().iterator();
        while (arraylist.hasNext()) 
        {
            arraylist1 = (bql)arraylist.next();
            Object obj = map.get(arraylist1);
            int i1;
            if (bqi.get(arraylist1) != null)
            {
                if (((brz)bqi.get(arraylist1)).b)
                {
                    i1 = 1;
                } else
                {
                    i1 = 2;
                }
            } else
            {
                i1 = 0;
            }
            p.put(arraylist1, Integer.valueOf(i1));
            obj = arraylist1.a().a(context, looper, bry1, obj, v, new bqx(arraylist1, i1) {

                private bql a;
                private int b;
                private cmk c;

                public final void a(ConnectionResult connectionresult)
                {
                    c.a.lock();
                    c.r.a(connectionresult, a, b);
                    c.a.unlock();
                    return;
                    connectionresult;
                    c.a.unlock();
                    throw connectionresult;
                }

            
            {
                c = cmk.this;
                a = bql1;
                b = i1;
                super();
            }
            });
            l.put(arraylist1.b(), obj);
        }
        o = bry1;
        q = bqq1;
        return;
        if (true) goto _L4; else goto _L3
_L3:
    }

    static void a(cmk cmk1)
    {
        cmk1.a.lock();
        if (cmk1.g)
        {
            cmk1.b();
        }
        cmk1.a.unlock();
        return;
        Exception exception;
        exception;
        cmk1.a.unlock();
        throw exception;
    }

    public final Looper a()
    {
        return e;
    }

    public final bqr a(bqs bqs)
    {
        bqs = (bqr)l.get(bqs);
        btl.a(bqs, "Appropriate Api was not requested.");
        return bqs;
    }

    public final clu a(clu clu1)
    {
        boolean flag;
        if (clu1.b != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        btl.b(flag, "This task can not be enqueued (it's probably a Batch or malformed)");
        btl.b(l.containsKey(clu1.b), "GoogleApiClient is not configured to use the API required for this call.");
        a.lock();
        clu1 = r.a(clu1);
        a.unlock();
        return clu1;
        clu1;
        a.unlock();
        throw clu1;
    }

    public final void a(bqx bqx1)
    {
        c.a(bqx1);
    }

    final void a(cmm cmm)
    {
        cmm = j.obtainMessage(3, cmm);
        j.sendMessage(cmm);
    }

    final void a(cmp cmp1)
    {
        s.add(cmp1);
        cmp1.a(u);
    }

    public final void a(String s1, PrintWriter printwriter)
    {
        printwriter.append(s1).append("mState=").append(r.d());
        printwriter.append(" mResuming=").print(g);
        printwriter.append(" mWorkQueue.size()=").print(f.size());
        printwriter.append(" mUnconsumedRunners.size()=").println(s.size());
        String s2 = (new StringBuilder()).append(s1).append("  ").toString();
        bql bql1;
        for (Iterator iterator = p.keySet().iterator(); iterator.hasNext(); ((bqr)l.get(bql1.b())).a(s2, printwriter))
        {
            bql1 = (bql)iterator.next();
            printwriter.append(s1).append(bql1.a).println(":");
        }

    }

    public final clu b(clu clu1)
    {
        cmp cmp1;
        boolean flag;
        if (clu1.b != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        btl.b(flag, "This task can not be executed (it's probably a Batch or malformed)");
        a.lock();
        if (!g)
        {
            break MISSING_BLOCK_LABEL_113;
        }
        f.add(clu1);
        for (; !f.isEmpty(); cmp1.c(Status.b))
        {
            cmp1 = (cmp)f.remove();
            a(cmp1);
        }

        break MISSING_BLOCK_LABEL_102;
        clu1;
        a.unlock();
        throw clu1;
        a.unlock();
        return clu1;
        clu1 = r.b(clu1);
        a.unlock();
        return clu1;
    }

    public final void b()
    {
        a.lock();
        r.c();
        a.unlock();
        return;
        Exception exception;
        exception;
        a.unlock();
        throw exception;
    }

    public final void b(bqx bqx1)
    {
        bsm bsm1 = c;
        btl.a(bqx1);
        synchronized (bsm1.i)
        {
            if (!bsm1.d.remove(bqx1))
            {
                Log.w("GmsClientEvents", (new StringBuilder("unregisterConnectionFailedListener(): listener ")).append(bqx1).append(" not found").toString());
            }
        }
        return;
        bqx1;
        obj;
        JVM INSTR monitorexit ;
        throw bqx1;
    }

    public final void c()
    {
        a.lock();
        h();
        r.b();
        a.unlock();
        return;
        Exception exception;
        exception;
        a.unlock();
        throw exception;
    }

    public final boolean d()
    {
        return r instanceof cly;
    }

    public final boolean e()
    {
        return r instanceof clz;
    }

    final void f()
    {
        cmp cmp1;
        for (Iterator iterator = s.iterator(); iterator.hasNext(); cmp1.f())
        {
            cmp1 = (cmp)iterator.next();
            cmp1.a(null);
            cmp1.c();
        }

        s.clear();
        for (Iterator iterator1 = t.iterator(); iterator1.hasNext();)
        {
            ((cmu)iterator1.next()).a = null;
        }

        t.clear();
    }

    final void g()
    {
        a.lock();
        r = new cmj(this);
        r.a();
        b.signalAll();
        a.unlock();
        return;
        Exception exception;
        exception;
        a.unlock();
        throw exception;
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
        if (k != null)
        {
            k.b();
            k = null;
        }
        return true;
    }

    final String i()
    {
        StringWriter stringwriter = new StringWriter();
        a("", new PrintWriter(stringwriter));
        return stringwriter.toString();
    }
}
