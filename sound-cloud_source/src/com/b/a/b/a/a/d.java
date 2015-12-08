// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a.b.a.a;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractQueue;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

// Referenced classes of package com.b.a.b.a.a:
//            a

public class d extends AbstractQueue
    implements com.b.a.b.a.a.a, Serializable
{
    private abstract class a
        implements Iterator
    {

        c a;
        Object b;
        final d c;
        private c d;

        private void b()
        {
            Object obj1;
            ReentrantLock reentrantlock;
            obj1 = null;
            reentrantlock = c.c;
            reentrantlock.lock();
            c c1 = a;
_L6:
            c c2 = a(c1);
            if (c2 != null) goto _L2; else goto _L1
_L1:
            Object obj = null;
_L4:
            a = ((c) (obj));
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
            obj = c2;
            if (c2.a != null) goto _L4; else goto _L3
_L3:
            if (c2 != c1)
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
            c1 = c2;
              goto _L6
        }

        abstract c a();

        abstract c a(c c1);

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
            c c1;
            c1 = d;
            if (c1 == null)
            {
                throw new IllegalStateException();
            }
            d = null;
            reentrantlock = c.c;
            reentrantlock.lock();
            if (c1.a != null)
            {
                c.a(c1);
            }
            reentrantlock.unlock();
            return;
            Exception exception;
            exception;
            reentrantlock.unlock();
            throw exception;
        }

        a()
        {
            ReentrantLock reentrantlock;
            c = d.this;
            super();
            reentrantlock = d.this.c;
            reentrantlock.lock();
            a = a();
            if (a != null)
            {
                break MISSING_BLOCK_LABEL_45;
            }
            d1 = null;
_L1:
            b = d.this;
            reentrantlock.unlock();
            return;
            d1 = ((d) (a.a));
              goto _L1
            d1;
            reentrantlock.unlock();
            throw d.this;
        }
    }

    private final class b extends a
    {

        final d d;

        final c a()
        {
            return d.a;
        }

        final c a(c c1)
        {
            return c1.c;
        }

        private b()
        {
            d = d.this;
            super();
        }

        b(byte byte0)
        {
            this();
        }
    }

    static final class c
    {

        Object a;
        c b;
        c c;

        c(Object obj)
        {
            a = obj;
        }
    }


    transient c a;
    transient c b;
    final ReentrantLock c;
    private transient int d;
    private final int e;
    private final Condition f;
    private final Condition g;

    public d()
    {
        this((byte)0);
    }

    private d(byte byte0)
    {
        c = new ReentrantLock();
        f = c.newCondition();
        g = c.newCondition();
        e = 0x7fffffff;
    }

    private Object a(long l, TimeUnit timeunit)
        throws InterruptedException
    {
        l = timeunit.toNanos(l);
        timeunit = c;
        timeunit.lockInterruptibly();
_L2:
        Object obj = b();
        if (obj != null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (l <= 0L)
        {
            timeunit.unlock();
            return null;
        }
        l = f.awaitNanos(l);
        if (true) goto _L2; else goto _L1
_L1:
        timeunit.unlock();
        return obj;
        Exception exception;
        exception;
        timeunit.unlock();
        throw exception;
    }

    private boolean a(Object obj, long l, TimeUnit timeunit)
        throws InterruptedException
    {
        if (obj == null)
        {
            throw new NullPointerException();
        }
        obj = new c(obj);
        l = timeunit.toNanos(l);
        timeunit = c;
        timeunit.lockInterruptibly();
_L2:
        boolean flag = b(((c) (obj)));
        if (flag)
        {
            break; /* Loop/switch isn't completed */
        }
        if (l <= 0L)
        {
            timeunit.unlock();
            return false;
        }
        l = g.awaitNanos(l);
        if (true) goto _L2; else goto _L1
_L1:
        timeunit.unlock();
        return true;
        obj;
        timeunit.unlock();
        throw obj;
    }

    private Object b()
    {
        c c1 = a;
        if (c1 == null)
        {
            return null;
        }
        c c2 = c1.c;
        Object obj = c1.a;
        c1.a = null;
        c1.c = c1;
        a = c2;
        if (c2 == null)
        {
            b = null;
        } else
        {
            c2.b = null;
        }
        d = d - 1;
        g.signal();
        return obj;
    }

    private boolean b(c c1)
    {
        if (d >= e)
        {
            return false;
        }
        c c2 = b;
        c1.b = c2;
        b = c1;
        if (a == null)
        {
            a = c1;
        } else
        {
            c2.c = c1;
        }
        d = d + 1;
        f.signal();
        return true;
    }

    private boolean b(Object obj)
    {
        c c1;
        if (obj == null)
        {
            throw new NullPointerException();
        }
        c1 = new c(obj);
        obj = c;
        ((ReentrantLock) (obj)).lock();
        boolean flag = b(c1);
        ((ReentrantLock) (obj)).unlock();
        return flag;
        Exception exception;
        exception;
        ((ReentrantLock) (obj)).unlock();
        throw exception;
    }

    private Object c()
    {
        ReentrantLock reentrantlock;
        reentrantlock = c;
        reentrantlock.lock();
        Object obj = b();
        reentrantlock.unlock();
        return obj;
        Exception exception;
        exception;
        reentrantlock.unlock();
        throw exception;
    }

    private boolean c(Object obj)
    {
        ReentrantLock reentrantlock;
        if (obj == null)
        {
            return false;
        }
        reentrantlock = c;
        reentrantlock.lock();
        c c1 = a;
_L2:
        if (c1 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (!obj.equals(c1.a))
        {
            break MISSING_BLOCK_LABEL_46;
        }
        a(c1);
        reentrantlock.unlock();
        return true;
        c1 = c1.c;
        if (true) goto _L2; else goto _L1
_L1:
        reentrantlock.unlock();
        return false;
        obj;
        reentrantlock.unlock();
        throw obj;
    }

    private Object d()
        throws InterruptedException
    {
        ReentrantLock reentrantlock;
        reentrantlock = c;
        reentrantlock.lock();
_L1:
        Object obj = b();
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_37;
        }
        f.await();
          goto _L1
        obj;
        reentrantlock.unlock();
        throw obj;
        reentrantlock.unlock();
        return obj;
    }

    private Object e()
    {
        ReentrantLock reentrantlock;
        reentrantlock = c;
        reentrantlock.lock();
        Object obj = a;
        if (obj != null) goto _L2; else goto _L1
_L1:
        obj = null;
_L4:
        reentrantlock.unlock();
        return obj;
_L2:
        obj = a.a;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        reentrantlock.unlock();
        throw exception;
    }

    public final Object a()
    {
        Object obj = c();
        if (obj == null)
        {
            throw new NoSuchElementException();
        } else
        {
            return obj;
        }
    }

    final void a(c c1)
    {
        c c2 = c1.b;
        c c3 = c1.c;
        if (c2 == null)
        {
            b();
        } else
        if (c3 == null)
        {
            c1 = b;
            if (c1 != null)
            {
                c2 = c1.b;
                c1.a = null;
                c1.b = c1;
                b = c2;
                if (c2 == null)
                {
                    a = null;
                } else
                {
                    c2.c = null;
                }
                d = d - 1;
                g.signal();
                return;
            }
        } else
        {
            c2.c = c3;
            c3.b = c2;
            c1.a = null;
            d = d - 1;
            g.signal();
            return;
        }
    }

    public final boolean a(Object obj)
    {
        c c1;
        if (obj == null)
        {
            throw new NullPointerException();
        }
        c1 = new c(obj);
        obj = c;
        ((ReentrantLock) (obj)).lock();
        int i;
        int j;
        i = d;
        j = e;
        if (i < j) goto _L2; else goto _L1
_L1:
        boolean flag = false;
_L5:
        ((ReentrantLock) (obj)).unlock();
        return flag;
_L2:
        c c2;
        c2 = a;
        c1.c = c2;
        a = c1;
        if (b != null)
        {
            break MISSING_BLOCK_LABEL_111;
        }
        b = c1;
_L3:
        d = d + 1;
        f.signal();
        flag = true;
        continue; /* Loop/switch isn't completed */
        c2.b = c1;
          goto _L3
        Exception exception;
        exception;
        ((ReentrantLock) (obj)).unlock();
        throw exception;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public boolean add(Object obj)
    {
        if (!b(obj))
        {
            throw new IllegalStateException("Deque full");
        } else
        {
            return true;
        }
    }

    public void clear()
    {
        ReentrantLock reentrantlock;
        reentrantlock = c;
        reentrantlock.lock();
        c c1 = a;
_L2:
        if (c1 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        c c2;
        c1.a = null;
        c2 = c1.c;
        c1.b = null;
        c1.c = null;
        c1 = c2;
        if (true) goto _L2; else goto _L1
_L1:
        b = null;
        a = null;
        d = 0;
        g.signalAll();
        reentrantlock.unlock();
        return;
        Exception exception;
        exception;
        reentrantlock.unlock();
        throw exception;
    }

    public boolean contains(Object obj)
    {
        ReentrantLock reentrantlock;
        if (obj == null)
        {
            return false;
        }
        reentrantlock = c;
        reentrantlock.lock();
        c c1 = a;
_L2:
        if (c1 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        boolean flag = obj.equals(c1.a);
        if (flag)
        {
            reentrantlock.unlock();
            return true;
        }
        c1 = c1.c;
        if (true) goto _L2; else goto _L1
_L1:
        reentrantlock.unlock();
        return false;
        obj;
        reentrantlock.unlock();
        throw obj;
    }

    public int drainTo(Collection collection)
    {
        return drainTo(collection, 0x7fffffff);
    }

    public int drainTo(Collection collection, int i)
    {
        ReentrantLock reentrantlock;
        if (collection == null)
        {
            throw new NullPointerException();
        }
        if (collection == this)
        {
            throw new IllegalArgumentException();
        }
        reentrantlock = c;
        reentrantlock.lock();
        int j = Math.min(i, d);
        i = 0;
_L2:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        collection.add(a.a);
        b();
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        reentrantlock.unlock();
        return j;
        collection;
        reentrantlock.unlock();
        throw collection;
    }

    public Object element()
    {
        Object obj = e();
        if (obj == null)
        {
            throw new NoSuchElementException();
        } else
        {
            return obj;
        }
    }

    public Iterator iterator()
    {
        return new b((byte)0);
    }

    public boolean offer(Object obj)
    {
        return b(obj);
    }

    public boolean offer(Object obj, long l, TimeUnit timeunit)
        throws InterruptedException
    {
        return a(obj, l, timeunit);
    }

    public Object peek()
    {
        return e();
    }

    public Object poll()
    {
        return c();
    }

    public Object poll(long l, TimeUnit timeunit)
        throws InterruptedException
    {
        return a(l, timeunit);
    }

    public void put(Object obj)
        throws InterruptedException
    {
        c c1;
        if (obj == null)
        {
            throw new NullPointerException();
        }
        c1 = new c(obj);
        obj = c;
        ((ReentrantLock) (obj)).lock();
        for (; !b(c1); g.await()) { }
        break MISSING_BLOCK_LABEL_57;
        Exception exception;
        exception;
        ((ReentrantLock) (obj)).unlock();
        throw exception;
        ((ReentrantLock) (obj)).unlock();
        return;
    }

    public int remainingCapacity()
    {
        ReentrantLock reentrantlock;
        reentrantlock = c;
        reentrantlock.lock();
        int i;
        int j;
        i = e;
        j = d;
        reentrantlock.unlock();
        return i - j;
        Exception exception;
        exception;
        reentrantlock.unlock();
        throw exception;
    }

    public Object remove()
    {
        return a();
    }

    public boolean remove(Object obj)
    {
        return c(obj);
    }

    public int size()
    {
        ReentrantLock reentrantlock;
        reentrantlock = c;
        reentrantlock.lock();
        int i = d;
        reentrantlock.unlock();
        return i;
        Exception exception;
        exception;
        reentrantlock.unlock();
        throw exception;
    }

    public Object take()
        throws InterruptedException
    {
        return d();
    }

    public Object[] toArray()
    {
        ReentrantLock reentrantlock;
        reentrantlock = c;
        reentrantlock.lock();
        Object aobj[] = new Object[d];
        int i = 0;
        c c1 = a;
_L2:
        if (c1 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        aobj[i] = c1.a;
        c1 = c1.c;
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        reentrantlock.unlock();
        return aobj;
        Exception exception;
        exception;
        reentrantlock.unlock();
        throw exception;
    }

    public Object[] toArray(Object aobj[])
    {
        Object aobj1[];
        ReentrantLock reentrantlock;
        reentrantlock = c;
        reentrantlock.lock();
        aobj1 = aobj;
        if (aobj.length < d)
        {
            aobj1 = (Object[])(Object[])Array.newInstance(((Object) (aobj)).getClass().getComponentType(), d);
        }
        int i = 0;
        aobj = a;
_L2:
        if (aobj == null)
        {
            break; /* Loop/switch isn't completed */
        }
        aobj1[i] = ((c) (aobj)).a;
        aobj = ((c) (aobj)).c;
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        if (aobj1.length > i)
        {
            aobj1[i] = null;
        }
        reentrantlock.unlock();
        return aobj1;
        aobj;
        reentrantlock.unlock();
        throw aobj;
    }

    public String toString()
    {
        ReentrantLock reentrantlock;
        reentrantlock = c;
        reentrantlock.lock();
        Object obj = a;
        if (obj == null)
        {
            reentrantlock.unlock();
            return "[]";
        }
        StringBuilder stringbuilder;
        stringbuilder = new StringBuilder();
        stringbuilder.append('[');
_L1:
        Object obj2 = ((c) (obj)).a;
        Object obj1;
        obj1 = obj2;
        if (obj2 == this)
        {
            obj1 = "(this Collection)";
        }
        stringbuilder.append(obj1);
        obj = ((c) (obj)).c;
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_94;
        }
        obj = stringbuilder.append(']').toString();
        reentrantlock.unlock();
        return ((String) (obj));
        stringbuilder.append(',').append(' ');
          goto _L1
        Exception exception;
        exception;
        reentrantlock.unlock();
        throw exception;
    }
}
