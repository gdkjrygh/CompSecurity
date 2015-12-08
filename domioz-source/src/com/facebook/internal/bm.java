// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;


// Referenced classes of package com.facebook.internal:
//            bo, bl

final class bm
    implements Runnable
{

    final bo a;
    final bl b;

    bm(bl bl1, bo bo1)
    {
        b = bl1;
        a = bo1;
        super();
    }

    public final void run()
    {
        a.a().run();
        bl.a(b, a);
        return;
        Exception exception;
        exception;
        bl.a(b, a);
        throw exception;
    }
}
