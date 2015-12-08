// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.a;

import java.util.concurrent.TimeUnit;

// Referenced classes of package rx.internal.a:
//            ds

final class dr
    implements dv.a
{

    final long a;
    final TimeUnit b;

    dr(long l, TimeUnit timeunit)
    {
        a = l;
        b = timeunit;
        super();
    }

    public final Object call(Object obj, Object obj1, Object obj2)
    {
        obj = (dv.c)obj;
        obj1 = (Long)obj1;
        return ((rx.R.a)obj2).a(new ds(this, ((dv.c) (obj)), ((Long) (obj1))), a, b);
    }
}
