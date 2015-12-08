// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.a;

import rx.X;

// Referenced classes of package rx.internal.a:
//            C, w

final class B
    implements rx.b.g
{

    final w a;

    B(w w)
    {
        a = w;
        super();
    }

    public final Object call(Object obj)
    {
        obj = (X)obj;
        return new C(this, ((X) (obj)), ((X) (obj)));
    }
}
