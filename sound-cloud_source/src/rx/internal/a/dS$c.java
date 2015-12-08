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

// Referenced classes of package rx.internal.a:
//            dS, b

final class a extends X
{

    final X a;
    int b;
    final List c = new LinkedList();
    volatile boolean d;
    final dS e;

    public final void onCompleted()
    {
        Object obj = new ArrayList(c);
        c.clear();
        d = true;
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); ((hasNext)((Iterator) (obj)).next()).a.onCompleted()) { }
        a.onCompleted();
    }

    public final void onError(Throwable throwable)
    {
        Object obj = new ArrayList(c);
        c.clear();
        d = true;
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); ((hasNext)((Iterator) (obj)).next()).a.onError(throwable)) { }
        a.onError(throwable);
    }

    public final void onNext(Object obj)
    {
        int i = b;
        b = i + 1;
        if (i % e.b == 0 && !a.isUnsubscribed())
        {
            if (c.isEmpty())
            {
                d = false;
            }
            Object obj1 = rx.internal.a.b.a();
            obj1 = new <init>(((P) (obj1)), ((rx.b) (obj1)));
            c.add(obj1);
            a.onNext(((a) (obj1)).b);
        }
        Iterator iterator = c.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
              = (hasNext)iterator.next();
            .a.onNext(obj);
            int j = .c + 1;
            .c = j;
            if (j == e.a)
            {
                iterator.remove();
                .a.onCompleted();
            }
        } while (true);
        if (c.isEmpty())
        {
            d = true;
            if (a.isUnsubscribed())
            {
                unsubscribe();
            }
        }
    }

    public (dS ds, X x)
    {
        e = ds;
        super();
        d = true;
        a = x;
    }
}
