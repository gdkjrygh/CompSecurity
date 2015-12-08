// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.util;

import java.util.concurrent.TimeUnit;
import rx.X;
import rx.internal.c.a;

// Referenced classes of package rx.internal.util:
//            k

static final class b
    implements rx.ng.Object
{

    private final a a;
    private final Object b;

    public final void call(Object obj)
    {
        obj = (X)obj;
        a a1 = a;
        TimeUnit timeunit = new <init>(((X) (obj)), b, (byte)0);
        ((X) (obj)).add(a1.b.a().b(timeunit, -1L, TimeUnit.NANOSECONDS));
    }

    TimeUnit(a a1, Object obj)
    {
        a = a1;
        b = obj;
    }
}
