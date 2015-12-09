// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bolts;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package bolts:
//            e, b, i, f, 
//            a

public class j
{
    public class a
    {

        final j a;

        public j a()
        {
            return a;
        }

        public boolean a(Exception exception)
        {
label0:
            {
                synchronized (j.a(a))
                {
                    if (!j.b(a))
                    {
                        break label0;
                    }
                }
                return false;
            }
            j.a(a, true);
            j.a(a, exception);
            j.a(a).notifyAll();
            j.c(a);
            obj;
            JVM INSTR monitorexit ;
            return true;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public boolean a(Object obj)
        {
label0:
            {
                synchronized (j.a(a))
                {
                    if (!j.b(a))
                    {
                        break label0;
                    }
                }
                return false;
            }
            j.a(a, true);
            j.a(a, obj);
            j.a(a).notifyAll();
            j.c(a);
            obj1;
            JVM INSTR monitorexit ;
            return true;
            obj;
            obj1;
            JVM INSTR monitorexit ;
            throw obj;
        }

        public void b(Exception exception)
        {
            if (!a(exception))
            {
                throw new IllegalStateException("Cannot set the error on a completed task.");
            } else
            {
                return;
            }
        }

        public void b(Object obj)
        {
            if (!a(obj))
            {
                throw new IllegalStateException("Cannot set the result of a completed task.");
            } else
            {
                return;
            }
        }

        public boolean b()
        {
label0:
            {
                synchronized (j.a(a))
                {
                    if (!j.b(a))
                    {
                        break label0;
                    }
                }
                return false;
            }
            j.a(a, true);
            j.b(a, true);
            j.a(a).notifyAll();
            j.c(a);
            obj;
            JVM INSTR monitorexit ;
            return true;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public void c()
        {
            if (!b())
            {
                throw new IllegalStateException("Cannot cancel a completed task.");
            } else
            {
                return;
            }
        }

        private a()
        {
            a = j.this;
            super();
        }

    }


    public static final ExecutorService a = bolts.e.a();
    public static final Executor b = bolts.b.b();
    private static final Executor c = bolts.e.b();
    private final Object d = new Object();
    private boolean e;
    private boolean f;
    private Object g;
    private Exception h;
    private List i;

    private j()
    {
        i = new ArrayList();
    }

    public static a a()
    {
        j j1 = new j();
        j1.getClass();
        return j1. new a();
    }

    public static j a(Exception exception)
    {
        a a1 = a();
        a1.b(exception);
        return a1.a();
    }

    public static j a(Object obj)
    {
        a a1 = a();
        a1.b(obj);
        return a1.a();
    }

    public static j a(Collection collection)
    {
        if (collection.size() == 0)
        {
            return a(null);
        }
        a a1 = a();
        ArrayList arraylist = new ArrayList();
        Object obj = new Object();
        AtomicInteger atomicinteger = new AtomicInteger(collection.size());
        AtomicBoolean atomicboolean = new AtomicBoolean(false);
        for (collection = collection.iterator(); collection.hasNext(); ((j)collection.next()).a(new i(obj, arraylist, atomicboolean, atomicinteger, a1) {

        final Object a;
        final ArrayList b;
        final AtomicBoolean c;
        final AtomicInteger d;
        final a e;

        public Void a(j j1)
        {
            if (j1.d())
            {
                synchronized (a)
                {
                    b.add(j1.f());
                }
            }
            if (j1.c())
            {
                c.set(true);
            }
            if (d.decrementAndGet() == 0)
            {
                if (b.size() == 0)
                {
                    break MISSING_BLOCK_LABEL_143;
                }
                if (b.size() != 1)
                {
                    break MISSING_BLOCK_LABEL_99;
                }
                e.b((Exception)b.get(0));
            }
            return null;
            j1;
            obj1;
            JVM INSTR monitorexit ;
            throw j1;
            j1 = new bolts.a(String.format("There were %d exceptions.", new Object[] {
                Integer.valueOf(b.size())
            }), b);
            e.b(j1);
            return null;
            if (c.get())
            {
                e.c();
                return null;
            } else
            {
                e.b(null);
                return null;
            }
        }

        public Object then(j j1)
            throws Exception
        {
            return a(j1);
        }

            
            {
                a = obj;
                b = arraylist;
                c = atomicboolean;
                d = atomicinteger;
                e = a1;
                super();
            }
    })) { }
        return a1.a();
    }

    public static j a(Callable callable)
    {
        return a(callable, ((Executor) (a)), null);
    }

    public static j a(Callable callable, Executor executor)
    {
        return a(callable, executor, null);
    }

    public static j a(Callable callable, Executor executor, f f1)
    {
        a a1 = a();
        executor.execute(new Task._cls3(f1, a1, callable));
        return a1.a();
    }

    static Exception a(j j1, Exception exception)
    {
        j1.h = exception;
        return exception;
    }

    static Object a(j j1)
    {
        return j1.d;
    }

    static Object a(j j1, Object obj)
    {
        j1.g = obj;
        return obj;
    }

    static void a(a a1, i k, j j1, Executor executor, f f1)
    {
        c(a1, k, j1, executor, f1);
    }

    static boolean a(j j1, boolean flag)
    {
        j1.e = flag;
        return flag;
    }

    public static j b(Callable callable)
    {
        return a(callable, c, null);
    }

    static void b(a a1, i k, j j1, Executor executor, f f1)
    {
        d(a1, k, j1, executor, f1);
    }

    static boolean b(j j1)
    {
        return j1.e;
    }

    static boolean b(j j1, boolean flag)
    {
        j1.f = flag;
        return flag;
    }

    private static void c(a a1, i k, j j1, Executor executor, f f1)
    {
        executor.execute(new Task._cls13(f1, a1, k, j1));
    }

    static void c(j j1)
    {
        j1.i();
    }

    private static void d(a a1, i k, j j1, Executor executor, f f1)
    {
        executor.execute(new Task._cls14(f1, a1, k, j1));
    }

    public static j h()
    {
        a a1 = a();
        a1.c();
        return a1.a();
    }

    private void i()
    {
        Object obj = d;
        obj;
        JVM INSTR monitorenter ;
        Iterator iterator = i.iterator();
_L1:
        i k;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_65;
        }
        k = (i)iterator.next();
        k.then(this);
          goto _L1
        Object obj1;
        obj1;
        throw obj1;
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
        obj1;
        throw new RuntimeException(((Throwable) (obj1)));
        i = null;
        obj;
        JVM INSTR monitorexit ;
    }

