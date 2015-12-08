// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.baselib.c;


// Referenced classes of package com.roidapp.baselib.c:
//            j

final class k
    implements Runnable
{

    final Runnable a;
    final j b;

    k(j j1, Runnable runnable)
    {
        b = j1;
        a = runnable;
        super();
    }

    public final void run()
    {
        a.run();
        b.a();
        return;
        Exception exception;
        exception;
        b.a();
        throw exception;
    }
}
