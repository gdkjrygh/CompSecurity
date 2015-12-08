// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.a;

import rx.X;
import rx.Y;
import rx.b.b;

// Referenced classes of package rx.internal.a:
//            bQ

final class bR
    implements b
{

    final X a;
    final bQ b;

    bR(bQ bq, X x)
    {
        b = bq;
        a = x;
        super();
    }

    public final void call(Object obj)
    {
        obj = (Y)obj;
        a.add(((Y) (obj)));
    }
}
