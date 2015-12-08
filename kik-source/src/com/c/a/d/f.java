// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.a.d;

import com.c.a.a.ag;
import com.c.a.a.u;
import java.io.Closeable;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.logging.Level;
import java.util.logging.Logger;

// Referenced classes of package com.c.a.d:
//            e

public final class f
    implements Closeable
{
    static final class a
        implements c
    {

        static final a a = new a();

        public final void a(Closeable closeable, Throwable throwable, Throwable throwable1)
        {
            throwable = e.a;
            Level level = Level.WARNING;
            closeable = String.valueOf(String.valueOf(closeable));
            throwable.log(level, (new StringBuilder(closeable.length() + 42)).append("Suppressing exception thrown when closing ").append(closeable).toString(), throwable1);
        }


        a()
        {
        }
    }

    static final class b
        implements c
    {

        static final b a = new b();
        static final Method b = b();

        static boolean a()
        {
            return b != null;
        }

        private static Method b()
        {
            Method method;
            try
            {
                method = java/lang/Throwable.getMethod("addSuppressed", new Class[] {
                    java/lang/Throwable
                });
            }
            catch (Throwable throwable)
            {
                return null;
            }
            return method;
        }

        public final void a(Closeable closeable, Throwable throwable, Throwable throwable1)
        {
            if (throwable == throwable1)
            {
                return;
            }
            try
            {
                b.invoke(throwable, new Object[] {
                    throwable1
                });
                return;
            }
            catch (Throwable throwable2)
            {
                a.a.a(closeable, throwable, throwable1);
            }
        }


        b()
        {
        }
    }

    static interface c
    {

        public abstract void a(Closeable closeable, Throwable throwable, Throwable throwable1);
    }


    private static final c b;
    final c a;
    private final Deque c = new ArrayDeque(4);
    private Throwable d;

    private f(c c1)
    {
        a = (c)u.a(c1);
    }

    public static f a()
    {
        return new f(b);
    }

    public final Closeable a(Closeable closeable)
    {
        if (closeable != null)
        {
            c.addFirst(closeable);
        }
        return closeable;
    }

    public final RuntimeException a(Throwable throwable)
    {
        u.a(throwable);
        d = throwable;
        ag.a(throwable, java/io/IOException);
        throw new RuntimeException(throwable);
    }

    public final void close()
    {
        Throwable throwable = d;
        while (!c.isEmpty()) 
        {
            Closeable closeable = (Closeable)c.removeFirst();
            try
            {
                closeable.close();
            }
            catch (Throwable throwable1)
            {
                if (throwable == null)
                {
                    throwable = throwable1;
                } else
                {
                    a.a(closeable, throwable, throwable1);
                }
            }
        }
        if (d == null && throwable != null)
        {
            ag.a(throwable, java/io/IOException);
            throw new AssertionError(throwable);
        } else
        {
            return;
        }
    }

    static 
    {
        Object obj;
        if (b.a())
        {
            obj = b.a;
        } else
        {
            obj = a.a;
        }
        b = ((c) (obj));
    }
}
