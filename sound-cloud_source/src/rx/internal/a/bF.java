// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.a;

import rx.X;
import rx.b;

// Referenced classes of package rx.internal.a:
//            bG

public final class bF
    implements rx.b.g
{

    final b a;

    public bF(b b)
    {
        a = b;
    }

    public final Object call(Object obj)
    {
        obj = (X)obj;
        bG bg = new bG(this, ((X) (obj)));
        ((X) (obj)).add(bg);
        return bg;
    }
}
