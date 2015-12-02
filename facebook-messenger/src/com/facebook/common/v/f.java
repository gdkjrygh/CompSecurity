// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.v;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.facebook.common.executors.a;
import com.facebook.debug.log.b;
import com.google.common.a.hq;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.facebook.common.v:
//            i, g, j, h

public class f
{

    private static final Class a = com/facebook/common/v/f;
    private final a b;
    private final i c = new i(this);
    private final WeakHashMap d = new WeakHashMap();
    private final WeakHashMap e = new WeakHashMap();
    private Handler f;
    private boolean g;
    private Object h;
    private Object i;
    private List j;

    public f(a a1)
    {
        h = new Object();
        i = new Object();
        b = a1;
        f = new Handler(Looper.getMainLooper(), new g(this));
        j = hq.a();
    }

    static void a(f f1)
    {
        f1.e();
    }

    static Object b(f f1)
    {
        return f1.h;
    }

    static WeakHashMap c(f f1)
    {
        return f1.d;
    }

    private void d()
    {
        synchronized (h)
        {
            if (b() != g)
            {
                f.sendEmptyMessageDelayed(0, 100L);
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void e()
    {
        boolean flag1;
        flag1 = false;
        b.a();
        Object obj = h;
        obj;
        JVM INSTR monitorenter ;
        boolean flag2 = b();
        if (flag2 == g) goto _L2; else goto _L1
_L1:
        g = flag2;
        boolean flag;
        flag = true;
        flag1 = flag2;
_L4:
        obj;
        JVM INSTR monitorexit ;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_173;
        }
        j.clear();
        obj = i;
        obj;
        JVM INSTR monitorenter ;
        j j1;
        for (Iterator iterator1 = e.keySet().iterator(); iterator1.hasNext(); j.add(j1))
        {
            j1 = (j)iterator1.next();
        }

        break MISSING_BLOCK_LABEL_126;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        obj;
        JVM INSTR monitorexit ;
        for (Iterator iterator = j.iterator(); iterator.hasNext(); ((j)iterator.next()).a(flag1)) { }
        j.clear();
        return;
_L2:
        flag = false;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public i a()
    {
        return c;
    }

    public void a(long l)
    {
        b.b();
        Semaphore semaphore = new Semaphore(0);
        h h1 = new h(this, semaphore);
        try
        {
            long l1 = System.currentTimeMillis();
            a(((j) (h1)));
            if (!semaphore.tryAcquire(l, TimeUnit.MILLISECONDS))
            {
                com.facebook.debug.log.b.b(a, "User is interacting with UI. Unblock data processing anyway.");
            }
            l = System.currentTimeMillis() - l1;
        }
        catch (InterruptedException interruptedexception)
        {
            com.facebook.debug.log.b.e(a, "Exception when the user interaction to be finished.", interruptedexception);
            return;
        }
        if (l <= 10L)
        {
            break MISSING_BLOCK_LABEL_104;
        }
        com.facebook.debug.log.b.b(a, (new StringBuilder()).append("User interaction blocked data processing for ").append(l).append(" ms.").toString());
        b(h1);
        return;
    }

    public void a(View view)
    {
        b.a();
        synchronized (h)
        {
            d.put(view, Boolean.TRUE);
        }
        e();
        return;
        view;
        obj;
        JVM INSTR monitorexit ;
        throw view;
    }

    public void a(j j1)
    {
        synchronized (i)
        {
            e.put(j1, Boolean.TRUE);
        }
        j1.a(b());
        return;
        j1;
        obj;
        JVM INSTR monitorexit ;
        throw j1;
    }

    public void b(View view)
    {
        b.a();
        synchronized (h)
        {
            d.remove(view);
        }
        d();
        return;
        view;
        obj;
        JVM INSTR monitorexit ;
        throw view;
    }

    public void b(j j1)
    {
        synchronized (i)
        {
            e.remove(j1);
        }
        return;
        j1;
        obj;
        JVM INSTR monitorexit ;
        throw j1;
    }

    public boolean b()
    {
        Object obj = h;
        obj;
        JVM INSTR monitorenter ;
        Exception exception;
        boolean flag;
        if (!d.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj;
        JVM INSTR monitorexit ;
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void c()
    {
        a(10000L);
    }

}
