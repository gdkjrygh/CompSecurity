// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx;

import java.util.concurrent.TimeUnit;
import rx.b.e;

// Referenced classes of package rx:
//            b, R

final class r
    implements e
{

    final long a;
    final TimeUnit b;
    final R c;
    final b d;

    r(b b1, long l, TimeUnit timeunit, R r1)
    {
        d = b1;
        a = l;
        b = timeunit;
        c = r1;
        super();
    }

    public final Object call()
    {
        return d.replay(a, b, c);
    }
}
