// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.a;

import rx.X;
import rx.b.e;
import rx.b.f;
import rx.c.b;
import rx.exceptions.Exceptions;

// Referenced classes of package rx.internal.a:
//            bW

final class bV
    implements rx.b.f
{

    final e a;
    final f b;

    bV(e e1, f f1)
    {
        a = e1;
        b = f1;
        super();
    }

    public final void call(Object obj)
    {
        obj = (X)obj;
        b b1;
        rx.b b2;
        try
        {
            b1 = (b)a.call();
            b2 = (rx.b)b.call(b1);
        }
        catch (Throwable throwable)
        {
            Exceptions.throwIfFatal(throwable);
            ((X) (obj)).onError(throwable);
            return;
        }
        b2.subscribe(((X) (obj)));
        b1.a(new bW(this, ((X) (obj))));
    }
}
