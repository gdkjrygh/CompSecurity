// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.a;

import rx.Q;
import rx.b.a;

// Referenced classes of package rx.internal.a:
//            cP

final class cQ
    implements a
{

    final long a;
    final cP b;

    cQ(cP cp, long l)
    {
        b = cp;
        a = l;
        super();
    }

    public final void call()
    {
        b.a.a(a);
    }
}
