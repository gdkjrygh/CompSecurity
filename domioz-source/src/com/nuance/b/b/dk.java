// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.b;

import com.nuance.b.b.a.aa;
import com.nuance.b.b.a.ab;
import com.nuance.b.b.a.ac;
import com.nuance.b.b.a.ad;
import com.nuance.b.b.a.f;
import com.nuance.b.b.a.g;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;

// Referenced classes of package com.nuance.b.b:
//            fr, bx, dm, dl, 
//            by, ci

final class dk
    implements ad
{

    final bx a;

    dk(bx bx1)
    {
        a = bx1;
        super();
    }

    public final void a(aa aa1)
    {
        com.nuance.b.b.fr.f((new StringBuilder("onPing")).append(aa1.a).toString());
        List list = com.nuance.b.b.bx.g(a);
        list;
        JVM INSTR monitorenter ;
        ad ad1;
        for (Iterator iterator = com.nuance.b.b.bx.g(a).iterator(); iterator.hasNext(); bx.d().execute(new dm(this, ad1, aa1)))
        {
            ad1 = (ad)iterator.next();
        }

        break MISSING_BLOCK_LABEL_92;
        aa1;
        list;
        JVM INSTR monitorexit ;
        throw aa1;
        list;
        JVM INSTR monitorexit ;
    }

    public final void a(ab ab1)
    {
        com.nuance.b.b.fr.f((new StringBuilder("onPingError")).append(ab1.a).append(" ").append(ab1.b).toString());
        List list = com.nuance.b.b.bx.g(a);
        list;
        JVM INSTR monitorenter ;
        ad ad1;
        for (Iterator iterator = com.nuance.b.b.bx.g(a).iterator(); iterator.hasNext(); bx.d().execute(new dl(this, ad1, ab1)))
        {
            ad1 = (ad)iterator.next();
        }

        break MISSING_BLOCK_LABEL_104;
        ab1;
        list;
        JVM INSTR monitorexit ;
        throw ab1;
        list;
        JVM INSTR monitorexit ;
        switch (by.e[ab1.b.ordinal()])
        {
        default:
            bx.b(a).onConnectionLost(new f(ab1.a, g.c, null, ab1.c));
            // fall through

        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            return;

        case 4: // '\004'
            bx.b(a).onConnectionLost(new f(ab1.a, g.b, null, ab1.c));
            return;

        case 5: // '\005'
            bx.b(a).onConnectionLost(new f(ab1.a, g.a, ab1.d, ab1.c));
            break;
        }
        return;
    }
}
