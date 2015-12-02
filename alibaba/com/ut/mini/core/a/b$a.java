// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ut.mini.core.a;

import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.ut.mini.core.a:
//            b, a

class <init>
    implements Runnable
{

    final b ht;

    public void run()
    {
        b.a(ht, false);
        Object obj = b.a(ht);
        obj;
        JVM INSTR monitorenter ;
        for (Iterator iterator = b.b(ht).iterator(); iterator.hasNext(); ((a)iterator.next()).onSwitchBackground()) { }
        break MISSING_BLOCK_LABEL_63;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        obj;
        JVM INSTR monitorexit ;
    }

    private (b b1)
    {
        ht = b1;
        super();
    }

    (b b1,  )
    {
        this(b1);
    }
}
