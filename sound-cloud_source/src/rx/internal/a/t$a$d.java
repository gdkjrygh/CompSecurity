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
        int i;
        synchronized (a.a)
        {
              = a;
            i = .a;
            .a = i + 1;
            a.a.put(Integer.valueOf(i), obj);
        }
        obj1 = (b)a.a.d.call(obj);
         1 = new <init>(a, i);
        a.a.a(1);
        ((b) (obj1)).unsafeSubscribe(1);
        ArrayList arraylist;
        synchronized (a.a)
        {
            arraylist = new ArrayList(a.a.values());
        }
        try
        {
            for (obj1 = arraylist.iterator(); ((Iterator) (obj1)).hasNext(); ((P)((Iterator) (obj1)).next()).onNext(obj)) { }
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
        obj;
        obj1;
        JVM INSTR monitorexit ;
        throw obj;
    }

    ( )
    {
        a = ;
        super();
    }
}
