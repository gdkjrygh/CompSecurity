// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.b;
import com.google.android.gms.common.api.c;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;
import com.google.android.gms.common.api.u;
import com.google.android.gms.common.internal.ak;
import com.google.android.gms.common.internal.al;
import com.google.android.gms.common.internal.bl;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.w;
import com.google.android.gms.common.internal.x;
import java.io.FileDescriptor;
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

// Referenced classes of package com.google.android.gms.internal:
//            uk, ul, um, uo, 
//            ui, un, to, uu, 
//            ut, uq, uy, tu, 
//            ts, ur, ux, us, 
//            up

public final class uj extends h
{

    private final al A = new um(this);
    final ak a;
    final Queue b = new LinkedList();
    ur c;
    final Map d = new HashMap();
    final Map e = new HashMap();
    Set f;
    final w g;
    final Map h = new HashMap();
    final b i;
    final Set j = Collections.newSetFromMap(new ConcurrentHashMap(16, 0.75F, 2));
    private final Lock k = new ReentrantLock();
    private final Condition l;
    private final int m;
    private final Context n;
    private final Looper o;
    private volatile boolean p;
    private long q;
    private long r;
    private final uo s;
    private final com.google.android.gms.common.b t;
    private volatile uu u;
    private ConnectionResult v;
    private final Set w = Collections.newSetFromMap(new WeakHashMap());
    private u x;
    private final us y = new uk(this);
    private final k z = new ul(this);

