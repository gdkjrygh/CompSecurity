// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.b;


// Referenced classes of package com.c.b:
//            am

final class an
    implements Runnable
{

    final Exception a;
    final am b;

    an(am am, Exception exception)
    {
        b = am;
        a = exception;
        super();
    }

    public final void run()
    {
        throw new RuntimeException(a);
    }
}
