// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.a;

import rx.Q;
import rx.b.b;

// Referenced classes of package rx.internal.a:
//            aO

final class aP
    implements Q
{

    final aO.a a;
    final aO b;

    aP(aO ao, aO.a a1)
    {
        b = ao;
        a = a1;
        super();
    }

    public final void a(long l)
    {
        b.a.call(Long.valueOf(l));
        aO.a.a(a, l);
    }
}
