// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ijoysoft.a;


// Referenced classes of package com.ijoysoft.a:
//            a

final class k
    implements Runnable
{

    final a a;
    private final Runnable b;

    k(a a1, Runnable runnable)
    {
        a = a1;
        b = runnable;
        super();
    }

    public final void run()
    {
        com.ijoysoft.a.a.c(a);
        if (b != null)
        {
            b.run();
        }
    }
}
