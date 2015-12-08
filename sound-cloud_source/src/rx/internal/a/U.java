// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.a;

import rx.X;
import rx.b.f;
import rx.internal.b.c;

// Referenced classes of package rx.internal.a:
//            V

public final class U
    implements rx.b.g
{

    final f a;

    public U(f f)
    {
        a = f;
    }

    public final Object call(Object obj)
    {
        obj = (X)obj;
        c c1 = new c(((X) (obj)));
        V v = new V(this, c1, ((X) (obj)));
        ((X) (obj)).add(v);
        ((X) (obj)).setProducer(c1);
        return v;
    }
}
