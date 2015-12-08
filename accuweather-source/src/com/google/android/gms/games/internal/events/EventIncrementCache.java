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

    final Object Rj = new Object();
    private Handler Rk;
    private boolean Rl;
    private HashMap Rm;
    private int Rn;

    public EventIncrementCache(Looper looper, int i)
    {
        Rk = new Handler(looper);
        Rm = new HashMap();
        Rn = i;
    }

    static void a(EventIncrementCache eventincrementcache)
    {
        eventincrementcache.hK();
    }

    private void hK()
    {
        synchronized (Rj)
        {
            Rl = false;
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
        Object obj = Rj;
        obj;
        JVM INSTR monitorenter ;
        java.util.Map.Entry entry;
        for (Iterator iterator = Rm.entrySet().iterator(); iterator.hasNext(); o((String)entry.getKey(), ((AtomicInteger)entry.getValue()).get()))
        {
            entry = (java.util.Map.Entry)iterator.next();
        }

        break MISSING_BLOCK_LABEL_72;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        Rm.clear();
        obj;
        JVM INSTR monitorexit ;
    }

    protected abstract void o(String s, int i);

    public void u(String s, int i)
    {
        Object obj = Rj;
        obj;
        JVM INSTR monitorenter ;
        AtomicInteger atomicinteger1;
        if (!Rl)
        {
            Rl = true;
            Rk.postDelayed(new Runnable() {

                final EventIncrementCache Ro;

                public void run()
                {
                    EventIncrementCache.a(Ro);
                }

            
            {
                Ro = EventIncrementCache.this;
                super();
            }
            }, Rn);
        }
        atomicinteger1 = (AtomicInteger)Rm.get(s);
        AtomicInteger atomicinteger;
        atomicinteger = atomicinteger1;
        if (atomicinteger1 != null)
        {
            break MISSING_BLOCK_LABEL_81;
        }
        atomicinteger = new AtomicInteger();
        Rm.put(s, atomicinteger);
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
