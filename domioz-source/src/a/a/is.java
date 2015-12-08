// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.locks.ReentrantLock;

// Referenced classes of package a.a:
//            ir, iu

abstract class is
    implements Iterator
{

    iu a;
    Object b;
    final ir c;
    private iu d;

    is(ir ir1)
    {
        ReentrantLock reentrantlock;
        c = ir1;
        super();
        reentrantlock = ir1.c;
        reentrantlock.lock();
        a = a();
        if (a != null)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        ir1 = null;
_L1:
        b = ir1;
        reentrantlock.unlock();
        return;
        ir1 = ((ir) (a.a));
          goto _L1
        ir1;
        reentrantlock.unlock();
        throw ir1;
    }

    private void b()
    {
        Object obj1;
        ReentrantLock reentrantlock;
        obj1 = null;
        reentrantlock = c.c;
        reentrantlock.lock();
        iu iu1 = a;
_L6:
        iu iu2 = a(iu1);
        if (iu2 != null) goto _L2; else goto _L1
_L1:
        Object obj = null;
_L4:
        a = ((iu) (obj));
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
        obj = iu2;
        if (iu2.a != null) goto _L4; else goto _L3
_L3:
        if (iu2 != iu1)
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
        iu1 = iu2;
          goto _L6
    }

    abstract iu a();

    abstract iu a(iu iu1);

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
        iu iu1;
        iu1 = d;
        if (iu1 == null)
        {
            throw new IllegalStateException();
        }
        d = null;
        reentrantlock = c.c;
        reentrantlock.lock();
        if (iu1.a != null)
        {
            c.a(iu1);
        }
        reentrantlock.unlock();
        return;
        Exception exception;
        exception;
        reentrantlock.unlock();
        throw exception;
    }
}
