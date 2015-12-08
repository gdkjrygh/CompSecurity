// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.a;

import rx.Q;

// Referenced classes of package rx.internal.a:
//            dh

final class di
    implements Q
{

    final dh.a a;
    final dh b;

    di(dh dh, dh.a a1)
    {
        b = dh;
        a = a1;
        super();
    }

    public final void a(long l)
    {
        a.request(l);
    }
}
