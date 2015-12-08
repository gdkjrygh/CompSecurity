// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.g;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import rx.exceptions.Exceptions;
import rx.internal.a.g;

// Referenced classes of package rx.g:
//            m, n, b

public final class a extends m
{

    private final n a;
    private final g b = g.a();

    private a(rx.b.f f, n n1)
    {
        super(f);
        a = n1;
    }

    public static a a()
    {
        return a(null, false);
    }

    public static a a(Object obj)
    {
        return a(obj, true);
    }

    private static a a(Object obj, boolean flag)
    {
        n n1 = new n();
        if (flag)
        {
            g.a();
            n1.c = g.a(obj);
        }
        n1.g = new b(n1);
        n1.h = n1.g;
        return new a(n1, n1);
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
        Object obj = a.c;
        if (g.d(obj))
        {
            return g.e(obj);
        } else
        {
            return null;
        }
    }

    public final Object[] getValues(Object aobj[])
    {
        Object obj = a.c;
        if (g.d(obj))
        {
            if (aobj.length == 0)
            {
                aobj = (Object[])(Object[])Array.newInstance(((Object) (aobj)).getClass().getComponentType(), 1);
            }
            aobj[0] = g.e(obj);
            if (aobj.length > 1)
            {
                aobj[1] = null;
            }
            return aobj;
        }
        if (aobj.length > 0)
        {
            aobj[0] = null;
        }
        return aobj;
    }

    public final boolean hasCompleted()
    {
        return g.b(a.c);
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
        return g.d(a.c);
    }

    public final void onCompleted()
    {
        if (a.c == null || a.e)
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
        if (a.c == null || a.e)
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
        if (a.c == null || a.e)
        {
            obj = g.a(obj);
            n n1 = a;
            n1.c = obj;
            n.b ab[] = n1.a.b;
            int j = ab.length;
            for (int i = 0; i < j; i++)
            {
                n.b b1 = ab[i];
                g g1 = a.i;
                b1.a(obj);
            }

        }
    }
}
