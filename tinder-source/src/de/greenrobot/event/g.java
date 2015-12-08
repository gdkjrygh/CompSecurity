// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package de.greenrobot.event;

import java.util.ArrayList;
import java.util.List;

// Referenced classes of package de.greenrobot.event:
//            l

final class g
{

    private static final List d = new ArrayList();
    Object a;
    l b;
    g c;

    private g(Object obj, l l)
    {
        a = obj;
        b = l;
    }

    static g a(l l, Object obj)
    {
        List list = d;
        list;
        JVM INSTR monitorenter ;
        int i = d.size();
        if (i <= 0)
        {
            break MISSING_BLOCK_LABEL_56;
        }
        g g1;
        g1 = (g)d.remove(i - 1);
        g1.a = obj;
        g1.b = l;
        g1.c = null;
        list;
        JVM INSTR monitorexit ;
        return g1;
        list;
        JVM INSTR monitorexit ;
        return new g(obj, l);
        l;
        list;
        JVM INSTR monitorexit ;
        throw l;
    }

    static void a(g g1)
    {
        g1.a = null;
        g1.b = null;
        g1.c = null;
        synchronized (d)
        {
            if (d.size() < 10000)
            {
                d.add(g1);
            }
        }
        return;
        g1;
        list;
        JVM INSTR monitorexit ;
        throw g1;
    }

}
