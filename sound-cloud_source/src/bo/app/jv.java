// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.locks.ReentrantLock;

// Referenced classes of package bo.app:
//            ju, jx

abstract class jv
    implements Iterator
{

    jx a;
    Object b;
    final ju c;
    private jx d;

    jv(ju ju1)
    {
        ReentrantLock reentrantlock;
        c = ju1;
        super();
        reentrantlock = ju1.c;
        reentrantlock.lock();
        a = a();
        if (a != null)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        ju1 = null;
_L1:
        b = ju1;
        reentrantlock.unlock();
        return;
        ju1 = ((ju) (a.a));
          goto _L1
        ju1;
        reentrantlock.unlock();
        throw ju1;
    }

    private void b()
    {
        Object obj1;
        ReentrantLock reentrantlock;
        obj1 = null;
        reentrantlock = c.c;
        reentrantlock.lock();
        jx jx1 = a;
_L6:
        jx jx2 = a(jx1);
        if (jx2 != null) goto _L2; else goto _L1
_L1:
        Object obj = null;
_L4:
        a = ((jx) (obj));
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
        obj = jx2;
        if (jx2.a != null) goto _L4; else goto _L3
_L3:
        if (jx2 != jx1)
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
        jx1 = jx2;
          goto _L6
    }

    abstract jx a();

    abstract jx a(jx jx1);

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
        jx jx1;
        jx1 = d;
        if (jx1 == null)
        {
            throw new IllegalStateException();
        }
        d = null;
        reentrantlock = c.c;
        reentrantlock.lock();
        if (jx1.a != null)
        {
            c.a(jx1);
        }
        reentrantlock.unlock();
        return;
        Exception exception;
        exception;
        reentrantlock.unlock();
        throw exception;
    }
}
