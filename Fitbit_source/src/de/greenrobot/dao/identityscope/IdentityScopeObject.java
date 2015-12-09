// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package de.greenrobot.dao.identityscope;

import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.locks.ReentrantLock;

// Referenced classes of package de.greenrobot.dao.identityscope:
//            IdentityScope

public class IdentityScopeObject
    implements IdentityScope
{

    private final ReentrantLock lock = new ReentrantLock();
    private final HashMap map = new HashMap();

    public IdentityScopeObject()
    {
    }

    public void clear()
    {
        lock.lock();
        map.clear();
        lock.unlock();
        return;
        Exception exception;
        exception;
        lock.unlock();
        throw exception;
    }

    public boolean detach(Object obj, Object obj1)
    {
        lock.lock();
        if (get(obj) != obj1 || obj1 == null)
        {
            break MISSING_BLOCK_LABEL_34;
        }
        remove(obj);
        lock.unlock();
        return true;
        lock.unlock();
        return false;
        obj;
        lock.unlock();
        throw obj;
    }

    public Object get(Object obj)
    {
        lock.lock();
        obj = (Reference)map.get(obj);
        lock.unlock();
        if (obj != null)
        {
            return ((Reference) (obj)).get();
        } else
        {
            return null;
        }
        obj;
        lock.unlock();
        throw obj;
    }

    public Object getNoLock(Object obj)
    {
        obj = (Reference)map.get(obj);
        if (obj != null)
        {
            return ((Reference) (obj)).get();
        } else
        {
            return null;
        }
    }

    public void lock()
    {
        lock.lock();
    }

    public void put(Object obj, Object obj1)
    {
        lock.lock();
        map.put(obj, new WeakReference(obj1));
        lock.unlock();
        return;
        obj;
        lock.unlock();
        throw obj;
    }

    public void putNoLock(Object obj, Object obj1)
    {
        map.put(obj, new WeakReference(obj1));
    }

    public void remove(Iterable iterable)
    {
        lock.lock();
        Object obj;
        for (iterable = iterable.iterator(); iterable.hasNext(); map.remove(obj))
        {
            obj = iterable.next();
        }

        break MISSING_BLOCK_LABEL_52;
        iterable;
        lock.unlock();
        throw iterable;
        lock.unlock();
        return;
    }

    public void remove(Object obj)
    {
        lock.lock();
        map.remove(obj);
        lock.unlock();
        return;
        obj;
        lock.unlock();
        throw obj;
    }

    public void reserveRoom(int i)
    {
    }

    public void unlock()
    {
        lock.unlock();
    }
}
