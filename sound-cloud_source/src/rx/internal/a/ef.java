// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.a;

import java.util.concurrent.atomic.AtomicReference;
import rx.X;
import rx.b;
import rx.b.g;
import rx.d.e;

// Referenced classes of package rx.internal.a:
//            eg, eh

public final class ef
    implements rx.b.g
{

    static final Object c = new Object();
    final g a;
    final b b;

    public ef(b b1, g g)
    {
        b = b1;
        a = g;
    }

    public final Object call(Object obj)
    {
        Object obj1 = (X)obj;
        obj = new e(((X) (obj1)), false);
        ((X) (obj1)).add(((rx.Y) (obj)));
        Object obj2 = new AtomicReference(c);
        obj1 = new eg(this, ((X) (obj)), ((AtomicReference) (obj2)), ((e) (obj)));
        obj2 = new eh(this, ((AtomicReference) (obj2)), ((e) (obj)));
        ((e) (obj)).add(((rx.Y) (obj1)));
        ((e) (obj)).add(((rx.Y) (obj2)));
        b.unsafeSubscribe(((X) (obj2)));
        return obj1;
    }

}
