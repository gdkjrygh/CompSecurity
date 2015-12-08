// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.a;

import java.util.concurrent.atomic.AtomicReference;
import rx.X;
import rx.b;
import rx.d.e;

// Referenced classes of package rx.internal.a:
//            ci, cj

public final class ch
    implements rx.b.g
{

    static final Object b = new Object();
    final b a;

    public ch(b b1)
    {
        a = b1;
    }

    public final Object call(Object obj)
    {
        Object obj1 = (X)obj;
        e e1 = new e(((X) (obj1)));
        AtomicReference atomicreference = new AtomicReference(b);
        obj = new ci(this, ((X) (obj1)), atomicreference, e1);
        obj1 = new cj(this, ((X) (obj1)), atomicreference, e1);
        a.unsafeSubscribe(((X) (obj)));
        return obj1;
    }

}
