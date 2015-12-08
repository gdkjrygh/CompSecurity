// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.a;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import rx.R;
import rx.X;
import rx.b;
import rx.d.f;
import rx.f.i;
import rx.g.a;
import rx.h.e;

// Referenced classes of package rx.internal.a:
//            x, z, D, B, 
//            F, G

public final class w
    implements rx.b.f
{
    public static final class a
        implements rx.b.f
    {

        final long a;

        public final Object call(Object obj)
        {
            return ((b)obj).map(new G(this)).dematerialize();
        }

        public a(long l)
        {
            a = l;
        }
    }


    static final rx.b.f a = new x();
    private final b b;
    private final rx.b.f c;
    private final boolean d;
    private final boolean e;
    private final R f;

    private w(b b1, rx.b.f f1, boolean flag, boolean flag1, R r)
    {
        b = b1;
        c = f1;
        d = flag;
        e = flag1;
        f = r;
    }

    public static b a(b b1)
    {
        return a(b1, a);
    }

    public static b a(b b1, long l)
    {
        if (l < 0L)
        {
            throw new IllegalArgumentException("count >= 0 expected");
        }
        if (l == 0L)
        {
            return b1;
        } else
        {
            return a(b1, ((rx.b.f) (new a(l))));
        }
    }

    public static b a(b b1, long l, R r)
    {
        if (l == 0L)
        {
            return rx.b.empty();
        }
        if (l < 0L)
        {
            throw new IllegalArgumentException("count >= 0 expected");
        } else
        {
            return b(b1, new a(l - 1L), r);
        }
    }

    public static b a(b b1, R r)
    {
        return b(b1, a, r);
    }

    public static b a(b b1, rx.b.f f1)
    {
        return rx.b.create(new w(b1, f1, true, false, i.b()));
    }

    public static b a(b b1, rx.b.f f1, R r)
    {
        return rx.b.create(new w(b1, f1, true, false, r));
    }

    static b a(w w1)
    {
        return w1.b;
    }

    public static b b(b b1)
    {
        return a(b1, i.b());
    }

    public static b b(b b1, long l)
    {
        return a(b1, l, i.b());
    }

    public static b b(b b1, rx.b.f f1)
    {
        return rx.b.create(new w(b1, f1, false, true, i.b()));
    }

    public static b b(b b1, rx.b.f f1, R r)
    {
        return rx.b.create(new w(b1, f1, false, true, r));
    }

    static boolean b(w w1)
    {
        return w1.d;
    }

    static boolean c(w w1)
    {
        return w1.e;
    }

    public final void call(Object obj)
    {
        obj = (X)obj;
        AtomicBoolean atomicboolean = new AtomicBoolean(true);
        AtomicLong atomiclong = new AtomicLong(0L);
        rx.R.a a1 = f.a();
        ((X) (obj)).add(a1);
        Object obj1 = new e();
        ((X) (obj)).add(((rx.Y) (obj1)));
        rx.g.a a2 = rx.g.a.a();
        a2.subscribe(rx.d.f.a(rx.d.a.a()));
        rx.internal.b.a a3 = new rx.internal.b.a();
        obj1 = new z(this, ((X) (obj)), a2, a3, atomiclong, ((e) (obj1)));
        a1.a(new D(this, (b)c.call(a2.lift(new B(this))), ((X) (obj)), atomiclong, a1, ((rx.b.a) (obj1)), atomicboolean));
        ((X) (obj)).setProducer(new F(this, atomiclong, a3, atomicboolean, a1, ((rx.b.a) (obj1))));
    }

}
