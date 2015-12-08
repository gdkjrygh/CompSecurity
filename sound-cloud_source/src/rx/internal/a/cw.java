// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.a;

import rx.X;

// Referenced classes of package rx.internal.a:
//            cx

public final class cw
    implements rx.b.g
{

    final int a;

    public cw(int i)
    {
        a = i;
    }

    public final Object call(Object obj)
    {
        obj = (X)obj;
        return new cx(this, ((X) (obj)), ((X) (obj)));
    }
}
