// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.g;

import rx.X;

// Referenced classes of package rx.g:
//            m

final class l
    implements rx.b.f
{

    final m a;

    l(m m1)
    {
        a = m1;
        super();
    }

    public final void call(Object obj)
    {
        obj = (X)obj;
        a.unsafeSubscribe(((X) (obj)));
    }
}
