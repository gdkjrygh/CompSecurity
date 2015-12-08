// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.exceptions;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

// Referenced classes of package rx.exceptions:
//            CompositeException, OnErrorNotImplementedException, OnErrorFailedException

public final class Exceptions
{

    private static final int MAX_DEPTH = 25;

    private Exceptions()
    {
    }

    public static void addCause(Throwable throwable, Throwable throwable1)
    {
        HashSet hashset = new HashSet();
        int i = 0;
        Throwable throwable2;
        do
        {
            throwable2 = throwable;
            if (throwable.getCause() == null)
            {
                break;
            }
            if (i >= 25)
            {
                return;
            }
            throwable = throwable.getCause();
            throwable2 = throwable;
            if (hashset.contains(throwable.getCause()))
            {
                break;
            }
            hashset.add(throwable.getCause());
            i++;
        } while (true);
        try
        {
            throwable2.initCause(throwable1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Throwable throwable)
        {
            return;
        }
    }

    public static Throwable getFinalCause(Throwable throwable)
    {
        int i = 0;
        do
        {
label0:
            {
                Object obj = throwable;
                if (throwable.getCause() != null)
                {
                    if (i < 25)
                    {
                        break label0;
                    }
                    obj = new RuntimeException("Stack too deep to get final cause");
                }
                return ((Throwable) (obj));
            }
            throwable = throwable.getCause();
            i++;
        } while (true);
    }

    public static RuntimeException propagate(Throwable throwable)
    {
        if (throwable instanceof RuntimeException)
        {
            throw (RuntimeException)throwable;
        }
        if (throwable instanceof Error)
        {
            throw (Error)throwable;
        } else
        {
            throw new RuntimeException(throwable);
        }
    }

    public static void throwIfAny(List list)
    {
        if (list != null && !list.isEmpty())
        {
            if (list.size() == 1)
            {
                list = (Throwable)list.get(0);
                if (list instanceof RuntimeException)
                {
                    throw (RuntimeException)list;
                }
                if (list instanceof Error)
                {
                    throw (Error)list;
                } else
                {
                    throw new RuntimeException(list);
                }
            } else
            {
                throw new CompositeException("Multiple exceptions", list);
            }
        } else
        {
            return;
        }
    }

    public static void throwIfFatal(Throwable throwable)
    {
        if (throwable instanceof OnErrorNotImplementedException)
        {
            throw (OnErrorNotImplementedException)throwable;
        }
        if (throwable instanceof OnErrorFailedException)
        {
            Throwable throwable1 = throwable.getCause();
            if (throwable1 instanceof RuntimeException)
            {
                throw (RuntimeException)throwable1;
            } else
            {
                throw (OnErrorFailedException)throwable;
            }
        }
        if (throwable instanceof StackOverflowError)
        {
            throw (StackOverflowError)throwable;
        }
        if (throwable instanceof VirtualMachineError)
        {
            throw (VirtualMachineError)throwable;
        }
        if (throwable instanceof ThreadDeath)
        {
            throw (ThreadDeath)throwable;
        }
        if (throwable instanceof LinkageError)
        {
            throw (LinkageError)throwable;
        } else
        {
            return;
        }
    }
}
