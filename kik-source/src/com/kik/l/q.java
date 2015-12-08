// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.l;

import com.kik.g.p;

// Referenced classes of package com.kik.l:
//            p

final class q
    implements Runnable
{

    final p a;
    final com.kik.l.p b;

    q(com.kik.l.p p1, p p2)
    {
        b = p1;
        a = p2;
        super();
    }

    public final void run()
    {
        p.a(b).run();
        a.a(null);
    }
}
