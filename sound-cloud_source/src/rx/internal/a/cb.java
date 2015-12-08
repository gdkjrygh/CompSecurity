// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.a;

import rx.R;
import rx.b.e;

final class cb
    implements e
{

    final int a;
    final long b;
    final R c;

    cb(int i, long l, R r)
    {
        a = i;
        b = l;
        c = r;
        super();
    }

    public final Object call()
    {
        return new bT.f(a, b, c);
    }
}
