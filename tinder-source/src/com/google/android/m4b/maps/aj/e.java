// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.aj;

import com.google.android.m4b.maps.aa.q;
import com.google.android.m4b.maps.y.f;
import com.google.android.m4b.maps.y.j;
import java.lang.reflect.Constructor;
import java.lang.reflect.UndeclaredThrowableException;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

// Referenced classes of package com.google.android.m4b.maps.aj:
//            i, f, b, a, 
//            l

public final class e
{
    static final class a extends com.google.android.m4b.maps.aj.a
        implements Runnable
    {

        private com.google.android.m4b.maps.aj.b b;
        private com.google.android.m4b.maps.aj.f c;
        private volatile com.google.android.m4b.maps.aj.f d;
        private final CountDownLatch e;

        static com.google.android.m4b.maps.aj.f a(a a1)
        {
            a1.d = null;
            return null;
        }

        private static void a(Future future, boolean flag)
        {
            if (future != null)
            {
                future.cancel(flag);
            }
        }

        public final boolean cancel(boolean flag)
        {
            if (super.cancel(flag))
            {
                a(c, flag);
                a(d, flag);
                return true;
            } else
            {
                return false;
            }
        }

        public final void run()
        {
            Object obj = l.a(c);
            obj = (com.google.android.m4b.maps.aj.f)j.a(b.a(obj), "AsyncFunction may not return null.");
            d = ((com.google.android.m4b.maps.aj.f) (obj));
            if (!isCancelled())
            {
                break MISSING_BLOCK_LABEL_129;
            }
            ((com.google.android.m4b.maps.aj.f) (obj)).cancel(super.a.d());
            d = null;
            b = null;
            c = null;
            e.countDown();
            return;
            obj;
            cancel(false);
            b = null;
            c = null;
            e.countDown();
            return;
            obj;
            a(((ExecutionException) (obj)).getCause());
            b = null;
            c = null;
            e.countDown();
            return;
            ((com.google.android.m4b.maps.aj.f) (obj)).a(new Runnable(this, ((com.google.android.m4b.maps.aj.f) (obj))) {

                private com.google.android.m4b.maps.aj.f a;
                private a b;

                public final void run()
                {
                    b.a(l.a(a));
                    a.a(b);
                    return;
                    Object obj;
                    obj;
                    b.cancel(false);
                    a.a(b);
                    return;
                    obj;
                    b.a(((ExecutionException) (obj)).getCause());
                    a.a(b);
                    return;
                    obj;
                    a.a(b);
                    throw obj;
                }

            
            {
                b = a1;
                a = f1;
                super();
            }
            }, i.a());
            b = null;
            c = null;
            e.countDown();
            return;
            Object obj1;
            obj1;
            a(((UndeclaredThrowableException) (obj1)).getCause());
            b = null;
            c = null;
            e.countDown();
            return;
            obj1;
            a(((Throwable) (obj1)));
            b = null;
            c = null;
            e.countDown();
            return;
            obj1;
            b = null;
            c = null;
            e.countDown();
            throw obj1;
        }

        private a(com.google.android.m4b.maps.aj.b b1, com.google.android.m4b.maps.aj.f f1)
        {
            e = new CountDownLatch(1);
            b = (com.google.android.m4b.maps.aj.b)j.a(b1);
            c = (com.google.android.m4b.maps.aj.f)j.a(f1);
        }

        a(com.google.android.m4b.maps.aj.b b1, com.google.android.m4b.maps.aj.f f1, byte byte0)
        {
            this(b1, f1);
        }
    }

    static final class b extends c
    {

        private final Throwable a;

        public final Object get()
        {
            throw new ExecutionException(a);
        }

        b(Throwable throwable)
        {
            super((byte)0);
            a = throwable;
        }
    }

    static abstract class c
        implements com.google.android.m4b.maps.aj.f
    {

        private static final Logger a = Logger.getLogger(com/google/android/m4b/maps/aj/e$c.getName());

        public final void a(Runnable runnable, Executor executor)
        {
            j.a(runnable, "Runnable was null.");
            j.a(executor, "Executor was null.");
            try
            {
                executor.execute(runnable);
                return;
            }
            catch (RuntimeException runtimeexception)
            {
                a.log(Level.SEVERE, (new StringBuilder("RuntimeException while executing runnable ")).append(runnable).append(" with executor ").append(executor).toString(), runtimeexception);
            }
        }

        public boolean cancel(boolean flag)
        {
            return false;
        }

        public abstract Object get();

        public Object get(long l, TimeUnit timeunit)
        {
            j.a(timeunit);
            return get();
        }

        public boolean isCancelled()
        {
            return false;
        }

        public boolean isDone()
        {
            return true;
        }


        private c()
        {
        }

        c(byte byte0)
        {
            this();
        }
    }

    static final class d extends c
    {

        private final Object a;

        public final Object get()
        {
            return a;
        }

        d(Object obj)
        {
            super((byte)0);
            a = obj;
        }
    }


    private static final com.google.android.m4b.maps.aj.b a = new com.google.android.m4b.maps.aj.b() {

        public final com.google.android.m4b.maps.aj.f a(Object obj)
        {
            return (com.google.android.m4b.maps.aj.f)obj;
        }

    };
    private static final q b = q.b().a(new f() {

        public final Object a(Object obj)
        {
            return Boolean.valueOf(Arrays.asList(((Constructor)obj).getParameterTypes()).contains(java/lang/String));
        }

    }).a();

    public static com.google.android.m4b.maps.aj.f a(com.google.android.m4b.maps.aj.f f1, f f2)
    {
        h h = i.a();
        j.a(f2);
        f2 = new a(new com.google.android.m4b.maps.aj.b(f2) {

            private f a;

            public final com.google.android.m4b.maps.aj.f a(Object obj)
            {
                return e.a(a.a(obj));
            }

            
            {
                a = f1;
                super();
            }
        }, f1, (byte)0);
        f1.a(f2, h);
        return f2;
    }

    public static com.google.android.m4b.maps.aj.f a(Object obj)
    {
        return new d(obj);
    }

    public static com.google.android.m4b.maps.aj.f a(Throwable throwable)
    {
        j.a(throwable);
        return new b(throwable);
    }

}
