// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.a;

import rx.Q;

// Referenced classes of package rx.internal.a:
//            dS

final class dU
    implements Q
{

    final dS.b a;

    dU(dS.b b)
    {
        a = b;
        super();
    }

    public final void a(long l)
    {
        if (l > 0L)
        {
            long l2 = (long)a.e.a * l;
            long l1 = l2;
            if (l2 >>> 31 != 0L)
            {
                l1 = l2;
                if (l2 / l != (long)a.e.a)
                {
                    l1 = 0x7fffffffffffffffL;
                }
            }
            a.request(l1);
        }
    }
}
