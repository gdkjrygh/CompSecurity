// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.util;

import rx.R;
import rx.X;

// Referenced classes of package rx.internal.util:
//            k

static final class b
    implements rx.ng.Object
{

    private final R a;
    private final Object b;

    public final void call(Object obj)
    {
        obj = (X)obj;
        rx.ng.Object obj1 = a.a();
        ((X) (obj)).add(obj1);
        obj1.a(new <init>(((X) (obj)), b, (byte)0));
    }

    (R r, Object obj)
    {
        a = r;
        b = obj;
    }
}
