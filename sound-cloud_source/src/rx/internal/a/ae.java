// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.a;

import rx.Q;

// Referenced classes of package rx.internal.a:
//            ad, ac

final class ae
    implements Q
{

    final Q a;
    final ad b;
    private volatile boolean c;

    ae(ad ad1, Q q)
    {
        b = ad1;
        a = q;
        super();
        c = false;
    }

    public final void a(long l)
    {
        if (c)
        {
            return;
        }
        if (l >= 0x7fffffffffffffffL / (long)b.c.a)
        {
            c = true;
            a.a(0x7fffffffffffffffL);
            return;
        } else
        {
            a.a((long)b.c.a * l);
            return;
        }
    }
}
