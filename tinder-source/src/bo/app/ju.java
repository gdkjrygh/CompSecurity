// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.locks.ReentrantLock;

// Referenced classes of package bo.app:
//            jt, jw

abstract class ju
    implements Iterator
{

    jw a;
    Object b;
    final jt c;
    private jw d;

    ju(jt jt1)
    {
        ReentrantLock reentrantlock;
        c = jt1;
        super();
        reentrantlock = jt1.c;
        reentrantlock.lock();
        a = a();
        if (a != null)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        jt1 = null;
_L1:
        b = jt1;
        reentrantlock.unlock();
        return;
        jt1 = ((jt) (a.a));
          goto _L1
        jt1;
        reentrantlock.unlock();
        throw jt1;
    }

    private void b()
    {
        Object obj1;
        ReentrantLock reentrantlock;
        obj1 = null;
        reentrantlock = c.c;
        reentrantlock.lock();
        jw jw1 = a;
_L6:
        jw jw2 = a(jw1);
        if (jw2 != null) goto _L2; else goto _L1
_L1:
        Object obj = null;
_L4:
        a = ((jw) (obj));
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
        obj = jw2;
        if (jw2.a != null) goto _L4; else goto _L3
_L3:
        if (jw2 != jw1)
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
        jw1 = jw2;
          goto _L6
    }

    abstract jw a();

    abstract jw a(jw jw1);

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
        jw jw1;
        jw1 = d;
        if (jw1 == null)
        {
            throw new IllegalStateException();
        }
        d = null;
        reentrantlock = c.c;
        reentrantlock.lock();
        if (jw1.a != null)
        {
            c.a(jw1);
        }
        reentrantlock.unlock();
        return;
        Exception exception;
        exception;
        reentrantlock.unlock();
        throw exception;
    }
}
