// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx;

import rx.internal.b.c;

// Referenced classes of package rx:
//            X, V, T

final class U
    implements b.f
{

    final T.a a;
    final T b;

    U(T t, T.a a1)
    {
        b = t;
        a = a1;
        super();
    }

    public final void call(Object obj)
    {
        obj = (X)obj;
        Object obj1 = new c(((X) (obj)));
        ((X) (obj)).setProducer(((Q) (obj1)));
        obj1 = new V(this, ((c) (obj1)), ((X) (obj)));
        ((X) (obj)).add(((Y) (obj1)));
        a.call(obj1);
    }
}
