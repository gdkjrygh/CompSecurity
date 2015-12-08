// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.util.concurrent;


// Referenced classes of package com.google.common.util.concurrent:
//            m, t

final class o
    implements Runnable
{

    final int a;
    final t b;
    final m c;

    o(m m1, int i, t t)
    {
        c = m1;
        a = i;
        b = t;
        super();
    }

    public final void run()
    {
        m.a(c, a, b);
    }
}
