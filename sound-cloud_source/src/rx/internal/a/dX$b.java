// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import rx.P;
import rx.X;
import rx.d.e;
import rx.h.b;

// Referenced classes of package rx.internal.a:
//            dX

final class b extends X
{

    final X a;
    final b b;
    final Object c = new Object();
    final List d = new LinkedList();
    boolean e;
    final dX f;

    public final void onCompleted()
    {
label0:
        {
            synchronized (c)
            {
                if (!e)
                {
                    break label0;
                }
            }
            b.unsubscribe();
            return;
        }
        ArrayList arraylist;
        e = true;
        arraylist = new ArrayList(d);
        d.clear();
        obj;
        JVM INSTR monitorexit ;
        for (obj = arraylist.iterator(); ((Iterator) (obj)).hasNext(); ((hasNext)((Iterator) (obj)).next()).a.onCompleted()) { }
        break MISSING_BLOCK_LABEL_103;
        obj;
        b.unsubscribe();
        throw obj;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        a.onCompleted();
        b.unsubscribe();
        return;
    }

    public final void onError(Throwable throwable)
    {
label0:
        {
            synchronized (c)
            {
                if (!e)
                {
                    break label0;
                }
            }
            b.unsubscribe();
            return;
        }
        ArrayList arraylist;
        e = true;
        arraylist = new ArrayList(d);
        d.clear();
        obj;
        JVM INSTR monitorexit ;
        for (obj = arraylist.iterator(); ((Iterator) (obj)).hasNext(); ((hasNext)((Iterator) (obj)).next()).a.onError(throwable)) { }
        break MISSING_BLOCK_LABEL_104;
        throwable;
        b.unsubscribe();
        throw throwable;
        throwable;
        obj;
        JVM INSTR monitorexit ;
        throw throwable;
        a.onError(throwable);
        b.unsubscribe();
        return;
    }

    public final void onNext(Object obj)
    {
label0:
        {
            synchronized (c)
            {
                if (!e)
                {
                    break label0;
                }
            }
            return;
        }
        ArrayList arraylist = new ArrayList(d);
        obj1;
        JVM INSTR monitorexit ;
        for (obj1 = arraylist.iterator(); ((Iterator) (obj1)).hasNext(); ((hasNext)((Iterator) (obj1)).next()).a.onNext(obj)) { }
        break MISSING_BLOCK_LABEL_73;
        obj;
        obj1;
        JVM INSTR monitorexit ;
        throw obj;
    }

    public final void onStart()
    {
        request(0x7fffffffffffffffL);
    }

    public (dX dx, X x, b b1)
    {
        f = dx;
        super();
        a = new e(x);
        b = b1;
    }
}
