// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.i;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

// Referenced classes of package p.i:
//            d, a, e

public class f
{
    public class a
    {

        final f a;

        public f a()
        {
            return a;
        }

        public boolean a(Exception exception)
        {
label0:
            {
                synchronized (f.a(a))
                {
                    if (!f.b(a))
                    {
                        break label0;
                    }
                }
                return false;
            }
            f.a(a, true);
            f.a(a, exception);
            f.a(a).notifyAll();
            f.c(a);
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
                synchronized (f.a(a))
                {
                    if (!f.b(a))
                    {
                        break label0;
                    }
                }
                return false;
            }
            f.a(a, true);
            f.a(a, obj);
            f.a(a).notifyAll();
            f.c(a);
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
                synchronized (f.a(a))
                {
                    if (!f.b(a))
                    {
                        break label0;
                    }
                }
                return false;
            }
            f.a(a, true);
            f.b(a, true);
            f.a(a).notifyAll();
            f.c(a);
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
            a = f.this;
            super();
        }

    }


    public static final ExecutorService a = p.i.d.a();
    public static final Executor b = p.i.a.b();
    private static final Executor c = p.i.d.b();
    private final Object d = new Object();
    private boolean e;
    private boolean f;
    private Object g;
    private Exception h;
    private List i;

    private f()
    {
        i = new ArrayList();
    }

    static Exception a(f f1, Exception exception)
    {
        f1.h = exception;
        return exception;
    }

    static Object a(f f1)
    {
        return f1.d;
    }

    static Object a(f f1, Object obj)
    {
        f1.g = obj;
        return obj;
    }

    public static a a()
    {
        f f1 = new f();
        f1.getClass();
        return f1. new a();
    }

    public static f a(Exception exception)
    {
        a a1 = a();
        a1.b(exception);
        return a1.a();
    }

    public static f a(Object obj)
    {
        a a1 = a();
        a1.b(obj);
        return a1.a();
    }

    static void a(a a1, e e1, f f1, Executor executor)
    {
        c(a1, e1, f1, executor);
    }

    static boolean a(f f1, boolean flag)
    {
        f1.e = flag;
        return flag;
    }

    static void b(a a1, e e1, f f1, Executor executor)
    {
        d(a1, e1, f1, executor);
    }

    static boolean b(f f1)
    {
        return f1.e;
    }

    static boolean b(f f1, boolean flag)
    {
        f1.f = flag;
        return flag;
    }

    private static void c(a a1, e e1, f f1, Executor executor)
    {
        executor.execute(new Runnable(e1, f1, a1) {

            final e a;
            final f b;
            final a c;

            public void run()
            {
                try
                {
                    Object obj = a.then(b);
                    c.b(obj);
                    return;
                }
                catch (Exception exception)
                {
                    c.b(exception);
                }
            }

            
            {
                a = e1;
                b = f1;
                c = a1;
                super();
            }
        });
    }

    static void c(f f1)
    {
        f1.h();
    }

    private static void d(a a1, e e1, f f1, Executor executor)
    {
        executor.execute(new Runnable(e1, f1, a1) {

            final e a;
            final f b;
            final a c;

            public void run()
            {
                f f2 = (f)a.then(b);
                if (f2 == null)
                {
                    try
                    {
                        c.b(null);
                        return;
                    }
                    catch (Exception exception)
                    {
                        c.b(exception);
                    }
                    break MISSING_BLOCK_LABEL_53;
                }
                f2.a(new e(this) {

                    final _cls2 a;

                    public Void a(f f1)
                    {
                        if (f1.c())
                        {
                            a.c.c();
                        } else
                        if (f1.d())
                        {
                            a.c.b(f1.f());
                        } else
                        {
                            a.c.b(f1.e());
                        }
                        return null;
                    }

                    public Object then(f f1)
                        throws Exception
                    {
                        return a(f1);
                    }

            
            {
                a = _pcls2;
                super();
            }
                });
                return;
            }

            
            {
                a = e1;
                b = f1;
                c = a1;
                super();
            }
        });
    }

    public static f g()
    {
        a a1 = a();
        a1.c();
        return a1.a();
    }

    private void h()
    {
        Object obj = d;
        obj;
        JVM INSTR monitorenter ;
        Iterator iterator = i.iterator();
_L1:
        e e1;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_65;
        }
        e1 = (e)iterator.next();
        e1.then(this);
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

    public f a(e e1)
    {
        return a(e1, c);
    }

    public f a(e e1, Executor executor)
    {
        a a1 = a();
        Object obj = d;
        obj;
        JVM INSTR monitorenter ;
        boolean flag = b();
        if (flag)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        i.add(new e(a1, e1, executor) {

            final a a;
            final e b;
            final Executor c;
            final f d;

            public Void a(f f1)
            {
                f.a(a, b, f1, c);
                return null;
            }

            public Object then(f f1)
                throws Exception
            {
                return a(f1);
            }

            
            {
                d = f.this;
                a = a1;
                b = e1;
                c = executor;
                super();
            }
        });
        obj;
        JVM INSTR monitorexit ;
        if (flag)
        {
            c(a1, e1, this, executor);
        }
        return a1.a();
        e1;
        obj;
        JVM INSTR monitorexit ;
        throw e1;
    }

    public f b(e e1)
    {
        return c(e1, c);
    }

    public f b(e e1, Executor executor)
    {
        a a1 = a();
        Object obj = d;
        obj;
        JVM INSTR monitorenter ;
        boolean flag = b();
        if (flag)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        i.add(new e(a1, e1, executor) {

            final a a;
            final e b;
            final Executor c;
            final f d;

            public Void a(f f1)
            {
                f.b(a, b, f1, c);
                return null;
            }

            public Object then(f f1)
                throws Exception
            {
                return a(f1);
            }

            
            {
                d = f.this;
                a = a1;
                b = e1;
                c = executor;
                super();
            }
        });
        obj;
        JVM INSTR monitorexit ;
        if (flag)
        {
            d(a1, e1, this, executor);
        }
        return a1.a();
        e1;
        obj;
        JVM INSTR monitorexit ;
        throw e1;
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

    public f c(e e1, Executor executor)
    {
        return b(new e(e1) {

            final e a;
            final f b;

            public f a(f f1)
            {
                if (f1.d())
                {
                    return f.a(f1.f());
                }
                if (f1.c())
                {
                    return f.g();
                } else
                {
                    return f1.a(a);
                }
            }

            public Object then(f f1)
                throws Exception
            {
                return a(f1);
            }

            
            {
                b = f.this;
                a = e1;
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


    // Unreferenced inner class p/i/f$1

/* anonymous class */
    class _cls1
        implements e
    {

        public f a(f f1)
            throws Exception
        {
            if (f1.c())
            {
                return f.g();
            }
            if (f1.d())
            {
                return f.a(f1.f());
            } else
            {
                return f.a(null);
            }
        }

        public Object then(f f1)
            throws Exception
        {
            return a(f1);
        }
    }

}
