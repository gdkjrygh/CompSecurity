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

    final Object aaq = new Object();
    private Handler aar;
    private boolean aas;
    private HashMap aat;
    private int aau;

    public EventIncrementCache(Looper looper, int i)
    {
        aar = new Handler(looper);
        aat = new HashMap();
        aau = i;
    }

    static void a(EventIncrementCache eventincrementcache)
    {
        eventincrementcache.kQ();
    }

    private void kQ()
    {
        synchronized (aaq)
        {
            aas = false;
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
        Object obj = aaq;
        obj;
        JVM INSTR monitorenter ;
        java.util.Map.Entry entry;
        for (Iterator iterator = aat.entrySet().iterator(); iterator.hasNext(); q((String)entry.getKey(), ((AtomicInteger)entry.getValue()).get()))
        {
            entry = (java.util.Map.Entry)iterator.next();
        }

        break MISSING_BLOCK_LABEL_72;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        aat.clear();
        obj;
        JVM INSTR monitorexit ;
    }

    protected abstract void q(String s, int i);

    public void w(String s, int i)
    {
        Object obj = aaq;
        obj;
        JVM INSTR monitorenter ;
        AtomicInteger atomicinteger1;
        if (!aas)
        {
            aas = true;
            aar.postDelayed(new Runnable() {

                final EventIncrementCache aav;

                public void run()
                {
                    EventIncrementCache.a(aav);
                }

            
            {
                aav = EventIncrementCache.this;
                super();
            }
            }, aau);
        }
        atomicinteger1 = (AtomicInteger)aat.get(s);
        AtomicInteger atomicinteger;
        atomicinteger = atomicinteger1;
        if (atomicinteger1 != null)
        {
            break MISSING_BLOCK_LABEL_81;
        }
        atomicinteger = new AtomicInteger();
        aat.put(s, atomicinteger);
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
