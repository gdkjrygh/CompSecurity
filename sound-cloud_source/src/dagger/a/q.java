// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package dagger.a;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

abstract class q
{

    private final Map a = new LinkedHashMap();
    private final Lock b;
    private final Lock c;

    public q()
    {
        ReentrantReadWriteLock reentrantreadwritelock = new ReentrantReadWriteLock();
        b = reentrantreadwritelock.readLock();
        c = reentrantreadwritelock.writeLock();
    }

    protected abstract Object a(Object obj);

    public final Object b(Object obj)
    {
        if (obj == null)
        {
            throw new NullPointerException("key == null");
        }
        b.lock();
        Object obj1 = a.get(obj);
        if (obj1 != null)
        {
            b.unlock();
            return obj1;
        }
        b.unlock();
        obj1 = a(obj);
        if (obj1 == null)
        {
            throw new NullPointerException("create returned null");
        }
        break MISSING_BLOCK_LABEL_90;
        obj;
        b.unlock();
        throw obj;
        c.lock();
        a.put(obj, obj1);
        c.unlock();
        return obj1;
        obj;
        c.unlock();
        throw obj;
    }

    public final String toString()
    {
        b.lock();
        String s = a.toString();
        b.unlock();
        return s;
        Exception exception;
        exception;
        b.unlock();
        throw exception;
    }
}
