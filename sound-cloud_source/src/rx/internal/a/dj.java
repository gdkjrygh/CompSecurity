// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.a;

import rx.X;
import rx.b.f;
import rx.b.g;

// Referenced classes of package rx.internal.a:
//            dk, dl

public final class dj
    implements rx.b.g
{

    final g a;

    public dj(f f)
    {
        this(((g) (new dk(f))));
    }

    private dj(g g)
    {
        a = g;
    }

    public final Object call(Object obj)
    {
        obj = (X)obj;
        dl dl1 = new dl(this, ((X) (obj)), ((X) (obj)));
        ((X) (obj)).add(dl1);
        return dl1;
    }
}
