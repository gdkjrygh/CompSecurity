// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.a;

import java.util.concurrent.atomic.AtomicBoolean;
import rx.Q;
import rx.X;

// Referenced classes of package rx.internal.a:
//            aT

public final class aS
    implements rx.b.g
{
    static final class a extends AtomicBoolean
        implements Q
    {

        final Q a;

        public final void a(long l)
        {
            if (l < 0L)
            {
                throw new IllegalArgumentException("n >= 0 required");
            }
            if (l > 0L && compareAndSet(false, true))
            {
                a.a(0x7fffffffffffffffL);
            }
        }

        public a(Q q)
        {
            a = q;
        }
    }


    final int a;
    final boolean b;
    final Object c;

    public aS(int i)
    {
        this(i, null, false);
    }

    public aS(int i, Object obj)
    {
        this(i, obj, true);
    }

    private aS(int i, Object obj, boolean flag)
    {
        if (i < 0)
        {
            throw new IndexOutOfBoundsException((new StringBuilder()).append(i).append(" is out of bounds").toString());
        } else
        {
            a = i;
            c = obj;
            b = flag;
            return;
        }
    }

    public final Object call(Object obj)
    {
        obj = (X)obj;
        aT at = new aT(this, ((X) (obj)));
        ((X) (obj)).add(at);
        return at;
    }
}
