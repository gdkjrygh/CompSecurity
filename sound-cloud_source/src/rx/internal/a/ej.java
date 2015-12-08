// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.a;

import java.util.Iterator;
import rx.X;
import rx.b.g;
import rx.d.a;
import rx.d.f;

// Referenced classes of package rx.internal.a:
//            ek

public final class ej
    implements rx.b.g
{

    final Iterable a;
    final g b;

    public ej(Iterable iterable, g g)
    {
        a = iterable;
        b = g;
    }

    private X a(X x)
    {
        Iterator iterator = a.iterator();
        X x1;
        if (iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_38;
        }
        x.onCompleted();
        x1 = f.a(rx.d.a.a());
        return x1;
        Throwable throwable;
        throwable;
        x.onError(throwable);
        return new ek(this, x, x, iterator);
    }

    public final Object call(Object obj)
    {
        return a((X)obj);
    }
}
