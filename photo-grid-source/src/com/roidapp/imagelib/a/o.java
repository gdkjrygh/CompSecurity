// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.imagelib.a;


// Referenced classes of package com.roidapp.imagelib.a:
//            i, y

final class o
    implements Runnable
{

    final Throwable a;
    final String b;
    final i c;

    o(i j, Throwable throwable, String s)
    {
        c = j;
        a = throwable;
        b = s;
        super();
    }

    public final void run()
    {
        if (i.b(c) != null)
        {
            i.y(c);
            i.b(c).a(a, b);
        }
    }
}
