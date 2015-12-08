// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.b;

import com.nuance.b.b.a.f;
import com.nuance.b.b.a.g;
import com.nuance.b.b.a.s;
import com.nuance.b.b.a.t;
import com.nuance.b.b.a.u;
import com.nuance.b.b.a.v;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;

// Referenced classes of package com.nuance.b.b:
//            fr, bx, dq, dp, 
//            ci

final class do
    implements v
{

    final bx a;

    do(bx bx1)
    {
        a = bx1;
        super();
    }

    public final void a(s s1)
    {
        com.nuance.b.b.fr.f((new StringBuilder("onGenericServerMessage")).append(s1.a).toString());
        List list = bx.e(a);
        list;
        JVM INSTR monitorenter ;
        v v1;
        for (Iterator iterator = bx.e(a).iterator(); iterator.hasNext(); bx.d().execute(new dq(this, v1, s1)))
        {
            v1 = (v)iterator.next();
        }

        break MISSING_BLOCK_LABEL_92;
        s1;
        list;
        JVM INSTR monitorexit ;
        throw s1;
        list;
        JVM INSTR monitorexit ;
    }

    public final void a(t t1)
    {
        com.nuance.b.b.fr.f((new StringBuilder("onGenericServerMessageError")).append(t1.a).append(" ").append(t1.b).toString());
        List list = bx.e(a);
        list;
        JVM INSTR monitorenter ;
        v v1;
        for (Iterator iterator = bx.e(a).iterator(); iterator.hasNext(); bx.d().execute(new dp(this, v1, t1)))
        {
            v1 = (v)iterator.next();
        }

        break MISSING_BLOCK_LABEL_104;
        t1;
        list;
        JVM INSTR monitorexit ;
        throw t1;
        if (u.g == t1.b)
        {
            bx.b(a).onConnectionLost(new f(t1.a, g.b, null, t1.c));
        }
        list;
        JVM INSTR monitorexit ;
    }
}
