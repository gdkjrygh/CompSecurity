// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.baselib.b;


// Referenced classes of package com.roidapp.baselib.b:
//            m, p

final class o
    implements Runnable
{

    final String a;
    final Exception b;
    final m c;

    o(m m1, String s, Exception exception)
    {
        c = m1;
        a = s;
        b = exception;
        super();
    }

    public final void run()
    {
        m.b(c).a(a, b);
    }
}
