// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx;

import rx.b.e;

// Referenced classes of package rx:
//            b

final class o
    implements e
{

    final int a;
    final b b;

    o(b b1, int i)
    {
        b = b1;
        a = i;
        super();
    }

    public final Object call()
    {
        return b.replay(a);
    }
}
