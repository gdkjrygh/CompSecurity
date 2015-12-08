// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package dagger.internal;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

abstract class Memoizer
{

    private final Map map = new LinkedHashMap();
    private final Lock readLock;
    private final Lock writeLock;

    public Memoizer()
    {
        ReentrantReadWriteLock reentrantreadwritelock = new ReentrantReadWriteLock();
        readLock = reentrantreadwritelock.readLock();
        writeLock = reentrantreadwritelock.writeLock();
    }

    protected abstract Object create(Object obj);

    public final Object get(Object obj)
    {
        if (obj == null)
        {
            throw new NullPointerException("key == null");
        }
        readLock.lock();
        Object obj1 = map.get(obj);
        if (obj1 != null)
        {
            readLock.unlock();
            return obj1;
        }
        readLock.unlock();
        obj1 = create(obj);
        if (obj1 == null)
        {
            throw new NullPointerException("create returned null");
        }
        break MISSING_BLOCK_LABEL_90;
        obj;
        readLock.unlock();
        throw obj;
        writeLock.lock();
        map.put(obj, obj1);
        writeLock.unlock();
        return obj1;
        obj;
        writeLock.unlock();
        throw obj;
    }

    public final String toString()
    {
        readLock.lock();
        String s = map.toString();
        readLock.unlock();
        return s;
        Exception exception;
        exception;
        readLock.unlock();
        throw exception;
    }
}
