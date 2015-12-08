// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.a;

import java.util.Iterator;
import java.util.List;
import rx.P;
import rx.b.a;

final class ee
    implements a
{

    final ea.a a;
    final ea.c b;

    ee(ea.c c, ea.a a1)
    {
        b = c;
        a = a1;
        super();
    }

    public final void call()
    {
        ea.a a1;
        Object obj1;
label0:
        {
            obj1 = b;
            a1 = a;
            synchronized (((ea.c) (obj1)).c)
            {
                if (!((ea.c) (obj1)).e)
                {
                    break label0;
                }
            }
            return;
        }
        obj1 = ((ea.c) (obj1)).d.iterator();
        do
        {
            if (!((Iterator) (obj1)).hasNext())
            {
                break MISSING_BLOCK_LABEL_90;
            }
        } while ((ea.a)((Iterator) (obj1)).next() != a1);
        boolean flag = true;
        ((Iterator) (obj1)).remove();
_L1:
        obj;
        JVM INSTR monitorexit ;
        if (flag)
        {
            a1.a.onCompleted();
            return;
        } else
        {
            return;
        }
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        flag = false;
          goto _L1
    }
}
