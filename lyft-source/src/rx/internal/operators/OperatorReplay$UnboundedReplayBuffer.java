// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import java.util.ArrayList;
import rx.Subscriber;
import rx.exceptions.Exceptions;
import rx.exceptions.OnErrorThrowable;

// Referenced classes of package rx.internal.operators:
//            NotificationLite

final class  extends ArrayList
    implements 
{

    private static final long serialVersionUID = 0x62057d556fa2a2d8L;
    final NotificationLite nl = NotificationLite.instance();
    volatile int size;

    public void complete()
    {
        add(nl.completed());
        size = size + 1;
    }

    public void error(Throwable throwable)
    {
        add(nl.error(throwable));
        size = size + 1;
    }

    public void next(Object obj)
    {
        add(nl.next(obj));
        size = size + 1;
    }

    public void replay(size size1)
    {
        size1;
        JVM INSTR monitorenter ;
        if (!size1.)
        {
            break MISSING_BLOCK_LABEL_17;
        }
        size1. = true;
        size1;
        JVM INSTR monitorexit ;
        return;
        size1. = true;
        size1;
        JVM INSTR monitorexit ;
_L2:
        int i;
        long l;
        long l2;
        if (size1.cribed())
        {
            break; /* Loop/switch isn't completed */
        }
        int j = size;
        Integer integer = (Integer)size1.size();
        long l1;
        if (integer != null)
        {
            i = integer.intValue();
        } else
        {
            i = 0;
        }
        l2 = size1.size();
        l = 0L;
        l1 = l2;
        do
        {
            if (l1 == 0L || i >= j)
            {
                break;
            }
            Object obj = get(i);
            boolean flag;
            try
            {
                flag = nl.accept(size1.nl, obj);
            }
            catch (Throwable throwable)
            {
                Exceptions.throwIfFatal(throwable);
                size1.ibe();
                if (!nl.isError(obj) && !nl.isCompleted(obj))
                {
                    size1.nl.onError(OnErrorThrowable.addValueAsLastCause(throwable, nl.getValue(obj)));
                    return;
                }
                break; /* Loop/switch isn't completed */
            }
            if (flag || size1.cribed())
            {
                break; /* Loop/switch isn't completed */
            }
            i++;
            l1--;
            l++;
        } while (true);
        break MISSING_BLOCK_LABEL_198;
        obj;
        size1;
        JVM INSTR monitorexit ;
        throw obj;
        if (l != 0L)
        {
            size1.cribed = Integer.valueOf(i);
            if (l2 != 0x7fffffffffffffffL)
            {
                size1.(l);
            }
        }
        size1;
        JVM INSTR monitorenter ;
        if (size1.)
        {
            break MISSING_BLOCK_LABEL_252;
        }
        size1. = false;
        size1;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        size1;
        JVM INSTR monitorexit ;
        throw exception;
        size1. = false;
        size1;
        JVM INSTR monitorexit ;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public (int i)
    {
        super(i);
    }
}
