// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.a;

import java.util.concurrent.TimeUnit;
import rx.R;
import rx.X;

// Referenced classes of package rx.internal.a:
//            O

public final class N
    implements rx.b.f
{

    final long a;
    final TimeUnit b;
    final R c;

    public N(long l, TimeUnit timeunit, R r)
    {
        a = l;
        b = timeunit;
        c = r;
    }

    public final void call(Object obj)
    {
        obj = (X)obj;
        rx.R.a a1 = c.a();
        ((X) (obj)).add(a1);
        a1.a(new O(this, ((X) (obj))), a, b);
    }
}
