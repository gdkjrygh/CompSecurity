// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.a;

import rx.Q;

// Referenced classes of package rx.internal.a:
//            a, bp

final class bq
    implements Q
{

    final bp.b a;
    final bp b;

    bq(bp bp, bp.b b1)
    {
        b = bp;
        a = b1;
        super();
    }

    public final void a(long l)
    {
        if (l > 0L)
        {
            bp.b b1 = a;
            rx.internal.a.a.a(bp.b.a, b1, l);
            b1.request(l);
            b1.a();
        }
    }
}
