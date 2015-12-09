// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.engine.b;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

final class c
{
    private static class a
    {

        final Lock a;
        int b;

        private a()
        {
            a = new ReentrantLock();
        }

    }

    private static class b
    {

        private final Queue a;

        a a()
        {
            a a1;
            synchronized (a)
            {
                a1 = (a)a.poll();
            }
            obj = a1;
            if (a1 == null)
            {
                obj = new a();
            }
            return ((a) (obj));
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        void a(a a1)
        {
            synchronized (a)
            {
                if (a.size() < 10)
                {
                    a.offer(a1);
                }
            }
            return;
            a1;
            queue;
            JVM INSTR monitorexit ;
            throw a1;
        }

        private b()
        {
            a = new ArrayDeque();
        }

    }


    private final Map a = new HashMap();
    private final b b = new b();

    c()
    {
    }

    void a(com.bumptech.glide.load.c c1)
    {
        this;
        JVM INSTR monitorenter ;
        a a2 = (a)a.get(c1);
        a a1;
        a1 = a2;
        if (a2 != null)
        {
            break MISSING_BLOCK_LABEL_42;
        }
        a1 = b.a();
        a.put(c1, a1);
        a1.b = a1.b + 1;
        this;
        JVM INSTR monitorexit ;
        a1.a.lock();
        return;
        c1;
        this;
        JVM INSTR monitorexit ;
        throw c1;
    }

    void b(com.bumptech.glide.load.c c1)
    {
        this;
        JVM INSTR monitorenter ;
        a a1 = (a)a.get(c1);
        if (a1 == null)
        {
            break MISSING_BLOCK_LABEL_27;
        }
        if (a1.b > 0)
        {
            break MISSING_BLOCK_LABEL_87;
        }
        c1 = (new StringBuilder()).append("Cannot release a lock that is not held, key: ").append(c1).append(", interestedThreads: ");
        int i;
        if (a1 != null)
        {
            break MISSING_BLOCK_LABEL_78;
        }
        i = 0;
_L1:
        throw new IllegalArgumentException(c1.append(i).toString());
        c1;
        this;
        JVM INSTR monitorexit ;
        throw c1;
        i = a1.b;
          goto _L1
        i = a1.b - 1;
        a1.b = i;
        if (i != 0)
        {
            break MISSING_BLOCK_LABEL_181;
        }
        a a2 = (a)a.remove(c1);
        if (!a2.equals(a1))
        {
            throw new IllegalStateException((new StringBuilder()).append("Removed the wrong lock, expected to remove: ").append(a1).append(", but actually removed: ").append(a2).append(", key: ").append(c1).toString());
        }
        b.a(a2);
        this;
        JVM INSTR monitorexit ;
        a1.a.unlock();
        return;
    }
}
