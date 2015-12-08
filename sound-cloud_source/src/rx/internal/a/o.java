// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.a;

import java.util.concurrent.TimeUnit;
import rx.R;
import rx.X;
import rx.b;

// Referenced classes of package rx.internal.a:
//            p

public final class o
    implements rx.b.f
{

    final b a;
    final long b;
    final TimeUnit c;
    final R d;

    public o(b b1, long l, TimeUnit timeunit, R r)
    {
        a = b1;
        b = l;
        c = timeunit;
        d = r;
    }

    public final void call(Object obj)
    {
        obj = (X)obj;
        rx.R.a a1 = d.a();
        ((X) (obj)).add(a1);
        a1.a(new p(this, ((X) (obj))), b, c);
    }
}
