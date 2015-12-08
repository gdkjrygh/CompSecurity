// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.miteksystems.misnap;


// Referenced classes of package com.miteksystems.misnap:
//            l, u, MiSnap, MiSnapAPI, 
//            MitekAnalyzer

final class o
    implements Runnable
{

    final l a;

    o(l l1)
    {
        a = l1;
        super();
    }

    public final void run()
    {
        l.a(a, true);
        if (l.a(a) == null || l.e(a) == null || l.f(a) == null || l.f(a).e() || l.c(a))
        {
            l.a(a, false);
            return;
        }
        byte abyte0[];
        if (l.g(a).a.b())
        {
            abyte0 = (byte[])l.h(a).clone();
        } else
        {
            abyte0 = l.h(a);
        }
        l.e(a).a(abyte0, a.b, a.c);
        l.i(a);
        l.a(a, false);
    }
}
