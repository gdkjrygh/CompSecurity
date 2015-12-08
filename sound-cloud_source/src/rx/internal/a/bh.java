// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.a;

import rx.X;
import rx.b.f;

// Referenced classes of package rx.internal.a:
//            bi

public final class bh
    implements rx.b.g
{

    final f a;

    public bh(f f)
    {
        a = f;
    }

    public final Object call(Object obj)
    {
        obj = (X)obj;
        return new bi(this, ((X) (obj)), ((X) (obj)));
    }
}
