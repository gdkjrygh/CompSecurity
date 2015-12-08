// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.a;

import java.util.concurrent.atomic.AtomicLong;
import rx.X;
import rx.b.b;

// Referenced classes of package rx.internal.a:
//            bz, bA

public final class by
    implements rx.b.g
{
    private static final class a
    {

        public static final by a = new by((byte)0);

    }


    final b a;

    private by()
    {
        this(((b) (null)));
    }

    by(byte byte0)
    {
        this();
    }

    public by(b b)
    {
        a = b;
    }

    public final Object call(Object obj)
    {
        obj = (X)obj;
        AtomicLong atomiclong = new AtomicLong();
        ((X) (obj)).setProducer(new bz(this, atomiclong));
        return new bA(this, ((X) (obj)), ((X) (obj)), atomiclong);
    }
}
