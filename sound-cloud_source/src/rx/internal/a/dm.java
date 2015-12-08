// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.a;

import java.util.concurrent.TimeUnit;
import rx.R;
import rx.X;

// Referenced classes of package rx.internal.a:
//            dn

public final class dm
    implements rx.b.g
{

    final long a;
    private final R b;

    public dm(long l, TimeUnit timeunit, R r)
    {
        a = timeunit.toMillis(l);
        b = r;
    }

    public final Object call(Object obj)
    {
        obj = (X)obj;
        return new dn(this, ((X) (obj)), ((X) (obj)));
    }
}
