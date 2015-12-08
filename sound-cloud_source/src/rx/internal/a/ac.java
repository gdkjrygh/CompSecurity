// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.a;

import rx.X;

// Referenced classes of package rx.internal.a:
//            ad, af

public final class ac
    implements rx.b.g
{

    final int a;
    final int b;

    public ac(int i, int j)
    {
        if (i <= 0)
        {
            throw new IllegalArgumentException("count must be greater than 0");
        }
        if (j <= 0)
        {
            throw new IllegalArgumentException("skip must be greater than 0");
        } else
        {
            a = i;
            b = j;
            return;
        }
    }

    public final Object call(Object obj)
    {
        obj = (X)obj;
        if (a == b)
        {
            return new ad(this, ((X) (obj)), ((X) (obj)));
        } else
        {
            return new af(this, ((X) (obj)), ((X) (obj)));
        }
    }
}
