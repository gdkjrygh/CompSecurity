// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.h;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import rx.Y;
import rx.exceptions.Exceptions;

public final class b
    implements Y
{

    private Set a;
    private volatile boolean b;

    public b()
    {
    }

    public transient b(Y ay[])
    {
        a = new HashSet(Arrays.asList(ay));
    }

    public final void a(Y y)
    {
        if (y.isUnsubscribed())
        {
            return;
        }
        if (b) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorenter ;
        if (b)
        {
            break MISSING_BLOCK_LABEL_64;
        }
        if (a == null)
        {
            a = new HashSet(4);
        }
        a.add(y);
        this;
        JVM INSTR monitorexit ;
        return;
        y;
        this;
        JVM INSTR monitorexit ;
        throw y;
        this;
        JVM INSTR monitorexit ;
_L2:
        y.unsubscribe();
        return;
    }

    public final void b(Y y)
    {
        if (b)
        {
            break MISSING_BLOCK_LABEL_55;
        }
        this;
        JVM INSTR monitorenter ;
        if (!b && a != null)
        {
            break MISSING_BLOCK_LABEL_26;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        boolean flag = a.remove(y);
        this;
        JVM INSTR monitorexit ;
        if (flag)
        {
            y.unsubscribe();
            return;
        }
        break MISSING_BLOCK_LABEL_55;
        y;
        this;
        JVM INSTR monitorexit ;
        throw y;
    }

    public final boolean isUnsubscribed()
    {
        return b;
    }

    public final void unsubscribe()
    {
        Object obj;
        obj = null;
        if (b)
        {
            break MISSING_BLOCK_LABEL_114;
        }
        this;
        JVM INSTR monitorenter ;
        if (!b)
        {
            break MISSING_BLOCK_LABEL_21;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Object obj1;
        b = true;
        obj1 = a;
        a = null;
        this;
        JVM INSTR monitorexit ;
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_114;
        }
        for (obj1 = ((Collection) (obj1)).iterator(); ((Iterator) (obj1)).hasNext();)
        {
            Y y = (Y)((Iterator) (obj1)).next();
            try
            {
                y.unsubscribe();
            }
            catch (Throwable throwable)
            {
                if (obj == null)
                {
                    obj = new ArrayList();
                }
                ((List) (obj)).add(throwable);
            }
        }

        break MISSING_BLOCK_LABEL_106;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        Exceptions.throwIfAny(((List) (obj)));
        return;
    }
}
