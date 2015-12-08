// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.imagelib.filter;


// Referenced classes of package com.roidapp.imagelib.filter:
//            aj, av

final class ao
    implements Runnable
{

    final Throwable a;
    final String b;
    final aj c;

    ao(aj aj1, Throwable throwable, String s)
    {
        c = aj1;
        a = throwable;
        b = s;
        super();
    }

    public final void run()
    {
        if (aj.a(c) != null)
        {
            aj.a(c).a(a, b);
        }
    }
}
