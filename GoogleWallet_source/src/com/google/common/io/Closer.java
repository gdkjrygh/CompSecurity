// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.io;

import com.google.common.base.Preconditions;
import com.google.common.base.Throwables;
import java.io.Closeable;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

// Referenced classes of package com.google.common.io:
//            Closeables

public final class Closer
    implements Closeable
{
    static final class LoggingSuppressor
        implements Suppressor
    {

        static final LoggingSuppressor INSTANCE = new LoggingSuppressor();

        public final void suppress(Closeable closeable, Throwable throwable, Throwable throwable1)
        {
            Closeables.logger.log(Level.WARNING, (new StringBuilder("Suppressing exception thrown when closing ")).append(closeable).toString(), throwable1);
        }


        LoggingSuppressor()
        {
        }
    }

    static final class SuppressingSuppressor
        implements Suppressor
    {

        static final SuppressingSuppressor INSTANCE = new SuppressingSuppressor();
        static final Method addSuppressed = getAddSuppressed();

        private static Method getAddSuppressed()
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

        static boolean isAvailable()
        {
            return addSuppressed != null;
        }

        public final void suppress(Closeable closeable, Throwable throwable, Throwable throwable1)
        {
            if (throwable == throwable1)
            {
                return;
            }
            try
            {
                addSuppressed.invoke(throwable, new Object[] {
                    throwable1
                });
                return;
            }
            catch (Throwable throwable2)
            {
                LoggingSuppressor.INSTANCE.suppress(closeable, throwable, throwable1);
            }
        }


        SuppressingSuppressor()
        {
        }
    }

    static interface Suppressor
    {

        public abstract void suppress(Closeable closeable, Throwable throwable, Throwable throwable1);
    }


    private static final Suppressor SUPPRESSOR;
    private final LinkedList stack = new LinkedList();
    final Suppressor suppressor;
    private Throwable thrown;

    private Closer(Suppressor suppressor1)
    {
        suppressor = (Suppressor)Preconditions.checkNotNull(suppressor1);
    }

    public static Closer create()
    {
        return new Closer(SUPPRESSOR);
    }

    public final void close()
        throws IOException
    {
        Throwable throwable = thrown;
        while (!stack.isEmpty()) 
        {
            Closeable closeable = (Closeable)stack.removeFirst();
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
                    suppressor.suppress(closeable, throwable, throwable1);
                }
            }
        }
        if (thrown == null && throwable != null)
        {
            Throwables.propagateIfPossible(throwable, java/io/IOException);
            throw new AssertionError(throwable);
        } else
        {
            return;
        }
    }

    public final Closeable register(Closeable closeable)
    {
        if (closeable != null)
        {
            stack.addFirst(closeable);
        }
        return closeable;
    }

    public final RuntimeException rethrow(Throwable throwable)
        throws IOException
    {
        Preconditions.checkNotNull(throwable);
        thrown = throwable;
        Throwables.propagateIfPossible(throwable, java/io/IOException);
        throw new RuntimeException(throwable);
    }

    static 
    {
        Object obj;
        if (SuppressingSuppressor.isAvailable())
        {
            obj = SuppressingSuppressor.INSTANCE;
        } else
        {
            obj = LoggingSuppressor.INSTANCE;
        }
        SUPPRESSOR = ((Suppressor) (obj));
    }
}
