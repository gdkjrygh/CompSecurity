// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.util;

import rx.X;

final class l
    implements rx.b.f
{

    final Object a;

    l(Object obj)
    {
        a = obj;
        super();
    }

    public final void call(Object obj)
    {
        obj = (X)obj;
        ((X) (obj)).onNext(a);
        ((X) (obj)).onCompleted();
    }
}
