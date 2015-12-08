// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.locks.ReentrantLock;

// Referenced classes of package bo.app:
//            jz, kc

abstract class ka
    implements Iterator
{

    kc a;
    Object b;
    final jz c;
    private kc d;

    ka(jz jz1)
    {
        ReentrantLock reentrantlock;
        c = jz1;
        super();
        reentrantlock = jz1.c;
        reentrantlock.lock();
        a = a();
        if (a != null)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        jz1 = null;
_L1:
        b = jz1;
        reentrantlock.unlock();
        return;
        jz1 = ((jz) (a.a));
          goto _L1
        jz1;
        reentrantlock.unlock();
        throw jz1;
    }

    private void b()
    {
        Object obj1;
        ReentrantLock reentrantlock;
        obj1 = null;
        reentrantlock = c.c;
        reentrantlock.lock();
        kc kc1 = a;
_L6:
        kc kc2 = a(kc1);
        if (kc2 != null) goto _L2; else goto _L1
_L1:
        Object obj = null;
_L4:
        a = ((kc) (obj));
        if (a != null)
        {
            break MISSING_BLOCK_LABEL_82;
        }
        obj = obj1;
_L5:
        b = obj;
        reentrantlock.unlock();
        return;
_L2:
        obj = kc2;
        if (kc2.a != null) goto _L4; else goto _L3
_L3:
        if (kc2 != kc1)
        {
            break MISSING_BLOCK_LABEL_101;
        }
        obj = a();
          goto _L4
        obj = a.a;
          goto _L5
        Exception exception;
        exception;
        reentrantlock.unlock();
        throw exception;
        kc1 = kc2;
          goto _L6
    }

    abstract kc a();

    abstract kc a(kc kc1);

    public boolean hasNext()
    {
        return a != null;
    }

    public Object next()
    {
        if (a == null)
        {
            throw new NoSuchElementException();
        } else
        {
            d = a;
            Object obj = b;
            b();
            return obj;
        }
    }

    public void remove()
    {
        ReentrantLock reentrantlock;
        kc kc1;
        kc1 = d;
        if (kc1 == null)
        {
            throw new IllegalStateException();
        }
        d = null;
        reentrantlock = c.c;
        reentrantlock.lock();
        if (kc1.a != null)
        {
            c.a(kc1);
        }
        reentrantlock.unlock();
        return;
        Exception exception;
        exception;
        reentrantlock.unlock();
        throw exception;
    }
}
