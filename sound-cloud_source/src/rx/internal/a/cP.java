// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.a;

import rx.Q;

// Referenced classes of package rx.internal.a:
//            cO, cN, cM, cQ

final class cP
    implements Q
{

    final Q a;
    final cO b;

    cP(cO co, Q q)
    {
        b = co;
        a = q;
        super();
    }

    public final void a(long l)
    {
        if (Thread.currentThread() == b.a)
        {
            a.a(l);
            return;
        } else
        {
            b.b.b.b.a(new cQ(this, l));
            return;
        }
    }
}
