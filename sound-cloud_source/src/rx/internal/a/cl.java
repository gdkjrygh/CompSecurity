// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.a;

import rx.X;
import rx.b.e;
import rx.b.g;

// Referenced classes of package rx.internal.a:
//            cm, cn

public final class cl
    implements rx.b.g
{

    private static final Object c = new Object();
    private final e a;
    private final g b;

    public cl(Object obj, g g)
    {
        this(((e) (new cm(obj))), g);
    }

    public cl(e e, g g)
    {
        a = e;
        b = g;
    }

    public cl(g g)
    {
        this(c, g);
    }

    static Object a()
    {
        return c;
    }

    static e a(cl cl1)
    {
        return cl1.a;
    }

    static g b(cl cl1)
    {
        return cl1.b;
    }

    public final Object call(Object obj)
    {
        obj = (X)obj;
        return new cn(this, ((X) (obj)), ((X) (obj)));
    }

}
