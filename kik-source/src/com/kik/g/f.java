// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.g;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

// Referenced classes of package com.kik.g:
//            h, k, e, g, 
//            i, as

public final class f
{
    private static final class a
    {

        public final e a;
        public final i b;
        private final e.a c;

        static e.a a(a a1)
        {
            return a1.c;
        }

        public a(e e1, i i, e.a a1)
        {
            a = e1;
            b = i;
            c = a1;
        }
    }


    private final List a = new CopyOnWriteArrayList();

    public f()
    {
    }

    public final e a(e e1, k k1)
    {
        a(e1, ((i) (new h(this, k1))));
        return k1.a();
    }

    public final i a(e e1, i i)
    {
        e.a a1 = e1.a(i);
        a.add(new a(e1, i, a1));
        return i;
    }

    public final i a(e e1, i i, as as)
    {
        return a(e1, ((i) (new g(this, i, as))));
    }

    public final void a()
    {
        a a1;
        for (Iterator iterator = a.iterator(); iterator.hasNext(); a1.a.a(a.a(a1)))
        {
            a1 = (a)iterator.next();
        }

        a.clear();
    }

    public final void b(e e1, i i)
    {
        List list = a;
        list;
        JVM INSTR monitorenter ;
        int j = 0;
_L2:
        if (j < a.size())
        {
            a a1 = (a)a.get(j);
            if (a1.a != e1 || a1.b != i)
            {
                break MISSING_BLOCK_LABEL_87;
            }
            e1.a(a.a(a1));
            a.remove(j);
        }
        list;
        JVM INSTR monitorexit ;
        return;
        e1;
        list;
        JVM INSTR monitorexit ;
        throw e1;
        j++;
        if (true) goto _L2; else goto _L1
_L1:
    }
}
