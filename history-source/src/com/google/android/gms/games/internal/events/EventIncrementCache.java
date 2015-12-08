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

    final Object ack = new Object();
    private Handler acl;
    private boolean acm;
    private HashMap acn;
    private int aco;

    public EventIncrementCache(Looper looper, int i)
    {
        acl = new Handler(looper);
        acn = new HashMap();
        aco = i;
    }

    static void a(EventIncrementCache eventincrementcache)
    {
        eventincrementcache.lX();
    }

    private void lX()
    {
        synchronized (ack)
        {
            acm = false;
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
        Object obj = ack;
        obj;
        JVM INSTR monitorenter ;
        java.util.Map.Entry entry;
        for (Iterator iterator = acn.entrySet().iterator(); iterator.hasNext(); r((String)entry.getKey(), ((AtomicInteger)entry.getValue()).get()))
        {
            entry = (java.util.Map.Entry)iterator.next();
        }

        break MISSING_BLOCK_LABEL_72;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        acn.clear();
        obj;
        JVM INSTR monitorexit ;
    }

    protected abstract void r(String s, int i);

    public void y(String s, int i)
    {
        Object obj = ack;
        obj;
        JVM INSTR monitorenter ;
        AtomicInteger atomicinteger1;
        if (!acm)
        {
            acm = true;
            acl.postDelayed(new Runnable() {

                final EventIncrementCache acp;

                public void run()
                {
                    EventIncrementCache.a(acp);
                }

            
            {
                acp = EventIncrementCache.this;
                super();
            }
            }, aco);
        }
        atomicinteger1 = (AtomicInteger)acn.get(s);
        AtomicInteger atomicinteger;
        atomicinteger = atomicinteger1;
        if (atomicinteger1 != null)
        {
            break MISSING_BLOCK_LABEL_81;
        }
        atomicinteger = new AtomicInteger();
        acn.put(s, atomicinteger);
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
