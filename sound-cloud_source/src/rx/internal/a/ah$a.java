// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.a;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import rx.X;
import rx.h.b;

// Referenced classes of package rx.internal.a:
//            ah

final class d extends X
{

    final X a;
    final List b = new LinkedList();
    boolean c;
    final b d = new b();
    final ah e;

    final void a(List list)
    {
        this;
        JVM INSTR monitorenter ;
        if (!c)
        {
            break MISSING_BLOCK_LABEL_12;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Iterator iterator;
        iterator = b.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_72;
            }
        } while ((List)iterator.next() != list);
        boolean flag = true;
        iterator.remove();
_L1:
        this;
        JVM INSTR monitorexit ;
        if (flag)
        {
            a.onNext(list);
            return;
        } else
        {
            return;
        }
        list;
        this;
        JVM INSTR monitorexit ;
        throw list;
        flag = false;
          goto _L1
    }

    public final void onCompleted()
    {
        this;
        JVM INSTR monitorenter ;
        if (!c)
        {
            break MISSING_BLOCK_LABEL_12;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Object obj;
        c = true;
        obj = new LinkedList(b);
        b.clear();
        this;
        JVM INSTR monitorexit ;
        try
        {
            List list;
            for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); a.onNext(list))
            {
                list = (List)((Iterator) (obj)).next();
            }

        }
        catch (Throwable throwable)
        {
            a.onError(throwable);
            return;
        }
        break MISSING_BLOCK_LABEL_92;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        a.onCompleted();
        unsubscribe();
        return;
    }

    public final void onError(Throwable throwable)
    {
        this;
        JVM INSTR monitorenter ;
        if (!c)
        {
            break MISSING_BLOCK_LABEL_12;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        c = true;
        b.clear();
        this;
        JVM INSTR monitorexit ;
        a.onError(throwable);
        unsubscribe();
        return;
        throwable;
        this;
        JVM INSTR monitorexit ;
        throw throwable;
    }

    public final void onNext(Object obj)
    {
        this;
        JVM INSTR monitorenter ;
        for (Iterator iterator = b.iterator(); iterator.hasNext(); ((List)iterator.next()).add(obj)) { }
        break MISSING_BLOCK_LABEL_45;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        this;
        JVM INSTR monitorexit ;
    }

    public (ah ah1, X x)
    {
        e = ah1;
        super();
        a = x;
        add(d);
    }
}
