// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.b;

import com.nuance.b.b.a.b;
import com.nuance.b.b.a.c;
import com.nuance.b.b.a.d;
import com.nuance.b.b.a.e;
import com.nuance.b.b.a.f;
import com.nuance.b.b.a.g;
import com.nuance.b.b.a.h;
import com.nuance.b.b.a.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;

// Referenced classes of package com.nuance.b.b:
//            fr, bx, aq, ck, 
//            by, av, cl, cj, 
//            cm, cn

final class ci
    implements e
{

    final bx a;

    ci(bx bx1)
    {
        a = bx1;
        super();
    }

    public final void onConnect(b b1)
    {
        com.nuance.b.b.fr.f((new StringBuilder("onConnect ")).append(b1.a).toString());
        if (a.a != null && b1.b != null)
        {
            List list = b1.b.v;
            if (list != null && !list.isEmpty())
            {
                new ArrayList(list);
            }
        }
        List list1 = bx.a(a);
        list1;
        JVM INSTR monitorenter ;
        e e1;
        for (Iterator iterator = bx.a(a).iterator(); iterator.hasNext(); com.nuance.b.b.bx.d().execute(new ck(this, e1, b1)))
        {
            e1 = (e)iterator.next();
        }

        break MISSING_BLOCK_LABEL_139;
        b1;
        list1;
        JVM INSTR monitorexit ;
        throw b1;
        list1;
        JVM INSTR monitorexit ;
    }

    public final void onConnectError(c c1)
    {
        com.nuance.b.b.fr.f((new StringBuilder("onConnectError")).append(c1.a).append(" ").append(c1.b).toString());
        if (a.a == null) goto _L2; else goto _L1
_L1:
        by.a[c1.b.ordinal()];
        JVM INSTR tableswitch 1 8: default 100
    //                   1 175
    //                   2 183
    //                   3 191
    //                   4 105
    //                   5 105
    //                   6 105
    //                   7 199
    //                   8 207;
           goto _L3 _L4 _L5 _L6 _L7 _L7 _L7 _L8 _L9
_L7:
        break; /* Loop/switch isn't completed */
_L3:
        int j = com.nuance.b.b.av.b;
_L2:
        List list = bx.a(a);
        list;
        JVM INSTR monitorenter ;
        e e1;
        for (Iterator iterator = bx.a(a).iterator(); iterator.hasNext(); com.nuance.b.b.bx.d().execute(new cl(this, e1, c1)))
        {
            e1 = (e)iterator.next();
        }

        break; /* Loop/switch isn't completed */
        c1;
        list;
        JVM INSTR monitorexit ;
        throw c1;
_L4:
        j = com.nuance.b.b.av.b;
        continue; /* Loop/switch isn't completed */
_L5:
        j = com.nuance.b.b.av.c;
        continue; /* Loop/switch isn't completed */
_L6:
        j = com.nuance.b.b.av.b;
        continue; /* Loop/switch isn't completed */
_L8:
        j = av.a;
        continue; /* Loop/switch isn't completed */
_L9:
        j = com.nuance.b.b.av.b;
        if (true) goto _L2; else goto _L10
_L10:
        list;
        JVM INSTR monitorexit ;
    }

    public final void onConnectionLost(f f1)
    {
        List list;
        com.nuance.b.b.fr.f((new StringBuilder("onConnectionLost")).append(f1.a).append(" ").append(f1.b).toString());
        Iterator iterator;
        e e1;
        int j;
        if (a.a != null)
        {
            if (g.b == f1.b)
            {
                j = com.nuance.b.b.av.d;
            } else
            {
                j = av.a;
            }
        }
        list = bx.a(a);
        list;
        JVM INSTR monitorenter ;
        for (iterator = bx.a(a).iterator(); iterator.hasNext(); com.nuance.b.b.bx.d().execute(new cj(this, e1, f1)))
        {
            e1 = (e)iterator.next();
        }

        break MISSING_BLOCK_LABEL_137;
        f1;
        list;
        JVM INSTR monitorexit ;
        throw f1;
        list;
        JVM INSTR monitorexit ;
    }

    public final void onDisconnect(h h1)
    {
        com.nuance.b.b.fr.f((new StringBuilder("onDisconnect ")).append(h1.a).toString());
        at at = a.a;
        List list = bx.a(a);
        list;
        JVM INSTR monitorenter ;
        e e1;
        for (Iterator iterator = bx.a(a).iterator(); iterator.hasNext(); com.nuance.b.b.bx.d().execute(new cm(this, e1, h1)))
        {
            e1 = (e)iterator.next();
        }

        break MISSING_BLOCK_LABEL_100;
        h1;
        list;
        JVM INSTR monitorexit ;
        throw h1;
        list;
        JVM INSTR monitorexit ;
    }

    public final void onDisconnectError(i j)
    {
        com.nuance.b.b.fr.f((new StringBuilder("onDisconnectError ")).append(j.a).append(" ").append(j.b).toString());
        List list = bx.a(a);
        list;
        JVM INSTR monitorenter ;
        e e1;
        for (Iterator iterator = bx.a(a).iterator(); iterator.hasNext(); com.nuance.b.b.bx.d().execute(new cn(this, e1, j)))
        {
            e1 = (e)iterator.next();
        }

        break MISSING_BLOCK_LABEL_104;
        j;
        list;
        JVM INSTR monitorexit ;
        throw j;
        list;
        JVM INSTR monitorexit ;
    }
}
