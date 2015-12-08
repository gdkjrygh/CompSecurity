// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.a;

import java.io.Serializable;
import rx.P;

// Referenced classes of package rx.internal.a:
//            h, i

public final class g
{
    private static class a
        implements Serializable
    {

        private final Throwable a;

        static Throwable a(a a1)
        {
            return a1.a;
        }

        public String toString()
        {
            return (new StringBuilder("Notification=>Error:")).append(a).toString();
        }

        public a(Throwable throwable)
        {
            a = throwable;
        }
    }


    private static final g a = new g();
    private static final Object b = new h();
    private static final Object c = new i();

    private g()
    {
    }

    public static Object a(Object obj)
    {
        Object obj1 = obj;
        if (obj == null)
        {
            obj1 = c;
        }
        return obj1;
    }

    public static Object a(Throwable throwable)
    {
        return new a(throwable);
    }

    public static g a()
    {
        return a;
    }

    public static boolean a(P p, Object obj)
    {
        if (obj == b)
        {
            p.onCompleted();
            return true;
        }
        if (obj == c)
        {
            p.onNext(null);
            return false;
        }
        if (obj != null)
        {
            if (obj.getClass() == rx/internal/a/g$a)
            {
                p.onError(a.a((a)obj));
                return true;
            } else
            {
                p.onNext(obj);
                return false;
            }
        } else
        {
            throw new IllegalArgumentException("The lite notification can not be null");
        }
    }

    public static Object b()
    {
        return b;
    }

    public static boolean b(Object obj)
    {
        return obj == b;
    }

    public static boolean c(Object obj)
    {
        return obj instanceof a;
    }

    public static boolean d(Object obj)
    {
        return obj != null && !(obj instanceof a) && !b(obj);
    }

    public static Object e(Object obj)
    {
        Object obj1 = obj;
        if (obj == c)
        {
            obj1 = null;
        }
        return obj1;
    }

    public static Throwable f(Object obj)
    {
        return a.a((a)obj);
    }

}
