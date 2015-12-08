// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.g;

import java.util.ArrayList;
import java.util.List;
import rx.exceptions.Exceptions;
import rx.internal.a.g;

// Referenced classes of package rx.g:
//            m, n, d

public final class c extends m
{

    final n a;
    private final g b = g.a();

    private c(rx.b.f f, n n1)
    {
        super(f);
        a = n1;
    }

    public static c a()
    {
        n n1 = new n();
        n1.h = new d(n1);
        return new c(n1, n1);
    }

    public final Throwable getThrowable()
    {
        Object obj = a.c;
        if (g.c(obj))
        {
            return g.f(obj);
        } else
        {
            return null;
        }
    }

    public final Object getValue()
    {
        return null;
    }

    public final Object[] getValues()
    {
        return new Object[0];
    }

    public final Object[] getValues(Object aobj[])
    {
        if (aobj.length > 0)
        {
            aobj[0] = null;
        }
        return aobj;
    }

    public final boolean hasCompleted()
    {
        Object obj = a.c;
        return obj != null && !g.c(obj);
    }

    public final boolean hasObservers()
    {
        return a.a.b.length > 0;
    }

    public final boolean hasThrowable()
    {
        return g.c(a.c);
    }

    public final boolean hasValue()
    {
        return false;
    }

    public final void onCompleted()
    {
        if (a.e)
        {
            Object obj = g.b();
            n.b ab[] = a.a(obj);
            int j = ab.length;
            for (int i = 0; i < j; i++)
            {
                n.b b1 = ab[i];
                g g1 = a.i;
                b1.a(obj);
            }

        }
    }

    public final void onError(Throwable throwable)
    {
        if (a.e)
        {
            Object obj1 = g.a(throwable);
            n.b ab[] = a.a(obj1);
            int j = ab.length;
            int i = 0;
            throwable = null;
            do
            {
                if (i >= j)
                {
                    break;
                }
                n.b b1 = ab[i];
                try
                {
                    g g1 = a.i;
                    b1.a(obj1);
                }
                catch (Throwable throwable1)
                {
                    Object obj = throwable;
                    if (throwable == null)
                    {
                        obj = new ArrayList();
                    }
                    ((List) (obj)).add(throwable1);
                    throwable = ((Throwable) (obj));
                }
                i++;
            } while (true);
            Exceptions.throwIfAny(throwable);
        }
    }

    public final void onNext(Object obj)
    {
        n.b ab[] = a.a.b;
        int j = ab.length;
        for (int i = 0; i < j; i++)
        {
            ab[i].onNext(obj);
        }

    }
}
