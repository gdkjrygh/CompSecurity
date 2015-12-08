// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import rx.P;
import rx.X;
import rx.b;
import rx.b.f;
import rx.b.g;
import rx.d.d;
import rx.g.c;

// Referenced classes of package rx.internal.a:
//            t

final class a extends X
{

    final onError a;

    public final void onCompleted()
    {
        ArrayList arraylist = null;
        synchronized (a.a)
        {
            a.a = true;
            if (a.a)
            {
                arraylist = new ArrayList(a.a.values());
                a.a.clear();
                a.a.clear();
            }
        }
        a.a(arraylist);
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void onError(Throwable throwable)
    {
        a.a(throwable);
    }

    public final void onNext(Object obj)
    {
        d d1;
        Object obj2;
        obj2 = c.a();
        d1 = new d(((P) (obj2)));
        int i;
        synchronized (a.a)
        {
              = a;
            i = .a;
            .a = i + 1;
            a.a.put(Integer.valueOf(i), d1);
        }
        obj1 = rx.b.create(new nit>(((b) (obj2)), a.a));
        obj2 = (b)a.a.c.call(obj);
         1 = new <init>(a, i);
        a.a.a(1);
        ((b) (obj2)).unsafeSubscribe(1);
        obj1 = a.a.e.call(obj, obj1);
        ArrayList arraylist;
        synchronized (a.a)
        {
            arraylist = new ArrayList(a.a.values());
        }
        try
        {
            a.a.onNext(obj1);
            for (obj = arraylist.iterator(); ((Iterator) (obj)).hasNext(); d1.onNext(((Iterator) (obj)).next())) { }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            onError(((Throwable) (obj)));
        }
        return;
        obj;
        obj1;
        JVM INSTR monitorexit ;
        throw obj;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    ( )
    {
        a = ;
        super();
    }
}
