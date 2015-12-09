// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.a.c;


// Referenced classes of package com.android.slyce.a.c:
//            ba

final class bb
    implements Runnable
{

    final ba a;
    final Exception b;

    bb(ba ba1, Exception exception)
    {
        a = ba1;
        b = exception;
        super();
    }

    public void run()
    {
        ba.a(a, b);
    }
}
