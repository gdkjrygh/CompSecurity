// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.a;

import java.util.concurrent.atomic.AtomicBoolean;
import rx.Q;

// Referenced classes of package rx.internal.a:
//            cu

final class cv
    implements Q
{

    final cu.b a;
    final cu b;
    private final AtomicBoolean c = new AtomicBoolean(false);

    cv(cu cu, cu.b b1)
    {
        b = cu;
        a = b1;
        super();
    }

    public final void a(long l)
    {
        if (l > 0L && c.compareAndSet(false, true))
        {
            a.request(2L);
        }
    }
}
