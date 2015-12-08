// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.b;

import com.nuance.b.b.a.f;
import com.nuance.b.b.a.g;
import com.nuance.b.b.a.w;
import com.nuance.b.b.a.x;
import com.nuance.b.b.a.y;
import com.nuance.b.b.a.z;
import com.nuance.b.c.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;

// Referenced classes of package com.nuance.b.b:
//            cd, dr, fr, bx, 
//            aq, by, ar, de, 
//            aw, df, ci

final class dd
    implements z
{

    final bx a;

    dd(bx bx1)
    {
        a = bx1;
        super();
    }

    private void d(b b1)
    {
        b1.a(new cd(this));
        b1.b(new dr(this));
    }

    public final void a(w w1)
    {
        com.nuance.b.b.fr.f((new StringBuilder("onInterpretation ")).append(w1.b).toString());
        if (a.a != null)
        {
            List list = w1.a.v;
            if (list != null && !list.isEmpty())
            {
                new ArrayList(list);
            }
            switch (by.c[w1.a.a.ordinal()])
            {
            default:
                w1.a.a.toString();
                break;

            case 1: // '\001'
            case 2: // '\002'
                break;
            }
        }
        List list1 = com.nuance.b.b.bx.f(a);
        list1;
        JVM INSTR monitorenter ;
        z z1;
        for (Iterator iterator = com.nuance.b.b.bx.f(a).iterator(); iterator.hasNext(); bx.d().execute(new de(this, z1, w1)))
        {
            z1 = (z)iterator.next();
        }

        break MISSING_BLOCK_LABEL_181;
        w1;
        list1;
        JVM INSTR monitorexit ;
        throw w1;
        list1;
        JVM INSTR monitorexit ;
    }

    public final void a(x x1)
    {
        com.nuance.b.b.fr.f((new StringBuilder("onInterpretationError ")).append(x1.a).append(" ").append(x1.b).toString());
        if (a.a == null) goto _L2; else goto _L1
_L1:
        by.d[x1.b.ordinal()];
        JVM INSTR tableswitch 1 10: default 108
    //                   1 183
    //                   2 113
    //                   3 113
    //                   4 113
    //                   5 191
    //                   6 199
    //                   7 207
    //                   8 215
    //                   9 223
    //                   10 113;
           goto _L3 _L4 _L5 _L5 _L5 _L6 _L7 _L8 _L9 _L10 _L5
_L5:
        break; /* Loop/switch isn't completed */
_L3:
        int i = com.nuance.b.b.aw.b;
_L2:
        List list = com.nuance.b.b.bx.f(a);
        list;
        JVM INSTR monitorenter ;
        z z1;
        for (Iterator iterator = com.nuance.b.b.bx.f(a).iterator(); iterator.hasNext(); bx.d().execute(new df(this, z1, x1)))
        {
            z1 = (z)iterator.next();
        }

        break; /* Loop/switch isn't completed */
        x1;
        list;
        JVM INSTR monitorexit ;
        throw x1;
_L4:
        i = com.nuance.b.b.aw.b;
        continue; /* Loop/switch isn't completed */
_L6:
        i = com.nuance.b.b.aw.b;
        continue; /* Loop/switch isn't completed */
_L7:
        i = aw.i;
        continue; /* Loop/switch isn't completed */
_L8:
        i = com.nuance.b.b.aw.b;
        continue; /* Loop/switch isn't completed */
_L9:
        i = com.nuance.b.b.aw.b;
        continue; /* Loop/switch isn't completed */
_L10:
        i = aw.j;
        if (true) goto _L2; else goto _L11
_L11:
        list;
        JVM INSTR monitorexit ;
        if (y.g == x1.b)
        {
            com.nuance.b.b.bx.b(a).onConnectionLost(new f(x1.a, g.b, null, x1.c));
        }
        return;
    }

    public final void a(b b1)
    {
        d(b1);
    }

    public final void b(b b1)
    {
        d(b1);
    }

    public final void c(b b1)
    {
        d(b1);
    }
}
