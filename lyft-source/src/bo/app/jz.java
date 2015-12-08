// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractQueue;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

// Referenced classes of package bo.app:
//            jw, kc, kb

public class jz extends AbstractQueue
    implements jw, Serializable
{

    transient kc a;
    transient kc b;
    final ReentrantLock c;
    private transient int d;
    private final int e;
    private final Condition f;
    private final Condition g;

    public jz()
    {
        this((byte)0);
    }

    private jz(byte byte0)
    {
        c = new ReentrantLock();
        f = c.newCondition();
        g = c.newCondition();
        e = 0x7fffffff;
    }

    private Object a(long l, TimeUnit timeunit)
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
    {
        if (obj == null)
        {
            throw new NullPointerException();
        }
        obj = new kc(obj);
        l = timeunit.toNanos(l);
        timeunit = c;
        timeunit.lockInterruptibly();
_L2:
        boolean flag = b(((kc) (obj)));
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
        kc kc1 = a;
        if (kc1 == null)
        {
            return null;
        }
        kc kc2 = kc1.c;
        Object obj = kc1.a;
        kc1.a = null;
        kc1.c = kc1;
        a = kc2;
        if (kc2 == null)
        {
            b = null;
        } else
        {
            kc2.b = null;
        }
        d = d - 1;
        g.signal();
        return obj;
    }

    private boolean b(kc kc1)
    {
        if (d >= e)
        {
            return false;
        }
        kc kc2 = b;
        kc1.b = kc2;
        b = kc1;
        if (a == null)
        {
            a = kc1;
        } else
        {
            kc2.c = kc1;
        }
        d = d + 1;
        f.signal();
        return true;
    }

    private boolean b(Object obj)
    {
        kc kc1;
        if (obj == null)
        {
            throw new NullPointerException();
        }
        kc1 = new kc(obj);
        obj = c;
        ((ReentrantLock) (obj)).lock();
        boolean flag = b(kc1);
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
        kc kc1 = a;
_L2:
        if (kc1 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (!obj.equals(kc1.a))
        {
            break MISSING_BLOCK_LABEL_46;
        }
        a(kc1);
        reentrantlock.unlock();
        return true;
        kc1 = kc1.c;
        if (true) goto _L2; else goto _L1
_L1:
        reentrantlock.unlock();
        return false;
        obj;
        reentrantlock.unlock();
        throw obj;
    }

    private Object d()
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

    final void a(kc kc1)
    {
        kc kc2 = kc1.b;
        Object obj = kc1.c;
        if (kc2 == null)
        {
            b();
        } else
        if (obj == null)
        {
            kc1 = b;
            if (kc1 != null)
            {
                kc2 = kc1.b;
                obj = kc1.a;
                kc1.a = null;
                kc1.b = kc1;
                b = kc2;
                if (kc2 == null)
                {
                    a = null;
                } else
                {
                    kc2.c = null;
                }
                d = d - 1;
                g.signal();
                return;
            }
        } else
        {
            kc2.c = ((kc) (obj));
            obj.b = kc2;
            kc1.a = null;
            d = d - 1;
            g.signal();
            return;
        }
    }

    public final boolean a(Object obj)
    {
        kc kc1;
        if (obj == null)
        {
            throw new NullPointerException();
        }
        kc1 = new kc(obj);
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
        kc kc2;
        kc2 = a;
        kc1.c = kc2;
        a = kc1;
        if (b != null)
        {
            break MISSING_BLOCK_LABEL_111;
        }
        b = kc1;
_L3:
        d = d + 1;
        f.signal();
        flag = true;
        continue; /* Loop/switch isn't completed */
        kc2.b = kc1;
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
        kc kc1 = a;
_L2:
        if (kc1 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        kc kc2;
        kc1.a = null;
        kc2 = kc1.c;
        kc1.b = null;
        kc1.c = null;
        kc1 = kc2;
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
        kc kc1 = a;
_L2:
        if (kc1 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        boolean flag = obj.equals(kc1.a);
        if (flag)
        {
            reentrantlock.unlock();
            return true;
        }
        kc1 = kc1.c;
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
        return new kb(this, (byte)0);
    }

    public boolean offer(Object obj)
    {
        return b(obj);
    }

    public boolean offer(Object obj, long l, TimeUnit timeunit)
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
    {
        return a(l, timeunit);
    }

    public void put(Object obj)
    {
        kc kc1;
        if (obj == null)
        {
            throw new NullPointerException();
        }
        kc1 = new kc(obj);
        obj = c;
        ((ReentrantLock) (obj)).lock();
        for (; !b(kc1); g.await()) { }
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
        kc kc1 = a;
_L2:
        if (kc1 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        aobj[i] = kc1.a;
        kc1 = kc1.c;
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
            aobj1 = (Object[])Array.newInstance(((Object) (aobj)).getClass().getComponentType(), d);
        }
        int i = 0;
        aobj = a;
_L2:
        if (aobj == null)
        {
            break; /* Loop/switch isn't completed */
        }
        aobj1[i] = ((kc) (aobj)).a;
        aobj = ((kc) (aobj)).c;
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
        Object obj2 = ((kc) (obj)).a;
        Object obj1;
        obj1 = obj2;
        if (obj2 == this)
        {
            obj1 = "(this Collection)";
        }
        stringbuilder.append(obj1);
        obj = ((kc) (obj)).c;
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
