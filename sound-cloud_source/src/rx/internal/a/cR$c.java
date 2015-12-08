// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import rx.X;
import rx.b;
import rx.d.e;
import rx.internal.b.a;

// Referenced classes of package rx.internal.a:
//            cR, g, cS

private static final class nit> extends X
{

    final e a;
    final rx.h.e b = new rx.h.e();
    final Object c = new Object();
    final g d = rx.internal.a.g.a();
    final a e = new a();
    int f;
    boolean g;
    boolean h;
    List i;
    boolean j;
    it> k;

    final void a(List list)
    {
        if (list != null)
        {
            list = list.iterator();
            while (list.hasNext()) 
            {
                Object obj = list.next();
                if (rx.internal.a.g.b(obj))
                {
                    a.onCompleted();
                    return;
                }
                if (rx.internal.a.g.c(obj))
                {
                    a.onError(rx.internal.a.g.f(obj));
                    return;
                }
                a.onNext(obj);
                e.a();
            }
        }
    }

    public final void onCompleted()
    {
label0:
        {
            synchronized (c)
            {
                h = true;
                if (!g)
                {
                    break label0;
                }
            }
            return;
        }
        if (!j)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        if (i == null)
        {
            i = new ArrayList();
        }
        i.add(rx.internal.a.g.b());
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        List list;
        list = i;
        i = null;
        j = true;
        obj;
        JVM INSTR monitorexit ;
        a(list);
        a.onCompleted();
        unsubscribe();
        return;
    }

    public final void onError(Throwable throwable)
    {
        a.onError(throwable);
        unsubscribe();
    }

    public final void onNext(Object obj)
    {
        b b1 = (b)obj;
        synchronized (c)
        {
            int l = f + 1;
            f = l;
            g = true;
            k = new <init>(l, e, this);
        }
        b.a(k);
        b1.unsafeSubscribe(k);
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    (X x)
    {
        a = new e(x);
        x.add(b);
        x.setProducer(new cS(this));
    }
}
