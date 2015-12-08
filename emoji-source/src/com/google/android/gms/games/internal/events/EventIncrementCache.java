// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.events;

import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class EventIncrementCache
{

    final Object Rm = new Object();
    private Handler Rn;
    private boolean Ro;
    private HashMap Rp;
    private int Rq;

    public EventIncrementCache(Looper looper, int i)
    {
        Rn = new Handler(looper);
        Rp = new HashMap();
        Rq = i;
    }

    static void a(EventIncrementCache eventincrementcache)
    {
        eventincrementcache.hP();
    }

    private void hP()
    {
        synchronized (Rm)
        {
            Ro = false;
            flush();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void flush()
    {
        Object obj = Rm;
        obj;
        JVM INSTR monitorenter ;
        java.util.Map.Entry entry;
        for (Iterator iterator = Rp.entrySet().iterator(); iterator.hasNext(); o((String)entry.getKey(), ((AtomicInteger)entry.getValue()).get()))
        {
            entry = (java.util.Map.Entry)iterator.next();
        }

        break MISSING_BLOCK_LABEL_72;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        Rp.clear();
        obj;
        JVM INSTR monitorexit ;
    }

    protected abstract void o(String s, int i);

    public void u(String s, int i)
    {
        Object obj = Rm;
        obj;
        JVM INSTR monitorenter ;
        AtomicInteger atomicinteger1;
        if (!Ro)
        {
            Ro = true;
            Rn.postDelayed(new Runnable() {

                final EventIncrementCache Rr;

                public void run()
                {
                    EventIncrementCache.a(Rr);
                }

            
            {
                Rr = EventIncrementCache.this;
                super();
            }
            }, Rq);
        }
        atomicinteger1 = (AtomicInteger)Rp.get(s);
        AtomicInteger atomicinteger;
        atomicinteger = atomicinteger1;
        if (atomicinteger1 != null)
        {
            break MISSING_BLOCK_LABEL_81;
        }
        atomicinteger = new AtomicInteger();
        Rp.put(s, atomicinteger);
        atomicinteger.addAndGet(i);
        obj;
        JVM INSTR monitorexit ;
        return;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }
}
