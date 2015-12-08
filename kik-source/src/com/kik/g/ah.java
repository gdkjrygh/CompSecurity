// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.g;


// Referenced classes of package com.kik.g:
//            af, p

final class ah
    implements Runnable
{

    final Throwable a;
    final af b;

    ah(af af1, Throwable throwable)
    {
        b = af1;
        a = throwable;
        super();
    }

    public final void run()
    {
        b.b.a(a);
    }
}