    public j a(i k)
    {
        return a(k, c, null);
    }

    public j a(i k, Executor executor)
    {
        return a(k, executor, null);
    }

    public j a(i k, Executor executor, f f1)
    {
        a a1 = a();
        Object obj = d;
        obj;
        JVM INSTR monitorenter ;
        boolean flag = b();
        if (flag)
        {
            break MISSING_BLOCK_LABEL_48;
        }
        i.add(new i(a1, k, executor, f1) {

            final a a;
            final i b;
            final Executor c;
            final f d;
            final j e;

            public Void a(j j1)
            {
                j.a(a, b, j1, c, d);
                return null;
            }

            public Object then(j j1)
                throws Exception
            {
                return a(j1);
            }

            
            {
                e = j.this;
                a = a1;
                b = k;
                c = executor;
                d = f1;
                super();
            }
        });
        obj;
        JVM INSTR monitorexit ;
        if (flag)
        {
            c(a1, k, this, executor, f1);
        }
        return a1.a();
        k;
        obj;
        JVM INSTR monitorexit ;
        throw k;
    }

    public j b(i k)
    {
        return b(k, c, null);
    }

    public j b(i k, Executor executor)
    {
        return b(k, executor, null);
    }

    public j b(i k, Executor executor, f f1)
    {
        a a1 = a();
        Object obj = d;
        obj;
        JVM INSTR monitorenter ;
        boolean flag = b();
        if (flag)
        {
            break MISSING_BLOCK_LABEL_48;
        }
        i.add(new i(a1, k, executor, f1) {

            final a a;
            final i b;
            final Executor c;
            final f d;
            final j e;

            public Void a(j j1)
            {
                j.b(a, b, j1, c, d);
                return null;
            }

            public Object then(j j1)
                throws Exception
            {
                return a(j1);
            }

            
            {
                e = j.this;
                a = a1;
                b = k;
                c = executor;
                d = f1;
                super();
            }
        });
        obj;
        JVM INSTR monitorexit ;
        if (flag)
        {
            d(a1, k, this, executor, f1);
        }
        return a1.a();
        k;
        obj;
        JVM INSTR monitorexit ;
        throw k;
    }

