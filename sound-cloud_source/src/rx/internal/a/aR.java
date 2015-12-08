// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.a;

import rx.X;
import rx.b.a;
import rx.h.f;

public final class aR
    implements rx.b.g
{

    private final a a;

    public aR(a a1)
    {
        a = a1;
    }

    public final Object call(Object obj)
    {
        obj = (X)obj;
        ((X) (obj)).add(f.a(a));
        return rx.d.f.a(((X) (obj)));
    }
}
