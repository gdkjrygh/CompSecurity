// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bolts;

import java.util.concurrent.Executor;

// Referenced classes of package bolts:
//            i, j, q

final class m
    implements i
{

    final q a;
    final i b;
    final Executor c;
    final j d;

    m(j j1, q q, i k, Executor executor)
    {
        d = j1;
        a = q;
        b = k;
        c = executor;
        super();
    }

    public final Object then(j j1)
    {
        j.a(a, b, j1, c);
        return null;
    }
}
