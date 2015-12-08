// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.util;

import java.util.concurrent.TimeUnit;
import rx.R;
import rx.X;
import rx.b;
import rx.b.f;
import rx.internal.c.a;

// Referenced classes of package rx.internal.util:
//            l, m

public final class k extends rx.b
{
    static final class a
        implements rx.b.f
    {

        private final rx.internal.c.a a;
        private final Object b;

        public final void call(Object obj)
        {
            obj = (X)obj;
            rx.internal.c.a a1 = a;
            c c1 = new c(((X) (obj)), b, (byte)0);
            ((X) (obj)).add(a1.b.a().b(c1, -1L, TimeUnit.NANOSECONDS));
        }

        a(rx.internal.c.a a1, Object obj)
        {
            a = a1;
            b = obj;
        }
    }

    static final class b
        implements rx.b.f
    {

        private final R a;
        private final Object b;

        public final void call(Object obj)
        {
            obj = (X)obj;
            rx.R.a a1 = a.a();
            ((X) (obj)).add(a1);
            a1.a(new c(((X) (obj)), b, (byte)0));
        }

        b(R r, Object obj)
        {
            a = r;
            b = obj;
        }
    }

    static final class c
        implements rx.b.a
    {

        private final X a;
        private final Object b;

        public final void call()
        {
            try
            {
                a.onNext(b);
            }
            catch (Throwable throwable)
            {
                a.onError(throwable);
                return;
            }
            a.onCompleted();
        }

        private c(X x, Object obj)
        {
            a = x;
            b = obj;
        }

        c(X x, Object obj, byte byte0)
        {
            this(x, obj);
        }
    }


    public final Object a;

    private k(Object obj)
    {
        super(new l(obj));
        a = obj;
    }

    static Object a(k k1)
    {
        return k1.a;
    }

    public static final k a(Object obj)
    {
        return new k(obj);
    }

    public final rx.b a(R r)
    {
        if (r instanceof rx.internal.c.a)
        {
            return create(new a((rx.internal.c.a)r, a));
        } else
        {
            return create(new b(r, a));
        }
    }

    public final rx.b a(f f)
    {
        return create(new m(this, f));
    }
}
