// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.a;

import java.util.ArrayList;
import rx.X;
import rx.exceptions.Exceptions;
import rx.exceptions.OnErrorThrowable;

// Referenced classes of package rx.internal.a:
//            bT, g

static final class  extends ArrayList
    implements 
{

    final g a = g.a();
    volatile int b;

    public final void a()
    {
        add(g.b());
        b = b + 1;
    }

    public final void a(Object obj)
    {
        add(g.a(obj));
        b = b + 1;
    }

    public final void a(Throwable throwable)
    {
        add(g.a(throwable));
        b = b + 1;
    }

    public final void a(b b1)
    {
        b1;
        JVM INSTR monitorenter ;
        if (!b1.e)
        {
            break MISSING_BLOCK_LABEL_17;
        }
        b1.f = true;
        b1;
        JVM INSTR monitorexit ;
        return;
        b1.e = true;
        b1;
        JVM INSTR monitorexit ;
_L2:
        int i;
        long l;
        long l2;
        if (b1.isUnsubscribed())
        {
            break; /* Loop/switch isn't completed */
        }
        int j = b;
        Integer integer = (Integer)b1.c;
        long l1;
        if (integer != null)
        {
            i = integer.intValue();
        } else
        {
            i = 0;
        }
        l2 = b1.get();
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
                flag = g.a(b1.b, obj);
            }
            catch (Throwable throwable)
            {
                Exceptions.throwIfFatal(throwable);
                b1.unsubscribe();
                if (!g.c(obj) && !g.b(obj))
                {
                    b1.b.onError(OnErrorThrowable.addValueAsLastCause(throwable, g.e(obj)));
                    return;
                }
                break; /* Loop/switch isn't completed */
            }
            if (flag || b1.isUnsubscribed())
            {
                break; /* Loop/switch isn't completed */
            }
            i++;
            l1--;
            l++;
        } while (true);
        break MISSING_BLOCK_LABEL_182;
        obj;
        b1;
        JVM INSTR monitorexit ;
        throw obj;
        if (l != 0L)
        {
            b1.c = Integer.valueOf(i);
            if (l2 != 0x7fffffffffffffffL)
            {
                b1.b(l);
            }
        }
        b1;
        JVM INSTR monitorenter ;
        if (b1.f)
        {
            break MISSING_BLOCK_LABEL_236;
        }
        b1.e = false;
        b1;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        b1;
        JVM INSTR monitorexit ;
        throw exception;
        b1.f = false;
        b1;
        JVM INSTR monitorexit ;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public ()
    {
        super(16);
    }
}
