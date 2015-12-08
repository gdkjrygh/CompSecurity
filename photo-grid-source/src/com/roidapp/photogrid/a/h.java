// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.a;


// Referenced classes of package com.roidapp.photogrid.a:
//            g, k, l, n

final class h
    implements Runnable
{

    final l a;
    final n b;
    final g c;

    h(g g1, l l, n n)
    {
        c = g1;
        a = l;
        b = n;
        super();
    }

    public final void run()
    {
        c.d.a(a, b);
    }
}
