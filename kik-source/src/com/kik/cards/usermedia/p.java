// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cards.usermedia;

import com.kik.g.r;
import java.util.Map;

// Referenced classes of package com.kik.cards.usermedia:
//            o, q

final class p extends r
{

    final q a;
    final o b;

    p(o o1, q q)
    {
        b = o1;
        a = q;
        super();
    }

    public final void a()
    {
        synchronized (o.a(b))
        {
            o.a(b).remove(a);
        }
        return;
        exception;
        map;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
