// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import java.util.Collection;
import java.util.concurrent.atomic.AtomicReference;
import rx.Subscriber;
import rx.exceptions.Exceptions;
import rx.exceptions.OnErrorThrowable;

// Referenced classes of package rx.internal.operators:
//            NotificationLite

class set extends AtomicReference
    implements set
{

    private static final long serialVersionUID = 0x2090aef8efde5e9eL;
    final NotificationLite nl = NotificationLite.instance();
    int size;
    set tail;

    final void addLast(set set)
    {
        tail.tail(set);
        tail = set;
        size = size + 1;
    }

    final void collect(Collection collection)
    {
        size size1 = (size)get();
        do
        {
            Object obj;
label0:
            {
                size1 = (get)size1.get();
                if (size1 != null)
                {
                    obj = leaveTransform(size1.leaveTransform);
                    if (!nl.isCompleted(obj) && !nl.isError(obj))
                    {
                        break label0;
                    }
                }
                return;
            }
            collection.add(nl.getValue(obj));
        } while (true);
    }

    public final void complete()
    {
        addLast(new addLast(enterTransform(nl.completed())));
        truncateFinal();
    }

    Object enterTransform(Object obj)
    {
        return obj;
    }

    public final void error(Throwable throwable)
    {
        addLast(new addLast(enterTransform(nl.error(throwable))));
        truncateFinal();
    }

    boolean hasCompleted()
    {
        return tail.tail != null && nl.isCompleted(leaveTransform(tail.tail));
    }

    boolean hasError()
    {
        return tail.tail != null && nl.isError(leaveTransform(tail.tail));
    }

    Object leaveTransform(Object obj)
    {
        return obj;
    }

    public final void next(Object obj)
    {
        addLast(new addLast(enterTransform(nl.next(obj))));
        truncate();
    }

    final void removeFirst()
    {
        truncate truncate1 = (truncate)((truncate)get()).get();
        if (truncate1 == null)
        {
            throw new IllegalStateException("Empty list!");
        } else
        {
            size = size - 1;
            setFirst(truncate1);
            return;
        }
    }

    final void removeSome(int i)
    {
        setFirst setfirst = (setFirst)get();
        while (i > 0) 
        {
            setfirst = (get)setfirst.get();
            i--;
            size = size - 1;
        }
        setFirst(setfirst);
    }

    public final void replay(setFirst setfirst)
    {
        setfirst;
        JVM INSTR monitorenter ;
        if (!setfirst.ng)
        {
            break MISSING_BLOCK_LABEL_17;
        }
        setfirst. = true;
        setfirst;
        JVM INSTR monitorexit ;
        return;
        setfirst.ng = true;
        setfirst;
        JVM INSTR monitorexit ;
_L4:
        Object obj;
        long l;
        long l1;
        if (setfirst.bscribed())
        {
            break; /* Loop/switch isn't completed */
        }
        l1 = setfirst.bscribed();
        setFirst setfirst1 = (bscribed)setfirst.bscribed();
        obj = setfirst1;
        if (setfirst1 == null)
        {
            obj = (bscribed)get();
            setfirst.get = obj;
        }
        l = 0L;
_L2:
        Object obj1;
        if (l1 == 0L)
        {
            break; /* Loop/switch isn't completed */
        }
        obj1 = (get)((get) (obj)).get();
        if (obj1 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = leaveTransform(((leaveTransform) (obj1)).leaveTransform);
        try
        {
            if (nl.accept(setfirst.nl, obj))
            {
                setfirst.nl = null;
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            setfirst.nl = null;
            Exceptions.throwIfFatal(((Throwable) (obj1)));
            setfirst.cribe();
            if (!nl.isError(obj) && !nl.isCompleted(obj))
            {
                setfirst.nl.onError(OnErrorThrowable.addValueAsLastCause(((Throwable) (obj1)), nl.getValue(obj)));
                return;
            }
            break; /* Loop/switch isn't completed */
        }
        break MISSING_BLOCK_LABEL_177;
        obj;
        setfirst;
        JVM INSTR monitorexit ;
        throw obj;
        l++;
        if (setfirst.bscribed())
        {
            break; /* Loop/switch isn't completed */
        }
        obj = obj1;
        if (true) goto _L2; else goto _L1
_L1:
        if (l != 0L)
        {
            setfirst.bscribed = obj;
            if (l1 != 0x7fffffffffffffffL)
            {
                setfirst.ed(l);
            }
        }
        setfirst;
        JVM INSTR monitorenter ;
        if (setfirst.)
        {
            break MISSING_BLOCK_LABEL_245;
        }
        setfirst.ng = false;
        setfirst;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        setfirst;
        JVM INSTR monitorexit ;
        throw exception;
        setfirst. = false;
        setfirst;
        JVM INSTR monitorexit ;
        if (true) goto _L4; else goto _L3
_L3:
    }

    final void setFirst( )
    {
        set();
    }

    void truncate()
    {
    }

    void truncateFinal()
    {
    }

    public ()
    {
          = new (null);
        tail = ;
        set();
    }
}
