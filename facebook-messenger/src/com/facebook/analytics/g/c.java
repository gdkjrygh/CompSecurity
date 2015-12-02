// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.analytics.g;

import android.util.SparseArray;
import com.facebook.common.time.a;

// Referenced classes of package com.facebook.analytics.g:
//            a, d, b

class c
    implements Runnable
{

    final com.facebook.analytics.g.a a;

    private c(com.facebook.analytics.g.a a1)
    {
        a = a1;
        super();
    }

    c(com.facebook.analytics.g.a a1, b b)
    {
        this(a1);
    }

    public void run()
    {
        Object obj = com.facebook.analytics.g.a.a(a);
        obj;
        JVM INSTR monitorenter ;
        long l = com.facebook.analytics.g.a.b(a).a();
        int i = 0;
_L2:
        if (i < com.facebook.analytics.g.a.c(a).size())
        {
            int j = com.facebook.analytics.g.a.c(a).keyAt(i);
            if (com.facebook.analytics.g.a.c(a).get(j) != null && ((d)com.facebook.analytics.g.a.c(a).get(j)).b(l) <= 0.0D)
            {
                com.facebook.analytics.g.a.c(a).remove(j);
            }
            break MISSING_BLOCK_LABEL_116;
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        i++;
        if (true) goto _L2; else goto _L1
_L1:
    }
}
