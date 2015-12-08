// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.SystemClock;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            iq, it

private class <init>
    implements Runnable
{

    final iq Hu;

    public void run()
    {
        boolean flag;
        flag = false;
        iq.a(Hu, false);
        long l = SystemClock.elapsedRealtime();
        for (Iterator iterator = iq.a(Hu).iterator(); iterator.hasNext(); ((it)iterator.next()).e(l, 2102)) { }
        Object obj = it.Hz;
        obj;
        JVM INSTR monitorenter ;
        for (Iterator iterator1 = iq.a(Hu).iterator(); iterator1.hasNext();)
        {
            if (((it)iterator1.next()).fV())
            {
                flag = true;
            }
        }

        obj;
        JVM INSTR monitorexit ;
        iq.b(Hu, flag);
        return;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private (iq iq1)
    {
        Hu = iq1;
        super();
    }

    Hu(iq iq1, Hu hu)
    {
        this(iq1);
    }
}
