// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.base;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google.common.base:
//            Preconditions

public final class Throwables
{

    private Throwables()
    {
    }

    public static List getCausalChain(Throwable throwable)
    {
        Preconditions.checkNotNull(throwable);
        ArrayList arraylist = new ArrayList(4);
        for (; throwable != null; throwable = throwable.getCause())
        {
            arraylist.add(throwable);
        }

        return Collections.unmodifiableList(arraylist);
    }

    public static Throwable getRootCause(Throwable throwable)
    {
        do
        {
            Throwable throwable1 = throwable.getCause();
            if (throwable1 != null)
            {
                throwable = throwable1;
            } else
            {
                return throwable;
            }
        } while (true);
    }

    public static String getStackTraceAsString(Throwable throwable)
    {
        StringWriter stringwriter = new StringWriter();
        throwable.printStackTrace(new PrintWriter(stringwriter));
        return stringwriter.toString();
    }

    public static RuntimeException propagate(Throwable throwable)
    {
        propagateIfPossible((Throwable)Preconditions.checkNotNull(throwable));
        throw new RuntimeException(throwable);
    }

    public static void propagateIfInstanceOf(Throwable throwable, Class class1)
        throws Throwable
    {
        if (class1.isInstance(throwable))
        {
            throw (Throwable)class1.cast(throwable);
        } else
        {
            return;
        }
    }

    public static void propagateIfPossible(Throwable throwable)
    {
        propagateIfInstanceOf(throwable, java/lang/Error);
        propagateIfInstanceOf(throwable, java/lang/RuntimeException);
    }

    public static void propagateIfPossible(Throwable throwable, Class class1)
        throws Throwable
    {
        propagateIfInstanceOf(throwable, class1);
        propagateIfPossible(throwable);
    }

    public static void propagateIfPossible(Throwable throwable, Class class1, Class class2)
        throws Throwable, Throwable
    {
        Preconditions.checkNotNull(class2);
        propagateIfInstanceOf(throwable, class1);
        propagateIfPossible(throwable, class2);
    }

    public static Exception throwCause(Exception exception, boolean flag)
        throws Exception
    {
        Throwable throwable = exception.getCause();
        if (throwable == null)
        {
            throw exception;
        }
        if (flag)
        {
            StackTraceElement astacktraceelement[] = throwable.getStackTrace();
            StackTraceElement astacktraceelement1[] = exception.getStackTrace();
            StackTraceElement astacktraceelement2[] = new StackTraceElement[astacktraceelement.length + astacktraceelement1.length];
            System.arraycopy(astacktraceelement, 0, astacktraceelement2, 0, astacktraceelement.length);
            System.arraycopy(astacktraceelement1, 0, astacktraceelement2, astacktraceelement.length, astacktraceelement1.length);
            throwable.setStackTrace(astacktraceelement2);
        }
        if (throwable instanceof Exception)
        {
            throw (Exception)throwable;
        }
        if (throwable instanceof Error)
        {
            throw (Error)throwable;
        } else
        {
            throw exception;
        }
    }
}
