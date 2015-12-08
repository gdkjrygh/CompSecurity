// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.a;

import rx.R;
import rx.X;

// Referenced classes of package rx.internal.a:
//            dC

public final class dB
    implements rx.b.g
{

    private final R a;

    public dB(R r)
    {
        a = r;
    }

    public final Object call(Object obj)
    {
        obj = (X)obj;
        return new dC(this, ((X) (obj)), ((X) (obj)));
    }
}
