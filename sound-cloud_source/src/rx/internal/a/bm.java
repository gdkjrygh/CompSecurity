// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.a;

import rx.b;
import rx.b.f;

final class bm
    implements f
{

    final f a;

    bm(f f1)
    {
        a = f1;
        super();
    }

    public final Object call(Object obj)
    {
        return b.from((Iterable)a.call(obj));
    }
}
