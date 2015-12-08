// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.a;

import rx.X;
import rx.b.f;
import rx.b.g;

// Referenced classes of package rx.internal.a:
//            bm, bn

public final class bl
    implements rx.b.g
{

    final f a;
    final g b;

    public bl(f f, g g)
    {
        a = f;
        b = g;
    }

    public static f a(f f)
    {
        return new bm(f);
    }

    public final Object call(Object obj)
    {
        obj = (X)obj;
        return new bn(this, ((X) (obj)), ((X) (obj)));
    }
}