    public uj(Context context, Looper looper, w w1, com.google.android.gms.common.b b1, b b2, Map map, ArrayList arraylist, 
            ArrayList arraylist1, int i1)
    {
        q = 0x1d4c0L;
        r = 5000L;
        f = new HashSet();
        v = null;
        n = context;
        a = new ak(looper, A);
        o = looper;
        s = new uo(this, looper);
        t = b1;
        m = i1;
        l = k.newCondition();
        u = new ui(this);
        for (b1 = arraylist.iterator(); b1.hasNext(); a.a(arraylist))
        {
            arraylist = (k)b1.next();
        }

        for (b1 = arraylist1.iterator(); b1.hasNext(); a.a(arraylist))
        {
            arraylist = (l)b1.next();
        }

        arraylist = w1.e();
        arraylist1 = map.keySet().iterator();
        while (arraylist1.hasNext()) 
        {
            a a1 = (a)arraylist1.next();
            b1 = ((com.google.android.gms.common.b) (map.get(a1)));
            if (arraylist.get(a1) != null)
            {
                if (((x)arraylist.get(a1)).b)
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
            h.put(a1, Integer.valueOf(i1));
            if (a1.d())
            {
                b1 = a1.b();
                k k1 = z;
                l l1 = a(a1, i1);
                b1 = new d(context, looper, b1.b(), k1, l1, w1, b1.a());
            } else
            {
                b1 = a1.a().a(context, looper, w1, b1, z, a(a1, i1));
            }
            d.put(a1.c(), b1);
        }
        g = w1;
        i = b2;
    }

    private l a(a a1, int i1)
    {
        return new un(this, a1, i1);
    }

    static u a(uj uj1)
    {
        return uj1.x;
    }

    static Lock b(uj uj1)
    {
        return uj1.k;
    }

    static uu c(uj uj1)
    {
        return uj1.u;
    }

    static void d(uj uj1)
    {
        uj1.k.lock();
        if (uj1.p)
        {
            uj1.b();
        }
        uj1.k.unlock();
        return;
        Exception exception;
        exception;
        uj1.k.unlock();
        throw exception;
    }

    static void e(uj uj1)
    {
        uj1.k.lock();
        if (uj1.j())
        {
            uj1.b();
        }
        uj1.k.unlock();
        return;
        Exception exception;
        exception;
        uj1.k.unlock();
        throw exception;
    }

    public final Looper a()
    {
        return o;
    }

    public final c a(com.google.android.gms.common.api.d d1)
    {
        d1 = (c)d.get(d1);
        bl.a(d1, "Appropriate Api was not requested.");
        return d1;
    }

    public final to a(to to1)
    {
        boolean flag;
        if (to1.b() != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        bl.b(flag, "This task can not be enqueued (it's probably a Batch or malformed)");
        bl.b(d.containsKey(to1.b()), "GoogleApiClient is not configured to use the API required for this call.");
        k.lock();
        to1 = u.a(to1);
        k.unlock();
        return to1;
        to1;
        k.unlock();
        throw to1;
    }

    final void a(ConnectionResult connectionresult)
    {
        k.lock();
        v = connectionresult;
        u = new ui(this);
        u.a();
        l.signalAll();
        k.unlock();
        return;
        connectionresult;
        k.unlock();
        throw connectionresult;
    }

    public final void a(l l1)
    {
        a.a(l1);
    }

    final void a(up up)
    {
        up = s.obtainMessage(3, up);
        s.sendMessage(up);
    }

    final void a(ut ut1)
    {
        j.add(ut1);
        ut1.a(y);
    }

    final void a(RuntimeException runtimeexception)
    {
        runtimeexception = s.obtainMessage(4, runtimeexception);
        s.sendMessage(runtimeexception);
    }

    public final void a(String s1, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
    {
        printwriter.append(s1).append("mState=").append(u.d());
        printwriter.append(" mResuming=").print(p);
        printwriter.append(" mWorkQueue.size()=").print(b.size());
        printwriter.append(" mUnconsumedRunners.size()=").println(j.size());
        String s2 = (new StringBuilder()).append(s1).append("  ").toString();
        a a1;
        for (Iterator iterator = h.keySet().iterator(); iterator.hasNext(); ((c)d.get(a1.c())).dump(s2, filedescriptor, printwriter, as))
        {
            a1 = (a)iterator.next();
            printwriter.append(s1).append(a1.e()).println(":");
        }

    }

    public final void b()
    {
        k.lock();
        u.c();
        k.unlock();
        return;
        Exception exception;
        exception;
        k.unlock();
        throw exception;
    }

    public final void b(l l1)
    {
        a.b(l1);
    }

    public final void c()
    {
        k.lock();
        j();
        u.b();
        k.unlock();
        return;
        Exception exception;
        exception;
        k.unlock();
        throw exception;
    }

    final void d()
    {
        for (Iterator iterator = j.iterator(); iterator.hasNext();)
        {
            ut ut1 = (ut)iterator.next();
            ut1.a(null);
            if (ut1.a() == null)
            {
                ut1.f();
            } else
            {
                ut1.c();
                IBinder ibinder = a(ut1.b()).zznz();
                u u1 = x;
                if (ut1.e())
                {
                    ut1.a(new uq(ut1, u1, ibinder, (byte)0));
                } else
                if (ibinder != null && ibinder.isBinderAlive())
                {
                    uq uq1 = new uq(ut1, u1, ibinder, (byte)0);
                    ut1.a(uq1);
                    try
                    {
                        ibinder.linkToDeath(uq1, 0);
                    }
                    catch (RemoteException remoteexception)
                    {
                        ut1.f();
                        ut1.a().intValue();
                        u1.a();
                    }
                } else
                {
                    ut1.a(null);
                    ut1.f();
                    ut1.a().intValue();
                    u1.a();
                }
            }
        }

        j.clear();
        for (Iterator iterator1 = w.iterator(); iterator1.hasNext(); ((uy)iterator1.next()).a()) { }
        w.clear();
    }

    final void e()
    {
        k.lock();
        u = new tu(this, g, h, t, i, k, n);
        u.a();
        l.signalAll();
        k.unlock();
        return;
        Exception exception;
        exception;
        k.unlock();
        throw exception;
    }

    final void f()
    {
        k.lock();
        j();
        u = new ts(this);
        u.a();
        l.signalAll();
        k.unlock();
        return;
        Exception exception;
        exception;
        k.unlock();
        throw exception;
    }

    public final boolean g()
    {
        return u instanceof ts;
    }

    final boolean h()
    {
        return p;
    }

    final void i()
    {
        if (p)
        {
            return;
        }
        p = true;
        if (c == null)
        {
            c = (ur)com.google.android.gms.internal.ux.b(n.getApplicationContext(), new ur(this));
        }
        s.sendMessageDelayed(s.obtainMessage(1), q);
        s.sendMessageDelayed(s.obtainMessage(2), r);
    }

    final boolean j()
    {
        if (!p)
        {
            return false;
        }
        p = false;
        s.removeMessages(2);
        s.removeMessages(1);
        if (c != null)
        {
            c.b();
            c = null;
        }
        return true;
    }

    final String k()
    {
        StringWriter stringwriter = new StringWriter();
        a("", null, new PrintWriter(stringwriter), null);
        return stringwriter.toString();
    }
}