    public boolean b()
    {
        boolean flag;
        synchronized (d)
        {
            flag = e;
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public j c(i k)
    {
        return c(k, c, null);
    }

    public j c(i k, Executor executor)
    {
        return c(k, executor, null);
    }

    public j c(i k, Executor executor, f f1)
    {
        return b(new i(f1, k) {

            final f a;
            final i b;
            final j c;

            public j a(j j1)
            {
                if (a != null && a.a())
                {
                    return j.h();
                }
                if (j1.d())
                {
                    return j.a(j1.f());
                }
                if (j1.c())
                {
                    return j.h();
                } else
                {
                    return j1.a(b);
                }
            }

            public Object then(j j1)
                throws Exception
            {
                return a(j1);
            }

            
            {
                c = j.this;
                a = f1;
                b = k;
                super();
            }
        }, executor);
    }

    public boolean c()
    {
        boolean flag;
        synchronized (d)
        {
            flag = f;
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public j d(i k)
    {
        return d(k, c);
    }

    public j d(i k, Executor executor)
    {
        return d(k, executor, null);
    }

    public j d(i k, Executor executor, f f1)
    {
        return b(new i(f1, k) {

            final f a;
            final i b;
            final j c;

            public j a(j j1)
            {
                if (a != null && a.a())
                {
                    return j.h();
                }
                if (j1.d())
                {
                    return j.a(j1.f());
                }
                if (j1.c())
                {
                    return j.h();
                } else
                {
                    return j1.b(b);
                }
            }

            public Object then(j j1)
                throws Exception
            {
                return a(j1);
            }

            
            {
                c = j.this;
                a = f1;
                b = k;
                super();
            }
        }, executor);
    }

    public boolean d()
    {
        Object obj = d;
        obj;
        JVM INSTR monitorenter ;
        Exception exception;
        boolean flag;
        if (h != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj;
        JVM INSTR monitorexit ;
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public Object e()
    {
        Object obj1;
        synchronized (d)
        {
            obj1 = g;
        }
        return obj1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public Exception f()
    {
        Exception exception;
        synchronized (d)
        {
            exception = h;
        }
        return exception;
        exception1;
        obj;
        JVM INSTR monitorexit ;
        throw exception1;
    }

    public void g()
        throws InterruptedException
    {
        synchronized (d)
        {
            if (!b())
            {
                d.wait();
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }


    // Unreferenced inner class bolts/Task$1

/* anonymous class */
    static final class Task._cls1
        implements Runnable
    {

        final a a;

        public void run()
        {
            a.b(null);
        }
    }


    // Unreferenced inner class bolts/Task$13

/* anonymous class */
    static final class Task._cls13
        implements Runnable
    {

        final f a;
        final a b;
        final i c;
        final j d;

        public void run()
        {
            if (a != null && a.a())
            {
                b.c();
                return;
            }
            try
            {
                Object obj = c.then(d);
                b.b(obj);
                return;
            }
            catch (CancellationException cancellationexception)
            {
                b.c();
                return;
            }
            catch (Exception exception)
            {
                b.b(exception);
            }
        }

            
            {
                a = f1;
                b = a1;
                c = k;
                d = j1;
                super();
            }
    }


    // Unreferenced inner class bolts/Task$14

/* anonymous class */
    static final class Task._cls14
        implements Runnable
    {

        final f a;
        final a b;
        final i c;
        final j d;

        public void run()
        {
            if (a != null && a.a())
            {
                b.c();
                return;
            }
            Object obj = (j)c.then(d);
            if (obj == null)
            {
                try
                {
                    b.b(null);
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    b.c();
                    return;
                }
                catch (Exception exception)
                {
                    b.b(exception);
                }
                break MISSING_BLOCK_LABEL_87;
            }
            ((j) (obj)).a(new Task._cls14._cls1(this));
            return;
        }

            
            {
                a = f1;
                b = a1;
                c = k;
                d = j1;
                super();
            }
    }


    // Unreferenced inner class bolts/Task$14$1

/* anonymous class */
    class Task._cls14._cls1
        implements i
    {

        final Task._cls14 a;

        public Void a(j j1)
        {
            if (a.a != null && a.a.a())
            {
                a.b.c();
                return null;
            }
            if (j1.c())
            {
                a.b.c();
                return null;
            }
            if (j1.d())
            {
                a.b.b(j1.f());
                return null;
            } else
            {
                a.b.b(j1.e());
                return null;
            }
        }

        public Object then(j j1)
            throws Exception
        {
            return a(j1);
        }

            
            {
                a = _pcls14;
                super();
            }
    }


    // Unreferenced inner class bolts/Task$3

/* anonymous class */
    static final class Task._cls3
        implements Runnable
    {

        final f a;
        final a b;
        final Callable c;

        public void run()
        {
            if (a != null && a.a())
            {
                b.c();
                return;
            }
            try
            {
                b.b(c.call());
                return;
            }
            catch (CancellationException cancellationexception)
            {
                b.c();
                return;
            }
            catch (Exception exception)
            {
                b.b(exception);
            }
        }

            
            {
                a = f1;
                b = a1;
                c = callable;
                super();
            }
    }

}
