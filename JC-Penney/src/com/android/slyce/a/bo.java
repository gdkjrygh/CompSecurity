// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.a;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.WeakHashMap;
import java.util.concurrent.Semaphore;

// Referenced classes of package com.android.slyce.a:
//            q

public class bo extends LinkedList
{

    private static final WeakHashMap c = new WeakHashMap();
    q a;
    Semaphore b;

    public bo()
    {
        b = new Semaphore(0);
    }

    static bo a(Thread thread)
    {
        WeakHashMap weakhashmap = c;
        weakhashmap;
        JVM INSTR monitorenter ;
        bo bo2 = (bo)c.get(thread);
        bo bo1;
        bo1 = bo2;
        if (bo2 != null)
        {
            break MISSING_BLOCK_LABEL_40;
        }
        bo1 = new bo();
        c.put(thread, bo1);
        weakhashmap;
        JVM INSTR monitorexit ;
        return bo1;
        thread;
        weakhashmap;
        JVM INSTR monitorexit ;
        throw thread;
    }

    static void a(q q)
    {
        WeakHashMap weakhashmap = c;
        weakhashmap;
        JVM INSTR monitorenter ;
        Iterator iterator = c.values().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            bo bo1 = (bo)iterator.next();
            if (bo1.a == q)
            {
                bo1.b.release();
            }
        } while (true);
        break MISSING_BLOCK_LABEL_60;
        q;
        weakhashmap;
        JVM INSTR monitorexit ;
        throw q;
        weakhashmap;
        JVM INSTR monitorexit ;
    }

    public Runnable a()
    {
        this;
        JVM INSTR monitorenter ;
        if (!isEmpty())
        {
            break MISSING_BLOCK_LABEL_13;
        }
        this;
        JVM INSTR monitorexit ;
        return null;
        Runnable runnable = (Runnable)super.remove();
        this;
        JVM INSTR monitorexit ;
        return runnable;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean a(Runnable runnable)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = super.add(runnable);
        this;
        JVM INSTR monitorexit ;
        return flag;
        runnable;
        this;
        JVM INSTR monitorexit ;
        throw runnable;
    }

    public boolean add(Object obj)
    {
        return a((Runnable)obj);
    }

    public Object remove()
    {
        return a();
    }

    public boolean remove(Object obj)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = super.remove(obj);
        this;
        JVM INSTR monitorexit ;
        return flag;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
    }

}
